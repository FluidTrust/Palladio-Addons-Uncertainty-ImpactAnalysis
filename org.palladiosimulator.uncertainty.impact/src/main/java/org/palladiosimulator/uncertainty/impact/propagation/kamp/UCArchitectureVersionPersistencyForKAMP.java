package org.palladiosimulator.uncertainty.impact.propagation.kamp;

import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_ALLOCATION;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_REPOSITORY;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_RESOURCE_ENV;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_SYSTEM;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_UNCERTAINTY_PROPAGATION;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_USAGEM_MODEL;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.SaveModelFailedException;
import org.palladiosimulator.uncertainty.impact.persistence.EMFPersistenceHelper;
import org.palladiosimulator.uncertainty.impact.persistence.SaveUncertaintyPropagationModelHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;

/**
 * This class acts as extension point for the KAMP Framework. It enables the
 * execution of the Propagation Analysis from within a running Eclipse instance.
 * For most methods, we only delegate to the actual propagation classes.
 * 
 * @author Niko
 *
 */
public class UCArchitectureVersionPersistencyForKAMP extends AbstractArchitectureVersionPersistency<UCArchitectureVersion> {

	@Override
	public UCArchitectureVersion load(String folderpath, String filename, String versionname) {
		/*
		 * This method is not executed by the KAMP Framework so far. It might be
		 * executed if some other KAMP-Features are implemented.
		 */
		// TODO implement if necessary (use EMFPersistenceHelper.loadEMFModelFromFile())
		
		throw new RuntimeException("Load not supported");
	}

	/**
	 * Load available methods from folder (or subfolders) of provided propagation
	 * file.. This method is called by the KAMP Framework if "STEP 3: Calculate
	 * Uncertainty Propagation" is executed. We do not use methods from
	 * {@link FileAndFolderManagement} (provided by KAMP Framework) to load models,
	 * as they do not support having the models in sub-folder relative to the
	 * '.uncertaintypropagation' file. Our self-defined
	 * EMFPersistenceHelper.retrieveFileWithExtension() methods supports this.
	 * 
	 * @throws
	 */
	@Override
	public UCArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();

		// Palladio Files
		IFile repositoryFile;
		IFile systemFile;
		IFile allocationFile;
		IFile resourceEnvFile;
		IFile usageModelFile;
		IFile uncertaintyImpactFile;
		try {
			repositoryFile = EMFPersistenceHelper.retrieveFileWithExtension(folder, FILEEXTENSION_REPOSITORY);
			systemFile = EMFPersistenceHelper.retrieveFileWithExtension(folder, FILEEXTENSION_SYSTEM);
			allocationFile = EMFPersistenceHelper.retrieveFileWithExtension(folder, FILEEXTENSION_ALLOCATION);
			resourceEnvFile = EMFPersistenceHelper.retrieveFileWithExtension(folder, FILEEXTENSION_RESOURCE_ENV);
			usageModelFile = EMFPersistenceHelper.retrieveFileWithExtension(folder, FILEEXTENSION_USAGEM_MODEL);

			uncertaintyImpactFile = EMFPersistenceHelper.retrieveFileWithExtension(folder,
					FILEEXTENSION_UNCERTAINTY_PROPAGATION);
		} catch (SaveModelFailedException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		Repository repository = null;
		System system = null;
		Allocation allocation = null;
		ResourceEnvironment resourceEnv = null;
		UsageModel usageModel = null;
		AbstractUCImpactRepository<?> uncertaintyImpactModel = null;

		try {
			if (repositoryFile != null && repositoryFile.exists()) {

				repository = EMFPersistenceHelper.loadEmfModelFromFile(repositoryFile.getFullPath().toString(), null,
						loadResourceSet, Repository.class);

			}
			if (systemFile != null && systemFile.exists()) {
				system = EMFPersistenceHelper.loadEmfModelFromFile(systemFile.getFullPath().toString(), null,
						loadResourceSet, System.class);
			}
			if (allocationFile != null && allocationFile.exists()) {
				allocation = EMFPersistenceHelper.loadEmfModelFromFile(allocationFile.getFullPath().toString(), null,
						loadResourceSet, Allocation.class);
			}
			if (resourceEnvFile != null && resourceEnvFile.exists()) {
				resourceEnv = EMFPersistenceHelper.loadEmfModelFromFile(resourceEnvFile.getFullPath().toString(), null,
						loadResourceSet, ResourceEnvironment.class);
			}
			if (usageModelFile != null && usageModelFile.exists()) {
				usageModel = EMFPersistenceHelper.loadEmfModelFromFile(usageModelFile.getFullPath().toString(), null,
						loadResourceSet, UsageModel.class);
			}

			if (uncertaintyImpactFile != null && uncertaintyImpactFile.exists()) {
				uncertaintyImpactModel = EMFPersistenceHelper.loadEmfModelFromFile(
						uncertaintyImpactFile.getFullPath().toString(), null, loadResourceSet,
						AbstractUCImpactRepository.class);
			}

		} catch (LoadModelFailedException e) {
			e.printStackTrace();
			throw new RuntimeException("Load models failed. Error message: " + e.getMessage());
		}
		
		UCArchitectureVersion version;
		
		try {
			version =  new UCArchitectureVersion(versionname, repository, system, allocation, resourceEnv, usageModel,
					uncertaintyImpactModel);
		} catch (InitializePropagationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return version; 
	}

	/**
	 * We had to override original saveModificationMarkFile, as we use a different
	 * file ending. This method is called by the KAMP Framework after propagation is
	 * finished. We delegate to our self defined saving mechanisms, as additional
	 * logic while saving has to be applied (See
	 * {@link SaveUncertaintyPropagationModelHelper})
	 */
	@Override
	public void saveModificationMarkFile(String targetDirectoryPath, String filename, UCArchitectureVersion version)
			throws IOException {

		String fullPath = targetDirectoryPath + "/" + filename + "." + FILEEXTENSION_UNCERTAINTY_PROPAGATION;

		URI uri = URI.createPlatformResourceURI(fullPath, false);

		try {
			SaveUncertaintyPropagationModelHelper.saveUncertaintyPropagation(version, uri);
		} catch (SaveModelFailedException e) {
			e.printStackTrace();
			throw new IOException(e);
		}

	}

	@Override
	public void save(String targetDirectoryPath, String filename, UCArchitectureVersion version) {
		/*
		 * This method is implemented if model diffing (See KAMP4IS) is required to
		 * derive work plans. So far, this feature is not required.
		 */
		throw new RuntimeException("Save models not supported");
	}

	@Override
	protected void registerEPackages(ResourceSet resourceSet) {
		/*
		 * TODO implement if load methods of AbstractArchitectureVersionPersistency are
		 * used. We delegate all load/save operations to our self-defined classes, as we
		 * need additional logic while saving. Therefore, overwriting registerEPackages
		 * is not necessary here
		 */
	}

}
