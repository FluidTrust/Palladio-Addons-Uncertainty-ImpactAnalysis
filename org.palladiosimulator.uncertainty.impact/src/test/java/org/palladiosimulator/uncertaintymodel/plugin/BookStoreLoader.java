package org.palladiosimulator.uncertaintymodel.plugin;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.DelegationConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.evaluation.generator.PalladioModelConvenienceMethodGenerator;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;

/**
 * Geneated by {@link PalladioModelConvenienceMethodGenerator}
 * 
 * @author Niko
 *
 */
public class BookStoreLoader extends TestBase {// TODO adapt paths to required models
	String allocationPath = "src/test/resources/models/user/pcm/BookShop.allocation";
	String repositoryPath = "src/test/resources/models/user/pcm/BookShop.repository";
	String resourceEnvPath = "src/test/resources/models/user/pcm/BookShop.resourceenvironment";
	String systemPath = "src/test/resources/models/user/pcm/BookShop.system";
	String usageModelPath = "src/test/resources/models/user/pcm/BookShop.usagemodel";

	List<String> palladioModelPaths = new ArrayList<>(
			List.of(allocationPath, repositoryPath, resourceEnvPath, systemPath, usageModelPath));

	private PalladioModel model;

	public BookStoreLoader() throws LoadModelFailedException {

		model = new PalladioModel();
		model.loadPalladioModels(palladioModelPaths);
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_home__Book_Shop_Web_Pages()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_SUSloH9HEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_bestSellers__Book_Shop_Web_Pages()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_SUXeIH9HEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_newProducts__Book_Shop_Web_Pages()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_SUYFMH9HEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_shoppingCart__Book_Shop_Web_Pages()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_cMUasH9HEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_buyRequest__Book_Shop_Web_Pages()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_cMYFEH9HEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_handleBuy__Book_Shop_Business_Rules()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_naRg4H9HEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_getImage__Book_Image_Provider()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_5F_7wH9HEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_getBookDetails__Book__Customer_Data_Provider()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_QEtBQX9KEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_addBook__Book__Customer_Data_Provider()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_QEtoUX9KEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_getCustomerDetails__Book__Customer_Data_Provider()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_RJe4AX9KEeaHNuq2j06i3A");
	}

	public BasicComponentBehaviour getBasicComponentBehaviour_addCustomer__Book__Customer_Data_Provider()
			throws PalladioElementNotFoundException {
		return model.getBasicComponentBehaviourEntityById("_RJffEn9KEeaHNuq2j06i3A");
	}

	public BasicComponent getBasicComponentType_Book_Shop_Web_Pages() throws PalladioElementNotFoundException {
		return model.getBasicComponentTypeEntityById("_NdX6AH9HEeaHNuq2j06i3A");
	}

	public BasicComponent getBasicComponentType_Book_Shop_Business_Rules() throws PalladioElementNotFoundException {
		return model.getBasicComponentTypeEntityById("_fmYGwH9HEeaHNuq2j06i3A");
	}

	public BasicComponent getBasicComponentType_Book_Image_Provider() throws PalladioElementNotFoundException {
		return model.getBasicComponentTypeEntityById("_3EW0IH9HEeaHNuq2j06i3A");
	}

	public BasicComponent getBasicComponentType_Book__Customer_Data_Provider() throws PalladioElementNotFoundException {
		return model.getBasicComponentTypeEntityById("_mnCQoH9IEeaHNuq2j06i3A");
	}

	public AssemblyConnector getCommunicationComponent_IBusinessConnector() throws PalladioElementNotFoundException {
		return model.getCommunicationComponentEntityById("_2y-hgH9NEeaHNuq2j06i3A");
	}

	public AssemblyConnector getCommunicationComponent_IBookConnector() throws PalladioElementNotFoundException {
		return model.getCommunicationComponentEntityById("_4GSjgH9NEeaHNuq2j06i3A");
	}

	public AssemblyConnector getCommunicationComponent_ICustomerConnector() throws PalladioElementNotFoundException {
		return model.getCommunicationComponentEntityById("_5GCJQH9NEeaHNuq2j06i3A");
	}

	public LinkingResource getCommunicationResource_LAN() throws PalladioElementNotFoundException {
		return model.getCommunicationResourceEntityById("_GUwtAH9REeaHNuq2j06i3A");
	}

	public AssemblyContext getComponentInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages()
			throws PalladioElementNotFoundException {
		return model.getComponentInstanceEntityById("_x5MkkH9MEeaHNuq2j06i3A");
	}

	public AssemblyContext getComponentInstance_Assembly_Book_Image_Provider_Book_Image_Provider()
			throws PalladioElementNotFoundException {
		return model.getComponentInstanceEntityById("_8yiFoH9MEeaHNuq2j06i3A");
	}

	public AssemblyContext getComponentInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules()
			throws PalladioElementNotFoundException {
		return model.getComponentInstanceEntityById("_DKoQIH9NEeaHNuq2j06i3A");
	}

	public AssemblyContext getComponentInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider()
			throws PalladioElementNotFoundException {
		return model.getComponentInstanceEntityById("_UFP-MH9NEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages__IBrowseBooks()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_x5MkkH9MEeaHNuq2j06i3A$_SUHmgH9HEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages__IOrderBooks()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_x5MkkH9MEeaHNuq2j06i3A$_cMTzoH9HEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages__IBusiness()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_x5MkkH9MEeaHNuq2j06i3A$_QEtvsH9HEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book_Image_Provider_Book_Image_Provider__IImages()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_8yiFoH9MEeaHNuq2j06i3A$_5F_UsH9HEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules__IBusiness()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_DKoQIH9NEeaHNuq2j06i3A$_naQ50H9HEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules__IBook()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_DKoQIH9NEeaHNuq2j06i3A$_mM2EcH9HEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules__ICustomer()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_DKoQIH9NEeaHNuq2j06i3A$_0Kww0H9HEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider__IBook()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_UFP-MH9NEeaHNuq2j06i3A$_QEtBQH9KEeaHNuq2j06i3A");
	}

	public ComponentInterfaceInstance getComponentInterfaceInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider__ICustomer()
			throws PalladioElementNotFoundException {
		return model.getComponentInterfaceInstanceEntityById("_UFP-MH9NEeaHNuq2j06i3A$_RJe4AH9KEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_Provided_IBrowseBooks() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_SUHmgH9HEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_Provided_IOrderBooks() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_cMTzoH9HEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_Provided_IBusiness() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_naQ50H9HEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_Provided_IImages() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_5F_UsH9HEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_Provided_IBook() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_QEtBQH9KEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_Provided_ICustomer() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_RJe4AH9KEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_RequiredIBusiness() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_QEtvsH9HEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_RequiredIBook() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_mM2EcH9HEeaHNuq2j06i3A");
	}

	public Role getComponentInterfaceType_RequiredICustomer() throws PalladioElementNotFoundException {
		return model.getComponentInterfaceTypeEntityById("_0Kww0H9HEeaHNuq2j06i3A");
	}

	public ResourceContainer getHardwareResource_Web__Application_Server() throws PalladioElementNotFoundException {
		return model.getHardwareResourceEntityById("_j4BMAH9QEeaHNuq2j06i3A");
	}

	public ResourceContainer getHardwareResource_Database_Server() throws PalladioElementNotFoundException {
		return model.getHardwareResourceEntityById("_ln1j0H9QEeaHNuq2j06i3A");
	}

	public ResourceContainer getHardwareResource_Image_Server() throws PalladioElementNotFoundException {
		return model.getHardwareResourceEntityById("_mtXBcH9QEeaHNuq2j06i3A");
	}

	public org.palladiosimulator.pcm.system.System getSystem_Book_Shop_System()
			throws PalladioElementNotFoundException {
		return model.getSystemEntityById("_obod8H9MEeaHNuq2j06i3A");
	}

	public Role getSystemInterface_Provided_IBrowseBooks() throws PalladioElementNotFoundException {
		return model.getSystemInterfaceEntityById("_gtkJkH9NEeaHNuq2j06i3A");
	}

	public Role getSystemInterface_Provided_IOrderBooks() throws PalladioElementNotFoundException {
		return model.getSystemInterfaceEntityById("_huuEkH9NEeaHNuq2j06i3A");
	}

	public Role getSystemInterface_Provided_IImages() throws PalladioElementNotFoundException {
		return model.getSystemInterfaceEntityById("_kXMisH9NEeaHNuq2j06i3A");
	}

	public EntryLevelSystemCall getUsageBehaviour_Browse_Books() throws PalladioElementNotFoundException {
		return model.getUsageBehaviourEntityById("_ypeqoH9PEeaHNuq2j06i3A");
	}

	public EntryLevelSystemCall getUsageBehaviour_Load_Images() throws PalladioElementNotFoundException {
		return model.getUsageBehaviourEntityById("_84WSYH9PEeaHNuq2j06i3A");
	}

	public EntryLevelSystemCall getUsageBehaviour_Order_Books() throws PalladioElementNotFoundException {
		return model.getUsageBehaviourEntityById("_EPsTYH9QEeaHNuq2j06i3A");
	}

	public EntryLevelSystemCall getUsageBehaviour_outerLoop() throws PalladioElementNotFoundException {
		return model.getUsageBehaviourEntityById("_pP79UDvVEeyeJrtFy53-cg");
	}

	public EntryLevelSystemCall getUsageBehaviour_Branch_Left_InnerLoop() throws PalladioElementNotFoundException {
		return model.getUsageBehaviourEntityById("_t-578DvXEeyeJrtFy53-cg");
	}

	public EntryLevelSystemCall getUsageBehaviour_Branch_Right() throws PalladioElementNotFoundException {
		return model.getUsageBehaviourEntityById("_jAJIUDvXEeyeJrtFy53-cg");
	}

	public DelegationConnector getDelegationConnector_Provided_IBowseBooks_Delegation()
			throws PalladioElementNotFoundException {
		return model.getDelegationConnectorEntityById("_vk0RsH9NEeaHNuq2j06i3A");
	}

	public DelegationConnector getDelegationConnector_Provided_IOrderBooks_Delegation()
			throws PalladioElementNotFoundException {
		return model.getDelegationConnectorEntityById("_wOjLMH9NEeaHNuq2j06i3A");
	}

	public DelegationConnector getDelegationConnector_Provided_IImages_Delegation()
			throws PalladioElementNotFoundException {
		return model.getDelegationConnectorEntityById("_w4W9MH9NEeaHNuq2j06i3A");
	}

	public AllocationContext getAllocationContext_Allocation_Assembly_Book_Shop_Web_Pages_Book_Shop_Web_Pages_Book_Shop_Web_Pages()
			throws PalladioElementNotFoundException {
		return model.getAllocationContextEntityById("_imCKQH9REeaHNuq2j06i3A");
	}

	public AllocationContext getAllocationContext_Allocation_Assembly_Book_Shop_Business_Rules_Book_Shop_Business_Rules_Book_Shop_Business_Rules()
			throws PalladioElementNotFoundException {
		return model.getAllocationContextEntityById("_kU7VAH9REeaHNuq2j06i3A");
	}

	public AllocationContext getAllocationContext_Allocation_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider_Book__Customer_Data_Provider()
			throws PalladioElementNotFoundException {
		return model.getAllocationContextEntityById("_mhzcQH9REeaHNuq2j06i3A");
	}

	public AllocationContext getAllocationContext_Allocation_Assembly_Book_Image_Provider_Book_Image_Provider_Book_Image_Provider()
			throws PalladioElementNotFoundException {
		return model.getAllocationContextEntityById("_njdtkH9REeaHNuq2j06i3A");
	}
}
