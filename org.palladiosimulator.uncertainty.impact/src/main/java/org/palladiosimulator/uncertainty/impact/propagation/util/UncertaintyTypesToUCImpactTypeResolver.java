
package org.palladiosimulator.uncertainty.impact.propagation.util;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;

/**
 * Resolves mapping between affected architectural element types and the
 * respective {@link UCImpactEntity} type.
 * 
 * 
 * @author Niko
 *
 */
public class UncertaintyTypesToUCImpactTypeResolver {

	private UncertaintyTypesToUCImpactTypeResolver() {

	}

	private static final Map<ArchitecturalElementTypes, Class<? extends UCImpactEntity<? extends Entity>>> fromElementTypeToImpactTypeResolverMap;
	static {
		fromElementTypeToImpactTypeResolverMap = new HashMap<>();
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.BASIC_COMPONENT_BEHAVIOUR,
				UCImpactAtBasicComponentBehaviour.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.BASIC_COMPONENT_TYPE,
				UCImpactAtBasicComponentType.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.COMMUNICATION_COMPONENT,
				UCImpactAtCommunicationComponents.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.COMMUNICATION_RESOURCE,
				UCImpactAtCommunicationResources.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.COMPONENT_INSTANCE,
				UCImpactAtComponentInstance.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.COMPONENT_INTERFACE_INSTANCE,
				UCImpactAtComponentInterfaceInstance.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.COMPONENT_INTERFACE_TYPE,
				UCImpactAtComponentInterfaceType.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.HARDWARE_RESOURCE,
				UCImpactAtHardwareResource.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.SYSTEM, UCImpactAtSystem.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.SYSTEM_INTERFACE,
				UCImpactAtSystemInterface.class);
		fromElementTypeToImpactTypeResolverMap.put(ArchitecturalElementTypes.USAGE_BEHAVIOUR,
				UCImpactAtUsageBehaviour.class);
	}

	public static Class<? extends UCImpactEntity<? extends Entity>> resolve(ArchitecturalElementTypes type) {
		return fromElementTypeToImpactTypeResolverMap.get(type);
	}

}
