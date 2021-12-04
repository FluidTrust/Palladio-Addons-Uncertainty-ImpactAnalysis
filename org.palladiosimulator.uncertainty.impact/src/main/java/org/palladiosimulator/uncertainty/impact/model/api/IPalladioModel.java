package org.palladiosimulator.uncertainty.impact.model.api;

import java.util.List;

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
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;

public interface IPalladioModel {

	public void loadPalladioModels(List<String> modelPaths) throws LoadModelFailedException;

	public boolean isInitialized();

	public List<BasicComponentBehaviour> getAllBasicComponentBehaviourEntities()
			throws PalladioElementNotFoundException;

	public BasicComponentBehaviour getBasicComponentBehaviourEntityById(String id)
			throws PalladioElementNotFoundException;

	public List<BasicComponent> getAllBasicComponentTypeEntities() throws PalladioElementNotFoundException;

	public BasicComponent getBasicComponentTypeEntityById(String id) throws PalladioElementNotFoundException;

	public List<AssemblyConnector> getAllCommunicationComponentEntities() throws PalladioElementNotFoundException;

	public AssemblyConnector getCommunicationComponentEntityById(String id) throws PalladioElementNotFoundException;

	public List<LinkingResource> getAllCommunicationResourceEntities() throws PalladioElementNotFoundException;

	public LinkingResource getCommunicationResourceEntityById(String id) throws PalladioElementNotFoundException;

	public List<AssemblyContext> getAllComponentInstanceEntities() throws PalladioElementNotFoundException;

	public AssemblyContext getComponentInstanceEntityById(String id) throws PalladioElementNotFoundException;

	public List<ComponentInterfaceInstance> getAllComponentInterfaceInstanceEntities()
			throws PalladioElementNotFoundException;

	public ComponentInterfaceInstance getComponentInterfaceInstanceEntityById(String id)
			throws PalladioElementNotFoundException;

	public List<Role> getAllComponentInterfaceTypeEntities() throws PalladioElementNotFoundException;

	public Role getComponentInterfaceTypeEntityById(String id) throws PalladioElementNotFoundException;

	public List<ResourceContainer> getAllHardwareResourceEntities() throws PalladioElementNotFoundException;

	public ResourceContainer getHardwareResourceEntityById(String id) throws PalladioElementNotFoundException;

	public List<org.palladiosimulator.pcm.system.System> getAllSystemEntities() throws PalladioElementNotFoundException;

	public org.palladiosimulator.pcm.system.System getSystemEntityById(String id)
			throws PalladioElementNotFoundException;

	public List<Role> getAllSystemInterfaceEntities() throws PalladioElementNotFoundException;

	public Role getSystemInterfaceEntityById(String id) throws PalladioElementNotFoundException;

	public List<EntryLevelSystemCall> getAllUsageBehaviourEntities() throws PalladioElementNotFoundException;

	public EntryLevelSystemCall getUsageBehaviourEntityById(String Id) throws PalladioElementNotFoundException;

	Allocation getAllocation();

	Repository getRepository();

	ResourceEnvironment getResourceEnvironment();

	System getSystem();

	UsageModel getUsageModel();

	public List<DelegationConnector> getAllDelegationConnectorEntities() throws PalladioElementNotFoundException;

	public DelegationConnector getDelegationConnectorEntityById(String id) throws PalladioElementNotFoundException;

	List<AllocationContext> getAllAllocationContextEntities() throws PalladioElementNotFoundException;

	AllocationContext getAllocationContextEntityById(String id) throws PalladioElementNotFoundException;

}
