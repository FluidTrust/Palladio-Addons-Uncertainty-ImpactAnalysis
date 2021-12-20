package org.palladiosimulator.uncertainty.impact.view;

import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.uncertainty.impact.view.api.IDisplayUncertaintyTypeInfoView;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;

/**
 * This view encapsulates pop up dialog which is used to display uncertainty
 * type information. It is opened by {@link UncertaintyView}
 * 
 * @author Niko
 *
 */
public class DisplayUncertaintyTypeInfoView extends AbstractView implements IDisplayUncertaintyTypeInfoView {

	
	private Composite parent;

	public DisplayUncertaintyTypeInfoView(Composite parent) {
		super(parent);
		this.parent = parent;
	}

	/**
	 * Open dialog
	 */
	@Override
	public int openView(UncertaintyTypeViewModel viewModel) {
		// Need to create new dialog as reopening dialog caused strange behaviour
		DisplayUncertaintyTypeInfoViewDialog dialog = new DisplayUncertaintyTypeInfoViewDialog(parent.getShell(), viewModel);
		return dialog.open();
	}

	

}
