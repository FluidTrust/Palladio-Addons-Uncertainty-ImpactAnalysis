package org.palladiosimulator.uncertainty.impact.view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.uncertainty.impact.view.api.ICreateNewUncertaintyView;
import org.palladiosimulator.uncertainty.impact.view.api.IDisplayUncertaintyPropagationResultView;
import org.palladiosimulator.uncertainty.impact.view.api.IDisplayUncertaintyTypeInfoView;
import org.palladiosimulator.uncertainty.impact.view.api.IUncertaintyView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;
import org.palladiosimulator.uncertainty.impact.view.util.ViewFactory;

/**
 * Creates and represents the view elements for handling uncertainties and their
 * propagation.
 * 
 * @author Niko
 *
 */
public class UncertaintyView extends AbstractView implements IUncertaintyView {

	private CheckboxTableViewer tableViewer;
	private IUncertaintyViewListener listener;

	private ICreateNewUncertaintyView createNewUncertaintyView;
	private IDisplayUncertaintyTypeInfoView displayUncertaintyTypeInfoView;
	private IDisplayUncertaintyPropagationResultView propagationResultView;

	private Text uncertaintyModelPathText;

	public UncertaintyView(Composite parent, ICreateNewUncertaintyView createNewUncertaintyView) {
		super(parent);
		// Created by PluginMain.java, as listener is required
		this.createNewUncertaintyView = createNewUncertaintyView;

		// Views that pop up if required
		this.displayUncertaintyTypeInfoView = new DisplayUncertaintyTypeInfoView(parent);
		this.propagationResultView = new DisplayUncertaintyPropagationResultView(parent);

		// Order important for layout
		createModelInputGrid(parent);
		createUncertaintyTableViewerGrid(parent);
		createButtonsGrid(parent);

	}

	@Override
	public void setUncertaintyViewListener(IUncertaintyViewListener uncertaintyViewListener) {
		this.listener = uncertaintyViewListener;
	}

	/**
	 * Create Composite for load uncertainty model (Label, input text field, button)
	 * 
	 * @param parent
	 */
	private void createModelInputGrid(Composite parent) {

		Composite loadUncertaintyModelComposite = ViewFactory.createComposite(parent, 4, 4);

		ViewFactory.createLabel(loadUncertaintyModelComposite, "Path to uncertainty model");

		uncertaintyModelPathText = ViewFactory.createText(loadUncertaintyModelComposite,
				"src/main/resources/models/user/sample.uncertainty", 2);

		Button button = ViewFactory.createButton(loadUncertaintyModelComposite, "Load Model");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:
					listener.onLoadExistingModelButtonClicked(uncertaintyModelPathText.getText());
					break;
				}
			}
		});

	}

	/**
	 * Create the buttons next to the uncertainty table
	 * 
	 * @param parent
	 */
	private void createButtonsGrid(Composite parent) {

		Composite buttonComposite = ViewFactory.createComposite(parent, 1, 1);

		createSelectAllButton(buttonComposite);
		createDeselectAllButton(buttonComposite);

		addPlaceholder(buttonComposite);

		createAddUncertaintyButton(buttonComposite);
		createRemoveUncertaintyButton(buttonComposite);
		createDisplayInformationButton(buttonComposite);

		addPlaceholder(buttonComposite);

		createNewUncertaintyModelButton(buttonComposite);
		createSaveUncertaintyModelButton(buttonComposite);

		addPlaceholder(buttonComposite);

		makePropagatUncertaintiesButton(buttonComposite);
		makeSavePropagationButton(buttonComposite);

	}

	/**
	 * Creates empty Label with default width.
	 * 
	 * @param parent
	 */
	private void addPlaceholder(Composite parent) {
		ViewFactory.createLabel(parent, "");
	}

	/**
	 * Add button and delegate to {@link IUncertaintyViewListener}
	 * 
	 * @param buttonComposite
	 */
	private void createAddUncertaintyButton(Composite buttonComposite) {
		Button button = ViewFactory.createButton(buttonComposite, "Add Uncertainty");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:
					if (createNewUncertaintyView.openView() == Window.OK) {
						listener.onAddUncertaintyButtonClicked(createNewUncertaintyView.getUncertaintyViewModel());
					}

					break;
				}

			}

		});

	}

	/**
	 * Add button and delegate to {@link IUncertaintyViewListener}
	 * 
	 * @param buttonComposite
	 */
	private void createRemoveUncertaintyButton(Composite buttonComposite) {
		Button button = ViewFactory.createButton(buttonComposite, "Remove Uncertainty");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					//Get current checked elements from tableViewer
					List<Object> checkedElements = Arrays.asList(tableViewer.getCheckedElements());
					if (checkedElements.isEmpty()) {
						return;
					}

					//Cast to UncertaintyViewModel
					List<UncertaintyViewModel> uncertainties = checkedElements.stream()
							.map(x -> (UncertaintyViewModel) x).collect(Collectors.toList());
					
					listener.onRemoveUncertaintyButtonClicked(uncertainties);

					break;
				}

			}

		});

	}

	/**
	 * Add button and delegate to {@link IDisplayUncertaintyTypeInfoView}
	 * 
	 * @param buttonComposite
	 */
	private void createDisplayInformationButton(Composite buttonComposite) {
		Button button = ViewFactory.createButton(buttonComposite, "Get Type Info");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					//Get current checked element from tableViewer
					List<Object> checkedElements = Arrays.asList(tableViewer.getCheckedElements());
					if (!(checkedElements.size() == 1)) {
						showMessage("Please select exactly one uncertainty");
						return;
					}

					displayUncertaintyTypeInfoView
							.openView(((UncertaintyViewModel) checkedElements.get(0)).getUncertaintyTypeViewModel());
					break;
				}

			}

		});

	}

	/**
	 * Add button and delegate to {@link IUncertaintyViewListener}
	 * 
	 * @param buttonComposite
	 */
	private void createNewUncertaintyModelButton(Composite buttonComposite) {
		Button button = ViewFactory.createButton(buttonComposite, "New Uncertainty Model");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					listener.onCreateNewUncertaintyModelButtonClicked();
					break;
				}

			}

		});
	}

	/**
	 * Add button and delegate to {@link IUncertaintyViewListener}
	 * 
	 * @param buttonComposite
	 */
	private void createSaveUncertaintyModelButton(Composite buttonComposite) {
		Button button = ViewFactory.createButton(buttonComposite, "Save Uncertainty Model");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					listener.onSaveUncertaintyModelButtonClicked(uncertaintyModelPathText.getText());
					break;
				}

			}

		});

	}

	/**
	 * Add button and delegate to {@link IUncertaintyViewListener}
	 * 
	 * @param buttonComposite
	 */
	private void makePropagatUncertaintiesButton(Composite buttonComposite) {
		Button button = ViewFactory.createButton(buttonComposite, "Propagate Uncertainties");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					List<Object> checkedElements = Arrays.asList(tableViewer.getCheckedElements());
					if (checkedElements.size() == 0) {
						showMessage("Please select at least one uncertainty");
						return;
					}

					// Propagate checked elements only
					listener.onPropagateUncertaintiesButtonClicked(
							checkedElements.stream().map(x -> (UncertaintyViewModel) x).collect(Collectors.toList()));

					break;
				}

			}

		});

	}

	/**
	 * Add button and delegate to {@link IUncertaintyViewListener}
	 * 
	 * @param buttonComposite
	 */
	private void makeSavePropagationButton(Composite buttonComposite) {
		Button button = ViewFactory.createButton(buttonComposite, "Propagate && Save");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					List<Object> checkedElements = Arrays.asList(tableViewer.getCheckedElements());
					if (checkedElements.size() == 0) {
						showMessage("Please select at least one uncertainty");
						return;
					}

					// propagate and save checked elements only
					listener.onSavePropagationButtonClicked(
							checkedElements.stream().map(x -> (UncertaintyViewModel) x).collect(Collectors.toList()));

					break;

				}

			}

		});

	}

	/**
	 * Convenience method to de-select all elements of table viewer
	 * 
	 * @param buttonComposite
	 */
	private void createDeselectAllButton(Composite buttonComposite) {

		Button button = ViewFactory.createButton(buttonComposite, "Deselect All");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					tableViewer.setAllChecked(false);
					break;
				}

			}

		});

	}

	/**
	 * Convenience method to select all elements of table viewer
	 * 
	 * @param buttonComposite
	 */
	private void createSelectAllButton(Composite buttonComposite) {

		Button button = ViewFactory.createButton(buttonComposite, "Select All");
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:

					tableViewer.setAllChecked(true);
					break;
				}

			}

		});

	}

	/**
	 * Generates the table viewer that shows the uncertainties.
	 * 
	 * @param parent
	 */
	private void createUncertaintyTableViewerGrid(Composite parent) {

		Composite tableComposite = ViewFactory.createComposite(parent, 1, 3);

		// Overwrite layout
		GridData tableCompositeGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		tableComposite.setLayoutData(tableCompositeGridData);

		tableViewer = new CheckboxTableViewer(new Table(tableComposite,
				SWT.BORDER | SWT.FULL_SELECTION | SWT.CHECK | SWT.RESIZE | SWT.V_SCROLL | SWT.H_SCROLL));
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);

		tableViewer.setContentProvider(ArrayContentProvider.getInstance());

		createUncertaintyNameColumn();
		createUncertaintyTypeColumn();
		createAssignedElementColumn();

		GridData tableGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		tableGridData.heightHint = 20 * tableViewer.getTable().getItemHeight();
		tableGridData.horizontalSpan = 1;

		// Resize table of table viewer after content was set
		tableViewer.getTable().setLayoutData(tableGridData);

	}

	private void createUncertaintyNameColumn() {
		TableColumn column = new TableColumn(tableViewer.getTable(), SWT.NONE);
		column.setText("Uncertainty Name");
		column.setWidth(350);
		TableViewerColumn uncertaintyNameCol = new TableViewerColumn(tableViewer, column);
		uncertaintyNameCol.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				UncertaintyViewModel uncertainty = (UncertaintyViewModel) element;

				return uncertainty.getName();
			}

		});
	}

	private void createUncertaintyTypeColumn() {
		TableColumn column = new TableColumn(tableViewer.getTable(), SWT.NONE);
		column.setText("Uncertainty Type");
		column.setWidth(350);
		TableViewerColumn uncertaintyNameCol = new TableViewerColumn(tableViewer, column);
		uncertaintyNameCol.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				UncertaintyViewModel uncertainty = (UncertaintyViewModel) element;

				return uncertainty.getUncertaintyTypeViewModel().getName();
			}

		});
	}

	private void createAssignedElementColumn() {
		TableColumn column = new TableColumn(tableViewer.getTable(), SWT.NONE);
		column.setText("Assigned Element");
		column.setWidth(350);
		TableViewerColumn uncertaintyNameCol = new TableViewerColumn(tableViewer, column);
		uncertaintyNameCol.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				UncertaintyViewModel uncertaintyViewModel = (UncertaintyViewModel) element;

				PalladioElementViewModel palladioElement = uncertaintyViewModel.getAssignedElement();
				return palladioElement.getName() + " (" + palladioElement.getId() + ")";

			}

		});
	}

	@Override
	public void reloadUncertainties(List<UncertaintyViewModel> uncertainties) {
		tableViewer.setInput(uncertainties);
		tableViewer.refresh();
	}

	@Override
	public void addUncertainty(UncertaintyViewModel uncertainty) {
		tableViewer.add(uncertainty);
	}

	@Override
	public void removeUncertainty(UncertaintyViewModel uncertaintyViewModel) {
		tableViewer.remove(uncertaintyViewModel);
	}

	@Override
	public void removeUncertainties(List<UncertaintyViewModel> uncertaintyViewModels) {
		tableViewer.remove(uncertaintyViewModels.toArray());
	}

	@Override
	public void showMessage(String message) {
		super.showMessage(message);

	}

	@Override
	public void displayPropagationResult(List<UncertaintyPropagationResultViewModel> result) {
		propagationResultView.openView(result);
	}

}