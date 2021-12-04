package org.palladiosimulator.uncertainty.impact.propagation;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;

/**
 * Helper class to create empty {@link UCArchitectureVersion} as we use it
 * without main KAMP framework
 * 
 * @author Niko
 *
 */
public class UCArchitectureVersionFacade {

	/**
	 * Create {@link UCArchitectureVersion} with empty
	 * {@link AbstractUCImpactRepository} and empty {@link UCPropagationRulesSeed}
	 * 
	 * @param name
	 * @param repository
	 * @param system
	 * @param allocation
	 * @param resourceEnvironment
	 * @param usageModel
	 * @return
	 * @throws InitializePropagationException
	 */
	public static UCArchitectureVersion createEmptyModel(String name, Repository repository, System system,
			Allocation allocation, ResourceEnvironment resourceEnvironment, UsageModel usageModel)
			throws InitializePropagationException {

		// Create uncertainty impact repository
		AbstractUCImpactRepository<UCPropagationRulesSeed> uncertaintyImpactRepository = UncertaintyPropagationFactoryHelper
				.createUCImpactRepository();

		/*
		 * Add uncertainty propagation seed (rules will be added by the uncertainty /
		 * impact analysis)
		 */
		uncertaintyImpactRepository
				.setSeedModifications(UncertaintyPropagationFactoryHelper.createUCPropagationRulesSeed());

		return new UCArchitectureVersion(name, repository, system, allocation, resourceEnvironment, usageModel,
				uncertaintyImpactRepository);
	}

}
