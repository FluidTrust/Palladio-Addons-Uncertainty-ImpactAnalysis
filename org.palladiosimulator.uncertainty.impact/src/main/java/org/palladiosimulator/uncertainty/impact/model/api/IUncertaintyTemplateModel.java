package org.palladiosimulator.uncertainty.impact.model.api;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;

public interface IUncertaintyTemplateModel {

	List<ADD> getADDs();

	ADD getAddById(String id) throws UncertaintyTemplateElementNotFoundException;

	List<UncertaintyType> getUncertaintyTypes();

	UncertaintyType getUncertaintyTypeById(String id) throws UncertaintyTemplateElementNotFoundException;

	void loadUncertaintyTemplateModel(String uncertaintyTemplateModelPath) throws LoadModelFailedException;

	UncertaintyTemplate getTemplateModel();

	boolean isInitialized();

}
