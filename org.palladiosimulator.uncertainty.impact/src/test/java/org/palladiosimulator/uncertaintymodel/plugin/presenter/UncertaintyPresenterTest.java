package org.palladiosimulator.uncertaintymodel.plugin.presenter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.PLUGIN_URI_PREFIX;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.persistence.EMFPersistenceHelper;
import org.palladiosimulator.uncertainty.impact.presenter.UncertaintyPresenter;
import org.palladiosimulator.uncertainty.impact.presenter.util.ModelToViewModelConverter;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer;
import org.palladiosimulator.uncertainty.impact.view.api.IUncertaintyView;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class UncertaintyPresenterTest extends TestBase {

	UncertaintyPresenter cut;
	IUncertaintyModel uncertaintyModel;
	IPalladioModel palladioModel;
	IUncertaintyTemplateModel uncertaintyTemplateModel;

	@Mock
	IUncertaintyView view;

	@Captor
	ArgumentCaptor<List<UncertaintyViewModel>> uncertaintyViewModelListCaptor;

	@Captor
	ArgumentCaptor<UncertaintyViewModel> uncertaintyViewModelCaptor;

	@BeforeEach
	public void setUp()  {
		MockitoAnnotations.openMocks(this);
		// Not initialized
		uncertaintyModel = new UncertaintyModel();
		palladioModel = new PalladioModel();
		uncertaintyTemplateModel = new UncertaintyTemplateModel();

		cut = new UncertaintyPresenter(view, uncertaintyModel, uncertaintyTemplateModel, palladioModel);
	}

	@Test
	public void testOnAddUncertaintyButtonClicked_BasicComponent()
			throws LoadModelFailedException, UncertaintyTemplateElementNotFoundException {
		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Load and assert test data
		cut.onLoadExistingModelButtonClicked(uncertaintyPath);
		List<Uncertainty> uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(1, uncertainties.size());
		Uncertainty uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// Init uncertainty to be added
		UncertaintyTypeViewModel uncertaintyTypeViewModel = ModelToViewModelConverter
				.convertUncertaintyTypeToUncertaintyTypeViewModel(
						uncertaintyTemplateModel.getUncertaintyTypeById("_HOiMIDvjEeyKcZ3NE6_IOQ"));
		PalladioElementViewModel palladioElementViewModel = createPalladioElementViewModel("_fmYGwH9HEeaHNuq2j06i3A",
				"Book Shop Business Rules");
		UncertaintyViewModel uncertaintyViewModel = createUncertaintyViewModel("uncertaintyName", null,
				uncertaintyTypeViewModel, palladioElementViewModel);

		// Execute test
		cut.onAddUncertaintyButtonClicked(uncertaintyViewModel);

		uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(2, uncertainties.size());

		// Old uncertainty still available
		uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// Check if uncertainty is created successfully
		uncertainty = uncertainties.get(1);
		String generatedId = uncertainty.getId();
		assertNotNull(generatedId);
		testUncertainty(uncertainty, generatedId, "uncertaintyName", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_fmYGwH9HEeaHNuq2j06i3A", "Book Shop Business Rules");

		// Verify if view is called correctly
		verify(view).addUncertainty(uncertaintyViewModelCaptor.capture());
		uncertaintyViewModel = uncertaintyViewModelCaptor.getValue();
		testUncertaintyEqualsUncertaintyViewModel(uncertainty, uncertaintyViewModel);

	}

	@Test
	public void testOnAddUncertaintyButtonClicked_InterfaceInstance()
			throws LoadModelFailedException, UncertaintyTemplateElementNotFoundException {
		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Load and assert test data
		cut.onLoadExistingModelButtonClicked(uncertaintyPath);
		List<Uncertainty> uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(1, uncertainties.size());
		Uncertainty uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// Init uncertainty to be added
		UncertaintyTypeViewModel uncertaintyTypeViewModel = ModelToViewModelConverter
				.convertUncertaintyTypeToUncertaintyTypeViewModel(
						uncertaintyTemplateModel.getUncertaintyTypeById("_KZVUMDvjEeyKcZ3NE6_IOQ"));
		// Special handling here: elementViewModelID: assemblyId#interfaceId
		PalladioElementViewModel palladioElementViewModel = createPalladioElementViewModel(
				"_x5MkkH9MEeaHNuq2j06i3A$_SUHmgH9HEeaHNuq2j06i3A",
				"Assembly_Book Shop Web Pages <Book Shop Web Pages> - IBrowseBooks");
		UncertaintyViewModel uncertaintyViewModel = createUncertaintyViewModel("uncertaintyName", null,
				uncertaintyTypeViewModel, palladioElementViewModel);

		// Execute test
		cut.onAddUncertaintyButtonClicked(uncertaintyViewModel);

		uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(2, uncertainties.size());

		// Old uncertainty still available
		uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// Check if uncertainty is created successfully
		uncertainty = uncertainties.get(1);
		String generatedId = uncertainty.getId();
		assertNotNull(generatedId);

		testUncertainty(uncertainty, generatedId, "uncertaintyName", "_KZVUMDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_ComponentInterfaceInstance", "_x5MkkH9MEeaHNuq2j06i3A$_SUHmgH9HEeaHNuq2j06i3A",
				"Assembly_Book Shop Web Pages <Book Shop Web Pages> - IBrowseBooks");

		// Verify if view is called correctly
		verify(view).addUncertainty(uncertaintyViewModelCaptor.capture());
		uncertaintyViewModel = uncertaintyViewModelCaptor.getValue();
		testUncertaintyEqualsUncertaintyViewModel(uncertainty, uncertaintyViewModel);

	}

	@Test
	public void testOnAddUncertaintyButtonClicked_ComponentBehaviour()
			throws LoadModelFailedException, UncertaintyTemplateElementNotFoundException {
		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Load and assert test data
		cut.onLoadExistingModelButtonClicked(uncertaintyPath);
		List<Uncertainty> uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(1, uncertainties.size());
		Uncertainty uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// Init uncertainty to be added
		UncertaintyTypeViewModel uncertaintyTypeViewModel = ModelToViewModelConverter
				.convertUncertaintyTypeToUncertaintyTypeViewModel(
						uncertaintyTemplateModel.getUncertaintyTypeById("_G-XpMDvjEeyKcZ3NE6_IOQ"));
		// Special handling here: elementViewModelID: assemblyId#interfaceId
		PalladioElementViewModel palladioElementViewModel = createPalladioElementViewModel("_SUSloH9HEeaHNuq2j06i3A",
				"home");
		UncertaintyViewModel uncertaintyViewModel = createUncertaintyViewModel("uncertaintyName", null,
				uncertaintyTypeViewModel, palladioElementViewModel);

		// Execute test
		cut.onAddUncertaintyButtonClicked(uncertaintyViewModel);

		uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(2, uncertainties.size());

		// Old uncertainty still available
		uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// Check if uncertainty is created successfully
		uncertainty = uncertainties.get(1);
		String generatedId = uncertainty.getId();
		assertNotNull(generatedId);

		testUncertainty(uncertainty, generatedId, "uncertaintyName", "_G-XpMDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentBehaviour", "_SUSloH9HEeaHNuq2j06i3A", "home - Book Shop Web Pages");

		// Verify if view is called correctly
		verify(view).addUncertainty(uncertaintyViewModelCaptor.capture());
		uncertaintyViewModel = uncertaintyViewModelCaptor.getValue();
		testUncertaintyEqualsUncertaintyViewModel(uncertainty, uncertaintyViewModel);

	}

	@Test
	public void testOnRemoveUncertaintyButtonClicked_Successfull() throws LoadModelFailedException {
		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
		uncertaintyModel.loadNewUncertaintyModel(uncertaintyTemplateModel.getTemplateModel());

		Uncertainty uncertainty_1 = createUncertaintyWithDefaultValues("uncertainty_1");
		Uncertainty uncertainty_2 = createUncertaintyWithDefaultValues("uncertainty_2");
		Uncertainty uncertainty_3 = createUncertaintyWithDefaultValues("uncertainty_2");
		uncertaintyModel.addUncertainty(uncertainty_1);
		uncertaintyModel.addUncertainty(uncertainty_2);
		uncertaintyModel.addUncertainty(uncertainty_3);
		assertEquals(3, uncertaintyModel.getUncertainties().size());

		UncertaintyViewModel uncertaintyViewModel_1 = ModelToViewModelConverter
				.convertUncertaintyToUncertaintyViewModel(uncertainty_1);

		UncertaintyViewModel uncertaintyViewModel_3 = ModelToViewModelConverter
				.convertUncertaintyToUncertaintyViewModel(uncertainty_3);

		List<UncertaintyViewModel> uncertaintiesToBeRemoved = List.of(uncertaintyViewModel_1, uncertaintyViewModel_3);

		// Execute test
		cut.onRemoveUncertaintyButtonClicked(uncertaintiesToBeRemoved);

		// assert one uncertainty is remaining
		List<Uncertainty> remainingUncertainties = uncertaintyModel.getUncertainties();
		assertEquals(1, remainingUncertainties.size());
		Uncertainty remainingUncertainty = remainingUncertainties.get(0);
		assertEquals(uncertainty_2.getId(), remainingUncertainty.getId());
		assertEquals(uncertainty_2.getName(), remainingUncertainty.getName());

		// Verify if view is called correctly
		verify(view).removeUncertainties(uncertaintyViewModelListCaptor.capture());
		List<UncertaintyViewModel> removedUncertaintyViewModels = uncertaintyViewModelListCaptor.getValue();
		assertEquals(2, removedUncertaintyViewModels.size());
		testUncertaintyEqualsUncertaintyViewModel(uncertainty_1, removedUncertaintyViewModels.get(0));
		testUncertaintyEqualsUncertaintyViewModel(uncertainty_3, removedUncertaintyViewModels.get(1));
		verify(view, times(1)).showMessage("Removing uncertainties was successfull.");

	}

	@Test
	public void testOnRemoveUncertaintyButtonClicked_NotSuccessfull() throws LoadModelFailedException {
		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
		uncertaintyModel.loadNewUncertaintyModel(uncertaintyTemplateModel.getTemplateModel());

		Uncertainty uncertainty_1 = createUncertaintyWithDefaultValues("uncertainty_1");
		Uncertainty uncertainty_2 = createUncertaintyWithDefaultValues("uncertainty_2");
		Uncertainty uncertainty_3 = createUncertaintyWithDefaultValues("uncertainty_2");
		uncertaintyModel.addUncertainty(uncertainty_1);
		uncertaintyModel.addUncertainty(uncertainty_2);
		uncertaintyModel.addUncertainty(uncertainty_3);
		assertEquals(3, uncertaintyModel.getUncertainties().size());

		UncertaintyViewModel uncertaintyViewModel_1 = ModelToViewModelConverter
				.convertUncertaintyToUncertaintyViewModel(uncertainty_1);
		UncertaintyViewModel uncertaintyViewModel_2 = createUncertaintyViewModel("invalid", "invalidId", null, null);
		UncertaintyViewModel uncertaintyViewModel_3 = ModelToViewModelConverter
				.convertUncertaintyToUncertaintyViewModel(uncertainty_3);

		List<UncertaintyViewModel> uncertaintiesToBeRemoved = List.of(uncertaintyViewModel_1, uncertaintyViewModel_2,
				uncertaintyViewModel_3);

		// Execute test
		cut.onRemoveUncertaintyButtonClicked(uncertaintiesToBeRemoved);

		// assert one uncertainty is remaining
		List<Uncertainty> remainingUncertainties = uncertaintyModel.getUncertainties();
		assertEquals(1, remainingUncertainties.size());
		Uncertainty remainingUncertainty = remainingUncertainties.get(0);
		assertEquals(uncertainty_2.getId(), remainingUncertainty.getId());
		assertEquals(uncertainty_2.getName(), remainingUncertainty.getName());

		// Verify if view is called correctly
		verify(view).removeUncertainties(uncertaintyViewModelListCaptor.capture());
		List<UncertaintyViewModel> removedUncertaintyViewModels = uncertaintyViewModelListCaptor.getValue();
		assertEquals(2, removedUncertaintyViewModels.size());
		testUncertaintyEqualsUncertaintyViewModel(uncertainty_1, removedUncertaintyViewModels.get(0));
		testUncertaintyEqualsUncertaintyViewModel(uncertainty_3, removedUncertaintyViewModels.get(1));

		verify(view, times(1)).showMessage("Following uncertanties could not be removed: invalid (invalidId)");

	}

	@Test
	public void testOnLoadExistingModelButtonClicked() throws LoadModelFailedException {

		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Execute test
		cut.onLoadExistingModelButtonClicked(uncertaintyPath);

		// Assert test data is loaded
		List<Uncertainty> uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(1, uncertainties.size());
		Uncertainty uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// assert view is called correctly
		verify(view).reloadUncertainties(uncertaintyViewModelListCaptor.capture());
		List<UncertaintyViewModel> uncertaintyViewModels = uncertaintyViewModelListCaptor.getValue();
		assertNotNull(uncertaintyViewModels);
		assertEquals(1, uncertaintyViewModels.size());
		UncertaintyViewModel uncertaintyViewModel = uncertaintyViewModels.get(0);

		testUncertaintyEqualsUncertaintyViewModel(uncertainty, uncertaintyViewModel);

	}

	@Test
	public void testOnLoadExistingModelButtonClicked_Template_not_initialized_PalladioModel_initialized()
			throws LoadModelFailedException {
		// init palladio model (template model not initialized)
		palladioModel.loadPalladioModels(palladioModelPaths);

		// Execute test
		cut.onLoadExistingModelButtonClicked(uncertaintyPath);

		verify(view, times(1)).showMessage("Please load Uncertainty Template first!");
		verify(view, never()).reloadUncertainties(any());
	}

	@Test
	public void testOnLoadExistingModelButtonClicked_Template_initialized_PalladioModel_not_initialized()
			throws LoadModelFailedException {
		// init template model (palladio model not initialized)
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Execute test
		cut.onLoadExistingModelButtonClicked(uncertaintyPath);

		verify(view, times(1)).showMessage("Please load Palladio models first!");
		verify(view, never()).reloadUncertainties(any());
	}

	@Test
	public void testOnLoadExistingModelButtonClicked_Template_initialized_PalladioModel_initialized_InvalidPath()
			throws LoadModelFailedException {

		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Execute test
		cut.onLoadExistingModelButtonClicked("invalidPath");

		// Assert no model loaded
		assertFalse(uncertaintyModel.isInitialized());

		// assert view is called correctly
		verify(view, never()).reloadUncertainties(any());
		verify(view, times(1)).showMessage(
				"Error while loading uncertainty model. Error message = Load resource with path '/resource/org.palladiosimulator.uncertainty.impact/invalidPath' failed.");

		// Execute test
		cut.onLoadExistingModelButtonClicked("  ");// blank is also invalid

		// Assert no model loaded
		assertFalse(uncertaintyModel.isInitialized());

		// assert view is called correctly
		verify(view, never()).reloadUncertainties(any());
		verify(view, times(1)).showMessage("Please provide vaild path to existing uncertainty model");

	}

	@Test
	public void testOnCreateNewUncertaintyModelButtonClicked() throws LoadModelFailedException {
		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Load data before to check if new model is actually created
		cut.onLoadExistingModelButtonClicked(uncertaintyPath);

		// Assert test data is loaded
		List<Uncertainty> uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(1, uncertainties.size());
		Uncertainty uncertainty = uncertainties.get(0);
		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// execute test
		cut.onCreateNewUncertaintyModelButtonClicked();

		// Assert uncertaintyModel is empty
		uncertainties = uncertaintyModel.getUncertainties();
		assertEquals(0, uncertainties.size());

		verify(view, times(1)).showMessage("New model created!");
		verify(view, times(1)).reloadUncertainties(Collections.emptyList());

	}

	@Test
	public void testOnCreateNewUncertaintyModelButtonClicked_Template_not_initialized_PalladioModel_initialized()
			throws LoadModelFailedException {
		// init palladio model (template model not initialized)
		palladioModel.loadPalladioModels(palladioModelPaths);

		// Execute test
		cut.onCreateNewUncertaintyModelButtonClicked();

		verify(view, times(1)).showMessage("Please load Uncertainty Template first!");
		verify(view, never()).reloadUncertainties(any());
	}

	@Test
	public void testOnCreateNewUncertaintyModelButtonClicked_Template_initialized_PalladioModel_not_initialized()
			throws LoadModelFailedException {
		// init template model (palladio model not initialized)
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Execute test
		cut.onCreateNewUncertaintyModelButtonClicked();

		verify(view, times(1)).showMessage("Please load Palladio models first!");
		verify(view, never()).reloadUncertainties(any());
	}

	@Test
	public void testOnSaveUncertaintyModelButtonClicked() throws LoadModelFailedException {

		cleanTestData();

		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
		uncertaintyModel.loadUncertaintyModel(uncertaintyPath);

		String modelSavePath = testDataPath + "temp.uncertainty";

		// Execute test -> Save model to different location
		cut.onSaveUncertaintyModelButtonClicked(modelSavePath);

		// assert view is called correctly
		verify(view).showMessage("Save uncertainty model successful!");

		/* Load saved model again (UncertaintyContainer is EMF representation for
		* UncertaintyModel)
		*/
		UncertaintyContainer uncertaintyModelAfterSave = EMFPersistenceHelper.loadEmfModelFromFile(
				PLUGIN_URI_PREFIX + modelSavePath, null, new ResourceSetImpl(), UncertaintyContainer.class);

		List<Uncertainty> uncertainties = uncertaintyModelAfterSave.getUncertainties();

		assertEquals(1, uncertainties.size());

		testUncertainty(uncertainties.get(0), "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

	}
	
	@Test
	public void testOnSaveUncertaintyModelButtonClicked_InvalidPath() throws LoadModelFailedException {

		cleanTestData();

		// init models
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
		uncertaintyModel.loadUncertaintyModel(uncertaintyPath);

		String modelSavePath = "invalid";

		// Execute test -> Save model to different location
		cut.onSaveUncertaintyModelButtonClicked(modelSavePath);

		// assert view is called correctly
		verify(view).showMessage("Error while saving model. Error Message: Invalid path provided!");
		
	}

	@Test
	public void testOnSaveUncertaintyModelButtonClicked_Template_not_initialized_PalladioModel_initialized()
			throws LoadModelFailedException {
		// init palladio model (template model not initialized)
		palladioModel.loadPalladioModels(palladioModelPaths);

		// Execute test
		cut.onSaveUncertaintyModelButtonClicked("");

		verify(view, times(1)).showMessage("Please load Uncertainty Template first!");
		verify(view, never()).reloadUncertainties(any());
	}

	@Test
	public void testOnSaveUncertaintyModelButtonClicked_Template_initialized_PalladioModel_not_initialized()
			throws LoadModelFailedException {
		// init template model (palladio model not initialized)
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		// Execute test
		cut.onSaveUncertaintyModelButtonClicked("");

		verify(view, times(1)).showMessage("Please load Palladio models first!");
		verify(view, never()).reloadUncertainties(any());
	}

}
