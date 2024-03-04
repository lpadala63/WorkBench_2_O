package stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Test;
import org.testng.SkipException;



import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclass.ALt_Add_Both_Products;
import pageclass.AdditionalForms;
import pageclass.AllocationProgram;
import pageclass.AllocationprogramContinous;
import pageclass.Associatedpersons;
import pageclass.Attachments;
import pageclass.CaseInfo;
import pageclass.Certification;
import pageclass.CorpResolution;
import pageclass.EntityOwner;
import pageclass.HIVConsent;
import pageclass.InvesterAccountInfo_one;
import pageclass.InvestorAccountInfo_Continous;
import pageclass.LifeBeneficiaries;
import pageclass.LifeCaseSetup;
import pageclass.LifeOtherCoverage;
import pageclass.LifeOwner;
import pageclass.LifePaymentInfo;
import pageclass.LifeProducerCompensation;
import pageclass.LifeProducerStatement;
import pageclass.LifepurposeofInsurance;
import pageclass.LockAndUnlock;
import pageclass.MMLTransaction;
import pageclass.NYLifeproductsuitabilityContinues;
import pageclass.NY_VL_Supplement;
import pageclass.NY__NonGuaranteedElement;
import pageclass.NewYorkRegSixty;
import pageclass.NewYork_LifeProductsSuitability;
import pageclass.PersonalHistory;
import pageclass.PersonalHistoryContOne;
import pageclass.PersonalHistoryContTwo;
import pageclass.PremiumAllocation;
import pageclass.ProductUL;
import pageclass.ProposedInsured;
import pageclass.ProposedInsuredCont;
import pageclass.QualifiedPlan;
import pageclass.TrustCertification;
import pageclass.TrustedContact;
import pageclass.VULproduct;
import pageclass.Workbench_LaunchEzApp;
import pageclass.partnershipLLC;
import utilities.GetDataFromExcel;
import utilities.RecoverTestItems;



public class Apex {
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
	VULproduct VUL=new VULproduct();
	String FileName= testPropertyFileRead.getThePropertyValue("ExcelFileName");
	PremiumAllocation PreAllcoation=new PremiumAllocation();
	AllocationProgram ALocationscree1=new AllocationProgram();
	AllocationprogramContinous AllocationprogramContinous = new AllocationprogramContinous();
	String SheetName= testPropertyFileRead.getThePropertyValue("Apex");
	RecoverTestItems recoverTestItems = new RecoverTestItems();
	@Test
	@Given("^Launch Fieldnet Dev application to Enter UserID and Password click Next (\\d+)$")
	public void launch_Fieldnet_Dev_application_to_Enter_UserID_and_Password_click_Next(int arg1) {
		//recoverTestItems.TestSelfHealmethod();
		row = arg1;
		workbenchLaunchEzApp.enterUserIDClickNext();
		workbenchLaunchEzApp.enterPasswordClickVerify();
		workbenchLaunchEzApp.clickOnFieldnetDev();
		//throw new SkipException("testing");
		
	}

	@Given("^click SubmitNewBusiness Menu and Enter ProducerID and click search$")
	public void click_SubmitNewBusiness_Menu_and_Enter_ProducerID_and_click_search() throws Throwable {
		String producerID = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ProducerID");
		workbenchLaunchEzApp.enterProducerNumberClickSearch(producerID);
	}

	@Given("^click on Plus icon to select Environment and click continue$")
	public void click_on_Plus_icon_to_select_Environment_and_click_continue() throws Throwable {
		String Environment = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Environment");
		workbenchLaunchEzApp.clickonSubmitNewBusinessWB(Environment);
	
	}

	@When("^EzApp is launched and user enters VUL Insured details state and UL product$")
	public void ezapp_is_launched_and_user_enters_VUL_Insured_details_state_and_UL_product() throws Throwable {
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

	@When("^User Fills VUL LifeCase setup screen and NewYorkRegsixty when state is NY and click on Next$")
	public void user_Fills_VUL_LifeCase_setup_screen_and_NewYorkRegsixty_when_state_is_NY_and_click_on_Next()
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

	@When("^User Fills VUL Primary Insured and Primary Insured Cont screen details and click on Next$")
	public void user_Fills_VUL_Primary_Insured_and_Primary_Insured_Cont_screen_details_and_click_on_Next()
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

	@When("^User Fills All VUL Personal History Information screen details and click on Next$")
	public void user_Fills_All_VUL_Personal_History_Information_screen_details_and_click_on_Next() throws Throwable {
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

	@When("^User Fills VUL Life Product Screen details and click on Next$")
	public void user_Fills_VUL_Life_Product_Screen_details_and_click_on_Next() throws Throwable {
		String Frequency = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "VUL_Frequency");
		String intialpremium = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "VUL_intialpremium");
		String PlannedPremiumamount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "VUL_PlannedPremium");
		String UnsheduledPremium1035 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"VUL_Non-1035unscheduledpremium");
		String DeathBenefitOption_DD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "VUL_DeathBenefitOption");
		String DefinitionOfLifeInsurance = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"DefinitionOfLifeInsurance");
		
		
		String SpecificPremiumRider = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_SpecifedPRemiumRider");
		String MonthlyChargeRider = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_MonthlyCharges");
		String DisabilityRdier = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_DiBenefitRider");
		String otherRider = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_OtherRider");
		String SpecificPremiumRiderAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_SpecifedPRemiumRiderAmount");
		String DiBenefitRiderAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_DiBenefitRider_Amount");
		String RiderAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_RiderAmount");
		String RiderName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"VUL_Ridername");
	
		
		String AlternateAdditionalPolicy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_alternate_additional policy");
		String Plan_Product_Alt = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Plan_Product_alternate");
		String Plan_Product_Add = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PUL_Plan_Product_additional");
		
		VUL.enterproductUL(Frequency,intialpremium, PlannedPremiumamount, UnsheduledPremium1035, DeathBenefitOption_DD, DefinitionOfLifeInsurance);
		VUL.VulOptionalRiders(SpecificPremiumRider, MonthlyChargeRider, DisabilityRdier, otherRider, SpecificPremiumRiderAmount, DiBenefitRiderAmount, RiderAmount, RiderName);
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

	@When("^User Fills VUL Life Purpose of Insurance Screen details and click on Next$")
	public void user_Fills_VUL_Life_Purpose_of_Insurance_Screen_details_and_click_on_Next() throws Throwable {
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

	@When("^User Fills VUL Life Owner and Life Owner cont screen details and click on Next$")
	public void user_Fills_VUL_Life_Owner_and_Life_Owner_cont_screen_details_and_click_on_Next() throws Throwable {
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

	@When("^User Fills EntityOwner and Trust Certification details Screen and click Next$")
	public void user_Fills_EntityOwner_and_Trust_Certification_details_Screen_and_click_Next() throws Throwable {
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
		
		String Signertitle = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_SignerTitle");
		String SolefiicerYesNo = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_SoleOfficer_Yes_No");
		String SoleFirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Entity_Sole_FirstName");
		String SoleLastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Entity_soleLastName");
		//Apex
		String VULBussinesphoneno = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "VUL_BusinessPhone");
		String VULphonetype = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"VUL_Home_Work_Mobile");
		
		EO.Entityowner(Entitytype, SpecificEntityType, EntityName, ProposedInsuredDirector, EntityMaxfaceamount, MM, DD, YYYY, TypeofTrust);
		EO.Address(AddresssameasPI, street1, street2, city, state, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State, Mail_Zip, Signertitle, SolefiicerYesNo, SoleFirstName, SoleLastName, SSN_EIN, SSN_EINnumber, TypeOfCitizenship,
				VULBussinesphoneno, VULphonetype);
		
		CorpResolution CR=new CorpResolution();
		String Firstname = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"soleFirstname");
		String lastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "solelaststname");
		String soleSignertitle = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "solerTitle");
		String CorpState = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"CorpState");
		//Apex
		String CorpFirstname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "CorpFirstname");
		String Corplastname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"Corplastname");
		String Corpseal = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"Corpseal");
		CR.Corpresolution(Firstname, lastName, soleSignertitle, CorpState, CorpFirstname, Corplastname, Corpseal);
		
		Trust.trustees_Grantor(TrusteeType, FirstName, MiddleName, LastName, Suffix, email,
				trustEntityName, title, Grantortype, GrantorFirstname, GrantorMiddlename, GrantorLastname, 
				Grantorsuffix, Grantorcountry, mm, dd, yyyy, ssn, AddressSamePI, streetone, streettwo, City, Grantorstate,
				zipcode, GrantorEntityName, TaxPayerno);
		Trust.BeneficiaryInformation(RelationShipBene, RelationshipOtherDtls, AuthorizeTrusteee, viaticalCompany, RelationGrantor, SigningTrustee);
	}

	@When("^User Fills VUL Life Beneficiaries and Other Coverage screen details and click on Next$")
	public void user_Fills_VUL_Life_Beneficiaries_and_Other_Coverage_screen_details_and_click_on_Next()
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
		String LOC_fieldtext2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LifeOtherCoverage_textfield3");
		String LOC_field3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LifeOtherCoverage_(excludingMassMutual)thatarenotbeingreplaced/changed?");
		String LOC_field4 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LifeOtherCoverage_rannuitycontractinforcewithMassMutualorothercompanies?");
		String NYAppliedWithMassMutual = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYAppliedWithMassMutual");
		String NYinsthatwillbeplacedwithMM= ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYinsthatwillbeplacedwithMM");
		String NYinforcewithMM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYinforcewithMM");
		String NYreplacedchanged = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "NYreplacedchanged");
		String NYcontractinforcewithMassMutual = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName,"NYcontractinforcewithMassMutual");
		
		LOC.othercoverage(State,LOC_field1, LOC_field2, LOC_fieldtext2, LOC_field3, LOC_field4,NYAppliedWithMassMutual,NYinsthatwillbeplacedwithMM ,NYinforcewithMM
				,NYreplacedchanged,NYcontractinforcewithMassMutual);
		
		
	}

	@When("^User Fills VUL Life Payment Information and Certification screen details and click on Next$")
	public void user_Fills_VUL_Life_Payment_Information_and_Certification_screen_details_and_click_on_Next()
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

	@When("^User Fills VUL HIV consent screen details and click on Next$")
	public void user_Fills_VUL_HIV_consent_screen_details_and_click_on_Next() throws Throwable {
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

	@When("^User Fills VUL Life Producer Statement screen details and click on Next$")
	public void user_Fills_VUL_Life_Producer_Statement_screen_details_and_click_on_Next() throws IOException {
		String RiskClassification = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPS_RiskClassificationPresentedtoClient");
		String AC_Offer = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPS_AC_Offer");
		String MultipolicyCase = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_Isthispartofamulti-policycase(i.e.familymembers,businesspartners,etc.)?");
		String MultipolicyCasePolicyNumbers = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_MultiPolicyProvidedassociatedPolicyNumber(s)");
		String Otherapplicationssubmitted = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_Arethereanyotherapplications(e.g.Disability,LongTermCare)beingsubmittedconcurrentlywiththisApplicationorwithinthelasttwomonths?");
		String OtherapplicationssubmittedPolicyNumbers = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_OtherapplicationssubmittedProvideassociatedPolicyNumber(s)");
		String Dividends = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_WilldividendsfromanexistingMassMutualpolicybeusedtopayallorpartoftheinitialpremiumonthispolicy?");
		String ServiceRequest = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_WouldyouliketocompleteaServiceRequestform?");
		String PurchaseSinglePremiumImmediateAnnuity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_IstheLifeInsurancebeingappliedforinconjunctionwiththepurchaseofaSinglePremiumImmediateAnnuity?");
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
		String MarketType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LIfeProducerStatement_MarketType");
		String Prospectusandany = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Prospectusandany");
		String Prospectus_MM = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Prospectus_MM");
		String Prospectus_DD = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Prospectus_DD");
		String Prospectus_YYYY = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"Prospectus_YYYY");
		
		producerStatement.enterProducerStatement(RiskClassification,AC_Offer, MultipolicyCase, MultipolicyCasePolicyNumbers,
				Otherapplicationssubmitted, OtherapplicationssubmittedPolicyNumbers, Dividends, ServiceRequest,
				PurchaseSinglePremiumImmediateAnnuity, PurchaseSinglePremiumImmediateAnnuityPolicyNumbers,
				DiscussedArrangingFinancingForPurchase, KnowledgeReasontoBelieve, KnowledgeReasontoBelieveDetails,
				UnderstandEnglish,AC_HearingImpairment,AC_OtherPreferredLanguage, IndicateLanguage, MarketType,Prospectusandany, Prospectus_MM, Prospectus_DD, Prospectus_YYYY);
		
	}

	@When("^User Fills VUL Life Producer Compensation screen details and click on Next$")
	public void user_Fills_VUL_Life_Producer_Compensation_screen_details_and_click_on_Next() throws IOException {
		String ProducerRole = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerRole");
		String ProducerEmail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Email");
		String LicenceID = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LifeProducerCompensation_FloridLIC");
		String Firstyearcommission = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_1stYearCommission");
		String RenewalCommision = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_RenewalCommission");
		String AdditionalProducer = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPC_Arethereadditionalproducers?");
		String ContactOneFirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1FirstName");
		String ContactOneLastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1LastName");
		String ContactOnePhone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1Phone");
		String ContactOneHomeWorkMobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPC_Contact1HomeWorkMobile");
		String ContactOneExtension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPC_Contact1WorkExtension");
		String ContactOneEmail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact1Email");
		String ContactTwoFirstName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2FirstName");
		String ContactTwoLastName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2LastName");
		String ContactTwoPhone = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2Phone");
		String ContactTwoHomeWorkMobile = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPC_Contact2HomeWorkMobile");
		String ContactTwoExtension = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPC_Contact2WorkExtension");
		String ContactTwoEmail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Contact2Email");
		String Add_ProducerRole = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_Add_ProducerRole");
		String NumberOfProducer = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "Number_OF_producer");
		
		String ProducerID = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerID");
		String AgencyId = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_AgencyId");
		String ProducerID2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerID2");
		String AgencyId2 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_AgencyId2");
		String ProducerID3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_ProducerID3");
		String AgencyId3 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "LPC_AgencyId3");
		
		String fst_Year_Commission1 = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"LPC_%_1st_Year_Commission1");
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
		
		
		
		
		
		
		//......................................................................Premium Allocation Screen......................................................................
		
		
		String AggressiveAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_AggressiveAllocation");
		String GrowthAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_GrowthAllocation");
		String AmericanFundsCoreAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_AmericanFundsCoreAllocation");
		String iSharesAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_iSharesAllocation");
		String BalancedAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_BalancedAllocation");
		String iShares80_20llocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_iShares80_20llocation");
		String ConservativeAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_ConservativeAllocation");
		String ModerateAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PA_ModerateAllocation");
		String Blend = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"PA_Blend");
		
		String FidelityVIPbondIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FidelityVIPbondIndex");
		String ManagedBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_ManagedBond");
		String ShortDurationBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_ShortDurationBond");
		String InvescoVIGlobalstrategicincome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_InvescoVIGlobalstrategicincome");
		String TotalReturnBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_TotalReturnBond");
		String DynamicBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_DynamicBond");
		String PimCOIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_PimCOIncome");
		String HighYield = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_HighYield");
		String VanguardVIFGlobalbondindex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_VanguardVIFGlobalbondindex");
		String InflationProtectedandIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_InflationProtectedandIncome");
		String fidelityViPInternationalIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_fidelityViPInternationalIndex");
		String Foreign = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_Foreign");
		
		
		String FidelityVipOverseas = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FidelityVipOverseas");
		String Global = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_Global");
		String InvescoViGlobal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_InvescoViGlobal");
		String InternationalEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_InternationalEquity");
		String InvescoOppenheimerViInternationalGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_InvescoOppenheimerViInternationalGrowth");
		String StrategicEmergingMarkets = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_StrategicEmergingMarkets");
		String FidelityViPContrafund = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FidelityViPContrafund");
		String FocusedEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FocusedEquity");
		String FidelityViPTotalMarketIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FidelityViPTotalMarketIndex");
		String FundamentalEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FundamentalEquity");
		String InvescoViMainStreet = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_InvescoViMainStreet");
		String SustainableEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_SustainableEquity");
		
		
		
		String EquityIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_EquityIndex");
		String AmericanFundsGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_AmericanFundsGrowth");
		String BlueChipGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_BlueChipGrowth");
		String LargeCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_LargeCapGrowth");
		String Equity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_Equity");
		String EquityIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_EquityIncome");
		
		String FundamentalValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FundamentalValue");
		String IncomeGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_IncomeGrowth");
		String GovernmentMoneyMarketFund = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_GovernmentMoneyMarketFund");
		
		
		PreAllcoation.InvestmentOption(AggressiveAllocation, GrowthAllocation, AmericanFundsCoreAllocation, iSharesAllocation, BalancedAllocation, iShares80_20llocation,
				ConservativeAllocation, ModerateAllocation, Blend, FidelityVIPbondIndex, ManagedBond, ShortDurationBond, InvescoVIGlobalstrategicincome, TotalReturnBond,
				DynamicBond, PimCOIncome, HighYield, VanguardVIFGlobalbondindex, InflationProtectedandIncome, fidelityViPInternationalIndex, Foreign, FidelityVipOverseas,
				Global, InvescoViGlobal, InternationalEquity, InvescoOppenheimerViInternationalGrowth, StrategicEmergingMarkets, FidelityViPContrafund, FocusedEquity, 
				FidelityViPTotalMarketIndex, FundamentalEquity, InvescoViMainStreet, SustainableEquity, EquityIndex, AmericanFundsGrowth, BlueChipGrowth, LargeCapGrowth, 
				Equity, EquityIncome, FundamentalValue, IncomeGrowth, GovernmentMoneyMarketFund);
		
		
		String BlackrockSmallCapIndexVI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_BlackrockSmallCapIndexVI");
		String FidelityViPExtendedMarketIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FidelityViPExtendedMarketIndex");
		String SmallCapEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_SmallCapEquity");
		String VanguardViFMidCapIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_VanguardViFMidCapIndex");
		String InvescoViDiscoveryMidCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_InvescoViDiscoveryMidCapGrowth");
		String MidCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_MidCapGrowth");
		String SmallCapGrowthEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_SmallCapGrowthEquity");
		String MidCapValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_MidCapValue");
		String SmallCompanyValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_SmallCompanyValue");
		String SmallMidCapValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_SmallMidCapValue");
		String CboeVestUsLargeCapBufferStrategiesVI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_CboeVestUsLargeCapBufferStrategiesVI");
		String janusHendersonGlobalTechnologyandInnovation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_janusHendersonGlobalTechnologyandInnovation");
		String DelawareIvyViPAssetStrategy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_DelawareIvyViPAssetStrategy");
		String EquityRotation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_EquityRotation");
		String FidelityViPHealthCare = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FidelityViPHealthCare");
		String ManagedVolatility = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_ManagedVolatility");
		String FidelityViPRealEstate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_FidelityViPRealEstate");
		String VanguardViFRealEstateIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_VanguardViFRealEstateIndex");
		String GuarantedPrincipalAccount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_GuarantedPrincipalAccount");
		String WouldyouLiketoelect = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_WouldyouLiketoelect");
		String deductMonthlyCharges = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "PA_deductMonthlyCharges");
		
		PreAllcoation.InvestionOptionTwo(BlackrockSmallCapIndexVI, FidelityViPExtendedMarketIndex, SmallCapEquity, VanguardViFMidCapIndex, InvescoViDiscoveryMidCapGrowth, MidCapGrowth,
				SmallCapGrowthEquity, MidCapValue, SmallCompanyValue, SmallMidCapValue, CboeVestUsLargeCapBufferStrategiesVI, janusHendersonGlobalTechnologyandInnovation, DelawareIvyViPAssetStrategy,
				EquityRotation, FidelityViPHealthCare, ManagedVolatility, FidelityViPRealEstate, VanguardViFRealEstateIndex, GuarantedPrincipalAccount, WouldyouLiketoelect, deductMonthlyCharges);
		
		String startDate_Month = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_StartDate_Month");
		String startDate_Year = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_StartDate_Year");
		String cancellationDate_Month = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_EndDate_Month");
		String cancellationDate_Year = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_EndDate_Year");
		String investmentOption = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Divisionbyaset_InvestmentOption");
		String Cboe = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "iShares80_20llocation");
		String protofolio_Frequency = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_protfolioRedbalancing_Frequency");
		String protofolio_Startdate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"ALP_protfolioRedbalancing_StartDate");
		String cboeVestUSLargeCapBufferStrategiesVI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"ALP_Speciality_CboeVest_USLargeCap10%_ ");

		String delawareIvyVIPAssetStrategy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Speciality_DelawareIvyVIPAssetStrategy");
		String fidelityVIPHealthCare = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Speciality_FidelityVIP HealthCare");
		String fidelityVIPRealEstate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Speciality_FidelityVIPRealEstate");
		String janusHendersonGlobalTechnologyInnovation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Speciality_JanusHendersonGlobal");
		String mMLEquityRotation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Speciality_MMLEquityRotation");
		String mMLManagedVolatility = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Speciality_MMLManagedVolatility");
		String vanguardVIFRealEstateIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Speciality_VanguardVIFRealEstateIndex");
		String fidelityVIPInternationalIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_FidelityVIPInternationalIndex");
		String fidelityVIPOverseas = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_FidelityVIPOverseas");
		String invescoVIGlobal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_InvescoVIGlobal");
		String invescoOppenheimerVIInternationalGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_InvescoOppenheimer");
		String mMLForeign = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_MMLForeign");
		
		
		String mMLGlobal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_MMLGlobal");
		String mMLInternationalEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_MMLInternationalEquity");
		String mMLStrategicEmergingMarkets = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_InternationalGlobal_MMLStrategicEmergingMarkets");
		String invescoVIDiscoveryMidCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMid CapGrowth_InvescoVIDiscoveryMidCapGrowth");
		String mMLMidCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapGrowth_MMLMidCapGrowth");
		String mMLSmallCapGrowthEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapGrowth_MMLSmallCapGrowthEquity");
		String blackRockSmallCapIndexVI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapBlend_BlackRockSmallCapIndex");
		String fidelityVIPExtendedMarketIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapBlend_FidelityVIPExtendedMarketIndex");
		String mMLSmallCapEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapBlend_MMLSmallCapEquity");
		String vanguardVIFMidCapIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapGrowth_VanguardVIFMidCapIndex");
		String mMLMidCapValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapValue_MMLMidCapValue");
		String mMLSmallCompanyValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapValue_MMLSmalCompanyValue");
		
		
		
		String mMLSmallMidCapValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_SmallMidCapValue_MMLSmallMidCapValue");
		String mMLAmericanFundsGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapGrowth_MMLAmericanFundsGrowth");
		String mMLBlueChipGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapGrowth_MMLBlueChipGrowth");
		String mMLLargeCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapGrowth_MMLLargeCapGrowth");
		String fidelityVIPContrafund = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapBlend_FidelityVIPContrafund");
		String fidelityVIPTotalMarketIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapBlend_FidelityVIPTotalMarketIndex");
		
		String invescoVIMainStreet = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapBlend_InvescVIMainStreet");
		String mMLEquityIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapBlend_MMLEquityIndex");
		String mMLFocusedEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapBlend_MMLFocusedEquity");
		
		
		

		String mMLFundamentalEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapBlend_MMLFundamentaEquity");
		String mMLSustainableEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapBlend_MMLSustainableEquity");
		String mMLEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapValue_MMLEquity");
		String mMLEquityIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapValue_MMLEquityIncome");
		String mMLIncomeGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapValue_MMLIncome&Growth");
		String mMLFundamentalValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_LargeCapValue_MMLFundamentalValue");
		String mMLBlend = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_Blend_MMLBlend");
		String mMLAggressiveAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLAggressiveAllocation");
		String mMLAmericanFundsCoreAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLAmericanFundsCoreAllocation");
		String mMLBalancedAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLBalancedAllocation");
		String mMLConservativeAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLConservativeAllocation");
		String mMLGrowthAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLGrowthAllocation");
		
		
		
		String mMLiShares_60_40Allocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLiShares60_40Allocation");
		String mMLiShares_80_20_Allocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MML iShares80/20 Allocation");
		String mMLModerateAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLModerateAllocation");
		String mMLTotalReturnBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_MMLTotalReturnBond");
		String pIMCOIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_PIMCOIncome");
		String vanguardVIFGlobalBondIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_AssetAllocation_VanguardVIFGlobalBondIndex");
		
		String fidelityVIPBondIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_FidelityVIPBondIndex");
		String fidelityVIPStrategicIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_FidelityVIPStrategicIncome");
		String invescoVIGlobalStrategicIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_InvescoVIGlobalStrategicIncome");
		
		String mMLDynamicBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_MMLDynamicBond");
		String mMLHighYield = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_MMLHighYield");
		String mMLInflationProtectedandIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_MMLInflation-ProtectedandIncome");
		String mMLManagedBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_MMLManagedBond");
		String mMLShortDurationBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_FixedIncome_MMLShort-DurationBond");
		String mMLUSGovernmentMoneyMarketFund = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_MoneyMarket_MMLUSGovernmentMoneyMarket");
		String ReceiveAnEmail = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALP_ReceiveAnEmail");
		ALocationscree1.Allocation_directedMonthly(ReceiveAnEmail,startDate_Month, startDate_Year, cancellationDate_Month, cancellationDate_Year, investmentOption, Cboe, protofolio_Frequency, protofolio_Startdate,
				cboeVestUSLargeCapBufferStrategiesVI, delawareIvyVIPAssetStrategy, fidelityVIPHealthCare, fidelityVIPRealEstate, janusHendersonGlobalTechnologyInnovation, mMLEquityRotation, mMLManagedVolatility,
				vanguardVIFRealEstateIndex, fidelityVIPInternationalIndex, fidelityVIPOverseas, invescoVIGlobal, invescoOppenheimerVIInternationalGrowth, mMLForeign, mMLGlobal, mMLInternationalEquity,
				mMLStrategicEmergingMarkets, invescoVIDiscoveryMidCapGrowth, mMLMidCapGrowth, mMLSmallCapGrowthEquity, blackRockSmallCapIndexVI, fidelityVIPExtendedMarketIndex, mMLSmallCapEquity,
				vanguardVIFMidCapIndex, mMLMidCapValue, mMLSmallCompanyValue, mMLSmallMidCapValue, mMLAmericanFundsGrowth, mMLBlueChipGrowth, mMLLargeCapGrowth, fidelityVIPContrafund, fidelityVIPTotalMarketIndex,
				invescoVIMainStreet, mMLEquityIndex, mMLFocusedEquity, mMLFundamentalEquity, mMLSustainableEquity, mMLEquity, mMLEquityIncome, mMLIncomeGrowth, mMLFundamentalValue, mMLBlend, mMLAggressiveAllocation,
				mMLAmericanFundsCoreAllocation, mMLBalancedAllocation, mMLConservativeAllocation, mMLGrowthAllocation, mMLiShares_60_40Allocation, mMLiShares_80_20_Allocation, mMLModerateAllocation, mMLTotalReturnBond,
				pIMCOIncome, vanguardVIFGlobalBondIndex, fidelityVIPBondIndex, fidelityVIPStrategicIncome, invescoVIGlobalStrategicIncome, mMLDynamicBond, mMLHighYield, mMLInflationProtectedandIncome, mMLManagedBond,
				mMLShortDurationBond, mMLUSGovernmentMoneyMarketFund);
	
		String ALPC_dollarCost_Frequency = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_dollarCost_Frequencies");
		String ALPC_dollarCost_startdate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_dollarCost_startdates");
		String ALPC_numberofTransfers = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_numberofTransfers");
		String ALPC_transferFromAmount = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_transferFromAmount");
		String ALPC_transferFromDivisionName = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_transferFromDivisionName");
	//specality
		String ALPC_cboeVestUSLargeCapBufferStrategiesVI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName,"ALPC_cboeVestUSLargeCapBufferStrategiesVI");
		String ALPC_delawareIvyVIPAssetStrategy = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_delawareIvyVIPAssetStrategy");
		String ALPC_fidelityVIPHealthCare = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPHealthCare");
		String ALPC_fidelityVIPRealEstate = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPRealEstate");
		String ALPC_janusHendersonGlobalTechnologyInnovation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_janusHendersonGlobalTechnologyInnovation");
		String ALPC_mMLEquityRotation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLEquityRotation");
		String ALPC_mMLManagedVolatility = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLManagedVolatility");
		String ALPC_vanguardVIFRealEstateIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_vanguardVIFRealEstateIndex");
		
		//international
		String ALPC_fidelityVIPInternationalIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPInternationalIndex");
		String ALPC_fidelityVIPOverseas = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPOverseas");
		String ALPC_invescoVIGlobal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_invescoVIGlobal");
		String ALPC_invescoOppenheimerVIInternationalGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_invescoOppenheimerVIInternationalGrowth");
		String ALPC_mMLForeign = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLForeign");
		String ALPC_mMLGlobal = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLGlobal");
		String ALPC_mMLInternationalEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLInternationalEquity");
		String ALPC_mMLStrategicEmergingMarkets = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLStrategicEmergingMarkets");
		
		// Small/Mid Cap Growth
		String ALPC_invescoVIDiscoveryMidCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_invescoVIDiscoveryMidCapGrowth");
		String ALPC_mMLMidCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLMidCapGrowth");
		String ALPC_mMLSmallCapGrowthEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLSmallCapGrowthEquity");
		
		// Small/Mid Cap Blend
		String ALPC_blackRockSmallCapIndexVI = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_blackRockSmallCapIndexVI");
		String ALPC_fidelityVIPExtendedMarketIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPExtendedMarketIndex");
		String ALPC_mMLSmallCapEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLSmallCapEquity");
		String ALPC_vanguardVIFMidCapIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_vanguardVIFMidCapIndex");
		
		//Small/Mid Cap Value
		String ALPC_mMLMidCapValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLMidCapValue");
		String ALPC_mMLSmallCompanyValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLSmallCompanyValue");
		String ALPC_mMLSmallMidCapValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLSmallMidCapValue");
		
		//Large Cap Growth
		String ALPC_mMLAmericanFundsGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLAmericanFundsGrowth");
		String ALPC_mMLBlueChipGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLBlueChipGrowth");
		String ALPC_mMLLargeCapGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLLargeCapGrowth");
		
		//Large Cap Blend
		String ALPC_fidelityVIPContrafund = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPContrafund");
		String ALPC_fidelityVIPTotalMarketIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPTotalMarketIndex");
		String ALPC_invescoVIMainStreet = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_invescoVIMainStreet");
		String ALPC_mMLEquityIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLEquityIndex");
		String ALPC_mMLFocusedEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLFocusedEquity");
		String ALPC_mMLFundamentalEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLFundamentalEquity");
		String ALPC_mMLSustainableEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLSustainableEquity");
		
		//Large Cap Value
		String ALPC_mMLEquity = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLEquity");
		String ALPC_mMLEquityIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLEquityIncome");
		String ALPC_mMLFundamentalValue = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLFundamentalValue");
		String ALPC_mMLIncomeGrowth = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLIncomeGrowth");
		
		//Balanced and Asset Allocation
		String ALPC_mMLBlend = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLBlend");
		String ALPC_mMLAggressiveAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLAggressiveAllocation");
		String ALPC_mMLAmericanFundsCoreAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLAmericanFundsCoreAllocation");
		String ALPC_mMLBalancedAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLBalancedAllocation");
		String ALPC_mMLConservativeAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLConservativeAllocation");
		String ALPC_mMLGrowthAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLGrowthAllocation");
		String ALPC_mMLiShares_60_40Allocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLiShares_60_40Allocation");
		String ALPC_mMLiShares_80_20_Allocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLiShares_80_20_Allocation");
		String ALPC_mMLModerateAllocation = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLModerateAllocation");
		
		//Fixed Income
		String ALPC_fidelityVIPBondIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPBondIndex");
		String ALPC_fidelityVIPStrategicIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_fidelityVIPStrategicIncome");
		String ALPC_invescoVIGlobalStrategicIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_invescoVIGlobalStrategicIncome");
		String ALPC_mMLDynamicBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLDynamicBond");
		String ALPC_mMLHighYield = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLHighYield");
		String ALPC_mMLInflationProtectedandIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLInflationProtectedandIncome");
		String ALPC_mMLManagedBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLManagedBond");
		String ALPC_mMLShortDurationBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLShortDurationBond");
		String ALPC_mMLTotalReturnBond = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLTotalReturnBond");
		String ALPC_pIMCOIncome = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_pIMCOIncome");
		String ALPC_vanguardVIFGlobalBondIndex = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_vanguardVIFGlobalBondIndex");
		String ALPC_mMLUSGovernmentMoneyMarketFund = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "ALPC_mMLUSGovernmentMoneyMarketFund");
	
		AllocationprogramContinous.AllocationContinous_directedMonthly(ALPC_dollarCost_Frequency, ALPC_dollarCost_startdate, ALPC_numberofTransfers, ALPC_transferFromAmount, ALPC_transferFromDivisionName, ALPC_cboeVestUSLargeCapBufferStrategiesVI,
				ALPC_delawareIvyVIPAssetStrategy, ALPC_fidelityVIPHealthCare, ALPC_fidelityVIPRealEstate, ALPC_janusHendersonGlobalTechnologyInnovation, ALPC_mMLEquityRotation, ALPC_mMLManagedVolatility, ALPC_vanguardVIFRealEstateIndex,
				ALPC_fidelityVIPInternationalIndex, ALPC_fidelityVIPOverseas, ALPC_invescoVIGlobal, ALPC_invescoOppenheimerVIInternationalGrowth, ALPC_mMLForeign, ALPC_mMLGlobal, ALPC_mMLInternationalEquity, ALPC_mMLStrategicEmergingMarkets,
				ALPC_invescoVIDiscoveryMidCapGrowth, ALPC_mMLMidCapGrowth, ALPC_mMLSmallCapGrowthEquity, ALPC_blackRockSmallCapIndexVI, ALPC_fidelityVIPExtendedMarketIndex, ALPC_mMLSmallCapEquity, ALPC_vanguardVIFMidCapIndex, ALPC_mMLMidCapValue,
				ALPC_mMLSmallCompanyValue, ALPC_mMLSmallMidCapValue, ALPC_mMLAmericanFundsGrowth, ALPC_mMLBlueChipGrowth, ALPC_mMLLargeCapGrowth, ALPC_fidelityVIPContrafund, ALPC_fidelityVIPTotalMarketIndex, ALPC_invescoVIMainStreet, ALPC_mMLEquityIndex,
				ALPC_mMLFocusedEquity, ALPC_mMLFundamentalEquity, ALPC_mMLSustainableEquity, ALPC_mMLEquity, ALPC_mMLEquityIncome, ALPC_mMLIncomeGrowth, ALPC_mMLFundamentalValue, ALPC_mMLBlend, ALPC_mMLAggressiveAllocation, ALPC_mMLAmericanFundsCoreAllocation,
				ALPC_mMLBalancedAllocation, ALPC_mMLConservativeAllocation, ALPC_mMLGrowthAllocation, ALPC_mMLiShares_60_40Allocation, ALPC_mMLiShares_80_20_Allocation, ALPC_mMLModerateAllocation, ALPC_fidelityVIPBondIndex, ALPC_fidelityVIPStrategicIncome,
				ALPC_invescoVIGlobalStrategicIncome, ALPC_mMLDynamicBond, ALPC_mMLHighYield, ALPC_mMLInflationProtectedandIncome, ALPC_mMLManagedBond, ALPC_mMLShortDurationBond, ALPC_mMLTotalReturnBond, ALPC_pIMCOIncome, ALPC_vanguardVIFGlobalBondIndex, ALPC_mMLUSGovernmentMoneyMarketFund);
		
		//PartnerShip LLC Certification Screen  ----------- when type of entity is PartnerShip /LLC in entity owner screen
		
		partnershipLLC PartnershipLLC = new partnershipLLC();

		//Partnership LLC Cert
		              
		              String EntityType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_TypeofEntity");
		              String OrganizationDateMM = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_DateofOrganizationofEntity_MM");
		              String OrganizationDateDD = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_DateofOrganizationofEntity_DD");
		              String OrganizationDateYY = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_DateofOrganizationofEntity_YYYY");
		              String EntityState = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_StateofOrganizationofEntity");
		              String GoodStanding = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_IsTheEntityInGoodStanding");
		              String Relationship = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_RelationshipofInsured");
		              String AuthorizedPersons = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_NumberofAuthorizedPersons");
		              
		              PartnershipLLC.PartnershipLLCCert(EntityType, OrganizationDateMM, OrganizationDateDD, OrganizationDateYY, EntityState, GoodStanding, Relationship, AuthorizedPersons);
		              
		              String TaxNumberofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_TaxofAuthorizedPerson");
		              String FirstNameofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_FirstNameofAuthorizedPerson");
		              String LastNameofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_LastNameofAuthorizedPerson");
		              String CapacityofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_CapacityofAuthorizedPerson");
		              String Street1ofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_Street1ofAuthorizedPerson");
		              String Street2ofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_Street2ofAuthorizedPerson");
		              String Street3ofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_Street3ofAuthorizedPerson");
		              String CityofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_CityofAuthorizedPerson");
		              String StateofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_StateofAuthorizedPerson");
		              String ZipofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_ZipofAuthorizedPerson");
		              String EmailofFirst = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_EmailofAuthorizedPerson");
		              
		              String TaxNumberofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_TaxofSecondAuthorizedPerson");
		              String FirstNameofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_FirstNameofSecondAuthorizedPerson");
		              String LastNameofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_LastNameofSecondAuthorizedPerson");
		              String CapacityofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_CapacityofSecondAuthorizedPerson");
		              String Street1ofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_Street1ofSecondAuthorizedPerson");
		              String Street2ofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_Street2ofSecondAuthorizedPerson");
		              String Street3ofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_Street3ofSecondAuthorizedPerson");
		              String CityofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_CityofSecondAuthorizedPerson");
		              String StateofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_StateofSecondAuthorizedPerson");
		              String ZipofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_ZipofSecondAuthorizedPerson");
		              String EmailofSecond = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_EmailofSecondAuthorizedPerson");
		              
		              
		              PartnershipLLC.firstAuthorizedPerson(TaxNumberofFirst, FirstNameofFirst, LastNameofFirst, CapacityofFirst, Street1ofFirst, Street2ofFirst, Street3ofFirst, CityofFirst, StateofFirst, ZipofFirst, EmailofFirst,TaxNumberofSecond, FirstNameofSecond, LastNameofSecond, CapacityofSecond, Street1ofSecond, Street2ofSecond, Street3ofSecond, 
		            		  CityofSecond, StateofSecond, ZipofSecond, EmailofSecond);
		    
		              String ActReg_Typeofaccount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Investor_Info_Ent_ActReg_Typeofaccount");
		              String ActReg_telephoneNum = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Investor_Info_Ent_TelephoneNumber");
		              String ActReg_OrgTax = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Investor_Info_Ent_Isthisorganizationtax");
		              String ActReg_Checkappropriatebox = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Investor_Info_Ent_federaltaxclassification");
		              
		              InvesterAccountInfo_one InvestAccountInfor=new InvesterAccountInfo_one();
		              InvestAccountInfor.EntityownerAccountInfo(ActReg_Typeofaccount, ActReg_telephoneNum, ActReg_OrgTax, ActReg_Checkappropriatebox);
		              
		              String ResidenceinthePasttwoyrs = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_residencepasttwoyears");
		              String PO_BOX_Strt1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_POBoxStreet1");
		              String PO_BOX_Strt2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_POBoxStreet2");
		              String PO_BOX_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_POBoxCity");
		              String PO_BOX_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_POBoxState");
		              String PO_BOX_Zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_POBoxZIP/PostalCode");
		              String PO_BOX_maritialsatus = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_MaritalStatus");
		              String PO_BOX_NoOfdependent = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_NumberofDependents");
		              
		              String Identification_drivingliscence_passport = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_ZipofSecondAuthorizedPerson");
		              String Identification_Idnumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_EmailofSecondAuthorizedPerson");   
		              String state_countryOfIssue = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PC_FirstNameofSecondAuthorizedPerson");
		              
		              String ExpirationDate_mm = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ExpirationDate (mm)");
		              String ExpirationDate_dd = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ExpirationDate (DD)");
		              String ExpirationDate_yyyy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ExpirationDate (YYYY)");
		              String PO_BOX_employemntstatus = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_EmploymentStatus");
		              String Emplolyed_occupation = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_Occupation");
		              String Employed_nameOfemployer = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_NameofEmployer");
		              String Employed_Bussinessaddress = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_BusinessAddress");
		              String Employed_suiteNo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_Apt/SuiteNo");
		              String Employed_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_City");
		              String Employed_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_State");
		              String Employed_zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_ZIP/Postal Code");
		              String Employed_country = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_Country");
		              String Ritired_indicatesourceofincome = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_self/Emplyed_indicatesourceofincome");
		              String Registeredwithoremployed = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_Registeredwithoremployed");
		              String Firmtype = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_Registeredwithoremployed_Firm Type");
		              String Firmname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_Registeredwithoremployed_FirmName");
		              String Firmaddresstreet = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_Registeredwithoremployed_Firm Address (Street)");
		              String Firmcity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_Registeredwithoremployed_City");
		              String Firmstate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_Registeredwithoremployed_State");
		              
		              String Firmzipcode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_Registeredwithoremployed_ZIP/Postal Code");
		              String ControlpersonoraffiliateIamornt = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_A controlpersonoraffiliate_ControlPersonorAffiliate");
		              String Controlpersonoraffiliate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_A controlpersonoraffiliate_ControlPersonorAffiliate_DD");
		              String CUIP_symbol = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_A controlpersonoraffiliate_CUSIP/Symbol");
		              String Companyname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_A controlpersonoraffiliate_CompanyName");
		              String PleaseSelectTrustedContact = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_Please Select One");
		              String Trusted_firstname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_FirstName");
		              String Trusted_midlename = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_MiddleName");
		              String Trusted_lastname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_LastName");
		              String Trusted_suffix = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_Suffix");
		              String LegalAddresasOwner = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_LegalAddresssameas");   
		              String TrustedAddressstreet = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_LegalAddressStreet");
		              String TrustedAddresscity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_LegalAddress_City");
		              String TrustedAddressstate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_LegalAddress_State");
		              String TrustedAddresszipCode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_LegalAddress_ZIP/Postal Code");
		              String TrustedAddresstelephone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_TrustedContact_TelephoneNumber");
		              String AccountHolderaddresssameasPI = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddressameas");
		              String AdditionalAccountholder_Legalstreetone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_Street1");
		              String AdditionalAccountholder_Legalstreettwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_Street2");
		              String AdditionalAccountholder_Legalstreetthree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_Street3");
		              String AdditionalAccountholder_Legalcity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_City");
		              String AdditionalAccountholder_Legalstate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_State");
		              String AdditionalAccountholder_Legalzip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_ZIP/Postal Code");
		              String AdditionalAccountholder_ResidenceinthePasttwoyrs = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_pasttwoyears");
		              String AdditionalAccountholder_PO_BOX_Strt1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_POBoxStreet1");
		              String AdditionalAccountholder_PO_BOX_Strt2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_POBoxStreet2");
		              String AdditionalAccountholder_PO_BOX_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_POBoxCity");
		              String AdditionalAccountholder_PO_BOX_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_POBoxState");
		              String AdditionalAccountholder_PO_BOX_Zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_POBoxZIP/Postal Code");
		              String AdditionalAccountholder_PO_BOX_maritialsatus = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_MaritalStatus");
		              String AdditionalAccountholder_PO_BOX_NoOfdependent = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_NumberofDependents");
		              
		              String AdditionalAccountholder_Identification_drivingliscence_passport = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_Street1");
		              String AdditionalAccountholder_Identification_Idnumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_Street2");
		              String AdditionalAccountholder_state_countryOfIssue = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_LegalAddress_Street3");
		              
		              String AdditionalAccountholder_ExpirationDate_mm = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_ExpirationDate (mm)");
		              String AdditionalAccountholder_ExpirationDate_dd = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_ExpirationDate (DD)");
		              String AdditionalAccountholder_ExpirationDate_yyyy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_ExpirationDate (YYYY)");
		              String AdditionalAccountholder_PO_BOX_employemntstatus = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_EmploymentStatus");
		              String AdditionalAccountholder_Emplolyed_occupation = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_Occupation");
		              String AdditionalAccountholder_Employed_nameOfemployer = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_NameofEmployer");
		              String AdditionalAccountholder_Employed_Bussinessaddress = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_BusinessAddress");
		              String AdditionalAccountholder_Employed_suiteNo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_Apt/SuiteNo");
		              String AdditionalAccountholder_Employed_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_City");
		              String AdditionalAccountholder_Employed_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_State");
		              
		              String AdditionalAccountholder_Employed_zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_ZIP/Postal Code");
		              String AdditionalAccountholder_Employed_country = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_Country");
		              String AdditionalAccountholder_Ritired_indicatesourceofincome = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_additionalAccount_self/Emplyed_indicatesourceofincome");
		              
		              
		              String AcntHldr_Registeredwithoremployed = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__Registeredwithoremployed");
		              String AcntHldr_Firmtype = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__Registeredwithoremployed_Firm Type");
		              String AcntHldr_Firmname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__Registeredwithoremployed_FirmName");
		              String AcntHldr_Firmaddresstreet = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__Registeredwithoremployed_Firm Address (Street)");
		              String AcntHldr_Firmcity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__Registeredwithoremployed_City");
		              String AcntHldr_Firmstate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__Registeredwithoremployed_State");
		              
		              String AcntHldr_Firmzipcode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__Registeredwithoremployed_ZIP/Postal Code");
		              String AcntHldr_Controlpersonoraffiliateiamornot = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__A controlpersonoraffiliate_ControlPersonorAffiliate");
		              String AcntHldr_Controlpersonoraffiliate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__A controlpersonoraffiliate_ControlPersonorAffiliate_DD");
		              String AcntHldr_CUIP_symbol = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__A controlpersonoraffiliate_CUSIP/Symbol");
		              String AcntHldr_Companyname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__A controlpersonoraffiliate_CompanyName");
		              String AcntHldr_PleaseSelectTrustedContact = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_Please Select One");
		              String AcntHldr_Trusted_firstname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_FirstName");
		              String AcntHldr_Trusted_midlename = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_MiddleName");
		              String AcntHldr_Trusted_lastname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_LastName");
		              String AcntHldr_Trusted_suffix = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_Suffix");
		              String AcntHldr_TrustedAddressstreet = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_LegalAddressStreet");
		              String AcntHldr_TrustedAddresscity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_LegalAddress_City");
		              String AcntHldr_TrustedAddressstate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_LegalAddress_State");
		              String AcntHldr_TrustedAddresszipCode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_LegalAddress_ZIP/Postal Code");
		              String AcntHldr_TrustedAddresstelephone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorInfo_Owner_ActHldr__TrustedContact_TelephoneNumber");
		              
		              InvestAccountInfor.investorAccount1(ResidenceinthePasttwoyrs, PO_BOX_Strt1, PO_BOX_Strt2, PO_BOX_city, PO_BOX_state, PO_BOX_Zip, PO_BOX_maritialsatus, PO_BOX_NoOfdependent, Identification_drivingliscence_passport, Identification_Idnumber,
		            		  state_countryOfIssue, ExpirationDate_mm, ExpirationDate_dd, ExpirationDate_yyyy, PO_BOX_employemntstatus, Emplolyed_occupation, Employed_nameOfemployer, Employed_Bussinessaddress, Employed_suiteNo, Employed_city,
		            		  Employed_state, Employed_zip, Employed_country, Ritired_indicatesourceofincome, Registeredwithoremployed, Firmtype, Firmname, Firmaddresstreet, Firmcity, Firmstate, Firmzipcode, ControlpersonoraffiliateIamornt,
		            		  Controlpersonoraffiliate, CUIP_symbol, Companyname, PleaseSelectTrustedContact, Trusted_firstname, Trusted_midlename, Trusted_lastname, Trusted_suffix, LegalAddresasOwner, TrustedAddressstreet, TrustedAddresscity,
		            		  TrustedAddressstate, TrustedAddresszipCode, TrustedAddresstelephone);
		              InvestAccountInfor.PreviousResidence(AccountHolderaddresssameasPI, AdditionalAccountholder_Legalstreetone, AdditionalAccountholder_Legalstreettwo, AdditionalAccountholder_Legalstreetthree, AdditionalAccountholder_Legalcity,
		            		  AdditionalAccountholder_Legalstate, AdditionalAccountholder_Legalzip, AdditionalAccountholder_ResidenceinthePasttwoyrs, AdditionalAccountholder_PO_BOX_Strt1, AdditionalAccountholder_PO_BOX_Strt2, AdditionalAccountholder_PO_BOX_city,
		            		  AdditionalAccountholder_PO_BOX_state, AdditionalAccountholder_PO_BOX_Zip, AdditionalAccountholder_PO_BOX_maritialsatus, AdditionalAccountholder_PO_BOX_NoOfdependent, AdditionalAccountholder_Identification_drivingliscence_passport, 
		            		  AdditionalAccountholder_Identification_Idnumber, AdditionalAccountholder_state_countryOfIssue, AdditionalAccountholder_ExpirationDate_mm, AdditionalAccountholder_ExpirationDate_dd, AdditionalAccountholder_ExpirationDate_yyyy, AdditionalAccountholder_PO_BOX_employemntstatus,
		            		  AdditionalAccountholder_Emplolyed_occupation, AdditionalAccountholder_Employed_nameOfemployer, AdditionalAccountholder_Employed_Bussinessaddress, AdditionalAccountholder_Employed_suiteNo, AdditionalAccountholder_Employed_city, AdditionalAccountholder_Employed_state,
		            		  AdditionalAccountholder_Employed_zip, AdditionalAccountholder_Employed_country, AdditionalAccountholder_Ritired_indicatesourceofincome, AcntHldr_Registeredwithoremployed, AcntHldr_Firmtype, AcntHldr_Firmname, AcntHldr_Firmaddresstreet, AcntHldr_Firmcity, AcntHldr_Firmstate,
		            		  AcntHldr_Firmzipcode, AcntHldr_Controlpersonoraffiliateiamornot, AcntHldr_Controlpersonoraffiliate, AcntHldr_CUIP_symbol, AcntHldr_Companyname, AcntHldr_PleaseSelectTrustedContact, AcntHldr_Trusted_firstname, AcntHldr_Trusted_midlename, AcntHldr_Trusted_lastname, AcntHldr_Trusted_suffix,
		            		  AcntHldr_TrustedAddressstreet, AcntHldr_TrustedAddresscity, AcntHldr_TrustedAddressstate, AcntHldr_TrustedAddresszipCode, AcntHldr_TrustedAddresstelephone);

		              
		              
		              String Annualincome = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_AnnualIncome");
		              String EstimatednetWorth = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_EstimatedNetWorth");
		              String Investableassets = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_InvestableAssets");
		              String FederalTaxrate = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_Federal Tax Rate");
		              String AccountFundingsource = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_Account Funding Source");
		              String AccountFundingsourcePleaseSpecify = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_Account Funding SourcePleaseSpecify");
		              String Annualexpenses = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_AnnualExpenses");
		              String Specialexpenses = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_Special Expenses");
		              String Timeframe = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_Timeframe");
		              String InvestmentPurpose = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_InvestmentPurpose");
		              String PleaseSpecify = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_InvestmentPurposePleaseSpecify");
		              String Investmentobjective = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_InvestmentObjectives");
		              String Investmenthehorizon = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_InvestmentTimeHorizon");
		              String GeneralInvestmentknowledge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_GeneralInvestmentKnowledge");
		              String Productknowledge_Stocks = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_Product Knowledge_Stocks");
		              String Productknowledge_Bonds = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_Bonds");
		              String Productknowledge_VariableContracts = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_VariableContracts");
		              
		              String Productknowledge_MutualFunds = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_MutualFunds");
		              String Productknowledge_LimitedPartnerships = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_LimitedPartnerships");
		              String Productknowledge_AlternativeInvestments = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_AlternativeInvestments");
		              String Productknowledge_Annuities = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_InvestmentProfile_Annuities");
		              String AssestHeldAway_totalvalueofassetsheldaway = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_Totalvalueofassetsheldaway");
		              String AssestHeldAway_stocks = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_Stocks");
		              String AssestHeldAway_bonds = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_Bonds");
		              String AssestHeldAway_shortTerm = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_Short-Term");
		              String AssestHeldAway_mutualFunds = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_MutualFunds");
		              String AssestHeldAway_options = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_Options");
		              String AssestHeldAway_variableContracts = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_VariableContracts");
		              String AssestHeldAway_limitedPartnerships = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_LimitedPartnerships");
		              String AssestHeldAway_alternativeInvestments = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_AlternativeInvestments");
		              String AssestHeldAway_annuities = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_Annuities");
		              String AssestHeldAway_others = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_AssetsHeldAway_Other");
		              
		              InvestorAccountInfo_Continous investcont= new InvestorAccountInfo_Continous();
		              investcont.SuitabilityFinancialPosition(Annualincome, EstimatednetWorth, Investableassets, FederalTaxrate, AccountFundingsource,AccountFundingsourcePleaseSpecify, Annualexpenses, Specialexpenses, Timeframe, InvestmentPurpose, PleaseSpecify,
		            		  Investmentobjective, Investmenthehorizon, GeneralInvestmentknowledge, Productknowledge_Stocks, Productknowledge_Bonds, Productknowledge_VariableContracts, Productknowledge_MutualFunds,
		            		  Productknowledge_LimitedPartnerships, Productknowledge_AlternativeInvestments, Productknowledge_Annuities, AssestHeldAway_totalvalueofassetsheldaway, AssestHeldAway_stocks, AssestHeldAway_bonds,
		            		  AssestHeldAway_shortTerm, AssestHeldAway_mutualFunds, AssestHeldAway_options, AssestHeldAway_variableContracts, AssestHeldAway_limitedPartnerships, AssestHeldAway_alternativeInvestments, AssestHeldAway_annuities,
		            		  AssestHeldAway_others);
		              
		              Associatedpersons Associate= new Associatedpersons();
		              String AuthorizedIndividualTrustee = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_AuthorizedIndividual_Trustee");
		              String Controlperson = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_ControlPerson");
		              String Beneficialowner = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_BeneficialOwner");
		              String Percentageofownership = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_BeneficialOwnerPercentageofOwnership");
		              //String Percentageofownership = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "InvestorinfoCont_SuitabilityFinance_Account Funding Source");
		              String Authorized_firstname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_Firstname");
		              String Authorized_middlename = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MiddleName");
		              String Authorized_lastname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_LastName");
		              String Authorized_suffix = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_Suffix");
		              String Authorized_businessTitle = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_BussinessTitle");
		              String Authorized_sSNTIN = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_SSN_Tin");
		              String AuthorizedDOB_mm = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_DOB_MM");
		              String AuthorizedDOB_dd = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_DOB_DD");
		              String AuthorizedDOB_yyyy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_DOB_YYYY");
		              String Authorized_countryOfCitizenShip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_CountryOfCitizenShip");
		              String Authorized_countryOfCitizenShipPleaseSpicfy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_CountryOfCitizenShipPleaseSpecify");
		              String Associate_PO_BOX_Strt1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_LegaLAddress_Street1");
		              String Associate_PO_BOX_Strt2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_LegaLAddress_Street2");
		              String Associate_PO_BOX_Strt3 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_LegaLAddress_Street3");
		              String Associate_PO_BOX_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_LegaLAddress_City");
		              String Associate_PO_BOX_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_LegaLAddress_State");
		              String Associate_PO_BOX_Zip = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_LegaLAddress_ZipCode");
		              String MailingAddress = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MailingAddress");
		              String MailingAddress_streetone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MailingAddress_Street1");
		              String MailingAddress_streettwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MailingAddress_Street2");
		              String MailingAddress_streetThree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MailingAddress_Street3");
		              String MailingAddress_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MailingAddress_City");
		              String MailingAddress_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MailingAddress_State");
		              String MailingAddress_zipCode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_MailingAddress_Zip");
		              String Home_Phonenumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_HomePhoneNumber");
		              String Work_Phonenumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_WorkPhoneNumber");
		              String TypeOfIdentification = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_TypeOfIdentification");
		              
		              String idNumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_Idnumber");
		              String stateofIssue = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_StateOfIssue");
		              String employmentStatus = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_employmentStatus");
		              String employmentstatusOccupation = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AuthorisedIndiv_employmentStatusOCcupation");
		              String RegesteredWithEmployed = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed");
		              String Associate_Firmtype = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_FirmType");
		              String FirmName = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_FirmName");
		              String Registeredwithoremployed_PO_BOX_Streetone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_POBOx_Street1");
		              String Registeredwithoremployed_PO_BOX_Streettwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_POBOx_Street2");
		              String Registeredwithoremployed_PO_BOX_StreetThree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_POBOx_Street3");
		              String Registeredwithoremployed_PO_BOX_City = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_POBOx_City");
		              String Registeredwithoremployed_PO_BOX_State = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_POBOx_State");
		              String Registeredwithoremployed_PO_BOX_ZipCode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_registeredwithoremployed_POBOx_Zip");
		              String ControlPersonIamnot = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_ControlPerson");
		              String AffiliationControlPersonDirector = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_ControlPerson_affliation_Direction");
		              String AffiliationControlPersonPolicyMaking = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_ControlPerson_affliation_PolicyMaking");
		              String AffiliationControlPersonDirector_10_Share = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_ControlPerson_affliation_10%Shareholder");
		              String cUSIP_Symbol = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_ControlPerson_CUSIPSymbol");
		              String companyName = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_ControlPerson_CompanyName");
		              String ProvidingInformaton = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_ProvidingInformation");
		              String accountNumberOne = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AccountNumber1");
		              String accountNumberTwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AccountNumber2");
		              String accountNumberThree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AccountNumber3");
		              String accountNumberFour = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AccountNumber4");
		              String MMLinvestor = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_MMLSpecify");
		              String MMLinvestorPleaseSpeicfy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_MMLSpecify");
		              String Trustdoesnotrequir = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_TrustDoesnotRequire");
		              String Trustdoesnotrequire_pleaseDescribe = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_TrustDoesnotRequire_PleaseSpecify");
		              String AdditionalAssociatePerson = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Associated_AdditionalAssociatePerson");	              
		              
		              Associate.associatepersons(AuthorizedIndividualTrustee, Controlperson, Beneficialowner, Percentageofownership, Authorized_firstname, Authorized_middlename, Authorized_lastname, Authorized_suffix, Authorized_businessTitle, Authorized_sSNTIN,
		            		  AuthorizedDOB_mm, AuthorizedDOB_dd, AuthorizedDOB_yyyy, Authorized_countryOfCitizenShip, Authorized_countryOfCitizenShipPleaseSpicfy, Associate_PO_BOX_Strt1, Associate_PO_BOX_Strt2, Associate_PO_BOX_Strt3, Associate_PO_BOX_city, Associate_PO_BOX_state,
		            		  Associate_PO_BOX_Zip, MailingAddress, MailingAddress_streetone, MailingAddress_streettwo, MailingAddress_streetThree, MailingAddress_city, MailingAddress_state, MailingAddress_zipCode, Home_Phonenumber, Work_Phonenumber, TypeOfIdentification, idNumber, stateofIssue,
		            		  employmentStatus, employmentstatusOccupation, RegesteredWithEmployed, Associate_Firmtype, FirmName, Registeredwithoremployed_PO_BOX_Streetone, Registeredwithoremployed_PO_BOX_Streettwo, Registeredwithoremployed_PO_BOX_StreetThree, Registeredwithoremployed_PO_BOX_City, Registeredwithoremployed_PO_BOX_State,
		            		  Registeredwithoremployed_PO_BOX_ZipCode, ControlPersonIamnot, AffiliationControlPersonDirector, AffiliationControlPersonPolicyMaking, AffiliationControlPersonDirector_10_Share, cUSIP_Symbol, companyName, ProvidingInformaton, accountNumberOne, accountNumberTwo, accountNumberThree, accountNumberFour,
		            		  MMLinvestor,MMLinvestorPleaseSpeicfy, Trustdoesnotrequir, Trustdoesnotrequire_pleaseDescribe, AdditionalAssociatePerson);
		              
		              Associate.associatepersons(AuthorizedIndividualTrustee, Controlperson, Beneficialowner, Percentageofownership, Authorized_firstname, Authorized_middlename, Authorized_lastname, Authorized_suffix, Authorized_businessTitle, Authorized_sSNTIN,
		            		  AuthorizedDOB_mm, AuthorizedDOB_dd, AuthorizedDOB_yyyy, Authorized_countryOfCitizenShip, Authorized_countryOfCitizenShipPleaseSpicfy, Associate_PO_BOX_Strt1, Associate_PO_BOX_Strt2, Associate_PO_BOX_Strt3, Associate_PO_BOX_city, Associate_PO_BOX_state,
		            		  Associate_PO_BOX_Zip, MailingAddress, MailingAddress_streetone, MailingAddress_streettwo, MailingAddress_streetThree, MailingAddress_city, MailingAddress_state, MailingAddress_zipCode, Home_Phonenumber, Work_Phonenumber, TypeOfIdentification, idNumber, stateofIssue,
		            		  employmentStatus, employmentstatusOccupation, RegesteredWithEmployed, Associate_Firmtype, FirmName, Registeredwithoremployed_PO_BOX_Streetone, Registeredwithoremployed_PO_BOX_Streettwo, Registeredwithoremployed_PO_BOX_StreetThree, Registeredwithoremployed_PO_BOX_City, Registeredwithoremployed_PO_BOX_State,
		            		  Registeredwithoremployed_PO_BOX_ZipCode, ControlPersonIamnot, AffiliationControlPersonDirector, AffiliationControlPersonPolicyMaking, AffiliationControlPersonDirector_10_Share, cUSIP_Symbol, companyName, ProvidingInformaton, accountNumberOne, accountNumberTwo, accountNumberThree, accountNumberFour,
		            		  MMLinvestor,MMLinvestorPleaseSpeicfy, Trustdoesnotrequir, Trustdoesnotrequire_pleaseDescribe, AdditionalAssociatePerson);
		              
		              Associate.associatepersons(AuthorizedIndividualTrustee, Controlperson, Beneficialowner, Percentageofownership, Authorized_firstname, Authorized_middlename, Authorized_lastname, Authorized_suffix, Authorized_businessTitle, Authorized_sSNTIN,
		            		  AuthorizedDOB_mm, AuthorizedDOB_dd, AuthorizedDOB_yyyy, Authorized_countryOfCitizenShip, Authorized_countryOfCitizenShipPleaseSpicfy, Associate_PO_BOX_Strt1, Associate_PO_BOX_Strt2, Associate_PO_BOX_Strt3, Associate_PO_BOX_city, Associate_PO_BOX_state,
		            		  Associate_PO_BOX_Zip, MailingAddress, MailingAddress_streetone, MailingAddress_streettwo, MailingAddress_streetThree, MailingAddress_city, MailingAddress_state, MailingAddress_zipCode, Home_Phonenumber, Work_Phonenumber, TypeOfIdentification, idNumber, stateofIssue,
		            		  employmentStatus, employmentstatusOccupation, RegesteredWithEmployed, Associate_Firmtype, FirmName, Registeredwithoremployed_PO_BOX_Streetone, Registeredwithoremployed_PO_BOX_Streettwo, Registeredwithoremployed_PO_BOX_StreetThree, Registeredwithoremployed_PO_BOX_City, Registeredwithoremployed_PO_BOX_State,
		            		  Registeredwithoremployed_PO_BOX_ZipCode, ControlPersonIamnot, AffiliationControlPersonDirector, AffiliationControlPersonPolicyMaking, AffiliationControlPersonDirector_10_Share, cUSIP_Symbol, companyName, ProvidingInformaton, accountNumberOne, accountNumberTwo, accountNumberThree, accountNumberFour,
		            		  MMLinvestor,MMLinvestorPleaseSpeicfy, Trustdoesnotrequir, Trustdoesnotrequire_pleaseDescribe, AdditionalAssociatePerson);
		              
		              
		              
		              
		              String rightBridgeProductProfile = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_rightBridgeProductProfile");
		              String FunidngResourceAdvisory = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_FunidngResource_Advisory");
		              String Fundingsource_brokerage = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Fundingsource_brokerage");
		              String Fundingsource_directMutualFunds = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Fundingsource_directMutualFunds");
		              String Fundingsource_variableAnuity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Fundingsource_variableAnuity");
		              String Fundingsource_variableLife = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Fundingsource_variableLife");
		              String Fundingsource_employersponser = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Fundingsource_employersponser");
		              String Fundingsource_other = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Fundingsource_other");
		              String Fundingsource_otherPleaseSpecify = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Fundingsource_otherPleaseSpecify");
		              String RedemptionInfo_employerSponsoredPlan = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_RedemptionInfo_employerSponsoredPlan");
		              String RedemptionInfo_fixedFixedIndexAnnuity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_RedemptionInfo_fixedFixedIndexAnnuity");
		              String RedemptionInfo_mutualFunds = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_RedemptionInfo_mutualFunds");
		              String RedemptionInfo_variableAnnuity = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_RedemptionInfo_variableAnnuity");
		              String RedemptionInfo_variableLife_UL_WL = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_RedemptionInfo_variableLife_UL_WL");
		              String RedemptionInfo_uIT = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_RedemptionInfo_uIT");
		              String Replacement_productName = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_productName");
		              String Replacement_poicyType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_poicyType");
		              String Replacement_poicyContractNumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_poicyContractNumber");
		              String Replacement_issuemm = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_issuemm");
		              String Replacement_issuedd = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_issuedd");
		              String Replacement_issueyyyy = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_issueyyyy");
		              String Replacement_FaceAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_FaceAmount");
		              String Replacement_annualPremiumAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_annualPremiumAmount");
		              String Replacement_cashValue = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_cashValue");
		              String Replacement_surrenderCharge = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_surrenderCharge");
		              String Replacement_full_Partial = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_full_Partial");
		              String Replacement_this1035 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Replacement_this1035");
		              String Recomendation_investmentAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Recomendation_investmentAmount");
		              
		              String Transaction_brokerage = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_brokerage");
		              String Transaction_Brokerage_pleaseProvide = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_Brokerage_pleaseProvide");
		              String Transaction_directMutualFunds = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_directMutualFunds");
		              String Transaction_DirectMutualFunds_pleaseProvide = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_DirectMutualFunds_pleaseProvide");
		              String Transaction_annuties = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_annuties");
		              String Transaction_Annuties_pleaseProvide = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_Annuties_pleaseProvide");
		              String Transaction_insuranceProduct = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_insuranceProduct");
		              String Transaction_InsuranceProduct_pleaseSpecify = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_InsuranceProduct_pleaseSpecify");
		              String Transaction_other = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_other");
		              String Transaction_Other_pleaseSpecify = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_Other_pleaseSpecify");
		              String RationalforWhythisrecommendation = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_RationalforWhythisrecommendation");
		              String Transaction_whywasthisproductrecommended = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_Transaction_whywasthisproductrecommended");
		              String TransactionStmt_Clientwillsubjecttonewcontingent = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_Clientwillsubjecttonewcontingent");
		              String TransactionStmt_Contractpolicybeingreplaced = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_Contractpolicybeingreplaced");
		              String TransactionStmt_Clientwillgiveupcertainbenefits = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_Clientwillgiveupcertainbenefits");
		              String TransactionStmt_Clienthadaguaranteedminimumdeathbenefit = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmmt_Clienthadaguaranteedminimumdeathbenefit");
		              String TransactionStmt_Clientmaypaytaxesonthistransaction = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_Clientmaypaytaxesonthistransaction");
		              String TransactionStmt_Registeredrepresentativeontheoriginal = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_Registeredrepresentativeontheoriginal");
		              String TransactionStmt_Clientisawareofthecontestablesuicide = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_Clientisawareofthecontestablesuicide");
		              String TransactionStmt_Replacementtheclient = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_Replacementtheclient");
		              String TransactionStmt_rolloversource = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_rolloversource");
		              String TransactionStmt_newinvestment = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "MML_TransactionStmt_newinvestment");
		             
		              MMLTransaction MML = new MMLTransaction();
		              MML.method1(rightBridgeProductProfile, FunidngResourceAdvisory, Fundingsource_brokerage, Fundingsource_directMutualFunds, Fundingsource_variableAnuity, Fundingsource_variableLife, Fundingsource_employersponser, Fundingsource_other, Fundingsource_otherPleaseSpecify, RedemptionInfo_employerSponsoredPlan, RedemptionInfo_fixedFixedIndexAnnuity,
		            		  RedemptionInfo_mutualFunds, RedemptionInfo_variableAnnuity, RedemptionInfo_variableLife_UL_WL, RedemptionInfo_uIT, Replacement_productName, Replacement_poicyType, Replacement_poicyContractNumber, Replacement_issuemm, Replacement_issuedd, Replacement_issueyyyy, Replacement_FaceAmount, Replacement_annualPremiumAmount,
		            		  Replacement_cashValue, Replacement_surrenderCharge, Replacement_full_Partial, Replacement_this1035, Recomendation_investmentAmount, Transaction_brokerage, Transaction_Brokerage_pleaseProvide, Transaction_directMutualFunds, Transaction_DirectMutualFunds_pleaseProvide, Transaction_annuties, Transaction_Annuties_pleaseProvide, Transaction_insuranceProduct,
		            		  Transaction_InsuranceProduct_pleaseSpecify, Transaction_other, Transaction_Other_pleaseSpecify, RationalforWhythisrecommendation, Transaction_whywasthisproductrecommended, TransactionStmt_Clientwillsubjecttonewcontingent, TransactionStmt_Contractpolicybeingreplaced, TransactionStmt_Clientwillgiveupcertainbenefits, TransactionStmt_Clienthadaguaranteedminimumdeathbenefit,
		            		  TransactionStmt_Clientmaypaytaxesonthistransaction, TransactionStmt_Registeredrepresentativeontheoriginal, TransactionStmt_Clientisawareofthecontestablesuicide, TransactionStmt_Replacementtheclient, TransactionStmt_rolloversource, TransactionStmt_newinvestment);
		    
		              
		              String AllaccountListed = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_AllaccountListed");
		              String AccountNumbr1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_NumberType1");
		              String AccountNo1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Number1");
		              String AccountNumbr2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_NumberType2");
		              String AccountNo2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Number2");
		              String AccountNumbr3 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_NumberType3");
		              String AccountNo3 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Number3");
		              String AccountNumbr4 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_NumberType4");
		              String AccountNo4 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Number4");
		              String AccountNumbr5 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_NumberType5");
		              String AccountNo5 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Number5");
		              String AccountNumbr6 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_NumberType6");
		              String AccountNo6 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Number6");
		              String Indiv_fulllegalname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_FullLegalName");
		              String Indiv_relationshipaccountowner = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_RelationShiptoAccountOwner");
		              String trustedContact_telephone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Telephone");
		              String Indiv_streetone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Street");
		              String Indiv_streettwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Street2");
		              String Indiv_streetThree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_street3");
		              String Indiv_city = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_City");
		              String Indiv_state = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_State");
		              String Indiv_zipCode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Zipcode");
		              
		              String wouldliketoaddJointTenantOne = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_Trustee");
		              String JointTeanent_AccountNumbr1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumberType1");		       
		              String JointTeanent_AccountNo1 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumber1");
		              String JointTeanent_AccountNumbr2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumberType2");
		              String JointTeanent_AccountNo2 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumber2");
		              String JointTeanent_AccountNumbr3 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumberType3");
		              String JointTeanent_AccountNo3 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumber3");
		              String JointTeanent_AccountNumbr4 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumberType4");
		              String JointTeanent_AccountNo4 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumber4");
		              String JointTeanent_AccountNumbr5 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumberType5");
		              String JointTeanent_AccountNo5 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumber5");
		              String JointTeanent_AccountNumbr6 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumberType6");
		              String JointTeanent_AccountNo6 = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointTenant_AccountNumber6");
		              String jointTenant_TrustedContact_fulllegalName = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointtenantrusteFullLegalName");
		              String jointTenant_TrustedContact_RelationshiptoAccountOwner = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointtenantrusteRelationShiptoAccountOwner");
		              String jointTenant_TrustedContact_Streetone = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointtenantrusteStreet");
		              String jointTenant_TrustedContact_Streettwo = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointtenantrusteStreet2");
		              String jointTenant_TrustedContact_StreetThree = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_Jointtenantrustestreet3");
		              String jointTenant_TrustedContact_City = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointtenantrusteCity");
		              String jointTenant_TrustedContact_State = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointtenantrusteState");
		              String jointTenant_TrustedContact_ZipCode = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "TrustedContact_JointtenantrusteZipcode");
		              String JointTenantfullName = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "JointTenantfullName");
		              String JointTenantSSN_tIN = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "JointTenantSSN_tIN");
		              String JointTenant_allAcountListed = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "JointTenant_allAcountListed");
		              
		              TrustedContact trustedcont=new TrustedContact();
		             
		              trustedcont.test(AllaccountListed, AccountNumbr1, AccountNo1, AccountNumbr2, AccountNo2, AccountNumbr3, AccountNo3, AccountNumbr4, AccountNo4, AccountNumbr5, AccountNo5, AccountNumbr6, AccountNo6, Indiv_fulllegalname, Indiv_relationshipaccountowner,
		            		  trustedContact_telephone, Indiv_streetone, Indiv_streettwo, Indiv_streetThree, Indiv_city, Indiv_state, Indiv_zipCode, wouldliketoaddJointTenantOne, JointTenantfullName, JointTenantSSN_tIN,
		          			 JointTenant_allAcountListed, JointTeanent_AccountNumbr1, JointTeanent_AccountNo1, JointTeanent_AccountNumbr2, JointTeanent_AccountNo2, JointTeanent_AccountNumbr3, JointTeanent_AccountNo3, JointTeanent_AccountNumbr4,
		          			 JointTeanent_AccountNo4, JointTeanent_AccountNumbr5, JointTeanent_AccountNo5, JointTeanent_AccountNumbr6, JointTeanent_AccountNo6,jointTenant_TrustedContact_fulllegalName, jointTenant_TrustedContact_RelationshiptoAccountOwner, 
		          			 jointTenant_TrustedContact_Streetone, jointTenant_TrustedContact_Streettwo, jointTenant_TrustedContact_StreetThree, jointTenant_TrustedContact_City, 
		            		  jointTenant_TrustedContact_State, jointTenant_TrustedContact_ZipCode);
		              
		              String NYvUL_CashMarketValue = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_CashMarketValue");
		              String NYvUL_AccountHolderFaceAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_AccountHolderFaceAmount");		       
		              String NYvUL_PermanentNon_VULCashMarketValue = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_PermanentNon_VULCashMarketValue");
		              String NYvUL_PermanentNon_VULFaceAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_PermanentNon_VULFaceAmount");
		              String NYvUL_TermLifeFaceAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_TermLifeFaceAmount");
		              String NYvul_SecuredLiabilities_ObligationsType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvul_SecuredLiabilities_ObligationsType");
		              String NYvUL_SecuredLiabilities_Obligations_OutstandingAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_SecuredLiabilities_Obligations_OutstandingAmount");
		              String NYvUL_Obligations_AnticiptaedDuration = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_Obligations_AnticiptaedDuration");
		              String NYvul_UnSecuredLiabilities_ObligationsType = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvul_UnSecuredLiabilities_ObligationsType");
		              String NYvUL_UnSecuredLiabilities_Obligations_OutstandingAmount = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_UnSecuredLiabilities_Obligations_OutstandingAmount");
		              String NYvUL_UnObligations_AnticiptaedDuration = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_UnObligations_AnticiptaedDuration");
		              String ClientawareOfallPolicies = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "ClientawareOfallPolicies");
		              String NYvUL_AditionalClient_basisofRecommendiation = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_AditionalClient_basisofRecommendiation");
		              String NYvUL_AditionalClient_UnfavorableConsideration = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "NYvUL_AditionalClient_UnfavorableConsideration");
		           
		              NY_VL_Supplement NY_VUL= new NY_VL_Supplement();
		              NY_VUL.AccountHolderInsuranceHoldings(NYvUL_CashMarketValue, NYvUL_AccountHolderFaceAmount, NYvUL_PermanentNon_VULCashMarketValue, NYvUL_PermanentNon_VULFaceAmount, NYvUL_TermLifeFaceAmount);
		              NY_VUL.AccountHolderLiabilitiesObligations(NYvul_SecuredLiabilities_ObligationsType, NYvUL_SecuredLiabilities_Obligations_OutstandingAmount, NYvUL_Obligations_AnticiptaedDuration);
		              NY_VUL.AccountHolderLiabilitiesObligationsTwo(NYvul_UnSecuredLiabilities_ObligationsType, NYvUL_UnSecuredLiabilities_Obligations_OutstandingAmount, NYvUL_UnObligations_AnticiptaedDuration);
		              NY_VUL.AdditionalClientInformation(ClientawareOfallPolicies, NYvUL_AditionalClient_basisofRecommendiation, NYvUL_AditionalClient_UnfavorableConsideration);
		              
		
	}

	@When("^User Selects Additional Forms details and click Next$")
	public void user_Selects_Additional_Forms_details_and_click_Next() throws IOException  {
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

	@When("^User attaches VUL required docs in the Attachments Screen and click on Next$")
	public void user_attaches_VUL_required_docs_in_the_Attachments_Screen_and_click_on_Next() throws IOException, AWTException, InterruptedException  {
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

        String Employer_sponsor_EINNumber = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "Employer_sponsor_EINNumber");
        String PlanSponsore_Authorized_fullname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlanSponsore_Authorized_fullname");
        String PlanSponsor_Authorized_lastname = ReadData.get(HooksTest.scenario.getName(),FileName,SheetName, "PlanSponsor_Authorized_lastname");
      
		QP.EmployerPlanSponsor(fullnameEmploye, plansponsor_street1, plansponsor_street2, plansponsor_city, plansponsor_state, plansponsor_zip,Employer_sponsor_EINNumber,PlanSponsore_Authorized_fullname, PlanSponsor_Authorized_lastname);
		
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
		String ProductType = ReadData.get(HooksTest.scenario.getName(), FileName,SheetName, "CI_ProductType");
		//attach.attachements();
		attach.attachDocuments(state,ProductType);

	}

	@Then("^Lock the Policy and do Wet or E sign for VUL as Required$")
	public void lock_the_Policy_and_do_Wet_or_E_sign_for_VUL_as_Required() throws IOException {
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
