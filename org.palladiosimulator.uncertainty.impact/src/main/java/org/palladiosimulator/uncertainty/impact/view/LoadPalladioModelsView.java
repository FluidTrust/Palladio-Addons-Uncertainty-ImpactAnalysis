package org.palladiosimulator.uncertainty.impact.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadPalladioModelsView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.IPalladioViewListener;
import org.palladiosimulator.uncertainty.impact.view.util.ViewFactory;

/**
 * Create the view elements to i) enter paths for palladio models and ii) trigger
 * loading. Default paths match the expected folder structure.
 * 
 * @author Niko
 *
 */
public class LoadPalladioModelsView extends AbstractView implements ILoadPalladioModelsView {
	private Composite parent;

	private Text pathToRepositoryField;
	private Text pathToSystemField;
	private Text pathToAllocationField;
	private Text pathToResourceEnvironmentField;
	private Text pathToUsageModelField;

	private IPalladioViewListener listener;

	private static String defaultAllocationModelPath = "src/main/resources/models/user/pcm/BookShop.allocation";
	private static String defaultRepositoryModelPath = "src/main/resources/models/user/pcm/BookShop.repository";
	private static String defaultResourceEnvironmentModelPath = "src/main/resources/models/user/pcm/BookShop.resourceenvironment";
	private static String defaultSystemModelPath = "src/main/resources/models/user/pcm/BookShop.system";
	private static String defaultUsageModelPath = "src/main/resources/models/user/pcm/BookShop.usagemodel";

	public LoadPalladioModelsView(Composite parent) {
		super(parent);
		this.parent = parent;
		createModelInputGrid();
		createLoadModelsButton();
	}

	private void createModelInputGrid() {

		// Encapsulated the input fields
		Composite browseModelsComposite = ViewFactory.createComposite(parent, 3, 3);

		// Create label and input fields for each palladio model
		ViewFactory.createLabel(browseModelsComposite, "Path to repository file:");
		pathToRepositoryField = ViewFactory.createText(browseModelsComposite, defaultRepositoryModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to system file:");
		pathToSystemField = ViewFactory.createText(browseModelsComposite, defaultSystemModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to allocation file:");
		pathToAllocationField = ViewFactory.createText(browseModelsComposite, defaultAllocationModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to resourceenvironment file:");
		pathToResourceEnvironmentField = ViewFactory.createText(browseModelsComposite,
				defaultResourceEnvironmentModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to usagemodel file:");
		pathToUsageModelField = ViewFactory.createText(browseModelsComposite, defaultUsageModelPath, 2);

	}

	private void createLoadModelsButton() {
		Button button = ViewFactory.createButton(parent, "Load Models");
		
		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:
					List<String> modelPaths = new ArrayList<>();
					modelPaths.add(pathToRepositoryField.getText());
					modelPaths.add(pathToSystemField.getText());
					modelPaths.add(pathToAllocationField.getText());
					modelPaths.add(pathToResourceEnvironmentField.getText());
					modelPaths.add(pathToUsageModelField.getText());
					listener.onLoadPalladioModelsButtonClicked(modelPaths);
					break;
				}

			}

		});

	}

	@Override
	public void setPalladioViewViewListerner(IPalladioViewListener listener) {
		this.listener = listener;

	}

	@Override
	public void showMessage(String message) {
		super.showMessage(message);

	}

}
