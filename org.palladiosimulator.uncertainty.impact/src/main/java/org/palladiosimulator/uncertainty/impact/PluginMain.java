package org.palladiosimulator.uncertainty.impact;

import javax.inject.Inject;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.presenter.PalladioPresenter;
import org.palladiosimulator.uncertainty.impact.presenter.UncertaintyCreationPresenter;
import org.palladiosimulator.uncertainty.impact.presenter.UncertaintyPresenter;
import org.palladiosimulator.uncertainty.impact.presenter.UncertaintyTemplatePresenter;
import org.palladiosimulator.uncertainty.impact.view.LoadPalladioModelsView;
import org.palladiosimulator.uncertainty.impact.view.LoadUncertaintyTemplateModelView;
import org.palladiosimulator.uncertainty.impact.view.UncertaintyCreationView;
import org.palladiosimulator.uncertainty.impact.view.UncertaintyView;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadPalladioModelsView;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadUncertaintyTemplateModelView;
import org.palladiosimulator.uncertainty.impact.view.api.IUncertaintyCreationView;
import org.palladiosimulator.uncertainty.impact.view.api.IUncertaintyView;

/**
 * Represents the view of the Plug-In. It is started on Plug-In startup as
 * defined by plugin.xml. <br>
 * Usually, you start reading my code with this class. Have fun and do no
 * hesitate to ask if something is unclear. Sometimes, the code is kind of ugly
 * and contains known anti-patterns. Wherever I was aware of that, I added some
 * comment to make sure why I had to do something. In most of the cases, it was
 * necessary as EMF and Palladio are not the developers best friends when it
 * comes to clear and structured code. Keep in mind that the code neither
 * strives for optimal performance, nor for 100% maintainability. Anyway,
 * extend, improve and maintain it!
 * 
 * @author Niko Benkler
 *
 */
public class PluginMain extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.palladiosimulator.uncertainty.impact.PluginMain";

	@Inject
	IWorkbench workbench;

	private IUncertaintyModel uncertaintyModel;
	private IUncertaintyTemplateModel uncertaintyTemplateModel;
	private IPalladioModel palladioModel;

	private ILoadPalladioModelsView loadPalladioModelsView;
	private ILoadUncertaintyTemplateModelView loadUncertaintyTemplateView;
	private IUncertaintyView uncertaintyView;
	private IUncertaintyCreationView createNewUncertaintyView;

	private Composite parent;

	@Override
	public void createPartControl(Composite parent) {

		this.parent = parent;

		workbench.getHelpSystem().setHelp(parent, "org.palladiosimulator.uncertainty.impact.plugin.viewer");

		// Basic Layout: Grid Layout with 4 cells
		setBasicGridLayout();

		// Model View Presenter (MVP) Style is used
		initViews();
		initModels();
		initPresenters();
	}

	private void initViews() {

		// Not rendered on start
		this.createNewUncertaintyView = new UncertaintyCreationView(parent);

		// Order is important for layout of main view
		this.uncertaintyView = new UncertaintyView(parent, createNewUncertaintyView);
		this.loadUncertaintyTemplateView = new LoadUncertaintyTemplateModelView(parent);
		this.loadPalladioModelsView = new LoadPalladioModelsView(parent);

	}

	private void initModels() {
		this.uncertaintyModel = new UncertaintyModel();
		this.uncertaintyTemplateModel = new UncertaintyTemplateModel();
		this.palladioModel = new PalladioModel();
	}

	private void initPresenters() {

		new UncertaintyPresenter(uncertaintyView, uncertaintyModel, uncertaintyTemplateModel, palladioModel);
		new UncertaintyTemplatePresenter(loadUncertaintyTemplateView, uncertaintyTemplateModel);
		new PalladioPresenter(loadPalladioModelsView, palladioModel);
		new UncertaintyCreationPresenter(createNewUncertaintyView, uncertaintyTemplateModel, palladioModel);

	}

	private void setBasicGridLayout() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 4;
		this.parent.setLayout(gridLayout);
	}

	public void showMessage(String message) {
		MessageDialog.openInformation(parent.getShell(), "Uncertainty View", message);
	}

	@Override
	public void setFocus() {
		parent.setFocus();
	}

}
