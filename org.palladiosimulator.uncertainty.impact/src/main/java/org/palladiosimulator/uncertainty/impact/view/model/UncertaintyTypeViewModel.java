package org.palladiosimulator.uncertainty.impact.view.model;

import java.util.List;

public class UncertaintyTypeViewModel {

	private String name;

	private String id;

	private PalladioElementTypeViewModel assignableElementType;

	private List<PalladioElementTypeViewModel> impactOn;

	private ADDViewModel resolvedBy;

	private String impactOnConfidentiality;
	private String informationAvailability;
	private String location;
	private String manageability;
	private String nature;

	private String resolutionTime;
	private String rootCause;
	private String severityOfImpact;

	public UncertaintyTypeViewModel() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public PalladioElementTypeViewModel getAssignableElementType() {
		return assignableElementType;
	}

	public void setAssignableElementType(PalladioElementTypeViewModel assignableElementType) {
		this.assignableElementType = assignableElementType;
	}

	public List<PalladioElementTypeViewModel> getImpactOn() {
		return impactOn;
	}

	public void setImpactOn(List<PalladioElementTypeViewModel> impactOn) {
		this.impactOn = impactOn;
	}

	public ADDViewModel getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(ADDViewModel resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public String getImpactOnConfidentiality() {
		return impactOnConfidentiality;
	}

	public void setImpactOnConfidentiality(String impactOnConfidentiality) {
		this.impactOnConfidentiality = impactOnConfidentiality;
	}

	public String getInformationAvailability() {
		return informationAvailability;
	}

	public void setInformationAvailability(String informationAvailability) {
		this.informationAvailability = informationAvailability;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManageability() {
		return manageability;
	}

	public void setManageability(String manageability) {
		this.manageability = manageability;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getResolutionTime() {
		return resolutionTime;
	}

	public void setResolutionTime(String resolutionTime) {
		this.resolutionTime = resolutionTime;
	}

	public String getRootCause() {
		return rootCause;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	public String getSeverityOfImpact() {
		return severityOfImpact;
	}

	public void setSeverityOfImpact(String severityOfImpact) {
		this.severityOfImpact = severityOfImpact;
	}

}
