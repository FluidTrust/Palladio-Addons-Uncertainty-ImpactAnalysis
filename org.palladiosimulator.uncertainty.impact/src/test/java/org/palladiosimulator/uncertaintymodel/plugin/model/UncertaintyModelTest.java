package org.palladiosimulator.uncertaintymodel.plugin.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertaintymodel.plugin.TestBase;

public class UncertaintyModelTest extends TestBase {

	UncertaintyModel cut;
	IUncertaintyTemplateModel templateModelLoader;

	@BeforeEach
	public void init() throws LoadModelFailedException {
		cut = new UncertaintyModel();
		templateModelLoader = getInitializedUncertaintyTemplateModel();
	}

	@Test
	public void testLoadNewUncertaintyModel() {
		cut.loadNewUncertaintyModel(templateModelLoader.getTemplateModel());
		List<Uncertainty> uncertainties = cut.getUncertainties();
		assertEquals(0, uncertainties.size());
	}

	@Test
	public void testLoadExistingUncertaintyModel() throws LoadModelFailedException {
		// Load test model
		cut.loadUncertaintyModel(uncertaintyPath);
		List<Uncertainty> uncertainties = cut.getUncertainties();
		assertEquals(1, uncertainties.size());

		testUncertainty(uncertainties.get(0), "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");
	}

	@Test
	public void testGetUncertaintyByIdSuccessful()
			throws LoadModelFailedException, UncertaintyTemplateElementNotFoundException {
		// Load test model
		cut.loadUncertaintyModel(uncertaintyPath);
		Uncertainty uncertainty = cut.getUncertaintyById("_PYC0cDvkEeyKcZ3NE6_IOQ");

		testUncertainty(uncertainty, "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");
	}

	@Test
	public void testGetUncertaintyByIdNotSuccessful() throws LoadModelFailedException {
		// Load test model
		cut.loadUncertaintyModel(uncertaintyPath);
		assertThrows(UncertaintyTemplateElementNotFoundException.class, () -> cut.getUncertaintyById("invalid"));
	}

	@Test
	public void testAddUncertainty() {
		// init with empty model
		cut.loadNewUncertaintyModel(templateModelLoader.getTemplateModel());

		cut.addUncertainty(createUncertaintyWithDefaultValues("test"));

		List<Uncertainty> uncertainties = cut.getUncertainties();
		assertEquals(1, uncertainties.size());

		Uncertainty uncertainty = uncertainties.get(0);
		assertEquals("test", uncertainty.getName());
		assertNotNull(uncertainty.getAssignedElement());
		assertNotNull(uncertainty.getUncertaintyType());
	}

	@Test
	public void testRemoveUncertaintySuccessfull() throws UncertaintyNotFoundException, LoadModelFailedException {
		// Load test data
		cut.loadUncertaintyModel(uncertaintyPath);

		// Initialized with three
		List<Uncertainty> uncertainties = cut.getUncertainties();
		assertEquals(1, uncertainties.size());

		// Add uncertainty
		Uncertainty uncertaintyToBeAddedAndRemoved = createUncertaintyWithDefaultValues("test");
		cut.addUncertainty(uncertaintyToBeAddedAndRemoved);

		// Check if added
		uncertainties = cut.getUncertainties();
		assertEquals(2, uncertainties.size());

		// Execute test
		cut.removeUncertaintyById(uncertaintyToBeAddedAndRemoved.getId());

		// Retrieve remaining uncertainties
		uncertainties = cut.getUncertainties();
		assertEquals(1, uncertainties.size());

		// initial uncertainty still available
		testUncertainty(uncertainties.get(0), "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",
				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");
	}

	@Test
	public void testRemoveUncertaintyNotSuccessfull() throws LoadModelFailedException {

		// Load test model and check if uncertainty is available
		cut.loadUncertaintyModel(uncertaintyPath);
		List<Uncertainty> uncertainties = cut.getUncertainties();
		assertEquals(1, uncertainties.size());

		testUncertainty(uncertainties.get(0), "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",

				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");

		// Try remove with invalid id
		assertThrows(UncertaintyNotFoundException.class, () -> cut.removeUncertaintyById("invalid"));

		// Check if initial uncertainty still there
		uncertainties = cut.getUncertainties();
		assertEquals(1, uncertainties.size());

		testUncertainty(uncertainties.get(0), "_PYC0cDvkEeyKcZ3NE6_IOQ", "Test Uncertainty", "_HOiMIDvjEeyKcZ3NE6_IOQ",

				"Assignable_to_BasicComponentType", "_NdX6AH9HEeaHNuq2j06i3A", "Book Shop Web Pages");
	}

}
