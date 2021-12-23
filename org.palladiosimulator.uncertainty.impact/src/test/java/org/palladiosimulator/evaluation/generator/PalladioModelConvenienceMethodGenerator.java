package org.palladiosimulator.evaluation.generator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertaintymodel.plugin.BookStoreLoader;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

/**
 * Class to generate convenience methods for arbitrary palladio models. Should
 * be used to create convenience classes such as {@link BookStoreLoader}. Can
 * also be used if arbitrary palladio models are enhanced by new elements. Be
 * aware: To avoid name clashes, each element in your palladio model must be
 * named. <br>
 * 
 * 
 * @author Niko
 *
 */
public class PalladioModelConvenienceMethodGenerator extends TestBase {

	/**
	 * This method (or this approach) to create classes is kind of funny. However, I
	 * really didn't want to write (or dig into) code generation. Altogether, this
	 * code was written in less than one hour. I don't think it is possible to dig
	 * into code generation within one hour :-)
	 */
	//@Test // TODO Run as test to enable class generation
	public void generateClass()
			throws LoadModelFailedException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		/*
		 * //TODO replace this by model for which you want to create convenience methods
		 */
		PalladioModel model = getInitializedPalladioModel();
		String className = "BookStoreLoader";

		StringBuilder sb = new StringBuilder();
		sb.append("import org.palladiosimulator.pcm.allocation.AllocationContext;\n"
				+ "import org.palladiosimulator.pcm.core.composition.AssemblyConnector;\n"
				+ "import org.palladiosimulator.pcm.core.composition.AssemblyContext;\n"
				+ "import org.palladiosimulator.pcm.core.composition.DelegationConnector;\n"
				+ "import org.palladiosimulator.pcm.repository.BasicComponent;\n"
				+ "import org.palladiosimulator.pcm.repository.Role;\n"
				+ "import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;\n" + "\n"
				+ "import java.util.ArrayList;\n" + "import java.util.List;\n" + "\n"
				+ "import org.palladiosimulator.evaluation.generator.PalladioModelConvenienceMethodGenerator;\n"
				+ "import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;\n"
				+ "import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;\n"
				+ "import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;\n"
				+ "import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;\n"
				+ "import org.palladiosimulator.uncertainty.impact.model.PalladioModel;\n"
				+ "import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;\n"
				+ "import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;");
		

		sb.append("/**\n" + " * Geneated by {@link PalladioModelConvenienceMethodGenerator}\n" + " * @author Niko\n"
				+ " *\n" + " */\n");
		sb.append("public class " + className + " extends TestBase {");

		sb.append("//TODO adapt paths to required models\n"
				+ "	String allocationPath = \"src/test/resources/models/user/pcm/BookShop.allocation\";\n"
				+ "	String repositoryPath = \"src/test/resources/models/user/pcm/BookShop.repository\";\n"
				+ "	String resourceEnvPath = \"src/test/resources/models/user/pcm/BookShop.resourceenvironment\";\n"
				+ "	String systemPath = \"src/test/resources/models/user/pcm/BookShop.system\";\n"
				+ "	String usageModelPath = \"src/test/resources/models/user/pcm/BookShop.usagemodel\";\n" + "\n"
				+ "	List<String> palladioModelPaths = new ArrayList<>(\n"
				+ "			List.of(allocationPath, repositoryPath, resourceEnvPath, systemPath, usageModelPath));\n"
				+ "\n" + "	private PalladioModel model;\n" + "\n" + "	public " + className
				+ "() throws LoadModelFailedException {\n" + "\n" + "		model = new PalladioModel();\n"
				+ "		model.loadPalladioModels(palladioModelPaths);\n" + "	}");

		List<String> partialMethodNames = List.of("BasicComponentBehaviour", "BasicComponentType",
				"CommunicationComponent", "CommunicationResource", "ComponentInstance", "ComponentInterfaceInstance",
				"ComponentInterfaceType", "HardwareResource", "System", "SystemInterface", "UsageBehaviour",
				"DelegationConnector", "AllocationContext");

		for (String partialMethodName : partialMethodNames) {

			String callingMethodName = "getAll" + partialMethodName + "Entities";
			Method modelMethod = model.getClass().getMethod(callingMethodName);

			// Change method call
			@SuppressWarnings("unchecked")
			List<? extends Entity> entities = (List<? extends Entity>) modelMethod.invoke(model);

			// Change those two variable
			String methodName = "get" + partialMethodName + "EntityById";
			String methodResultName = "get" + partialMethodName;

			for (Entity entity : entities) {
				sb.append("\n");
				sb.append("public ");

				if (entity instanceof ProvidedDelegationConnector) {
					sb.append("DelegationConnector");
					sb.append(" " + methodResultName + "_Provided_");
				} else if (entity instanceof RequiredDelegationConnector) {
					sb.append("DelegationConnector");
					sb.append(" " + methodResultName + "_Required_");
				} else if (entity instanceof OperationProvidedRole) {
					sb.append("Role");
					sb.append(" " + methodResultName + "_Provided_");

				} else if (entity instanceof OperationRequiredRole) {
					sb.append("Role");
					sb.append(" " + methodResultName + "_Required");
				} else {
					if (entity instanceof org.palladiosimulator.pcm.system.System) {
						sb.append("org.palladiosimulator.pcm.system.System");
					} else {
						sb.append(entity.getClass().getSimpleName().replace("Impl", ""));
					}

					sb.append(" " + methodResultName + "_");
				}

				sb.append(entity.getEntityName().replaceAll("\\s+", "_").replace("-", "").replace("&", "")
						.replace("<", "").replace(">", ""));
				sb.append("() throws PalladioElementNotFoundException {");
				sb.append("\n");
				sb.append("return model.");
				sb.append(methodName);
				sb.append("(\"" + entity.getId() + "\");");
				sb.append("\n");
				sb.append("}");

			}

			sb.append("\n");

		}

		sb.append("}");

		System.out.println(sb.toString());

	}

}
