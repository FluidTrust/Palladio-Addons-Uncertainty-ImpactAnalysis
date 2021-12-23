package org.palladiosimulator.uncertaintymodel.plugin;

import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;

/**
 * Geneated by {@link PalladioModelConvenienceMethodGenerator}
 * 
 * @author Niko
 *
 */
public class TestUncertaintyTemplateLoader extends TestBase {// TODO adapt paths to required models
	private String uncertaintyTemplatePath = "src/test/resources/models/expert/test.uncertaintytemplate";

	private UncertaintyTemplateModel model;

	public TestUncertaintyTemplateLoader() throws LoadModelFailedException {

		model = new UncertaintyTemplateModel();
		model.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
	}

	public ADD getADD_ADD_Structural() throws UncertaintyTemplateElementNotFoundException {
		return model.getAddById("_dEna0DWREeyX2v1Sswnu1Q");
	}

	public ADD getADD_ADD_Behavioural() throws UncertaintyTemplateElementNotFoundException {
		return model.getAddById("_fs_LQDWREeyX2v1Sswnu1Q");
	}

	public ADD getADD_ADD_Property() throws UncertaintyTemplateElementNotFoundException {
		return model.getAddById("_UPKRMDvgEey_pcVcOzlgag");
	}

	public ADD getADD_ADD_Executive() throws UncertaintyTemplateElementNotFoundException {
		return model.getAddById("_aboagDvgEey_pcVcOzlgag");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_BasicComponentBehaviour()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_G-XpMDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_BasicComponentType()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_HOiMIDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_CommunicationComponents()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_JkrkIDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_CommunicationResources()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_J3mgIDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_ComponentInstance()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_KH1UgDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_ComponentInterfaceInstance()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_KZVUMDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_ComponentInterfaceType()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_KppoIDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_HardwareResource()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_K6ybcDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_System()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_LIVvQDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_SystemInterface()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_LWF3YDvjEeyKcZ3NE6_IOQ");
	}

	public UncertaintyType getUncertaintyType_Assignable_to_UsageBehaviour()
			throws UncertaintyTemplateElementNotFoundException {
		return model.getUncertaintyTypeById("_MYM0oDvjEeyKcZ3NE6_IOQ");
	}

}
