package org.palladiosimulator.uncertainty.impact.view.api;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyCreationViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

public interface IUncertaintyCreationView extends PluginView {

	public int openView();

	public void setCreateNewUncertaintyViewListener(IUncertaintyCreationViewListener listener);

	public UncertaintyViewModel getUncertaintyViewModel();

	public void setUncertaintyTypes(List<UncertaintyTypeViewModel> uncertaintyTypes);

	public void setAssignablePalladioElements(List<PalladioElementViewModel> assignableElements);

	public void showMessage(String message);

}
