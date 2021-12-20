package org.palladiosimulator.uncertainty.impact.view;

import java.util.List;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.uncertainty.impact.PluginMain;
import org.palladiosimulator.uncertainty.impact.view.api.ICreateNewUncertaintyView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.ICreateNewUncertaintyViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

/**
 * This view encapsulates pop up dialog which is used to create new
 * Uncertainties. It is initially created by {@link PluginMain} as the listener
 * is initialized and set.
 * 
 * @author Niko
 *
 */
public class CreateNewUncertaintyView extends AbstractView implements ICreateNewUncertaintyView {

	private CreateNewUncertaintyViewDialog dialog;

	private Composite parent;

	private ICreateNewUncertaintyViewListener listener;

	public CreateNewUncertaintyView(Composite parent) {
		super(parent);
		this.parent = parent;
	}

	/**
	 * Opens create new uncertainty dialog in a new window.
	 */
	@Override
	public int openView() {
		// Need to create new dialog as reopening dialog caused strange behavior
		this.dialog = new CreateNewUncertaintyViewDialog(parent.getShell(), listener);
		if (this.listener.newUncertaintyDialogCreated()) {
			return dialog.open();

		}
		return Window.CANCEL;
	}

	@Override
	public void setCreateNewUncertaintyViewListener(ICreateNewUncertaintyViewListener listener) {
		this.listener = listener;
	}

	@Override
	public UncertaintyViewModel getUncertaintyViewModel() {
		return dialog.getUncertaintyViewModel();
	}

	@Override
	public void setUncertaintyTypes(List<UncertaintyTypeViewModel> uncertaintyTypes) {
		dialog.setUncertaintyTypes(uncertaintyTypes);
	}

	@Override
	public void setAssignablePalladioElements(List<PalladioElementViewModel> assignableElements) {
		dialog.setAssignablePalladioElements(assignableElements);
	}



}