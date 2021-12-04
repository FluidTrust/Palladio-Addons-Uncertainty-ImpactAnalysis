package org.palladiosimulator.uncertainty.impact.model;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.DelegationConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;

/**
 * This class represents the Palladio Model, including allocation, repository,
 * resourceEnvironment, system and usage model. Also it provides the capability
 * to load those models from given relative paths (path to file which is located
 * within workspace). Further, convencience methods are provided to retrieve
 * elements (by id) from the respective models.
 * 
 * @author Niko
 *
 */
public class PalladioModel extends ModelLoader implements IPalladioModel {

	private Allocation allocation;
	private Repository repository;
	private ResourceEnvironment resourceEnvironment;
	private org.palladiosimulator.pcm.system.System system;
	private UsageModel usageModel;

	@Override
	public void loadPalladioModels(List<String> modelPaths) throws LoadModelFailedException {
		loadModels(modelPaths);
	}

	@Override
	protected void assignValues(List<Resource> list) throws LoadModelFailedException {
		// called when loadPalladioModels() is executed
		this.allocation = this.getModel(list, Allocation.class);
		this.repository = this.getModel(list, Repository.class);
		this.resourceEnvironment = this.getModel(list, ResourceEnvironment.class);
		this.system = this.getModel(list, org.palladiosimulator.pcm.system.System.class);
		this.usageModel = this.getModel(list, UsageModel.class);
	}

	@Override
	public boolean isInitialized() {
		// each model must be initialized
		return allocation != null && repository != null && resourceEnvironment != null && system != null
				&& usageModel != null;

	}

	@Override
	public Allocation getAllocation() {
		return allocation;
	}

	@Override
	public Repository getRepository() {
		return repository;
	}

	@Override
	public ResourceEnvironment getResourceEnvironment() {
		return resourceEnvironment;
	}

	@Override
	public org.palladiosimulator.pcm.system.System getSystem() {
		return system;
	}

	@Override
	public UsageModel getUsageModel() {
		return usageModel;
	}

	@Override
	public List<BasicComponentBehaviour> getAllBasicComponentBehaviourEntities()
			throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllBasicComponentBehaviourEntities(repository);

	}

	@Override
	public BasicComponentBehaviour getBasicComponentBehaviourEntityById(String id)
			throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getBasicComponentBehaviourEntityById(repository, id);
	}

	@Override
	public List<BasicComponent> getAllBasicComponentTypeEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllBasicComponentTypeEntities(repository);
	}

	@Override
	public BasicComponent getBasicComponentTypeEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getBasicComponentTypeEntityById(repository, id);
	}

	@Override
	public List<AssemblyConnector> getAllCommunicationComponentEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllCommunicationComponentEntities(system);
	}

	@Override
	public AssemblyConnector getCommunicationComponentEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getCommunicationComponentEntityById(system, id);
	}

	@Override
	public List<LinkingResource> getAllCommunicationResourceEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllCommunicationResourceEntities(resourceEnvironment);
	}

	@Override
	public LinkingResource getCommunicationResourceEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getCommunicationResourceEntityById(resourceEnvironment, id);
	}

	@Override
	public List<AssemblyContext> getAllComponentInstanceEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllComponentInstanceEntities(system);
	}

	@Override
	public AssemblyContext getComponentInstanceEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getComponentInstanceEntityById(system, id);
	}

	@Override
	public List<ComponentInterfaceInstance> getAllComponentInterfaceInstanceEntities()
			throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllComponentInterfaceInstanceEntities(system);
	}

	@Override
	public ComponentInterfaceInstance getComponentInterfaceInstanceEntityById(String id)
			throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getComponentInterfaceInstanceEntityById(system, id);
	}

	@Override
	public List<Role> getAllComponentInterfaceTypeEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllComponentInterfaceTypeEntities(repository);
	}

	@Override
	public Role getComponentInterfaceTypeEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getComponentInterfaceTypeEntityById(repository, id);
	}

	@Override
	public List<ResourceContainer> getAllHardwareResourceEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllHardwareResourceEntities(resourceEnvironment);
	}

	@Override
	public ResourceContainer getHardwareResourceEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getHardwareResourceEntityById(resourceEnvironment, id);
	}

	@Override
	public List<System> getAllSystemEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllSystemEntities(system);
	}

	@Override
	public System getSystemEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getSystemEntityById(system, id);
	}

	@Override
	public List<Role> getAllSystemInterfaceEntities() throws PalladioElementNotFoundException {

		return PalladioModelsLookupHelper.getAllSystemInterfaceEntities(system);
	}

	@Override
	public Role getSystemInterfaceEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getSystemInterfaceEntityById(system, id);
	}

	@Override
	public List<EntryLevelSystemCall> getAllUsageBehaviourEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllUsageBehaviourEntities(usageModel);
	}

	@Override
	public EntryLevelSystemCall getUsageBehaviourEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getUsageBehaviourEntityById(usageModel, id);
	}
	
	@Override
	public List<DelegationConnector> getAllDelegationConnectorEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllDelegationConnectorEntities(system);
	}

	@Override
	public DelegationConnector getDelegationConnectorEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getDelegationConnectorEntityById(system, id);
	}
	
	
	@Override
	public List<AllocationContext> getAllAllocationContextEntities() throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllAllocationContextEntities(allocation);
	}

	@Override
	public AllocationContext getAllocationContextEntityById(String id) throws PalladioElementNotFoundException {
		return PalladioModelsLookupHelper.getAllocationContextEntityById(allocation, id);
	}


}
