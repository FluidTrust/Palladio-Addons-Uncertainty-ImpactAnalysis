/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Probability Of Revisability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getProbabilityOfRevisability()
 * @model
 * @generated
 */
public enum ProbabilityOfRevisability implements Enumerator {
	/**
	 * The '<em><b>Likely</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKELY_VALUE
	 * @generated
	 * @ordered
	 */
	LIKELY(0, "Likely", "LIKELY"),

	/**
	 * The '<em><b>Unlikely</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLIKELY_VALUE
	 * @generated
	 * @ordered
	 */
	UNLIKELY(1, "Unlikely", "UNLIKELY");

	/**
	 * The '<em><b>Likely</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKELY
	 * @model name="Likely" literal="LIKELY"
	 * @generated
	 * @ordered
	 */
	public static final int LIKELY_VALUE = 0;

	/**
	 * The '<em><b>Unlikely</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLIKELY
	 * @model name="Unlikely" literal="UNLIKELY"
	 * @generated
	 * @ordered
	 */
	public static final int UNLIKELY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Probability Of Revisability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProbabilityOfRevisability[] VALUES_ARRAY =
		new ProbabilityOfRevisability[] {
			LIKELY,
			UNLIKELY,
		};

	/**
	 * A public read-only list of all the '<em><b>Probability Of Revisability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProbabilityOfRevisability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Probability Of Revisability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProbabilityOfRevisability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProbabilityOfRevisability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Probability Of Revisability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProbabilityOfRevisability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProbabilityOfRevisability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Probability Of Revisability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProbabilityOfRevisability get(int value) {
		switch (value) {
			case LIKELY_VALUE: return LIKELY;
			case UNLIKELY_VALUE: return UNLIKELY;
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
	private ProbabilityOfRevisability(int value, String name, String literal) {
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
	
} //ProbabilityOfRevisability
