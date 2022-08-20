package org.palladiosimulator.uncertainty.impact.view;

import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.PLUGIN_URI_PREFIX;

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

	private static String defaultAllocationModelPath =
			PLUGIN_URI_PREFIX + "src/main/resources/models/user/pcm/BookShop.allocation";
	private static String defaultRepositoryModelPath =
			PLUGIN_URI_PREFIX + "src/main/resources/models/user/pcm/BookShop.repository";
	private static String defaultResourceEnvironmentModelPath =
			PLUGIN_URI_PREFIX + "src/main/resources/models/user/pcm/BookShop.resourceenvironment";
	private static String defaultSystemModelPath =
			PLUGIN_URI_PREFIX + "src/main/resources/models/user/pcm/BookShop.system";
	private static String defaultUsageModelPath =
			PLUGIN_URI_PREFIX + "src/main/resources/models/user/pcm/BookShop.usagemodel";

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
		String repositoryModelPath = System.getenv("UIA_REPOSITORY_MODEL_PATH"); 
		if (repositoryModelPath != null) {
			defaultRepositoryModelPath = repositoryModelPath;
		}
		pathToRepositoryField = ViewFactory.createText(browseModelsComposite, defaultRepositoryModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to system file:");
		String systemModelPath = System.getenv("UIA_SYSTEM_MODEL_PATH"); 
		if (systemModelPath != null) {
			defaultSystemModelPath = systemModelPath;
		}
		pathToSystemField = ViewFactory.createText(browseModelsComposite, defaultSystemModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to allocation file:");
		String allocationModelPath = System.getenv("UIA_ALLOCATION_MODEL_PATH"); 
		if (allocationModelPath != null) {
			defaultAllocationModelPath = allocationModelPath;
		}
		pathToAllocationField = ViewFactory.createText(browseModelsComposite, defaultAllocationModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to resourceenvironment file:");
		String resourceEnvironmentModelPath = System.getenv("UIA_RESOURCEENVIRONMENT_MODEL_PATH"); 
		if (resourceEnvironmentModelPath != null) {
			defaultResourceEnvironmentModelPath = resourceEnvironmentModelPath;
		}
		pathToResourceEnvironmentField = ViewFactory.createText(browseModelsComposite,
				defaultResourceEnvironmentModelPath, 2);

		ViewFactory.createLabel(browseModelsComposite, "Path to usagemodel file:");
		String usageModelPath = System.getenv("UIA_USAGE_MODEL_PATH"); 
		if (usageModelPath != null) {
			defaultUsageModelPath = usageModelPath;
		}
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

	

}
