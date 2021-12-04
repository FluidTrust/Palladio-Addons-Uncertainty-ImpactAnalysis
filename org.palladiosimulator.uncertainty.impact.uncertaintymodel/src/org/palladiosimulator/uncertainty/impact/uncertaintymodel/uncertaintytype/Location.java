/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getLocation()
 * @model
 * @generated
 */
public enum Location implements Enumerator {
	/**
	 * The '<em><b>System Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_STRUCTURE(0, "SystemStructure", "SYSTEM_STRUCTURE"),

	/**
	 * The '<em><b>System Behaviour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_BEHAVIOUR_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_BEHAVIOUR(1, "SystemBehaviour", "SYSTEM_BEHAVIOUR"),

	/**
	 * The '<em><b>System Environment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_ENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_ENVIRONMENT(2, "SystemEnvironment", "SYSTEM_ENVIRONMENT"),

	/**
	 * The '<em><b>Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(3, "Input", "INPUT");

	/**
	 * The '<em><b>System Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_STRUCTURE
	 * @model name="SystemStructure" literal="SYSTEM_STRUCTURE"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_STRUCTURE_VALUE = 0;

	/**
	 * The '<em><b>System Behaviour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_BEHAVIOUR
	 * @model name="SystemBehaviour" literal="SYSTEM_BEHAVIOUR"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_BEHAVIOUR_VALUE = 1;

	/**
	 * The '<em><b>System Environment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_ENVIRONMENT
	 * @model name="SystemEnvironment" literal="SYSTEM_ENVIRONMENT"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_ENVIRONMENT_VALUE = 2;

	/**
	 * The '<em><b>Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model name="Input" literal="INPUT"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Location[] VALUES_ARRAY =
		new Location[] {
			SYSTEM_STRUCTURE,
			SYSTEM_BEHAVIOUR,
			SYSTEM_ENVIRONMENT,
			INPUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Location> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Location get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Location result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Location getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Location result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Location get(int value) {
		switch (value) {
			case SYSTEM_STRUCTURE_VALUE: return SYSTEM_STRUCTURE;
			case SYSTEM_BEHAVIOUR_VALUE: return SYSTEM_BEHAVIOUR;
			case SYSTEM_ENVIRONMENT_VALUE: return SYSTEM_ENVIRONMENT;
			case INPUT_VALUE: return INPUT;
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
	private Location(int value, String name, String literal) {
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
	
} //Location
