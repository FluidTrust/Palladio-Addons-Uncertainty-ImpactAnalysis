package org.palladiosimulator.uncertainty.impact.view.listener.api;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

public interface IUncertaintyViewListener {

	public void onAddUncertaintyButtonClicked(UncertaintyViewModel uncertaintyViewModel);

	public void onRemoveUncertaintyButtonClicked(List<UncertaintyViewModel> uncertainties);

	public void onCreateNewUncertaintyModelButtonClicked();

	public void onLoadExistingModelButtonClicked(String uncertaintiesPath);

	public void onSaveUncertaintyModelButtonClicked(String uncertaintyModelPath);

	public void onSavePropagationButtonClicked(List<UncertaintyViewModel> list);

	public void onPropagateUncertaintiesButtonClicked(List<UncertaintyViewModel> collect);

}
