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
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes;
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
	public void testGetUncertaintyTypesResolvesReferencesSuccessfull() {
		List<UncertaintyType> elementTypes = cut.getUncertaintyTypes();
		assertEquals(11, elementTypes.size());

		UncertaintyType uncertaintyType = elementTypes.get(0);
		testUncertaintyType(uncertaintyType, "_G-XpMDvjEeyKcZ3NE6_IOQ", "Assignable_to_BasicComponentBehaviour",
				ArchitecturalElementTypes.BASIC_COMPONENT_BEHAVIOUR, List.of(ArchitecturalElementTypes.SYSTEM_INTERFACE),
				"_fs_LQDWREeyX2v1Sswnu1Q", ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION,
				SeverityOfImpact.HIGH);

		// Only check first and fifth uncertainty Type
		uncertaintyType = elementTypes.get(4);
		testUncertaintyType(uncertaintyType, "_KH1UgDvjEeyKcZ3NE6_IOQ", "Assignable_to_ComponentInstance",
				ArchitecturalElementTypes.COMPONENT_INSTANCE, List.of(), null, ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.DEPLOYMENT_TIME,
				RootCause.MISSING_INFORMATION, SeverityOfImpact.HIGH);

	}

	@Test
	public void testGetUncertaintyTypeById() throws UncertaintyTemplateElementNotFoundException {

		UncertaintyType uncertaintyType = cut.getUncertaintyTypeById("_G-XpMDvjEeyKcZ3NE6_IOQ");
		testUncertaintyType(uncertaintyType, "_G-XpMDvjEeyKcZ3NE6_IOQ", "Assignable_to_BasicComponentBehaviour",
				ArchitecturalElementTypes.BASIC_COMPONENT_BEHAVIOUR, List.of(ArchitecturalElementTypes.SYSTEM_INTERFACE),
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
