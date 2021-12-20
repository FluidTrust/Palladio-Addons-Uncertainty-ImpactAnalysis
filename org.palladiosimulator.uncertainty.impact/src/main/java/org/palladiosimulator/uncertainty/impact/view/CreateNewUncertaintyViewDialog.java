package org.palladiosimulator.uncertainty.impact.view;

import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.uncertainty.impact.view.listener.api.ICreateNewUncertaintyViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;
import org.palladiosimulator.uncertainty.impact.view.util.ViewFactory;

/**
 * This class represents the dialog (pop up) with which new uncertainties are
 * created. It is opened by {@link CreateNewUncertaintyView}-
 * 
 * @author Niko
 *
 */
public class CreateNewUncertaintyViewDialog extends TitleAreaDialog {

	private Text txtName;

	private ComboViewer uncertaintyTypesDropDownMenu;

	private ComboViewer assignableElementsDropDownMenu;

	private ICreateNewUncertaintyViewListener listener;

	//Data filled on save
	private UncertaintyViewModel uncertaintyViewModel;
	
	//Data filled by selection listeners of drop down menus
	private UncertaintyTypeViewModel uncertaintyTypeViewModel;
	private PalladioElementViewModel palladioElementViewModel;

	public CreateNewUncertaintyViewDialog(Shell parentShell, ICreateNewUncertaintyViewListener listener) {
		super(parentShell);
		this.listener = listener;
		super.create();
		setTitle("Create New Uncertainty Dialog");
		setMessage("Specify values to create new uncertainty...", IMessageProvider.INFORMATION);

	}

	/*
	 * save content of the Text fields because they get disposed as soon as the
	 * Dialog closes
	 */
	/**
	 * JFace has different scope for JFace elements. As soon as dialog gets
	 * disposed, the content of the elements (i.e. the user input) gets disposed.
	 * Therefore, content must be saved when 'ok' is pressed
	 */
	private void saveInput() {
		// Save relevant user input
		uncertaintyViewModel = new UncertaintyViewModel();
		uncertaintyViewModel.setName(txtName.getText());
		uncertaintyViewModel.setUncertaintyTypeViewModel(uncertaintyTypeViewModel);
		uncertaintyViewModel.setAssignedElement(palladioElementViewModel);

	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);

		Composite container = ViewFactory.createDialogComposite(area);

		createNameInputField(container);
		createSelectUncertaintyTypesDropDown(container);
		createSelectAssignableElementDropDown(container);

		return area;
	}

	/**
	 * User input for uncertainty name
	 * 
	 * @param container
	 */
	private void createNameInputField(Composite container) {
		// Create label
		ViewFactory.createLabel(container, "Name");

		// Create text
		txtName = ViewFactory.createText(container);
	}

	private void createSelectUncertaintyTypesDropDown(Composite container) {
		// Create table
		ViewFactory.createLabel(container, "Select Type: ");

		// Create drop down menu for uncertainty types
		uncertaintyTypesDropDownMenu = ViewFactory.createDropDownMenu(container);

		// Label for uncertainty type is the name
		uncertaintyTypesDropDownMenu.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof UncertaintyTypeViewModel) {
					return ((UncertaintyTypeViewModel) element).getName();
				}
				return super.getText(element);
			}
		});

		/*
		 * Selected uncertainty type causes back-end call as actual elements that can be
		 * referenced by uncertainty of given types are loaded.
		 * 
		 */
		uncertaintyTypesDropDownMenu.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (selection.size() > 0) {
					// The currently selected type
					uncertaintyTypeViewModel = ((UncertaintyTypeViewModel) selection.getFirstElement());

					// Call backend to retrieve possible elements (loaded into
					// 'assignableElementsDropDownMenu')
					listener.uncertaintyViewModelSelected(uncertaintyTypeViewModel);
				}
			}
		});
	}

	/**
	 * Based on the selected type, thi dropdown menu displays the available elements
	 * to which the user can assign an uncertainty.
	 * 
	 * @param container
	 */
	private void createSelectAssignableElementDropDown(Composite container) {
		// Create label
		ViewFactory.createLabel(container, "Assigned Element: ");

		// Create dropdown menu for assignable elements
		assignableElementsDropDownMenu = ViewFactory.createDropDownMenu(container);

		assignableElementsDropDownMenu.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof PalladioElementViewModel) {
					PalladioElementViewModel model = (PalladioElementViewModel) element;
					return model.getName() + "(id: " + model.getId() + ")";
				}
				return super.getText(element);
			}
		});

		assignableElementsDropDownMenu.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (selection.size() > 0) {
					palladioElementViewModel = ((PalladioElementViewModel) selection.getFirstElement());
				}
			}
		});

	}

	/**
	 * Set content of uncertainty type dropdown menu
	 * @param uncertaintyTypes
	 */
	public void setUncertaintyTypes(List<UncertaintyTypeViewModel> uncertaintyTypes) {
		uncertaintyTypesDropDownMenu.setInput(uncertaintyTypes);
	}

	/**
	 * Set content of assignable elements dropdown menu
	 * @param uncertaintyTypes
	 */
	public void setAssignablePalladioElements(List<PalladioElementViewModel> palladioElements) {
		assignableElementsDropDownMenu.setInput(palladioElements);
	}

	public UncertaintyViewModel getUncertaintyViewModel() {
		return uncertaintyViewModel;
	}

}
