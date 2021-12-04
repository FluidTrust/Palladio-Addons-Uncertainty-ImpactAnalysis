package org.palladiosimulator.uncertainty.impact.persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.system.SystemPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.SaveModelFailedException;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

public class EMFPersistenceHelper {

	private EMFPersistenceHelper() {

	}

	/**
	 * Load resource from file.
	 * 
	 * @param folderPath
	 * @param filePath
	 * @param resourceSet
	 * @return
	 * @throws LoadModelFailedException
	 */
	public static Resource loadEmfResourceFromFile(String folderPath, String filePath, ResourceSet resourceSet)
			throws LoadModelFailedException {
		registerEPackages(resourceSet);
		URI loadURI = URI.createPlatformResourceURI(folderPath, true);
		if (filePath != null)
			loadURI = loadURI.appendSegment(filePath);
		try {
			Resource resource = resourceSet.createResource(loadURI);
			((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
			Map<Object, Object> loadOptions = setupLoadOptions(resource);
			resource.load(loadOptions);
			return resource;

		} catch (IOException e) {
			throw new LoadModelFailedException("Load resource with path '" + loadURI.path() + "' failed.");
		}
	}

	/**
	 * Load model with specified class from file.
	 * 
	 * @param <T>
	 * @param folderPath
	 * @param filePath
	 * @param resourceSet
	 * @param classObject
	 * @return
	 * @throws LoadModelFailedException
	 */
	public static <T extends EObject> T loadEmfModelFromFile(String folderPath, String filePath,
			ResourceSet resourceSet, final Class<T> classObject) throws LoadModelFailedException {

		Resource resource = loadEmfResourceFromFile(folderPath, filePath, resourceSet);
		final EObject object = resource.getContents().get(0);
		if (object == null) {
			throw new LoadModelFailedException("Class not found " + classObject);
		}
		return classObject.cast(object);
	}

	public static void saveEmfModelToFile(EObject model, String directoryPath, String fileName, ResourceSet resourceSet)
			throws SaveModelFailedException {
		if (directoryPath != null) {
			URI saveURI = URI.createPlatformResourceURI(directoryPath, true);
			if (fileName != null) {
				saveURI = saveURI.appendSegment(fileName);
			} else if (model.eResource() != null) {
				String segment = model.eResource().getURI().lastSegment();
				saveURI = saveURI.appendSegment(segment);
			}
			Resource resource = resourceSet.createResource(saveURI);
			Map<Object, Object> saveOptions = setupLoadOptions(resource);
			resource.getContents().add(model);
			try {
				resource.save(saveOptions);
			} catch (IOException e) {
				throw new SaveModelFailedException(e.getMessage());
			}
		}
	}

	/**
	 * Save model to provided URI. URI has to be a platform resource URI
	 * (URI.createPlatformResourceURI(path, false))
	 * 
	 * @param model
	 * @param uri
	 * @throws SaveModelFailedException
	 */
	public static void saveEmfModelToURI(EObject model, URI uri) throws SaveModelFailedException {
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(uri);
		Map<Object, Object> saveOptions = setupLoadOptions(resource);
		resource.getContents().add(model);
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new SaveModelFailedException(e.getMessage());
		}

	}

	/**
	 * Returns the first file with the specified extension in the folder or in
	 * subfolders.
	 * 
	 * @throws SaveModelFailedException
	 */
	public static IFile retrieveFileWithExtension(IContainer folder, String fileExtension)
			throws SaveModelFailedException {

		try {
			for (IResource resource : folder.members()) {
				IFile file = retrieveFileWithExtensionRecursively(resource, fileExtension);
				if (file != null) {
					return file;
				}
			}
		} catch (CoreException e) {
			throw new SaveModelFailedException(e.getMessage());
		}

		return null;
	}

	private static IFile retrieveFileWithExtensionRecursively(IResource resource, String fileExtension)
			throws SaveModelFailedException {

		if (resource instanceof IContainer) {
			IContainer container = (IContainer) resource;
			try {
				for (IResource innerResource : container.members()) {
					IFile file = retrieveFileWithExtensionRecursively(innerResource, fileExtension);
					if (file != null) {
						return file;
					}
				}
			} catch (CoreException e) {
				throw new SaveModelFailedException(e.getMessage());
			}
		} else if (resource instanceof IFile) {
			if (resource.getFileExtension().equals(fileExtension)) {
				return (IFile) resource;
			}
		}

		return null;

	}

	private static Map<Object, Object> setupLoadOptions(Resource resource) {
		Map<Object, Object> loadOptions = ((XMLResourceImpl) resource).getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());
		return loadOptions;
	}

	private static void registerEPackages(ResourceSet resourceSet) {
		// Register PCM related packages
		resourceSet.getPackageRegistry().put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(AllocationPackage.eNS_URI, AllocationPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ResourceenvironmentPackage.eNS_URI, ResourceenvironmentPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UsagemodelPackage.eNS_URI, UsagemodelPackage.eINSTANCE);

		// Register Uncertainty related packages
		resourceSet.getPackageRegistry().put(UncertaintyPackage.eNS_URI, UncertaintyPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(AddPackage.eNS_URI, AddPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(PalladioElementTypePackage.eNS_URI, PalladioElementTypePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UncertaintyTypePackage.eNS_URI, UncertaintyTypePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UncertaintyTemplatePackage.eNS_URI, UncertaintyTemplatePackage.eINSTANCE);

		// Register uncertainty propagation related packages
		resourceSet.getPackageRegistry().put(UncertaintypropagationPackage.eNS_URI,
				UncertaintypropagationPackage.eINSTANCE);

	}

}
