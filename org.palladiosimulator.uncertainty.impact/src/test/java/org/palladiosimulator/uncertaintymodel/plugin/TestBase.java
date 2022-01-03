package org.palladiosimulator.uncertaintymodel.plugin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeAll;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.EntityFactory;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.presenter.util.ArchitecturalElementTypeToPalladioElementTypeNameResolver;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersionFacade;
import org.palladiosimulator.uncertainty.impact.propagation.UCImpactPropagationAnalysisInitializer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddFactory;
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
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationFactory;
import org.palladiosimulator.uncertainty.impact.view.model.ADDViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

import de.uka.ipd.sdq.identifier.Identifier;
import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;

public abstract class TestBase {

	// Paths to Palladio Test Models
	public static final String allocationPath = "src/test/resources/models/user/pcm/BookShop.allocation";
	public static final String repositoryPath = "src/test/resources/models/user/pcm/BookShop.repository";
	public static final String resourceEnvPath = "src/test/resources/models/user/pcm/BookShop.resourceenvironment";
	public static final String systemPath = "src/test/resources/models/user/pcm/BookShop.system";
	public static final String usageModelPath = "src/test/resources/models/user/pcm/BookShop.usagemodel";

	public static final String uncertaintyPath = "src/test/resources/models/user/test.uncertainty";
	public static final String uncertaintyTemplatePath = "src/test/resources/models/expert/test.uncertaintytemplate";

	public static final List<String> palladioModelPaths = new ArrayList<>(
			List.of(allocationPath, repositoryPath, resourceEnvPath, systemPath, usageModelPath));

	public static final String testDataPath = "src/test/resources/testdata/";

	private UncertaintyFactory uncertaintyFactory = UncertaintyFactory.eINSTANCE;

	private UncertaintyTypeFactory uncertaintyTypeFactory = UncertaintyTypeFactory.eINSTANCE;

	private EntityFactory entityFactory = EntityFactory.eINSTANCE;

	private AddFactory addFactory = AddFactory.eINSTANCE;

	public static BookStoreLoader bookStore;
	public static TestUncertaintyTemplateLoader testTemplateLoader;

	@BeforeAll
	public static void initTestEnvironment() throws StandaloneInitializationException, LoadModelFailedException {
		UncertaintyPluginInitializer.init();
		bookStore = new BookStoreLoader();
		testTemplateLoader = new TestUncertaintyTemplateLoader();
	}

	/**
	 * Do not execute before each test (only where necessary)
	 */
	public static void cleanTestData() {
		URI uri = URI.createFileURI(testDataPath);
		try {
			FileUtils.cleanDirectory(new File(uri.toString()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public UncertaintyTemplateModel getInitializedUncertaintyTemplateModel() throws LoadModelFailedException {
		UncertaintyTemplateModel loader = new UncertaintyTemplateModel();
		loader.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
		return loader;
	}

	public static PalladioModel getInitializedPalladioModel() throws LoadModelFailedException {
		PalladioModel loader = new PalladioModel();
		loader.loadPalladioModels(palladioModelPaths);
		return loader;
	}

	public UncertaintyModel getInitializedUncertaintyModel() throws LoadModelFailedException {
		UncertaintyModel loader = new UncertaintyModel();
		loader.loadUncertaintyModel(uncertaintyPath);
		return loader;
	}

	/**
	 * Initialized with default uncertainty template
	 * 
	 * @return
	 * @throws LoadModelFailedException
	 */
	public UncertaintyModel getEmptyInitializedUncertaintyModel() throws LoadModelFailedException {
		UncertaintyModel model = new UncertaintyModel();
		model.loadNewUncertaintyModel(getInitializedUncertaintyTemplateModel().getTemplateModel());
		return model;
	}

	/**
	 * Helper method to initialize input with uncertainties. (Types/Elements
	 * selected, so that each propagation algorithm is executed)
	 * 
	 * @return
	 * @throws InitializePropagationException
	 * @throws UncertaintyTemplateElementNotFoundException
	 * @throws PalladioElementNotFoundException
	 * @throws LoadModelFailedException
	 */
	public UCArchitectureVersion initializePropagation(Uncertainty... uncertainties)
			throws InitializePropagationException, LoadModelFailedException {
		PalladioModel palladioModel = getInitializedPalladioModel();

		// Empty version (only intialized with palladio models)
		UCArchitectureVersion version = UCArchitectureVersionFacade.createEmptyModel("test",
				palladioModel.getRepository(), palladioModel.getSystem(), palladioModel.getAllocation(),
				palladioModel.getResourceEnvironment(), palladioModel.getUsageModel());

		return UCImpactPropagationAnalysisInitializer.addUncertaintyImpactEntitiesToArchitectureVersion(version,
				List.of(uncertainties));

	}

	/*
	 * Helper method to create expected causingUncertainty
	 */
	public CausingUncertainty createTempCausingUncertainty(Uncertainty uncertainty, List<Entity> entities) {
		CausingUncertainty cu = UncertaintypropagationFactory.eINSTANCE.createCausingUncertainty();
		cu.setCausingUncertainty(uncertainty);
		cu.getPath().addAll(entities);

		return cu;
	}

	public <T extends UCImpactEntity<?>> void testUCImpactEntityForSingleUncertainty(T ucImpactEntity,
			Entity expectedAffectedElement, List<CausingUncertainty> expectedCausingUncertainties) {

		// Affected Element should match!
		testEntityEqualsEntity(expectedAffectedElement, ucImpactEntity.getAffectedElement());

		List<CausingUncertainty> causingUncertainties = ucImpactEntity.getCausingElements();
		assertEquals(expectedCausingUncertainties.size(), causingUncertainties.size());

		// Causing uncertainty should match! (Wrapped uncertainty & Path!)
		for (int i = 0; i < causingUncertainties.size(); i++) {
			testUncertaintyEqualsUncertainty(expectedCausingUncertainties.get(i).getCausingUncertainty(),
					causingUncertainties.get(i).getCausingUncertainty());
			assertEquals(expectedCausingUncertainties.get(i).getPath().size(),
					causingUncertainties.get(i).getPath().size());

			for (int j = 0; j < expectedCausingUncertainties.get(i).getPath().size(); j++) {
				testEntityEqualsEntity(expectedCausingUncertainties.get(i).getPath().get(j),
						causingUncertainties.get(i).getPath().get(j));
			}

		}

	}

	/**
	 * Create Uncertainty with provided characteristics
	 * 
	 * @param name
	 * @param uncertaintyType
	 * @param assignedElement
	 * @return
	 */
	public Uncertainty createUncertainty(String name, UncertaintyType uncertaintyType, ElementWrapper assignedElement) {
		Uncertainty uncertainty = uncertaintyFactory.createUncertainty();
		uncertainty.setName(name);
		uncertainty.setUncertaintyType(uncertaintyType);
		uncertainty.setAssignedElement(assignedElement);

		return uncertainty;
	}

	/**
	 * Create Uncertainty with default type and assigned element
	 * 
	 * @param name
	 * @return
	 */
	public Uncertainty createUncertaintyWithDefaultValues(String name) {
		Uncertainty uncertainty = uncertaintyFactory.createUncertainty();
		uncertainty.setName(name);
		uncertainty.setUncertaintyType(createUncertaintyTypeWithDefaultValues("default"));
		uncertainty.setAssignedElement(createDefaultElementWrapper());

		return uncertainty;
	}

	public Uncertainty createUncertainty_Book_Store_at_system()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_system", testTemplateLoader.getUncertaintyType_Assignable_to_System(),
				createElementWrapper(bookStore.getSystem_Book_Shop_System()));

	}

	public Uncertainty createUncertainty_Book_Store_at_hardware_resource()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_hardware_resource",
				testTemplateLoader.getUncertaintyType_Assignable_to_HardwareResource(),
				createElementWrapper(bookStore.getHardwareResource_Web__Application_Server()));

	}

	public Uncertainty createUncertainty_Book_Store_at_basic_component_type()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_basic_component_type",
				testTemplateLoader.getUncertaintyType_Assignable_to_BasicComponentType(),
				createElementWrapper(bookStore.getBasicComponentType_Book_Shop_Web_Pages()));

	}

	public Uncertainty createUncertainty_Book_Store_at_component_instance()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_basic_component_instance",
				testTemplateLoader.getUncertaintyType_Assignable_to_ComponentInstance(), createElementWrapper(bookStore
						.getComponentInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider()));

	}

	public Uncertainty createUncertainty_Book_Store_at_basic_component_behaviour()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_basic_component_behaviour",
				testTemplateLoader.getUncertaintyType_Assignable_to_BasicComponentBehaviour(),
				createElementWrapper(bookStore.getBasicComponentBehaviour_home__Book_Shop_Web_Pages()));

	}

	public Uncertainty createUncertainty_Book_Store_at_communication_component()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_communication_component",
				testTemplateLoader.getUncertaintyType_Assignable_to_CommunicationComponents(),
				createElementWrapper(bookStore.getCommunicationComponent_IBusinessConnector()));

	}

	public Uncertainty createUncertainty_Book_Store_at_communication_resource()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_communication_resource",
				testTemplateLoader.getUncertaintyType_Assignable_to_CommunicationResources(),
				createElementWrapper(bookStore.getCommunicationResource_LAN()));

	}

	public Uncertainty createUncertainty_Book_Store_at_system_interface()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_system_interface",
				testTemplateLoader.getUncertaintyType_Assignable_to_SystemInterface(),
				createElementWrapper(bookStore.getSystemInterface_Provided_IBrowseBooks()));

	}

	public Uncertainty createUncertainty_Book_Store_at_component_interface_instance()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_component_interface_instance",
				testTemplateLoader.getUncertaintyType_Assignable_to_ComponentInterfaceInstance(),
				createElementWrapper(bookStore
						.getComponentInterfaceInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider__IBook()));

	}

	public Uncertainty createUncertainty_Book_Store_at_component_interface_type()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_component_interface_type",
				testTemplateLoader.getUncertaintyType_Assignable_to_ComponentInterfaceType(),
				createElementWrapper(bookStore.getComponentInterfaceType_Provided_IBrowseBooks()));

	}

	public Uncertainty createUncertainty_Book_Store_at_usage_behaviour()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_usage_behaviour",
				testTemplateLoader.getUncertaintyType_Assignable_to_UsageBehaviour(),
				createElementWrapper(bookStore.getUsageBehaviour_Load_Images()));

	}

	/**
	 * Uncertainty is invalid, as assignableElementType is 'System' and actually
	 * assigned element is of type BasicComponentBehaviour. This will not happen if
	 * using the UI but might happen if using the tree editor
	 * 
	 * @return
	 * @throws UncertaintyTemplateElementNotFoundException
	 * @throws PalladioElementNotFoundException
	 */
	public Uncertainty createUncertainty_Book_Store_Invalid_Mapping()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_invalid", testTemplateLoader.getUncertaintyType_Assignable_to_System(),
				createElementWrapper(bookStore.getBasicComponentBehaviour_addBook__Book__Customer_Data_Provider()));

	}

	public UncertaintyViewModel createUncertaintyViewModel(String name, String id,
			UncertaintyTypeViewModel uncertaintyTypeViewModel, PalladioElementViewModel palladioElementViewModel) {
		UncertaintyViewModel uncertaintyViewModel = new UncertaintyViewModel();
		uncertaintyViewModel.setName(name);
		uncertaintyViewModel.setId(id);
		uncertaintyViewModel.setUncertaintyTypeViewModel(uncertaintyTypeViewModel);
		uncertaintyViewModel.setAssignedElement(palladioElementViewModel);

		return uncertaintyViewModel;

	}

	/**
	 * Create uncertainty type with specified fields
	 * 
	 * @param name
	 * @param assignableElementType
	 * @param resolvedByADD
	 * @param impactOnElementTypes
	 * @param impactOnConfidentiality
	 * @param informationAvailability
	 * @param location
	 * @param manageability
	 * @param nature
	 * @param resolutionTime
	 * @param resolvableByAdd
	 * @param rootCause
	 * @param severityOfImpact
	 * @return
	 */
	public UncertaintyType createUncertaintyType(String name, ArchitecturalElementTypes assignableElementType,
			ADD resolvedByADD, List<ArchitecturalElementTypes> impactOnElementTypes,
			ImpactOnConfidentiality impactOnConfidentiality, InformationAvailability informationAvailability,
			Location location, Manageability manageability, Nature nature, ResolutionTime resolutionTime,
			RootCause rootCause, SeverityOfImpact severityOfImpact) {

		// Create type
		UncertaintyType uncertaintyType = uncertaintyTypeFactory.createUncertaintyType();

		// Set fields
		uncertaintyType.setName(name);
		uncertaintyType.setAssignableElementType(assignableElementType);
		uncertaintyType.setResolvedBy(resolvedByADD);
		uncertaintyType.getImpactOnElementTypes().addAll(impactOnElementTypes);

		// Set enums
		uncertaintyType.setImpactOnConfidentiality(impactOnConfidentiality);
		uncertaintyType.setInformationAvailability(informationAvailability);
		uncertaintyType.setLocation(location);
		uncertaintyType.setManageability(manageability);
		uncertaintyType.setNature(nature);
		uncertaintyType.setResolutionTime(resolutionTime);
		uncertaintyType.setRootCause(rootCause);
		uncertaintyType.setSeverityOfImpact(severityOfImpact);

		return uncertaintyType;
	}

	public UncertaintyTypeViewModel createUncertaintyTypeViewModel(String name,
			ArchitecturalElementTypes assignableElement, ADDViewModel resolvedByADD,
			List<ArchitecturalElementTypes> impactOnElementTypes, ImpactOnConfidentiality impactOnConfidentiality,
			InformationAvailability informationAvailability, Location location, Manageability manageability,
			Nature nature, ResolutionTime resolutionTime, RootCause rootCause, SeverityOfImpact severityOfImpact) {
		UncertaintyTypeViewModel uncertaintyTypeViewModel = new UncertaintyTypeViewModel();

		// Set fields
		uncertaintyTypeViewModel.setName(name);
		uncertaintyTypeViewModel.setAssignableElementType(assignableElement.getName());
		uncertaintyTypeViewModel.setResolvedBy(resolvedByADD);
		uncertaintyTypeViewModel.getImpactOnElementTypes()
				.addAll(ArchitecturalElementTypeToPalladioElementTypeNameResolver.resolveNames(impactOnElementTypes));

		// Set enums
		uncertaintyTypeViewModel.setImpactOnConfidentiality(impactOnConfidentiality.getName());
		uncertaintyTypeViewModel.setInformationAvailability(informationAvailability.getName());
		uncertaintyTypeViewModel.setLocation(location.getName());
		uncertaintyTypeViewModel.setManageability(manageability.getName());
		uncertaintyTypeViewModel.setNature(nature.getName());
		uncertaintyTypeViewModel.setResolutionTime(resolutionTime.getName());
		uncertaintyTypeViewModel.setRootCause(rootCause.getName());
		uncertaintyTypeViewModel.setSeverityOfImpact(severityOfImpact.getName());

		return uncertaintyTypeViewModel;
	}

	/**
	 * UncertaintyTypeViewModel with id and name set only
	 * 
	 * @param name
	 * @param id
	 * @return
	 */
	public UncertaintyTypeViewModel createUncertaintyTypeViewModelSkeleton(String name, String id) {
		UncertaintyTypeViewModel uncertaintyTypeViewModel = new UncertaintyTypeViewModel();

		// Set fields
		uncertaintyTypeViewModel.setName(name);
		uncertaintyTypeViewModel.setId(id);

		return uncertaintyTypeViewModel;
	}

	/**
	 * Create UncertaintaintyType with default values
	 * 
	 * @return
	 */
	public UncertaintyType createUncertaintyTypeWithDefaultValues(String name) {
		UncertaintyType uncertaintyType = uncertaintyTypeFactory.createUncertaintyType();
		uncertaintyType.setName(name);

		uncertaintyType.setResolvedBy(createADDWithDefaultValues("default"));
		uncertaintyType.setAssignableElementType(ArchitecturalElementTypes.BASIC_COMPONENT_TYPE);

		uncertaintyType.getImpactOnElementTypes()
				.addAll(List.of(ArchitecturalElementTypes.SYSTEM, ArchitecturalElementTypes.COMPONENT_INSTANCE));

		return uncertaintyType;
	}

	public ADD createADD(String name, ADDClass addClass, AmountOfAlternatives amountOfAlternatives,
			CostsOfRevision costsOfRevision, PossibilityOfRevisability possibilityOfRevisability,
			ProbabilityOfRevisability probabilityOfRevisability) {
		ADD add = addFactory.createADD();

		add.setName(name);
		add.setAddClass(addClass);
		add.setAmountOfAlternatives(amountOfAlternatives);
		add.setCostsOfRevision(costsOfRevision);
		add.setPossibilityOfRevisability(possibilityOfRevisability);
		add.setProbabilityOfRevisability(probabilityOfRevisability);
		return add;
	}

	public ADD createADDWithDefaultValues(String name) {
		ADD add = addFactory.createADD();
		add.setName(name);
		return add;
	}

	public ADDViewModel createADDViewModel(String name, ADDClass addClass, AmountOfAlternatives amountOfAlternatives,
			CostsOfRevision costsOfRevision, PossibilityOfRevisability possibilityOfRevisability,
			ProbabilityOfRevisability probabilityOfRevisability) {
		ADDViewModel add = new ADDViewModel();

		add.setName(name);
		add.setAddClass(addClass.getName());
		add.setAmountOfAlternatives(amountOfAlternatives.getName());
		add.setCostsOfRevision(costsOfRevision.getName());
		add.setPossibilityOfRevisability(possibilityOfRevisability.getName());
		add.setProbabilityOfRevisability(probabilityOfRevisability.getName());
		return add;
	}

	/**
	 * Create Palladio Element Wrapper with default referenced entity & type
	 * 
	 * @return
	 */
	public ElementWrapper createDefaultElementWrapper() {
		ElementWrapper elementWrapper = uncertaintyFactory.createElementWrapper();
		Entity entity = entityFactory.createResourceInterfaceProvidingEntity();
		elementWrapper.setReferencedElement(entity);

		return elementWrapper;
	}

	public ElementWrapper createElementWrapper(Entity entity) {
		ElementWrapper elementWrapper = uncertaintyFactory.createElementWrapper();
		elementWrapper.setReferencedElement(entity);

		return elementWrapper;
	}

	public PalladioElementViewModel createPalladioElementViewModel(String id, String name) {
		PalladioElementViewModel palladioElementViewModel = new PalladioElementViewModel();
		palladioElementViewModel.setId(id);
		palladioElementViewModel.setName(name);

		return palladioElementViewModel;
	}

	public void testUncertainty(Uncertainty uncertainty, String id, String name, String uncertaintyTypeId,
			String uncertaintyTypeName, String referencedElementTypeId, String referencedElementTypeName) {
		assertEquals(id, uncertainty.getId());
		assertEquals(name, uncertainty.getName());
		assertEquals(uncertaintyTypeId, uncertainty.getUncertaintyType().getId());
		assertEquals(uncertaintyTypeName, uncertainty.getUncertaintyType().getName());
		assertEquals(referencedElementTypeId, uncertainty.getAssignedElement().getReferencedElement().getId());
		assertEquals(referencedElementTypeName,
				uncertainty.getAssignedElement().getReferencedElement().getEntityName());

	}

	public void testADD(ADD add, String id, String name, ADDClass addClass, AmountOfAlternatives amountOfAlternatives,
			CostsOfRevision costsOfRevision, PossibilityOfRevisability possibilityOfRevisability,
			ProbabilityOfRevisability probabilityOfRevisability) {

		testIdAndName(id, add.getId(), name, add.getName());
		assertEquals(addClass, add.getAddClass());
		assertEquals(amountOfAlternatives, add.getAmountOfAlternatives());
		assertEquals(costsOfRevision, add.getCostsOfRevision());
		assertEquals(possibilityOfRevisability, add.getPossibilityOfRevisability());
		assertEquals(probabilityOfRevisability, add.getProbabilityOfRevisability());
	}

	public void testUncertaintyType(UncertaintyType uncertaintyType, String id, String name,
			ArchitecturalElementTypes assignableElementType,
			List<ArchitecturalElementTypes> impactOnElementElementTypes, String resolvedByADDId,
			ImpactOnConfidentiality impactOnConfidentiality, InformationAvailability informationAvailability,
			Location location, Manageability manageability, Nature nature, ResolutionTime resolutionTime,
			RootCause rootCause, SeverityOfImpact severityOfImpact) {

		// Check basic fields
		testIdAndName(id, uncertaintyType.getId(), name, uncertaintyType.getName());

		// Check assignable element
		testArchitecturalElementTypeEqualsArchitecturalElementType(assignableElementType,
				uncertaintyType.getAssignableElementType());

		// Check impact on elements
		testArchitecturalElementTypesEqualsArchitecturalElementTypes(impactOnElementElementTypes,
				uncertaintyType.getImpactOnElementTypes());

		// Check resolved by add
		if (resolvedByADDId != null) {
			assertEquals(resolvedByADDId, uncertaintyType.getResolvedBy().getId());
		} else {
			assertNull(uncertaintyType.getResolvedBy());
		}

		// Check enums
		assertEquals(uncertaintyType.getImpactOnConfidentiality(), impactOnConfidentiality);
		assertEquals(uncertaintyType.getInformationAvailability(), informationAvailability);
		assertEquals(uncertaintyType.getLocation(), location);
		assertEquals(uncertaintyType.getManageability(), manageability);
		assertEquals(uncertaintyType.getNature(), nature);
		assertEquals(uncertaintyType.getResolutionTime(), resolutionTime);
		assertEquals(uncertaintyType.getRootCause(), rootCause);
		assertEquals(uncertaintyType.getSeverityOfImpact(), severityOfImpact);

	}

	public void testADDEqualsADDViewModel(ADD add, ADDViewModel addViewModel) {
		if (add == null || addViewModel == null) {
			assertNull(addViewModel);
			assertNull(addViewModel);
		} else {
			assertNotNull(addViewModel);
			assertNotNull(addViewModel);

			testIdAndName(add.getId(), addViewModel.getId(), add.getName(), addViewModel.getName());

			assertEquals(add.getAmountOfAlternatives().getName(), addViewModel.getAmountOfAlternatives());
			assertEquals(add.getAddClass().getName(), addViewModel.getAddClass());
			assertEquals(add.getCostsOfRevision().getName(), addViewModel.getCostsOfRevision());
			assertEquals(add.getPossibilityOfRevisability().getName(), addViewModel.getPossibilityOfRevisability());
			assertEquals(add.getProbabilityOfRevisability().getName(), addViewModel.getProbabilityOfRevisability());
		}

	}

	public void testUncertaintyTypeEqualsUncertaintyTypeViewModel(UncertaintyType uncertaintyType,
			UncertaintyTypeViewModel uncertaintyTypeViewModel) {

		if (uncertaintyType == null || uncertaintyTypeViewModel == null) {
			assertNull(uncertaintyType);
			assertNull(uncertaintyTypeViewModel);
		} else {
			assertNotNull(uncertaintyType);
			assertNotNull(uncertaintyTypeViewModel);

			// Check basic fields
			testIdAndName(uncertaintyType.getId(), uncertaintyTypeViewModel.getId(), uncertaintyType.getName(),
					uncertaintyTypeViewModel.getName());

			// TODO Check assignable element type

			// TODO Check impact on element types

			// Check resolved by add
			testADDEqualsADDViewModel(uncertaintyType.getResolvedBy(), uncertaintyTypeViewModel.getResolvedBy());

			// Check enums
			assertEquals(uncertaintyType.getImpactOnConfidentiality().getName(),
					uncertaintyTypeViewModel.getImpactOnConfidentiality());
			assertEquals(uncertaintyType.getInformationAvailability().getName(),
					uncertaintyTypeViewModel.getInformationAvailability());
			assertEquals(uncertaintyType.getLocation().getName(), uncertaintyTypeViewModel.getLocation());
			assertEquals(uncertaintyType.getManageability().getName(), uncertaintyTypeViewModel.getManageability());
			assertEquals(uncertaintyType.getNature().getName(), uncertaintyTypeViewModel.getNature());
			assertEquals(uncertaintyType.getResolutionTime().getName(), uncertaintyTypeViewModel.getResolutionTime());
			assertEquals(uncertaintyType.getRootCause().getName(), uncertaintyTypeViewModel.getRootCause());
			assertEquals(uncertaintyType.getSeverityOfImpact().getName(),
					uncertaintyTypeViewModel.getSeverityOfImpact());
		}

	}

	public void testUncertaintyEqualsUncertaintyViewModel(Uncertainty uncertainty,
			UncertaintyViewModel uncertaintyViewModel) {
		assertNotNull(uncertainty);
		assertNotNull(uncertaintyViewModel);

		testIdAndName(uncertainty.getId(), uncertaintyViewModel.getId(), uncertainty.getName(),
				uncertaintyViewModel.getName());

		testUncertaintyTypeEqualsUncertaintyTypeViewModel(uncertainty.getUncertaintyType(),
				uncertaintyViewModel.getUncertaintyTypeViewModel());

		testElementWrapperEqualsPalladioElementViewModel(uncertainty.getAssignedElement(),
				uncertaintyViewModel.getAssignedElement());

	}

	public void testElementWrapperEqualsPalladioElementViewModel(ElementWrapper ElementWrapper,
			PalladioElementViewModel palladioElementViewModel) {
		if (ElementWrapper == null || palladioElementViewModel == null) {
			assertNull(ElementWrapper);
			assertNull(palladioElementViewModel);
		} else {
			assertNotNull(ElementWrapper);
			assertNotNull(palladioElementViewModel);

			Entity palladioElement = ElementWrapper.getReferencedElement();
			assertNotNull(palladioElement);

			testIdAndName(palladioElement.getId(), palladioElementViewModel.getId(), palladioElement.getEntityName(),
					palladioElementViewModel.getName());

		}

	}

	public void testUncertaintyEqualsUncertainty(Uncertainty uncertainty_1, Uncertainty uncertainty_2) {
		assertNotNull(uncertainty_1);
		assertNotNull(uncertainty_2);

		testIdAndName(uncertainty_1.getId(), uncertainty_2.getId(), uncertainty_1.getName(), uncertainty_2.getName());

		testUncertaintyTypeEqualsUncertaintyType(uncertainty_1.getUncertaintyType(),
				uncertainty_2.getUncertaintyType());

		testElementWrapperEqualsPalladioElement(uncertainty_1.getAssignedElement(), uncertainty_2.getAssignedElement());

	}

	private void testElementWrapperEqualsPalladioElement(ElementWrapper assignedElement_1,
			ElementWrapper assignedElement_2) {
		if (assignedElement_1 == null || assignedElement_2 == null) {
			assertNull(assignedElement_1);
			assertNull(assignedElement_2);
		} else {
			assertNotNull(assignedElement_1);
			assertNotNull(assignedElement_2);

			testIdAndName(assignedElement_1.getReferencedElement().getId(),
					assignedElement_2.getReferencedElement().getId(),
					assignedElement_1.getReferencedElement().getEntityName(),
					assignedElement_2.getReferencedElement().getEntityName());

		}

	}

	public void testUncertaintyTypeEqualsUncertaintyType(UncertaintyType uncertaintyType_1,
			UncertaintyType uncertaintyType_2) {
		if (uncertaintyType_1 == null || uncertaintyType_2 == null) {
			assertNull(uncertaintyType_1);
			assertNull(uncertaintyType_2);
		} else {
			assertNotNull(uncertaintyType_1);
			assertNotNull(uncertaintyType_2);

			// Check basic fields
			testIdAndName(uncertaintyType_1.getId(), uncertaintyType_2.getId(), uncertaintyType_1.getName(),
					uncertaintyType_2.getName());

			// Check assignable element type
			testArchitecturalElementTypeEqualsArchitecturalElementType(uncertaintyType_1.getAssignableElementType(),
					uncertaintyType_2.getAssignableElementType());

			// Check impact on element types

			testArchitecturalElementTypesEqualsArchitecturalElementTypes(uncertaintyType_1.getImpactOnElementTypes(),
					uncertaintyType_2.getImpactOnElementTypes());

			// Check resolved by add
			testADDEqualsADD(uncertaintyType_1.getResolvedBy(), uncertaintyType_2.getResolvedBy());

			// Check enums
			assertEquals(uncertaintyType_1.getImpactOnConfidentiality(),
					uncertaintyType_2.getImpactOnConfidentiality());
			assertEquals(uncertaintyType_1.getInformationAvailability(),
					uncertaintyType_2.getInformationAvailability());
			assertEquals(uncertaintyType_1.getLocation(), uncertaintyType_2.getLocation());
			assertEquals(uncertaintyType_1.getManageability(), uncertaintyType_2.getManageability());
			assertEquals(uncertaintyType_1.getNature(), uncertaintyType_2.getNature());
			assertEquals(uncertaintyType_1.getResolutionTime(), uncertaintyType_2.getResolutionTime());
			assertEquals(uncertaintyType_1.getRootCause(), uncertaintyType_2.getRootCause());
			assertEquals(uncertaintyType_1.getSeverityOfImpact(), uncertaintyType_2.getSeverityOfImpact());
		}

	}

	private void testADDEqualsADD(ADD add_1, ADD add_2) {
		if (add_1 == null || add_2 == null) {
			assertNull(add_1);
			assertNull(add_2);
		} else {
			assertNotNull(add_1);
			assertNotNull(add_2);
			testIdAndName(add_1.getId(), add_2.getId(), add_1.getName(), add_2.getName());
			assertEquals(add_1.getAmountOfAlternatives(), add_2.getAmountOfAlternatives());
			assertEquals(add_1.getAddClass(), add_2.getAddClass());
			assertEquals(add_1.getCostsOfRevision(), add_2.getCostsOfRevision());
			assertEquals(add_1.getPossibilityOfRevisability(), add_2.getPossibilityOfRevisability());
			assertEquals(add_1.getProbabilityOfRevisability(), add_2.getProbabilityOfRevisability());
		}

	}

	private void testArchitecturalElementTypeEqualsArchitecturalElementType(ArchitecturalElementTypes elementType_1,
			ArchitecturalElementTypes elementType_2) {
		assertEquals(elementType_1, elementType_2);
	}

	public void testArchitecturalElementTypesEqualsArchitecturalElementTypes(
			List<ArchitecturalElementTypes> elementTypes_1, List<ArchitecturalElementTypes> elementTypes_2) {

		if (elementTypes_1 == null || elementTypes_2 == null) {
			assertNull(elementTypes_1);
			assertNull(elementTypes_2);
		} else {

			assertEquals(elementTypes_1.size(), elementTypes_2.size());

			for (int i = 0; i < elementTypes_1.size(); i++) {
				testArchitecturalElementTypeEqualsArchitecturalElementType(elementTypes_1.get(i),
						elementTypes_2.get(i));
			}
		}

	}

	public <T extends Entity> void testEntityEqualsEntity(T entity_1, Entity entity_2) {
		if (entity_1 == null || entity_2 == null) {
			assertNull(entity_1);
			assertNull(entity_2);
		} else {
			assertNotNull(entity_1);
			assertNotNull(entity_2);
			testIdAndName(entity_1.getId(), entity_2.getId(), entity_1.getEntityName(), entity_2.getEntityName());
		}

	}

	/*
	 * Helper method for bettererror message
	 */
	private void testIdAndName(String expected_id, String actual_id, String expected_name, String actual_name) {

		String expected_id_and_name = expected_name + "(" + expected_id + ")";
		String actual_id_and_name = actual_name + "(" + actual_id + ")";

		assertEquals(expected_id_and_name, actual_id_and_name);
	}

}
