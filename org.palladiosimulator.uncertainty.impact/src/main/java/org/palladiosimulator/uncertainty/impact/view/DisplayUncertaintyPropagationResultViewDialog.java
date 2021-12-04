package org.palladiosimulator.uncertainty.impact.view;

import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel.UCImpactUncertaintyAffectedElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;
import org.palladiosimulator.uncertainty.impact.view.util.ViewFactory;

/**
 * This class represents the dialog (pop up) with displays uncertainty type
 * information. It is opened by {@link DisplayUncertaintyPropagationResultView}.
 * 
 * @author Niko
 *
 */
public class DisplayUncertaintyPropagationResultViewDialog extends TitleAreaDialog {

	private List<UncertaintyPropagationResultViewModel> uncertaintyPropagationResultViewModels;

	public DisplayUncertaintyPropagationResultViewDialog(Shell parentShell,
			List<UncertaintyPropagationResultViewModel> uncertaintyPropagationResultViewModels) {
		super(parentShell);
		this.uncertaintyPropagationResultViewModels = uncertaintyPropagationResultViewModels;
		super.create();
		setTitle("Uncertainty Propagation Results");
		setMessage("Propagation for each uncertainty (incl. paths). ", IMessageProvider.INFORMATION);

	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		/*
		 * Propagation result might exceed screen size -> wrap with scrollable
		 * composite.
		 */
		ScrolledComposite sc = ViewFactory.createScrolledComposite(parent);

		Composite propagationResultComposite = ViewFactory.createDialogComposite(sc);

		// Set scrollable content (= propagation results)
		sc.setContent(propagationResultComposite);

		//Set content
		for (UncertaintyPropagationResultViewModel viewModel : uncertaintyPropagationResultViewModels) {
			addViewModel(propagationResultComposite, viewModel);
			addPlaceholder(propagationResultComposite);
		}

		// re-calculate size as soon as content is filled
		sc.setMinSize(propagationResultComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		return parent;
	}

	/**
	 * Add view model representation for each uncertainty propagation result view model
	 * @param container
	 * @param propagationViewModel
	 */
	private void addViewModel(Composite container, UncertaintyPropagationResultViewModel propagationViewModel) {

		UncertaintyViewModel uncertaintyViewModel = propagationViewModel.getUncertainty();

		// Id
		addLabel(container, "ID: ");
		addLabel(container, uncertaintyViewModel.getId());

		// Name
		addLabel(container, "Name: ");
		addLabel(container, uncertaintyViewModel.getName());

		// Propagated to elements
		addLabel(container, "Propagated to: ");
		addEmptyLabel(container); // Placeholder right column
		for (UCImpactUncertaintyAffectedElementViewModel affectedElementViewModel : propagationViewModel
				.getAffectedElements()) {
			addEmptyLabel(container); // Placeholder left column
			addLabel(container, affectedElementViewModel.getElement());

			for (String pathEntryString : affectedElementViewModel.getPath()) {
				addEmptyLabel(container); // Placeholder left column
				addLabel(container, "	" + pathEntryString);
			}

		}

	}

	private void addPlaceholder(Composite container) {
		addEmptyLabel(container);
		addEmptyLabel(container);
	}

	private void addLabel(Composite container, String text) {
		ViewFactory.createFillingLabel(container, text);
	}
	
	private void addEmptyLabel(Composite container) {
		ViewFactory.createFillingLabel(container, "");
	}

}
