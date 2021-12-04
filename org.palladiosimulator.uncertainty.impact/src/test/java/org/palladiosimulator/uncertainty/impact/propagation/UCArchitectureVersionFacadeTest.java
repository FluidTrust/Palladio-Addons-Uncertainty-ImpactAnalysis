package org.palladiosimulator.uncertainty.impact.propagation;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class UCArchitectureVersionFacadeTest extends TestBase {

	@Test
	public void testCreateEmptyUCArchitectureVersion() throws LoadModelFailedException, InitializePropagationException {
		PalladioModel palladioModel = getInitializedPalladioModel();

		// Empty version (only intialized with palladio models)
		UCArchitectureVersion version = UCArchitectureVersionFacade.createEmptyModel("test",
				palladioModel.getRepository(), palladioModel.getSystem(), palladioModel.getAllocation(),
				palladioModel.getResourceEnvironment(), palladioModel.getUsageModel());

		assertNotNull(version.getRepository());
		assertNotNull(version.getSystem());
		assertNotNull(version.getAllocation());
		assertNotNull(version.getResourceEnvironment());
		assertNotNull(version.getUsageModel());

		assertNotNull(version.getUncertaintyImpactRepository());
		assertNotNull(version.getUncertaintyImpactRepository().getSeedModifications());
	}

	@Test
	public void testCreateEmptyUCArchitectureVersion_ErrorExpected()
			throws LoadModelFailedException, InitializePropagationException {
		PalladioModel palladioModel = getInitializedPalladioModel();

		assertThrows(InitializePropagationException.class, () -> {
			UCArchitectureVersionFacade.createEmptyModel("test", palladioModel.getRepository(),
					palladioModel.getSystem(), palladioModel.getAllocation(), palladioModel.getResourceEnvironment(),
					null);
		});
	}

}
