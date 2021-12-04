/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl#getAddClass <em>Add Class</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl#getAmountOfAlternatives <em>Amount Of Alternatives</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl#getProbabilityOfRevisability <em>Probability Of Revisability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl#getPossibilityOfRevisability <em>Possibility Of Revisability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl#getCostsOfRevision <em>Costs Of Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADDImpl extends IdentifierImpl implements ADD {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddClass() <em>Add Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddClass()
	 * @generated
	 * @ordered
	 */
	protected static final ADDClass ADD_CLASS_EDEFAULT = ADDClass.STRUCTURAL_DECISION;

	/**
	 * The cached value of the '{@link #getAddClass() <em>Add Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddClass()
	 * @generated
	 * @ordered
	 */
	protected ADDClass addClass = ADD_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfAlternatives() <em>Amount Of Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfAlternatives()
	 * @generated
	 * @ordered
	 */
	protected static final AmountOfAlternatives AMOUNT_OF_ALTERNATIVES_EDEFAULT = AmountOfAlternatives.CLOSED_SET;

	/**
	 * The cached value of the '{@link #getAmountOfAlternatives() <em>Amount Of Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfAlternatives()
	 * @generated
	 * @ordered
	 */
	protected AmountOfAlternatives amountOfAlternatives = AMOUNT_OF_ALTERNATIVES_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbabilityOfRevisability() <em>Probability Of Revisability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityOfRevisability()
	 * @generated
	 * @ordered
	 */
	protected static final ProbabilityOfRevisability PROBABILITY_OF_REVISABILITY_EDEFAULT = ProbabilityOfRevisability.LIKELY;

	/**
	 * The cached value of the '{@link #getProbabilityOfRevisability() <em>Probability Of Revisability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityOfRevisability()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityOfRevisability probabilityOfRevisability = PROBABILITY_OF_REVISABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPossibilityOfRevisability() <em>Possibility Of Revisability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibilityOfRevisability()
	 * @generated
	 * @ordered
	 */
	protected static final PossibilityOfRevisability POSSIBILITY_OF_REVISABILITY_EDEFAULT = PossibilityOfRevisability.YES;

	/**
	 * The cached value of the '{@link #getPossibilityOfRevisability() <em>Possibility Of Revisability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibilityOfRevisability()
	 * @generated
	 * @ordered
	 */
	protected PossibilityOfRevisability possibilityOfRevisability = POSSIBILITY_OF_REVISABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostsOfRevision() <em>Costs Of Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostsOfRevision()
	 * @generated
	 * @ordered
	 */
	protected static final CostsOfRevision COSTS_OF_REVISION_EDEFAULT = CostsOfRevision.HIGH;

	/**
	 * The cached value of the '{@link #getCostsOfRevision() <em>Costs Of Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostsOfRevision()
	 * @generated
	 * @ordered
	 */
	protected CostsOfRevision costsOfRevision = COSTS_OF_REVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddPackage.Literals.ADD;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddPackage.ADD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDClass getAddClass() {
		return addClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddClass(ADDClass newAddClass) {
		ADDClass oldAddClass = addClass;
		addClass = newAddClass == null ? ADD_CLASS_EDEFAULT : newAddClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddPackage.ADD__ADD_CLASS, oldAddClass, addClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountOfAlternatives getAmountOfAlternatives() {
		return amountOfAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfAlternatives(AmountOfAlternatives newAmountOfAlternatives) {
		AmountOfAlternatives oldAmountOfAlternatives = amountOfAlternatives;
		amountOfAlternatives = newAmountOfAlternatives == null ? AMOUNT_OF_ALTERNATIVES_EDEFAULT : newAmountOfAlternatives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddPackage.ADD__AMOUNT_OF_ALTERNATIVES, oldAmountOfAlternatives, amountOfAlternatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityOfRevisability getProbabilityOfRevisability() {
		return probabilityOfRevisability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabilityOfRevisability(ProbabilityOfRevisability newProbabilityOfRevisability) {
		ProbabilityOfRevisability oldProbabilityOfRevisability = probabilityOfRevisability;
		probabilityOfRevisability = newProbabilityOfRevisability == null ? PROBABILITY_OF_REVISABILITY_EDEFAULT : newProbabilityOfRevisability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddPackage.ADD__PROBABILITY_OF_REVISABILITY, oldProbabilityOfRevisability, probabilityOfRevisability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibilityOfRevisability getPossibilityOfRevisability() {
		return possibilityOfRevisability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibilityOfRevisability(PossibilityOfRevisability newPossibilityOfRevisability) {
		PossibilityOfRevisability oldPossibilityOfRevisability = possibilityOfRevisability;
		possibilityOfRevisability = newPossibilityOfRevisability == null ? POSSIBILITY_OF_REVISABILITY_EDEFAULT : newPossibilityOfRevisability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddPackage.ADD__POSSIBILITY_OF_REVISABILITY, oldPossibilityOfRevisability, possibilityOfRevisability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostsOfRevision getCostsOfRevision() {
		return costsOfRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostsOfRevision(CostsOfRevision newCostsOfRevision) {
		CostsOfRevision oldCostsOfRevision = costsOfRevision;
		costsOfRevision = newCostsOfRevision == null ? COSTS_OF_REVISION_EDEFAULT : newCostsOfRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AddPackage.ADD__COSTS_OF_REVISION, oldCostsOfRevision, costsOfRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AddPackage.ADD__NAME:
				return getName();
			case AddPackage.ADD__ADD_CLASS:
				return getAddClass();
			case AddPackage.ADD__AMOUNT_OF_ALTERNATIVES:
				return getAmountOfAlternatives();
			case AddPackage.ADD__PROBABILITY_OF_REVISABILITY:
				return getProbabilityOfRevisability();
			case AddPackage.ADD__POSSIBILITY_OF_REVISABILITY:
				return getPossibilityOfRevisability();
			case AddPackage.ADD__COSTS_OF_REVISION:
				return getCostsOfRevision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AddPackage.ADD__NAME:
				setName((String)newValue);
				return;
			case AddPackage.ADD__ADD_CLASS:
				setAddClass((ADDClass)newValue);
				return;
			case AddPackage.ADD__AMOUNT_OF_ALTERNATIVES:
				setAmountOfAlternatives((AmountOfAlternatives)newValue);
				return;
			case AddPackage.ADD__PROBABILITY_OF_REVISABILITY:
				setProbabilityOfRevisability((ProbabilityOfRevisability)newValue);
				return;
			case AddPackage.ADD__POSSIBILITY_OF_REVISABILITY:
				setPossibilityOfRevisability((PossibilityOfRevisability)newValue);
				return;
			case AddPackage.ADD__COSTS_OF_REVISION:
				setCostsOfRevision((CostsOfRevision)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AddPackage.ADD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AddPackage.ADD__ADD_CLASS:
				setAddClass(ADD_CLASS_EDEFAULT);
				return;
			case AddPackage.ADD__AMOUNT_OF_ALTERNATIVES:
				setAmountOfAlternatives(AMOUNT_OF_ALTERNATIVES_EDEFAULT);
				return;
			case AddPackage.ADD__PROBABILITY_OF_REVISABILITY:
				setProbabilityOfRevisability(PROBABILITY_OF_REVISABILITY_EDEFAULT);
				return;
			case AddPackage.ADD__POSSIBILITY_OF_REVISABILITY:
				setPossibilityOfRevisability(POSSIBILITY_OF_REVISABILITY_EDEFAULT);
				return;
			case AddPackage.ADD__COSTS_OF_REVISION:
				setCostsOfRevision(COSTS_OF_REVISION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AddPackage.ADD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AddPackage.ADD__ADD_CLASS:
				return addClass != ADD_CLASS_EDEFAULT;
			case AddPackage.ADD__AMOUNT_OF_ALTERNATIVES:
				return amountOfAlternatives != AMOUNT_OF_ALTERNATIVES_EDEFAULT;
			case AddPackage.ADD__PROBABILITY_OF_REVISABILITY:
				return probabilityOfRevisability != PROBABILITY_OF_REVISABILITY_EDEFAULT;
			case AddPackage.ADD__POSSIBILITY_OF_REVISABILITY:
				return possibilityOfRevisability != POSSIBILITY_OF_REVISABILITY_EDEFAULT;
			case AddPackage.ADD__COSTS_OF_REVISION:
				return costsOfRevision != COSTS_OF_REVISION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", addClass: ");
		result.append(addClass);
		result.append(", amountOfAlternatives: ");
		result.append(amountOfAlternatives);
		result.append(", probabilityOfRevisability: ");
		result.append(probabilityOfRevisability);
		result.append(", possibilityOfRevisability: ");
		result.append(possibilityOfRevisability);
		result.append(", costsOfRevision: ");
		result.append(costsOfRevision);
		result.append(')');
		return result.toString();
	}

} //ADDImpl
