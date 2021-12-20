package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.UCImpactPropagationAnalysis;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class PropagationFromAffectedSystemHelperTest extends TestBase{
	
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

}
