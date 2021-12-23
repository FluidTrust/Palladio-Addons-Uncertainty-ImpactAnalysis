package org.palladiosimulator.uncertaintymodel.plugin.presenter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.presenter.UncertaintyTemplatePresenter;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadUncertaintyTemplateModelView;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class UncertaintyTemplatePresenterTest extends TestBase {

	UncertaintyTemplatePresenter cut;
	IUncertaintyTemplateModel uncertaintyTemplateModel;

	@Mock
	ILoadUncertaintyTemplateModelView view;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		// Not initialized
		uncertaintyTemplateModel = new UncertaintyTemplateModel();

		cut = new UncertaintyTemplatePresenter(view, uncertaintyTemplateModel);
	}

	@Test
	public void testOnLoadUncertaintyTemplateButtonClicked() {
		cut.onLoadUncertaintyTemplateButtonClicked(uncertaintyTemplatePath);
		assertTrue(uncertaintyTemplateModel.isInitialized());
		verify(view, times(1)).showMessage("Uncertainty template model successfully loaded");
	}

	@Test
	public void testOnLoadUncertaintyTemplateButtonClicked_NotSuccessfull() {
		cut.onLoadUncertaintyTemplateButtonClicked("invalidPath");
		assertFalse(uncertaintyTemplateModel.isInitialized());
		verify(view, times(1)).showMessage("Error while loading uncertainty template model. Error message = "
				+ "Load resource with path '/resource/org.palladiosimulator.uncertainty.impact/invalidPath' failed.");

		cut.onLoadUncertaintyTemplateButtonClicked("  "); // Another error message with blank
		assertFalse(uncertaintyTemplateModel.isInitialized());
		verify(view, times(1)).showMessage("Please provide valid path to uncertainty template");

	}

}
