package org.palladiosimulator.uncertainty.impact.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer;

/**
 * This class represents the uncertainty template model, including the models
 * for ADDs, palladio elements and uncertainty types.
 * 
 * @author Niko
 *
 */
public class UncertaintyTemplateModel extends Model implements IUncertaintyTemplateModel {

	private UncertaintyTemplate uncertainyTemplate;

	private ADDContainer addContainer;
	private UncertaintyTypeContainer uncertaintyTypeContainer;

	@Override
	public void loadUncertaintyTemplateModel(String uncertaintyTemplateModelPath) throws LoadModelFailedException {
		List<String> modelPaths = new ArrayList<>();
		modelPaths.add(uncertaintyTemplateModelPath);
		loadModels(modelPaths);
	}

	@Override
	protected void assignValues(List<Resource> list) throws LoadModelFailedException {
		this.uncertainyTemplate = getModel(list, UncertaintyTemplate.class);

		// Load other model from uncertantyTemplate reference
		this.addContainer = uncertainyTemplate.getAddContainer();
		this.uncertaintyTypeContainer = uncertainyTemplate.getUncertaintyTypeContainer();

	}

	@Override
	public List<ADD> getADDs() {
		if (!isInitialized()) {
			return Collections.emptyList();
		}
		return addContainer.getAdds();
	}

	@Override
	public ADD getAddById(String id) throws UncertaintyTemplateElementNotFoundException {
		if (!isInitialized()) {
			return null;
		}
		return getADDs().stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(() -> new UncertaintyTemplateElementNotFoundException("ADD with id " + id + " not found"));
	}

	

	@Override
	public List<UncertaintyType> getUncertaintyTypes() {
		if (!isInitialized()) {
			return Collections.emptyList();
		}
		return uncertaintyTypeContainer.getUncertaintyTypes();
	}

	@Override
	public UncertaintyType getUncertaintyTypeById(String id) throws UncertaintyTemplateElementNotFoundException {
		if (!isInitialized()) {
			return null;
		}
		return getUncertaintyTypes().stream().filter(x -> x.getId().equals(id)).findFirst().orElseThrow(
				() -> new UncertaintyTemplateElementNotFoundException("Uncertainty type with id " + id + " not found"));

	}

	@Override
	public UncertaintyTemplate getTemplateModel() {
		if (!isInitialized()) {
			return null;
		}
		return this.uncertainyTemplate;
	}
	

	@Override
	public boolean isInitialized() {
		return uncertainyTemplate != null && addContainer != null 
				&& uncertaintyTypeContainer != null;
	}

}
