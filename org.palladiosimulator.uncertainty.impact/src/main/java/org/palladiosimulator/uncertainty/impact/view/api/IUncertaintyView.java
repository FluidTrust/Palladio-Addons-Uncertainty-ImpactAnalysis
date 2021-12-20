package org.palladiosimulator.uncertainty.impact.view.api;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

public interface IUncertaintyView extends PluginView {


	/**
	 * Add single uncertainty to view
	 * 
	 * @param uncertaintyViewModel
	 */
	public void addUncertainty(UncertaintyViewModel uncertaintyViewModel);

	/**
	 * Remove all uncertainties from view and add the given uncertainties.
	 * 
	 * @param uncertainties
	 */
	public void reloadUncertainties(List<UncertaintyViewModel> uncertainties);

	/**
	 * Set listener that listens on events due to user input
	 * 
	 * @param uncertaintyViewListener
	 */
	public void setUncertaintyViewListener(IUncertaintyViewListener uncertaintyViewListener);

	public void removeUncertainty(UncertaintyViewModel uncertaintyViewModel);

	public void showMessage(String message);

	public void removeUncertainties(List<UncertaintyViewModel> uncertaintyViewModels);

	public void displayPropagationResult(List<UncertaintyPropagationResultViewModel> result);

	void displayUncertaintyTypeInformation(UncertaintyTypeViewModel uncertaintyTypeViewModel);

}
