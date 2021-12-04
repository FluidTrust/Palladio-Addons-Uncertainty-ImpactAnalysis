package org.palladiosimulator.uncertainty.impact.presenter;

import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_ALLOCATION_WITH_DOT;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_REPOSITORY_WITH_DOT;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_RESOURCE_ENV_WITH_DOT;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_SYSTEM_WITH_DOT;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.FILEEXTENSION_USAGEM_MODEL_WITH_DOT;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.presenter.api.IPalladioPresenter;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadPalladioModelsView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.IPalladioViewListener;


/**
 * MVP-related presenter for views of type {@link ILoadPalladioModelsView}.
 * Implements {@link IPalladioViewListener} to be capable to listen on view
 * events. It is used when a user wants to load palladio models.
 * 
 * @author Niko
 *
 */
public class PalladioPresenter implements IPalladioPresenter, IPalladioViewListener {
	ILoadPalladioModelsView view;
	IPalladioModel palladioModel;

	public PalladioPresenter(ILoadPalladioModelsView view, IPalladioModel palladioModel) {
		this.view = view;
		this.palladioModel = palladioModel;
		view.setPalladioViewViewListerner(this);
	}

	/**
	 *  * The user has to specify the paths where the palladio models reside (only
		 * relative to workspace)
	 */
	@Override
	public void onLoadPalladioModelsButtonClicked(final List<String> modelPaths) {

		
		if (!areModelPathsValid(modelPaths)) {
			return;
		}

		try {
			palladioModel.loadPalladioModels(modelPaths);
		} catch (LoadModelFailedException e) {
			view.showMessage("Error while loading models. Error message = " + e.getMessage());
			return;
		}

		view.showMessage("Palladio models succesfully loaded");
	}

	/**
	 * Helper method to check whether the provided paths are valid or not. We expect
	 * that a user provides paths to all models.
	 * 
	 * @param modelPaths
	 * @return
	 */
	private boolean areModelPathsValid(final List<String> modelPaths) {

		List<String> missingModelExtensions = defineMissingModelPaths(modelPaths);
		if (missingModelExtensions.size() > 0) {

			StringBuilder sb = new StringBuilder();
			sb.append("Cannot initialize Palladio model. Following models are missing: ");
			String prefix = "";
			for (String missingModelExtension : missingModelExtensions) {
				sb.append(prefix);
				prefix = ", ";
				sb.append(missingModelExtension);
			}

			view.showMessage(sb.toString());
			return false;
		}

		return true;
	}

	/**
	 * Helper method to verify if provided list of paths contains the required model
	 * extensions
	 * 
	 * @param modelPaths
	 * @return
	 */
	private List<String> defineMissingModelPaths(final List<String> modelPaths) {

		List<String> requiredModelExtensions = new ArrayList<>(List.of(FILEEXTENSION_SYSTEM_WITH_DOT,
				FILEEXTENSION_REPOSITORY_WITH_DOT, FILEEXTENSION_RESOURCE_ENV_WITH_DOT,
				FILEEXTENSION_ALLOCATION_WITH_DOT, FILEEXTENSION_USAGEM_MODEL_WITH_DOT));

		if (modelPaths == null) {
			return requiredModelExtensions;
		}

		List<String> foundModelExtensions = new ArrayList<>();

		for (String path : modelPaths) {
			String extension = path.substring(path.lastIndexOf("."));
			foundModelExtensions.add(extension);
		}

		requiredModelExtensions.removeAll(foundModelExtensions);

		return requiredModelExtensions;
	}

}
