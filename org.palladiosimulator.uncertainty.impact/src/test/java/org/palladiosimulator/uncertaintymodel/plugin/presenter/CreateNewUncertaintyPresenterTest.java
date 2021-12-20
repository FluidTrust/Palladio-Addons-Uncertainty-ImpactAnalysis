package org.palladiosimulator.uncertaintymodel.plugin.presenter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.presenter.UncertaintyCreationPresenter;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.view.api.IUncertaintyCreationView;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class CreateNewUncertaintyPresenterTest extends TestBase {

	UncertaintyCreationPresenter cut;
	IPalladioModel palladioModel;
	IUncertaintyTemplateModel uncertaintyTemplateModel;

	@Captor
	ArgumentCaptor<List<UncertaintyTypeViewModel>> uncertaintyTypeViewModelListCaptor;

	@Captor
	ArgumentCaptor<List<PalladioElementViewModel>> palladioElementViewModelListCaptor;

	@Mock
	IUncertaintyCreationView view;

	@BeforeEach
	public void setUp() throws LoadModelFailedException {
		MockitoAnnotations.openMocks(this);
		palladioModel = new PalladioModel();
		palladioModel.loadPalladioModels(palladioModelPaths);
		uncertaintyTemplateModel = new UncertaintyTemplateModel();
		uncertaintyTemplateModel.loadUncertaintyTemplateModel(uncertaintyTemplatePath);

		cut = new UncertaintyCreationPresenter(view, uncertaintyTemplateModel, palladioModel);
	}

	@Test
	public void testNewUncertaintyDialogCreated() {
		cut.newUncertaintyDialogCreated();

		List<UncertaintyType> uncertaintyTypes = uncertaintyTemplateModel.getUncertaintyTypes();

		// Verify if view is called correctly
		verify(view).setUncertaintyTypes(uncertaintyTypeViewModelListCaptor.capture());
		List<UncertaintyTypeViewModel> uncertaintyTypeViewModels = uncertaintyTypeViewModelListCaptor.getValue();

		assertEquals(uncertaintyTypes.size(), uncertaintyTypeViewModels.size());
		for (int i = 0; i < uncertaintyTypes.size(); i++) {
			testUncertaintyTypeEqualsUncertaintyTypeViewModel(uncertaintyTypes.get(i),
					uncertaintyTypeViewModels.get(i));
		}

	}

	@Test
	public void testUncertaintyViewModelSelected_BASIC_COMPONENT_BEHAVIOUR() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_BasicComponentBehaviour", "_G-XpMDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_SUSloH9HEeaHNuq2j06i3A");
		expectedIds.add("_SUXeIH9HEeaHNuq2j06i3A");
		expectedIds.add("_SUYFMH9HEeaHNuq2j06i3A");
		expectedIds.add("_cMUasH9HEeaHNuq2j06i3A");
		expectedIds.add("_cMYFEH9HEeaHNuq2j06i3A");
		expectedIds.add("_naRg4H9HEeaHNuq2j06i3A");
		expectedIds.add("_5F_7wH9HEeaHNuq2j06i3A");
		expectedIds.add("_QEtBQX9KEeaHNuq2j06i3A");
		expectedIds.add("_QEtoUX9KEeaHNuq2j06i3A");
		expectedIds.add("_RJe4AX9KEeaHNuq2j06i3A");
		expectedIds.add("_RJffEn9KEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_BASIC_COMPONENT_TYPE() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_BasicComponentType", "_HOiMIDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_NdX6AH9HEeaHNuq2j06i3A");
		expectedIds.add("_fmYGwH9HEeaHNuq2j06i3A");
		expectedIds.add("_3EW0IH9HEeaHNuq2j06i3A");
		expectedIds.add("_mnCQoH9IEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_COMMUNICATION_COMPONENTS() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_CommunicationComponents", "_JkrkIDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_2y-hgH9NEeaHNuq2j06i3A");
		expectedIds.add("_4GSjgH9NEeaHNuq2j06i3A");
		expectedIds.add("_5GCJQH9NEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_COMMUNICATION_RESOURCES() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_CommunicationResources", "_J3mgIDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_GUwtAH9REeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_COMPONENT_INSTANCE() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_ComponentInstance", "_KH1UgDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_x5MkkH9MEeaHNuq2j06i3A");
		expectedIds.add("_8yiFoH9MEeaHNuq2j06i3A");
		expectedIds.add("_DKoQIH9NEeaHNuq2j06i3A");
		expectedIds.add("_UFP-MH9NEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_COMPONENT_INTERFACE_INSTANCE() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_ComponentInterfaceInstance", "_KZVUMDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		// Assembly Book Shop Web Pages
		expectedIds.add("_x5MkkH9MEeaHNuq2j06i3A$_SUHmgH9HEeaHNuq2j06i3A");
		expectedIds.add("_x5MkkH9MEeaHNuq2j06i3A$_cMTzoH9HEeaHNuq2j06i3A");
		expectedIds.add("_x5MkkH9MEeaHNuq2j06i3A$_QEtvsH9HEeaHNuq2j06i3A");

		// Assembly Book Image Provider
		expectedIds.add("_8yiFoH9MEeaHNuq2j06i3A$_5F_UsH9HEeaHNuq2j06i3A");

		// Assembly BookShop Business Rules
		expectedIds.add("_DKoQIH9NEeaHNuq2j06i3A$_naQ50H9HEeaHNuq2j06i3A");
		expectedIds.add("_DKoQIH9NEeaHNuq2j06i3A$_mM2EcH9HEeaHNuq2j06i3A");
		expectedIds.add("_DKoQIH9NEeaHNuq2j06i3A$_0Kww0H9HEeaHNuq2j06i3A");

		// Assembly Book&Customer Data Provider
		expectedIds.add("_UFP-MH9NEeaHNuq2j06i3A$_QEtBQH9KEeaHNuq2j06i3A");
		expectedIds.add("_UFP-MH9NEeaHNuq2j06i3A$_RJe4AH9KEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_COMPONENT_INTERFACE_TYPE() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_ComponentInterfaceType", "_KppoIDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		// Book Shop Web Pages
		expectedIds.add("_SUHmgH9HEeaHNuq2j06i3A");
		expectedIds.add("_cMTzoH9HEeaHNuq2j06i3A");
		expectedIds.add("_QEtvsH9HEeaHNuq2j06i3A");

		// BookShop Business Rules
		expectedIds.add("_naQ50H9HEeaHNuq2j06i3A");
		expectedIds.add("_mM2EcH9HEeaHNuq2j06i3A");
		expectedIds.add("_0Kww0H9HEeaHNuq2j06i3A");

		// Book Image Provider
		expectedIds.add("_5F_UsH9HEeaHNuq2j06i3A");

		// Book&Customer Data Provider
		expectedIds.add("_QEtBQH9KEeaHNuq2j06i3A");
		expectedIds.add("_RJe4AH9KEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_HARDWARE_RESOURCE() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_HardwareResource", "_K6ybcDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_j4BMAH9QEeaHNuq2j06i3A");
		expectedIds.add("_ln1j0H9QEeaHNuq2j06i3A");
		expectedIds.add("_mtXBcH9QEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_SYSTEM() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_System", "_LIVvQDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_obod8H9MEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_SYSTEM_INTERFACE() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_SystemInterface", "_LWF3YDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_gtkJkH9NEeaHNuq2j06i3A");
		expectedIds.add("_huuEkH9NEeaHNuq2j06i3A");
		expectedIds.add("_kXMisH9NEeaHNuq2j06i3A");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_USAGE_BEHAVIOUR() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton(
				"Assignable_to_UsageBehaviour", "_MYM0oDvjEeyKcZ3NE6_IOQ");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view).setAssignablePalladioElements(palladioElementViewModelListCaptor.capture());
		List<PalladioElementViewModel> palladioElementViewModels = palladioElementViewModelListCaptor.getValue();

		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_ypeqoH9PEeaHNuq2j06i3A");
		expectedIds.add("_84WSYH9PEeaHNuq2j06i3A");
		expectedIds.add("_EPsTYH9QEeaHNuq2j06i3A");
		expectedIds.add("_pP79UDvVEeyeJrtFy53-cg");
		expectedIds.add("_t-578DvXEeyeJrtFy53-cg");
		expectedIds.add("_jAJIUDvXEeyeJrtFy53-cg");

		assertAllElementsFound(palladioElementViewModels, expectedIds);

	}

	@Test
	public void testUncertaintyViewModelSelected_Invalid() {

		UncertaintyTypeViewModel uncertaintyTypeViewModel = createUncertaintyTypeViewModelSkeleton("Invalid",
				"InvalidId");

		cut.uncertaintyViewModelSelected(uncertaintyTypeViewModel);

		verify(view, times(1)).showMessage("Uncertainty Type with name (id) Invalid (InvalidId) not found.");
		verify(view, never()).setAssignablePalladioElements(any());
	}

	private void assertAllElementsFound(List<PalladioElementViewModel> palladioElementViewModels,
			List<String> expectedElementIds) {
		assertNotNull(palladioElementViewModels);
		assertNotNull(expectedElementIds);
		List<String> actualElementIds = palladioElementViewModels.stream().map(PalladioElementViewModel::getId)
				.collect(Collectors.toList());

		assertEquals(expectedElementIds.size(), actualElementIds.size());

		for (String expectedId : expectedElementIds) {
			assertTrue(actualElementIds.contains(expectedId));
		}

	}

}
