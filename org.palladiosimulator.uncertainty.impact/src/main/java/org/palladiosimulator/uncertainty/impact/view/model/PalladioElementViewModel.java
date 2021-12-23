package org.palladiosimulator.uncertainty.impact.view.model;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ElementWrapper;

/**
 * View model that represents a concrete Architectural element <br>
 * Technically represents {@link ElementWrapper}
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
