package org.palladiosimulator.uncertainty.impact.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
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

	private final List<UncertaintyPropagationResultViewModel> uncertaintyPropagationResultViewModels;

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
		
		Composite innerParentComposite = ViewFactory.createComposite(parent, 1, 1);

		/*
		 *Composite that holds buttons for assessment purposes 
		 */
		Composite buttonComposite = ViewFactory.createComposite(innerParentComposite, 3, 1);
		fillButtonComposite(buttonComposite);
		


		// Set content
		setPropagationContent(innerParentComposite,  uncertaintyPropagationResultViewModels);

		return parent;
	}
	
	private void fillButtonComposite(Composite parent) {
		
		
		ViewFactory.createLabel(parent, "Uncertainty Assessment: ");
		
		Button sortButton = ViewFactory.createButton(parent, "Sort (Amount of Affected Element)", new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		Button restoreDefaultButton = ViewFactory.createButton(parent, "Restore Default", new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		


		sortButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:
					setPropagationContent(parent, sortResultAccordingToAmountOfAffectedElements(uncertaintyPropagationResultViewModels));
					break;
				}

			}

		});
		
		
		restoreDefaultButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:
					setPropagationContent(parent, uncertaintyPropagationResultViewModels);
					break;
				}

			}

		});
	}
	
	
	

	private List<UncertaintyPropagationResultViewModel> sortResultAccordingToAmountOfAffectedElements(
			List<UncertaintyPropagationResultViewModel> listToBeSorted) {
		
		
		 List<UncertaintyPropagationResultViewModel> result = new ArrayList<>(listToBeSorted);
		 
		 Collections.sort(result, (a ,b) ->  Integer.compare(b.getAffectedElements().size(), a.getAffectedElements().size()));
		 
		 
		 return result;
		
		

	}

	private void setPropagationContent(Composite parent, 
			List<UncertaintyPropagationResultViewModel> localUncertaintyPropagationResultViewModels) {

		
		ScrolledComposite sc = null;
		
		for(Control child : parent.getParent().getChildren()) {
			
			if(child instanceof ScrolledComposite) {
				sc = (ScrolledComposite)child;
			}
		}
		
		
		if(sc == null) {
			sc = ViewFactory.createScrolledComposite(parent);
		}
		
		
		if(sc.getContent()!=null) {
			Composite comp = (Composite) sc.getContent();
			
			
			for(Control child : comp.getChildren()) {
				child.dispose();
			}
			sc.getContent().dispose();
		}
		
		
		Composite propagationResultComposite = ViewFactory.createDialogComposite(sc);
		// Set scrollable content (= propagation results)
		sc.setContent(propagationResultComposite);
		
		
		

		// Set content
		for (UncertaintyPropagationResultViewModel viewModel : localUncertaintyPropagationResultViewModels) {
			addViewModel(propagationResultComposite, viewModel);
			addPlaceholder(propagationResultComposite);
		}

		// re-calculate size as soon as content is filled
		sc.setMinSize(propagationResultComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		sc.getParent().getParent().layout(true, true);
		
		
	}

	/**
	 * Add view model representation for each uncertainty propagation result view
	 * model
	 * 
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
