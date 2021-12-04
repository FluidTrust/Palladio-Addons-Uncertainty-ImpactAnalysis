package org.palladiosimulator.uncertainty.impact.view.api;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel;

public interface IDisplayUncertaintyPropagationResultView {

	public void showMessage(String message);

	/**
	 * Open dialog
	 */
	int openView(List<UncertaintyPropagationResultViewModel> ucImpactUncertaintyViewModel);

}
