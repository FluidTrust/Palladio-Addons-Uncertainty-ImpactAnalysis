package org.palladiosimulator.uncertainty.impact.presenter;

import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.presenter.api.IUncertaintyTemplatePresenter;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadUncertaintyTemplateModelView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyTemplateViewListener;

/**
 * MVP-related presenter for views of type
 * {@link ILoadUncertaintyTemplateModelView}. Implements
 * {@link IUncertaintyTemplateViewListener} to be capable to listen on view
 * 
 * @author Niko
 *
 */
public class UncertaintyTemplatePresenter implements IUncertaintyTemplatePresenter, IUncertaintyTemplateViewListener {

	private ILoadUncertaintyTemplateModelView view;
	private IUncertaintyTemplateModel uncertaintyTemplateModel;

	public UncertaintyTemplatePresenter(ILoadUncertaintyTemplateModelView view,
			IUncertaintyTemplateModel uncertaintyTemplateModel) {
		
		view.setUncertaintyTemplateViewListerner(this);
		this.uncertaintyTemplateModel = uncertaintyTemplateModel;
		this.view = view;
	}

	/**
	 * User specifies path from which existing model shall be loaded.
	 */
	@Override
	public void onLoadUncertaintyTemplateButtonClicked(String path) {
		if (path.isBlank()) {
			view.showMessage("Please provide valid path to uncertainty template");
		} else {
			try {
				uncertaintyTemplateModel.loadUncertaintyTemplateModel(path);
			} catch (LoadModelFailedException e) {
				view.showMessage("Error while loading uncertainty template model. Error message = " + e.getMessage());
				return;
			}
			view.showMessage("Uncertainty template model successfully loaded");
		}
	}

}
