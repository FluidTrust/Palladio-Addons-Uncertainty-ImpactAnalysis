package org.palladiosimulator.uncertainty.impact.view.api;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.view.listener.api.ICreateNewUncertaintyViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

public interface ICreateNewUncertaintyView extends PluginView {

	public int openView();

	public void setCreateNewUncertaintyViewListener(ICreateNewUncertaintyViewListener listener);

	public UncertaintyViewModel getUncertaintyViewModel();

	public void setUncertaintyTypes(List<UncertaintyTypeViewModel> uncertaintyTypes);

	public void setAssignablePalladioElements(List<PalladioElementViewModel> assignableElements);

	public void showMessage(String message);

}
