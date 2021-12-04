/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Manageability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getManageability()
 * @model
 * @generated
 */
public enum Manageability implements Enumerator {
	/**
	 * The '<em><b>Fully Reducible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_REDUCIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	FULLY_REDUCIBLE(0, "FullyReducible", "FULLY_REDUCIBLE"),

	/**
	 * The '<em><b>Partial Reducible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_REDUCIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIAL_REDUCIBLE(1, "PartialReducible", "PARTIAL_REDUCIBLE"),

	/**
	 * The '<em><b>Irreducible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRREDUCIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	IRREDUCIBLE(2, "Irreducible", "IRREDUCIBLE");

	/**
	 * The '<em><b>Fully Reducible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_REDUCIBLE
	 * @model name="FullyReducible" literal="FULLY_REDUCIBLE"
	 * @generated
	 * @ordered
	 */
	public static final int FULLY_REDUCIBLE_VALUE = 0;

	/**
	 * The '<em><b>Partial Reducible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIAL_REDUCIBLE
	 * @model name="PartialReducible" literal="PARTIAL_REDUCIBLE"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIAL_REDUCIBLE_VALUE = 1;

	/**
	 * The '<em><b>Irreducible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRREDUCIBLE
	 * @model name="Irreducible" literal="IRREDUCIBLE"
	 * @generated
	 * @ordered
	 */
	public static final int IRREDUCIBLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Manageability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Manageability[] VALUES_ARRAY =
		new Manageability[] {
			FULLY_REDUCIBLE,
			PARTIAL_REDUCIBLE,
			IRREDUCIBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Manageability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Manageability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Manageability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Manageability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Manageability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Manageability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Manageability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Manageability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Manageability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Manageability get(int value) {
		switch (value) {
			case FULLY_REDUCIBLE_VALUE: return FULLY_REDUCIBLE;
			case PARTIAL_REDUCIBLE_VALUE: return PARTIAL_REDUCIBLE;
			case IRREDUCIBLE_VALUE: return IRREDUCIBLE;
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
	private Manageability(int value, String name, String literal) {
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
	
} //Manageability
