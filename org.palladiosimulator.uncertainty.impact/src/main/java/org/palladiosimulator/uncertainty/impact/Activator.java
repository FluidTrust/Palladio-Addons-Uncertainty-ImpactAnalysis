package org.palladiosimulator.uncertainty.impact;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

/**
 * The activator class controls the plug-in life cycle. It is executed on start up (see MANIFEST.MF)
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "UncertaintyPluginProject";

	// The shared instance
	private static Activator plugin;


	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		registerModelExtension();
	}

	private static void registerModelExtension() {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(UncertaintyPackage.eNAME, new XMIResourceFactoryImpl());

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}