package org.palladiosimulator.uncertaintymodel.plugin.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class PalladioModelTest extends TestBase {

	PalladioModel cut;

	@BeforeEach
	public void init() throws LoadModelFailedException {
		cut = new PalladioModel();
		cut.loadPalladioModels(palladioModelPaths);
	}

	@Test
	public void testIsInitialized() {
		// true as loadPalladioModels performed in init()
		assertTrue(cut.isInitialized());
	}

	@Test
	public void testGetElementWithInvalidIdThrowsError() {
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getBasicComponentBehaviourEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getBasicComponentTypeEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getCommunicationComponentEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getCommunicationResourceEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getComponentInstanceEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class,
				() -> cut.getComponentInterfaceInstanceEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getComponentInterfaceTypeEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getHardwareResourceEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getSystemEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getSystemInterfaceEntityById("invalid"));
		assertThrows(PalladioElementNotFoundException.class, () -> cut.getUsageBehaviourEntityById("invalid"));
	}

	@Test
	public void testGetAllBasicComponentBehaviourEntities() throws PalladioElementNotFoundException {

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

		List<BasicComponentBehaviour> allBasicComponentBehaviourEntities = cut.getAllBasicComponentBehaviourEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allBasicComponentBehaviourEntities);
	}

	@Test
	public void testGetBasicComponentBehaviourEntityById() throws PalladioElementNotFoundException {
		BasicComponentBehaviour basicComponentBehaviour = cut
				.getBasicComponentBehaviourEntityById("_SUSloH9HEeaHNuq2j06i3A");
		assertNotNull(basicComponentBehaviour);
		assertEquals("home - Book Shop Web Pages", basicComponentBehaviour.getEntityName());

	}

	@Test
	public void testGetAllBasicComponentTypeEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_NdX6AH9HEeaHNuq2j06i3A");
		expectedIds.add("_fmYGwH9HEeaHNuq2j06i3A");
		expectedIds.add("_3EW0IH9HEeaHNuq2j06i3A");
		expectedIds.add("_mnCQoH9IEeaHNuq2j06i3A");

		List<BasicComponent> allBasicComponentEntities = cut.getAllBasicComponentTypeEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allBasicComponentEntities);
	}

	@Test
	public void testGetBasicComponentTypeEntityById() throws PalladioElementNotFoundException {

		BasicComponent basicComponent = cut.getBasicComponentTypeEntityById("_NdX6AH9HEeaHNuq2j06i3A");
		assertNotNull(basicComponent);
		assertEquals("Book Shop Web Pages", basicComponent.getEntityName());
	}

	@Test
	public void testGetAllCommunicationComponentEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_2y-hgH9NEeaHNuq2j06i3A");
		expectedIds.add("_4GSjgH9NEeaHNuq2j06i3A");
		expectedIds.add("_5GCJQH9NEeaHNuq2j06i3A");

		List<AssemblyConnector> allAssemblyConnectors = cut.getAllCommunicationComponentEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allAssemblyConnectors);
	}

	@Test
	public void testGetCommunicationComponentEntityById() throws PalladioElementNotFoundException {
		AssemblyConnector communicationComponent = cut.getCommunicationComponentEntityById("_2y-hgH9NEeaHNuq2j06i3A");
		assertNotNull(communicationComponent);
		assertEquals("IBusinessConnector", communicationComponent.getEntityName());
	}

	@Test
	public void testGetAllCommunicationResourceEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_GUwtAH9REeaHNuq2j06i3A");

		List<LinkingResource> allCommunicationResources = cut.getAllCommunicationResourceEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allCommunicationResources);
	}

	@Test
	public void testGetCommunicationResourceEntityById() throws PalladioElementNotFoundException {
		LinkingResource communicationResource = cut.getCommunicationResourceEntityById("_GUwtAH9REeaHNuq2j06i3A");
		assertNotNull(communicationResource);
		assertEquals("LAN", communicationResource.getEntityName());
	}

	@Test
	public void testGetAllComponentInstanceEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_x5MkkH9MEeaHNuq2j06i3A");
		expectedIds.add("_8yiFoH9MEeaHNuq2j06i3A");
		expectedIds.add("_DKoQIH9NEeaHNuq2j06i3A");
		expectedIds.add("_UFP-MH9NEeaHNuq2j06i3A");

		List<AssemblyContext> allComponentInstanceEntities = cut.getAllComponentInstanceEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allComponentInstanceEntities);
	}

	@Test
	public void testGetComponentInstanceEntityById() throws PalladioElementNotFoundException {
		AssemblyContext componentInstanceEntities = cut.getComponentInstanceEntityById("_x5MkkH9MEeaHNuq2j06i3A");
		assertNotNull(componentInstanceEntities);
		assertEquals("Assembly_Book Shop Web Pages <Book Shop Web Pages>", componentInstanceEntities.getEntityName());
	}

	@Test
	public void testGetAllComponentInterfaceInstanceEntities() throws PalladioElementNotFoundException {
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

		List<ComponentInterfaceInstance> allComponentInterfaceInstanceEntities = cut
				.getAllComponentInterfaceInstanceEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allComponentInterfaceInstanceEntities);
	}

	@Test
	public void testGetComponentInterfaceInstanceEntityById() throws PalladioElementNotFoundException {
		ComponentInterfaceInstance componentInterfaceInstance = cut
				.getComponentInterfaceInstanceEntityById("_x5MkkH9MEeaHNuq2j06i3A$_SUHmgH9HEeaHNuq2j06i3A");
		                                                 
		assertNotNull(componentInterfaceInstance);
		assertEquals("Assembly_Book Shop Web Pages <Book Shop Web Pages> - IBrowseBooks",
				componentInterfaceInstance.getEntityName());
	}

	@Test
	public void testGetAllComponentInterfaceTypeEntities() throws PalladioElementNotFoundException {
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

		List<Role> allComponentInterfaceTypeEntities = cut.getAllComponentInterfaceTypeEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allComponentInterfaceTypeEntities);
	}

	@Test
	public void testGetComponentInterfaceTypeEntityById() throws PalladioElementNotFoundException {
		Role componentInterfaceType = cut.getComponentInterfaceTypeEntityById("_SUHmgH9HEeaHNuq2j06i3A");
		assertNotNull(componentInterfaceType);
		assertEquals("IBrowseBooks", componentInterfaceType.getEntityName());
	}

	@Test
	public void testGetAllHardwareResourceEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_j4BMAH9QEeaHNuq2j06i3A");
		expectedIds.add("_ln1j0H9QEeaHNuq2j06i3A");
		expectedIds.add("_mtXBcH9QEeaHNuq2j06i3A");

		List<ResourceContainer> allHardwareResourceEntities = cut.getAllHardwareResourceEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allHardwareResourceEntities);
	}

	@Test
	public void testGetHardwareResourceEntityById() throws PalladioElementNotFoundException {
		ResourceContainer hardwareResource = cut.getHardwareResourceEntityById("_j4BMAH9QEeaHNuq2j06i3A");
		assertNotNull(hardwareResource);
		assertEquals("Web & Application Server", hardwareResource.getEntityName());
	}

	@Test
	public void testGetAllSystemEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_obod8H9MEeaHNuq2j06i3A");

		List<org.palladiosimulator.pcm.system.System> allSystemEntities = cut.getAllSystemEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allSystemEntities);
	}

	@Test
	public void testGetSystemEntityById() throws PalladioElementNotFoundException {
		org.palladiosimulator.pcm.system.System system = cut.getSystemEntityById("_obod8H9MEeaHNuq2j06i3A");
		assertNotNull(system);
		assertEquals("Book Shop System", system.getEntityName());
	}

	@Test
	public void testGetAllSystemInterfaceEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_gtkJkH9NEeaHNuq2j06i3A");
		expectedIds.add("_huuEkH9NEeaHNuq2j06i3A");
		expectedIds.add("_kXMisH9NEeaHNuq2j06i3A");

		List<Role> allSystemInterfaceEntities = cut.getAllSystemInterfaceEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allSystemInterfaceEntities);
	}

	@Test
	public void testGetSystemInterfaceEntityById() throws PalladioElementNotFoundException {
		Role systemInterface = cut.getSystemInterfaceEntityById("_gtkJkH9NEeaHNuq2j06i3A");
		assertNotNull(systemInterface);
		assertEquals("IBrowseBooks", systemInterface.getEntityName());
	}

	@Test
	public void testGetAllUsageBehaviourEntities() throws PalladioElementNotFoundException {
		List<String> expectedIds = new ArrayList<>();
		expectedIds.add("_ypeqoH9PEeaHNuq2j06i3A");
		expectedIds.add("_84WSYH9PEeaHNuq2j06i3A");
		expectedIds.add("_EPsTYH9QEeaHNuq2j06i3A");
		expectedIds.add("_pP79UDvVEeyeJrtFy53-cg");
		expectedIds.add("_t-578DvXEeyeJrtFy53-cg");
		expectedIds.add("_jAJIUDvXEeyeJrtFy53-cg");

		List<EntryLevelSystemCall> allUsageBehaviourEntities = cut.getAllUsageBehaviourEntities();
		assertCorrectEntitiesAreReturned(expectedIds, allUsageBehaviourEntities);
	}

	@Test
	public void testGetUsageBehaviourEntityById() throws PalladioElementNotFoundException {
		EntryLevelSystemCall usageBehaviour = cut.getUsageBehaviourEntityById("_ypeqoH9PEeaHNuq2j06i3A");
		assertNotNull(usageBehaviour);
		assertEquals("Browse Books", usageBehaviour.getEntityName());
	}

	private void assertCorrectEntitiesAreReturned(List<String> expectedIds, List<? extends Entity> entities) {
		assertNotNull(expectedIds);
		assertNotNull(entities);

		List<String> actualIds = entities.stream().map(x -> x.getId()).collect(Collectors.toList());

		assertEquals(expectedIds.size(), entities.size());

		for (String expectedId : expectedIds) {
			assertTrue(actualIds.contains(expectedId));
		}

	}

}
