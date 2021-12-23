package org.palladiosimulator.uncertainty.impact.presenter.util;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Utility class to "translate" ArchitecturalElementTypes in Palladio-related
 * type names.
 * 
 * @author Niko
 *
 */
public class ArchitecturalElementTypeToPalladioElementTypeNameResolver {

	private ArchitecturalElementTypeToPalladioElementTypeNameResolver() {

	}

	private static final Map<ArchitecturalElementTypes, String> architecturalElementTypeToPalladioELementTypeNameResolverMap;
	static {
		architecturalElementTypeToPalladioELementTypeNameResolverMap = new HashMap<>();

		architecturalElementTypeToPalladioELementTypeNameResolverMap
				.put(ArchitecturalElementTypes.BASIC_COMPONENT_BEHAVIOUR, "Basic Component Behaviour (RDSEFF)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap.put(ArchitecturalElementTypes.BASIC_COMPONENT_TYPE,
				"Basic Component Type (BasicComponent)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap
				.put(ArchitecturalElementTypes.COMMUNICATION_COMPONENT, "Communication Component (AssemblyConnector)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap
				.put(ArchitecturalElementTypes.COMMUNICATION_RESOURCE, "Communication Resource (LinkingResource)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap.put(ArchitecturalElementTypes.COMPONENT_INSTANCE,
				"Component Instance (AssemblyContext)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap.put(
				ArchitecturalElementTypes.COMPONENT_INTERFACE_INSTANCE,
				"Component Interface Instance (AssemblyContext&Role)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap
				.put(ArchitecturalElementTypes.COMPONENT_INTERFACE_TYPE, "Component Interface Type (Role)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap.put(ArchitecturalElementTypes.HARDWARE_RESOURCE,
				"Hardware Resource (ResourceContainer)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap.put(ArchitecturalElementTypes.SYSTEM,
				"System (System)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap.put(ArchitecturalElementTypes.SYSTEM_INTERFACE,
				"System Interface (Role)");

		architecturalElementTypeToPalladioELementTypeNameResolverMap.put(ArchitecturalElementTypes.USAGE_BEHAVIOUR,
				"Usage Behaviour (EntryLevelSystemCall)");

	}

	public static String resolveName(ArchitecturalElementTypes type) {

		return architecturalElementTypeToPalladioELementTypeNameResolverMap.get(type);

	}

	public static List<String> resolveNames(List<ArchitecturalElementTypes> types) {

		return types.stream().map(ArchitecturalElementTypeToPalladioElementTypeNameResolver::resolveName).collect(Collectors.toList());

	}

}
