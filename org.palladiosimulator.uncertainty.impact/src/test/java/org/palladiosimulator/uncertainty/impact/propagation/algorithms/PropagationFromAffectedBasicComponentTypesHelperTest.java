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

public class PropagationFromAffectedBasicComponentTypesHelperTest extends TestBase{
	
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

}
