package org.palladiosimulator.uncertainty.impact.view.model;

public class UncertaintyViewModel {

	private String name;

	private String id;

	private UncertaintyTypeViewModel uncertaintyTypeViewModel;

	private PalladioElementViewModel assignedElement;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUncertaintyTypeViewModel(UncertaintyTypeViewModel uncertaintyTypeViewModel) {
		this.uncertaintyTypeViewModel = uncertaintyTypeViewModel;

	}

	public UncertaintyTypeViewModel getUncertaintyTypeViewModel() {
		return uncertaintyTypeViewModel;
	}

	public void setId(String id) {
		this.id = id;

	}

	public String getId() {
		return this.id;
	}

	public PalladioElementViewModel getAssignedElement() {
		return assignedElement;
	}

	public void setAssignedElement(PalladioElementViewModel assignedElement) {
		this.assignedElement = assignedElement;
	}

}
