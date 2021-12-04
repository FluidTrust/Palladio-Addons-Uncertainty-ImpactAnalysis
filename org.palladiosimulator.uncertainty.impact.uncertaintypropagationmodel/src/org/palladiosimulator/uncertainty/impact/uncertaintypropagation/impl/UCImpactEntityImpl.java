/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC Impact Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UCImpactEntityImpl<T extends Entity> extends AbstractModificationImpl<T, CausingUncertainty> implements UCImpactEntity<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintypropagationPackage.Literals.UC_IMPACT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CausingUncertainty> getCausingElements() {
		if (causingElements == null) {
			causingElements = new EObjectResolvingEList<CausingUncertainty>(CausingUncertainty.class, this, UncertaintypropagationPackage.UC_IMPACT_ENTITY__CAUSING_ELEMENTS);
		}
		return causingElements;
	}

} //UCImpactEntityImpl
