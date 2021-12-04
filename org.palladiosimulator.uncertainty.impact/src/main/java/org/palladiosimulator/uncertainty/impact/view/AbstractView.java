package org.palladiosimulator.uncertainty.impact.view;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Composite;

/**
 * Each View extends this class for basic functionality such as show message.
 * @author Niko
 *
 */
public abstract class AbstractView {

	private Composite parent;

	public AbstractView(Composite parent) {
		this.parent = parent;
	}

	public void showMessage(String message) {
		MessageDialog.openInformation(parent.getShell(), "Uncertainty View", message);
	}

}
