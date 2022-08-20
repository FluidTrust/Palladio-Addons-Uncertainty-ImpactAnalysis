
package org.palladiosimulator.uncertainty.impact.persistence;

import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_UNCERTAINTY_WITH_DOT;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.PLUGIN_URI_PREFIX;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.SaveModelFailedException;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer;

/**
 * Helper class to save Uncertainty models. Some additional logic has to be
 * applied to collect uncontained elements. See comment below.
 * 
 * @author Niko
 *
 */
public class SaveUncertaintyModelHelper {

	private SaveUncertaintyModelHelper() {

	}

	public static void saveUncertaintyModel(UncertaintyContainer uncertaintyContainer, String modelPath)
			throws SaveModelFailedException {

		if(uncertaintyContainer == null) {
			throw new SaveModelFailedException("Provided uncertainty model is null");
		}
		
		if(!checkPath(modelPath)) {
			throw new SaveModelFailedException("Invalid path provided!");
		}
		
		URI saveUri = URI.createPlatformResourceURI(modelPath, false);

		prepareUncertaintyModelForSaving(uncertaintyContainer);
		EMFPersistenceHelper.saveEmfModelToURI(uncertaintyContainer, saveUri);

	}

	private static boolean checkPath(String modelPath) {
		return modelPath.endsWith(FILEEXTENSION_UNCERTAINTY_WITH_DOT );
	}

	/**
	 * BasicComponentBehaviour, ComponentInterfaceInstance are wrapper elements we
	 * had to create due to the PCM. As they are created on the fly, we have to
	 * persist them separately (each element needs to be contained).
	 * 
	 * @param uncertaintyModel
	 */
	private static void prepareUncertaintyModelForSaving(UncertaintyContainer uncertaintyModel) {
		for (Uncertainty uncertainty : uncertaintyModel.getUncertainties()) {
			Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
			if (referencedElement instanceof BasicComponentBehaviour) {
				uncertaintyModel.getBasicComponentBehaviours().add((BasicComponentBehaviour) referencedElement);
			} else if (referencedElement instanceof ComponentInterfaceInstance) {
				uncertaintyModel.getComponentInterfaceInstances().add((ComponentInterfaceInstance) referencedElement);
			}
		}
	}

}
