package org.palladiosimulator.uncertainty.impact.view.model;

import java.util.ArrayList;
import java.util.List;

public class UncertaintyPropagationResultViewModel {

	private UncertaintyViewModel uncertainty;

	private List<UCImpactUncertaintyAffectedElementViewModel> affectedElements;

	public UncertaintyPropagationResultViewModel() {
		affectedElements = new ArrayList<>();
	}

	public UncertaintyViewModel getUncertainty() {
		return uncertainty;
	}

	public void setUncertainty(UncertaintyViewModel uncertainty) {
		this.uncertainty = uncertainty;
	}

	public List<UCImpactUncertaintyAffectedElementViewModel> getAffectedElements() {
		return affectedElements;
	}

	public void addAffectedElement(String element, List<String> path) {
		UCImpactUncertaintyAffectedElementViewModel affectedElement = this.new UCImpactUncertaintyAffectedElementViewModel();
		affectedElement.setElement(element);
		affectedElement.setPath(path);
		this.affectedElements.add(affectedElement);
	}

	public class UCImpactUncertaintyAffectedElementViewModel {
		private String element;
		private List<String> path;

		public String getElement() {
			return element;
		}

		public void setElement(String element) {
			this.element = element;
		}

		public List<String> getPath() {
			return path;
		}

		public void setPath(List<String> path) {
			this.path = path;
		}

	}

}
