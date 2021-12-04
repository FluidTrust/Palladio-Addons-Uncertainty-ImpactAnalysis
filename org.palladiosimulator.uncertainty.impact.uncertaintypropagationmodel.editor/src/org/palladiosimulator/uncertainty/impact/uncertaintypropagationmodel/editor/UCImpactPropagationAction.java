package org.palladiosimulator.uncertainty.impact.uncertaintypropagationmodel.editor;



import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.kamp.UCArchitectureVersionPersistencyForKAMP;
import org.palladiosimulator.uncertainty.impact.propagation.kamp.UCImpactPropagationAnalysisForKAMP;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;


/**
 * @generated NOT
 */
public class UCImpactPropagationAction extends AbstractChangePropagationAction<UCArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<UCArchitectureVersion> createChangePropagationAnalysis() {
		return new UCImpactPropagationAnalysisForKAMP();
	}
	
	
	
	@Override
	protected AbstractArchitectureVersionPersistency<UCArchitectureVersion> createArchitectureVersionPersistency() {
		return new UCArchitectureVersionPersistencyForKAMP();
	}

	

}
