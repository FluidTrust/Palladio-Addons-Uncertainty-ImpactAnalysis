package org.palladiosimulator.uncertainty.impact.view.model;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper;

/**
 * View model that represents a concrete Palladio element <br>
 * Technically represents {@link PalladioElementWrapper}
 * 
 * @author Niko
 *
 */
public class PalladioElementViewModel {

	private String name;

	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
