package org.palladiosimulator.uncertainty.impact.view.listener.api;

import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;

public interface IUncertaintyCreationViewListener {

	public boolean newUncertaintyDialogCreated();

	public void uncertaintyViewModelSelected(UncertaintyTypeViewModel uncertaintyTypeViewModel);

}
