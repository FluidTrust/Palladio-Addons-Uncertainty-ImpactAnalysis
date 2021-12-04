/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Palladio Element Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage#getPalladioElementTypes()
 * @model
 * @generated
 */
public enum PalladioElementTypes implements Enumerator {
	/**
	 * The '<em><b>System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM(0, "System", "SYSTEM"),

	/**
	 * The '<em><b>Hardware Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE_RESOURCE(1, "HardwareResource", "HARDWARE_RESOURCE"),

	/**
	 * The '<em><b>Basic Component Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_COMPONENT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_COMPONENT_TYPE(2, "BasicComponent_Type", "BASIC_COMPONENT_TYPE"),

	/**
	 * The '<em><b>Component Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_INSTANCE(3, "Component_Instance", "COMPONENT_INSTANCE"),

	/**
	 * The '<em><b>Basic Component Behaviour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_COMPONENT_BEHAVIOUR_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_COMPONENT_BEHAVIOUR(4, "BasicComponentBehaviour", "BASIC_COMPONENT_BEHAVIOUR"),

	/**
	 * The '<em><b>Communication Components</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_COMPONENTS_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_COMPONENTS(5, "Communication_Components", "COMMUNICATION_COMPONENTS"),

	/**
	 * The '<em><b>Communication Resources</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_RESOURCES_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_RESOURCES(6, "Communication_Resources", "COMMUNICATION_RESOURCES"),

	/**
	 * The '<em><b>System Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_INTERFACE(7, "SystemInterface", "SYSTEM_INTERFACE"),

	/**
	 * The '<em><b>Component Interface Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INTERFACE_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_INTERFACE_INSTANCE(8, "ComponentInterface_Instance", "COMPONENT_INTERFACE_INSTANCE"),

	/**
	 * The '<em><b>Component Interface Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INTERFACE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_INTERFACE_TYPE(9, "ComponentInterface_Type", "COMPONENT_INTERFACE_TYPE"),

	/**
	 * The '<em><b>Usage Behaviour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_BEHAVIOUR_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE_BEHAVIOUR(10, "UsageBehaviour", "USAGE_BEHAVIOUR");

	/**
	 * The '<em><b>System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @model name="System" literal="SYSTEM"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_VALUE = 0;

	/**
	 * The '<em><b>Hardware Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_RESOURCE
	 * @model name="HardwareResource" literal="HARDWARE_RESOURCE"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_RESOURCE_VALUE = 1;

	/**
	 * The '<em><b>Basic Component Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_COMPONENT_TYPE
	 * @model name="BasicComponent_Type" literal="BASIC_COMPONENT_TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_COMPONENT_TYPE_VALUE = 2;

	/**
	 * The '<em><b>Component Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INSTANCE
	 * @model name="Component_Instance" literal="COMPONENT_INSTANCE"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_INSTANCE_VALUE = 3;

	/**
	 * The '<em><b>Basic Component Behaviour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_COMPONENT_BEHAVIOUR
	 * @model name="BasicComponentBehaviour" literal="BASIC_COMPONENT_BEHAVIOUR"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_COMPONENT_BEHAVIOUR_VALUE = 4;

	/**
	 * The '<em><b>Communication Components</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_COMPONENTS
	 * @model name="Communication_Components" literal="COMMUNICATION_COMPONENTS"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_COMPONENTS_VALUE = 5;

	/**
	 * The '<em><b>Communication Resources</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_RESOURCES
	 * @model name="Communication_Resources" literal="COMMUNICATION_RESOURCES"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_RESOURCES_VALUE = 6;

	/**
	 * The '<em><b>System Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_INTERFACE
	 * @model name="SystemInterface" literal="SYSTEM_INTERFACE"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_INTERFACE_VALUE = 7;

	/**
	 * The '<em><b>Component Interface Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INTERFACE_INSTANCE
	 * @model name="ComponentInterface_Instance" literal="COMPONENT_INTERFACE_INSTANCE"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_INTERFACE_INSTANCE_VALUE = 8;

	/**
	 * The '<em><b>Component Interface Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_INTERFACE_TYPE
	 * @model name="ComponentInterface_Type" literal="COMPONENT_INTERFACE_TYPE"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_INTERFACE_TYPE_VALUE = 9;

	/**
	 * The '<em><b>Usage Behaviour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_BEHAVIOUR
	 * @model name="UsageBehaviour" literal="USAGE_BEHAVIOUR"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_BEHAVIOUR_VALUE = 10;

	/**
	 * An array of all the '<em><b>Palladio Element Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PalladioElementTypes[] VALUES_ARRAY =
		new PalladioElementTypes[] {
			SYSTEM,
			HARDWARE_RESOURCE,
			BASIC_COMPONENT_TYPE,
			COMPONENT_INSTANCE,
			BASIC_COMPONENT_BEHAVIOUR,
			COMMUNICATION_COMPONENTS,
			COMMUNICATION_RESOURCES,
			SYSTEM_INTERFACE,
			COMPONENT_INTERFACE_INSTANCE,
			COMPONENT_INTERFACE_TYPE,
			USAGE_BEHAVIOUR,
		};

	/**
	 * A public read-only list of all the '<em><b>Palladio Element Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PalladioElementTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Palladio Element Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PalladioElementTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PalladioElementTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Palladio Element Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PalladioElementTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PalladioElementTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Palladio Element Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PalladioElementTypes get(int value) {
		switch (value) {
			case SYSTEM_VALUE: return SYSTEM;
			case HARDWARE_RESOURCE_VALUE: return HARDWARE_RESOURCE;
			case BASIC_COMPONENT_TYPE_VALUE: return BASIC_COMPONENT_TYPE;
			case COMPONENT_INSTANCE_VALUE: return COMPONENT_INSTANCE;
			case BASIC_COMPONENT_BEHAVIOUR_VALUE: return BASIC_COMPONENT_BEHAVIOUR;
			case COMMUNICATION_COMPONENTS_VALUE: return COMMUNICATION_COMPONENTS;
			case COMMUNICATION_RESOURCES_VALUE: return COMMUNICATION_RESOURCES;
			case SYSTEM_INTERFACE_VALUE: return SYSTEM_INTERFACE;
			case COMPONENT_INTERFACE_INSTANCE_VALUE: return COMPONENT_INTERFACE_INSTANCE;
			case COMPONENT_INTERFACE_TYPE_VALUE: return COMPONENT_INTERFACE_TYPE;
			case USAGE_BEHAVIOUR_VALUE: return USAGE_BEHAVIOUR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PalladioElementTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PalladioElementTypes
