package org.palladiosimulator.uncertainty.impact.view;

import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.uncertainty.impact.view.api.IDisplayUncertaintyPropagationResultView;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel;

/**
 * This view encapsulates pop up dialog which is used to display uncertainty
 * propagation results. It is opened by {@link UncertaintyView}
 * 
 * @author Niko
 *
 */
public class DisplayUncertaintyPropagationResultView extends AbstractView
		implements IDisplayUncertaintyPropagationResultView {

	private DisplayUncertaintyPropagationResultViewDialog dialog;
	private Composite parent;

	public DisplayUncertaintyPropagationResultView(Composite parent) {
		super(parent);
		this.parent = parent;
	}

	/**
	 * Open dialog
	 */
	@Override
	public int openView(List<UncertaintyPropagationResultViewModel> uncertaintyPropagationResultViewModels) {
		// Need to create new dialog as reopening dialog caused strange behavior
		this.dialog = new DisplayUncertaintyPropagationResultViewDialog(parent.getShell(),
				uncertaintyPropagationResultViewModels);
		return dialog.open();
	}

	@Override
	public void showMessage(String message) {
		super.showMessage(message);
	}

}
