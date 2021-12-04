/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resolution Time</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getResolutionTime()
 * @model
 * @generated
 */
public enum ResolutionTime implements Enumerator {
	/**
	 * The '<em><b>Requirements Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENTS_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENTS_TIME(0, "RequirementsTime", "REQUIREMENTS_TIME"),

	/**
	 * The '<em><b>Design Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN_TIME(1, "DesignTime", "DESIGN_TIME"),

	/**
	 * The '<em><b>Deployment Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT_TIME(2, "DeploymentTime", "DEPLOYMENT_TIME"),

	/**
	 * The '<em><b>Run Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUN_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	RUN_TIME(3, "RunTime", "RUN_TIME"),

	/**
	 * The '<em><b>Never</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(4, "Never", "NEVER");

	/**
	 * The '<em><b>Requirements Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENTS_TIME
	 * @model name="RequirementsTime" literal="REQUIREMENTS_TIME"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENTS_TIME_VALUE = 0;

	/**
	 * The '<em><b>Design Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_TIME
	 * @model name="DesignTime" literal="DESIGN_TIME"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_TIME_VALUE = 1;

	/**
	 * The '<em><b>Deployment Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_TIME
	 * @model name="DeploymentTime" literal="DEPLOYMENT_TIME"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_TIME_VALUE = 2;

	/**
	 * The '<em><b>Run Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUN_TIME
	 * @model name="RunTime" literal="RUN_TIME"
	 * @generated
	 * @ordered
	 */
	public static final int RUN_TIME_VALUE = 3;

	/**
	 * The '<em><b>Never</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model name="Never" literal="NEVER"
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Resolution Time</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResolutionTime[] VALUES_ARRAY =
		new ResolutionTime[] {
			REQUIREMENTS_TIME,
			DESIGN_TIME,
			DEPLOYMENT_TIME,
			RUN_TIME,
			NEVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Resolution Time</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResolutionTime> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resolution Time</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResolutionTime get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolutionTime result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution Time</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResolutionTime getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolutionTime result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolution Time</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResolutionTime get(int value) {
		switch (value) {
			case REQUIREMENTS_TIME_VALUE: return REQUIREMENTS_TIME;
			case DESIGN_TIME_VALUE: return DESIGN_TIME;
			case DEPLOYMENT_TIME_VALUE: return DEPLOYMENT_TIME;
			case RUN_TIME_VALUE: return RUN_TIME;
			case NEVER_VALUE: return NEVER;
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
	private ResolutionTime(int value, String name, String literal) {
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
	
} //ResolutionTime
