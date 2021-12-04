/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage
 * @generated
 */
public class UncertaintypropagationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UncertaintypropagationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintypropagationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UncertaintypropagationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintypropagationSwitch<Adapter> modelSwitch =
		new UncertaintypropagationSwitch<Adapter>() {
			@Override
			public <S extends UCPropagationRulesSeed> Adapter caseAbstractUCImpactRepository(AbstractUCImpactRepository<S> object) {
				return createAbstractUCImpactRepositoryAdapter();
			}
			@Override
			public Adapter caseUCImpactRepository(UCImpactRepository object) {
				return createUCImpactRepositoryAdapter();
			}
			@Override
			public Adapter caseUCPropagationRulesSeed(UCPropagationRulesSeed object) {
				return createUCPropagationRulesSeedAdapter();
			}
			@Override
			public <T extends Entity> Adapter caseUCImpactEntity(UCImpactEntity<T> object) {
				return createUCImpactEntityAdapter();
			}
			@Override
			public Adapter caseCausingUncertainty(CausingUncertainty object) {
				return createCausingUncertaintyAdapter();
			}
			@Override
			public Adapter caseUncertaintyPropagation(UncertaintyPropagation object) {
				return createUncertaintyPropagationAdapter();
			}
			@Override
			public Adapter caseUCImpactAtBasicComponentBehaviour(UCImpactAtBasicComponentBehaviour object) {
				return createUCImpactAtBasicComponentBehaviourAdapter();
			}
			@Override
			public Adapter caseUCImpactAtBasicComponentType(UCImpactAtBasicComponentType object) {
				return createUCImpactAtBasicComponentTypeAdapter();
			}
			@Override
			public Adapter caseUCImpactAtCommunicationComponents(UCImpactAtCommunicationComponents object) {
				return createUCImpactAtCommunicationComponentsAdapter();
			}
			@Override
			public Adapter caseUCImpactAtCommunicationResources(UCImpactAtCommunicationResources object) {
				return createUCImpactAtCommunicationResourcesAdapter();
			}
			@Override
			public Adapter caseUCImpactAtComponentInstance(UCImpactAtComponentInstance object) {
				return createUCImpactAtComponentInstanceAdapter();
			}
			@Override
			public Adapter caseUCImpactAtComponentInterfaceInstance(UCImpactAtComponentInterfaceInstance object) {
				return createUCImpactAtComponentInterfaceInstanceAdapter();
			}
			@Override
			public Adapter caseUCImpactAtComponentInterfaceType(UCImpactAtComponentInterfaceType object) {
				return createUCImpactAtComponentInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseUCImpactAtHardwareResource(UCImpactAtHardwareResource object) {
				return createUCImpactAtHardwareResourceAdapter();
			}
			@Override
			public Adapter caseUCImpactAtSystem(UCImpactAtSystem object) {
				return createUCImpactAtSystemAdapter();
			}
			@Override
			public Adapter caseUCImpactAtSystemInterface(UCImpactAtSystemInterface object) {
				return createUCImpactAtSystemInterfaceAdapter();
			}
			@Override
			public Adapter caseUCImpactAtUsageBehaviour(UCImpactAtUsageBehaviour object) {
				return createUCImpactAtUsageBehaviourAdapter();
			}
			@Override
			public Adapter caseComponentInterfaceInstanceContainer(ComponentInterfaceInstanceContainer object) {
				return createComponentInterfaceInstanceContainerAdapter();
			}
			@Override
			public Adapter caseBasicComponentBehaviourContainer(BasicComponentBehaviourContainer object) {
				return createBasicComponentBehaviourContainerAdapter();
			}
			@Override
			public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> Adapter caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
				return createAbstractModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseAbstractSeedModifications(AbstractSeedModifications object) {
				return createAbstractSeedModificationsAdapter();
			}
			@Override
			public <S, T> Adapter caseAbstractModification(AbstractModification<S, T> object) {
				return createAbstractModificationAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
				return createAbstractChangePropagationStepAdapter();
			}
			@Override
			public Adapter caseChangePropagationStep(ChangePropagationStep object) {
				return createChangePropagationStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository <em>Abstract UC Impact Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository
	 * @generated
	 */
	public Adapter createAbstractUCImpactRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactRepository <em>UC Impact Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactRepository
	 * @generated
	 */
	public Adapter createUCImpactRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed <em>UC Propagation Rules Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed
	 * @generated
	 */
	public Adapter createUCPropagationRulesSeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity <em>UC Impact Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity
	 * @generated
	 */
	public Adapter createUCImpactEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty <em>Causing Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty
	 * @generated
	 */
	public Adapter createCausingUncertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation <em>Uncertainty Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation
	 * @generated
	 */
	public Adapter createUncertaintyPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour <em>UC Impact At Basic Component Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour
	 * @generated
	 */
	public Adapter createUCImpactAtBasicComponentBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType <em>UC Impact At Basic Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType
	 * @generated
	 */
	public Adapter createUCImpactAtBasicComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents <em>UC Impact At Communication Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents
	 * @generated
	 */
	public Adapter createUCImpactAtCommunicationComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources <em>UC Impact At Communication Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources
	 * @generated
	 */
	public Adapter createUCImpactAtCommunicationResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance <em>UC Impact At Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance
	 * @generated
	 */
	public Adapter createUCImpactAtComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance <em>UC Impact At Component Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance
	 * @generated
	 */
	public Adapter createUCImpactAtComponentInterfaceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType <em>UC Impact At Component Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType
	 * @generated
	 */
	public Adapter createUCImpactAtComponentInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource <em>UC Impact At Hardware Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource
	 * @generated
	 */
	public Adapter createUCImpactAtHardwareResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem <em>UC Impact At System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem
	 * @generated
	 */
	public Adapter createUCImpactAtSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface <em>UC Impact At System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface
	 * @generated
	 */
	public Adapter createUCImpactAtSystemInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour <em>UC Impact At Usage Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour
	 * @generated
	 */
	public Adapter createUCImpactAtUsageBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer <em>Component Interface Instance Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer
	 * @generated
	 */
	public Adapter createComponentInterfaceInstanceContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer <em>Basic Component Behaviour Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer
	 * @generated
	 */
	public Adapter createBasicComponentBehaviourContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository <em>Abstract Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository
	 * @generated
	 */
	public Adapter createAbstractModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications <em>Abstract Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications
	 * @generated
	 */
	public Adapter createAbstractSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification <em>Abstract Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification
	 * @generated
	 */
	public Adapter createAbstractModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep <em>Abstract Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep
	 * @generated
	 */
	public Adapter createAbstractChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep <em>Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
	 * @generated
	 */
	public Adapter createChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UncertaintypropagationAdapterFactory
