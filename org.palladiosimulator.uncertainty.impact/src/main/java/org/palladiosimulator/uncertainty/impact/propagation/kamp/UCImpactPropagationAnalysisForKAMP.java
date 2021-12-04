package org.palladiosimulator.uncertainty.impact.propagation.kamp;

import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.UCImpactPropagationAnalysis;

import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;

/**
 * This class represents the entry point for the KAMP framework for the
 * propagation. We only delegate to the actual propagation.
 * 
 * @author Niko
 *
 */
public class UCImpactPropagationAnalysisForKAMP implements AbstractChangePropagationAnalysis<UCArchitectureVersion> {

	@Override
	public void runChangePropagationAnalysis(UCArchitectureVersion version) {

		try {
			UCImpactPropagationAnalysis.runUncertaintyPropagationAnalysis(version);
		} catch (UncertaintyPropagationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
