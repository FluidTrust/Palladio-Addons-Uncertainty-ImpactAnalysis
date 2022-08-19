# Uncertainty Impact Analysis (UIA)

This document provides a profound introduction into a Palladio extension which enables the annotation of uncertainties on architectural models as well as their propagation. The aim is to asses the impact of uncertainties at architectural level.

## Introduction

### Technologie
* Modelling: 
	* Eclipse Modeling Framework ([EMF](https://www.eclipse.org/modeling/emf/ "EMF"))
* UI:
	* JFace, SWT
* Code
	* Plain Java
	* KAMP Framework extended

### Content Structure
* Installation in a Nutshell
	* Installation Guide
* Usage of UIA Plugin
	* Functionality of the eclipse plugin
* Models
	* Overview of defined models to annotate and propagate uncertainties
* Roles
	* Definition roles that interact with the plugin
* Palladio Element Types
	* Already supported architectural types
* Uncertainty Propagation
	* Technical overview
* Code
	* Proposed order to go through the code




## Installation in a Nutshell

### Tested on

* Windows 10 (native)
	* If anybody has tested it on Linux, Mac etc., please let me know.



### Prerequisites

* Install Java (Tested with JDK 14.0.1)
* Git installed

### Step 1: Eclipse Modeling Tools
* Download Eclipse Modeling Tools Version [2021-09](https://www.eclipse.org/downloads/packages/release/2021-09/r/eclipse-modeling-tools "2021-09")
	* Use "Download Link" for your OS dDo not use installer, as this might interfer with already installed eclipse versions)
	* Unzip -> start directly from folder (no installation required) -> Create and Select Workspace
* Install following software via "Help" -> "Install new Software"
	* Hint: Restart after last installation only in order to save time
	* Palladio
		* Use this [Updatesite](https://updatesite.palladio-simulator.com/palladio-build-updatesite/releases/5.0.0/ "Updatesite")
		* Select all -> Install -> ... -> Install Anyway
	* Standalone Initialization
		* Use this [Updatesite](https://updatesite.mdsd.tools/library-standaloneinitialization/nightly/)
		* Select all -> Install -> ... -> Install Anyway
	* CDO Debug Utils
		* Use this [Updatesite](https://updatesite.mdsd.tools/eclipseaddon-cdodebugutils/nightly/)
		* Select all -> Install -> ... -> Install Anyway
	* KAMP
		* Use this [Updatesite](https://kamp-research.github.io/KAMP/)
		* Select "KAMPCORE" -> Install -> ... -> Install Anyway
			* Other KAMPs are not required
* OPTIONAL: Install following software via "Help" -> "Eclipse Marketplace"
	* EclEmma 
		* Useful Tool for CodeCoverage


### Step 2: Import Project
* Clone Repository from GitHub [GitHub](https://github.com/FluidTrust/Palladio-Addons-Uncertainty-ImpactAnalysis)
* Import Project "Uncertainty Impact Analysis"
	* Right Click -> Import -> General -> Existing Projects -> Select unzipped folder
	* Select All -> Import
	* Project -> Clean
	* Restart Eclipse
	* Project -> Clean


### Step 3: Execute Tests
* org.palladiosimulator.uncertainty.impact
	* src/test/java
		* RightClick -> RunAs -> JUnit Test
	* All green?
		* Environment should be set up
	* Red?
		* Contact me!

### Step 4: Start Plugin in "inner" Eclipse Instance
- Start new eclipse instance from current instance
	- RightClick -> org.palladiosimulator.uncertainty.impact -> Run As -> Eclipse Application
	- Create new workspace (do not reuse workspace of "outer" instance)
    	- If not prompted to the _workspace selection dialog_,
    	configur workspace in _Run Configurations_:
			1. Create folder for "inner"-workspace next to the "outer"-workspace
    		2. Open _Run Configurations_ dialog
    		3. Under _Workspace Data_ insert
    		`${workspace_loc}/../<foldername "inner"-workspace>`
	- Import org.palladiosimulator.uncertainty.impact from UncertaintPlugin
		- Tree Editors for Uncertainty Models available in inner instance
		- Sample uncertainty models located in
			- src/test/resources
			- src/main/resources
		- Important: Do not change models in src/test/resources, as they are loaded for UnitTests
			- Only create/change tests in src/main/resources
	- Open Uncertainty View:
		- Window -> Show View -> Other -> Search "UncertaintyView" -> Open
		- Resize Window & Have fun!

## Usage of UIA Plugin

**Note:** The root directory for models to be analyzed is the "inner"-workspace folder.
For example, for a project `org.palladiosimulator.uncertainty.impact`
and models within this project `src/main/resources/models/...`
the full path to be specified is
`org.palladiosimulator.uncertainty.impact/src/main/resources/models/...`.
For clarity, we let out the project name when specifying the paths in this documentation.

### Prerequisites
* Installation completed
* Plugin started
* UncertaintyView selected
* Models loaded
	* 1) Use sample models (already specified as default when starting the plugin)
		* Palladio Models: Book Store Example
		* Uncertainty Template Model:
			`src/main/resources/models/expert/sample.uncertaintytemplate`
		* Uncertainty Model:
			`src/main/resources/models/user/sample.uncertainty`
	* 2) Define own models
		* Models as specified in section *Models*
		* Important: Models need to be in workspace (inner eclipse instance)!


### Functionality
* Load Palladio Models
	* Click on "Load Models" next to "path to repository/system/... file"
* Load uncertainty template model
	* Click on "Load Models" next to "path to uncertainty template"	
* Load Uncertainty Model
	* Alt 1: Load uncertainty  model
		* Click on "Load Models" next to "path to uncertainty model"
		* Loads instantiated uncertainties, referencing elements and types for which propagation is already defined
	* Alt 2:
		* Click on "New Uncertainty Model"
		* Add at least on Uncertainty
* Select All / Deselect All
	* Convenience buttons to tick all uncertainties
* Add Uncertainty
	* Description:
		* Add uncertainties to model (only in-memory of not saved)
	* Click on "Add Uncertainty"
		* Specify name
		* Specify type 
		* Select Element
			* Available elements are automatically calculated based on selected type
* Remove Uncertainty
	* Description:
		* Remove from in-memory representation
	* Select Uncertainty (tick box)
		* "Remove Uncretainty"
* Get Type Info
	* Select one uncertainty
		* Click on "Get Type Info"
		* -> Attributes for uncertainty type displayed
* Save Uncertainty Model
	* Click "Save Uncertainty Model"
	* Current in-memory representation is stored to path specified in "Path to uncretainty model"
		* Overwrites laoded model, if path was not modified
* Uncertainty Propagation
	* Select one or more uncertainties
		* Click on "Propagate Uncertainties"
		* Hierarchical representation of uncertainty impact, ordered by uncertainty
			* Uncertainty -> ImpactElements -> Paths
* Save Propagation
	* Select one or more uncertainties
		* Click on "Propagate & Save"
		* Propagation is executed and written to src/main/resources/models/user/modified/temp.uncertaintypropagation
		* //Can also be viewed using native EMF TreeEditor



## Models

### Overview


* Models are defined on M2 layer using EMF (.ecore files!)
* Models are instantiated on M1 using generated EMF Editors in inner Eclipse instance
* Instantiated Models (M1) reference other instantiated Models (M1)
	* Hack to mock Multi-Level Modeling (which is not supported natively by EMF ~> Only M2/M1 Level)

 ~> **Open Model_Hierarchy.pdf  to get a better overview!**

### Models
*  ADD
	* org/palladiosimulator/uncertainty/impact/model/uncertaintymodel/model/add.ecore
	* Instances define Set of Architectural Design Decisions (ADDs) with corresponding attributes
		* Attributes are based on taxonomy (first contribution of the thesis)
		* Attributes are represented by Enum Values
		* Values help to asses impact of uncertainty on system
		* //Not relevant to understand the Plugin-itself, rather for assessing impact later
* UncertaintyType
	* org/palladiosimulator/uncertainty/impact/model/uncertaintymodel/model/uncertaintyType.ecore
	* Instances define set of domain specific UncertaintyTypes with corresponding attributes
		* Attributes are based on taxonomy 
		* Reference to .add model
			* Uncertainties might be resolved by specific ADD
			* Reference to instantiated ADD indicates that uncertainties of given type are resolved by specific ADD 
		* Contains Enum that specifcies supported element types (See Supported Element Types) 
			* Uncertainties of a certain type can only be assigned to one specific palladio element type
			* Uncertainties of a certain type might have impact on various other element types
* UncertaintyTemplate
	* org/palladiosimulator/uncertainty/impact/model/uncertaintymodel/model/uncertaintyTemplate.ecore
* Uncertainty
	* org/palladiosimulator/uncertainty/impact/model/uncertaintymodel/model/uncertainty.ecore
	* Instances define set of architecture specific Uncertainties
	* Reference to .uncertaintytemplate
		* Each instantiated uncertainty has an uncertainty type
		* ~> Type defines to which kind of architectural elements uncertainty can be assignes
	* Reference to palladio models (.system/.resourceenvironment/...)
		* Each uncertainty references actual element of the palladio model
* UncertaintyPropagation
	* org/palladiosimulator/uncertainty/impact/model/uncertaintypropagation/model/uncertaintypropagation.ecore
	* Instances define set of elements that are affected by uncertainties which in turn should be propagated
	* See chapter *Uncertainty Propagation*

-------------------------------------------------

* Scope:
	* .add/.uncertaintyType/.uncertaintytemplate
		* **Domain specific**: Created for domain (for instance: Information Systems)
		* Valid for and referenced by all instances of .uncertainty models in a certain domain
	* .uncrertainty
		* **Architecture specific**: Created for single architecture instance (i.e. reference PCM Models)
		* Architecture enahnced by multiple uncertainties / Uncertainties removed if resolved
	* .uncertaintypropagation
		* **Architecture & uncertainties specific**: Propagation executed on instantiated architecture (i.e. PCM Models) using defined set of uncertainties (i.e. selected from Uncertainty model)
		* //Select uncertainties which should be propagated (from one to all of respective Uncertainty model)


## Roles


* Role 1) "Expert" Architects:
	* Instantiates ".uncertaintytype", ".add", ".uncertaintytemplate" models
		* Based on domain knowlegde & expertise 
		* Supported by uncertainty taxonomy (see master thesis)
* Role 2) "User" Architects
	* Instantiate ".uncertainty"
		* Do not need knowledge about the various types of uncertainty
		* Use the plugin to annotate their architecture with actual uncertainties
		* Use the plugin to propagate their uncertainties through the architecture
* Role 3) Plug-In
	* Create UncertaintyPropagation model instances on the fly when user trigger "Propagate Uncertainties"
	* Could be manually created by User Architects using the tree editor
		* Cumbersome and error-prone!




## Palladio Element Types 

### Intro
The PCM defines various architectural elements to which uncertainties can and will be assigned. However, their technical names do not always fit  our purpose. In the course of the uncertainty analysis, it became apparent that the technical PCM names are often not meaningful enough. For instance, the technical Element *AssemblyConnector* describes the communication between components in software architecture. A more suitable name in this case is therefore *CommunicationComponent*. But more important, the PCM uses the same technical elements to describe syntactically identical, but semantically different elements. The technical element *Role* for instance, refers to interfaces in general. As we want to distinguish between interfaces on component and system level, as well as between interfaces of instantiated components and component types, it is not possible to use the technical names. The introduction of self-defined names therefore allows for a more fine-grained selection of various element types.







## Uncertainty Propagation
// See doc/Architectural_review.pdf for more detailed information

Uncertainties can have a direct and an indirect impact on architectural elements. Direct impacts means that an uncertainty is directly assigned to an architectural element (type of the architectural element matches the assignableElementType as specified in the choosen uncertainty type). Indirect means, that uncertainties can have an indirect impact on other "structurally reachable"  architectural elements. The types (more than one possible!) of those elements are specified by the choosen uncertainty type (impactOn list).


The reachable architectural elements are identified via propagation algorithms during the propagation. Propagation algorithms are selected by the starting element type (i.e. the assignable element type) and the ending element type (i.e. one of the types of the impactOn list). As n palladio elements produce n² combinations of starting and ending elements, we (Plugin Developer) must implement n² different algorithms which calculate all "reachable" elements, for uncertainties at a specific elements. So far, onyl a few (~6) algorithms are implemented


"Structurally reachable" refers to architectural elements that are reachable from other architectural element when traversing the palladio models. 

------------------------------

### Example:

#### Situation:

* Component A is encapsulated in AssemblyContext A which is allocatioed on AllocationContext A which is deployed on Resource Container A
* Component B is encapsulated in AssemblyContext B which is allocatioed on AllocationContext B which is deployed on Resource Container B
* Uncertainty Type 1:
	* Assignable Element Type: Components
	* Impact On: Resource Container
* Uncertainty x
	* Type: Uncertainty Type 1
	* Referenced Element: Component A
	

#### Propagation Algorithm: "Component ~> Resource Container"

* Given Component 1
	* ~> find AssemblyContexts in which instances of Component 1 are encapsulated
	* ~> For each AssemblyContext:
		* Retrieve AllocationContext & ResourceContainer

#### Application of Propagation:

* Given Uncertainty x 
	* ReferencedElement: Component A
	* Impact On: ResourceContainer //Info retrieved via Uncertainty Type 1
	* Select propagation algortihm:
		* From Component to Resource Contaner  => "Component ~> Resource Container"
	* Execute Propagation
		* Component A ~> AssemblyContext A ~> AllocationContext A ~> Resource Container A
	* Result:
		* Uncertainty x with Uncertainty Type 1 and assigned to Component A
			* Directly affects Component A //trivial
			* Indirectly affects Resource Container A //Propagation result

## Overview of supported elements

* // Specified as enum in UncertaintyTypeModel 

* **Basic Component Behaviour**
	* Technical element: ResourceDemaningSEFF
	* Description:
		* Describes inner component behaviour
	* Additional Information:
		* Self-defined element BasicComponentBehaviour as wrapper required, as RDSEFF is not a named element
* **Basic Component Type**
	* Technical element: BasicComponent
	* Description:
		* Refer to all instantiated component of this type
	* Additional Information:
		* Only delegation to BasicComponent
* **Communication Component**
	* Technical element: AssemblyConntector
	* Description:
		* Refer to communication between all top level (=system level) components
		* No inner component communication (also if CompositeComponent), as in this case components are regarded as black boxes 
	* Additional Information:
		* Only delegation to AssemblyConntector
* **Communication Resources**
	* Technical element: LinkingResource
	* Description:
		* Refer to communication between Hardware Resources
	* Additional Information:
		* Only delegation to LinkingResource
* **Component Instance**
	* Technical element: AssemblyContext
	* Description:
		* Refers to instantiated top level components (=system level assemblies)
		* No inner component instances (also if CompositeComponent), as in this case components are regarded as black boxes 
	* Additional Information:
		* Only Delegation to AssemblyContext
* **Component Interface Instance**
	* Technical element: AssemblyContext **&** Role
	* Description:
		* Refers to interfaces of instantiated top level components (=system level assemblies)
		* No interfaces of inner component instances (also if CompositeComponent), as in this case components are regarded as black boxes 
	* Additional Information:
		* Self-defined Element that includes given AssemblyContext and Role
		* Necessary, as interfaces of assembly context only delegate to interface of component type
			* Consequnce: Two different assemblies with the same component delegate to the same interface ~> ambigous!
		* #PalladioAtItsBest ;-) 
* **Component Interface Type**
	* Technical element: Role
	* Description:
		* Refer to interface of all available basic components
	* Additional Information:
		* Only delegation to Role
* **Hardware Resource**
	* Technical element: ResourceContainer
	* Description:
		* Refer to all top level hardware resources (no nested resourceContainer)
	* Additional Information:
		* Only delegation to ResourceContainer
* **System**
	* Technical element: System
	* Description:
		* Refers to the system
	* Additional Information:
		* Only delegation to System (there is only one!)
* **System Interface**
	* Technical element: Role
	* Description:
		* Refers to the system's provided and required interface
	* Additional Information:
		* Only delegation to Role
* **Usage Behaviour**
	* Technical element: EntryLevelSystemCall
	* Description:
		* Refers to the actual usage of the system by users
	* Additional Information:
		* Only Delegation to EntryLevelSystemCall
		* One of the most difficult to extract: DepthSearch necessary to extract all EntryLevelSystemCalls of given model


-------------------------------------------
Following extensions for the future possible (NOT YET IMPLEMENTED!):

* **Inner Component Instance**
	* Technical element: AssemblyContext
	* Description:
		* Refers instantiated components within CompositeComponents of top level assemblies (recursively!)
	* Additional Information:
		* Propably self-defined element required with path
			* Top Level Assembly -> CompositeComponent -> InnerAssemblies -> CompositeComponents -> InnerAssembly -> BasicComponent
* **Inner Component Interface Instance**
	* Technical element: AssemblyContext **&** Role 
	* Description:
		* Combines "Inner Component Instance" and "Component Interface Instance"
	* Additional Information:
		* Self defined Elemen required (propably quite complex)


--------------------------------------------


### Technical Overview:

Design was influenced by KAMP approach.

#### Propagation Elements:

	 UCImpactEntity.java 
		* AffectedElement: Entity //Palladio Element
		* CausingElements: List<CausingUncertainty>
	 CausingUncertainty.java
		* causingUncertainty: Uncertainty //actual uncertainty 
		* path: List<Entity> //visisted entities during propagation


		
#### Workflow
Reuse UCImpactEntity to represent Input & Output of Propagation

* Input (for each Uncertainty u)
	* Create CausingUncertainty cu
		* causingUncertainty = u
		* path = EmptyList //not relevant for Input
	* Create UCImpactEntity
		* affectedElement = uncertainty.referencedElement
		* causingElements.add(cu)
* Propagation (for each UCImpactEntity ucImpact)
	* Extract single Uncertainty u //only one element in ucImpact.causingElements
		* affectedElement = ucImpact.affectedElement
		* For each element type impactType in u.getImpactOn()
			* Resolve algorithm via <assignableElementType, impactType>
			* Apply propagation
* Output (apply propagation result)
	* For each impact found (i.e. path from starting element to ending element) 
		* Get (if already exists) or create UCImpactEntity at ending element
		* Add CausingUncertainty (including path) to CausingElements


#### Relationship: Uncertainty, UCImpactEntity, CausinUncertainty, Architectural Elements
This is for propagation output only.

* UCImpactEntity 1 <-> 1 Architectural Element
* Uncertainty can have impact on various architectural elements
	* For each impact: 
		* CausingUncertainty encapsulated same uncertainty but different path (as different ending element)
		* Uncertainty 1 <-> n CausingUncertainty






## Code 

### Top Level Structure
* Project: org.palladiosimulator.uncertainty.impact
	* src/main/java
		* Code for plugin (view, model, presenter)
		* Code for propagation
	* src/main/resources
		* Sample models 
	* src/test/java
		* Test code
	* src/test/resources
		* Test data
* Project: org.palladiosimulator.uncertainty.impact.model.uncertaintymodel
	* model/
		* All ecore models (except uncertainty propagation)
		* Generator model
	* src/
		* Generated code
* Project: org.palladiosimulator.uncertainty.impact.model.uncertaintymodel.edit/editor
	* Generated code to enable tree editor for uncertainty related model instances
* Project: org.palladiosimulator.uncertainty.impact.model.uncertaintypropagation
	* model/
	* Uncertainty propagation related code
	* Generator model
* Project: org.palladiosimulator.uncertainty.impact.model.uncertaintypropagation.edit/editor
	* Generated code to enable tree editor for uncertainty propagation related model instances
	* Exception: 
		* UCImpactPropagationAction.java 
		* plugin.xml
		* ~> Changed to enable "Step 3: Calculate uncertainty propagation" directly from within the editor

### Uncertainty Plugin
Refers to Project: org.palladiosimulator.uncertainty.impact (src/main/java).

**It is recommended to go through the code in the following order** 


* Entry Point: 
	* PluginMain.java
		* Set up eclipse plugin
		* Initialize Model, View, Presenters (MVP Pattern!)
	* Activator.java
		* Activates plugin: Register model extensions, ....
		* Called on Plug-In startup (defined in MANIFEST.MF)

-------------------------------

* Models: (org.palladiosimulator.uncertainty.impact.model)
	* ~> provide access to in-memory models (get and save elements)
	* ModelLoader.java
		* provides basic functionality (Template Pattern) to load models from workspace
	* PalladioModel.java
		* In memory container for all Palladio Models
	* UncertaintyModel.java
		* In memory container for Uncertainties
	* UncertaintyTemplateModel.java
		* In memory container for Add/UncertaintyType Models
* Model Utility: (org.palladiosimulator.uncertainty.impact.model.util)
	* PalladioElementWrapperFactoryHelper.java
		* Need to wrap some Palladio-Elements as not every element extends Identifier/Entity
	* PalladioModelsLookupHelper.java
		* (Reusable) convenience methods to access palladio element of specific type 


-----------------

* Presenter: (org.palladiosimulator.uncertainty.impact.presenter)
	* ~> Listen to view events, do calculations based on input, trigger view change
		* Implement Listener interface ~> Decouple view and domain logic
	* ~> Presenters are the "heart" of the application, as they control the whole workflow
	* PalladioPresenter.java
		* Trigger palladio model loading via user provided paths
	* UncertaintyTemplatePresenter.java
		* Trigger uncertainty template model loading via user provided path
	* UncertaintyPresenter.java
		* Trigger uncertainty model loading via user provided path
		* Handle create, save, propagate queries from user
		* Display result
	* CreateNewUncertaintyPresenter.java
		*  Creation of uncertainties is done in separate view (CreateNewUncertaintyView.java)
		*  Step-by-step creation of uncertainty 


---------------------------
* ViewModels and Converter (org.palladiosimulator.uncertainty.impact.view.model & org.palladiosimulator.uncertainty.impact.presenter.util)
	* ~> Model Elements (Uncertainty, UncertaintyType...) are converted to ViewModels
	* ~> Separates DataLayer from PresentationLayer
	* xyViewModel.java
		* Attributes either String or reference to other ViewModels
	* ModelToViewModelConverter.java
		* Converts model to viewModel instances
	* ViewModelToModelConverter.java
		* Converts viewModel to model instances
		* //required when creating new uncertainty from user specified uncertaintyViewModel


---------------------------------
* View (org.palladiosimulator.uncertainty.impact.view)
	* ~> Specify layout and JFace elements with ChangeListeners (Trigger presenter when user enters data)
	* LoadPalladioModelsView.java
		* Delegates input to PalladioPresenter.java
	* LoadUncertaintyTemplateModelView.java
		* Delegates input to UncertaintyTemplatePresenter.java
	* UncertaintyView.java
		* Defines main button section and table to present uncertainties
		* Delegates input to UncertaintyPresenter.java
		* Open other views (as dialogs) when clicking on specific buttons
			* Add uncertainty: CreateNewUncertaintyView.java
			* Get type info: DisplayUncertaintyTypeInfoView.java
			* Propagate uncertainties: DisplayUncertaintyPropagationResultView.java
	* CreateNewUncertaintyView.java
		* Actual content in CreateNewUncertaintyViewDialog.java
		* Step-by-Step creation of UncertaintyViewModel
		* Return Value used by UncertaintyView.java to create actual Uncertainty
	* DisplayUncertaintyTypeInfoView.java
		* Actual content in DisplayUncertaintyTypeInfoViewDialog.java
		* Only display information in table like structure
	* DisplayUncertaintyPropagationResultView.java
		* Actual content in DisplayUncertaintyPropagationResultViewDialog.java
		* Only display propagation result in table like structure 

-----------------------------------
* Propagation (org.palladiosimulator.uncertainty.impact.propagation)
	* UCArchitectureVersion.java
		* Encapsulates architecture models on which propagation will be execute
		* Contains UCImpactRepository
			* Contains input and output of Propagation 
	* UCArchitectureVersionFacade.java
		* Initialies UCArchitectureVersion
	* UCImpactPropagationAnalysisInitializer.java
		* Create propagation input based on uncertainties (creates UCImpactEntities)
	* UCImpactPropagationAnalysis.java
		* Actual propagation
		* For each UCImpactEntity (Input), extract uncertainty and resolve which algorithm needs to be triggered
* Propagation Algorithms (org.palladiosimulator.uncertainty.impact.propagation.algorithms)
	* AbstractPropagationHelper.java
		* Provides template method to execute propagation and to collect/add propagation results to output
	* xyHelper.java
		* Defines the various algorithms as specified

------------------------------------------
* Persistence (org.palladiosimulator.uncertainty.impact.persistence)
	* EMFPersistenceHelper.java
		* Provides basic functionality to load emf models
	* SaveUncertaintyModelHelper.java
		* Specifically to save .uncertainty models
	* SaveUncertaintyPropagationModelHelper.java
		* Specifically to save .uncertaintypropagation models

-----------------------------------
* KAMP Integration (org.palladiosimulator.uncertainty.impact.propagationm.kamp)
	* ~> Some classe extend KAMP Classes (UCImpactRepository.java, UCArchitectureVersion.java, UCPropagationRulesSeed.java,...)
	* UCArchitectureVersionPersistencyForKAMP.java
		* Delegate/Execute model loading/saving if propagation is triggered from TreeEditor
	* UCImpactPropagationAnalysisForKAMP.java
		* Delegate to actual propagation





