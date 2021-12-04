/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ADD Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADDClass()
 * @model
 * @generated
 */
public enum ADDClass implements Enumerator {
	/**
	 * The '<em><b>Structural Decision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURAL_DECISION_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURAL_DECISION(0, "StructuralDecision", "STRUCTURAL_DECISION"),

	/**
	 * The '<em><b>Behavioural Decision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOURAL_DECISION_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOURAL_DECISION(1, "BehaviouralDecision", "BEHAVIOURAL_DECISION"),

	/**
	 * The '<em><b>Property Decision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_DECISION_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY_DECISION(2, "PropertyDecision", "PROPERTY_DECISION"),

	/**
	 * The '<em><b>Executive Decision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTIVE_DECISION_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTIVE_DECISION(3, "ExecutiveDecision", "EXECUTIVE_DECISION");

	/**
	 * The '<em><b>Structural Decision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURAL_DECISION
	 * @model name="StructuralDecision" literal="STRUCTURAL_DECISION"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURAL_DECISION_VALUE = 0;

	/**
	 * The '<em><b>Behavioural Decision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOURAL_DECISION
	 * @model name="BehaviouralDecision" literal="BEHAVIOURAL_DECISION"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOURAL_DECISION_VALUE = 1;

	/**
	 * The '<em><b>Property Decision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_DECISION
	 * @model name="PropertyDecision" literal="PROPERTY_DECISION"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_DECISION_VALUE = 2;

	/**
	 * The '<em><b>Executive Decision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTIVE_DECISION
	 * @model name="ExecutiveDecision" literal="EXECUTIVE_DECISION"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTIVE_DECISION_VALUE = 3;

	/**
	 * An array of all the '<em><b>ADD Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ADDClass[] VALUES_ARRAY =
		new ADDClass[] {
			STRUCTURAL_DECISION,
			BEHAVIOURAL_DECISION,
			PROPERTY_DECISION,
			EXECUTIVE_DECISION,
		};

	/**
	 * A public read-only list of all the '<em><b>ADD Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ADDClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ADD Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ADDClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ADDClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ADD Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ADDClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ADDClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ADD Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ADDClass get(int value) {
		switch (value) {
			case STRUCTURAL_DECISION_VALUE: return STRUCTURAL_DECISION;
			case BEHAVIOURAL_DECISION_VALUE: return BEHAVIOURAL_DECISION;
			case PROPERTY_DECISION_VALUE: return PROPERTY_DECISION;
			case EXECUTIVE_DECISION_VALUE: return EXECUTIVE_DECISION;
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
	private ADDClass(int value, String name, String literal) {
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
	
} //ADDClass
