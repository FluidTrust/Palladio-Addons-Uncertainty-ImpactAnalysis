package org.palladiosimulator.uncertaintymodel.plugin.presenter.util;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.presenter.util.ModelToViewModelConverter;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ElementWrapper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyFactory;
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
import org.palladiosimulator.uncertainty.impact.view.model.ADDViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class ModelToViewModelConverterTest extends TestBase {

	@Test
	public void testConvertADDToADDViewModel() {

		ADD add = createADD("ADD_Structural", ADDClass.STRUCTURAL_DECISION, AmountOfAlternatives.OPEN_SET,
				CostsOfRevision.HIGH, PossibilityOfRevisability.YES, ProbabilityOfRevisability.LIKELY);
		ADDViewModel addViewModel = ModelToViewModelConverter.convertADDToADDViewModel(add);
		testADDEqualsADDViewModel(add, addViewModel);
	}

	@Test
	public void testConvertADDsToADDViewModels() {

		ADD add_1 = createADD("ADD_Structural", ADDClass.STRUCTURAL_DECISION, AmountOfAlternatives.OPEN_SET,
				CostsOfRevision.HIGH, PossibilityOfRevisability.YES, ProbabilityOfRevisability.LIKELY);

		ADD add_2 = createADD("ADD_Behavioural", ADDClass.BEHAVIOURAL_DECISION, AmountOfAlternatives.OPEN_SET,
				CostsOfRevision.HIGH, PossibilityOfRevisability.YES, ProbabilityOfRevisability.LIKELY);

		List<ADDViewModel> addViewModels = ModelToViewModelConverter.convertADDsToADDViewModels(List.of(add_1, add_2));
		testADDEqualsADDViewModel(add_1, addViewModels.get(0));
		testADDEqualsADDViewModel(add_2, addViewModels.get(1));
	}

	@Test
	public void testConvertUncertaintyTypeToUncertaintyTypeViewModel() {

		// Init data
		ADD add = createADDWithDefaultValues("addDefault");

		// Execute test
		UncertaintyType uncertaintyType = createUncertaintyType("uncertaintyTypeDefault",
				ArchitecturalElementTypes.COMMUNICATION_COMPONENT, add,
				List.of(ArchitecturalElementTypes.SYSTEM, ArchitecturalElementTypes.BASIC_COMPONENT_TYPE),
				ImpactOnConfidentiality.DIRECT, InformationAvailability.STATISTICAL_UNCERTAINTY,
				Location.SYSTEM_STRUCTURE, Manageability.FULLY_REDUCIBLE, Nature.ALEATORY,
				ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION, SeverityOfImpact.HIGH);

		UncertaintyTypeViewModel uncertaintyTypeViewModel = ModelToViewModelConverter
				.convertUncertaintyTypeToUncertaintyTypeViewModel(uncertaintyType);

		testUncertaintyTypeEqualsUncertaintyTypeViewModel(uncertaintyType, uncertaintyTypeViewModel);

	}

	@Test
	public void testConvertUncertaintyTypesToUncertaintyTypeViewModels() {

		// Init data
		ADD add = createADDWithDefaultValues("addDefault");
		ArchitecturalElementTypes assignableElementType = ArchitecturalElementTypes.SYSTEM;
		List<ArchitecturalElementTypes> impactOnElementTypes = List.of(ArchitecturalElementTypes.BASIC_COMPONENT_TYPE,
				ArchitecturalElementTypes.COMPONENT_INSTANCE);

		// Execute test
		UncertaintyType uncertaintyType_1 = createUncertaintyType("uncertaintyTypeDefault1", assignableElementType, add,
				impactOnElementTypes, ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION,
				SeverityOfImpact.HIGH);

		UncertaintyType uncertaintyType_2 = createUncertaintyType("uncertaintyTypeDefault2", assignableElementType, add,
				impactOnElementTypes, ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION,
				SeverityOfImpact.HIGH);

		List<UncertaintyTypeViewModel> uncertaintyTypeViewModels = ModelToViewModelConverter
				.convertUncertaintyTypesToUncertaintyTypeViewModels(List.of(uncertaintyType_1, uncertaintyType_2));

		testUncertaintyTypeEqualsUncertaintyTypeViewModel(uncertaintyType_1, uncertaintyTypeViewModels.get(0));
		testUncertaintyTypeEqualsUncertaintyTypeViewModel(uncertaintyType_2, uncertaintyTypeViewModels.get(1));

	}

	@Test
	public void testConvertUncertaintyTypeToUncertaintyTypeViewModelWithoutImpactOnElementsAndWithoutResolvedByADD() {


		// Execute test
		UncertaintyType uncertaintyType = createUncertaintyType("uncertaintyTypeDefault", ArchitecturalElementTypes.SYSTEM, null,
				List.of(), ImpactOnConfidentiality.DIRECT, InformationAvailability.STATISTICAL_UNCERTAINTY,
				Location.SYSTEM_STRUCTURE, Manageability.FULLY_REDUCIBLE, Nature.ALEATORY,
				ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION, SeverityOfImpact.HIGH);

		UncertaintyTypeViewModel uncertaintyTypeViewModel = ModelToViewModelConverter
				.convertUncertaintyTypeToUncertaintyTypeViewModel(uncertaintyType);

		testUncertaintyTypeEqualsUncertaintyTypeViewModel(uncertaintyType, uncertaintyTypeViewModel);

	}

	@Test
	public void testConvertUncertaintyToUncertaintyViewModel() {
		// Init test data
		ADD add = createADDWithDefaultValues("addDefault");
		ArchitecturalElementTypes assignableElementType = ArchitecturalElementTypes.SYSTEM;
		List<ArchitecturalElementTypes> impactOnElementTypes = List.of(ArchitecturalElementTypes.BASIC_COMPONENT_TYPE,
				ArchitecturalElementTypes.COMPONENT_INSTANCE);
		
		
		UncertaintyType uncertaintyType = createUncertaintyType("uncertaintyTypeDefault", assignableElementType, add,
				impactOnElementTypes, ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION,
				SeverityOfImpact.HIGH);

		Entity myEntity = UncertaintyFactory.eINSTANCE.createComponentInterfaceInstance();
		myEntity.setEntityName("test");
		ElementWrapper assignedElement = createElementWrapper(myEntity);

		Uncertainty uncertainty = createUncertainty("uncertaintyName", uncertaintyType, assignedElement);

		// Execute test
		UncertaintyViewModel uncertaintyViewModel = ModelToViewModelConverter
				.convertUncertaintyToUncertaintyViewModel(uncertainty);

		testUncertaintyEqualsUncertaintyViewModel(uncertainty, uncertaintyViewModel);

	}

	@Test
	public void testConvertUncertaintiesToUncertaintyViewModels() {
		// Init test data
		ADD add = createADDWithDefaultValues("addDefault");
		ArchitecturalElementTypes assignableElementType = ArchitecturalElementTypes.SYSTEM;
		List<ArchitecturalElementTypes> impactOnElementTypes = List.of(ArchitecturalElementTypes.BASIC_COMPONENT_TYPE,
				ArchitecturalElementTypes.COMPONENT_INSTANCE);
		
		
		UncertaintyType uncertaintyType = createUncertaintyType("uncertaintyTypeDefault", assignableElementType, add,
				impactOnElementTypes, ImpactOnConfidentiality.DIRECT,
				InformationAvailability.STATISTICAL_UNCERTAINTY, Location.SYSTEM_STRUCTURE,
				Manageability.FULLY_REDUCIBLE, Nature.ALEATORY, ResolutionTime.REQUIREMENTS_TIME, RootCause.ASSUMPTION,
				SeverityOfImpact.HIGH);

		Entity myEntity = UncertaintyFactory.eINSTANCE.createComponentInterfaceInstance();
		myEntity.setEntityName("test");
		ElementWrapper assignedElement_1 = createElementWrapper(myEntity);
		ElementWrapper assignedElement_2 = createElementWrapper(myEntity);

		Uncertainty uncertainty_1 = createUncertainty("uncertaintyName1", uncertaintyType, assignedElement_1);
		Uncertainty uncertainty_2 = createUncertainty("uncertaintyName2", uncertaintyType, assignedElement_2);

		// Execute test
		List<UncertaintyViewModel> uncertaintyViewModels = ModelToViewModelConverter
				.convertUncertaintiesToUncertaintyViewModels(List.of(uncertainty_1, uncertainty_2));

		testUncertaintyEqualsUncertaintyViewModel(uncertainty_1, uncertaintyViewModels.get(0));
		testUncertaintyEqualsUncertaintyViewModel(uncertainty_2, uncertaintyViewModels.get(1));

	}

}
