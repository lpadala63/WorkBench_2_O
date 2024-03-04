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
import pageclass.ProductUL;
import pageclass.ProposedInsured;
import pageclass.ProposedInsuredCont;
import pageclass.QualifiedPlan;
import pageclass.TrustCertification;
import pageclass.Workbench_LaunchEzApp;
import utilities.GetDataFromExcel;

public class UniversalLife {
	GetDataFromExcel ReadData = new GetDataFromExcel();
	int row;
	Workbench_LaunchEzApp workbenchLaunchEzApp = new Workbench_LaunchEzApp();
	CaseInfo caseinfo = new CaseInfo();
	LifeCaseSetup lifecasesetup = new LifeCaseSetup();
	NewYorkRegSixty NyR=new NewYorkRegSixty();
	ProposedInsured PrpsdIns = new ProposedInsured();
	ProposedInsuredCont PI_cont = new ProposedInsuredCont();
	PersonalHistory personalhistory = new PersonalHistory();
	PersonalHistoryContOne PHCOne = new PersonalHistoryContOne();
	PersonalHistoryContTwo PHCTwo = new PersonalHistoryContTwo();
	ProductUL productUL = new ProductUL();
	ALt_Add_Both_Products products_alt_add= new ALt_Add_Both_Products();
	LifepurposeofInsurance LPOI = new LifepurposeofInsurance();
	LifeOwner LO=new LifeOwner();
	TrustCertification Trust=new TrustCertification();
	EntityOwner EO=new EntityOwner();
	LifeBeneficiaries LifeBene = new LifeBeneficiaries();
	LifeOtherCoverage LOC = new LifeOtherCoverage();
	LifePaymentInfo lpinfo = new LifePaymentInfo();
	Certification certify = new Certification();
	HIVConsent Consent_HIV = new HIVConsent();
	LifeProducerStatement producerStatement = new LifeProducerStatement();
	LifeProducerCompensation producerCompensation = new LifeProducerCompensation();
	NewYork_LifeProductsSuitability NYlps= new NewYork_LifeProductsSuitability();
	NY__NonGuaranteedElement NGE=new NY__NonGuaranteedElement();
	AdditionalForms Addforms = new AdditionalForms();
	QualifiedPlan QP=new QualifiedPlan();
	Attachments attach = new Attachments();
	LockAndUnlock lock = new LockAndUnlock();
	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();;
	
	String FileName= TestPropertyFileRead.getThePropertyValue("ExcelFileName");
	
	String SheetName= TestPropertyFileRead.getThePropertyValue("UL_SheetName");
	
	String WriteFilename= TestPropertyFileRead.getThePropertyValue("WriteFilename");
	
	String WriteSheetname= TestPropertyFileRead.getThePropertyValue("WriteSheetname");
	
	
	@Given("^Launch Fieldnet Dev application to Enter User ID and Password click on Next (\\d+)$")
	public void launch_Fieldnet_Dev_application_to_Enter_User_ID_and_Password_click_on_Next(int arg1) throws Throwable {
		row = arg1;
		workbenchLaunchEzApp.enterUserIDClickNext();
		workbenchLaunchEzApp.enterPasswordClickVerify();
		workbenchLaunchEzApp.clickOnFieldnetDev();

	}

	@Given("^click SubmitNewBusiness Menu and Enter ProducerID and click on search$")
	public void click_SubmitNewBusiness_Menu_and_Enter_ProducerID_and_click_on_search() throws Throwable {
		String producerID = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ProducerID");
		workbenchLaunchEzApp.enterProducerNumberClickSearch(producerID);

	}

	@Given("^click on Plus icon to select Environment and click on continue$")
	public void click_on_Plus_icon_to_select_Environment_and_click_on_continue() throws Throwable {
		String Environment = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Environment");
		workbenchLaunchEzApp.clickonSubmitNewBusinessWB(Environment);

	}

	@When("^EzApp is launched and user enters Ul Insured details state and UL product$")
	public void ezapp_is_launched_and_user_enters_Ul_Insured_details_state_and_UL_product() throws Throwable {
		String FirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_Firstname");
		String LastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_LastName");
		String DOBMonth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_MM");
		String DOBDay = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_DD");
		String DOBYear = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_YYYY");
		String Gender = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_Gender");
		String CaseDescription = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_CaseDescription");

		caseinfo.enterCaseInfoDetails(FirstName, LastName, DOBMonth, DOBDay, DOBYear, Gender, CaseDescription);
		
		String State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		String ProductType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_ProductType");

		caseinfo.CarrierAndProduct(State, ProductType);
		String Product = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_Product");
		caseinfo.selectProduct(Product);
	}

	@When("^User Fills UL LifeCase setup screen and NewYorkRegsixty when state is NY and click on Next$")
	public void user_Fills_UL_LifeCase_setup_screen_and_NewYorkRegsixty_when_state_is_NY_and_click_on_Next()
			throws Throwable {
		String InsuredResidentState = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_InsuredResidentState");
		String insuredCitizenship = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_InsuredCitizenship");
		String FaceAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_FaceAmount");
		String groupbill = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_GroupBill");
		String PlatniumPassprgm = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_PlatniumPassprgm?");
		String LifeconvInsurabilityOpt = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_insurabilityoptionexercise?");
		String PolicyUnderwriting = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_policyrequireunderwriting?");
		String registeredbrokerwithMMLIS = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_ MMLISRegistered Rep?");
		String QualifiedPlan = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_qualifiedplan?");
		String WithdrawalFromRetirementAccount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_FinancialServicesRepresentative?");
		String PenalityTaxAmountWithdrawn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_Account10%PurchaseThisPolicy?");
		String HardshipWidrawal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_hardshipwithdrawal?");
		String Retirement_paythepremiums = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_retirement_account_pay_the_premiums?");
		String SurrenderChargeAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_surrenderchargeamount?");
		String PrimaryPurposeLifeInsurance = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_Whatistheprimarypurpose");
		String BothLifenDIquestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_DIPolicyonthesameapplication?");
		String InsuredonlyOwnerquestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_owneronallpolicies?");
		String RightToExistingDIPolicy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_ existingDIpolicy?");
		String Indiviual_Entity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_Indiviual or EntityOWner");
		String OwnerState = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_OwnerState");
		String EntityTrust = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_EntityisaTrust");
		String HoldIssue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_HoldIssue");
		String BackdateSaveAge = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_Backdatetosaveage?");
		String PolicyDating = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_PolicyDating");
		String SpecificDateMonth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_SpecificDate_MM");
		String SpecificDateDay = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_SpecificDate_DD");
		String SpecificDateYear = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_pecificDate_YYYY");
		String SubmittingAgency = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_SubmitAgency");
		String StateofOwnersign = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_OwnerState");
		String Countryowner = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_Country");
		String CityofOwnersign = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_OwnerCity");
		String QuickClose = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LCS_QuickClose");
		String Agentfirm = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "listFirm");
		String FirmsListdisplay = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "FirmsListdisplay");
		String SalesPerson_RD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "SalesPerson_YesNo");
		String SalesFirstname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "SalesFirstname");
		String salesLastName = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "SalesLastName");
		String ApexMMLIS = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "LCS_ApexMMLIS");
		String ApexResultOfRightBridge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "LCS_ApexResultOfRightBridge");
		
		String ApexOwner_MM = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Owner_MM");
		String ApexOwner_DD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Owner_DD");
		String ApexOwner_YYYY = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Owner_YYYY");
		
		String LCS_IsPolicyJointlyOwned = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "LCS_IsPolicyJointlyOwned");
		lifecasesetup.enterLifeCaseSetup(InsuredResidentState, insuredCitizenship, FaceAmount, groupbill,
				PlatniumPassprgm, LifeconvInsurabilityOpt, PolicyUnderwriting,registeredbrokerwithMMLIS,ApexMMLIS,ApexResultOfRightBridge, QualifiedPlan, WithdrawalFromRetirementAccount,
				PenalityTaxAmountWithdrawn, HardshipWidrawal, Retirement_paythepremiums, PrimaryPurposeLifeInsurance,
				SurrenderChargeAmount);
		lifecasesetup.RadioQuestionTwo(BothLifenDIquestn, RightToExistingDIPolicy, InsuredonlyOwnerquestn,Indiviual_Entity,LCS_IsPolicyJointlyOwned,
				OwnerState,ApexOwner_MM,ApexOwner_DD,ApexOwner_YYYY, EntityTrust,HoldIssue,BackdateSaveAge, PolicyDating, SpecificDateMonth, SpecificDateDay, SpecificDateYear, SubmittingAgency,
				Agentfirm,FirmsListdisplay,StateofOwnersign, Countryowner, CityofOwnersign, QuickClose,SalesPerson_RD,
				SalesFirstname,salesLastName);
		String individualsigningYes_No = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "individualsigningYes_No");
		String firstname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PisigningOff_firstname");
		String Lastname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PisigningOff_Lastname");
		String suffix = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PisigningOff_suffix");
		String relationshiptoInsured = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "relationshiptoInsured");
		lifecasesetup.individualsigning1(individualsigningYes_No, firstname, Lastname, suffix, relationshiptoInsured);
		
		String State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		String Lapsed = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NyReg_LAPSED_SURRENDERED");
		String CashValues = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NyReg_OTHER_CASH_VALUES");
		String tobeInforce = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NyReg_CONTINUE_TO_BE_IN_FORCE");
		String Reissued = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NyReg_REISSUED_WITH_REDUCTION");
		String Collateral = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NyReg_ASSIGNED_AS_COLLATERAL");
		String Premium = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NyReg_PREMIUM PAID");
		String externalReplacement = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NyReg_EXTERNAL_REPLACEMENT");
		
		NyR.NeyworkReg(State,Lapsed, CashValues, tobeInforce, Reissued, Collateral, Premium, externalReplacement);

	}

	@When("^User Fills UL Primary Insured and Primary Insured Cont screen details and click on Next$")
	public void user_Fills_UL_Primary_Insured_and_Primary_Insured_Cont_screen_details_and_click_on_Next()
			throws Throwable {
		String Suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Suffix");
		String Birth_state = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_BirthState");
		String ssn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_SSN");
		String RESADDStreet1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_AddressStreet1");
		String RESADDStreet2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_AddressStreet2");
		String RESADDCity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_City");
		String RESADDZIP = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Zip");
		String MailingADD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_MailAdd");
		String MailingStreet1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_ALT_ AddressStreet1");
		String MailingStreet2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_ALT_AddressStreet2");
		String MailingCity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_ALT_City");
		String MailingState = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_ALT_State");
		String MailingZIPPostalCode = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_ALT_Zip");
		PrpsdIns.personal_Information(Suffix, Birth_state, ssn);
		PrpsdIns.Address(RESADDStreet1, RESADDStreet2, RESADDCity, RESADDZIP, MailingADD, MailingStreet1,
				MailingStreet2, MailingCity, MailingState, MailingZIPPostalCode);

		String PreferredPhoneNumber = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Phone");
		String HomeWorkMobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_HomeWork");
		String WorkExtension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Extension");
		String AlternatePhoneNumber = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Alt_Phone");
		String AlterHomeWorkMobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Alt_HomeWork");
		String AlternateExtesnion = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Alt_Extension");
		String AmPM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_BestTime");
		String Besttimetocall = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_BesttimetoCall");
		String ReciveText_BD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Message");
		String NeedspecialAccomidation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Accomodation");
		String preferredlanguage = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_PrefferedLang");
		String EmailAddress = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_Email");
		// Write code here that turns the phrase above into concrete actions

		PrpsdIns.Additionalinfo(PreferredPhoneNumber, HomeWorkMobile, WorkExtension, AlternatePhoneNumber,
				AlterHomeWorkMobile, AlternateExtesnion, AmPM, ReciveText_BD, Besttimetocall, NeedspecialAccomidation,
				preferredlanguage, EmailAddress);
		String PICont_USDriversLicense = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PIC_U.S.DriversLicense");
		String PIC_IdentificationNumber = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PIC_IdentificationNumber");
		
		String PIC_ReasonWhy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_ReaspnWhy");
		String PICType_of_identification = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PIC_TypeOfIdentification");
		String PIC_State_ProvinceofIssue_pass = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PIC_StateProvinceofIssue");
		String PICProposedInsuredCont_Others = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_Other");
		String TypeofCitizenship = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_TypeofCitizenship");
		String Expr_MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LOC_Exp_MM");
		String Expr_DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LOC_Exp_DD");
		String Expr_YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LOC_Exp_YYYY");
		PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
				PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);


	}

	@When("^User Fills All UL Personal History Information screen details and click on Next$")
	public void user_Fills_All_UL_Personal_History_Information_screen_details_and_click_on_Next() throws Throwable {
		String InsuredDisability = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PH_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits");
		String InsuredDisabilityDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_IstheProposedInsuredcurrentlydisabledorapplyingforanydisabilitybenefits_Details");
		String Tobaccoin12M = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months");
		String Tobaccoin12MDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Usedtobaccoorothernicotinecontainingproductsexceptcigars-Withinthelast12months_Details");
		String Tobaccoin24M = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Withinthelast24months");
		String Tobaccoin24MDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Withinthelast24months_Details");
		String Cigarin24M = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_UsedCigarswithinthelast24months");
		String Cigarin24count = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_UsedCigarswithinthelast24months_Numberofcigarsperyear");
		String PrescriptionMedicationin12M = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Usedprescriptionmedicationtoassistwithsmokingcessation");
		String PrescriptionMedicationin12MDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Usedprescriptionmedicationtoassistwithsmokingcessation_Details");
		String ConvictedProbation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation");
		String ConvictedProbationDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Everbeenconvictedofafelony,orcurrentlyonparoleorprobation_Details");
		String ConvictedwithAlcoholin2Y = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol");
		String ConvictedwithAlcoholin2YDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Beenconvictedofoperatingamotorvehiclewhileundertheinfluenceofalcohol_Details");
		String Accidentin3Y = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Beeninamotorvehicleaccidentinwhichtheywerefoundtobeatfault");
		String Faultmotorvehicleaccident = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Atfaultmotorvehicleaccident?");
		String FaultmotorvehicleaccidentHowMany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Atfaultmotorvehicleaccident?_Howmany");
		String FaultmotorvehicleaccidentWhen1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Atfaultmotorvehicleaccident?_When1");
		String FaultmotorvehicleaccidentWhen2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Atfaultmotorvehicleaccident?_When2");
		String FaultmotorvehicleaccidentWhen3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Atfaultmotorvehicleaccident?_When3");
		String Speedingticket = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Speedingticket?");
		String Lessthan15milesspeedlimit = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Lessthan15milesoverthespeedlimit?");
		String Lessthan15milesspeedlimitHowmany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Lessthan15milesoverthespeedlimit?_Howmany");
		String Lessthan15milesspeedlimitWhen1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Lessthan15milesoverthespeedlimit?_When1");
		String Lessthan15milesspeedlimitWhen2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Lessthan15milesoverthespeedlimit?_When2");
		String Lessthan15milesspeedlimitWhen3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Lessthan15milesoverthespeedlimit?_When3");
		String Greaterthanorequal15milesspeedlimit = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?");
		String Greaterthanorequal15milesspeedlimitHowmany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_Howmany");
		String Greaterthanorequal15milesspeedlimitWhen1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When1");
		String Greaterthanorequal15milesspeedlimitWhen2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When2");
		String Greaterthanorequal15milesspeedlimitWhen3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Greaterthanorequalto15milesoverthespeedlimit?_When3");
		String Suspendedlicense = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Suspendedlicense?");
		String Suspenedlicenseduetononpayment = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Suspenedlicenseduetononpaymentofchildsupport?");
		String Whenwasthelicensesuspended = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Whenwasthelicensesuspended?");
		String Reasonforsuspension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Reasonforsuspension?");
		String Hasitbeenreinstated = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Hasitbeenreinstated?");
		String Whenreinstated = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Whenreinstated?");
		String Recklessdriving = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Recklessdriving?");
		String Recklessdrivinghowmany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Recklessdriving?_Howmany?");
		String RecklessdrivingWhen1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Recklessdriving?_When1");
		String RecklessdrivingWhen2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Recklessdriving?_When2");
		String RecklessdrivingWhen3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Recklessdriving?_When3");
		String CarelessDriving = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Carelessdriving?");
		String CarelessDrivinghowmany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Carelessdriving?_Howmany?");
		String CarelessDrivingWhen1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Carelessdriving?_When1");
		String CarelessDrivingWhen2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Carelessdriving?_When2");
		String CarelessDrivingWhen3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Carelessdriving?_When3");
		String Movingviolation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Movingviolation?");
		String MovingviolationHowmany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Movingviolation?_Howmany?");
		String MovingviolationWhen1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Movingviolation?_When1");
		String MovingviolationWhen2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Movingviolation?_When2");
		String MovingviolationWhen3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PersonalHistory_Movingviolation?_When3"); 
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
		
		String State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		String AntcptForgnTravelQuestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC1_Anticipateanyforeigntravelinthenext2years");
		String HaveAgmtToBcmArmedforcesQuestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC1_Haveawrittenagreementtobecome,oriscurrentlyamember,oftheArmedForces");
		String ExpectedMemberofPilotQuestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC1_Expecttobecomewithinthenext2years,orbeeninthelast3years,apilot,astudentpilotorcrewmemberofanyaircraft");
		String TakePartinUnderwaterdivingHangglidParaSailing = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC1_Takepartinunderwaterdiving,hanggliding,parasailing");
		String ultralight_soaring_ballooning = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC1_ultralight_soaring_ballooning");
		String motorboat_snowmobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC1_motorboat_snowmobile");
		String PhysicianType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PhysicianType");
		String Firstname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"FirstName");
		String MiddleName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "MidleName");
		String LastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LastName");
		String Suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Suffix");
		String street1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Street1");
		String street2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Street2");
		String City = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"City");
		String state = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"State");
		String Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "pinCode");
		String Telephone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Telephonenumber");
		String MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Month");
		String DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"date");
		String YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Year");
		String TimeFrameLastSeen = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"TimeFrameLastScene");
		String Details = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Details");
		String FacilityName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Office/Facility Name");

		PHCOne.enterPersonalHistoryInformationContOneDetails(State,AntcptForgnTravelQuestn, HaveAgmtToBcmArmedforcesQuestn,
				ExpectedMemberofPilotQuestn, TakePartinUnderwaterdivingHangglidParaSailing,ultralight_soaring_ballooning,
				motorboat_snowmobile,PhysicianType, Firstname, MiddleName, LastName, Suffix, street1, street2, City,
				 state, Zip, Telephone, MM, DD, YYYY, TimeFrameLastSeen, Details, FacilityName);
		
		String ProposedInsuredIS_questn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_Theproposedinsuredis");
		String EmpCurrentOcc = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-CurrentOccupation");
		String EmpDuties = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PHC2_EMP-Duties");
		String EmployerName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-Employer/BusinessName(Ifself-employed,providebusinessname)");
		String EmployerCountry = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-Country");
		String EmployerStree1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-Street1");
		String EmployerStree2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-Street2");
		String EmployerStree3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-Street3");
		String EmployerCity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PHC2_EMP-City");
		String EmployerState = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PHC2_EMP-State");
		String EmployerZip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PHC2_EMP-Zip");
		String EarnedIncmCurrentYear = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-EarnedIncome-CurrentYear");
		String EarnedIncmPriorYear = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-EarnedIncome-PriorYear");
		String UNEarnedIncmCurrentYear = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-UnEarnedIncome-CurrentYear");
		String UNEarnedIncmPriorYear = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_EMP-UnEarnedIncome-PriorYear");
		String EmpNetworth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PHC2_EMP-NetWorth");
		String UnEmpReason = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_UNEMP-UnemployedReason");
		String AnnHouseEarnedIncm = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_UNEMP-AnnualHouseholdEarnedIncome");
		String HouseholdNetworth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_UNEMP-HouseholdNetWorth");
		String AnnHouse_UNEarnedIncm = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_UNEMP-AnnualHouseholdUnearnedIncome");
		String OthercovWorkingspous = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PHC2_OtherCoverageOnWorkingSpouse");
		PHCTwo.enterPersonalHistContTwo_screenDetails(ProposedInsuredIS_questn, EmpCurrentOcc, EmpDuties, EmployerName,
				EmployerCountry, EmployerStree1, EmployerStree2, EmployerStree3, EmployerCity, EmployerState,
				EmployerZip, EarnedIncmCurrentYear, EarnedIncmPriorYear, UNEarnedIncmCurrentYear, UNEarnedIncmPriorYear,
				EmpNetworth, UnEmpReason, AnnHouseEarnedIncm, HouseholdNetworth, AnnHouse_UNEarnedIncm,
				OthercovWorkingspous);
	}

	@When("^User Fills UL Life Product Screen details and click on Next$")
	public void user_Fills_UL_Life_Product_Screen_details_and_click_on_Next() throws Throwable {
		String Frequency = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PUL_Frequency");
		String intialPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PUL_intialPremium");
		String PlannedPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PUL_PlannedPremium");
		String UnsheduledPremium1035 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"PUL_Non-1035unscheduledpremium");
		String WaiverAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PUL_WPAmount");
		String AlternateAdditionalPolicy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_alternate_additional policy");
		String Plan_Product_Alt = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Plan_Product_alternate");
		String Plan_Product_Add = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Plan_Product_additional");
		productUL.enterproductUL(Frequency,intialPremium, PlannedPremium, UnsheduledPremium1035, WaiverAmount);
		productUL.AltorAdd( AlternateAdditionalPolicy, Plan_Product_Alt, Plan_Product_Add);
		
		
		String Alt_Faceamount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PUL_Alt_FaceAmount");
		String ALT_WavierOfPremiumRider = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PUL_Alt_WavierOfPemiumrider");
		String ALT_AutomaticPremiumLoan = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PUL_Alt_AutomaticPremiumLoan_UL");
		String ALT_LoanRate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Alt_LoanRate_UL");
		String ALT_DividentOption_WL = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Alt_DividentOption_UL");
		String Alt_WLPremiumRider = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"WLP_ALT_WaiverOfPremiumRider");
		String ALT_PlannedAmount_UL = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Alt_PlannedAmount_UL");
		String ALT_unsheduledPremium_UL = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Alt_unsheduledpremium_UL");
		String ADD_Faceamount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Add_FaceAmount");
		String ADD_WavierOfPremiumRider = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PUL_Add_WavierOfPemiumrider");
		String ADD_AutomaticPremiumLoan = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PUL_Add_AutomaticPremiumLoan_UL");
		String ADD_LoanRate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Add_LoanRate_UL");
		String ADD_DividentOption_WL = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PUL_Add_DividentOption_UL");
		String ADD_WLPremiumRider = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"WLP_ADD_WaiverOfPremiumRider");
		String ADD_PlannedAmount_UL = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PUL_Ad_PlannedAmount_UL");
		String ADD_unsheduledPremium_UL = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"PUL_Add_unsheduledpremium_UL");
		String Alt_UL_intialpremium = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Alt_UL_intialpremium");
		String Add_UL_intialpremium = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Add_UL_intialpremium");
		
		
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

	@When("^User Fills UL Life Purpose of Insurance Screen details and click on Next$")
	public void user_Fills_UL_Life_Purpose_of_Insurance_Screen_details_and_click_on_Next() throws Throwable {
		String LPOI_Personal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Personal");
		String LPOI_sponserdplan = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Isthispolicybeingpurchasedinconnectionwithanemployer_sponsoredplan?");
		String LPOI_policybecollaterallyassigned = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Willthispolicybecollaterallyassigned?");
		String LPOI_Insurance_Type = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Type");
		String LPOI_nameofAssigne = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_CompleteNameofAssignee:");
		String LPOI_Assignee_Street1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_Street1");
		String LPOI_Assignee_Street2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_Street2");
		String LPOI_Assignee_City = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_City");
		String LPOI_Assignee_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_State");
		String LPOI_Assignee_Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_Zip");
		String LPOI_Assignee_phone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_phone");
		String LPOI_Assignee_Homeworkcell = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_Homeworkmobile");
		String LPOI_Assignee_Extension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Assignee_Extension");
		String LPOI_EconomicIncntvFreeQuestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_HastheProposedInsured(s)and_ortheProposedPolicyOwner(s)beenofferedanyeconomicincentivesuchas'free'");
		String LPOI_EconomicIncntvFreeQuestn_details = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Details:");
		String LPOI_Does_the_Proposed_Insured = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_DoestheProposedInsured(s)and/ortheProposedPolicyOwner(s)haveacurrentagreementorcommitmenttosell");
		String LPOI_Does_the_Proposed_Insured_details = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_commitmenttosell_Details:");
		String LPOI_Is_the_policy_directly_or_indirectly = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Isthepolicydirectlyorindirectlyownedbyacaptiveinsurancecompany");
		String LPOI_Is_the_policy_directly_or_indirectly_details = ReadData.get(HooksTest.scenario.getName(),
				FileName,SheetName, "LPOI_captiveinsurancecompany_Details:");
		String LPOI_Will_the_source_of_any_premium_payments = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPOI_Willthesourceofanypremiumpaymentsbeassetsoforfromcontributionstoacaptiveinsurancecompany?");
		String LPOI_Will_the_source_of_any_premium_payments_details = ReadData.get(HooksTest.scenario.getName(),
				FileName,SheetName, "LPOI_Willthesourceofanypremium_Details:");
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

	@When("^User Fills UL Life Owner and Life Owner cont screen details and click on Next$")
	public void user_Fills_UL_Life_Owner_and_Life_Owner_cont_screen_details_and_click_on_Next() throws Throwable {
		String InsuredonlyOwnerquestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_owneronallpolicies?");
		String Indiviual_Entity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_Indiviual or EntityOWner");
		if(Indiviual_Entity.equalsIgnoreCase("Indiviualowner")&& InsuredonlyOwnerquestn.equalsIgnoreCase("No")){
			String indiviualOwnertype = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_IndividualOwnerType");
			String firstname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_FirstName");
			String middlename = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_MiddleName");
			String lastname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_lastName");
			String suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_Suffix");
			String MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_DOB_MM");
			String DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_DOB_DD");
			String YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_DOB_YYY");
			String Gender = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_Gender");	
			String AddresssameasPI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_ResdentialAdrs_sameas");
			String street1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LOStreet1");
			String street2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_street2");
			String city = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_city");
			String Resd_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_state");
			String Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_zip");
			String Mailingadd = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_MailingAdrs_sameas");
			String Mail_Strt1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_MailingStreet1");
			String Mail_Strt2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_Mailing_street2");
			String Mail_city = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_Mailing_city");
			String Mail_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_Mailing_state");
			String Mail_Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_Mailing_zip");
			String prefphno = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_Phoneno");
			String homeworkmob = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_HomeWorkCell");
			String Extension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_extension");
			String email = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_email");
			String relationship = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_RelationshiptoInsured");
			String ssn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LO_SSN");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
	
			
			//String InsuredonlyOwnerquestn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LCS_owneronallpolicies?");
			//LifeOwner Continuous
				String PICont_USDriversLicense = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_U.S.DriversLicense");
				String PIC_IdentificationNumber = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_IdentificationNumber");
				String PIC_ReasonWhy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_ReaspnWhy");
				String PICType_of_identification = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_TypeOfIdentification");
				String PIC_State_ProvinceofIssue_pass = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_StateProvinceofIssue");
				String PICProposedInsuredCont_Others = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_Other");
				String TypeofCitizenship = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_TypeofCitizenship");
				String Expr_MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LOC_Exp_MM");
				String Expr_DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LOC_Exp_DD");
				String Expr_YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LOC_Exp_YYYY");
				PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
						PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
						TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
			
			
		}
		
		String indiviualOwnertype = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LO_IndividualOwnerType");
		//String InsuredonlyOwnerquestn = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"LCS_owneronallpolicies?");
		if (indiviualOwnertype.equalsIgnoreCase("One individual owner during his/her lifetime and thereafter a contingent owner and thereafter the Insured")&& InsuredonlyOwnerquestn.equalsIgnoreCase("No") && Indiviual_Entity.equalsIgnoreCase("Indiviualowner")) {
			String firstname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_FirstName");
			String middlename = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_MiddleName");
			String lastname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_lastName");
			String suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_Suffix");
			String MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_DOB_MM");
			String DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_DOB_DD");
			String YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_DOB_YYY");
			String Gender = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_Gender");	
			String AddresssameasPI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_ResdentialAdrs_sameas");
			String street1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwnerStreet1");
			String street2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_street2");
			String city = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_city");
			String Resd_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_state");
			String Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_zip");
			String Mailingadd = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_MailingAdrs_sameas");
			String Mail_Strt1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_MailingStreet1");
			String Mail_Strt2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_Mailing_street2");
			String Mail_city = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_Mailing_city");
			String Mail_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_Mailing_state");
			String Mail_Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_Mailing_zip");
			String prefphno = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_Phoneno");
			String homeworkmob = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_HomeWorkCell");
			String Extension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_extension");
			String email = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_email");
			String relationship = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "JointContigentOwner_RelationshiptoInsured");
			String ssn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"JointContigentOwner_SSN");
			//jointcontigentowner continous
			String PICont_USDriversLicense = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_IdentificationNumber");
			String PIC_ReasonWhy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_ReaspnWhy");
			String PICType_of_identification = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_Other");
			String TypeofCitizenship = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PIC_TypeofCitizenship");
			String Expr_MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LOC_Exp_MM");
			String Expr_DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LOC_Exp_MM");
			String Expr_YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LOC_Exp_MM");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//jointcontigentowner continous
			PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}

	}
	
	@When("^User fills EntityOwner and Trust Certification details Screen and click on Next$")
	public void user_fills_EntityOwner_and_Trust_Certification_details_and_click_on_Next() throws Throwable {
		String Entitytype = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_TypeofEntityOwnership");
		String SpecificEntityType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_SpecifyType");
		String EntityName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NameOfEntity_or Trust");
		String ProposedInsuredDirector = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_ProposedInsuredaDirector");
		String EntityMaxfaceamount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_MaxFaceAmount");
		String MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "DateOfTrust_MM");
		String DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"DateOfTrust_DD");
		String YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "DateOfTrust_YYYY");
		String TypeofTrust = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "TypeOfTrust(Yes_revoc/No_Irrevoc");
		String AddresssameasPI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Enity_SameasAddress");
		String street1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_Stree1");
		String street2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_Street2");
		String city = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_City");
		String state = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_State");
		String Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_Zip");
		String Mailingadd = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_MailAdd");
		String Mail_Strt1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_MailingStreet1");
		String Mail_Strt2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_MailingStreet2");
		String Mail_city = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_MailingCity");
		String Mail_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_MailState");
		String Mail_Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_MailZip");
		String SSN_EIN = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_SSn_OR_EIN");
		String SSN_EINnumber = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_SSN_EINNumber");
		String TypeOfCitizenship = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_TypeOfCitizenship_UsEntity(Yes)_Foreign(No)");
		//TrustCertificaiton
		String TrusteeType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Trustee_Type");
		String FirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Trustee_Indiviual/Entity_firstName");
		String MiddleName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Trustee_Indiviual/Entity_MiddleName");
		String LastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Trustee_Indiviual/Entity_LastName");
		String Suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Trustee_Indiviual/Entity_Suffix");
		String email = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Trustee_Indiviual/Entity_Email");
		String trustEntityName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Trustee_EntityName");
		String title = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Trustee_entityTitle");
		
		String Grantortype = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_Type");
		String GrantorFirstname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_Indiviual/Entity_firstName");
		String GrantorMiddlename = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_Indiviual/Entity_MiddleName");
		String GrantorLastname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_Indiviual/Entity_LastName");
		String Grantorsuffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_Indiviual/Entity_Suffix");
		String Grantorcountry = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_Indiviual/Entity_CountyCitizen");
		String mm = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_DOB_MM");
		String dd = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_DOB_DD");
		String yyyy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_DOB_YYYY");
		String ssn = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_INDIV_SSN_ITN");
		String AddressSamePI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_AddressSameAsPI");
		String streetone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_IndivEntity_Stree1");
		String streettwo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_IndivEntity_Stree2");
		String City = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_IndivEntity_City");
		String Grantorstate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_IndivEntity_State");
		String zipcode = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_IndivEntity_Zipcode");
		String GrantorEntityName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Grantor_EntityName");
		String TaxPayerno = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Grantor_TaxpayerId");
		
		String RelationShipBene = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Relationto Bene");
		String RelationshipOtherDtls = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "RelationshipOtherDtls");
		String AuthorizeTrusteee = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"AuthorizeTrusteee");
		String viaticalCompany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "viaticalCompany");
		String RelationGrantor = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "RelationGrantor");
		String SigningTrustee = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"SigningTrustee");
		
		//Apex
		String Signertitle = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_SignerTitle");
		String SolefiicerYesNo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_SoleOfficer_Yes_No");
		String SoleFirstName = ReadData.get(HooksTest.scenario.getName(),  FileName,SheetName, "Entity_Sole_FirstName");
		String SoleLastName = ReadData.get(HooksTest.scenario.getName(),  FileName,SheetName,"Entity_soleLastName");
		String VULBussinesphoneno = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "RelationGrantor");
		String VULphonetype = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"SigningTrustee");
		
		EO.Entityowner(Entitytype, SpecificEntityType, EntityName, ProposedInsuredDirector, EntityMaxfaceamount, MM, DD, YYYY, TypeofTrust);
		EO.Address(AddresssameasPI, street1, street2, city, state, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State, Mail_Zip, Signertitle, SolefiicerYesNo, SoleFirstName, SoleLastName, SSN_EIN, SSN_EINnumber, TypeOfCitizenship,
				VULBussinesphoneno, VULphonetype);
		Trust.trustees_Grantor(TrusteeType, FirstName, MiddleName, LastName, Suffix, email,
				trustEntityName, title, Grantortype, GrantorFirstname, GrantorMiddlename, GrantorLastname, 
				Grantorsuffix, Grantorcountry, mm, dd, yyyy, ssn, AddressSamePI, streetone, streettwo, City, Grantorstate,
				zipcode, GrantorEntityName, TaxPayerno);
		Trust.BeneficiaryInformation(RelationShipBene, RelationshipOtherDtls, AuthorizeTrusteee, viaticalCompany, RelationGrantor, SigningTrustee);
	}

	@When("^User Fills UL Life Beneficiaries and Other Coverage screen details and click on Next$")
	public void user_Fills_UL_Life_Beneficiaries_and_Other_Coverage_screen_details_and_click_on_Next()
			throws Throwable {
		String LB_Distributiontype = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_BusinessSupplement_DistributionType");
		String LB_beneaddition_yesorNo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_Beneficiary_ClickHeretoAdd");
		String LB_Beneficiary_Type = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_Beneficiary_Type");
		String LB_firstname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_FirstName");
		String LB_Middlename = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_M.I.");
		String LB_Lastname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_LastName");
		String LB_suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_Suffix");
		String LB_MAilingadd_yesorNo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_MailingAddresssameasPrimaryInsured?");
		String LB_HomeWorkMobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_HomeWorkMobile");
		String LB_phonenumber = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_PhoneNumber");
		String LB_Extension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_Extension");
		String LB_Month = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_DOB_MM");
		String LB_Date = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_DOB_DD");
		String LB_Year = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_DOB_YYYY");
		String LB_TinType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_TINType");
		String LB_SSNno = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LB_NI_TaxIDNo");
		String LB_RelationShip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_RelationshiptoInsured");
		String LB_Distribution = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_Distribution");
		String LB_IssueStripes = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_NI_Issueperstirpes");
		String LB_WouldyouliketonameaCustodian = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_WouldyouliketonameaCustodian");
		String LB_Custodian_First = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_Custodian_First");
		String LB_Custodian_MI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_Custodian_MI");
		String LB_Custodian_Last = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_Custodian_Last");
		String LB_Custodian_Suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_Custodian_Suffix");
		String LB_Custodian_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LB_Custodian_State");
		String ProductType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_ProductType");
		LifeBene.distribution_Type(LB_Distributiontype);
		LifeBene.beneficiary_addition(ProductType,LB_beneaddition_yesorNo, LB_Beneficiary_Type, LB_firstname, LB_Middlename,
				LB_Lastname, LB_suffix, LB_MAilingadd_yesorNo, LB_HomeWorkMobile, LB_phonenumber, LB_Extension,
				LB_Month, LB_Date, LB_Year, LB_TinType, LB_SSNno, LB_RelationShip, LB_Distribution, LB_IssueStripes);
	
		LifeBene.custodian(LB_WouldyouliketonameaCustodian, LB_Custodian_First, LB_Custodian_MI, LB_Custodian_Last,
				LB_Custodian_Suffix, LB_Custodian_State);
		
		String State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		String LOC_field1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LifeOtherCoverage_textfield1");
		String LOC_field2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LifeOtherCoverage_textfield2");
		String LOC_fieldtext2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LifeOtherCoverage_textfield3");
		String LOC_field3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LifeOtherCoverage_(excludingMassMutual)thatarenotbeingreplaced/changed?");
		String LOC_field4 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LifeOtherCoverage_rannuitycontractinforcewithMassMutualorothercompanies?");
		String NYAppliedWithMassMutual = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYAppliedWithMassMutual");
		String NYinsthatwillbeplacedwithMM= ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYinsthatwillbeplacedwithMM");
		String NYinforcewithMM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYinforcewithMM");
		String NYreplacedchanged = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYreplacedchanged");
		String NYcontractinforcewithMassMutual = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"NYcontractinforcewithMassMutual");
		LOC.othercoverage(State,LOC_field1, LOC_field2, LOC_fieldtext2, LOC_field3, LOC_field4,NYAppliedWithMassMutual,NYinsthatwillbeplacedwithMM ,NYinforcewithMM
				,NYreplacedchanged,NYcontractinforcewithMassMutual);

	}

	@When("^User Fills UL Life Payment Information and Certification screen details and click on Next$")
	public void user_Fills_UL_Life_Payment_Information_and_Certification_screen_details_and_click_on_Next()
			throws Throwable {
		String state = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		String Billing= ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"LPI_BillingType");
		String freq_M = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPI_Frequnecy");
		String Initialpremiumbeingsubmitted = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPI_remium being submitted with this Application?");
		String premiumpayor = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPI_Premium Payor");
		String PremincludeLoanorPremFinancing = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPI_ include a loan or premium financing?");
		String selectPRemium = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_PayInfoSourceOfPremium");
		String selectPRemiumotherdetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"NY_PayInfoSourceOfPremium_otherdetails");

		lpinfo.life_pay_field_entry(state,freq_M, Billing, Initialpremiumbeingsubmitted, premiumpayor, PremincludeLoanorPremFinancing,selectPRemium,selectPRemiumotherdetails);
        String SalesCertification = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "salesCertification");
        
        certify.salesCertification(SalesCertification);
        String Certi_taxpayer_id = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Certification_TaxpayerIdentificationNumber");
		String Certi_backup = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Certification_IamNOTsubjecttobackupwithholding");
		String Certi_us = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Certification_IamaU.S.person");
        certify.TaxPayerIdentification(Certi_taxpayer_id,Certi_backup, Certi_us);

	}

	@When("^User Fills UL HIV consent screen details and click on Next$")
	public void user_Fills_UL_HIV_consent_screen_details_and_click_on_Next() throws Throwable {
		String CI_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		String AZ_KY_personalphysician_RD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AZ_KY_personalphysician_RD");
		String CT_physician_or_health = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CT_HIV");
		String DC_Fl_physician_or_health = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "DC_FL_HIV");
		String IA_Alternate_Myphysician_none = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "IA_HIV");
		String Ks_Ma_MePIandPhysician = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "KS_MA_HIV");
		String NY_physician_or_health = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_HIV");
		String MI_YEsNo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"MI_HIV_YEsNo");
		String MI_authorizeHiv = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"MI_Hiv");
		
		String Fname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_FirstName");
		String Lname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_LastName");
		String Addrs = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_Address");
		String Cty = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_City");
		String ST = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_State");
		String Zpcd = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_Zip");
		String HCprovidername = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_HealthCareProviderName");
		String Alternativesitename = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_AlternativeSite");
		String Dname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Hiv_Designeename");
		String MoPhysician_RD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Mo_HIV");
		String ExaminerName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "HIV_ExaminerName");
		String FacilityName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Hiv_FacilityName");
		
		Consent_HIV.personalPhysician_Yes_No(CI_State, AZ_KY_personalphysician_RD, CT_physician_or_health, DC_Fl_physician_or_health, IA_Alternate_Myphysician_none,
				Ks_Ma_MePIandPhysician, NY_physician_or_health,MoPhysician_RD, Fname, Lname, Addrs, Cty, ST, Zpcd, HCprovidername, Alternativesitename, MI_YEsNo, MI_authorizeHiv,
				Dname,ExaminerName,FacilityName);
	    

	}

	@When("^User Fills UL Life Producer Statement screen details and click on Next$")
	public void user_Fills_UL_Life_Producer_Statement_screen_details_and_click_on_Next() throws Throwable {
		String RiskClassification = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPS_RiskClassificationPresentedtoClient");
		String AC_Offer = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPS_AC_Offer");
		String MultipolicyCase = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_Isthispartofamulti-policycase(i.e.familymembers,businesspartners,etc.)?");
		String MultipolicyCasePolicyNumbers = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_MultiPolicyProvidedassociatedPolicyNumber(s)");
		String Otherapplicationssubmitted = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_Arethereanyotherapplications(e.g.Disability,LongTermCare)beingsubmittedconcurrentlywiththisApplicationorwithinthelasttwomonths?");
		String OtherapplicationssubmittedPolicyNumbers = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_OtherapplicationssubmittedProvideassociatedPolicyNumber(s)");
		String Dividends = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_WilldividendsfromanexistingMassMutualpolicybeusedtopayallorpartoftheinitialpremiumonthispolicy?");
		String ServiceRequest = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_WouldyouliketocompleteaServiceRequestform?");
		String PurchaseSinglePremiumImmediateAnnuity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_IstheLifeInsurancebeingappliedforinconjunctionwiththepurchaseofaSinglePremiumImmediateAnnuity?");
		String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers = ReadData.get(HooksTest.scenario.getName(),
				FileName,SheetName, "LIfeProducerStatement_PurchaseSinglePremiumProvideassociatedPolicyNumber(s)");
		String DiscussedArrangingFinancingForPurchase = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_AreyouawareofwhethertheProposedOwnerorProposedInsuredhasarranged,ordiscussedarranging,anyfinancingforthepurchaseofthispolicy?");
		String KnowledgeReasontoBelieve = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_KnowledgeReasontoBelieve");
		String KnowledgeReasontoBelieveDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_Details");
		String AC_HearingImpairment = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AC_HearingImpairment");
		String AC_OtherPreferredLanguage = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AC_OtherPreferredLanguage");
		
		String UnderstandEnglish = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_DideverypersonsigningthisApplicationunderstandandanswereachquestioninEnglish?");
		String IndicateLanguage = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_IndicateLanguage");
		String MarketType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LIfeProducerStatement_MarketType");
		String Prospectusandany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerRole");
		String Prospectus_MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Email");
		String Prospectus_DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LifeProducerCompensation_FloridLIC");
		String Prospectus_YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_1stYearCommission");
		
		producerStatement.enterProducerStatement(RiskClassification,AC_Offer, MultipolicyCase, MultipolicyCasePolicyNumbers,
				Otherapplicationssubmitted, OtherapplicationssubmittedPolicyNumbers, Dividends, ServiceRequest,
				PurchaseSinglePremiumImmediateAnnuity, PurchaseSinglePremiumImmediateAnnuityPolicyNumbers,
				DiscussedArrangingFinancingForPurchase, KnowledgeReasontoBelieve, KnowledgeReasontoBelieveDetails,
				UnderstandEnglish,AC_HearingImpairment,AC_OtherPreferredLanguage, IndicateLanguage, MarketType,Prospectusandany, Prospectus_MM, Prospectus_DD, Prospectus_YYYY);
		

	}

	@When("^User Fills UL Life Producer Compensation screen details and click on Next$")
	public void user_Fills_UL_Life_Producer_Compensation_screen_details_and_click_on_Next() throws Throwable {
		String ProducerRole = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerRole");
		String ProducerEmail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Email");
		String LicenceID = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LifeProducerCompensation_FloridLIC");
		String Firstyearcommission = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_1stYearCommission");
		String RenewalCommision = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_RenewalCommission");
		String AdditionalProducer = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_Arethereadditionalproducers?");
		String ContactOneFirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1FirstName");
		String ContactOneLastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1LastName");
		String ContactOnePhone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1Phone");
		String ContactOneHomeWorkMobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_Contact1HomeWorkMobile");
		String ContactOneExtension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_Contact1WorkExtension");
		String ContactOneEmail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1Email");
		String ContactTwoFirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2FirstName");
		String ContactTwoLastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2LastName");
		String ContactTwoPhone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2Phone");
		String ContactTwoHomeWorkMobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_Contact2HomeWorkMobile");
		String ContactTwoExtension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_Contact2WorkExtension");
		String ContactTwoEmail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2Email");

		String Add_ProducerRole = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Add_ProducerRole");
		String NumberOfProducer = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Number_OF_producer");
		
		String ProducerID = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerID");
		String AgencyId = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_AgencyId");
		String ProducerID2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerID2");
		String AgencyId2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_AgencyId2");
		String ProducerID3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerID3");
		String AgencyId3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_AgencyId3");
		
		String fst_Year_Commission1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_%_1st_Year_Commission1");
		String Renewal_Commission1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_%_Renewal_Commission1");
		String fst_Year_Commission2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_%_1st_Year_Commission2");
		String Renewal_Commission2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_%_Renewal_Commission2");
		String fst_Year_Commission3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_%_1st_Year_Commission3");
		String Renewal_Commission3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"LPC_%_Renewal_Commission3");
		String firm1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"firm1");
		String firm2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"firm2");
		String firm3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"firm3");
		producerCompensation.enterProducerCompensation(ProducerRole, ProducerEmail, LicenceID, Firstyearcommission,
				RenewalCommision, AdditionalProducer);
		producerCompensation.AdditionalProducer(AdditionalProducer, NumberOfProducer, Add_ProducerRole, 
				ProducerID, AgencyId,firm1, ProducerID2, AgencyId2,firm2, ProducerID3, AgencyId3,firm3, 
				fst_Year_Commission1, Renewal_Commission1, fst_Year_Commission2, Renewal_Commission2, fst_Year_Commission3, Renewal_Commission3);
		producerCompensation.ContactDetails(ContactOneFirstName, ContactOneLastName, ContactOnePhone,
				ContactOneHomeWorkMobile, ContactOneExtension, ContactOneEmail, ContactTwoFirstName, ContactTwoLastName,
				ContactTwoPhone, ContactTwoHomeWorkMobile, ContactTwoExtension, ContactTwoEmail);
		    String IntendonConvertingpolicy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "IntendonConvertingpolicy");
		    String Anticipatedtimecoverage = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_coverageisneeded");
	        String Primarypurposeof_ins = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_PrimaryPurposeOfIns");
	        String InsOptionsAbove = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_InsOptionsAbove");        
	        String Dependent = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_dependents");
	        String DependentDetails = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_dependentDetails");
	        String OtherText = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_dependentOtherDetails");
	        String state = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");        
	        NYlps.productAndPremiumPayorInfo(state,IntendonConvertingpolicy, Anticipatedtimecoverage, Primarypurposeof_ins, InsOptionsAbove, Dependent, DependentDetails,
	                OtherText);
	     // Alternate and additional for ny Life Products suitability
		    String alt_intend_on_converting = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_alt_intend_on_converting");
	        String alt_Anticipated_coverageNeeded = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_alt_Anticipated_coverageNeeded");
	        String alt_PorposeofInsure = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_alt_PorposeofInsure");        
	        String Alt_Ins_option_above_RD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_Ins_option_above_RD");
	        String add_Anticipated_coverageNeeded = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_add_Anticipated_coverageNeeded");
	        String add_PorposeofInsure = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_add_PorposeofInsure");     
	        String Add_Ins_option_above_RD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_Ins_option_above_RD");      
	        NYlps.ALternate_and_additional(state,alt_intend_on_converting, alt_Anticipated_coverageNeeded, alt_PorposeofInsure, Alt_Ins_option_above_RD,
	        		add_Anticipated_coverageNeeded, add_PorposeofInsure, Add_Ins_option_above_RD);
	        
	        String sourceofPremium = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilitysourceofPremium");
	        String TaxPenality = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_TaxPenality");
	        String hardshipwithdrawal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_hardshipwithdrawal");        
	        String surrenderCharge = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_surrenderCharge");
	        String surrenderChargeDetail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_surrenderChargeDetail");
	        String Exchangeamount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_Exchangeamount");
	        String exchangSurenderCharge = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_exchangSurenderCharge");        
	        String surrenderChargeAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_surrenderChargeAmount");
	        String AnnuitizationSurenderCharge = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_AnnuitizationSurenderCharge");
	        String AnnuitizationSurenderChargeAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.financialinfo(state, sourceofPremium, TaxPenality, hardshipwithdrawal, surrenderCharge, surrenderChargeDetail, Exchangeamount,
	                exchangSurenderCharge, surrenderChargeAmount, AnnuitizationSurenderCharge, AnnuitizationSurenderChargeAmount);
	        String ALT_sourceofPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitabilitysourceofPremium");
	        String Alt_TaxPenality = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_TaxPenality");
	        String Alt_hardshipwithdrawal = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_hardshipwithdrawal");        
	        String Alt_surrenderCharge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_surrenderCharge");
	        String Alt_surrenderChargeDetail = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_surrenderChargeDetail");
	        String Alt_Exchangeamount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_Exchangeamount");
	        String Alt_exchangSurenderCharge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_exchangSurenderCharge");        
	        String Alt_surrenderChargeAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_surrenderChargeAmount");
	        String Alt_AnnuitizationSurenderCharge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_AnnuitizationSurenderCharge");
	        String Alt_AnnuitizationSurenderChargeAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Alt_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.NY_Alt_financialinfo(state,ALT_sourceofPremium, Alt_TaxPenality, Alt_hardshipwithdrawal, Alt_surrenderCharge, Alt_surrenderChargeDetail, Alt_Exchangeamount, Alt_exchangSurenderCharge, Alt_surrenderChargeAmount, Alt_AnnuitizationSurenderCharge, Alt_AnnuitizationSurenderChargeAmount);
	        
	        String ADD_sourceofPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitabilitysourceofPremium");
	        String ADD_TaxPenality = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_TaxPenality");
	        String Add_hardshipwithdrawal = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_hardshipwithdrawal");        
	        String Add_surrenderCharge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_surrenderCharge");
	        String AdD_surrenderChargeDetail = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_surrenderChargeDetail");
	        String Add_Exchangeamount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_Exchangeamount");
	        String Add_exchangSurenderCharge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_exchangSurenderCharge");        
	        String Add_surrenderChargeAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_surrenderChargeAmount");
	        String Add_AnnuitizationSurenderCharge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_AnnuitizationSurenderCharge");
	        String Add_AnnuitizationSurenderChargeAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_Add_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.NY_Add_financialinfo(state,ADD_sourceofPremium, ADD_TaxPenality, Add_hardshipwithdrawal, Add_surrenderCharge, AdD_surrenderChargeDetail, Add_Exchangeamount,
	        		Add_exchangSurenderCharge, Add_surrenderChargeAmount, Add_AnnuitizationSurenderCharge, Add_AnnuitizationSurenderChargeAmount);
	        
	        
	        String securitiess = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_securitiess");
	        String Annuitiess = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_Annuitiess");
	        String CashValues = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_CashValues");        
	        String AlternativeInvestmentss = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_AlternativeInvestmentss");
	        String FinancialObject = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitability_FinancialObject");
	        
	        NYlps.financialExperience(state, securitiess, Annuitiess, CashValues, AlternativeInvestmentss, FinancialObject);
		
	        
	        NYLifeproductsuitabilityContinues NYPSC=new NYLifeproductsuitabilityContinues();
	        String T20million = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_T20million");
	        String Proposedannualpremium = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_Proposedannualpremium");
	        String Faceamount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_FaceAmount");        
	        String ReplaceByPolicy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_ReplaceByPolicy");
	        String AnnualPrem_Cost = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_AnnualPrem_Cost");
	        String Totalfaceamount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_Totalfaceamount");        
	        String TotalannualIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_TotalannualIncome");
	        String RiskTolerance = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_Risktoleranceaboutpremiums");
	        String RiskToleranceTwo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilityContinus_Risktoleranceaboutdeathbenefit");
	        String UnsheduledALIR = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_ProductsSuitabilityUnsheduledALIR");        
	        String amountofUnSheduled = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_ProductsSuitabilityContinus_amountofUnSheduled");
	        String Exchange1035_RD = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_ProductsSuitabilityContinus_Exchange1035_RD");
	        String exchange1035Amount = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_ProductsSuitabilityContinus_exchange1035Amount");
            String LTCRiskTolerance = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_ProductsSuitabilityContinus_LTCRiskTolerance");
	        
	        NYPSC.suitabilitycontinues(state, T20million, Proposedannualpremium, Faceamount,UnsheduledALIR,
	    			amountofUnSheduled,Exchange1035_RD,exchange1035Amount, ReplaceByPolicy, AnnualPrem_Cost, Totalfaceamount,
	                TotalannualIncome, RiskTolerance,RiskToleranceTwo,LTCRiskTolerance);
	        
	        
	        String Alt_propsedAnnualPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Alt_propsedAnnualPremium");
	        String Alt_faceamount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Alt_faceamount");
	        String Alt_ReplacedByPolicy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Alt_ReplacedByPolicy");        
	        String Alt_TotalFaceAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Alt_TotalFaceAmount");
	        String Alt_TotalAnnualPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Alt_TotalAnnualPremium");
	        String Alt_AnnuaLPremiumCost = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Alt_AnnuaLPremiumCost");              
	        String Alt_UnsheduledALIR = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_LPSC_Alt_UnsheduledALIR");        
	        String Alt_amountofUnSheduled = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_LPSC_Alt_amountofUnSheduled");
	        String Alt_Exchange1035_RD = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_LPSC_Alt_Exchange1035_RD");
	        String Alt_exchange1035Amount = ReadData.get(HooksTest.scenario.getName(),FileName,FileName, "NY_LPSC_Alt_exchange1035Amount");
	        
	        
	        String Add_propsedAnnualPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_propsedAnnualPremium");
	        String Add_faceamount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_faceamount");
	        String Add_UnsheduledALIR = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_UnsheduledALIR");        
	        String Add_amountofUnSheduled = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_amountofUnSheduled");
	        String Add_Exchange1035_RD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_Exchange1035_RD");
	        String Add_exchange1035Amount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_exchange1035Amount");        
	        
	        String Add_ReplacedByPolicy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_ReplacedByPolicy");
	        String Add_Totalfaceamount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_TotalFaceAmount");
	        String Add_totalannualPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_TotalAnnualPremium");
	        String Add_annuaLpremiumCost = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_AnnuaLPremiumCost");
	        //For NY and Alt and Additional Product
	        NYPSC.suitabiltycont_coverage_costinfo(Alt_propsedAnnualPremium, Alt_faceamount, Alt_UnsheduledALIR,
	    			 Alt_amountofUnSheduled, Alt_Exchange1035_RD, Alt_exchange1035Amount, Alt_ReplacedByPolicy, Alt_TotalFaceAmount, Alt_TotalAnnualPremium, Alt_AnnuaLPremiumCost,
	        		Add_propsedAnnualPremium, Add_faceamount, Add_UnsheduledALIR, Add_amountofUnSheduled, Add_Exchange1035_RD, Add_exchange1035Amount,Add_ReplacedByPolicy, Add_Totalfaceamount, Add_totalannualPremium, Add_annuaLpremiumCost);
	        
	        //For NY Risk tollerance for both alt and additional
	        String ALt_RiskTolerance = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_ALt_RiskTolerance");
	        String Alt_RiskToleranceAboutDeath = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Alt_RiskToleranceAboutDeath");
	        String Add_RiskTolerance = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_RiskTolerance");
	        String Add_RiskToleranceAboutDeath = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_LPSC_Add_RiskToleranceAboutDeath");
	        NYPSC.RiskTolerance_Alt_Add(state,ALt_RiskTolerance, Alt_RiskToleranceAboutDeath, Add_RiskTolerance, Add_RiskToleranceAboutDeath);
	        NGE.nonFuaranteeedelement(state);    
	        String txtareaone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilitySummary_Textareaone");
	        String txtareaTwo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilitySummary_TextareaTwo");
	        String txtareaThree = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NY_ProductsSuitabilitySummary_TextareaThree");
	        String Alt_TextAreaone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_PSS_Alt_TextAreaone");
	        String Alt_Textareatwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_PSS_Alt_Textareatwo");
	        String Alt_TextAreathree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_PSS_Alt_TextAreathree");
	        String Add_TextAreaone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_PSS_Add_TextAreaone");
	        String Add_Textareatwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_PSS_Add_Textareatwo");
	        String Add_Textareathree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NY_PSS_Add_Textareathree");
	        NGE.productsuitability(state,txtareaone, txtareaTwo, txtareaThree, Alt_TextAreaone,Alt_Textareatwo,Alt_TextAreathree,
	    			 Add_TextAreaone, Add_Textareatwo,Add_Textareathree);
	

	}

	@When("^User Selects Additional Forms details and click on Next$")
	public void user_Selects_Additional_Forms_details_and_click_on_Next() throws Throwable {
		String preferedLanguage = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PI_PrefferedLang");
		String languages = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AdditionalForms_Foreign_Language_Language");
		String Others = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AdditionalForms_Foreign_Language_Language_Other");
		String Translator = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AdditionalForms_Foreign_Language_Language_Translator_is_a_or_an");
		String AgentFirstname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_GeneralAgent_FirstName");
		String Agent_Midlename = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_GeneralAgent_MI");
		String AgentLastname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_GeneralAgent_LastName");
		String Agent_suffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_GeneralAgent_Sufix");
		String ProfessionalFirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AF_Professional_FirstName");
		String ProfessionalMidleName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_Professional_MI");
		String ProfessionalSuffix = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_Professional_Sufix");
		String ProfessionalLastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AF_Professional_LastName");
		String ProfessionalTranslationFirm = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AF_Professional_TranslationFirm");
		String ProfessionalStreet_1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AF_ProfessionalStreet_1");
		String ProfessionalStreet_2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,
				"AF_ProfessionalStreet_2");
		String Professional_City = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_Professional_City");
		String Professional_State = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_Professional_State");
		String Professional_Zip = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "AF_Professional_Zip");
		Addforms.enterAdditionalFormsDetail(preferedLanguage, languages, Others, Translator, AgentFirstname,
				Agent_Midlename, AgentLastname, Agent_suffix, ProfessionalFirstName, ProfessionalMidleName,
				ProfessionalLastName, ProfessionalSuffix, ProfessionalTranslationFirm, ProfessionalStreet_1,
				ProfessionalStreet_2, Professional_City, Professional_State, Professional_Zip);

	}

	@When("^User attaches the required docs in the Attachments Screen and click on Next$")
	public void user_attaches_the_required_docs_in_the_Attachments_Screen_and_click_on_Next() throws Throwable {
		
		String Policytype = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Policytype");
        String PlantrustType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlantrustType");
        String pleasespecify = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "pleasespecify");
        String Howlongplanbeen = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Howlongplanbeen");
        String Planname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Planname");
        String trustee = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "trustee");
        String street1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifed_street1");
        String street2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifed_street2");
        String city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifed_city");
        String qualifedstate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifedstate");
        String zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifiedzip");
        String MM = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifed_MM");
        String DD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifed_DD");
        String YYYY = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "qualifed_YYYY");
		

        String Qualified_PlanTrustSponsorEIN = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Qualified_PlanTrustSponsorEIN");
        String Qualified_TotalnoEmployee = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Qualified_TotalnoEmployee");
        String Qualified_NoofEmployecoverdPlan = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Qualified_NoofEmployecoverdPlan");
        String Qualified_ExplainBasisofEmployee = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Qualified_ExplainBasisofEmployee");
		
        String PlanTrustSponsorEInumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Qualified_PlanTrustSponsorEInumber");
		QP.PolicyTrust_Plantrust(Policytype, PlantrustType,pleasespecify, Howlongplanbeen, Planname, trustee, street1, street2,
				city, qualifedstate, zip, MM, DD, YYYY,PlanTrustSponsorEInumber, Qualified_PlanTrustSponsorEIN, Qualified_TotalnoEmployee, Qualified_NoofEmployecoverdPlan, Qualified_ExplainBasisofEmployee);
		
		String fullnameEmploye = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "fullnameEmploye");
        String plansponsor_street1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "plansponsor_street1");
        String plansponsor_street2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "plansponsor_street2");
        String plansponsor_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "plansponsor_city");
        String plansponsor_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "plansponsor_state");
        String plansponsor_zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "plansponsor_zip");
        String TotalnoEmployee = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TotalnoEmployee");
        String NoofEmployecoverdPlan = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NoofEmployecoverdPlan");
        String ein = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ein");
        String Employer_sponsor_EINNumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Employer_sponsor_EINNumber");
        String PlanSponsore_Authorized_fullname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlanSponsore_Authorized_fullname");
        String PlanSponsor_Authorized_lastname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlanSponsor_Authorized_lastname");
      
		QP.EmployerPlanSponsor(fullnameEmploye, plansponsor_street1, plansponsor_street2, plansponsor_city, plansponsor_state, plansponsor_zip, Employer_sponsor_EINNumber,PlanSponsore_Authorized_fullname, PlanSponsor_Authorized_lastname);
		
		String ThirdParty_fullname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ThirdParty_fullname");
        String ThirdParty_street1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ThirdParty_street1");
        String ThirdParty_street2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ThirdParty_street2");
        String ThirdParty_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ThirdParty_city");
        String ThirdParty_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ThirdParty_state");
        String ThirdParty_zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ThirdParty_zip");
        String Thirdparty_preferredphone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Thirdparty_preferredphone");
        String Thirdparty_phonetype = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Thirdparty_phonetype");
        String Thirdparty_email = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Thirdparty_email");
		QP.ThirdPartyAdministrationinfo(ThirdParty_fullname, ThirdParty_street1, ThirdParty_street2, ThirdParty_city, ThirdParty_state, ThirdParty_zip, Thirdparty_preferredphone,
				Thirdparty_phonetype, Thirdparty_email);
		
		String Whatlimitofamount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PurposeOFLifeINS");
        String ApproxValueAssets = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ApproximateValue");
        String annualpremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "AnnualPremium");
        String EmployerContribution = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "EmployerContribution");
        String FundingMethod = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "DefinedBenefitPlans");
        String LimitOFDeathBenefit = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "LimitsOFDeathBenefit");
        String Totalamountaggreemnt = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TotalAmountAgrrement");
        String yearone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "YearONe");
        String yeartwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "YearTwo");
        String SelectAllType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "SelectAllType");
        String ParticipantLive = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ParticipantLive");
        String Pleasexpalin = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Participant_PleaseExpalain");
        String FundedpleaseSpecify = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "FundedpleaseSpecify");
       
        String Self_DDC_IsReducedPremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Self_DDC_IsReducedPremium");
        String Self_DDC_approxvalue = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Self_DDC_approxvalue");
		QP.Self_DDCPlanInfo(Whatlimitofamount, ApproxValueAssets, annualpremium, EmployerContribution, FundingMethod, LimitOFDeathBenefit, Totalamountaggreemnt, yearone, yeartwo,
				SelectAllType, ParticipantLive, Pleasexpalin, FundedpleaseSpecify,Self_DDC_IsReducedPremium,Self_DDC_approxvalue);
		
		
		
		String state = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		String ProductType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "CI_ProductType");
		attach.attachDocuments(state,ProductType);
		
		/*String state = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_State");
		attach.attachDocuments(state);*/

	}

	@Then("^Lock the Policy and do Wet or E sign as Required$")
	public void lock_the_Policy_and_do_Wet_or_E_sign_as_Required() throws Throwable {
		String ProductType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_ProductType");
		int policyrow = row + 2;
		lock.LockScreen(policyrow,ProductType);

		String SignType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "SignatureMethod");
		String InsIDproof = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Esign_InsuredIdType");
		String InsIdNum = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Esign_InsuredIdNumber");
		String OwnerInsIDproof = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "OwnerInsIDproof");
		String OwnerInsIdNum = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "OwnerInsIdNum");
		String proposedInsuredCity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "proposedInsuredCity");
		String proposedinsuredstate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "proposedinsuredstate");
		
		String WetsignType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "WetsignType");
		String InsMM = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InsMM");
		String InsDD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InsDD");
		String InsYYYY = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InsYYYY");

		String PrdMM = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PrdMM");
		String PrdDD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PrdDD");
		String PrdYYYY = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PrdYYYY");
		String OwnerMM = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "OwnerMM");
		
		String PlanSponsorMM = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlanSponsorMM	");
		String PlanSponsorDD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlanSponsorDD");
		String PlanSponsorYYYY = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlanSponsorYYYY");
		

		String OwnerDD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "OwnerDD");
		String OwnerYYYY = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "OwnerYYYY");
		
		lock.signature(SignType, InsIDproof, InsIdNum,policyrow,ProductType, OwnerInsIDproof, OwnerInsIdNum,WetsignType, InsMM, InsDD,InsYYYY, PrdMM,PrdDD, PrdYYYY,OwnerMM, OwnerDD, OwnerYYYY, proposedInsuredCity, proposedinsuredstate,
				PlanSponsorMM,PlanSponsorDD,PlanSponsorYYYY);

	}

}
