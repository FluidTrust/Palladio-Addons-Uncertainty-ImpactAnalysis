package org.palladiosimulator.uncertainty.impact.view.api;

import org.palladiosimulator.uncertainty.impact.view.listener.api.IPalladioViewListener;

public interface ILoadPalladioModelsView extends PluginView {

	public void setPalladioViewViewListerner(IPalladioViewListener listener);

	public void showMessage(String message);

}
