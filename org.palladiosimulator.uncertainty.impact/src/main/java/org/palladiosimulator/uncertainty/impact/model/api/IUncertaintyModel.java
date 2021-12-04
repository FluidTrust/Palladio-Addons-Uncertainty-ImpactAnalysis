package org.palladiosimulator.uncertainty.impact.model.api;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;

public interface IUncertaintyModel {

	List<Uncertainty> getUncertainties();

	void addUncertainty(Uncertainty uncertainty);

	void removeUncertaintyById(String id) throws UncertaintyNotFoundException;

	void loadNewUncertaintyModel(UncertaintyTemplate uncertaintyTemplate);

	void loadUncertaintyModel(String uncertaintyModelPath) throws LoadModelFailedException;

	Uncertainty getUncertaintyById(String id) throws UncertaintyTemplateElementNotFoundException;

	void removeUncertaintiesById(List<String> ids) throws UncertaintyNotFoundException;

	boolean isInitialized();

	UncertaintyContainer getUncertaintyModel();

}