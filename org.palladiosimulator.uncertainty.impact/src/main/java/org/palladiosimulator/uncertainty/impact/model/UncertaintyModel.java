package org.palladiosimulator.uncertainty.impact.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;

/**
 * This class represents the uncertainty model and provides basic functionality
 * to load this model and to add/retrieve uncertainties.
 * 
 * @author Niko
 *
 */
public class UncertaintyModel extends Model implements IUncertaintyModel {

	private UncertaintyContainer uncertaintyContainer;

	@Override
	public void loadUncertaintyModel(String uncertaintyModelPath) throws LoadModelFailedException {
		List<String> modelPaths = new ArrayList<>();
		modelPaths.add(uncertaintyModelPath);
		loadModels(modelPaths);
	}

	@Override
	protected void assignValues(List<Resource> list) throws LoadModelFailedException {

		// called when loadPalladioModels() is executed
		this.uncertaintyContainer = getModel(list, UncertaintyContainer.class);
	}

	@Override
	public List<Uncertainty> getUncertainties() {
		if (!isInitialized()) {
			return Collections.emptyList();
		}

		return uncertaintyContainer.getUncertainties();
	}

	@Override
	public Uncertainty getUncertaintyById(String id) throws UncertaintyTemplateElementNotFoundException {
		if (!isInitialized()) {
			return null;
		}
		return getUncertainties().stream().filter(x -> x.getId().equals(id)).findFirst().orElseThrow(
				() -> new UncertaintyTemplateElementNotFoundException("Uncertainty  with id " + id + " not found"));

	}

	@Override
	public void addUncertainty(Uncertainty uncertainty) {
		if (isInitialized()) {
			uncertaintyContainer.getUncertainties().add(uncertainty);
		}
	}

	@Override
	public void removeUncertaintyById(String id) throws UncertaintyNotFoundException {
		if (isInitialized() && !uncertaintyContainer.getUncertainties().removeIf(u -> u.getId().equals(id)) ) {
				throw new UncertaintyNotFoundException("Uncertainty with id " + id + "not found.");
		}

	}

	@Override
	public void removeUncertaintiesById(List<String> ids) throws UncertaintyNotFoundException {
		if (isInitialized()) {
			for (String id : ids) {
				removeUncertaintyById(id);
			}
		}

	}

	@Override
	public void loadNewUncertaintyModel(UncertaintyTemplate uncertaintyTemplate) {

		uncertaintyContainer = UncertaintyFactory.eINSTANCE.createUncertaintyContainer();
		uncertaintyContainer.setUncertaintyTemplate(uncertaintyTemplate);

	}

	@Override
	public boolean isInitialized() {
		// each model must be initialized
		return uncertaintyContainer != null;

	}

	@Override
	public UncertaintyContainer getUncertaintyModel() {
		return this.uncertaintyContainer;
	}

}
