package stepdefinitions;

import commonutils.GlobalCap;
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
import pageclass.LifeCaseSetup;
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
import pageclass.ProductTerm;
import pageclass.ProposedInsured;
import pageclass.ProposedInsuredCont;
import pageclass.QualifiedPlan;
import pageclass.TrustCertification;
import pageclass.Workbench_LaunchEzApp;
import pageclass.productwholelife;
import utilities.GetDataFromExcel;

public class TermLife {
	
	Workbench_LaunchEzApp workbenchLaunchEzApp = new Workbench_LaunchEzApp();
	CaseInfo caseinfo = new CaseInfo();
	LifeCaseSetup lifecasesetup = new LifeCaseSetup();
	ProposedInsured Proposedinsure = new ProposedInsured();
	ProposedInsuredCont PI_cont = new ProposedInsuredCont();
	PersonalHistory personalhistory = new PersonalHistory();
	GetDataFromExcel testdata = new GetDataFromExcel();
	PersonalHistoryContOne PHCOne = new PersonalHistoryContOne();
	PersonalHistoryContTwo PHCTwo = new PersonalHistoryContTwo();
	HIVConsent Consent_HIV = new HIVConsent();
	LifepurposeofInsurance LPOI = new LifepurposeofInsurance();
	LifeBeneficiaries LifeBene = new LifeBeneficiaries();
	LifeOtherCoverage LOC = new LifeOtherCoverage();
	LifeProducerStatement producerStatement = new LifeProducerStatement();
	LifeProducerCompensation producerCompensation = new LifeProducerCompensation();
	LifePaymentInfo lpinfo = new LifePaymentInfo();
	Certification certify = new Certification();
	LockAndUnlock lock = new LockAndUnlock();
	AdditionalForms Addforms = new AdditionalForms();
	Attachments attach = new Attachments();
	productwholelife pwl = new productwholelife();
	ProductTerm productTerm = new ProductTerm();
	ALt_Add_Both_Products products_alt_add= new ALt_Add_Both_Products();
	LifeOwner LO=new LifeOwner();
	TrustCertification Trust=new TrustCertification();
	EntityOwner EO=new EntityOwner();
	//Newyork
	NewYorkRegSixty NyR=new NewYorkRegSixty();
	NewYork_LifeProductsSuitability NYlps= new NewYork_LifeProductsSuitability();
	NY__NonGuaranteedElement NGE=new NY__NonGuaranteedElement();
	QualifiedPlan QP=new QualifiedPlan();
	
	
	int row;
	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();
	
	String inputfile = TestPropertyFileRead.getThePropertyValue("ExcelFileName");
	String inputsheet = TestPropertyFileRead.getThePropertyValue("Term_sheetname");
	
	@Given("^Launch Fieldnet Dev application to enter user ID and Password click on Next (\\d+)$")
	public void launch_Fieldnet_Dev_application_to_enter_user_ID_and_Password_click_on_Next(int arg1) throws Throwable {
		row = arg1;
		workbenchLaunchEzApp.enterUserIDClickNext();
		workbenchLaunchEzApp.enterPasswordClickVerify();
		
		
	 
	}

	@Given("^click SubmitNewBusiness Menu and Enter producer id and click on search$")
	public void click_SubmitNewBusiness_Menu_and_Enter_producer_id_and_click_on_search() throws Throwable {
		String producerID = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "ProducerID");
		workbenchLaunchEzApp.clickOnFieldnetDev();
		workbenchLaunchEzApp.enterProducerNumberClickSearch(producerID);
		String Environment = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Environment");
		workbenchLaunchEzApp.clickonSubmitNewBusinessWB(Environment);
	}

	@When("^EzApp is launched and user enters Term Insured details state and UL product$")
	public void ezapp_is_launched_and_user_enters_Term_Insured_details_state_and_UL_product() throws Throwable {
		String FirstName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_Firstname");
		String LastName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_LastName");
		String DOBMonth = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_MM");
		String DOBDay = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_DD");
		String DOBYear = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_YYYY");
		String Gender = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_Gender");
		String CaseDescription = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_CaseDescription");
		String State = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_ProductType");
		String Product = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_Product");
		caseinfo.enterCaseInfoDetails(FirstName, LastName, DOBMonth, DOBDay, DOBYear, Gender, CaseDescription);
		caseinfo.CarrierAndProduct(State, ProductType);
		caseinfo.selectProduct(Product);
	 
	}

	@When("^User Fills Term LifeCase setup screen and NewYorkRegsixty when state is NY and click on Next$")
	public void user_Fills_Term_LifeCase_setup_screen_and_NewYorkRegsixty_when_state_is_NY_and_click_on_Next() throws Throwable {
		String InsuredResidentState = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_InsuredResidentState");
		String insuredCitizenship = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_InsuredCitizenship");
		String FaceAmount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_FaceAmount");
		String groupbill = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_GroupBill");
		String PlatniumPassprgm = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_PlatniumPassprgm?");
		String LifeconvInsurabilityOpt = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_insurabilityoptionexercise?");
		String PolicyUnderwriting = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_policyrequireunderwriting?");
		String registeredbrokerwithMMLIS = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_ MMLISRegistered Rep?");
		String QualifiedPlan = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_qualifiedplan?");
		String WithdrawalFromRetirementAccount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_FinancialServicesRepresentative?");
		String PenalityTaxAmountWithdrawn = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_Account10%PurchaseThisPolicy?");
		String HardshipWidrawal = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_hardshipwithdrawal?");
		String Retirement_paythepremiums = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_retirement_account_pay_the_premiums?");
		String SurrenderChargeAmount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_surrenderchargeamount?");
		String PrimaryPurposeLifeInsurance = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_Whatistheprimarypurpose");
		String DIonSameApplication = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_DIPolicyonthesameapplication?");
		String OwnerAllpolicies = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_owneronallpolicies?");
		String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_Indiviual or EntityOWner");
		String OwnerState = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_OwnerState");
		String EntityTrust = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_EntityisaTrust");
		String existingDIpolicy = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LCS_ existingDIpolicy?");
		String HoldIssue = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_HoldIssue");
		String Backdatesaveage = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_Backdatetosaveage?");
		String Policydate = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_PolicyDating");
		String MM = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_SpecificDate_MM");
		String DD = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_SpecificDate_DD");
		String YYYY = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_pecificDate_YYYY");
		String Agency = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_SubmitAgency");
		String Stateowner = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_OwnerState");
		String CountryOwner = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_Country");
		String Cityowner = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_OwnerCity");
		String Quickclose = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LCS_QuickClose");
		String Agentfirm = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "listFirm");
		String FirmsListdisplay = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "FirmsListdisplay");
		String SalesPerson_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "SalesPerson_YesNo");
		String SalesFirstname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "SalesFirstname");
		String salesLastName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "SalesLastName");
		String ApexMMLIS = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LCS_ApexMMLIS");
		String ApexResultOfRightBridge = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LCS_ApexResultOfRightBridge");
		String ApexOwner_MM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Owner_MM");
		String ApexOwner_DD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Owner_DD");
		String ApexOwner_YYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Owner_YYY");
		String LCS_IsPolicyJointlyOwned = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LCS_IsPolicyJointlyOwned");
		lifecasesetup.enterLifeCaseSetup(InsuredResidentState, insuredCitizenship, FaceAmount, groupbill,
				PlatniumPassprgm, LifeconvInsurabilityOpt, PolicyUnderwriting,registeredbrokerwithMMLIS,ApexMMLIS,ApexResultOfRightBridge, QualifiedPlan, WithdrawalFromRetirementAccount,
				PenalityTaxAmountWithdrawn, HardshipWidrawal, Retirement_paythepremiums, PrimaryPurposeLifeInsurance,
				SurrenderChargeAmount);
		lifecasesetup.RadioQuestionTwo(DIonSameApplication, existingDIpolicy, OwnerAllpolicies, Indiviual_Entity,LCS_IsPolicyJointlyOwned, OwnerState,ApexOwner_MM,ApexOwner_DD,ApexOwner_YYYY, EntityTrust, HoldIssue, Backdatesaveage, Policydate, MM, DD, YYYY,
				Agency,Agentfirm,FirmsListdisplay, Stateowner, CountryOwner, Cityowner, Quickclose,SalesPerson_RD,SalesFirstname,salesLastName);
		
		String individualsigningYes_No = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "individualsigningYes_No");
		String firstname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PisigningOff_firstname");
		String Lastname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PisigningOff_Lastname");
		String suffix = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PisigningOff_suffix");
		String relationshiptoInsured = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "relationshiptoInsured");
		lifecasesetup.individualsigning1(individualsigningYes_No, firstname, Lastname, suffix, relationshiptoInsured);
		
		
		String State = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");
		String Lapsed = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NyReg_LAPSED_SURRENDERED");
		String CashValues = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NyReg_OTHER_CASH_VALUES");
		String tobeInforce = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NyReg_CONTINUE_TO_BE_IN_FORCE");
		String Reissued = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NyReg_REISSUED_WITH_REDUCTION");
		String Collateral = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NyReg_ASSIGNED_AS_COLLATERAL");
		String Premium = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NyReg_PREMIUM PAID");
		String externalReplacement = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NyReg_EXTERNAL_REPLACEMENT");
		NyR.NeyworkReg(State,Lapsed, CashValues, tobeInforce, Reissued, Collateral, Premium, externalReplacement);
	 
	}

	@When("^User Fills Term Primary Insured and Primary Insured Cont screen details and click on Next$")
	public void user_Fills_Term_Primary_Insured_and_Primary_Insured_Cont_screen_details_and_click_on_Next() throws Throwable {
		String Suffix = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Suffix");
		String Birth_state = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_BirthState");
		String ssn = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_SSN");
		Proposedinsure.personal_Information(Suffix, Birth_state, ssn);

		String RESADDStreet1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_AddressStreet1");
		String RESADDStreet2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_AddressStreet2");
		String RESADDCity = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_City");
		String RESADDZIP = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Zip");
		String MailingADD = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_MailAdd");
		String MailingStreet1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_ALT_ AddressStreet1");
		String MailingStreet2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_ALT_AddressStreet2");
		String MailingCity = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_ALT_City");
		String MailingState = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_ALT_State");
		String MailingZIPPostalCode = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_ALT_Zip");
		Proposedinsure.Address(RESADDStreet1, RESADDStreet2, RESADDCity, RESADDZIP, MailingADD, MailingStreet1,
				MailingStreet2, MailingCity, MailingState, MailingZIPPostalCode);

		String PreferredPhoneNumber = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Phone");
		String HomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_HomeWork");
		String WorkExtension = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Extension");
		String AlternatePhoneNumber = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Alt_Phone");
		String AlterHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Alt_HomeWork");
		String AlternateExtesnion = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Alt_Extension");
		String AmPM = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_BestTime");
		String Besttimetocall = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_BesttimetoCall");
		String ReciveText_BD = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Message");
		String NeedspecialAccomidation = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Accomodation");
		String preferredlanguage = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_PrefferedLang");
		String EmailAddress = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_Email");

		Proposedinsure.Additionalinfo(PreferredPhoneNumber, HomeWorkMobile, WorkExtension, AlternatePhoneNumber,
				AlterHomeWorkMobile, AlternateExtesnion, AmPM, ReciveText_BD, Besttimetocall, NeedspecialAccomidation,
				preferredlanguage, EmailAddress);
		String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PIC_U.S.DriversLicense");
		String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PIC_IdentificationNumber");
		String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PIC_ReaspnWhy");
		String PICType_of_identification = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PIC_TypeOfIdentification");
		String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PIC_StateProvinceofIssue");
		String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PIC_Other");
		String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PIC_TypeofCitizenship");
		String Expr_MM = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LOC_Exp_MM");
		String Expr_DD = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LOC_Exp_DD");
		String Expr_YYYY = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LOC_Exp_YYYY");
		PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
				PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);

	 
	}

	@When("^User Fills Term Personal History Information screen details and click on Next$")
	public void user_Fills_Term_Personal_History_Information_screen_details_and_click_on_Next() throws Throwable {
		String InsuredDisability = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PH_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits");
		String InsuredDisabilityDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits_Details");
		String Tobaccoin12M = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months");
		String Tobaccoin12MDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months_Details");
		String Tobaccoin24M = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Withinthelast24months");
		String Tobaccoin24MDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Withinthelast24months_Details");
		String Cigarin24M = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_UsedCigarswithinthelast24months");
		String Cigarin24count = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_UsedCigarswithinthelast24months_Numberofcigarsperyear");
		String PrescriptionMedicationin12M = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Usedprescriptionmedicationtoassistwithsmokingcessation");
		String PrescriptionMedicationin12MDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Usedprescriptionmedicationtoassistwithsmokingcessation_Details");
		String ConvictedProbation = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation");
		String ConvictedProbationDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation_Details");
		String ConvictedwithAlcoholin2Y = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol");
		String ConvictedwithAlcoholin2YDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol_Details");
		String Accidentin3Y = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Beeninamotorvehicleaccidentinwhichtheywerefoundtobeatfault");
		String Faultmotorvehicleaccident = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Atfaultmotorvehicleaccident?");
		String FaultmotorvehicleaccidentHowMany = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Atfaultmotorvehicleaccident?_Howmany");
		String FaultmotorvehicleaccidentWhen1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Atfaultmotorvehicleaccident?_When1");
		String FaultmotorvehicleaccidentWhen2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Atfaultmotorvehicleaccident?_When2");
		String FaultmotorvehicleaccidentWhen3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Atfaultmotorvehicleaccident?_When3");
		String Speedingticket = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Speedingticket?");
		String Lessthan15milesspeedlimit = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Lessthan15milesoverthespeedlimit?");
		String Lessthan15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Lessthan15milesoverthespeedlimit?_Howmany");
		String Lessthan15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Lessthan15milesoverthespeedlimit?_When1");
		String Lessthan15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Lessthan15milesoverthespeedlimit?_When2");
		String Lessthan15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Lessthan15milesoverthespeedlimit?_When3");
		String Greaterthanorequal15milesspeedlimit = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?");
		String Greaterthanorequal15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_Howmany");
		String Greaterthanorequal15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When1");
		String Greaterthanorequal15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When2");
		String Greaterthanorequal15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When3");
		String Suspendedlicense = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Suspendedlicense?");
		String Suspenedlicenseduetononpayment = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Suspenedlicenseduetononpaymentofchildsupport?");
		String Whenwasthelicensesuspended = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Whenwasthelicensesuspended?");
		String Reasonforsuspension = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Reasonforsuspension?");
		String Hasitbeenreinstated = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Hasitbeenreinstated?");
		String Whenreinstated = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Whenreinstated?");
		String Recklessdriving = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Recklessdriving?");
		String Recklessdrivinghowmany = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Recklessdriving?_Howmany?");
		String RecklessdrivingWhen1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Recklessdriving?_When1");
		String RecklessdrivingWhen2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Recklessdriving?_When2");
		String RecklessdrivingWhen3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Recklessdriving?_When3");
		String CarelessDriving = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Carelessdriving?");
		String CarelessDrivinghowmany = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Carelessdriving?_Howmany?");
		String CarelessDrivingWhen1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Carelessdriving?_When1");
		String CarelessDrivingWhen2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Carelessdriving?_When2");
		String CarelessDrivingWhen3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Carelessdriving?_When3");
		String Movingviolation = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Movingviolation?");
		String MovingviolationHowmany = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Movingviolation?_Howmany?");
		String MovingviolationWhen1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Movingviolation?_When1");
		String MovingviolationWhen2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Movingviolation?_When2");
		String MovingviolationWhen3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PersonalHistory_Movingviolation?_When3"); 
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
		
		String State = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");
		String AntcptForgnTravelQuestn = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC1_Anticipateanyforeigntravelinthenext2years");
		String HaveAgmtToBcmArmedforcesQuestn = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC1_Haveawrittenagreementtobecome,oriscurrentlyamember,oftheArmedForces");
		String ExpectedMemberofPilotQuestn = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC1_Expecttobecomewithinthenext2years,orbeeninthelast3years,apilot,astudentpilotorcrewmemberofanyaircraft");
		String TakePartinUnderwaterdivingHangglidParaSailing = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC1_Takepartinunderwaterdiving,hanggliding,parasailing");
		String ultralight_soaring_ballooning = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC1_ultralight_soaring_ballooning");
		String motorboat_snowmobile = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC1_motorboat_snowmobile");
		String PhysicianType = testdata.get(HooksTest.scenario.getName(), inputfile, inputsheet,"PhysicianType");
		String Firstname = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"FirstName");
		String MiddleName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "MidleName");
		String LastName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LastName");
		String Suffix = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"Suffix");
		String street1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"Street1");
		String street2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"Street2");
		String City = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"City");
		String state = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"State");
		String Zip = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "pinCode");
		String Telephone = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Telephonenumber");
		String MM = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Month");
		String DD = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"date");
		String YYYY = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"Year");
		String TimeFrameLastSeen = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"TimeFrameLastScene");
		String Details = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Details");
		String FacilityName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Office/Facility Name");
		PHCOne.enterPersonalHistoryInformationContOneDetails(State,AntcptForgnTravelQuestn, HaveAgmtToBcmArmedforcesQuestn,
				ExpectedMemberofPilotQuestn, TakePartinUnderwaterdivingHangglidParaSailing,ultralight_soaring_ballooning,
				motorboat_snowmobile,PhysicianType, Firstname, MiddleName, LastName, Suffix, street1, street2, City,
				 state, Zip, Telephone, MM, DD, YYYY, TimeFrameLastSeen, Details, FacilityName);
		
		String ProposedInsuredIS_questn = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_Theproposedinsuredis");
		String EmpCurrentOcc = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-CurrentOccupation");
		String EmpDuties = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PHC2_EMP-Duties");
		String EmployerName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-Employer/BusinessName(Ifself-employed,providebusinessname)");
		String EmployerCountry = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-Country");
		String EmployerStree1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-Street1");
		String EmployerStree2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-Street2");
		String EmployerStree3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-Street3");
		String EmployerCity = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PHC2_EMP-City");
		String EmployerState = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PHC2_EMP-State");
		String EmployerZip = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PHC2_EMP-Zip");
		String EarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-EarnedIncome-CurrentYear");
		String EarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-EarnedIncome-PriorYear");
		String UNEarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-UnEarnedIncome-CurrentYear");
		String UNEarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_EMP-UnEarnedIncome-PriorYear");
		String EmpNetworth = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PHC2_EMP-NetWorth");
		String UnEmpReason = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_UNEMP-UnemployedReason");
		String AnnHouseEarnedIncm = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_UNEMP-AnnualHouseholdEarnedIncome");
		String HouseholdNetworth = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_UNEMP-HouseholdNetWorth");
		String AnnHouse_UNEarnedIncm = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_UNEMP-AnnualHouseholdUnearnedIncome");
		String OthercovWorkingspous = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PHC2_OtherCoverageOnWorkingSpouse");
		PHCTwo.enterPersonalHistContTwo_screenDetails(ProposedInsuredIS_questn, EmpCurrentOcc, EmpDuties, EmployerName,
				EmployerCountry, EmployerStree1, EmployerStree2, EmployerStree3, EmployerCity, EmployerState,
				EmployerZip, EarnedIncmCurrentYear, EarnedIncmPriorYear, UNEarnedIncmCurrentYear, UNEarnedIncmPriorYear,
				EmpNetworth, UnEmpReason, AnnHouseEarnedIncm, HouseholdNetworth, AnnHouse_UNEarnedIncm,
				OthercovWorkingspous);

	}

	@When("^User Fills Term Life Product Screen details and click on Next$")
	public void user_Fills_Term_Life_Product_Screen_details_and_click_on_Next() throws Throwable {
		String WaiverofPremium = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "PT_WaiverofPremium");
		String AlternateAdditionalPolicy = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_alternate_additional policy");
		String Plan_Product_Alt = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Plan_Product_alternate");
		String Plan_Product_Add = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Plan_Product_additional");
		productTerm.enterproductTerm(WaiverofPremium);
		productTerm.Altoradd( AlternateAdditionalPolicy, Plan_Product_Alt, Plan_Product_Add);
		
		//Alternate and Additional Products
		String Alt_Faceamount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Alt_FaceAmount");
		String ALT_WavierOfPremiumRider = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PT_Alt_WavierOfPemiumrider");
		String ALT_AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PT_Alt_AutomaticPremiumLoan_UL");
		String ALT_LoanRate = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Alt_LoanRate_UL");
		String ALT_DividentOption_WL = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Alt_DividentOption_UL");
		String Alt_WLPremiumRider = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"WLP_ALT_WaiverOfPremiumRider");
		String ALT_PlannedAmount_UL = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Alt_PlannedAmount_UL");
		String ALT_unsheduledPremium_UL = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Alt_unsheduledpremium_UL");
		String ADD_Faceamount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Add_FaceAmount");
		String ADD_WavierOfPremiumRider = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PT_Add_WavierOfPemiumrider");
		String ADD_AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PT_Add_AutomaticPremiumLoan_UL");
		String ADD_LoanRate = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Add_LoanRate_UL");
		String ADD_DividentOption_WL = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Add_DividentOption_UL");
		String ADD_WLPremiumRider = testdata.get(HooksTest.scenario.getName(), inputfile,"Whole_Life","WLP_ADD_WaiverOfPremiumRider");
		String ADD_PlannedAmount_UL = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Ad_PlannedAmount_UL");
		String ADD_unsheduledPremium_UL = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Add_unsheduledpremium_UL");
		String Alt_UL_intialpremium = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Alt_UL_intialpremium");
		String Add_UL_intialpremium = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"PT_Add_UL_intialpremium");
		
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
	 
	}

	@When("^User Fills Term Life Purpose of Insurance Screen details and click on Next$")
	public void user_Fills_Term_Life_Purpose_of_Insurance_Screen_details_and_click_on_Next() throws Throwable {
		String LPOI_Personal = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Personal");
		String LPOI_sponserdplan = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Isthispolicybeingpurchasedinconnectionwithanemployer_sponsoredplan?");
		String LPOI_policybecollaterallyassigned = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Willthispolicybecollaterallyassigned?");
		String LPOI_Insurance_Type = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Type");
		String LPOI_nameofAssigne = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_CompleteNameofAssignee:");
		String LPOI_Assignee_Street1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_Street1");
		String LPOI_Assignee_Street2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_Street2");
		String LPOI_Assignee_City = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_City");
		String LPOI_Assignee_State = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_State");
		String LPOI_Assignee_Zip = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_Zip");
		String LPOI_Assignee_phone = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_phone");
		String LPOI_Assignee_Homeworkcell = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_Homeworkmobile");
		String LPOI_Assignee_Extension = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Assignee_Extension");
		String LPOI_EconomicIncntvFreeQuestn = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_HastheProposedInsured(s)and_ortheProposedPolicyOwner(s)beenofferedanyeconomicincentivesuchas'free'");
		String LPOI_EconomicIncntvFreeQuestn_details = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Details:");
		String LPOI_Does_the_Proposed_Insured = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_DoestheProposedInsured(s)and/ortheProposedPolicyOwner(s)haveacurrentagreementorcommitmenttosell");
		String LPOI_Does_the_Proposed_Insured_details = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_commitmenttosell_Details:");
		String LPOI_Is_the_policy_directly_or_indirectly = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Isthepolicydirectlyorindirectlyownedbyacaptiveinsurancecompany");
		String LPOI_Is_the_policy_directly_or_indirectly_details = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LPOI_captiveinsurancecompany_Details:");
		String LPOI_Will_the_source_of_any_premium_payments = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPOI_Willthesourceofanypremiumpaymentsbeassetsoforfromcontributionstoacaptiveinsurancecompany?");
		String LPOI_Will_the_source_of_any_premium_payments_details = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LPOI_Willthesourceofanypremium_Details:");
		LPOI.personal_and_Bussiness(LPOI_Personal);
		LPOI.Will_this_policy_be_collaterally_assigned(LPOI_policybecollaterallyassigned, LPOI_Insurance_Type,
				LPOI_nameofAssigne, LPOI_Assignee_Street1, LPOI_Assignee_Street2, LPOI_Assignee_City,
				LPOI_Assignee_State, LPOI_Assignee_Zip, LPOI_Assignee_phone, LPOI_Assignee_Homeworkcell,
				LPOI_Assignee_Extension);
		LPOI.enterLPIdetails(LPOI_sponserdplan, LPOI_EconomicIncntvFreeQuestn, LPOI_EconomicIncntvFreeQuestn_details,
				LPOI_Does_the_Proposed_Insured, LPOI_Does_the_Proposed_Insured_details,
				LPOI_Is_the_policy_directly_or_indirectly, LPOI_Is_the_policy_directly_or_indirectly_details,
				LPOI_Will_the_source_of_any_premium_payments, LPOI_Will_the_source_of_any_premium_payments_details);
	    
	 
	}

	@When("^User Fills Term Life Owner and Life Owner cont screen details and click on Next$")
	public void user_Fills_Term_Life_Owner_and_Life_Owner_cont_screen_details_and_click_on_Next() throws Throwable {
		String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"LCS_Indiviual or EntityOWner");
		String InsuredonlyOwnerquestn = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"LCS_owneronallpolicies?");
		if(Indiviual_Entity.equalsIgnoreCase("Indiviualowner") && InsuredonlyOwnerquestn.equalsIgnoreCase("No") ){
			String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_IndividualOwnerType");
			String firstname = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_street2");
			String city = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_state");
			String Zip = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_extension");
			String email = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_email");
			String relationship = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_SSN");
			//LifeOwner Continuous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LOC_Exp_YYYY");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//lifeownerContinuous
			PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
	//	String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"LCS_Indiviual or EntityOWner");
		String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_IndividualOwnerType");
		//String InsuredonlyOwnerquestn = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"LCS_owneronallpolicies?");
		if (indiviualOwnertype.equalsIgnoreCase("One individual owner during his/her lifetime and thereafter a contingent owner and thereafter the Insured")&& InsuredonlyOwnerquestn.equalsIgnoreCase("No") && Indiviual_Entity.equalsIgnoreCase("Indiviualowner")) {
			String firstname = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_street2");
			String city = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_state");
			String Zip = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_extension");
			String email = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_email");
			String relationship = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet, "LO_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(),inputfile, inputsheet,"LO_SSN");
			//jointcontigentowner continous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LOC_Exp_YYYY");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//jointcontigentowner continous
			PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
	 
	}

	@When("^User fills Entity Owner and Trust Cert details Screen and click on Next$")
	public void user_fills_Entity_Owner_and_Trust_Cert_details_Screen_and_click_on_Next() throws Throwable {

		String Entitytype = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_TypeofEntityOwnership");
		String SpecificEntityType = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_SpecifyType");
		String EntityName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NameOfEntity_or Trust");
		String ProposedInsuredDirector = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_ProposedInsuredaDirector");
		String EntityMaxfaceamount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_MaxFaceAmount");
		String MM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "DateOfTrust_MM");
		String DD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"DateOfTrust_DD");
		String YYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "DateOfTrust_YYYY");
		String TypeofTrust = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "TypeOfTrust(Yes_revoc/No_Irrevoc");
		String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Enity_SameasAddress");
		String street1 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_Stree1");
		String street2 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Entity_Street2");
		String city = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_City");
		String state = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_State");
		String Zip = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Entity_Zip");
		String Mailingadd = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_MailAdd");
		String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Entity_MailingStreet1");
		String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Entity_MailingStreet2");
		String Mail_city = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_MailingCity");
		String Mail_State = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_MailState");
		String Mail_Zip = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Entity_MailZip");
		String SSN_EIN = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Entity_SSn_OR_EIN");
		String SSN_EINnumber = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Entity_SSN_EINNumber");
		String TypeOfCitizenship = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Entity_TypeOfCitizenship_UsEntity(Yes)_Foreign(No)");
		//TrustCertificaiton
		String TrusteeType = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Trustee_Type");
		String FirstName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Trustee_Indiviual/Entity_firstName");
		String MiddleName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Trustee_Indiviual/Entity_MiddleName");
		String LastName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Trustee_Indiviual/Entity_LastName");
		String Suffix = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Trustee_Indiviual/Entity_Suffix");
		String email = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Trustee_Indiviual/Entity_Email");
		String trustEntityName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Trustee_EntityName");
		String title = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Trustee_entityTitle");
		
		String Grantortype = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_Type");
		String GrantorFirstname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_Indiviual/Entity_firstName");
		String GrantorMiddlename = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_Indiviual/Entity_MiddleName");
		String GrantorLastname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_Indiviual/Entity_LastName");
		String Grantorsuffix = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_Indiviual/Entity_Suffix");
		String Grantorcountry = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_Indiviual/Entity_CountyCitizen");
		String mm = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_DOB_MM");
		String dd = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_DOB_DD");
		String yyyy = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_DOB_YYYY");
		String ssn = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_INDIV_SSN_ITN");
		String AddressSamePI = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_AddressSameAsPI");
		String streetone = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_IndivEntity_Stree1");
		String streettwo = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_IndivEntity_Stree2");
		String City = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_IndivEntity_City");
		String Grantorstate = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_IndivEntity_State");
		String zipcode = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_IndivEntity_Zipcode");
		String GrantorEntityName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Grantor_EntityName");
		String TaxPayerno = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Grantor_TaxpayerId");
		
		String RelationShipBene = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Relationto Bene");
		String RelationshipOtherDtls = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "RelationshipOtherDtls");
		String AuthorizeTrusteee = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"AuthorizeTrusteee");
		String viaticalCompany = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "viaticalCompany");
		String RelationGrantor = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "RelationGrantor");
		String SigningTrustee = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"SigningTrustee");
		
		// Apex
		String Signertitle = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"Entity_SignerTitle");
		String SolefiicerYesNo = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Entity_SoleOfficer_Yes_No");
		String SoleFirstName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Entity_Sole_FirstName");
		String SoleLastName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"Entity_soleLastName");
		String VULBussinesphoneno = testdata.get(HooksTest.scenario.getName(), inputfile, inputsheet, "RelationGrantor");
		String VULphonetype = testdata.get(HooksTest.scenario.getName(), inputfile, inputsheet, "SigningTrustee");

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

	@When("^User Fills Term Life Beneficiaries and Other Coverage screen details and click on Next$")
	public void user_Fills_Term_Life_Beneficiaries_and_Other_Coverage_screen_details_and_click_on_Next() throws Throwable {
		String LB_Distributiontype = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_BusinessSupplement_DistributionType");
		String LB_beneaddition_yesorNo = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_Beneficiary_ClickHeretoAdd");
		String LB_Beneficiary_Type = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_Beneficiary_Type");
		String LB_firstname = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_FirstName");
		String LB_Middlename = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_M.I.");
		String LB_Lastname = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_LastName");
		String LB_suffix = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_Suffix");
		String LB_MAilingadd_yesorNo = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_MailingAddresssameasPrimaryInsured?");
		String LB_HomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_HomeWorkMobile");
		String LB_phonenumber = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_PhoneNumber");
		String LB_Extension = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_Extension");
		String LB_Month = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_DOB_MM");
		String LB_Date = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_DOB_DD");
		String LB_Year = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_DOB_YYYY");
		String LB_TinType = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_TINType");
		String LB_SSNno = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LB_NI_TaxIDNo");
		String LB_RelationShip = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_RelationshiptoInsured");
		String LB_Distribution = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_Distribution");
		String LB_IssueStripes = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_NI_Issueperstirpes");
		String LB_WouldyouliketonameaCustodian = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_WouldyouliketonameaCustodian");
		String LB_Custodian_First = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_Custodian_First");
		String LB_Custodian_MI = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_Custodian_MI");
		String LB_Custodian_Last = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_Custodian_Last");
		String LB_Custodian_Suffix = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_Custodian_Suffix");
		String LB_Custodian_State = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LB_Custodian_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_ProductType");
		LifeBene.distribution_Type(LB_Distributiontype);
		LifeBene.beneficiary_addition(ProductType,LB_beneaddition_yesorNo, LB_Beneficiary_Type, LB_firstname, LB_Middlename,
				LB_Lastname, LB_suffix, LB_MAilingadd_yesorNo, LB_HomeWorkMobile, LB_phonenumber, LB_Extension,
				LB_Month, LB_Date, LB_Year, LB_TinType, LB_SSNno, LB_RelationShip, LB_Distribution, LB_IssueStripes);
		LifeBene.custodian(LB_WouldyouliketonameaCustodian, LB_Custodian_First, LB_Custodian_MI, LB_Custodian_Last,
				LB_Custodian_Suffix, LB_Custodian_State);
		String State = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");
		String LOC_field1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LifeOtherCoverage_textfield1");
		String LOC_field2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LifeOtherCoverage_textfield2");
		String LOC_fieldtext2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LifeOtherCoverage_textfield3");
		String LOC_field3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LifeOtherCoverage_(excludingMassMutual)thatarenotbeingreplaced/changed?");
		String LOC_field4 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LifeOtherCoverage_rannuitycontractinforcewithMassMutualorothercompanies?");
		String NYAppliedWithMassMutual = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NYAppliedWithMassMutual");
		String NYinsthatwillbeplacedwithMM= testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NYinsthatwillbeplacedwithMM");
		String NYinforcewithMM = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NYinforcewithMM");
		String NYreplacedchanged = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NYreplacedchanged");
		String NYcontractinforcewithMassMutual = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"NYcontractinforcewithMassMutual");
		LOC.othercoverage(State,LOC_field1, LOC_field2, LOC_fieldtext2, LOC_field3, LOC_field4,NYAppliedWithMassMutual,NYinsthatwillbeplacedwithMM ,NYinforcewithMM
				,NYreplacedchanged,NYcontractinforcewithMassMutual);
	 
	}

	@When("^User Fills Term Life Payment Information and Certification screen details and click on Next$")
	public void user_Fills_Term_Life_Payment_Information_and_Certification_screen_details_and_click_on_Next() throws Throwable {
		String state = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");
		String Billing= testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LPI_BillingType");
		String freq_M = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPI_Frequnecy");
		String Initialpremiumbeingsubmitted = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPI_remium being submitted with this Application?");
		String premiumpayor = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPI_Premium Payor");
		String PremincludeLoanorPremFinancing = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPI_ include a loan or premium financing?");
		String selectPRemium = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_PayInfoSourceOfPremium");
		String selectPRemiumotherdetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"NY_PayInfoSourceOfPremium_otherdetails");
		lpinfo.life_pay_field_entry(state,freq_M,Billing, Initialpremiumbeingsubmitted, premiumpayor, PremincludeLoanorPremFinancing,selectPRemium,selectPRemiumotherdetails);
        String SalesCertification = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "salesCertification");
    
        certify.salesCertification(SalesCertification);
        String Certi_taxpayer_id = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Certification_TaxpayerIdentificationNumber");
		String Certi_backup = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Certification_IamNOTsubjecttobackupwithholding");
		String Certi_us = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"Certification_IamaU.S.person");
        certify.TaxPayerIdentification(Certi_taxpayer_id,Certi_backup, Certi_us);

	}

	@When("^User Fills Term HIV consent screen details and click on Next$")
	public void user_Fills_Term_HIV_consent_screen_details_and_click_on_Next() throws Throwable {
		String CI_State = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "CI_State");
		String AZ_KY_personalphysician_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "AZ_KY_personalphysician_RD");
		String CT_physician_or_health = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "CT_HIV");
		String DC_Fl_physician_or_health = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "DC_FL_HIV");
		String IA_Alternate_Myphysician_none = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "IA_HIV");
		String Ks_Ma_MePIandPhysician = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "KS_MA_HIV");
		String NY_physician_or_health = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_HIV");
		String MI_YEsNo = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"MI_HIV_YEsNo");
		String MI_authorizeHiv = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet,"MI_Hiv");
		String Fname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_FirstName");
		String Lname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_LastName");
		String Addrs = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_Address");
		String Cty = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_City");
		String ST = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_State");
		String Zpcd = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_Zip");
		String HCprovidername = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_HealthCareProviderName");
		String Alternativesitename = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_AlternativeSite");
		String Dname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Hiv_Designeename");
		String MoPhysician_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Mo_HIV");
		String ExaminerName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "HIV_ExaminerName");
		String FacilityName = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Hiv_FacilityName");
		Consent_HIV.personalPhysician_Yes_No(CI_State, AZ_KY_personalphysician_RD, CT_physician_or_health, DC_Fl_physician_or_health, IA_Alternate_Myphysician_none,
				Ks_Ma_MePIandPhysician, NY_physician_or_health,MoPhysician_RD, Fname, Lname, Addrs, Cty, ST, Zpcd, HCprovidername, Alternativesitename, MI_YEsNo, MI_authorizeHiv,
				Dname,ExaminerName,FacilityName);
	}

	@When("^User Fills Term Life Producer Statement screen details and click on Next$")
	public void user_Fills_Term_Life_Producer_Statement_screen_details_and_click_on_Next() throws Throwable {
		String RiskClassification = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPS_RiskClassificationPresentedtoClient");
		String AC_Offer = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPS_AC_Offer");
		String MultipolicyCase = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_Isthispartofamulti-policycase(i.e.familymembers,businesspartners,etc.)?");
		String MultipolicyCasePolicyNumbers = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_MultiPolicyProvidedassociatedPolicyNumber(s)");
		String Otherapplicationssubmitted = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_Arethereanyotherapplications(e.g.Disability,LongTermCare)beingsubmittedconcurrentlywiththisApplicationorwithinthelasttwomonths?");
		String OtherapplicationssubmittedPolicyNumbers = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_OtherapplicationssubmittedProvideassociatedPolicyNumber(s)");
		String Dividends = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_WilldividendsfromanexistingMassMutualpolicybeusedtopayallorpartoftheinitialpremiumonthispolicy?");
		String ServiceRequest = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_WouldyouliketocompleteaServiceRequestform?");
		String PurchaseSinglePremiumImmediateAnnuity = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_IstheLifeInsurancebeingappliedforinconjunctionwiththepurchaseofaSinglePremiumImmediateAnnuity?");
		String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LIfeProducerStatement_PurchaseSinglePremiumProvideassociatedPolicyNumber(s)");
		String DiscussedArrangingFinancingForPurchase = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_AreyouawareofwhethertheProposedOwnerorProposedInsuredhasarranged,ordiscussedarranging,anyfinancingforthepurchaseofthispolicy?");
		String KnowledgeReasontoBelieve = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_KnowledgeReasontoBelieve");
		String KnowledgeReasontoBelieveDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_Details");
		String AC_HearingImpairment = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AC_HearingImpairment");
		String AC_OtherPreferredLanguage = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AC_OtherPreferredLanguage");
		String UnderstandEnglish = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_DideverypersonsigningthisApplicationunderstandandanswereachquestioninEnglish?");
		String IndicateLanguage = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_IndicateLanguage");
		String MarketType = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LIfeProducerStatement_MarketType");
		String Prospectusandany = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_ProducerRole");
		String Prospectus_MM = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Email");
		String Prospectus_DD = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LifeProducerCompensation_FloridLIC");
		String Prospectus_YYYY = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_1stYearCommission");
		
		producerStatement.enterProducerStatement(RiskClassification,AC_Offer, MultipolicyCase, MultipolicyCasePolicyNumbers,
				Otherapplicationssubmitted, OtherapplicationssubmittedPolicyNumbers, Dividends, ServiceRequest,
				PurchaseSinglePremiumImmediateAnnuity, PurchaseSinglePremiumImmediateAnnuityPolicyNumbers,
				DiscussedArrangingFinancingForPurchase, KnowledgeReasontoBelieve, KnowledgeReasontoBelieveDetails,
				UnderstandEnglish,AC_HearingImpairment,AC_OtherPreferredLanguage, IndicateLanguage, MarketType,Prospectusandany, Prospectus_MM, Prospectus_DD, Prospectus_YYYY);
		
	    
	 
	}

	@When("^User Fills Term Life Producer Compensation screen details and click on Next$")
	public void user_Fills_Term_Life_Producer_Compensation_screen_details_and_click_on_Next() throws Throwable {
		String ProducerRole = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_ProducerRole");
		String ProducerEmail = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Email");
		String LicenceID = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LifeProducerCompensation_FloridLIC");
		String Firstyearcommission = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_1stYearCommission");
		String RenewalCommision = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_RenewalCommission");
		String AdditionalProducer = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_Arethereadditionalproducers?");
		String ContactOneFirstName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact1FirstName");
		String ContactOneLastName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact1LastName");
		String ContactOnePhone = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact1Phone");
		String ContactOneHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_Contact1HomeWorkMobile");
		String ContactOneExtension = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_Contact1WorkExtension");
		String ContactOneEmail = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact1Email");
		String ContactTwoFirstName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact2FirstName");
		String ContactTwoLastName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact2LastName");
		String ContactTwoPhone = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact2Phone");
		String ContactTwoHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_Contact2HomeWorkMobile");
		String ContactTwoExtension = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_Contact2WorkExtension");
		String ContactTwoEmail = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Contact2Email");
		String Add_ProducerRole = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_Add_ProducerRole");
		String NumberOfProducer = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Number_OF_producer");
		String ProducerID = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_ProducerID");
		String AgencyId = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_AgencyId");
		String ProducerID2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_ProducerID2");
		String AgencyId2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_AgencyId2");
		String ProducerID3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_ProducerID3");
		String AgencyId3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "LPC_AgencyId3");
		String fst_Year_Commission1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_%_1st_Year_Commission1");
		String Renewal_Commission1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_%_Renewal_Commission1");
		String fst_Year_Commission2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_%_1st_Year_Commission2");
		String Renewal_Commission2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_%_Renewal_Commission2");
		String fst_Year_Commission3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_%_1st_Year_Commission3");
		String Renewal_Commission3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"LPC_%_Renewal_Commission3");
		String firm1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"firm1");
		String firm2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"firm2");
		String firm3 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"firm3");
		
		
		producerCompensation.enterProducerCompensation(ProducerRole, ProducerEmail, LicenceID, Firstyearcommission,
				RenewalCommision, AdditionalProducer);
		producerCompensation.AdditionalProducer(AdditionalProducer, NumberOfProducer, Add_ProducerRole, 
				ProducerID, AgencyId,firm1, ProducerID2, AgencyId2,firm2, ProducerID3, AgencyId3,firm3, 
				fst_Year_Commission1, Renewal_Commission1, fst_Year_Commission2, Renewal_Commission2, fst_Year_Commission3, Renewal_Commission3);
		producerCompensation.ContactDetails(ContactOneFirstName, ContactOneLastName, ContactOnePhone,
				ContactOneHomeWorkMobile, ContactOneExtension, ContactOneEmail, ContactTwoFirstName, ContactTwoLastName,
				ContactTwoPhone, ContactTwoHomeWorkMobile, ContactTwoExtension, ContactTwoEmail);
	 
	}

	@When("^User Fills Term Life All NewYorkScreens when state is NewYork$")
	public void user_Fills_Term_Life_All_NewYorkScreens_when_state_is_NewYork() throws Throwable {
		    String IntendonConvertingpolicy = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "IntendonConvertingpolicy");
		    String Anticipatedtimecoverage = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_coverageisneeded");
	        String Primarypurposeof_ins = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_PrimaryPurposeOfIns");
	        String InsOptionsAbove = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_InsOptionsAbove");        
	        String Dependent = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_dependents");
	        String DependentDetails = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_dependentDetails");
	        String OtherText = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_dependentOtherDetails");
	        String state = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");        
	        NYlps.productAndPremiumPayorInfo(state,IntendonConvertingpolicy,Anticipatedtimecoverage, Primarypurposeof_ins, InsOptionsAbove, Dependent, DependentDetails,
	                OtherText);
	        // Alternate and additional for ny Life Products suitability
		    String alt_intend_on_converting = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_alt_intend_on_converting");
	        String alt_Anticipated_coverageNeeded = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_alt_Anticipated_coverageNeeded");
	        String alt_PorposeofInsure = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_alt_PorposeofInsure");        
	        String Alt_Ins_option_above_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_Alt_Ins_option_above_RD");
	        String add_Anticipated_coverageNeeded = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_add_Anticipated_coverageNeeded");
	        String add_PorposeofInsure = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_add_PorposeofInsure");     
	        String Add_Ins_option_above_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_Add_Ins_option_above_RD");      
	        NYlps.ALternate_and_additional(state,alt_intend_on_converting, alt_Anticipated_coverageNeeded, alt_PorposeofInsure, Alt_Ins_option_above_RD,
	        		add_Anticipated_coverageNeeded, add_PorposeofInsure, Add_Ins_option_above_RD);
	        
	        String sourceofPremium = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilitysourceofPremium");
	        String TaxPenality = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_TaxPenality");
	        String hardshipwithdrawal = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_hardshipwithdrawal");        
	        String surrenderCharge = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_surrenderCharge");
	        String surrenderChargeDetail = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_surrenderChargeDetail");
	        String Exchangeamount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_Exchangeamount");
	        String exchangSurenderCharge = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_exchangSurenderCharge");        
	        String surrenderChargeAmount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_surrenderChargeAmount");
	        String AnnuitizationSurenderCharge = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_AnnuitizationSurenderCharge");
	        String AnnuitizationSurenderChargeAmount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.financialinfo(state, sourceofPremium, TaxPenality, hardshipwithdrawal, surrenderCharge, surrenderChargeDetail, Exchangeamount,
	                exchangSurenderCharge, surrenderChargeAmount, AnnuitizationSurenderCharge, AnnuitizationSurenderChargeAmount);
	        String securitiess = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_securitiess");
	        String Annuitiess = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_Annuitiess");
	        String CashValues = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_CashValues");        
	        String AlternativeInvestmentss = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_AlternativeInvestmentss");
	        String FinancialObject = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitability_FinancialObject");
	        
	        NYlps.financialExperience(state, securitiess, Annuitiess, CashValues, AlternativeInvestmentss, FinancialObject);
		
	        
	        NYLifeproductsuitabilityContinues NYPSC=new NYLifeproductsuitabilityContinues();
	        String T20million = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_T20million");
	        String Proposedannualpremium = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_Proposedannualpremium");
	        String Faceamount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_FaceAmount");        
	        String ReplaceByPolicy = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_ReplaceByPolicy");
	        String AnnualPrem_Cost = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_AnnualPrem_Cost");
	        String Totalfaceamount = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_Totalfaceamount");        
	        String TotalannualIncome = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_TotalannualIncome");
	        String RiskTolerance = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_Risktoleranceaboutpremiums");
	        String RiskToleranceTwo = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilityContinus_Risktoleranceaboutdeathbenefit");
	        String UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_ProductsSuitabilityUnsheduledALIR");        
	        String amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_ProductsSuitabilityContinus_amountofUnSheduled");
	        String Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_ProductsSuitabilityContinus_Exchange1035_RD");
	        String exchange1035Amount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_ProductsSuitabilityContinus_exchange1035Amount");
	        String LTCRiskTolerance = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_ProductsSuitabilityContinus_LTCRiskTolerance");
	        
	        NYPSC.suitabilitycontinues(state, T20million, Proposedannualpremium, Faceamount,UnsheduledALIR,
	    			amountofUnSheduled,Exchange1035_RD,exchange1035Amount, ReplaceByPolicy, AnnualPrem_Cost, Totalfaceamount,
	                TotalannualIncome, RiskTolerance,RiskToleranceTwo,LTCRiskTolerance);
	           String Alt_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_propsedAnnualPremium");
	        String Alt_faceamount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_faceamount");
	        String Alt_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_ReplacedByPolicy");        
	        String Alt_TotalFaceAmount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_TotalFaceAmount");
	        String Alt_TotalAnnualPremium = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_TotalAnnualPremium");
	        String Alt_AnnuaLPremiumCost = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_AnnuaLPremiumCost");        
	        String Alt_UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_UnsheduledALIR");        
	        String Alt_amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_amountofUnSheduled");
	        String Alt_Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_Exchange1035_RD");
	        String Alt_exchange1035Amount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_exchange1035Amount");
	        
	        String Add_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_propsedAnnualPremium");
	        String Add_faceamount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_faceamount");
	        String Add_UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_UnsheduledALIR");        
	        String Add_amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_amountofUnSheduled");
	        String Add_Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_Exchange1035_RD");
	        String Add_exchange1035Amount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_exchange1035Amount");        
	        
	        String Add_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_ReplacedByPolicy");
	        String Add_Totalfaceamount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_TotalFaceAmount");
	        String Add_totalannualPremium = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_TotalAnnualPremium");
	        String Add_annuaLpremiumCost = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_AnnuaLPremiumCost");
	        //For NY and Alt and Additional Product
	        NYPSC.suitabiltycont_coverage_costinfo(Alt_propsedAnnualPremium, Alt_faceamount, Alt_UnsheduledALIR,
	    			 Alt_amountofUnSheduled, Alt_Exchange1035_RD, Alt_exchange1035Amount, Alt_ReplacedByPolicy, Alt_TotalFaceAmount, Alt_TotalAnnualPremium, Alt_AnnuaLPremiumCost,
	        		Add_propsedAnnualPremium, Add_faceamount, Add_UnsheduledALIR, Add_amountofUnSheduled, Add_Exchange1035_RD, Add_exchange1035Amount,Add_ReplacedByPolicy, Add_Totalfaceamount, Add_totalannualPremium, Add_annuaLpremiumCost);
	        
	        //For NY Risk tollerance for both alt and additional
	        String ALt_RiskTolerance = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_ALt_RiskTolerance");
	        String Alt_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Alt_RiskToleranceAboutDeath");
	        String Add_RiskTolerance = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_RiskTolerance");
	        String Add_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_LPSC_Add_RiskToleranceAboutDeath");
	        NYPSC.RiskTolerance_Alt_Add(state,ALt_RiskTolerance, Alt_RiskToleranceAboutDeath, Add_RiskTolerance, Add_RiskToleranceAboutDeath);
	        NGE.nonFuaranteeedelement(state);    
	        String txtareaone = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilitySummary_Textareaone");
	        String txtareaTwo = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilitySummary_TextareaTwo");
	        String txtareaThree = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "NY_ProductsSuitabilitySummary_TextareaThree");
	        String Alt_TextAreaone = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_PSS_Alt_TextAreaone");
	        String Alt_Textareatwo = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_PSS_Alt_Textareatwo");
	        String Alt_TextAreathree = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_PSS_Alt_TextAreathree");
	        String Add_TextAreaone = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_PSS_Add_TextAreaone");
	        String Add_Textareatwo = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_PSS_Add_Textareatwo");
	        String Add_Textareathree = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "NY_PSS_Add_Textareathree");
	        NGE.productsuitability(state,txtareaone, txtareaTwo, txtareaThree, Alt_TextAreaone,Alt_Textareatwo,Alt_TextAreathree,
	    			 Add_TextAreaone, Add_Textareatwo,Add_Textareathree);
	 
	}

	@When("^User Selects Additional Forms details for Term and click on Next$")
	public void user_Selects_Additional_Forms_details_for_Term_and_click_on_Next() throws Throwable {
		String preferedLanguage = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "PI_PrefferedLang");
		String languages = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AdditionalForms_Foreign_Language_Language");
		String Others = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AdditionalForms_Foreign_Language_Language_Other");
		String Translator = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AdditionalForms_Foreign_Language_Language_Translator_is_a_or_an");
		String AgentFirstname = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_GeneralAgent_FirstName");
		String Agent_Midlename = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_GeneralAgent_MI");
		String AgentLastname = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_GeneralAgent_LastName");
		String Agent_suffix = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_GeneralAgent_Sufix");
		String ProfessionalFirstName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AF_Professional_FirstName");
		String ProfessionalMidleName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_Professional_MI");
		String ProfessionalSuffix = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_Professional_Sufix");
		String ProfessionalLastName = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AF_Professional_LastName");
		String ProfessionalTranslationFirm = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AF_Professional_TranslationFirm");
		String ProfessionalStreet_1 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AF_ProfessionalStreet_1");
		String ProfessionalStreet_2 = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet,"AF_ProfessionalStreet_2");
		String Professional_City = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_Professional_City");
		String Professional_State = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_Professional_State");
		String Professional_Zip = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "AF_Professional_Zip");
		Addforms.enterAdditionalFormsDetail(preferedLanguage, languages, Others, Translator, AgentFirstname,
				Agent_Midlename, AgentLastname, Agent_suffix, ProfessionalFirstName, ProfessionalMidleName,
				ProfessionalLastName, ProfessionalSuffix, ProfessionalTranslationFirm, ProfessionalStreet_1,
				ProfessionalStreet_2, Professional_City, Professional_State, Professional_Zip);
	 
	}

	@When("^User attaches the required documents in the Attachments Screen and click on Next$")
	public void user_attaches_the_required_documents_in_the_Attachments_Screen_and_click_on_Next() throws Throwable {
		
	
		String Policytype = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Policytype");
        String PlantrustType = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PlantrustType");
        String pleasespecify = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "pleasespecify");
        String Howlongplanbeen = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Howlongplanbeen");
        String Planname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Planname");
        String trustee = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "trustee");
        String street1 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifed_street1");
        String street2 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifed_street2");
        String city = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifed_city");
        String qualifedstate = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifedstate");
        String zip = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifiedzip");
        String MM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifed_MM");
        String DD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifed_DD");
        String YYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "qualifed_YYYY");
		
        String Qualified_PlanTrustSponsorEIN = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Qualified_PlanTrustSponsorEIN");
        String Qualified_TotalnoEmployee = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Qualified_TotalnoEmployee");
        String Qualified_NoofEmployecoverdPlan = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Qualified_NoofEmployecoverdPlan");
        String Qualified_ExplainBasisofEmployee = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Qualified_ExplainBasisofEmployee");
		
        String PlanTrustSponsorEInumber = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Qualified_PlanTrustSponsorEInumber");
		QP.PolicyTrust_Plantrust(Policytype, PlantrustType,pleasespecify, Howlongplanbeen, Planname, trustee, street1, street2,
				city, qualifedstate, zip, MM, DD, YYYY,PlanTrustSponsorEInumber, Qualified_PlanTrustSponsorEIN, Qualified_TotalnoEmployee, Qualified_NoofEmployecoverdPlan, Qualified_ExplainBasisofEmployee);
		
	
		
		String fullnameEmploye = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "fullnameEmploye");
        String plansponsor_street1 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "plansponsor_street1");
        String plansponsor_street2 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "plansponsor_street2");
        String plansponsor_city = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "plansponsor_city");
        String plansponsor_state = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "plansponsor_state");
        String plansponsor_zip = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "plansponsor_zip");
        String Employer_sponsor_EINNumber = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Employer_sponsor_EINNumber");
        String PlanSponsore_Authorized_fullname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PlanSponsore_Authorized_fullname");
        String PlanSponsor_Authorized_lastname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PlanSponsor_Authorized_lastname");
      
		QP.EmployerPlanSponsor(fullnameEmploye, plansponsor_street1, plansponsor_street2, plansponsor_city, plansponsor_state, plansponsor_zip,Employer_sponsor_EINNumber,PlanSponsore_Authorized_fullname, PlanSponsor_Authorized_lastname);
		
		String ThirdParty_fullname = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ThirdParty_fullname");
        String ThirdParty_street1 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ThirdParty_street1");
        String ThirdParty_street2 = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ThirdParty_street2");
        String ThirdParty_city = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ThirdParty_city");
        String ThirdParty_state = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ThirdParty_state");
        String ThirdParty_zip = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ThirdParty_zip");
        String Thirdparty_preferredphone = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Thirdparty_preferredphone");
        String Thirdparty_phonetype = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Thirdparty_phonetype");
        String Thirdparty_email = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Thirdparty_email");
		QP.ThirdPartyAdministrationinfo(ThirdParty_fullname, ThirdParty_street1, ThirdParty_street2, ThirdParty_city, ThirdParty_state, ThirdParty_zip, Thirdparty_preferredphone,
				Thirdparty_phonetype, Thirdparty_email);
		
		String Whatlimitofamount = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PurposeOFLifeINS");
        String ApproxValueAssets = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ApproximateValue");
        String annualpremium = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "AnnualPremium");
        String EmployerContribution = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "EmployerContribution");
        String FundingMethod = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "DefinedBenefitPlans");
        String LimitOFDeathBenefit = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "LimitsOFDeathBenefit");
        String Totalamountaggreemnt = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "TotalAmountAgrrement");
        String yearone = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "YearONe");
        String yeartwo = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "YearTwo");
        String SelectAllType = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "SelectAllType");
        String ParticipantLive = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "ParticipantLive");
        String Pleasexpalin = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Participant_PleaseExpalain");
        String FundedpleaseSpecify = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "FundedpleaseSpecify");
       
        String Self_DDC_IsReducedPremium = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Self_DDC_IsReducedPremium");
        String Self_DDC_approxvalue = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "Self_DDC_approxvalue");
		QP.Self_DDCPlanInfo(Whatlimitofamount, ApproxValueAssets, annualpremium, EmployerContribution, FundingMethod, LimitOFDeathBenefit, Totalamountaggreemnt, yearone, yeartwo,
				SelectAllType, ParticipantLive, Pleasexpalin, FundedpleaseSpecify,Self_DDC_IsReducedPremium,Self_DDC_approxvalue);
		
		
		
		String state = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_ProductType");
		attach.attachDocuments(state,ProductType);
		
		/*String state = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_State");
		attach.attachDocuments(state);*/
	 
	}

	@Then("^Lock the Policies and do WetSign or E-sign as Required$")
	public void lock_the_Policies_and_do_WetSign_or_E_sign_as_Required() throws Throwable {
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "CI_ProductType");
		int policyrow = row + 2;
		lock.LockScreen(policyrow,ProductType);

		String SignType = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "SignatureMethod");
		String InsIDproof = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Esign_InsuredIdType");
		String InsIdNum = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "Esign_InsuredIdNumber");
		String OwnerInsIDproof = testdata.get(HooksTest.scenario.getName(), inputfile,inputsheet, "OwnerInsIDproof");
		String OwnerInsIdNum = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "OwnerInsIdNum");
		String proposedInsuredCity = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "proposedInsuredCity");
		String proposedinsuredstate = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "proposedinsuredstate");
		
		String WetsignType = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "WetsignType");
		String InsMM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "InsMM");
		String InsDD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "InsDD");
		String InsYYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "InsYYYY");

		String PrdMM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PrdMM");
		String PrdDD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PrdDD");
		String PrdYYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PrdYYYY");
		String OwnerMM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "OwnerMM");
		
		String PlanSponsorMM = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PlanSponsorMM	");
		String PlanSponsorDD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PlanSponsorDD");
		String PlanSponsorYYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "PlanSponsorYYYY");
		
		String OwnerDD = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "OwnerDD");
		String OwnerYYYY = testdata.get(HooksTest.scenario.getName(),inputfile,inputsheet, "OwnerYYYY");
		
		
		lock.signature(SignType, InsIDproof, InsIdNum,policyrow,ProductType, OwnerInsIDproof, OwnerInsIdNum,WetsignType, InsMM, InsDD,InsYYYY,
				PrdMM,PrdDD, PrdYYYY,OwnerMM, OwnerDD, OwnerYYYY, proposedInsuredCity, proposedinsuredstate,PlanSponsorMM,PlanSponsorDD,PlanSponsorYYYY);

	 
	}

}
