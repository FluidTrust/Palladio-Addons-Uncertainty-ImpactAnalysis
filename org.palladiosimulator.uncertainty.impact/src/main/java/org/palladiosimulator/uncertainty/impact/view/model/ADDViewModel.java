package org.palladiosimulator.uncertainty.impact.view.model;

/**
 * View model representing an ADD
 * @author Niko
 *
 */
public class ADDViewModel {

	private String amountOfAlternatives;
	private String addClass;
	private String costsOfRevision;
	private String possibilityOfRevisability;
	private String probabilityOfRevisability;
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddClass() {
		return addClass;
	}

	public void setAddClass(String addClass) {
		this.addClass = addClass;
	}

	public String getCostsOfRevision() {
		return costsOfRevision;
	}

	public void setCostsOfRevision(String costsOfRevision) {
		this.costsOfRevision = costsOfRevision;
	}

	public String getPossibilityOfRevisability() {
		return possibilityOfRevisability;
	}

	public void setPossibilityOfRevisability(String possibilityOfRevisability) {
		this.possibilityOfRevisability = possibilityOfRevisability;
	}

	public String getProbabilityOfRevisability() {
		return probabilityOfRevisability;
	}

	public void setProbabilityOfRevisability(String probabilityOfRevisability) {
		this.probabilityOfRevisability = probabilityOfRevisability;
	}

	public String getAmountOfAlternatives() {
		return amountOfAlternatives;
	}

	public void setAmountOfAlternatives(String amountOfAlternatives) {
		this.amountOfAlternatives = amountOfAlternatives;
	}

}
