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

public class PropagationFromAffectedCommunicationComponentsHelperTest extends TestBase{
	
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

}
