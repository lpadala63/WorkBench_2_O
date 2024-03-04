package stepdefinitions;


import commonutils.ExcelUtility;
import commonutils.TestPropertyFileRead;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclass.ALt_Add_Both_Products;
import pageclass.AdditionalForms;
import pageclass.Attachments;
import pageclass.CaseInfo;
import pageclass.Certification;
import pageclass.EntityOwner;
import pageclass.HIVConsent;
import pageclass.LifeBeneficiaries;
import pageclass.LifeOtherCoverage;
import pageclass.LifeOwner;
import pageclass.LifePaymentInfo;
import pageclass.LifeProducerCompensation;
import pageclass.LifeProducerStatement;
import pageclass.LifepurposeofInsurance;
import pageclass.LockAndUnlock;
import pageclass.NYLifeproductsuitabilityContinues;
import pageclass.NY__NonGuaranteedElement;
import pageclass.NewYorkRegSixty;
import pageclass.NewYork_LifeProductsSuitability;
import pageclass.PersonalHistory;
import pageclass.PersonalHistoryContOne;
import pageclass.PersonalHistoryContTwo;
import pageclass.ProposedInsured;
import pageclass.ProposedInsuredCont;
import pageclass.QualifiedPlan;
import pageclass.TrustCertification;
import pageclass.Workbench_LaunchEzApp;
import pageclass.jointContigentOwner;
import pageclass.productwholelife;
import pageclass.SWl.PersonalHistoryContOneSWL;
import pageclass.SWl.SWLLockScreen;
import pageclass.SWl.SWLOtherCoverage;
import pageclass.SWl.SWL_PrimaryInsuredTwo;
import pageclass.SWl.SWL_productWholeLife;
import pageclass.SWl.SurvivorshipLifeCaseSetup;
import pageclass.SWl.SwlProducerStatement;
import pageclass.SWl.Swl_JointOwner;
import utilities.GetDataFromExcel;

public class SurvivorshipWholeLife {
	int row;
	
	Workbench_LaunchEzApp workbenchLaunchEzApp = new Workbench_LaunchEzApp();
	CaseInfo caseinfo = new CaseInfo();
	GetDataFromExcel testdata = new GetDataFromExcel();
	jointContigentOwner JCO=new jointContigentOwner();
	Swl_JointOwner SJO=new Swl_JointOwner();
	SurvivorshipLifeCaseSetup LCS=new SurvivorshipLifeCaseSetup();
	ProposedInsured Proposedinsure = new ProposedInsured();
	ProposedInsuredCont PI_cont = new ProposedInsuredCont();
	PersonalHistory personalhistory = new PersonalHistory();
	PersonalHistoryContOneSWL PHCOne = new PersonalHistoryContOneSWL();
	PersonalHistoryContTwo PHCTwo = new PersonalHistoryContTwo();
	SWLOtherCoverage LOC = new SWLOtherCoverage();
	SWL_PrimaryInsuredTwo ProposedinsurerTwo = new SWL_PrimaryInsuredTwo();
	SWL_productWholeLife PWL=new SWL_productWholeLife();
	ALt_Add_Both_Products products_alt_add= new ALt_Add_Both_Products();
	LifepurposeofInsurance LPOI = new LifepurposeofInsurance();
	LifeBeneficiaries LifeBene = new LifeBeneficiaries();
	SwlProducerStatement producerStatement = new SwlProducerStatement();
	LifeProducerCompensation producerCompensation = new LifeProducerCompensation();
	LifePaymentInfo lpinfo = new LifePaymentInfo();
	Certification certify = new Certification();
	//SWLLockScreen lock = new SWLLockScreen();
	LockAndUnlock lock = new LockAndUnlock();
	AdditionalForms Addforms = new AdditionalForms();
	QualifiedPlan QP=new QualifiedPlan();
	Attachments attach = new Attachments();
	LifeOwner LO=new LifeOwner();
	EntityOwner EO=new EntityOwner();
	TrustCertification Trust=new TrustCertification();
	// newyork
	NewYorkRegSixty NyR=new NewYorkRegSixty();
	HIVConsent Consent_HIV = new HIVConsent();
	NewYork_LifeProductsSuitability NYlps= new NewYork_LifeProductsSuitability();
	NY__NonGuaranteedElement NGE=new NY__NonGuaranteedElement();
	TestPropertyFileRead propertyfileRead=new TestPropertyFileRead();

	String TestDataFileName = TestPropertyFileRead.getThePropertyValue("ExcelFileName");
	//String TestDataSheetName = testPropertyFileRead.getThePropertyValue("WL_SheetName");
	
	@Given("^Launch Fieldnet_dev Application Enter User ID and click on Next (\\d+)$")
	public void launch_Fieldnet_dev_Application_Enter_User_ID_and_click_on_Next(int arg1) throws Throwable {
		row = arg1;
		workbenchLaunchEzApp.enterUserIDClickNext();
	    
	}

	@Given("^Enter Password and click on Verify$")
	public void enter_Password_and_click_on_Verify() throws Throwable {
		workbenchLaunchEzApp.enterPasswordClickVerify();
		workbenchLaunchEzApp.clickOnFieldnetDev();
	    
	}

	@Given("^Click on SubmitNewBusiness then click Insurance Workbench and enter ProducerID and click on search$")
	public void click_on_SubmitNewBusiness_then_click_Insurance_Workbench_and_enter_ProducerID_and_click_on_search() throws Throwable {
	    
		String producerID = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "ProducerID");

		workbenchLaunchEzApp.enterProducerNumberClickSearch(producerID);
	}

	@Given("^Click on Plus icon To select Environment and click on continue$")
	public void click_on_Plus_icon_To_select_Environment_and_click_on_continue() throws Throwable {
	    
		String Environment = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Environment");

		workbenchLaunchEzApp.clickonSubmitNewBusinessWB(Environment);
	}

	@When("^EzApp launched and user Enters Insured details and Case Descriotion$")
	public void ezapp_launched_and_user_Enters_Insured_details_and_Case_Descriotion() throws Throwable {
	    
		String FirstName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_Firstname");
		String LastName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_LastName");
		String DOBMonth = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_MM");
		String DOBDay = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_DD");
		String DOBYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_YYYY");
		String Gender = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_Gender");
		String CaseDescription = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_CaseDescription");

		caseinfo.enterCaseInfoDetails(FirstName, LastName, DOBMonth, DOBDay, DOBYear, Gender, CaseDescription);
	}

	@When("^select  state for SWL and Wholife Product type and click on Find Available Products$")
	public void select_state_for_SWL_and_Wholife_Product_type_and_click_on_Find_Available_Products() throws Throwable {
	    
		String State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_ProductType");

		caseinfo.CarrierAndProduct(State, ProductType);
	}

	@When("^select SWL product variant so Application screen open$")
	public void select_SWL_product_variant_so_Application_screen_open() throws Throwable {
	    
		String Product = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_Product");
		caseinfo.selectProduct(Product);
	}

	@When("^user fills SWL Life case setup Screen details and then click on Next$")
	public void user_fills_SWL_Life_case_setup_Screen_details_and_then_click_on_Next() throws Throwable {
		String Suffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_Suffix");
		String insurabilityOptionExercise = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_insurability option exercise");
		String requireUnderwriting = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_requireUnderwriting");
		String ins2Firstname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "InsTwo_FirstName");
		String Insured2Middletname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "InstwoLCS_MM");
		String Insured2Lasttname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_LastName");
		String Insured2Suffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins2LCS_Suffix");
		String Insured2DOBMM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins2_LCS_DOB_MM");
		String Insured2DOBDD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins2_LCS_DOB_DD");
		String Insured2DOBYYY = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins2_LCS_DOB_YYYY");
		String Insured2InsurabilityOptionExercise = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins2LCS_insurability option exercise");
		String Insured2requireUnderwriting = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins2LCS_require underwriting");
		String Insured1ResidentState = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_INS1_ResidentState");
		String Faceamount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_FaceAmount");
		String Franchisenumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "FranchisNumber");
		String MMLCRegesterd = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_ MMLIS_Registered_Rep");
		String QualPlan = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_qualifiedplan");
		String financialservicesrepresentative = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_financialservicesrepresentation");
		String purchasethispolicy = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_purchase this policy");
		String hardshipwithdrawal = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "hardship withdrawal");
		String Retirement_paythepremiums = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCs_account to pay the premiums");
		String whatisthePrimarypurpose = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Purpose of Policy");
		String surrenderchargeamount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", " surrender charge amount");
		
		LCS.InsuredOneAndInsuredTwo(Suffix, insurabilityOptionExercise, requireUnderwriting, ins2Firstname, Insured2Middletname,
				Insured2Lasttname, Insured2Suffix, Insured2DOBMM, Insured2DOBDD, Insured2DOBYYY, Insured2InsurabilityOptionExercise,
				Insured2requireUnderwriting,Insured1ResidentState,Faceamount,Franchisenumber);
		LCS.RadioQuestionsone(MMLCRegesterd, QualPlan, financialservicesrepresentative, purchasethispolicy, hardshipwithdrawal, Retirement_paythepremiums,
				whatisthePrimarypurpose, surrenderchargeamount);
		
		String morethanoneowner = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_more than one owner");
		String Bothinsuredstheowners = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_both insureds the owners");
		String insuredoneoftheowners = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "insured one of the owner");
		String ResidentStateofIndivOwner = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_Resident state of Individual Owner");
		String proposed_insured_the_owner = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LCS_primary insured the owner");
		String indivualorEntity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "owner an individual or an entity");
		String IndividualOwnerandEntityownerstate = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "IndividualOwnerandEntityownerstate");
		String HoldIssue = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Hold Issue");
		String Backdatesaveage = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Backdate to save age");
		String Policydate = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Policy Dating");
		String MM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SpecificDate_MM");
		String DD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SpecificDate_DD");
		String YYYY = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SpecificDate_YYYY");
		String Agency = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SubmittingAgency");
		String Agentfirm = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Agentfirm");
		String Stateowner = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "OwnerState");
		String Cityowner = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "OwnerCity");
		
		LCS.RadioQuestionsctwo(morethanoneowner, Bothinsuredstheowners, insuredoneoftheowners, ResidentStateofIndivOwner, proposed_insured_the_owner, indivualorEntity, IndividualOwnerandEntityownerstate,
				HoldIssue, Backdatesaveage, Policydate, MM, DD, YYYY, Agency,Agentfirm, Stateowner, Cityowner);
		String State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		String Lapsed = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NyReg_LAPSED_SURRENDERED");
		String CashValues = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NyReg_OTHER_CASH_VALUES");
		String tobeInforce = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NyReg_CONTINUE_TO_BE_IN_FORCE");
		String Reissued = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NyReg_REISSUED_WITH_REDUCTION");
		String Collateral = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NyReg_ASSIGNED_AS_COLLATERAL");
		String Premium = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NyReg_PREMIUM PAID");
		String externalReplacement = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NyReg_EXTERNAL_REPLACEMENT");
		
		NyR.NeyworkReg(State, Lapsed, CashValues, tobeInforce, Reissued, Collateral, Premium, externalReplacement);
	}

	@When("^user fills SWL Primary Insured one Screen and Primary Insured Cont Screen details$")
	public void user_fills_SWL_Primary_Insured_one_Screen_and_Primary_Insured_Cont_Screen_details() throws Throwable {
		// personal information section
				String Suffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Suffix");
				String Birth_state = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_BirthState");
				String ssn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_SSN");
				Proposedinsure.personal_Information(Suffix, Birth_state, ssn);

				String RESADDStreet1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_AddressStreet1");
				String RESADDStreet2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_AddressStreet2");
				String RESADDCity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_City");
				String RESADDZIP = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Zip");
				String MailingADD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_MailAdd");
				String MailingStreet1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_ALT_ AddressStreet1");
				String MailingStreet2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_ALT_AddressStreet2");
				String MailingCity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_ALT_City");
				String MailingState = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_ALT_State");
				String MailingZIPPostalCode = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_ALT_Zip");
				// Address Section data ENDS

				Proposedinsure.Address(RESADDStreet1, RESADDStreet2, RESADDCity, RESADDZIP, MailingADD, MailingStreet1,
						MailingStreet2, MailingCity, MailingState, MailingZIPPostalCode);

				String PreferredPhoneNumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Phone");
				String HomeWorkMobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_HomeWork");
				String WorkExtension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Extension");
				String AlternatePhoneNumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Alt_Phone");
				String AlterHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Alt_HomeWork");
				String AlternateExtesnion = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Alt_Extension");
				String AmPM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_BestTime");
				String Besttimetocall = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_BesttimetoCall");
				String ReciveText_BD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Message");
				String NeedspecialAccomidation = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Accomodation");
				String preferredlanguage = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_PrefferedLang");
				String EmailAddress = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_Email");
				// Write code here that turns the phrase above into concrete actions

				Proposedinsure.Additionalinfo(PreferredPhoneNumber, HomeWorkMobile, WorkExtension, AlternatePhoneNumber,
						AlterHomeWorkMobile, AlternateExtesnion, AmPM, ReciveText_BD, Besttimetocall, NeedspecialAccomidation,
						preferredlanguage, EmailAddress);
				
				
				
				String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
						"PIC_U.S.DriversLicense");
				String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
						"PIC_IdentificationNumber");
				
				String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PIC_ReaspnWhy");
				String PICType_of_identification = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
						"PIC_TypeOfIdentification");
				String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
						"PIC_StateProvinceofIssue");
				String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PIC_Other");
				String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PIC_TypeofCitizenship");
				String Expr_MM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"Whole_Life","LOC_Exp_MM");
				String Expr_DD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"Whole_Life", "LOC_Exp_DD");
				String Expr_YYYY = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"Whole_Life", "LOC_Exp_YYYY");
				PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
						PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
						TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
	    
	}

	@When("^user fills SWL Personal History one Screen and Personal History one Conts Screen Information details$")
	public void user_fills_SWL_Personal_History_one_Screen_and_Personal_History_one_Conts_Screen_Information_details() throws Throwable {
	    
		String InsuredDisability = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PH_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits");
		String InsuredDisabilityDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits_Details");
		String Tobaccoin12M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months");
		String Tobaccoin12MDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months_Details");
		String Tobaccoin24M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Withinthelast24months");
		String Tobaccoin24MDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Withinthelast24months_Details");
		String Cigarin24M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_UsedCigarswithinthelast24months");
		String Cigarin24count = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_UsedCigarswithinthelast24months_Numberofcigarsperyear");
		String PrescriptionMedicationin12M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Usedprescriptionmedicationtoassistwithsmokingcessation");
		String PrescriptionMedicationin12MDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Usedprescriptionmedicationtoassistwithsmokingcessation_Details");
		String ConvictedProbation = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation");
		String ConvictedProbationDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation_Details");
		String ConvictedwithAlcoholin2Y = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol");
		String ConvictedwithAlcoholin2YDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol_Details");
		String Accidentin3Y = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Beeninamotorvehicleaccidentinwhichtheywerefoundtobeatfault");
		String Faultmotorvehicleaccident = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Atfaultmotorvehicleaccident?");
		String FaultmotorvehicleaccidentHowMany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Atfaultmotorvehicleaccident?_Howmany");
		String FaultmotorvehicleaccidentWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Atfaultmotorvehicleaccident?_When1");
		String FaultmotorvehicleaccidentWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Atfaultmotorvehicleaccident?_When2");
		String FaultmotorvehicleaccidentWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Atfaultmotorvehicleaccident?_When3");
		String Speedingticket = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Speedingticket?");
		String Lessthan15milesspeedlimit = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Lessthan15milesoverthespeedlimit?");
		String Lessthan15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Lessthan15milesoverthespeedlimit?_Howmany");
		String Lessthan15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Lessthan15milesoverthespeedlimit?_When1");
		String Lessthan15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Lessthan15milesoverthespeedlimit?_When2");
		String Lessthan15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Lessthan15milesoverthespeedlimit?_When3");
		String Greaterthanorequal15milesspeedlimit = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?");
		String Greaterthanorequal15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_Howmany");
		String Greaterthanorequal15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When1");
		String Greaterthanorequal15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When2");
		String Greaterthanorequal15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When3");
		String Suspendedlicense = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Suspendedlicense?");
		String Suspenedlicenseduetononpayment = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Suspenedlicenseduetononpaymentofchildsupport?");
		String Whenwasthelicensesuspended = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Whenwasthelicensesuspended?");
		String Reasonforsuspension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Reasonforsuspension?");
		String Hasitbeenreinstated = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Hasitbeenreinstated?");
		String Whenreinstated = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Whenreinstated?");
		String Recklessdriving = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Recklessdriving?");
		String Recklessdrivinghowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Recklessdriving?_Howmany?");
		String RecklessdrivingWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Recklessdriving?_When1");
		String RecklessdrivingWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Recklessdriving?_When2");
		String RecklessdrivingWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Recklessdriving?_When3");
		String CarelessDriving = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Carelessdriving?");
		String CarelessDrivinghowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Carelessdriving?_Howmany?");
		String CarelessDrivingWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Carelessdriving?_When1");
		String CarelessDrivingWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Carelessdriving?_When2");
		String CarelessDrivingWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Carelessdriving?_When3");
		String Movingviolation = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Movingviolation?");
		String MovingviolationHowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Movingviolation?_Howmany?");
		String MovingviolationWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Movingviolation?_When1");
		String MovingviolationWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Movingviolation?_When2");
		String MovingviolationWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PersonalHistory_Movingviolation?_When3"); 
		personalhistory.enterPersonalHistory(InsuredDisability, InsuredDisabilityDetails, Tobaccoin12M,
				Tobaccoin12MDetails, Tobaccoin24M, Tobaccoin24MDetails, Cigarin24M, Cigarin24count,
				PrescriptionMedicationin12M, PrescriptionMedicationin12MDetails, ConvictedProbation,
				ConvictedProbationDetails, ConvictedwithAlcoholin2Y, ConvictedwithAlcoholin2YDetails, Accidentin3Y);
		personalhistory.PersonalHistoryAccident(Accidentin3Y, Faultmotorvehicleaccident, FaultmotorvehicleaccidentHowMany, FaultmotorvehicleaccidentWhen1,
				FaultmotorvehicleaccidentWhen2, FaultmotorvehicleaccidentWhen3, Speedingticket, Lessthan15milesspeedlimit, Lessthan15milesspeedlimitHowmany, 
				Lessthan15milesspeedlimitWhen1, Lessthan15milesspeedlimitWhen2, Lessthan15milesspeedlimitWhen3, Greaterthanorequal15milesspeedlimit, 
				Greaterthanorequal15milesspeedlimitHowmany, Greaterthanorequal15milesspeedlimitWhen1, Greaterthanorequal15milesspeedlimitWhen2,
				Greaterthanorequal15milesspeedlimitWhen3, Suspendedlicense, Suspenedlicenseduetononpayment, Whenwasthelicensesuspended, Reasonforsuspension, 
				Hasitbeenreinstated, Whenreinstated, Recklessdriving, Recklessdrivinghowmany, RecklessdrivingWhen1, RecklessdrivingWhen2, RecklessdrivingWhen3,
				CarelessDriving, CarelessDrivinghowmany, CarelessDrivingWhen1, CarelessDrivingWhen2, CarelessDrivingWhen3, Movingviolation, MovingviolationHowmany,
				MovingviolationWhen1, MovingviolationWhen2, MovingviolationWhen3);
		
		String State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");

		String AntcptForgnTravelQuestn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC1_Anticipateanyforeigntravelinthenext2years");
		String HaveAgmtToBcmArmedforcesQuestn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC1_Haveawrittenagreementtobecome,oriscurrentlyamember,oftheArmedForces");
		String ExpectedMemberofPilotQuestn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC1_Expecttobecomewithinthenext2years,orbeeninthelast3years,apilot,astudentpilotorcrewmemberofanyaircraft");
		String TakePartinUnderwaterdivingHangglidParaSailing = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC1_Takepartinunderwaterdiving,hanggliding,parasailing");
		String ultralight_soaring_ballooning = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC1_ultralight_soaring_ballooning");
		String motorboat_snowmobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC1_motorboat_snowmobile");
		
		
		PHCOne.enterPersonalHistoryInformationContOneDetails(State,AntcptForgnTravelQuestn, HaveAgmtToBcmArmedforcesQuestn,
				ExpectedMemberofPilotQuestn, TakePartinUnderwaterdivingHangglidParaSailing,ultralight_soaring_ballooning,
				motorboat_snowmobile);
		
		String ProposedInsuredIS_questn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_Theproposedinsuredis");
		String EmpCurrentOcc = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-CurrentOccupation");
		String EmpDuties = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHC2_EMP-Duties");
		String EmployerName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-Employer/BusinessName(Ifself-employed,providebusinessname)");
		String EmployerCountry = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-Country");
		String EmployerStree1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-Street1");
		String EmployerStree2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-Street2");
		String EmployerStree3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-Street3");
		String EmployerCity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHC2_EMP-City");
		String EmployerState = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHC2_EMP-State");
		String EmployerZip = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHC2_EMP-Zip");
		String EarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-EarnedIncome-CurrentYear");
		String EarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-EarnedIncome-PriorYear");
		String UNEarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-UnEarnedIncome-CurrentYear");
		String UNEarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_EMP-UnEarnedIncome-PriorYear");
		String EmpNetworth = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHC2_EMP-NetWorth");
		String UnEmpReason = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_UNEMP-UnemployedReason");
		String AnnHouseEarnedIncm = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_UNEMP-AnnualHouseholdEarnedIncome");
		String HouseholdNetworth = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_UNEMP-HouseholdNetWorth");
		String AnnHouse_UNEarnedIncm = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_UNEMP-AnnualHouseholdUnearnedIncome");
		String OthercovWorkingspous = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHC2_OtherCoverageOnWorkingSpouse");

		PHCTwo.enterPersonalHistContTwo_screenDetails(ProposedInsuredIS_questn, EmpCurrentOcc, EmpDuties, EmployerName,
				EmployerCountry, EmployerStree1, EmployerStree2, EmployerStree3, EmployerCity, EmployerState,
				EmployerZip, EarnedIncmCurrentYear, EarnedIncmPriorYear, UNEarnedIncmCurrentYear, UNEarnedIncmPriorYear,
				EmpNetworth, UnEmpReason, AnnHouseEarnedIncm, HouseholdNetworth, AnnHouse_UNEarnedIncm,
				OthercovWorkingspous);
		
	}

	@When("^user fills SWL Life Other Coverage One Screen Details$")
	public void user_fills_SWL_Life_Other_Coverage_One_Screen_Details() throws Throwable {
	    
		String State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		String LOC_field1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LifeOtherCoverage_textfield1");
		String LOC_field2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LifeOtherCoverage_textfield2");
		String LOC_fieldtext2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LifeOtherCoverage_textfield3");
		String LOC_field3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LifeOtherCoverage_(excludingMassMutual)thatarenotbeingreplaced/changed?");
		String LOC_field4 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LifeOtherCoverage_rannuitycontractinforcewithMassMutualorothercompanies?");
		String NYAppliedWithMassMutual = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYAppliedWithMassMutual");
		String NYinsthatwillbeplacedwithMM= testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYinsthatwillbeplacedwithMM");
		String NYinforcewithMM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYinforcewithMM");
		String NYreplacedchanged = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYreplacedchanged");
		String NYcontractinforcewithMassMutual = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"NYcontractinforcewithMassMutual");
		LOC.othercoverage(State,LOC_field1, LOC_field2, LOC_fieldtext2, LOC_field3, LOC_field4,NYAppliedWithMassMutual,NYinsthatwillbeplacedwithMM ,NYinforcewithMM
				,NYreplacedchanged,NYcontractinforcewithMassMutual);
	}

	@When("^user fills SWL Primary Insured Two screen, Primary Insured Two Cont Screen and conversion two Screen details$")
	public void user_fills_SWL_Primary_Insured_Two_screen_Primary_Insured_Two_Cont_Screen_and_conversion_two_Screen_details() throws Throwable {
		String Firstname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_FirstName");
		String MidleName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_MI");
		String Lastname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_LastName");
		String Suffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Suffix");
		String Gender = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Gender");
		String Birth_state = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_BirthState");
		String ssn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_SSN");
		ProposedinsurerTwo.personal_Information(Firstname, MidleName, Lastname,Suffix,Gender, Birth_state, ssn);
		
		String ResidentialAddresssameInsured = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "ResidentialAddresssameInsured");
		String State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Resid_state");
		String MailingaddresssameasInsured = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "MailingaddresssameasInsured");
		String RESADDStreet1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_AddressStreet1");
		String RESADDStreet2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_AddressStreet2");
		String RESADDCity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_City");
		String RESADDZIP = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Zip");
		String MailingADD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_MailAdd");
		String MailingStreet1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_ALT_ AddressStreet1");
		String MailingStreet2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_ALT_AddressStreet2");
		String MailingCity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_ALT_City");
		String MailingState = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_ALT_State");
		String MailingZIPPostalCode = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_ALT_Zip");
		// Address Section data ENDS

		ProposedinsurerTwo.Address(ResidentialAddresssameInsured,RESADDStreet1, RESADDStreet2, RESADDCity, State,RESADDZIP, MailingADD,MailingaddresssameasInsured, MailingStreet1,
				MailingStreet2, MailingCity, MailingState, MailingZIPPostalCode);

		String PreferredPhoneNumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Phone");
		String HomeWorkMobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_HomeWork");
		String WorkExtension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Extension");
		String AlternatePhoneNumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Alt_Phone");
		String AlterHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Alt_HomeWork");
		String AlternateExtesnion = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Alt_Extension");
		String AmPM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_BestTime");
		String Besttimetocall = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_BesttimetoCall");
		String ReciveText_BD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Message");
		String NeedspecialAccomidation = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Accomodation");
		String preferredlanguage = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_PrefferedLang");
		String EmailAddress = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_Email");
		String Relationship = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PITwo_RElationsShip");
		// Write code here that turns the phrase above into concrete actions

		ProposedinsurerTwo.Additionalinfo(PreferredPhoneNumber, HomeWorkMobile, WorkExtension, AlternatePhoneNumber,
				AlterHomeWorkMobile, AlternateExtesnion, AmPM, ReciveText_BD, Besttimetocall, NeedspecialAccomidation,
				preferredlanguage, EmailAddress,Relationship);
		
		
		
		
		

		String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PICTwo_U.S.DriversLicense");
		String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PICTwo_IdentificationNumber");
		
		String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PICTwo_ReaspnWhy");
		String PICType_of_identification = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PICTwo_TypeOfIdentification");
		String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PICTwo_StateProvinceofIssue");
		String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PICTwo_Other");
		String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PICTwo_TypeofCitizenship");
		String Expr_MM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"Whole_Life","LOC_Exp_MM");
		String Expr_DD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"Whole_Life", "LOC_Exp_DD");
		String Expr_YYYY = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"Whole_Life", "LOC_Exp_YYYY");
		PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
				PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
				TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);

		
		
		
		
	}

	@When("^user fills SWL Personal History Two Screen and Life Other Coverage Two Screen details$")
	public void user_fills_SWL_Personal_History_Two_Screen_and_Life_Other_Coverage_Two_Screen_details() throws Throwable {
		String InsuredDisability = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits");
		String InsuredDisabilityDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits_Details");
		String Tobaccoin12M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months");
		String Tobaccoin12MDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months_Details");
		String Tobaccoin24M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Withinthelast24months");
		String Tobaccoin24MDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Withinthelast24months_Details");
		String Cigarin24M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_UsedCigarswithinthelast24months");
		String Cigarin24count = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_UsedCigarswithinthelast24months_Numberofcigarsperyear");
		String PrescriptionMedicationin12M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Usedprescriptionmedicationtoassistwithsmokingcessation");
		String PrescriptionMedicationin12MDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Usedprescriptionmedicationtoassistwithsmokingcessation_Details");
		String ConvictedProbation = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation");
		String ConvictedProbationDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation_Details");
		String ConvictedwithAlcoholin2Y = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol");
		String ConvictedwithAlcoholin2YDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol_Details");
		String Accidentin3Y = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Beeninamotorvehicleaccidentinwhichtheywerefoundtobeatfault");
		String Faultmotorvehicleaccident = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Atfaultmotorvehicleaccident?");
		String FaultmotorvehicleaccidentHowMany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Atfaultmotorvehicleaccident?_Howmany");
		String FaultmotorvehicleaccidentWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Atfaultmotorvehicleaccident?_When1");
		String FaultmotorvehicleaccidentWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Atfaultmotorvehicleaccident?_When2");
		String FaultmotorvehicleaccidentWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Atfaultmotorvehicleaccident?_When3");
		String Speedingticket = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Speedingticket?");
		String Lessthan15milesspeedlimit = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Lessthan15milesoverthespeedlimit?");
		String Lessthan15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Lessthan15milesoverthespeedlimit?_Howmany");
		String Lessthan15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Lessthan15milesoverthespeedlimit?_When1");
		String Lessthan15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Lessthan15milesoverthespeedlimit?_When2");
		String Lessthan15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Lessthan15milesoverthespeedlimit?_When3");
		String Greaterthanorequal15milesspeedlimit = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Greaterthanorequalto15milesoverthespeedlimit?");
		String Greaterthanorequal15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Greaterthanorequalto15milesoverthespeedlimit?_Howmany");
		String Greaterthanorequal15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Greaterthanorequalto15milesoverthespeedlimit?_When1");
		String Greaterthanorequal15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Greaterthanorequalto15milesoverthespeedlimit?_When2");
		String Greaterthanorequal15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Greaterthanorequalto15milesoverthespeedlimit?_When3");
		String Suspendedlicense = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Suspendedlicense?");
		String Suspenedlicenseduetononpayment = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Suspenedlicenseduetononpaymentofchildsupport?");
		String Whenwasthelicensesuspended = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Whenwasthelicensesuspended?");
		String Reasonforsuspension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Reasonforsuspension?");
		String Hasitbeenreinstated = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Hasitbeenreinstated?");
		String Whenreinstated = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Whenreinstated?");
		String Recklessdriving = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Recklessdriving?");
		String Recklessdrivinghowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Recklessdriving?_Howmany?");
		String RecklessdrivingWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Recklessdriving?_When1");
		String RecklessdrivingWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Recklessdriving?_When2");
		String RecklessdrivingWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Recklessdriving?_When3");
		String CarelessDriving = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Carelessdriving?");
		String CarelessDrivinghowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Carelessdriving?_Howmany?");
		String CarelessDrivingWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Carelessdriving?_When1");
		String CarelessDrivingWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Carelessdriving?_When2");
		String CarelessDrivingWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Carelessdriving?_When3");
		String Movingviolation = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Movingviolation?");
		String MovingviolationHowmany = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Movingviolation?_Howmany?");
		String MovingviolationWhen1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Movingviolation?_When1");
		String MovingviolationWhen2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Movingviolation?_When2");
		String MovingviolationWhen3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHTwo_Movingviolation?_When3"); 
		personalhistory.enterPersonalHistory(InsuredDisability, InsuredDisabilityDetails, Tobaccoin12M,
				Tobaccoin12MDetails, Tobaccoin24M, Tobaccoin24MDetails, Cigarin24M, Cigarin24count,
				PrescriptionMedicationin12M, PrescriptionMedicationin12MDetails, ConvictedProbation,
				ConvictedProbationDetails, ConvictedwithAlcoholin2Y, ConvictedwithAlcoholin2YDetails, Accidentin3Y);
		personalhistory.PersonalHistoryAccident(Accidentin3Y, Faultmotorvehicleaccident, FaultmotorvehicleaccidentHowMany, FaultmotorvehicleaccidentWhen1,
				FaultmotorvehicleaccidentWhen2, FaultmotorvehicleaccidentWhen3, Speedingticket, Lessthan15milesspeedlimit, Lessthan15milesspeedlimitHowmany, 
				Lessthan15milesspeedlimitWhen1, Lessthan15milesspeedlimitWhen2, Lessthan15milesspeedlimitWhen3, Greaterthanorequal15milesspeedlimit, 
				Greaterthanorequal15milesspeedlimitHowmany, Greaterthanorequal15milesspeedlimitWhen1, Greaterthanorequal15milesspeedlimitWhen2,
				Greaterthanorequal15milesspeedlimitWhen3, Suspendedlicense, Suspenedlicenseduetononpayment, Whenwasthelicensesuspended, Reasonforsuspension, 
				Hasitbeenreinstated, Whenreinstated, Recklessdriving, Recklessdrivinghowmany, RecklessdrivingWhen1, RecklessdrivingWhen2, RecklessdrivingWhen3,
				CarelessDriving, CarelessDrivinghowmany, CarelessDrivingWhen1, CarelessDrivingWhen2, CarelessDrivingWhen3, Movingviolation, MovingviolationHowmany,
				MovingviolationWhen1, MovingviolationWhen2, MovingviolationWhen3);
		String State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");

		String AntcptForgnTravelQuestn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo1_Anticipateanyforeigntravelinthenext2years");
		String HaveAgmtToBcmArmedforcesQuestn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo1_Haveawrittenagreementtobecome,oriscurrentlyamember,oftheArmedForces");
		String ExpectedMemberofPilotQuestn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo1_Expecttobecomewithinthenext2years,orbeeninthelast3years,apilot,astudentpilotorcrewmemberofanyaircraft");
		String TakePartinUnderwaterdivingHangglidParaSailing = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo1_Takepartinunderwaterdiving,hanggliding,parasailing");
		String ultralight_soaring_ballooning = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo1_ultralight_soaring_ballooning");
		String motorboat_snowmobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo1_motorboat_snowmobile");

		PHCOne.enterPersonalHistoryInformationContOneDetails(State,AntcptForgnTravelQuestn, HaveAgmtToBcmArmedforcesQuestn,
				ExpectedMemberofPilotQuestn, TakePartinUnderwaterdivingHangglidParaSailing,ultralight_soaring_ballooning,
				motorboat_snowmobile);
		
		String ProposedInsuredIS_questn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_Theproposedinsuredis");
		String EmpCurrentOcc = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-CurrentOccupation");
		String EmpDuties = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHCTwo2_EMP-Duties");
		String EmployerName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-Employer/BusinessName(Ifself-employed,providebusinessname)");
		String EmployerCountry = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-Country");
		String EmployerStree1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-Street1");
		String EmployerStree2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-Street2");
		String EmployerStree3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-Street3");
		String EmployerCity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHCTwo2_EMP-City");
		String EmployerState = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHCTwo2_EMP-State");
		String EmployerZip = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHCTwo2_EMP-Zip");
		String EarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-EarnedIncome-CurrentYear");
		String EarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-EarnedIncome-PriorYear");
		String UNEarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-UnEarnedIncome-CurrentYear");
		String UNEarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_EMP-UnEarnedIncome-PriorYear");
		String EmpNetworth = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PHCTwo2_EMP-NetWorth");
		String UnEmpReason = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_UNEMP-UnemployedReason");
		String AnnHouseEarnedIncm = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_UNEMP-AnnualHouseholdEarnedIncome");
		String HouseholdNetworth = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_UNEMP-HouseholdNetWorth");
		String AnnHouse_UNEarnedIncm = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_UNEMP-AnnualHouseholdUnearnedIncome");
		String OthercovWorkingspous = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"PHCTwo2_OtherCoverageOnWorkingSpouse");

		PHCTwo.enterPersonalHistContTwo_screenDetails(ProposedInsuredIS_questn, EmpCurrentOcc, EmpDuties, EmployerName,
				EmployerCountry, EmployerStree1, EmployerStree2, EmployerStree3, EmployerCity, EmployerState,
				EmployerZip, EarnedIncmCurrentYear, EarnedIncmPriorYear, UNEarnedIncmCurrentYear, UNEarnedIncmPriorYear,
				EmpNetworth, UnEmpReason, AnnHouseEarnedIncm, HouseholdNetworth, AnnHouse_UNEarnedIncm,
				OthercovWorkingspous);
		
		
		

		//String State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		String LOC_field1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LOCTwo_textfield1");
		String LOC_field2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LOCTwo_textfield2");
		String LOC_fieldtext2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LOCTwo_textfield3");
		String LOC_field3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LOCTwo_(excludingMassMutual)thatarenotbeingreplaced/changed?");
		String LOC_field4 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LOCTwo_rannuitycontractinforcewithMassMutualorothercompanies?");
		String NYAppliedWithMassMutual = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYAppliedWithMassMutual");
		String NYinsthatwillbeplacedwithMM= testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYinsthatwillbeplacedwithMM");
		String NYinforcewithMM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYinforcewithMM");
		String NYreplacedchanged = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NYreplacedchanged");
		String NYcontractinforcewithMassMutual = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"NYcontractinforcewithMassMutual");
		LOC.othercoverage(State,LOC_field1, LOC_field2, LOC_fieldtext2, LOC_field3, LOC_field4,NYAppliedWithMassMutual,NYinsthatwillbeplacedwithMM ,NYinforcewithMM
				,NYreplacedchanged,NYcontractinforcewithMassMutual);
	    
	}

	@When("^user fills SWL Product Whole Life Screen and Life purpose of Insurance screen$")
	public void user_fills_SWL_Product_Whole_Life_Screen_and_Life_purpose_of_Insurance_screen() throws Throwable {
		
		//sul
		String frequency = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SUL_Frequency");
		String PlannedPremium= testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SUL_PlannedPremium");
		String NON_Premium = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SUL_NON_1035");
		String Rider = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SUL_EstateProtectionRider");
		String Amount= testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SUL_EstateProtectionRider_Amount");
		String AlternateAdditionalPolicy = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"WLP_alternate_additionalPolicy");
		String Plan_Product_Alt = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Plan_Product_alternate");
		String Plan_Product_Add = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Plan_Product_additional");
		PWL.SULProduct(frequency, PlannedPremium, NON_Premium, Rider, Amount, AlternateAdditionalPolicy,Plan_Product_Alt,Plan_Product_Add);
		
		//SWL
		
		String AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "WL_AutomaticPremiumLoan");
		String LoanRate= testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "WL_LoanRate");
		String dividendoption = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "WLP_DividendOption");

		
		PWL.wholelife(AutomaticPremiumLoan, LoanRate, dividendoption);
		
		String Alir = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "ALIR");
		String ModalAmount= testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "WL_ModelPayemnt");
		String LumpAmount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "WL_Unscheduled Lump Sum");
		String DividentOption = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "WL_ALIRDividentOption");
		String EstateProtectionRider = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"WL_Estate Protection Rider");
		String Product = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_Product");
		PWL.OptionalRiders(Product,Alir, ModalAmount, LumpAmount, DividentOption, EstateProtectionRider, AlternateAdditionalPolicy,Plan_Product_Alt,Plan_Product_Add);
	    
		///Alt and Addproduct
		String Alt_Faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Alt_FaceAmount");
		String ALT_WavierOfPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "WLP_Alt_WavierOfPemiumrider");
		String ALT_AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "WLP_Alt_AutomaticPremiumLoan_UL");
		String ALT_LoanRate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Alt_LoanRate_UL");
		String ALT_DividentOption_WL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Alt_DividentOption_UL");
		String Alt_WLPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_ALT_WaiverOfPremiumRider");
		String ALT_PlannedAmount_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Alt_PlannedAmount_UL");
		String ALT_unsheduledPremium_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Alt_unsheduledpremium_UL");
		String ADD_Faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Add_FaceAmount");
		String ADD_WavierOfPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "WLP_Add_WavierOfPemiumrider");
		String ADD_AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "WLP_Add_AutomaticPremiumLoan_UL");
		String ADD_LoanRate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Add_LoanRate_UL");
		String ADD_DividentOption_WL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Add_DividentOption_UL");
		String ADD_WLPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_ADD_WaiverOfPremiumRider");
		String ADD_PlannedAmount_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Ad_PlannedAmount_UL");
		String ADD_unsheduledPremium_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Add_unsheduledpremium_UL");
		String Alt_UL_intialpremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Alt_UL_intialpremium");
		String Add_UL_intialpremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","WLP_Add_UL_intialpremium");
		
		if (AlternateAdditionalPolicy.equalsIgnoreCase("Alternate")) {
			products_alt_add.Alternate(AlternateAdditionalPolicy, Plan_Product_Alt, Alt_Faceamount,
					ALT_WavierOfPremiumRider, ALT_AutomaticPremiumLoan, ALT_LoanRate, ALT_DividentOption_WL,Alt_WLPremiumRider,
					ALT_PlannedAmount_UL,Alt_UL_intialpremium, ALT_unsheduledPremium_UL);
		}
		if (AlternateAdditionalPolicy.equalsIgnoreCase("Additional")) {
			products_alt_add.AdditionalProduct(AlternateAdditionalPolicy, Plan_Product_Add, ADD_Faceamount,
					ADD_WavierOfPremiumRider, ADD_AutomaticPremiumLoan, ADD_LoanRate, ADD_DividentOption_WL,ADD_WLPremiumRider,
					ADD_PlannedAmount_UL, ADD_unsheduledPremium_UL,Add_UL_intialpremium);
		}
		if (AlternateAdditionalPolicy.equalsIgnoreCase("Both")) {
			products_alt_add.Both(AlternateAdditionalPolicy, Plan_Product_Alt, Alt_Faceamount, ALT_WavierOfPremiumRider,
					ALT_AutomaticPremiumLoan, ALT_LoanRate, ALT_DividentOption_WL,Alt_WLPremiumRider, ALT_PlannedAmount_UL,
					ALT_unsheduledPremium_UL, Alt_UL_intialpremium,Plan_Product_Add, ADD_Faceamount, ADD_WavierOfPremiumRider,
					ADD_AutomaticPremiumLoan, ADD_LoanRate, ADD_DividentOption_WL,ADD_WLPremiumRider, ADD_PlannedAmount_UL,
					ADD_unsheduledPremium_UL,Add_UL_intialpremium);
		}
		
		String LPOI_Personal = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Personal");
		String LPOI_sponserdplan = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Isthispolicybeingpurchasedinconnectionwithanemployer_sponsoredplan?");
		String LPOI_policybecollaterallyassigned = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Willthispolicybecollaterallyassigned?");
		String LPOI_Insurance_Type = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Type");
		String LPOI_nameofAssigne = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_CompleteNameofAssignee:");
		String LPOI_Assignee_Street1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_Street1");
		String LPOI_Assignee_Street2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_Street2");
		String LPOI_Assignee_City = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_City");
		String LPOI_Assignee_State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_State");
		String LPOI_Assignee_Zip = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_Zip");
		String LPOI_Assignee_phone = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_phone");
		String LPOI_Assignee_Homeworkcell = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_Homeworkmobile");
		String LPOI_Assignee_Extension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Assignee_Extension");
		String LPOI_EconomicIncntvFreeQuestn = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_HastheProposedInsured(s)and_ortheProposedPolicyOwner(s)beenofferedanyeconomicincentivesuchas'free'");
		String LPOI_EconomicIncntvFreeQuestn_details = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Details:");
		String LPOI_Does_the_Proposed_Insured = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_DoestheProposedInsured(s)and/ortheProposedPolicyOwner(s)haveacurrentagreementorcommitmenttosell");
		String LPOI_Does_the_Proposed_Insured_details = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_commitmenttosell_Details:");
		String LPOI_Is_the_policy_directly_or_indirectly = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Isthepolicydirectlyorindirectlyownedbyacaptiveinsurancecompany");
		String LPOI_Is_the_policy_directly_or_indirectly_details = testdata.get(HooksTest.scenario.getName(),
				TestDataFileName,"SWL", "LPOI_captiveinsurancecompany_Details:");
		String LPOI_Will_the_source_of_any_premium_payments = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPOI_Willthesourceofanypremiumpaymentsbeassetsoforfromcontributionstoacaptiveinsurancecompany?");
		String LPOI_Will_the_source_of_any_premium_payments_details = testdata.get(HooksTest.scenario.getName(),
				TestDataFileName,"SWL", "LPOI_Willthesourceofanypremium_Details:");
		LPOI.personal_and_Bussiness(LPOI_Personal);
		
		LPOI.Will_this_policy_be_collaterally_assigned(LPOI_policybecollaterallyassigned, LPOI_Insurance_Type,
				LPOI_nameofAssigne, LPOI_Assignee_Street1, LPOI_Assignee_Street2, LPOI_Assignee_City,
				LPOI_Assignee_State, LPOI_Assignee_Zip, LPOI_Assignee_phone, LPOI_Assignee_Homeworkcell,
				LPOI_Assignee_Extension);
		LPOI.enterLPIdetails(LPOI_sponserdplan, LPOI_EconomicIncntvFreeQuestn, LPOI_EconomicIncntvFreeQuestn_details,
				LPOI_Does_the_Proposed_Insured, LPOI_Does_the_Proposed_Insured_details,
				LPOI_Is_the_policy_directly_or_indirectly, LPOI_Is_the_policy_directly_or_indirectly_details,
				LPOI_Will_the_source_of_any_premium_payments, LPOI_Will_the_source_of_any_premium_payments_details);
		
		
		String MoreThanOneOwner = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","LCS_more than one owner");
		String primaryinsIsOwner = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","LCS_primary insured the owner");
		String Ind_Entity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","owner an individual or an entity");
		if(MoreThanOneOwner.equalsIgnoreCase("No") && primaryinsIsOwner.equalsIgnoreCase("No")&& Ind_Entity.equalsIgnoreCase("IndividualOwner")){
			String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_IndividualOwnerType");
			String firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_street2");
			String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_state");
			String Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_extension");
			String email = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_email");
			String relationship = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LO_SSN");
			//LifeOwner Continuous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "LOC_Exp_YYYY");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//lifeownerContinuous
			PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
		
		
		
		String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "LO_IndividualOwnerType");
		if (indiviualOwnertype.equalsIgnoreCase("One individual owner during his/her lifetime and thereafter a contingent owner and thereafter the Insured")
				&& MoreThanOneOwner.equalsIgnoreCase("No") && primaryinsIsOwner.equalsIgnoreCase("No") && Ind_Entity.equalsIgnoreCase("IndividualOwner")) {
			String firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_street2");
			String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_state");
			String Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_extension");
			String email = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_email");
			String relationship = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL", "JointContigentOwner_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(),TestDataFileName, "SWL","JointContigentOwner_SSN");
			//jointcontigentowner continous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "LOC_Exp_YYYY");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//jointcontigentowner continous
			PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
		String Entitytype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_TypeofEntityOwnership");
		String SpecificEntityType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_SpecifyType");
		String EntityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NameOfEntity_or Trust");
		String ProposedInsuredDirector = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_ProposedInsuredaDirector");
		String EntityMaxfaceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_MaxFaceAmount");
		String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "DateOfTrust_MM");
		String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","DateOfTrust_DD");
		String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "DateOfTrust_YYYY");
		String TypeofTrust = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "TypeOfTrust(Yes_revoc/No_Irrevoc");
		String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Enity_SameasAddress");
		String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_Stree1");
		String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Entity_Street2");
		String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_City");
		String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_State");
		String Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Entity_Zip");
		String Mailingadd = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_MailAdd");
		String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Entity_MailingStreet1");
		String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Entity_MailingStreet2");
		String Mail_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_MailingCity");
		String Mail_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_MailState");
		String Mail_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Entity_MailZip");
		String SSN_EIN = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_SSn_OR_EIN");
		String SSN_EINnumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Entity_SSN_EINNumber");
		String TypeOfCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Entity_TypeOfCitizenship_UsEntity(Yes)_Foreign(No)");
		//TrustCertificaiton
		String TrusteeType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Trustee_Type");
		String FirstName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Trustee_Indiviual/Entity_firstName");
		String MiddleName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Trustee_Indiviual/Entity_MiddleName");
		String LastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Trustee_Indiviual/Entity_LastName");
		String Suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Trustee_Indiviual/Entity_Suffix");
		String email = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Trustee_Indiviual/Entity_Email");
		String trustEntityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Trustee_EntityName");
		String title = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Trustee_entityTitle");
		
		String Grantortype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_Type");
		String GrantorFirstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_Indiviual/Entity_firstName");
		String GrantorMiddlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_Indiviual/Entity_MiddleName");
		String GrantorLastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_Indiviual/Entity_LastName");
		String Grantorsuffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_Indiviual/Entity_Suffix");
		String Grantorcountry = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_Indiviual/Entity_CountyCitizen");
		String mm = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_DOB_MM");
		String dd = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_DOB_DD");
		String yyyy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_DOB_YYYY");
		String ssn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_INDIV_SSN_ITN");
		String AddressSamePI = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_AddressSameAsPI");
		String streetone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_IndivEntity_Stree1");
		String streettwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_IndivEntity_Stree2");
		String City = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_IndivEntity_City");
		String Grantorstate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_IndivEntity_State");
		String zipcode = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_IndivEntity_Zipcode");
		String GrantorEntityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Grantor_EntityName");
		String TaxPayerno = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Grantor_TaxpayerId");
		
		String RelationShipBene = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Relationto Bene");
		String RelationshipOtherDtls = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "RelationshipOtherDtls");
		String AuthorizeTrusteee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","AuthorizeTrusteee");
		String viaticalCompany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "viaticalCompany");
		String RelationGrantor = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "RelationGrantor");
		String SigningTrustee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","SigningTrustee");
		
		// Apex
		String Signertitle = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_SignerTitle");
		String SolefiicerYesNo = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Entity_SoleOfficer_Yes_No");
		String SoleFirstName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Entity_Sole_FirstName");
		String SoleLastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL","Entity_soleLastName");
		String VULBussinesphoneno = testdata.get(HooksTest.scenario.getName(), TestDataFileName, "SWL", "RelationGrantor");
		String VULphonetype = testdata.get(HooksTest.scenario.getName(), TestDataFileName, "SWL", "SigningTrustee");

		EO.Entityowner(Entitytype, SpecificEntityType, EntityName, ProposedInsuredDirector, EntityMaxfaceamount, MM, DD,
				YYYY, TypeofTrust);
		EO.Address(AddresssameasPI, street1, street2, city, state, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State, Mail_Zip, Signertitle, SolefiicerYesNo, SoleFirstName, SoleLastName, SSN_EIN, SSN_EINnumber, TypeOfCitizenship,
				VULBussinesphoneno, VULphonetype);

		Trust.trustees_Grantor(TrusteeType, FirstName, MiddleName, LastName, Suffix, email,
				trustEntityName, title, Grantortype, GrantorFirstname, GrantorMiddlename, GrantorLastname, 
				Grantorsuffix, Grantorcountry, mm, dd, yyyy, ssn, AddressSamePI, streetone, streettwo, City, Grantorstate,
				zipcode, GrantorEntityName, TaxPayerno);
		Trust.BeneficiaryInformation(RelationShipBene, RelationshipOtherDtls, AuthorizeTrusteee, viaticalCompany, RelationGrantor, SigningTrustee);
		
	}

	@When("^user fills SWL Life Beneficiaries screen ,Life Payment Information and Certification screen$")
	public void user_fills_SWL_Life_Beneficiaries_screen_Life_Payment_Information_and_Certification_screen() throws Throwable {
		String LB_Distributiontype = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_BusinessSupplement_DistributionType");
		String LB_beneaddition_yesorNo = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_Beneficiary_ClickHeretoAdd");
		String LB_Beneficiary_Type = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_Beneficiary_Type");
		String LB_firstname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_FirstName");
		String LB_Middlename = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_M.I.");
		String LB_Lastname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_LastName");
		String LB_suffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_Suffix");
		String LB_MAilingadd_yesorNo = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_MailingAddresssameasPrimaryInsured?");
		String LB_HomeWorkMobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_HomeWorkMobile");
		String LB_phonenumber = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_PhoneNumber");
		String LB_Extension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_Extension");
		String LB_Month = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_DOB_MM");
		String LB_Date = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_DOB_DD");
		String LB_Year = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_DOB_YYYY");
		String LB_TinType = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_TINType");
		String LB_SSNno = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LB_NI_TaxIDNo");
		String LB_RelationShip = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_RelationshiptoInsured");
		String LB_Distribution = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_Distribution");
		String LB_IssueStripes = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_NI_Issueperstirpes");
		
		String LB_WouldyouliketonameaCustodian = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_WouldyouliketonameaCustodian");
		String LB_Custodian_First = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_Custodian_First");
		String LB_Custodian_MI = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_Custodian_MI");
		String LB_Custodian_Last = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_Custodian_Last");
		String LB_Custodian_Suffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_Custodian_Suffix");
		String LB_Custodian_State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LB_Custodian_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_ProductType");
		LifeBene.distribution_Type(LB_Distributiontype);
		LifeBene.beneficiary_addition(ProductType,LB_beneaddition_yesorNo, LB_Beneficiary_Type, LB_firstname, LB_Middlename,
				LB_Lastname, LB_suffix, LB_MAilingadd_yesorNo, LB_HomeWorkMobile, LB_phonenumber, LB_Extension,
				LB_Month, LB_Date, LB_Year, LB_TinType, LB_SSNno, LB_RelationShip, LB_Distribution, LB_IssueStripes);
	
		LifeBene.custodian(LB_WouldyouliketonameaCustodian, LB_Custodian_First, LB_Custodian_MI, LB_Custodian_Last,
				LB_Custodian_Suffix, LB_Custodian_State);
		
		
		
		String state = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		String Billing= testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "LifepaymentInfo_BillingType");
		String freq_M = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPI_Frequnecy");
		String Initialpremiumbeingsubmitted = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPI_remium being submitted with this Application?");
		String premiumpayor = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPI_Premium Payor");
		String PremincludeLoanorPremFinancing = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPI_ include a loan or premium financing?");
		String selectPRemium = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_PayInfoSourceOfPremium");
		String selectPRemiumotherdetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"NY_PayInfoSourceOfPremium_otherdetails");

		lpinfo.life_pay_field_entry(state,freq_M,Billing, Initialpremiumbeingsubmitted, premiumpayor, PremincludeLoanorPremFinancing,selectPRemium,selectPRemiumotherdetails);

	    
		
		
	
		 String SalesCertification = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "salesCertification");
	     
	        certify.salesCertification(SalesCertification);
	        String Certi_taxpayer_id = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Certification_TaxpayerIdentificationNumber");
			String Certi_backup = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",  "Certification_IamNOTsubjecttobackupwithholding");
			String Certi_us = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Certification_IamaU.S.person");
	        certify.TaxPayerIdentification(Certi_taxpayer_id,Certi_backup, Certi_us);
		

		String CI_State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		String AZ_KY_personalphysician_RD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AZ_KY_personalphysician_RD");
		String CT_physician_or_health = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CT_HIV");
		String DC_Fl_physician_or_health = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "DC_FL_HIV");
		String IA_Alternate_Myphysician_none = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "IA_HIV");
		String Ks_Ma_MePIandPhysician = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "KS_MA_HIV");
		String NY_physician_or_health = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_HIV");
		String MI_YEsNo = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL","MI_HIV_YEsNo");
		String MI_authorizeHiv = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL","MI_Hiv");
		
		String Fname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_FirstName");
		String Lname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_LastName");
		String Addrs = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_Address");
		String Cty = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_City");
		String ST = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_State");
		String Zpcd = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_Zip");
		String HCprovidername = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_HealthCareProviderName");
		String Alternativesitename = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_AlternativeSite");
		String Dname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Hiv_Designeename");
		String MoPhysician_RD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Mo_HIV");
		String ExaminerName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "HIV_ExaminerName");
		String FacilityName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Hiv_FacilityName");
		
		Consent_HIV.personalPhysician_Yes_No(CI_State, AZ_KY_personalphysician_RD, CT_physician_or_health, DC_Fl_physician_or_health, IA_Alternate_Myphysician_none,
				Ks_Ma_MePIandPhysician, NY_physician_or_health,MoPhysician_RD, Fname, Lname, Addrs, Cty, ST, Zpcd, HCprovidername, Alternativesitename, MI_YEsNo, MI_authorizeHiv,
				Dname,ExaminerName,FacilityName);
		
		Consent_HIV.personalPhysician_Yes_No(CI_State, AZ_KY_personalphysician_RD, CT_physician_or_health, DC_Fl_physician_or_health, IA_Alternate_Myphysician_none,
				Ks_Ma_MePIandPhysician, NY_physician_or_health,MoPhysician_RD, Fname, Lname, Addrs, Cty, ST, Zpcd, HCprovidername, Alternativesitename, MI_YEsNo, MI_authorizeHiv,
				Dname,ExaminerName,FacilityName);
		
	}

	@When("^user fills SWL Life Producer Statement details Screen and Producer Compensation Screen$")
	public void user_fills_SWL_Life_Producer_Statement_details_Screen_and_Producer_Compensation_Screen() throws Throwable {
		
		String swlRiskClassification1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPS_SWLRiskClassificationone");
		String swlRiskClassification2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
						"LPS_SWLRiskClassificationTwo");

		String MultipolicyCase = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_Isthispartofamulti-policycase(i.e.familymembers,businesspartners,etc.)?");
		String MultipolicyCasePolicyNumbers = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_MultiPolicyProvidedassociatedPolicyNumber(s)");
		String Otherapplicationssubmitted = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_Arethereanyotherapplications(e.g.Disability,LongTermCare)beingsubmittedconcurrentlywiththisApplicationorwithinthelasttwomonths?");
		String OtherapplicationssubmittedPolicyNumbers = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_OtherapplicationssubmittedProvideassociatedPolicyNumber(s)");
		String Dividends = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_WilldividendsfromanexistingMassMutualpolicybeusedtopayallorpartoftheinitialpremiumonthispolicy?");
		String ServiceRequest = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_WouldyouliketocompleteaServiceRequestform?");
		String PurchaseSinglePremiumImmediateAnnuity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_IstheLifeInsurancebeingappliedforinconjunctionwiththepurchaseofaSinglePremiumImmediateAnnuity?");
		String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers = testdata.get(HooksTest.scenario.getName(),
				TestDataFileName,"SWL", "LIfeProducerStatement_PurchaseSinglePremiumProvideassociatedPolicyNumber(s)");
		String DiscussedArrangingFinancingForPurchase = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_AreyouawareofwhethertheProposedOwnerorProposedInsuredhasarranged,ordiscussedarranging,anyfinancingforthepurchaseofthispolicy?");
		String KnowledgeReasontoBelieve = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_KnowledgeReasontoBelieve");
		String KnowledgeReasontoBelieveDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_Details");
		String UnderstandEnglish = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_DideverypersonsigningthisApplicationunderstandandanswereachquestioninEnglish?");
		String IndicateLanguage = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_IndicateLanguage");
		String MarketType = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LIfeProducerStatement_MarketType");
		producerStatement.enterProducerStatement(swlRiskClassification1,swlRiskClassification2, MultipolicyCase, MultipolicyCasePolicyNumbers,
				Otherapplicationssubmitted, OtherapplicationssubmittedPolicyNumbers, Dividends, ServiceRequest,
				PurchaseSinglePremiumImmediateAnnuity, PurchaseSinglePremiumImmediateAnnuityPolicyNumbers,
				DiscussedArrangingFinancingForPurchase, KnowledgeReasontoBelieve, KnowledgeReasontoBelieveDetails,
				UnderstandEnglish, IndicateLanguage, MarketType);
		
		
		String ProducerRole = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_ProducerRole");
		String ProducerEmail = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Email");
		String LicenceID = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LifeProducerCompensation_FloridLIC");
		String Firstyearcommission = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_1stYearCommission");
		String RenewalCommision = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_RenewalCommission");
		String AdditionalProducer = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_Arethereadditionalproducers?");
		String ContactOneFirstName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact1FirstName");
		String ContactOneLastName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact1LastName");
		String ContactOnePhone = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact1Phone");
		String ContactOneHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_Contact1HomeWorkMobile");
		String ContactOneExtension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_Contact1WorkExtension");
		String ContactOneEmail = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact1Email");
		String ContactTwoFirstName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact2FirstName");
		String ContactTwoLastName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact2LastName");
		String ContactTwoPhone = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact2Phone");
		String ContactTwoHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_Contact2HomeWorkMobile");
		String ContactTwoExtension = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_Contact2WorkExtension");
		String ContactTwoEmail = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Contact2Email");

		String Add_ProducerRole = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_Add_ProducerRole");
		String NumberOfProducer = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Number_OF_producer");
		
		String ProducerID = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_ProducerID");
		String AgencyId = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_AgencyId");
		String ProducerID2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_ProducerID2");
		String AgencyId2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_AgencyId2");
		String ProducerID3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_ProducerID3");
		String AgencyId3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "LPC_AgencyId3");
		
		String fst_Year_Commission1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_%_1st_Year_Commission1");
		String Renewal_Commission1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_%_Renewal_Commission1");
		String fst_Year_Commission2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_%_1st_Year_Commission2");
		String Renewal_Commission2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_%_Renewal_Commission2");
		String fst_Year_Commission3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_%_1st_Year_Commission3");
		String Renewal_Commission3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"LPC_%_Renewal_Commission3");
		String firm1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"firm1");
		String firm2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"firm2");
		String firm3 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"firm3");

		producerCompensation.enterProducerCompensation(ProducerRole, ProducerEmail, LicenceID, Firstyearcommission,
				RenewalCommision, AdditionalProducer);
		producerCompensation.AdditionalProducer(AdditionalProducer, NumberOfProducer, Add_ProducerRole, 
				ProducerID, AgencyId,firm1, ProducerID2, AgencyId2,firm2, ProducerID3, AgencyId3,firm3, 
				fst_Year_Commission1, Renewal_Commission1, fst_Year_Commission2, Renewal_Commission2, fst_Year_Commission3, Renewal_Commission3);
		producerCompensation.ContactDetails(ContactOneFirstName, ContactOneLastName, ContactOnePhone,
				ContactOneHomeWorkMobile, ContactOneExtension, ContactOneEmail, ContactTwoFirstName, ContactTwoLastName,
				ContactTwoPhone, ContactTwoHomeWorkMobile, ContactTwoExtension, ContactTwoEmail);
		
		
		//NY
		String IntendonConvertingpolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "IntendonConvertingpolicy");
		 String Anticipatedtimecoverage = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_coverageisneeded");
	        String Primarypurposeof_ins = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_PrimaryPurposeOfIns");
	        String InsOptionsAbove = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_InsOptionsAbove");        
	        String Dependent = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_dependents");
	        String DependentDetails = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_dependentDetails");
	        String OtherText = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_dependentOtherDetails");
	        String state = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");        
	        NYlps.productAndPremiumPayorInfo(state,IntendonConvertingpolicy, Anticipatedtimecoverage, Primarypurposeof_ins, InsOptionsAbove, Dependent, DependentDetails,
	                OtherText);
	        String sourceofPremium = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilitysourceofPremium");
	        String TaxPenality = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_TaxPenality");
	        String hardshipwithdrawal = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_hardshipwithdrawal");        
	        String surrenderCharge = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_surrenderCharge");
	        String surrenderChargeDetail = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_surrenderChargeDetail");
	        String Exchangeamount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_Exchangeamount");
	        String exchangSurenderCharge = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_exchangSurenderCharge");        
	        String surrenderChargeAmount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_surrenderChargeAmount");
	        String AnnuitizationSurenderCharge = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_AnnuitizationSurenderCharge");
	        String AnnuitizationSurenderChargeAmount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.financialinfo(state, sourceofPremium, TaxPenality, hardshipwithdrawal, surrenderCharge, surrenderChargeDetail, Exchangeamount,
	                exchangSurenderCharge, surrenderChargeAmount, AnnuitizationSurenderCharge, AnnuitizationSurenderChargeAmount);
	        String securitiess = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_securitiess");
	        String Annuitiess = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_Annuitiess");
	        String CashValues = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_CashValues");        
	        String AlternativeInvestmentss = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_AlternativeInvestmentss");
	        String FinancialObject = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitability_FinancialObject");
	        
	        NYlps.financialExperience(state, securitiess, Annuitiess, CashValues, AlternativeInvestmentss, FinancialObject);
		
	        
	        NYLifeproductsuitabilityContinues NYPSC=new NYLifeproductsuitabilityContinues();
	        String T20million = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_T20million");
	        String Proposedannualpremium = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_Proposedannualpremium");
	        String Faceamount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_FaceAmount");        
	        String ReplaceByPolicy = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_ReplaceByPolicy");
	        String AnnualPrem_Cost = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_AnnualPrem_Cost");
	        String Totalfaceamount = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_Totalfaceamount");        
	        String TotalannualIncome = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_TotalannualIncome");
	        String RiskTolerance = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_Risktoleranceaboutpremiums");
	        String RiskToleranceTwo = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilityContinus_Risktoleranceaboutdeathbenefit");
	        String UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_ProductsSuitabilityUnsheduledALIR");        
	        String amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_ProductsSuitabilityContinus_amountofUnSheduled");
	        String Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_ProductsSuitabilityContinus_Exchange1035_RD");
	        String exchange1035Amount = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_ProductsSuitabilityContinus_exchange1035Amount");
            String LTCRiskTolerance = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_ProductsSuitabilityContinus_LTCRiskTolerance");
	        
	        NYPSC.suitabilitycontinues(state, T20million, Proposedannualpremium, Faceamount,UnsheduledALIR,
	    			amountofUnSheduled,Exchange1035_RD,exchange1035Amount, ReplaceByPolicy, AnnualPrem_Cost, Totalfaceamount,
	                TotalannualIncome, RiskTolerance,RiskToleranceTwo,LTCRiskTolerance);
	        String Alt_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Alt_propsedAnnualPremium");
	        String Alt_faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Alt_faceamount");
	        String Alt_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Alt_ReplacedByPolicy");        
	        String Alt_TotalFaceAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Alt_TotalFaceAmount");
	        String Alt_TotalAnnualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Alt_TotalAnnualPremium");
	        String Alt_AnnuaLPremiumCost = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Alt_AnnuaLPremiumCost");        
	        String Alt_UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","Term", "NY_LPSC_Alt_UnsheduledALIR");        
	        String Alt_amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","Term", "NY_LPSC_Alt_amountofUnSheduled");
	        String Alt_Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","Term", "NY_LPSC_Alt_Exchange1035_RD");
	        String Alt_exchange1035Amount = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","Term", "NY_LPSC_Alt_exchange1035Amount");
	        
	        
	        String Add_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_propsedAnnualPremium");
	        String Add_faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_faceamount");
	        String Add_UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_LPSC_Add_UnsheduledALIR");        
	        String Add_amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_LPSC_Add_amountofUnSheduled");
	        String Add_Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_LPSC_Add_Exchange1035_RD");
	        String Add_exchange1035Amount = testdata.get(HooksTest.scenario.getName(),"WholeLife_TestData","SWL", "NY_LPSC_Add_exchange1035Amount");        
	        
	        String Add_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_ReplacedByPolicy");
	        String Add_Totalfaceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_TotalFaceAmount");
	        String Add_totalannualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_TotalAnnualPremium");
	        String Add_annuaLpremiumCost = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_AnnuaLPremiumCost");
	        //For NY and Alt and Additional Product
	        NYPSC.suitabiltycont_coverage_costinfo(Alt_propsedAnnualPremium, Alt_faceamount, Alt_UnsheduledALIR,
	    			 Alt_amountofUnSheduled, Alt_Exchange1035_RD, Alt_exchange1035Amount, Alt_ReplacedByPolicy, Alt_TotalFaceAmount, Alt_TotalAnnualPremium, Alt_AnnuaLPremiumCost,
	        		Add_propsedAnnualPremium, Add_faceamount, Add_UnsheduledALIR, Add_amountofUnSheduled, Add_Exchange1035_RD, Add_exchange1035Amount,Add_ReplacedByPolicy, Add_Totalfaceamount, Add_totalannualPremium, Add_annuaLpremiumCost);
	        
	        //For NY Risk tollerance for both alt and additional
	        String ALt_RiskTolerance = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_ALt_RiskTolerance");
	        String Alt_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Alt_RiskToleranceAboutDeath");
	        String Add_RiskTolerance = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_RiskTolerance");
	        String Add_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_LPSC_Add_RiskToleranceAboutDeath");
	        NYPSC.RiskTolerance_Alt_Add(state,ALt_RiskTolerance, Alt_RiskToleranceAboutDeath, Add_RiskTolerance, Add_RiskToleranceAboutDeath);
	        NGE.nonFuaranteeedelement(state);    
	        String txtareaone = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilitySummary_Textareaone");
	        String txtareaTwo = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilitySummary_TextareaTwo");
	        String txtareaThree = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "NY_ProductsSuitabilitySummary_TextareaThree");
	        String Alt_TextAreaone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_PSS_Alt_TextAreaone");
	        String Alt_Textareatwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_PSS_Alt_Textareatwo");
	        String Alt_TextAreathree = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_PSS_Alt_TextAreathree");
	        String Add_TextAreaone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_PSS_Add_TextAreaone");
	        String Add_Textareatwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_PSS_Add_Textareatwo");
	        String Add_Textareathree = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "NY_PSS_Add_Textareathree");
	        NGE.productsuitability(state,txtareaone, txtareaTwo, txtareaThree, Alt_TextAreaone,Alt_Textareatwo,Alt_TextAreathree,
	    			 Add_TextAreaone, Add_Textareatwo,Add_Textareathree);
	    
	}

	@When("^user fills SWL Additional Forms screen and Attachment Screen$")
	public void user_fills_SWL_Additional_Forms_screen_and_Attachment_Screen() throws Throwable {
	    
		String preferedLanguage = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "PI_PrefferedLang");
		String languages = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AdditionalForms_Foreign_Language_Language");
		String Others = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AdditionalForms_Foreign_Language_Language_Other");
		String Translator = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AdditionalForms_Foreign_Language_Language_Translator_is_a_or_an");
		String AgentFirstname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_GeneralAgent_FirstName");
		String Agent_Midlename = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_GeneralAgent_MI");
		String AgentLastname = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_GeneralAgent_LastName");
		String Agent_suffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_GeneralAgent_Sufix");
		String ProfessionalFirstName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AF_Professional_FirstName");
		String ProfessionalMidleName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_Professional_MI");
		String ProfessionalSuffix = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_Professional_Sufix");
		String ProfessionalLastName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AF_Professional_LastName");
		String ProfessionalTranslationFirm = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AF_Professional_TranslationFirm");
		String ProfessionalStreet_1 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AF_ProfessionalStreet_1");
		String ProfessionalStreet_2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL",
				"AF_ProfessionalStreet_2");
		String Professional_City = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_Professional_City");
		String Professional_State = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_Professional_State");
		String Professional_Zip = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "AF_Professional_Zip");
		Addforms.enterAdditionalFormsDetail(preferedLanguage, languages, Others, Translator, AgentFirstname,
				Agent_Midlename, AgentLastname, Agent_suffix, ProfessionalFirstName, ProfessionalMidleName,
				ProfessionalLastName, ProfessionalSuffix, ProfessionalTranslationFirm, ProfessionalStreet_1,
				ProfessionalStreet_2, Professional_City, Professional_State, Professional_Zip);
		
		
		
		String Policytype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Policytype");
        String PlantrustType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PlantrustType");
        String pleasespecify = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "pleasespecify");
        String Howlongplanbeen = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Howlongplanbeen");
        String Planname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Planname");
        String trustee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "trustee");
        String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifed_street1");
        String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifed_street2");
        String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifed_city");
        String qualifedstate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifedstate");
        String zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifiedzip");
        String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifed_MM");
        String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifed_DD");
        String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "qualifed_YYYY");
		
        String Qualified_PlanTrustSponsorEIN = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Qualified_PlanTrustSponsorEIN");
        String Qualified_TotalnoEmployee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Qualified_TotalnoEmployee");
        String Qualified_NoofEmployecoverdPlan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Qualified_NoofEmployecoverdPlan");
        String Qualified_ExplainBasisofEmployee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Qualified_ExplainBasisofEmployee");
		
        String PlanTrustSponsorEInumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Qualified_PlanTrustSponsorEInumber");
		QP.PolicyTrust_Plantrust(Policytype, PlantrustType,pleasespecify, Howlongplanbeen, Planname, trustee, street1, street2,
				city, qualifedstate, zip, MM, DD, YYYY,PlanTrustSponsorEInumber, Qualified_PlanTrustSponsorEIN, Qualified_TotalnoEmployee, Qualified_NoofEmployecoverdPlan, Qualified_ExplainBasisofEmployee);
		
		
		String fullnameEmploye = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "fullnameEmploye");
        String plansponsor_street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "plansponsor_street1");
        String plansponsor_street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "plansponsor_street2");
        String plansponsor_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "plansponsor_city");
        String plansponsor_state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "plansponsor_state");
        String plansponsor_zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "plansponsor_zip");
       
        String Employer_sponsor_EINNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Employer_sponsor_EINNumber");
        String PlanSponsore_Authorized_fullname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PlanSponsore_Authorized_fullname");
        String PlanSponsor_Authorized_lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PlanSponsor_Authorized_lastname");
      
		QP.EmployerPlanSponsor(fullnameEmploye, plansponsor_street1, plansponsor_street2, plansponsor_city, plansponsor_state, plansponsor_zip,Employer_sponsor_EINNumber,PlanSponsore_Authorized_fullname, PlanSponsor_Authorized_lastname);
		
		String ThirdParty_fullname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ThirdParty_fullname");
        String ThirdParty_street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ThirdParty_street1");
        String ThirdParty_street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ThirdParty_street2");
        String ThirdParty_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ThirdParty_city");
        String ThirdParty_state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ThirdParty_state");
        String ThirdParty_zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ThirdParty_zip");
        String Thirdparty_preferredphone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Thirdparty_preferredphone");
        String Thirdparty_phonetype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Thirdparty_phonetype");
        String Thirdparty_email = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Thirdparty_email");
		QP.ThirdPartyAdministrationinfo(ThirdParty_fullname, ThirdParty_street1, ThirdParty_street2, ThirdParty_city, ThirdParty_state, ThirdParty_zip, Thirdparty_preferredphone,
				Thirdparty_phonetype, Thirdparty_email);
		
		String Whatlimitofamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PurposeOFLifeINS");
        String ApproxValueAssets = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ApproximateValue");
        String annualpremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "AnnualPremium");
        String EmployerContribution = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "EmployerContribution");
        String FundingMethod = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "DefinedBenefitPlans");
        String LimitOFDeathBenefit = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "LimitsOFDeathBenefit");
        String Totalamountaggreemnt = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "TotalAmountAgrrement");
        String yearone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "YearONe");
        String yeartwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "YearTwo");
        String SelectAllType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "SelectAllType");
        String ParticipantLive = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "ParticipantLive");
        String Pleasexpalin = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Participant_PleaseExpalain");
        String FundedpleaseSpecify = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "FundedpleaseSpecify");
       
        String Self_DDC_IsReducedPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Self_DDC_IsReducedPremium");
        String Self_DDC_approxvalue = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Self_DDC_approxvalue");
		QP.Self_DDCPlanInfo(Whatlimitofamount, ApproxValueAssets, annualpremium, EmployerContribution, FundingMethod, LimitOFDeathBenefit, Totalamountaggreemnt, yearone, yeartwo,
				SelectAllType, ParticipantLive, Pleasexpalin, FundedpleaseSpecify,Self_DDC_IsReducedPremium,Self_DDC_approxvalue);
		
		
		String state = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_ProductType");
		attach.attachDocuments(state,ProductType);
		/*String state = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "CI_State");
		attach.attachDocuments(state);*/
	}

	@Then("^Lock the  SWL policy and submit the policy with Esign or Wet Sign$")
	public void lock_the_SWL_policy_and_submit_the_policy_with_Esign_or_Wet_Sign() throws Throwable {
	    
		/*int policyrow = row + 2;
		lock.addInfo_Next(policyrow);

		String SignType = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "SignatureMethod");
		String InsIDproof = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Esign_InsuredIdType");
		String InsIdNum = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Esign_InsuredIdNumber");
		String InsMM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins_MM");
		
		String IdproofIns2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "IdproofIns2");
		String IdNumberIns2 = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Esign_IdNumberIns2");
		String insd2signedcity = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "insd2signedcity");
		String insd2signedState = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "insd2signedState");
		
		String InsDD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins_DD");
		String InsYYYY = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Ins_YYYY");
		String ProdMM = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Prod_MM");
		String ProdDD = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Prod_DD");
		String ProdYYYY = testdata.get(HooksTest.scenario.getName(), TestDataFileName,"SWL", "Prod_YYYY");
		lock.signature(SignType, InsIDproof, InsIdNum, IdproofIns2, IdNumberIns2, insd2signedcity, insd2signedState, InsMM, InsDD, InsYYYY, ProdMM, ProdDD, ProdYYYY);*/
		//lock.signature(SignType, InsIDproof, InsIdNum, InsMM, InsDD, InsYYYY, ProdMM, ProdDD, ProdYYYY);
		
		String ProductType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "CI_ProductType");
		ExcelUtility rowcount=new ExcelUtility();
		int RowCount=rowcount.getRowCount("Ez-AppUnderWriters", "Hub");
		System.out.println("the rowcount is " + RowCount);
		int policyrow = row + 2;
		lock.LockScreen(policyrow,ProductType);

		String SignType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "SignatureMethod");
		String InsIDproof = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Esign_InsuredIdType");
		String InsIdNum = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "Esign_InsuredIdNumber");

		String OwnerInsIDproof = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "OwnerInsIDproof");
		String OwnerInsIdNum = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "OwnerInsIdNum");
		String proposedInsuredCity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "proposedInsuredCity");
		String proposedinsuredstate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "proposedinsuredstate");
		
		String WetsignType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "WetsignType");
		String InsMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "InsMM");
		String InsDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "InsDD");
		String InsYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "InsYYYY");

		String PrdMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PrdMM");
		String PrdDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PrdDD");
		String PrdYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PrdYYYY");
		String OwnerMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "OwnerMM");
		

		String OwnerDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "OwnerDD");
		String OwnerYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "OwnerYYYY");
	
		String PlanSponsorMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PlanSponsorMM	");
		String PlanSponsorDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PlanSponsorDD");
		String PlanSponsorYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,"SWL", "PlanSponsorYYYY");
		
		
		lock.signature(SignType, InsIDproof, InsIdNum,policyrow,ProductType, OwnerInsIDproof, OwnerInsIdNum,WetsignType, InsMM, InsDD,InsYYYY,
				PrdMM,PrdDD, PrdYYYY,OwnerMM, OwnerDD, OwnerYYYY, proposedInsuredCity, proposedinsuredstate,PlanSponsorMM,PlanSponsorDD,PlanSponsorYYYY);
		
	}	

}
