package org.palladiosimulator.uncertainty.impact.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.persistence.EMFPersistenceHelper;

/**
 * Model  is the super class for all models that shall be "loadable" from
 * a file. Provides methods to load specified models.
 * 
 * @author Niko
 *
 */
public abstract class Model {

	/**
	 * Implementing classes need to call getModel() with this resourceList and the type (=clazz) they expect.
	 * @param resourceList
	 * @throws LoadModelFailedException
	 */
	protected abstract void assignValues(List<Resource> resourceList) throws LoadModelFailedException;

	/**
	 * Extracts a specific object (which is instance of given type (=clazz) from list of resources
	 * @param <T>
	 * @param resources
	 * @param clazz
	 * @return
	 * @throws LoadModelFailedException
	 */
	protected <T extends EObject> T getModel(final List<Resource> resources, final Class<T> clazz)
			throws LoadModelFailedException {
		
		//Filter resources for object of required type
		final var object = resources.stream().filter(e -> clazz.isInstance(e.getContents().get(0))).findAny();
		if (object.isEmpty()) {
			throw new LoadModelFailedException("Class not found " + clazz);
		}
		
		//Cast to expected type
		return clazz.cast(object.get().getContents().get(0));
	}

	/**
	 * Load models from the specified model paths
	 * @param modelPaths
	 * @throws LoadModelFailedException
	 */
	protected void loadModels(List<String> modelPaths) throws LoadModelFailedException {
		final List<Resource> listResources = new ArrayList<>();
		final ResourceSet resourceSet = new ResourceSetImpl();

		for (final String modelPath : modelPaths) {
			//Need to prepend plugin-relative prefix
			Resource ressource = EMFPersistenceHelper.loadEmfResourceFromFile(modelPath, null, resourceSet);
			listResources.add(ressource);
		}

		/*
		 * Resolve all visits all possible proxies in all resources and tries to resolve
		 * them
		 */
		EcoreUtil.resolveAll(resourceSet);
		this.assignValues(listResources);

	}
}
