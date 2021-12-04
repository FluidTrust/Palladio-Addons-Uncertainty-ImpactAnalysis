package org.palladiosimulator.uncertainty.impact.view;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.palladiosimulator.uncertainty.impact.view.model.ADDViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.util.ViewFactory;

/**
 * This class represents the dialog (pop up) with displays uncertainty type
 * information. It is opened by {@link DisplayUncertaintyTypeInfoView}.
 * 
 * @author Niko
 *
 */
public class DisplayUncertaintyTypeInfoViewDialog extends TitleAreaDialog {

	private UncertaintyTypeViewModel uncertaintyTypeViewModel;

	public DisplayUncertaintyTypeInfoViewDialog(Shell parentShell, UncertaintyTypeViewModel viewModel) {
		super(parentShell);
		this.uncertaintyTypeViewModel = viewModel;
		super.create();
		setTitle("Uncertainty Type Information");
		setMessage("General information for this type of uncertainty provided...", IMessageProvider.INFORMATION);

	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		
		//Create dialog composite container with predefined layout
		Composite container = ViewFactory.createDialogComposite(area);

		createInformationPanel(container);

		return area;
	}

	/**
	 * Creates hierachical information tree of current uncertainty type view model
	 * @param container
	 */
	private void createInformationPanel(Composite container) {

		// Id
		addLabel(container, "ID: ");
		addLabel(container, uncertaintyTypeViewModel.getId());

		// Name
		addLabel(container, "Name: ");
		addLabel(container, uncertaintyTypeViewModel.getName());

		// Assignable Element
		addLabel(container, "Assignable Element Type: ");
		addLabel(container, uncertaintyTypeViewModel.getAssignableElementType().getType());

		// ImpactOn
		addLabel(container, "Impact on following Element Types: ");
		if (uncertaintyTypeViewModel.getImpactOn() == null || uncertaintyTypeViewModel.getImpactOn().isEmpty()) {
			addLabel(container, "---");
		} else {
			addLabel(container, ""); // Placeholder right column
			for (PalladioElementTypeViewModel palladioElementTypeViewModel : uncertaintyTypeViewModel.getImpactOn()) {
				addLabel(container, ""); // Placeholder left column
				addLabel(container, palladioElementTypeViewModel.getName());
			}
		}

		// ADD
		ADDViewModel add = uncertaintyTypeViewModel.getResolvedBy();
		addLabel(container, "Resolved By: ");
		if (add == null) {
			addLabel(container, "---");
		} else {
			addLabel(container, add.getName());

			addLabel(container, "");
			addLabel(container, "       ADD Class:  " + add.getAddClass());
			addLabel(container, "");
			addLabel(container, "       Amount of Alternatives:  " + add.getAmountOfAlternatives());
			addLabel(container, "");
			addLabel(container, "       Costs of Revision:  " + add.getCostsOfRevision());
			addLabel(container, "");
			addLabel(container, "       Possibility of Revisability:  " + add.getPossibilityOfRevisability());
			addLabel(container, "");
			addLabel(container, "       Propability of Revisability:  " + add.getProbabilityOfRevisability());
		}

		// impactOnConfidentiality
		addLabel(container, "Impact On Confidentiality: ");
		addLabel(container, uncertaintyTypeViewModel.getImpactOnConfidentiality());

		// informationAvailability
		addLabel(container, "Information Availability: ");
		addLabel(container, uncertaintyTypeViewModel.getInformationAvailability());

		// location
		addLabel(container, "Location: ");
		addLabel(container, uncertaintyTypeViewModel.getLocation());

		// Manageability
		addLabel(container, "Manageability: ");
		addLabel(container, uncertaintyTypeViewModel.getManageability());

		// Nature
		addLabel(container, "Nature: ");
		addLabel(container, uncertaintyTypeViewModel.getNature());

		// Resolution Time
		addLabel(container, "Resolution Time: ");
		addLabel(container, uncertaintyTypeViewModel.getResolutionTime());

		// Root Cause
		addLabel(container, "Root Cause: ");
		addLabel(container, uncertaintyTypeViewModel.getRootCause());

		// Severity of Impact
		addLabel(container, "Severity Of Impact: ");
		addLabel(container, uncertaintyTypeViewModel.getSeverityOfImpact());

	}

	private void addLabel(Composite container, String text) {
		ViewFactory.createFillingLabel(container, text);
	}
	

}
