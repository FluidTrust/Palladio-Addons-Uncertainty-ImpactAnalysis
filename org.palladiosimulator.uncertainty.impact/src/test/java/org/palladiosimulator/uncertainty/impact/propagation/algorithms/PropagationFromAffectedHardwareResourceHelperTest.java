package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

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
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.UCImpactPropagationAnalysis;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class PropagationFromAffectedHardwareResourceHelperTest  extends TestBase{
	
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

}
