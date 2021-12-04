package org.palladiosimulator.uncertainty.impact.view.api;

import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;

public interface IDisplayUncertaintyTypeInfoView {

	public void showMessage(String message);

	/**
	 * Open dialog
	 */
	int openView(UncertaintyTypeViewModel viewModel);

}
