package org.palladiosimulator.uncertainty.impact.propagation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationFactory;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class UCImpactPropagationAnalysisTest extends TestBase {
	/**
	 * // Add Uncertainty to each element Uncertainty
	 * uncertainty_at_basic_component_behaviour =
	 * createUncertainty_Book_Store_at_basic_component_behaviour(); Uncertainty
	 * uncertainty_at_basic_component_type =
	 * createUncertainty_Book_Store_at_basic_component_type(); Uncertainty
	 * uncertainty_at_communication_component =
	 * createUncertainty_Book_Store_at_communication_component(); Uncertainty
	 * uncertainty_at_hardware_resource =
	 * createUncertainty_Book_Store_at_hardware_resource(); Uncertainty
	 * uncertainty_at_system = createUncertainty_Book_Store_at_system();
	 * 
	 * @throws InitializePropagationException
	 * @throws UncertaintyTemplateElementNotFoundException
	 * @throws PalladioElementNotFoundException
	 * @throws LoadModelFailedException
	 * @throws UncertaintyPropagationException
	 */

	@Test
	public void testPropagation_uncertainty_at_basic_component_behaviour()
			throws InitializePropagationException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, LoadModelFailedException, UncertaintyPropagationException {

		/**
		 * Assigned at bookStore.getBasicComponentBehaviour_home__Book_Shop_Web_Pages()
		 * <br>
		 * Impact on: SystemInterfaces
		 * 
		 */
		Uncertainty uncertainty_at_basic_component_behaviour = createUncertainty_Book_Store_at_basic_component_behaviour();

		UCArchitectureVersion version = initializePropagation(uncertainty_at_basic_component_behaviour);
		UCArchitectureVersion versionWithPropagationResults = UCImpactPropagationAnalysis
				.runUncertaintyPropagationAnalysis(version);

		// Execute propagation
		UncertaintyPropagation uncertaintyPropagation = (UncertaintyPropagation) versionWithPropagationResults
				.getModificationMarkRepository().getChangePropagationSteps().get(0);

		assertNotNull(uncertaintyPropagation);

		List<? extends UCImpactEntity<?>> affectedEntities = uncertaintyPropagation.getAffectedSystemInterface();
		assertEquals(2, affectedEntities.size());

		UCImpactEntity<?> firstImpact = affectedEntities.get(0);
		UCImpactEntity<?> secondImpact = affectedEntities.get(1);

		List<Entity> firstImpact_firstCausingUncertainty_path = new ArrayList<>();
		firstImpact_firstCausingUncertainty_path.add(bookStore.getBasicComponentBehaviour_home__Book_Shop_Web_Pages());
		firstImpact_firstCausingUncertainty_path.add(bookStore.getBasicComponentType_Book_Shop_Web_Pages());
		firstImpact_firstCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		firstImpact_firstCausingUncertainty_path
				.add(bookStore.getDelegationConnector_Provided_IBowseBooks_Delegation());
		firstImpact_firstCausingUncertainty_path.add(bookStore.getSystemInterface_Provided_IBrowseBooks());

		CausingUncertainty firstImpact_firstCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_basic_component_behaviour, firstImpact_firstCausingUncertainty_path);

		List<Entity> secondImpact_secondCausingUncertainty_path = new ArrayList<>();
		secondImpact_secondCausingUncertainty_path
				.add(bookStore.getBasicComponentBehaviour_home__Book_Shop_Web_Pages());
		secondImpact_secondCausingUncertainty_path.add(bookStore.getBasicComponentType_Book_Shop_Web_Pages());
		secondImpact_secondCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		secondImpact_secondCausingUncertainty_path
				.add(bookStore.getDelegationConnector_Provided_IOrderBooks_Delegation());
		secondImpact_secondCausingUncertainty_path.add(bookStore.getSystemInterface_Provided_IOrderBooks());

		CausingUncertainty secondImpact_secondCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_basic_component_behaviour, secondImpact_secondCausingUncertainty_path);

		// test impact on IBrowseBooks
		testUCImpactEntityForSingleUncertainty(firstImpact, bookStore.getSystemInterface_Provided_IBrowseBooks(),
				List.of(firstImpact_firstCausingUncertainty));

		// test impact on IOrderBooks
		testUCImpactEntityForSingleUncertainty(secondImpact, bookStore.getSystemInterface_Provided_IOrderBooks(),
				List.of(secondImpact_secondCausingUncertainty));

	}

	@Test
	public void testPropagation_uncertainty_at_basic_component_type()
			throws InitializePropagationException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, LoadModelFailedException, UncertaintyPropagationException {

		/**
		 * Assigned at bookStore.getBasicComponentType_Book_Shop_Web_Pages() <br>
		 * Impact on: SystemInterfaces
		 * 
		 */
		Uncertainty uncertainty_at_basic_component_type = createUncertainty_Book_Store_at_basic_component_type();

		UCArchitectureVersion version = initializePropagation(uncertainty_at_basic_component_type);
		UCArchitectureVersion versionWithPropagationResults = UCImpactPropagationAnalysis
				.runUncertaintyPropagationAnalysis(version);

		// Execute propagation
		UncertaintyPropagation uncertaintyPropagation = (UncertaintyPropagation) versionWithPropagationResults
				.getModificationMarkRepository().getChangePropagationSteps().get(0);

		assertNotNull(uncertaintyPropagation);

		List<? extends UCImpactEntity<?>> affectedEntities = uncertaintyPropagation.getAffectedHardwareResources();
		assertEquals(1, affectedEntities.size());

		UCImpactEntity<?> firstImpact = affectedEntities.get(0);

		List<Entity> firstImpact_firstCausingUncertainty_path = new ArrayList<>();
		firstImpact_firstCausingUncertainty_path.add(bookStore.getBasicComponentType_Book_Shop_Web_Pages());
		firstImpact_firstCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		firstImpact_firstCausingUncertainty_path.add(bookStore
				.getAllocationContext_Allocation_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		firstImpact_firstCausingUncertainty_path.add(bookStore.getHardwareResource_Web__Application_Server());

		CausingUncertainty firstImpact_firstCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_basic_component_type, firstImpact_firstCausingUncertainty_path);

		// test impact on IBrowseBooks
		testUCImpactEntityForSingleUncertainty(firstImpact, bookStore.getHardwareResource_Web__Application_Server(),
				List.of(firstImpact_firstCausingUncertainty));

	}

	@Test
	public void testPropagation_uncertainty_at_communication_component()
			throws InitializePropagationException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, LoadModelFailedException, UncertaintyPropagationException {

		/**
		 * Assigned at bookStore.getCommunicationComponent_IBusinessConnector() <br>
		 * Impact on: Hardware Resources
		 * 
		 */
		Uncertainty uncertainty_at_communication_component = createUncertainty_Book_Store_at_communication_component();

		UCArchitectureVersion version = initializePropagation(uncertainty_at_communication_component);
		UCArchitectureVersion versionWithPropagationResults = UCImpactPropagationAnalysis
				.runUncertaintyPropagationAnalysis(version);

		// Execute propagation
		UncertaintyPropagation uncertaintyPropagation = (UncertaintyPropagation) versionWithPropagationResults
				.getModificationMarkRepository().getChangePropagationSteps().get(0);

		assertNotNull(uncertaintyPropagation);

		List<? extends UCImpactEntity<?>> affectedEntities = uncertaintyPropagation.getAffectedHardwareResources();
		assertEquals(1, affectedEntities.size());

		UCImpactEntity<?> firstImpact = affectedEntities.get(0);

		List<Entity> firstImpact_firstCausingUncertainty_path = new ArrayList<>();
		firstImpact_firstCausingUncertainty_path.add(bookStore.getCommunicationComponent_IBusinessConnector());
		firstImpact_firstCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		firstImpact_firstCausingUncertainty_path.add(bookStore
				.getAllocationContext_Allocation_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		firstImpact_firstCausingUncertainty_path.add(bookStore.getHardwareResource_Web__Application_Server());

		CausingUncertainty firstImpact_firstCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_communication_component, firstImpact_firstCausingUncertainty_path);

		List<Entity> secondImpact_secondCausingUncertainty_path = new ArrayList<>();
		secondImpact_secondCausingUncertainty_path.add(bookStore.getCommunicationComponent_IBusinessConnector());
		secondImpact_secondCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		secondImpact_secondCausingUncertainty_path.add(bookStore
				.getAllocationContext_Allocation_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		secondImpact_secondCausingUncertainty_path.add(bookStore.getHardwareResource_Web__Application_Server());

		CausingUncertainty secondImpact_secondCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_communication_component, secondImpact_secondCausingUncertainty_path);

		// test impact on WebApplicationServer (Path 1)
		testUCImpactEntityForSingleUncertainty(firstImpact, bookStore.getHardwareResource_Web__Application_Server(),
				List.of(firstImpact_firstCausingUncertainty, secondImpact_secondCausingUncertainty));

	}

	@Test
	public void testPropagation_uncertainty_at_hardware_resource()
			throws InitializePropagationException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, LoadModelFailedException, UncertaintyPropagationException {

		/**
		 * Assigned at bookStore.getBasicComponentBehaviour_home__Book_Shop_Web_Pages()
		 * <br>
		 * Impact on: SystemInterfaces
		 * 
		 */
		Uncertainty uncertainty_at_hardware_resource = createUncertainty_Book_Store_at_hardware_resource();

		UCArchitectureVersion version = initializePropagation(uncertainty_at_hardware_resource);
		UCArchitectureVersion versionWithPropagationResults = UCImpactPropagationAnalysis
				.runUncertaintyPropagationAnalysis(version);

		// Execute propagation
		UncertaintyPropagation uncertaintyPropagation = (UncertaintyPropagation) versionWithPropagationResults
				.getModificationMarkRepository().getChangePropagationSteps().get(0);

		assertNotNull(uncertaintyPropagation);

		List<? extends UCImpactEntity<?>> affectedEntities = uncertaintyPropagation
				.getAffectedCommunicationComponents();
		assertEquals(3, affectedEntities.size());

		UCImpactEntity<?> firstImpact = affectedEntities.get(0); // IBusinessConnector (2 Causing uncertainties)
		UCImpactEntity<?> secondImpact = affectedEntities.get(1); // IBookConnector
		UCImpactEntity<?> thirdImpact = affectedEntities.get(2); // ICustomerConnector

		// ----------------------------------IBusinessConnector

		List<Entity> firstImpact_firstCausingUncertainty_path = new ArrayList<>();
		firstImpact_firstCausingUncertainty_path.add(bookStore.getHardwareResource_Web__Application_Server());
		firstImpact_firstCausingUncertainty_path.add(bookStore
				.getAllocationContext_Allocation_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		firstImpact_firstCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		firstImpact_firstCausingUncertainty_path.add(bookStore.getCommunicationComponent_IBusinessConnector());

		CausingUncertainty firstImpact_firstCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_hardware_resource, firstImpact_firstCausingUncertainty_path);

		List<Entity> firstImpact_secondCausingUncertainty_path = new ArrayList<>();
		firstImpact_secondCausingUncertainty_path.add(bookStore.getHardwareResource_Web__Application_Server());
		firstImpact_secondCausingUncertainty_path.add(bookStore
				.getAllocationContext_Allocation_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		firstImpact_secondCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages());
		firstImpact_secondCausingUncertainty_path.add(bookStore.getCommunicationComponent_IBusinessConnector());

		CausingUncertainty firstImpact_secondCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_hardware_resource, firstImpact_secondCausingUncertainty_path);

		// test impact on IBusinessConnector
		testUCImpactEntityForSingleUncertainty(firstImpact, bookStore.getCommunicationComponent_IBusinessConnector(),
				List.of(firstImpact_firstCausingUncertainty, firstImpact_secondCausingUncertainty));

		// --------------------------IBookConnector

		List<Entity> secondImpact_firstCausingUncertainty_path = new ArrayList<>();
		secondImpact_firstCausingUncertainty_path.add(bookStore.getHardwareResource_Web__Application_Server());
		secondImpact_firstCausingUncertainty_path.add(bookStore
				.getAllocationContext_Allocation_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		secondImpact_firstCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		secondImpact_firstCausingUncertainty_path.add(bookStore.getCommunicationComponent_IBookConnector());

		CausingUncertainty secondImpact_firstCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_hardware_resource, secondImpact_firstCausingUncertainty_path);

		// test impact on IBusinessConnector
		testUCImpactEntityForSingleUncertainty(secondImpact, bookStore.getCommunicationComponent_IBookConnector(),
				List.of(secondImpact_firstCausingUncertainty));

		// --------------------------ICustomerConnector

		List<Entity> thirdImpact_firstCausingUncertainty_path = new ArrayList<>();
		thirdImpact_firstCausingUncertainty_path.add(bookStore.getHardwareResource_Web__Application_Server());
		thirdImpact_firstCausingUncertainty_path.add(bookStore
				.getAllocationContext_Allocation_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		thirdImpact_firstCausingUncertainty_path
				.add(bookStore.getComponentInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules());
		thirdImpact_firstCausingUncertainty_path.add(bookStore.getCommunicationComponent_ICustomerConnector());

		CausingUncertainty thirdImpact_firstCausingUncertainty = createTempCausingUncertainty(
				uncertainty_at_hardware_resource, thirdImpact_firstCausingUncertainty_path);

		// test impact on ICustomerConnector
		testUCImpactEntityForSingleUncertainty(thirdImpact, bookStore.getCommunicationComponent_ICustomerConnector(),
				List.of(thirdImpact_firstCausingUncertainty));

	}

	@Test
	public void testPropagation_uncertainty_at_system()
			throws InitializePropagationException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, LoadModelFailedException, UncertaintyPropagationException {

		/**
		 * Assigned at bookStore.bookStore.getSystem_Book_Shop_System() <br>
		 * Impact on: CommunicationComponents, SystemInterfaces,
		 * ComponentInterfaceInstances, ComponentInterfaceTypes
		 * 
		 */
		Uncertainty uncertainty_at_system = createUncertainty_Book_Store_at_system();

		UCArchitectureVersion version = initializePropagation(uncertainty_at_system);
		UCArchitectureVersion versionWithPropagationResults = UCImpactPropagationAnalysis
				.runUncertaintyPropagationAnalysis(version);

		// Execute propagation
		UncertaintyPropagation uncertaintyPropagation = (UncertaintyPropagation) versionWithPropagationResults
				.getModificationMarkRepository().getChangePropagationSteps().get(0);

		assertNotNull(uncertaintyPropagation);

		// TODO write more specific test to check the content as done above

		assertEquals(3, uncertaintyPropagation.getAffectedCommunicationComponents().size());
		assertEquals(3, uncertaintyPropagation.getAffectedSystemInterface().size());
		assertEquals(9, uncertaintyPropagation.getAffectedComponentInterfaceInstances().size());
		assertEquals(9, uncertaintyPropagation.getAffectedComponentInterfaceTypes().size());

	}

	private <T extends UCImpactEntity<?>> void testUCImpactEntityForSingleUncertainty(T ucImpactEntity,
			Entity expectedAffectedElement, List<CausingUncertainty> expectedCausingUncertainties) {

		// Affected Element should match!
		testEntityEqualsEntity(expectedAffectedElement, ucImpactEntity.getAffectedElement());

		List<CausingUncertainty> causingUncertainties = ucImpactEntity.getCausingElements();
		assertEquals(expectedCausingUncertainties.size(), causingUncertainties.size());

		// Causing uncertainty should match! (Wrapped uncertainty & Path!)
		for (int i = 0; i < causingUncertainties.size(); i++) {
			testUncertaintyEqualsUncertainty(expectedCausingUncertainties.get(i).getCausingUncertainty(),
					causingUncertainties.get(i).getCausingUncertainty());
			assertEquals(expectedCausingUncertainties.get(i).getPath().size(),
					causingUncertainties.get(i).getPath().size());

			for (int j = 0; j < expectedCausingUncertainties.get(i).getPath().size(); j++) {
				testEntityEqualsEntity(expectedCausingUncertainties.get(i).getPath().get(j),
						causingUncertainties.get(i).getPath().get(j));
			}

		}

	}

	/*
	 * Helper method to create expected causingUncertainty
	 */
	private CausingUncertainty createTempCausingUncertainty(Uncertainty uncertainty, List<Entity> entities) {
		CausingUncertainty cu = UncertaintypropagationFactory.eINSTANCE.createCausingUncertainty();
		cu.setCausingUncertainty(uncertainty);
		cu.getPath().addAll(entities);

		return cu;
	}

	/**
	 * Helper method to initialize input with uncertainties. (Types/Elements
	 * selected, so that each propagation algorithm is executed)
	 * 
	 * @return
	 * @throws InitializePropagationException
	 * @throws UncertaintyTemplateElementNotFoundException
	 * @throws PalladioElementNotFoundException
	 * @throws LoadModelFailedException
	 */
	private UCArchitectureVersion initializePropagation(Uncertainty... uncertainties)
			throws InitializePropagationException, LoadModelFailedException {
		PalladioModel palladioModel = getInitializedPalladioModel();

		// Empty version (only intialized with palladio models)
		UCArchitectureVersion version = UCArchitectureVersionFacade.createEmptyModel("test",
				palladioModel.getRepository(), palladioModel.getSystem(), palladioModel.getAllocation(),
				palladioModel.getResourceEnvironment(), palladioModel.getUsageModel());

		return UCImpactPropagationAnalysisInitializer.addUncertaintyImpactEntitiesToArchitectureVersion(version,
				List.of(uncertainties));

	}

}
