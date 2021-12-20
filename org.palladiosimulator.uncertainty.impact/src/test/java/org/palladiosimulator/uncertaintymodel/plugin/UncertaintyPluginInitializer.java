package org.palladiosimulator.uncertaintymodel.plugin;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.uncertainty.impact.Activator;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;
import tools.mdsd.library.standalone.initialization.StandaloneInitializerBuilder;
import tools.mdsd.library.standalone.initialization.log4j.Log4jInitilizationTask;

public class UncertaintyPluginInitializer {
	
private UncertaintyPluginInitializer() {
		
	}


	public static void init() throws StandaloneInitializationException {

	 	initPlugin();
		registerModelExtension();

	}

	private static void initPlugin() throws StandaloneInitializationException {
		StandaloneInitializerBuilder.builder().registerProjectURI(Activator.class, "org.palladiosimulator.uncertainty.impact")
				.addCustomTask(new Log4jInitilizationTask()).build().init();

	}

	private static void registerModelExtension() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(UncertaintyPackage.eNAME, new XMIResourceFactoryImpl());

	}
}
