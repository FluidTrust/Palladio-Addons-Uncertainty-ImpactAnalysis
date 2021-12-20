package org.palladiosimulator.uncertainty.impact.propagation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class UCImpactPropagationAnalysisInitializerTest extends TestBase {

	@BeforeEach
	public void init() {
		cleanTestData();

	}

	@Test
	public void testPropagationInitialization()
			throws LoadModelFailedException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, InitializePropagationException {

		PalladioModel palladioModel = getInitializedPalladioModel();

		// Empty version (only intialized with palladio models)
		UCArchitectureVersion version = UCArchitectureVersionFacade.createEmptyModel("test",
				palladioModel.getRepository(), palladioModel.getSystem(), palladioModel.getAllocation(),
				palladioModel.getResourceEnvironment(), palladioModel.getUsageModel());

		// Add Uncertainty to each element
		Uncertainty uncertainty_at_system = createUncertainty_Book_Store_at_system();
		Uncertainty uncertainty_at_hardware_resource = createUncertainty_Book_Store_at_hardware_resource();
		Uncertainty uncertainty_at_basic_component_type = createUncertainty_Book_Store_at_basic_component_type();
		Uncertainty uncertainty_at_component_instance = createUncertainty_Book_Store_at_component_instance();
		Uncertainty uncertainty_at_basic_component_behaviour = createUncertainty_Book_Store_at_basic_component_behaviour();
		Uncertainty uncertainty_at_communication_component = createUncertainty_Book_Store_at_communication_component();
		Uncertainty uncertainty_at_communication_resource = createUncertainty_Book_Store_at_communication_resource();
		Uncertainty uncertainty_at_system_interface = createUncertainty_Book_Store_at_system_interface();
		Uncertainty uncertainty_at_component_interface_instance = createUncertainty_Book_Store_at_component_interface_instance();
		Uncertainty uncertainty_at_component_interface_type = createUncertainty_Book_Store_at_component_interface_type();
		Uncertainty uncertainty_at_usage_behaviour = createUncertainty_Book_Store_at_usage_behaviour();

		// Add different uncertainty two same element -> force merge mechanism
		Uncertainty uncertainty_at_system_2 = createUncertainty_Book_Store_at_system();

		// Be aware that uncertainty_at_system, uncertainty_at_system_2 is both added
		List<Uncertainty> uncertainties = List.of(uncertainty_at_system, uncertainty_at_system_2,
				uncertainty_at_hardware_resource, uncertainty_at_basic_component_type,
				uncertainty_at_component_instance, uncertainty_at_basic_component_behaviour,
				uncertainty_at_communication_component, uncertainty_at_communication_resource,
				uncertainty_at_system_interface, uncertainty_at_component_interface_instance,
				uncertainty_at_component_interface_type, uncertainty_at_usage_behaviour);

		// Execute test
		UCArchitectureVersion initializedVersion = UCImpactPropagationAnalysisInitializer
				.addUncertaintyImpactEntitiesToArchitectureVersion(version, uncertainties);

		assertNotNull(initializedVersion.getModificationMarkRepository());

		UCPropagationRulesSeed initializedRulesSeed = initializedVersion.getModificationMarkRepository()
				.getSeedModifications();

		assertNotNull(initializedRulesSeed);

		assertEquals(1, initializedRulesSeed.getAffectedSystems().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedSystems().get(0),
				uncertainty_at_system.getAssignedElement().getReferencedElement(), uncertainty_at_system,
				uncertainty_at_system_2);

		assertEquals(1, initializedRulesSeed.getAffectedHardwareResources().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedHardwareResources().get(0),
				uncertainty_at_hardware_resource.getAssignedElement().getReferencedElement(),
				uncertainty_at_hardware_resource);

		assertEquals(1, initializedRulesSeed.getAffectedBasicComponentTypes().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedBasicComponentTypes().get(0),
				uncertainty_at_basic_component_type.getAssignedElement().getReferencedElement(),
				uncertainty_at_basic_component_type);

		assertEquals(1, initializedRulesSeed.getAffectedComponentInstances().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedComponentInstances().get(0),
				uncertainty_at_component_instance.getAssignedElement().getReferencedElement(),
				uncertainty_at_component_instance);

		assertEquals(1, initializedRulesSeed.getAffectedBasicComponentBehaviours().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedBasicComponentBehaviours().get(0),
				uncertainty_at_basic_component_behaviour.getAssignedElement().getReferencedElement(),
				uncertainty_at_basic_component_behaviour);

		assertEquals(1, initializedRulesSeed.getAffectedCommunicationComponents().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedCommunicationComponents().get(0),
				uncertainty_at_communication_component.getAssignedElement().getReferencedElement(),
				uncertainty_at_communication_component);

		assertEquals(1, initializedRulesSeed.getAffectedCommunicationResources().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedCommunicationResources().get(0),
				uncertainty_at_communication_resource.getAssignedElement().getReferencedElement(),
				uncertainty_at_communication_resource);

		assertEquals(1, initializedRulesSeed.getAffectedSystemInterfaces().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedSystemInterfaces().get(0),
				uncertainty_at_system_interface.getAssignedElement().getReferencedElement(),
				uncertainty_at_system_interface);

		assertEquals(1, initializedRulesSeed.getAffectedComponentInterfaceInstances().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedComponentInterfaceInstances().get(0),
				uncertainty_at_component_interface_instance.getAssignedElement().getReferencedElement(),
				uncertainty_at_component_interface_instance);

		assertEquals(1, initializedRulesSeed.getAffectedComponentInterfaceTypes().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedComponentInterfaceTypes().get(0),
				uncertainty_at_component_interface_type.getAssignedElement().getReferencedElement(),
				uncertainty_at_component_interface_type);

		assertEquals(1, initializedRulesSeed.getAffectedUsageBehaviours().size());
		testUCImpactEntity(initializedRulesSeed.getAffectedUsageBehaviours().get(0),
				uncertainty_at_usage_behaviour.getAssignedElement().getReferencedElement(),
				uncertainty_at_usage_behaviour);

	}

	@Test
	public void testPropagationInitialization_Throws_Error()
			throws LoadModelFailedException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, InitializePropagationException {

		PalladioModel palladioModel = getInitializedPalladioModel();

		// Empty version (only intialized with palladio models)
		UCArchitectureVersion version = UCArchitectureVersionFacade.createEmptyModel("test",
				palladioModel.getRepository(), palladioModel.getSystem(), palladioModel.getAllocation(),
				palladioModel.getResourceEnvironment(), palladioModel.getUsageModel());

		// Add Uncertainty to each element
		Uncertainty uncertainty_invalid = createUncertainty_Book_Store_Invalid_Mapping();

		// Be aware that uncertainty_at_system, uncertainty_at_system_2 is both added
		List<Uncertainty> uncertainties = List.of(uncertainty_invalid);

		// Execute test
		assertThrows(InitializePropagationException.class, () ->
			UCImpactPropagationAnalysisInitializer
			.addUncertaintyImpactEntitiesToArchitectureVersion(version, uncertainties)
		);

		

	}

	private <T extends UCImpactEntity<?>, S extends Entity> void testUCImpactEntity(T entity, S expectedAffectedElement,
			Uncertainty... expectedUncertainties) {
		assertNotNull(entity);
		Entity affectedElement = entity.getAffectedElement();

		// check if affected element is the same
		testEntityEqualsEntity(expectedAffectedElement, affectedElement);

		// Check that path was not set
		entity.getCausingElements().forEach(x -> 
			assertEquals(0, x.getPath().size())
		);

		// Extract actual uncertainties
		List<Uncertainty> uncertainties = entity.getCausingElements().stream().map(CausingUncertainty::getCausingUncertainty)
				.collect(Collectors.toList());
		assertEquals(expectedUncertainties.length, uncertainties.size());

		// Test if uncertainties are the same (Be aware of the order!)
		for (int i = 0; i < uncertainties.size(); i++) {
			testUncertaintyEqualsUncertainty(expectedUncertainties[i], uncertainties.get(i));
		}

	}

}
