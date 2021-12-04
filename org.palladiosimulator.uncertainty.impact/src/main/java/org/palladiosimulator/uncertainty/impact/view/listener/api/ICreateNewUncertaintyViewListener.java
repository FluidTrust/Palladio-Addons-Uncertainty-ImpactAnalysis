package org.palladiosimulator.uncertainty.impact.view.listener.api;

import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;

public interface ICreateNewUncertaintyViewListener {

	public boolean newUncertaintyDialogCreated();

	public void uncertaintyViewModelSelected(UncertaintyTypeViewModel uncertaintyTypeViewModel);

}
