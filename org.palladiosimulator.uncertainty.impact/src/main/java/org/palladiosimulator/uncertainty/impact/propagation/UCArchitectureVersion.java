package org.palladiosimulator.uncertainty.impact.propagation;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;

/**
 * UCArchitectureVersion (Naming comes from KAMP = AbstractArchitectureVersion)
 * holds the actual model (in our case the five palladio models) which is used
 * during the propagation. It references an {@link AbstractUCImpactRepository}
 * which in turn references an {@link UCPropagationRulesSeed}. The
 * {@link UCPropagationRulesSeed} contains the input data for the propagation,
 * whereas the output (= the actual {@link UCImpactEntity}) are added to the
 * {@link AbstractUCImpactRepository} during propagation.
 * 
 * @author Niko
 *
 */
public class UCArchitectureVersion extends AbstractArchitectureVersion<AbstractUCImpactRepository<?>> {

	private Allocation allocation;
	private Repository repository;
	private ResourceEnvironment resourceEnvironment;
	private org.palladiosimulator.pcm.system.System system;
	private UsageModel usageModel;

	public UCArchitectureVersion(String name, Repository repository, System system, Allocation allocation,
			ResourceEnvironment resourceEnvironment, UsageModel usageModel,
			AbstractUCImpactRepository<?> uncertaintyImpactRepository) throws InitializePropagationException {
		super(name, uncertaintyImpactRepository);

		this.allocation = allocation;
		this.repository = repository;
		this.resourceEnvironment = resourceEnvironment;
		this.system = system;
		this.usageModel = usageModel;

		if (allocation == null || repository == null || resourceEnvironment == null || system == null
				|| usageModel == null) {
			throw new InitializePropagationException(
					"Could not initialize UCArchitecture Version as not all relevant models are provided.");
		}

	}

	public Repository getRepository() {
		return repository;
	}

	public org.palladiosimulator.pcm.system.System getSystem() {
		return system;
	}

	public Allocation getAllocation() {
		return allocation;
	}

	public ResourceEnvironment getResourceEnvironment() {
		return resourceEnvironment;
	}

	public UsageModel getUsageModel() {
		return usageModel;
	}

	public AbstractUCImpactRepository<?> getUncertaintyImpactRepository() {

		return this.getModificationMarkRepository();
	}

}
