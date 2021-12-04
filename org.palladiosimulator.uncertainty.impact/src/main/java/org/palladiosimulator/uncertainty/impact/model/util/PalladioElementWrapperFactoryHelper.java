package org.palladiosimulator.uncertainty.impact.model.util;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyFactory;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * This helper class is necessary as not all palladio elements extends
 * {@link Entity} or {@link Identifier}. Such elements are wrapped in
 * self-defined element which are created with this helper class. BE AWARE:
 * objects which are created on the fly need to be contained in some kind of
 * container before saving. Therefore, special logic is necessary as soon as
 * models are saved that reference such elements. For instance: We have to
 * traverse the model, collect the un-contained elements and contain them in
 * some kind of container.
 * 
 * @author Niko
 *
 */
public class PalladioElementWrapperFactoryHelper {

	private static UncertaintyFactory factory = UncertaintyFactory.eINSTANCE;

	private PalladioElementWrapperFactoryHelper() {
		// Prevet instantiation
	}

	public static ComponentInterfaceInstance createComponentInterfaceInstance(AssemblyContext assemblyContext,
			Role role) {
		ComponentInterfaceInstance componentInterfaceInstance = factory.createComponentInterfaceInstance();

		/*
		 * Hack necessary as interface instance is identified via it assembly id and the
		 * actual interface (=role) id
		 */
		String id = assemblyContext.getId() + "$" + role.getId();
		/*
		 * Funny anecdote: Do not use '#' as separator (which I did before using $), as
		 * this character is used as delimiter in XML files. If you use it, EMF throws
		 * some weird error which is not understandable in the first place.
		 */

		componentInterfaceInstance.setId(id);

		componentInterfaceInstance.setAssemblyContext(assemblyContext);
		componentInterfaceInstance.setInterface(role);
		componentInterfaceInstance.setEntityName(assemblyContext.getEntityName() + " - " + role.getEntityName());

		return componentInterfaceInstance;
	}

	public static BasicComponentBehaviour createBasicComponentBehaviour(ResourceDemandingSEFF resourceDemandingSEFF) {
		BasicComponentBehaviour basicComponentBehaviour = factory.createBasicComponentBehaviour();

		// Overwriting ID necessary as BasicComponentBehaviour has to have the same id
		// as the encapsulated ResourceDemandingSeff
		basicComponentBehaviour.setId(resourceDemandingSEFF.getId());
		basicComponentBehaviour.setResourceDemandingSEFF(resourceDemandingSEFF);
		basicComponentBehaviour.setEntityName(resourceDemandingSEFF.getDescribedService__SEFF().getEntityName() + " - "
				+ resourceDemandingSEFF.getBasicComponent_ServiceEffectSpecification().getEntityName());

		return basicComponentBehaviour;
	}
}
