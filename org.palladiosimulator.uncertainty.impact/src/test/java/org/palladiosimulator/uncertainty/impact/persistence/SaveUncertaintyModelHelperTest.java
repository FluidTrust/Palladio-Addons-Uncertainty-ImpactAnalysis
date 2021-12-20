package org.palladiosimulator.uncertainty.impact.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.PLUGIN_URI_PREFIX;

import java.util.List;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.SaveModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class SaveUncertaintyModelHelperTest extends TestBase {


	@BeforeEach
	public void init() {
		cleanTestData();

	}

	@Test
	public void testSaving() throws LoadModelFailedException, UncertaintyTemplateElementNotFoundException,
			PalladioElementNotFoundException, SaveModelFailedException {

		String modelSavePath = testDataPath + "temp.uncertainty";

		/**
		 * Create and prepare uncertainty model with three uncertainties. (Including one
		 * at BasicComponentBehaviour and one at ComponentInterfaceInstance for which we
		 * have special save handling)
		 */
		Uncertainty uncertainty_at_basic_component_behaviour = createUncertainty_Book_Store_at_basic_component_behaviour();
		Uncertainty uncertainty_at_communication_component = createUncertainty_Book_Store_at_communication_component();
		Uncertainty uncertainty_at_component_interface_instance = createUncertainty_Book_Store_at_component_interface_instance();

		UncertaintyModel model = getEmptyInitializedUncertaintyModel();
		model.addUncertainty(uncertainty_at_basic_component_behaviour);
		model.addUncertainty(uncertainty_at_communication_component);
		model.addUncertainty(uncertainty_at_component_interface_instance);

		// Execute save
		SaveUncertaintyModelHelper.saveUncertaintyModel(model.getUncertaintyModel(), modelSavePath);

		// Load saved model again (UncertaintyContainer is EMF representation for
		// UncertaintyModel)
		UncertaintyContainer uncertaintyModelAfterSave = EMFPersistenceHelper.loadEmfModelFromFile(
				PLUGIN_URI_PREFIX + modelSavePath, null, new ResourceSetImpl(), UncertaintyContainer.class);

		List<Uncertainty> uncertainties = uncertaintyModelAfterSave.getUncertainties();

		assertEquals(3, uncertainties.size());

		testUncertaintyEqualsUncertainty(uncertainties.get(0), uncertainty_at_basic_component_behaviour);
		testUncertaintyEqualsUncertainty(uncertainties.get(1), uncertainty_at_communication_component);
		testUncertaintyEqualsUncertainty(uncertainties.get(2), uncertainty_at_component_interface_instance);

		// BasicComponentBehaviour Container must be filled
		assertEquals(1, uncertaintyModelAfterSave.getBasicComponentBehaviours().size());
		testEntityEqualsEntity(bookStore.getBasicComponentBehaviour_home__Book_Shop_Web_Pages(),
				uncertaintyModelAfterSave.getBasicComponentBehaviours().get(0));

		// ComponentInterfaceInstance Container must be filled
		assertEquals(1, uncertaintyModelAfterSave.getComponentInterfaceInstances().size());
		testEntityEqualsEntity(bookStore
				.getComponentInterfaceInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider__IBook(),
				uncertaintyModelAfterSave.getComponentInterfaceInstances().get(0));

	}

	

}
