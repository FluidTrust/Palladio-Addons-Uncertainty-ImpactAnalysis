package org.palladiosimulator.uncertaintymodel.plugin.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class UncertaintyTemplateModelTest extends TestBase {

	UncertaintyTemplateModel cut;

	@BeforeEach
	public void init() throws LoadModelFailedException {
		cut = new UncertaintyTemplateModel();
		cut.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
	}

	@Test
	public void testIsInitialized() {
		// true as loadPalladioModels performed in init()
		assertTrue(cut.isInitialized());
	}

	@Test
	public void testGetADDsSuccessful() {
		List<ADD> adds = cut.getADDs();
		assertEquals(4, adds.size());

		ADD add = adds.get(0);
		testADD(add, "_dEna0DWREeyX2v1Sswnu1Q", "ADD_Structural", ADDClass.STRUCTURAL_DECISION,
				AmountOfAlternatives.CLOSED_SET, CostsOfRevision.HIGH, PossibilityOfRevisability.YES,
				ProbabilityOfRevisability.LIKELY);

		add = adds.get(1);
		testADD(add, "_fs_LQDWREeyX2v1Sswnu1Q", "ADD_Behavioural", ADDClass.BEHAVIOURAL_DECISION,
				AmountOfAlternatives.OPEN_SET, CostsOfRevision.LOW, PossibilityOfRevisability.NO,
				ProbabilityOfRevisability.UNLIKELY);

		add = adds.get(2);
		testADD(add, "_UPKRMDvgEey_pcVcOzlgag", "ADD_Property", ADDClass.PROPERTY_DECISION,
				AmountOfAlternatives.CLOSED_SET, CostsOfRevision.HIGH, PossibilityOfRevisability.NO,
				ProbabilityOfRevisability.UNLIKELY);

		add = adds.get(3);
		testADD(add, "_aboagDvgEey_pcVcOzlgag", "ADD_Executive", ADDClass.EXECUTIVE_DECISION,
				AmountOfAlternatives.OPEN_SET, CostsOfRevision.LOW, PossibilityOfRevisability.YES,
				ProbabilityOfRevisability.LIKELY);

	}

	@Test
	public void testGetADDById() throws UncertaintyTemplateElementNotFoundException {
		ADD add = cut.getAddById("_dEna0DWREeyX2v1Sswnu1Q");
		assertNotNull(add);
		testADD(add, "_dEna0DWREeyX2v1Sswnu1Q", "ADD_Structural", ADDClass.STRUCTURAL_DECISION,
				AmountOfAlternatives.CLOSED_SET, CostsOfRevision.HIGH, PossibilityOfRevisability.YES,
				ProbabilityOfRevisability.LIKELY);

	}

	@Test
	public void testGetADDByIdNotSuccessfull() {
		assertThrows(UncertaintyTemplateElementNotFoundException.class, () -> cut.getAddById("Invalid"));
	}

	@Test
	public void testGetElementTypes() {
		List<PalladioElementType> elementTypes = cut.getElementTypes();
		assertEquals(11, elementTypes.size());

		PalladioElementType type = elementTypes.get(0);
		testPalladioElementType(type, "_ogKREDWREeyX2v1Sswnu1Q", "System", PalladioElementTypes.SYSTEM);

		type = elementTypes.get(1);
		testPalladioElementType(type, "_pE4HsDWREeyX2v1Sswnu1Q", "Hardware Resource",
				PalladioElementTypes.HARDWARE_RESOURCE);

		type = elementTypes.get(2);
		testPalladioElementType(type, "_pVIxQDWREeyX2v1Sswnu1Q", "Basic Component Type",
				PalladioElementTypes.BASIC_COMPONENT_TYPE);

		type = elementTypes.get(3);
		testPalladioElementType(type, "_uQHRoDvgEey_pcVcOzlgag", "Component Instance",
				PalladioElementTypes.COMPONENT_INSTANCE);

		type = elementTypes.get(4);
		testPalladioElementType(type, "_uj8zoDvgEey_pcVcOzlgag", "Basic Component Behaviour",
				PalladioElementTypes.BASIC_COMPONENT_BEHAVIOUR);

		type = elementTypes.get(5);
		testPalladioElementType(type, "_u2df8DvgEey_pcVcOzlgag", "Communication Components",
				PalladioElementTypes.COMMUNICATION_COMPONENTS);

		type = elementTypes.get(6);
		testPalladioElementType(type, "_vEk0cDvgEey_pcVcOzlgag", "Communication Resources",
				PalladioElementTypes.COMMUNICATION_RESOURCES);

		type = elementTypes.get(7);
		testPalladioElementType(type, "_vUJhgDvgEey_pcVcOzlgag", "System Interface",
				PalladioElementTypes.SYSTEM_INTERFACE);

		type = elementTypes.get(8);
		testPalladioElementType(type, "_-GJ9QDvgEey_pcVcOzlgag", "Component Interface Instance",
				PalladioElementTypes.COMPONENT_INTERFACE_INSTANCE);

		type = elementTypes.get(9);
		testPalladioElementType(type, "_-W_1oDvgEey_pcVcOzlgag", "Component Interface Type",
				PalladioElementTypes.COMPONENT_INTERFACE_TYPE);

		type = elementTypes.get(10);
		testPalladioElementType(type, "_-oU2MDvgEey_pcVcOzlgag", "Usage Behaviour",
				PalladioElementTypes.USAGE_BEHAVIOUR);
	}

	@Test
	public void testGetElementTypeById() throws UncertaintyTemplateElementNotFoundException {
		PalladioElementType type = cut.getElementTypeById("_ogKREDWREeyX2v1Sswnu1Q");
		testPalladioElementType(type, "_ogKREDWREeyX2v1Sswnu1Q", "System", PalladioElementTypes.SYSTEM);
	}

	@Test
	public void testGetElementTypeByIdNotSuccessfulls() {
		assertThrows(UncertaintyTemplateElementNotFoundException.class, () -> cut.getElementTypeById("invalid"));
	}

	@Test
	public void testGetUncertaintyTypesResolvesReferencesSuccessfull() {
		List<UncertaintyType> elementTypes = cut.getUncertaintyTypes();
		assertEquals(11, elementTypes.size());

		UncertaintyType uncertaintyType = elementTypes.get(0);
		testUncertaintyType(uncertaintyType, "_G-XpMDvjEeyKcZ3NE6_IOQ", "Assignable_to_BasicComponentBehaviour",
				"_uj8zoDvgEey_pcVcOzlgag", List.of("_vUJhgDvgEey_pcVcOzlgag"),
				"_fs_LQDWREeyX2v1Sswnu1Q", ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION,
				SeverityOfImpact.HIGH);

		// Only check first and fifth uncertainty Type
		uncertaintyType = elementTypes.get(4);
		testUncertaintyType(uncertaintyType, "_KH1UgDvjEeyKcZ3NE6_IOQ", "Assignable_to_ComponentInstance",
				"_uQHRoDvgEey_pcVcOzlgag", List.of(), null, ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.DEPLOYMENT_TIME,
				RootCause.MISSING_INFORMATION, SeverityOfImpact.HIGH);

	}

	@Test
	public void testGetUncertaintyTypeById() throws UncertaintyTemplateElementNotFoundException {

		UncertaintyType uncertaintyType = cut.getUncertaintyTypeById("_G-XpMDvjEeyKcZ3NE6_IOQ");
		testUncertaintyType(uncertaintyType, "_G-XpMDvjEeyKcZ3NE6_IOQ", "Assignable_to_BasicComponentBehaviour",
				"_uj8zoDvgEey_pcVcOzlgag", List.of("_vUJhgDvgEey_pcVcOzlgag"),
				"_fs_LQDWREeyX2v1Sswnu1Q", ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION,
				SeverityOfImpact.HIGH);
	}

	@Test
	public void testGetUncertaintyTypeByIdNotSuccessfulls() {
		assertThrows(UncertaintyTemplateElementNotFoundException.class, () -> cut.getUncertaintyTypeById("invalid"));
	}

}
