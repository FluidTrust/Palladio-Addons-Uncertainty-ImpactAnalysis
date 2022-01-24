package org.palladiosimulator.uncertainty.impact.view.util;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Convenience class which creates often used view elements with and without default layout data.
 * @author Niko
 *
 */
public class ViewFactory {
	
	private ViewFactory() {

	}


	/**
	 * Create button with default layout (Horizontal Align Fill, h-Span = 1)
	 * @param parent
	 * @param text
	 * @return
	 */
	public static Button createButton(Composite parent, String text) {
		Button button = new Button(parent, SWT.PUSH);
		button.setText(text);
		GridData layout = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		layout.horizontalSpan = 1;
		button.setLayoutData(layout);
		return button;
		
	}
	
	
	/**
	 * Create button with specified Layout
	 * @param parent
	 * @param text
	 * @param layout
	 * @return
	 */
	public static Button createButton(Composite parent, String text, GridData layout) {
		Button button = new Button(parent, SWT.PUSH);
		button.setText(text);
		button.setLayoutData(layout);
		return button;
		
	}
	
	
	/**
	 * Create composite for parent with given number of Columns and given span. Alignment is "H_Align_Fill)
	 * @param parent
	 * @param colNumber
	 * @param hSpan
	 * @return
	 */
	public static Composite createComposite(Composite parent, int colNumber, int hSpan) {
		Composite composite = new Composite(parent, SWT.None);
		GridLayout loadUncertaintyModelCompositeLayout = new GridLayout();
		loadUncertaintyModelCompositeLayout.numColumns = colNumber;
		GridData loadUncertaintyModelCompositeGridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		loadUncertaintyModelCompositeGridData.horizontalSpan = hSpan;
		composite.setLayout(loadUncertaintyModelCompositeLayout);
		composite.setLayoutData(loadUncertaintyModelCompositeGridData);
		
		return composite;
	}
	
	/**
	 * Create scrollable composite with default values.
	 * @param parent
	 * @return
	 */
	public static ScrolledComposite createScrolledComposite(Composite parent) {
		ScrolledComposite sc = new ScrolledComposite(parent, SWT.V_SCROLL);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setMinSize(300, 300);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 500;
		sc.setLayoutData(data);
		
		GridLayout layout = new GridLayout();
		sc.setLayout(layout);
		
		return sc;
	}
	
	/**
	 * Create composite that are used within our dialogs (pop ups)
	 * @param parent
	 * @return
	 */
	public static Composite createDialogComposite(Composite parent) {
		Composite dialogComposite = new Composite(parent, SWT.NONE);
		dialogComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		dialogComposite.setLayout(layout);
		
		return dialogComposite;
	}
	
	/**
	 * Create default Label for given parent with provided Text. 
	 * @param parent
	 * @param text
	 * @return
	 */
	public static Label createLabel(Composite parent, String text) {
		Label label = new Label(parent, SWT.NULL);
		label.setText(text);
		
		return label;
	}
	
	/**
	 * Create Label for given parent with provided Text. Layout: Horizontal alignment and grab escess horizontal space.
	 * @param parent
	 * @param text
	 * @return
	 */
	public static Label createFillingLabel(Composite parent, String text) {
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.horizontalAlignment = GridData.FILL;

		Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(data);
		label.setText(text);
		return label;
	}
	
	/**
	 * Create default Text field for given parent and with given text with given horizontal span. 
	 * @param parent
	 * @param text
	 * @param hSpan
	 * @return
	 */
	public static Text createText(Composite parent, String text, int hSpan) {
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.horizontalSpan = hSpan;
		Text textElement = new Text(parent, SWT.BORDER);
		textElement.setLayoutData(layoutData);
		textElement.setText(text);
		
		return textElement;
	}
	
	/**
	 * Create default Text field for given parent and with given text. 
	 * @param parent
	 * @param text
	 * @return
	 */
	public static Text createText(Composite parent, String text) {
		
		return createText(parent, text, 1);
	}
	
	/**
	 * Create default empty Text field for given parent and with given text. 
	 * @param parent
	 * @param text
	 * @return
	 */
	public static Text createText(Composite parent) {
		
		return createText(parent, "", 1);
	}
	
	
	/**
	 * Create DropDownMenu with default values
	 * @param parent
	 * @return
	 */
	public static ComboViewer createDropDownMenu(Composite parent) {
		ComboViewer dropDownMenu = new ComboViewer(parent, SWT.DROP_DOWN | SWT.READ_ONLY);

		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		dropDownMenu.getCombo().setLayoutData(layoutData);

		dropDownMenu.setContentProvider(ArrayContentProvider.getInstance());
		
		return dropDownMenu;
	}
	
	
}
