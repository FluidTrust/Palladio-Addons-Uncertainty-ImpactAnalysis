package org.palladiosimulator.uncertaintymodel.plugin.presenter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.presenter.PalladioPresenter;
import org.palladiosimulator.uncertainty.impact.view.api.ILoadPalladioModelsView;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class PalladioPresenterTest extends TestBase {

	PalladioPresenter cut;
	IPalladioModel palladioModel;

	@Mock
	ILoadPalladioModelsView view;

	@BeforeEach
	public void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
		// Not initialized
		palladioModel = new PalladioModel();

		cut = new PalladioPresenter(view, palladioModel);
	}

	@Test
	public void testOnLoadPalladioModelsButtonClicked_Successfull() throws PalladioElementNotFoundException {

		cut.onLoadPalladioModelsButtonClicked(palladioModelPaths);
		assertTrue(palladioModel.isInitialized());
		assertFalse(palladioModel.getAllBasicComponentTypeEntities().isEmpty());
		verify(view, times(1)).showMessage("Palladio models succesfully loaded");

	}

	@Test
	public void testOnLoadPalladioModelsButtonClicked_WithInvalidModelPaths() throws PalladioElementNotFoundException {
		// Null test
		cut.onLoadPalladioModelsButtonClicked(null);
		assertFalse(palladioModel.isInitialized());
		assertThrows(PalladioElementNotFoundException.class, () -> palladioModel.getAllBasicComponentTypeEntities() );
		verify(view, times(1)).showMessage("Cannot initialize Palladio model. Following models are missing: .system,"
				+ " .repository, .resourceenvironment, .allocation, .usagemodel");

		// Test model paths are missing
		List<String> modelPaths = new ArrayList<>();
		modelPaths.add(repositoryPath);
		modelPaths.add(resourceEnvPath);
		modelPaths.add(systemPath);

		cut.onLoadPalladioModelsButtonClicked(modelPaths);
		assertFalse(palladioModel.isInitialized());
		assertThrows(PalladioElementNotFoundException.class, () -> palladioModel.getAllBasicComponentTypeEntities() );
		verify(view, times(1)).showMessage(
				"Cannot initialize Palladio model. Following models are missing: .allocation, .usagemodel");

		// Test all paths provided but one is invalid
		modelPaths.clear();
		modelPaths.add(repositoryPath);
		modelPaths.add(resourceEnvPath);
		modelPaths.add(systemPath);
		modelPaths.add(usageModelPath);
		modelPaths.add("invalid.allocation");

		cut.onLoadPalladioModelsButtonClicked(modelPaths);
		assertFalse(palladioModel.isInitialized());
		assertThrows(PalladioElementNotFoundException.class, () -> palladioModel.getAllBasicComponentTypeEntities() );
		verify(view, times(1)).showMessage(
				"Error while loading models. Error message = Load resource with path '/resource/org.palladiosimulator.uncertainty.impact/invalid.allocation' failed.");

		verify(view, never()).showMessage("Palladio models succesfully loaded");

	}

}
