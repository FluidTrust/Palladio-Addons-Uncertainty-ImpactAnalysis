
package org.palladiosimulator.uncertainty.impact.propagation.util;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;
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
 * Resolves mapping between affected palladio element types and the respective
 * UCImpactEntity type. Each affectes palladio element which we want to support
 * maps to a specific elements that extends {@link UCImpactEntity}
 * 
 * @author Niko
 *
 */
public class UncertaintyTypesToUCImpactTypeResolver {
	
	private UncertaintyTypesToUCImpactTypeResolver() {

	}

	private static final Map<PalladioElementTypes, Class<? extends UCImpactEntity<? extends Entity>>> fromElementTypeToImpactTypeResolverMap;
	static {
		fromElementTypeToImpactTypeResolverMap = new HashMap<>();
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.BASIC_COMPONENT_BEHAVIOUR,
				UCImpactAtBasicComponentBehaviour.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.BASIC_COMPONENT_TYPE,
				UCImpactAtBasicComponentType.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.COMMUNICATION_COMPONENTS,
				UCImpactAtCommunicationComponents.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.COMMUNICATION_RESOURCES,
				UCImpactAtCommunicationResources.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.COMPONENT_INSTANCE,
				UCImpactAtComponentInstance.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.COMPONENT_INTERFACE_INSTANCE,
				UCImpactAtComponentInterfaceInstance.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.COMPONENT_INTERFACE_TYPE,
				UCImpactAtComponentInterfaceType.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.HARDWARE_RESOURCE,
				UCImpactAtHardwareResource.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.SYSTEM, UCImpactAtSystem.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.SYSTEM_INTERFACE,
				UCImpactAtSystemInterface.class);
		fromElementTypeToImpactTypeResolverMap.put(PalladioElementTypes.USAGE_BEHAVIOUR,
				UCImpactAtUsageBehaviour.class);
	}

	public static Class<? extends UCImpactEntity<? extends Entity>> resolve(PalladioElementTypes type) {
		return fromElementTypeToImpactTypeResolverMap.get(type);
	}

}
