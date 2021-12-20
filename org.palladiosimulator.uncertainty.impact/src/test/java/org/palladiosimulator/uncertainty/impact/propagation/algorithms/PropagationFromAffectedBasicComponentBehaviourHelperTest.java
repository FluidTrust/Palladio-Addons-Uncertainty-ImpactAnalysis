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


public class PropagationFromAffectedBasicComponentBehaviourHelperTest extends TestBase {

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

}
