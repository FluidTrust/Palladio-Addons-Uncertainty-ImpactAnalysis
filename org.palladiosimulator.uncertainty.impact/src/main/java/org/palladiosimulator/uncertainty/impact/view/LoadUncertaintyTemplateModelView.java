package org.palladiosimulator.uncertainty.impact.view;

import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.PLUGIN_URI_PREFIX;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadUncertaintyTemplateModelView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyTemplateViewListener;
import org.palladiosimulator.uncertainty.impact.view.util.ViewFactory;

/**
 * Create the view elements to i) enter paths for uncertainty template model and ii) trigger
 * loading. Default path match the expected folder structure.
 * 
 * @author Niko
 *
 */
public class LoadUncertaintyTemplateModelView extends AbstractView implements ILoadUncertaintyTemplateModelView {
	private Composite parent;

	private IUncertaintyTemplateViewListener listener;

	private Text pathToUncertaintyTemplateField;

	private static String defaultUncertaintyTemplatePath =
			PLUGIN_URI_PREFIX + "src/main/resources/models/expert/sample.uncertaintytemplate";

	public LoadUncertaintyTemplateModelView(Composite parent) {
		super(parent);
		this.parent = parent;

		makeLoadModelGrid();
	}

	private void makeLoadModelGrid() {
		Composite browseModelComposite = ViewFactory.createComposite(parent, 3, 3);
		
		
		// Create label and input field
		ViewFactory.createLabel(browseModelComposite, "Path to uncertainty template:        ");
		pathToUncertaintyTemplateField = ViewFactory.createText(browseModelComposite, defaultUncertaintyTemplatePath, 2);


		Button loadButton = ViewFactory.createButton(parent, "Load Model");
		loadButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection:
					String path = pathToUncertaintyTemplateField.getText();
					listener.onLoadUncertaintyTemplateButtonClicked(path);

					break;
				}

			}

		});

	}

	@Override
	public void setUncertaintyTemplateViewListerner(IUncertaintyTemplateViewListener listener) {
		this.listener = listener;

	}



}
