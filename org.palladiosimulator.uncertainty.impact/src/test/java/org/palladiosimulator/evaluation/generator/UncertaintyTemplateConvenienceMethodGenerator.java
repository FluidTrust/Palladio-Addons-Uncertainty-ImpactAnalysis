package org.palladiosimulator.evaluation.generator;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
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
public class UncertaintyTemplateConvenienceMethodGenerator extends TestBase {

	/**
	 * This method (or this approach) to create classes is kind of funny. However, I
	 * really didn't want to write (or dig into) code generation. Altogether, this
	 * code was written in less than one hour. I don't think it is possible to dig
	 * into code generation within one hour :-)
	 */
	@Test // TODO Run as test to enable class generation
	public void generateClass()
			throws LoadModelFailedException, SecurityException,
			IllegalArgumentException {

		/*
		 * //TODO replace this by model for which you want to create convenience methods
		 */
		UncertaintyTemplateModel model = getInitializedUncertaintyTemplateModel();
		String className = "TestUncertaintyTemplateLoader";

		StringBuilder sb = new StringBuilder();
		sb.append("import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;\n"
				+ "import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;\n"
				+ "import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;\n"
				+ "import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;\n"
				+ "import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;"); 
		

		sb.append("\n");
		sb.append("/**\n" + " * Geneated by {@link PalladioModelConvenienceMethodGenerator}\n" + " * @author Niko\n"
				+ " *\n" + " */\n");
		sb.append("public class " + className + " extends TestBase {");

		sb.append("//TODO adapt paths to required models\n"
				+ "private String uncertaintyTemplatePath = \"src/test/resources/models/expert/test.uncertaintytemplate\";\n"
				+ "\n" + "	private UncertaintyTemplateModel model;\n" + "\n" + "	public " + className
				+ "() throws LoadModelFailedException {\n" + "\n" + "		model = new UncertaintyTemplateModel();\n"
				+ "		model.loadUncertaintyTemplateModel(uncertaintyTemplatePath);\n" + "	}");

		// Create generation for all ADDs
		for (ADD add : model.getADDs()) {
			sb.append("\n");
			sb.append("public ADD getADD_" + add.getName() + "() throws UncertaintyTemplateElementNotFoundException {");
			sb.append("return model.getAddById(\"" + add.getId() + "\");");
			sb.append("}");

		}

		sb.append("\n");

		// Create generation for all UncertaintyTypes
		for (UncertaintyType uncertaintyType : model.getUncertaintyTypes()) {
			sb.append("\n");
			sb.append("public UncertaintyType getUncertaintyType_" + uncertaintyType.getName()
					+ "() throws UncertaintyTemplateElementNotFoundException {");
			sb.append("return model.getUncertaintyTypeById(\"" + uncertaintyType.getId() + "\");");
			sb.append("}");

		}
		
		sb.append("\n");

		// End class
		sb.append("\n}");

		System.out.println(sb.toString());

	}

}
