/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Information Availability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getInformationAvailability()
 * @model
 * @generated
 */
public enum InformationAvailability implements Enumerator {
	/**
	 * The '<em><b>Statistical Uncertainty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL_UNCERTAINTY_VALUE
	 * @generated
	 * @ordered
	 */
	STATISTICAL_UNCERTAINTY(0, "StatisticalUncertainty", "STATISTICAL_UNCERTAINTY"),

	/**
	 * The '<em><b>Scenario Uncertainty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCENARIO_UNCERTAINTY_VALUE
	 * @generated
	 * @ordered
	 */
	SCENARIO_UNCERTAINTY(1, "ScenarioUncertainty", "SCENARIO_UNCERTAINTY"),

	/**
	 * The '<em><b>Recognized Ignorance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOGNIZED_IGNORANCE_VALUE
	 * @generated
	 * @ordered
	 */
	RECOGNIZED_IGNORANCE(2, "RecognizedIgnorance", "RECOGNIZED_IGNORANCE");

	/**
	 * The '<em><b>Statistical Uncertainty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL_UNCERTAINTY
	 * @model name="StatisticalUncertainty" literal="STATISTICAL_UNCERTAINTY"
	 * @generated
	 * @ordered
	 */
	public static final int STATISTICAL_UNCERTAINTY_VALUE = 0;

	/**
	 * The '<em><b>Scenario Uncertainty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCENARIO_UNCERTAINTY
	 * @model name="ScenarioUncertainty" literal="SCENARIO_UNCERTAINTY"
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO_UNCERTAINTY_VALUE = 1;

	/**
	 * The '<em><b>Recognized Ignorance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOGNIZED_IGNORANCE
	 * @model name="RecognizedIgnorance" literal="RECOGNIZED_IGNORANCE"
	 * @generated
	 * @ordered
	 */
	public static final int RECOGNIZED_IGNORANCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Information Availability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InformationAvailability[] VALUES_ARRAY =
		new InformationAvailability[] {
			STATISTICAL_UNCERTAINTY,
			SCENARIO_UNCERTAINTY,
			RECOGNIZED_IGNORANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Information Availability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InformationAvailability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Information Availability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InformationAvailability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InformationAvailability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Information Availability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InformationAvailability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InformationAvailability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Information Availability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InformationAvailability get(int value) {
		switch (value) {
			case STATISTICAL_UNCERTAINTY_VALUE: return STATISTICAL_UNCERTAINTY;
			case SCENARIO_UNCERTAINTY_VALUE: return SCENARIO_UNCERTAINTY;
			case RECOGNIZED_IGNORANCE_VALUE: return RECOGNIZED_IGNORANCE;
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
	private InformationAvailability(int value, String name, String literal) {
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
	
} //InformationAvailability
