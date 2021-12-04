/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Amount Of Alternatives</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getAmountOfAlternatives()
 * @model
 * @generated
 */
public enum AmountOfAlternatives implements Enumerator {
	/**
	 * The '<em><b>Closed Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_SET_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED_SET(0, "ClosedSet", "CLOSED_SET"),

	/**
	 * The '<em><b>Open Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SET_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SET(1, "OpenSet", "OPEN_SET");

	/**
	 * The '<em><b>Closed Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_SET
	 * @model name="ClosedSet" literal="CLOSED_SET"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_SET_VALUE = 0;

	/**
	 * The '<em><b>Open Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SET
	 * @model name="OpenSet" literal="OPEN_SET"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SET_VALUE = 1;

	/**
	 * An array of all the '<em><b>Amount Of Alternatives</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AmountOfAlternatives[] VALUES_ARRAY =
		new AmountOfAlternatives[] {
			CLOSED_SET,
			OPEN_SET,
		};

	/**
	 * A public read-only list of all the '<em><b>Amount Of Alternatives</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AmountOfAlternatives> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Amount Of Alternatives</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmountOfAlternatives get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountOfAlternatives result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Of Alternatives</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmountOfAlternatives getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountOfAlternatives result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Of Alternatives</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AmountOfAlternatives get(int value) {
		switch (value) {
			case CLOSED_SET_VALUE: return CLOSED_SET;
			case OPEN_SET_VALUE: return OPEN_SET;
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
	private AmountOfAlternatives(int value, String name, String literal) {
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
	
} //AmountOfAlternatives
