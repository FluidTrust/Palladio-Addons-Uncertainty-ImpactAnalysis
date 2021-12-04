package org.palladiosimulator.uncertainty.impact.view.api;

import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyTemplateViewListener;

public interface ILoadUncertaintyTemplateModelView extends PluginView {

	public void setUncertaintyTemplateViewListerner(IUncertaintyTemplateViewListener listener);

	public void showMessage(String message);

}
