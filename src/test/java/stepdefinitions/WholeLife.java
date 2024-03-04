package stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import commonutils.ExcelUtility;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclass.ALt_Add_Both_Products;
import pageclass.AcceleratedDeathBenefitLTC;
import pageclass.AdditionalForms;
import pageclass.Attachments;
import pageclass.CaseInfo;
import pageclass.Certification;
import pageclass.EntityOwner;
import pageclass.HIVConsent;
import pageclass.LTCRCoverageInformation;
import pageclass.LTCR_InsurabilityInformation;
import pageclass.LTCR_OtherCoverage;
import pageclass.LTCR_PRotectionAUP;
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
import pageclass.ProposedInsured;
import pageclass.ProposedInsuredCont;
import pageclass.QualifiedPlan;
import pageclass.TrustCertification;
import pageclass.Workbench_LaunchEzApp;
import pageclass.productwholelife;
import utilities.GetDataFromExcel;

public class WholeLife {

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
	ALt_Add_Both_Products products_alt_add= new ALt_Add_Both_Products();
	LifeOwner LO=new LifeOwner();
	TrustCertification Trust=new TrustCertification();
	AcceleratedDeathBenefitLTC ALTCR=new AcceleratedDeathBenefitLTC();
	LTCRCoverageInformation CoverageInfo= new LTCRCoverageInformation();
	LTCR_OtherCoverage LTCRoc=new LTCR_OtherCoverage();
	LTCR_PRotectionAUP PAUL= new LTCR_PRotectionAUP();
	EntityOwner EO=new EntityOwner();
	LTCR_InsurabilityInformation insuribilityInfo=new LTCR_InsurabilityInformation();
	QualifiedPlan QP=new QualifiedPlan();
	//Newyork
	
	NewYorkRegSixty NyR=new NewYorkRegSixty();
	NewYork_LifeProductsSuitability NYlps= new NewYork_LifeProductsSuitability();
	NY__NonGuaranteedElement NGE=new NY__NonGuaranteedElement();
	
	
	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();
	
	String TestDataFileName = TestPropertyFileRead.getThePropertyValue("ExcelFileName");
	String TestDataSheetName = TestPropertyFileRead.getThePropertyValue("WL_SheetName");
	
	String writeFilename = TestPropertyFileRead.getThePropertyValue("Policyinfo");
	String writeSheetname = TestPropertyFileRead.getThePropertyValue("WL_SheetName");
	int Count=0;
	int row;

	
	@Given("^Launch Fieldnet_dev application then enter User ID and click on Next (\\d+)$")
	public void launch_Fieldnet_dev_application_then_enter_User_ID_and_click_on_Next(int arg1) throws IOException {
		row = arg1;
		/*String producerID = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Execution_Preference");
		Assert.assertTrue(producerID.equals("Yes"));
		
		if(producerID.equalsIgnoreCase("No")){
			HooksTest.idriver.quit();
		}*//*else{
			Count++;
			//testdata.setCellData(writeFilename, "Execution_Count", "WL_InsuredName", rowNum, policyname);
		}*/
		System.out.println("the execution count is"+Count);
		workbenchLaunchEzApp.enterUserIDClickNext();
	}

	@Given("^enter Password and click on Verify$")
	public void enter_Password_and_click_on_Verify() throws IOException {
		workbenchLaunchEzApp.enterPasswordClickVerify();
		workbenchLaunchEzApp.clickOnFieldnetDev();
	}

	@Given("^click on SubmitNewBusiness link then click Insurance Workbench and enter ProducerID and click on search$")
	public void click_on_Submit_New_Business_and_then_click_Insurance_Workbench() throws IOException {
		String producerID = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ProducerID");
		workbenchLaunchEzApp.enterProducerNumberClickSearch(producerID);

	}

	@Given("^click on Plus icon then select environment and click on continue$")
	public void click_on_Plus_icon_then_select_environment_and_click_on_continue() throws IOException {

		String Environment = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Environment");
		workbenchLaunchEzApp.clickonSubmitNewBusinessWB(Environment);
	}

	@When("^EzApp launched and user enters Insured details and case description$")
	public void ezapp_launched_and_user_enters_Insured_details_and_case_description() throws IOException {

		String FirstName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_Firstname");
		String LastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_LastName");
		String DOBMonth = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_MM");
		String DOBDay = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_DD");
		String DOBYear = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_YYYY");
		String Gender = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_Gender");
		String CaseDescription = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_CaseDescription");
		String State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_ProductType");
		String Product = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_Product");
		caseinfo.enterCaseInfoDetails(FirstName, LastName, DOBMonth, DOBDay, DOBYear, Gender, CaseDescription);
		caseinfo.CarrierAndProduct(State, ProductType);
		caseinfo.selectProduct(Product);

	}

	@When("^select state and Product type and click on Find Available Products$")
	public void select_state_and_Product_type_and_click_on_Find_Available_Products() throws IOException {
	}

	@When("^select product variant so Application screen open$")
	public void select_product_variant_so_Application_screen_open() throws IOException {
	}

	@When("^user fills Life case setup details and NewYorkRegsixty when state is NewYork and then click on Next$")
	public void user_fills_Life_case_setup_details_and_NewYorkRegsixty_when_state_is_NewYork_and_then_click_on_Next() throws IOException  {
		String InsuredResidentState = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_InsuredResidentState");
		String insuredCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_InsuredCitizenship");
		String FaceAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_FaceAmount");
		String groupbill = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_GroupBill");
		String PlatniumPassprgm = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_PlatniumPassprgm?");
		String LifeconvInsurabilityOpt = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_insurabilityoptionexercise?");
		String PolicyUnderwriting = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_policyrequireunderwriting?");
		String registeredbrokerwithMMLIS = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_ MMLISRegistered Rep?");
		String QualifiedPlan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_qualifiedplan?");
		String WithdrawalFromRetirementAccount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_FinancialServicesRepresentative?");
		String PenalityTaxAmountWithdrawn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_Account10%PurchaseThisPolicy?");
		String HardshipWidrawal = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_hardshipwithdrawal?");
		String Retirement_paythepremiums = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_retirement_account_pay_the_premiums?");
		String SurrenderChargeAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_surrenderchargeamount?");
		String PrimaryPurposeLifeInsurance = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_Whatistheprimarypurpose");
		String BothLifenDIquestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_DIPolicyonthesameapplication?");
		String InsuredonlyOwnerquestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_owneronallpolicies?");
		String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_Indiviual or EntityOWner");
		String OwnerState = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_OwnerState");
		String EntityTrust = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_EntityisaTrust");
		String RightToExistingDIPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_ existingDIpolicy?");
		String HoldIssue = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_HoldIssue");
		String BackdateSaveAge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_Backdatetosaveage?");
		String PolicyDating = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_PolicyDating");
		String SpecificDateMonth = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_SpecificDate_MM");
		String SpecificDateDay = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_SpecificDate_DD");
		String SpecificDateYear = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_pecificDate_YYYY");
		String SubmittingAgency = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_SubmitAgency");
		String StateofOwnersign = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_OwnerState");
		String Countryowner = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_Country");
		String CityofOwnersign = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_OwnerCity");
		String QuickClose = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_QuickClose");
		String Agentfirm = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "listFirm");
		//TestData for NY state
		String State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		String Lapsed = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NyReg_LAPSED_SURRENDERED");
		String CashValues = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NyReg_OTHER_CASH_VALUES");
		String tobeInforce = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NyReg_CONTINUE_TO_BE_IN_FORCE");
		String Reissued = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NyReg_REISSUED_WITH_REDUCTION");
		String Collateral = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NyReg_ASSIGNED_AS_COLLATERAL");
		String Premium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NyReg_PREMIUM PAID");
		String externalReplacement = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NyReg_EXTERNAL_REPLACEMENT");
		String FirmsListdisplay = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "FirmsListdisplay");
		
		String SalesPerson_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "SalesPerson_YesNo");
		String SalesFirstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "SalesFirstname");
		String salesLastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "SalesLastName");
		String ApexMMLIS = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_ApexMMLIS");
		String ApexResultOfRightBridge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_ApexResultOfRightBridge");
		
		String ApexOwner_MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Owner_MM");
		String ApexOwner_DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Owner_DD");
		String ApexOwner_YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Owner_YYYY");
		String LCS_IsPolicyJointlyOwned = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LCS_IsPolicyJointlyOwned");
		lifecasesetup.enterLifeCaseSetup(InsuredResidentState, insuredCitizenship, FaceAmount, groupbill,
				PlatniumPassprgm, LifeconvInsurabilityOpt, PolicyUnderwriting,registeredbrokerwithMMLIS,ApexMMLIS,ApexResultOfRightBridge, QualifiedPlan, WithdrawalFromRetirementAccount,
				PenalityTaxAmountWithdrawn, HardshipWidrawal, Retirement_paythepremiums, PrimaryPurposeLifeInsurance,
				SurrenderChargeAmount);
		lifecasesetup.RadioQuestionTwo(BothLifenDIquestn, RightToExistingDIPolicy, InsuredonlyOwnerquestn,Indiviual_Entity,LCS_IsPolicyJointlyOwned,
				OwnerState,ApexOwner_MM,ApexOwner_DD,ApexOwner_YYYY, EntityTrust,HoldIssue,BackdateSaveAge, PolicyDating, SpecificDateMonth, SpecificDateDay, SpecificDateYear, SubmittingAgency,
				Agentfirm,FirmsListdisplay,StateofOwnersign, Countryowner, CityofOwnersign, QuickClose,SalesPerson_RD,
				SalesFirstname,salesLastName);
		
		
		String individualsigningYes_No = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "individualsigningYes_No");
		String firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PisigningOff_firstname");
		String Lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PisigningOff_Lastname");
		String suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PisigningOff_suffix");
		String relationshiptoInsured = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "relationshiptoInsured");
		lifecasesetup.individualsigning1(individualsigningYes_No, firstname, Lastname, suffix, relationshiptoInsured);
		
		NyR.NeyworkReg(State,Lapsed, CashValues, tobeInforce, Reissued, Collateral, Premium, externalReplacement);
	}

	@When("^user fills Primary Insured details and click on Next$")
	public void user_fills_Primary_Insured_details_and_click_on_Next() throws IOException {
		String Suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "PI_Suffix");
		String Birth_state = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_BirthState");
		String ssn = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "PI_SSN");
		String RESADDStreet1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_AddressStreet1");
		String RESADDStreet2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_AddressStreet2");
		String RESADDCity = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "PI_City");
		String RESADDZIP = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "PI_Zip");
		String MailingADD = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_MailAdd");
		String MailingStreet1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_ALT_ AddressStreet1");
		String MailingStreet2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_ALT_AddressStreet2");
		String MailingCity = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_ALT_City");
		String MailingState = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_ALT_State");
		String MailingZIPPostalCode = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_ALT_Zip");
		String PreferredPhoneNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Phone");
		String HomeWorkMobile = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_HomeWork");
		String WorkExtension = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Extension");
		String AlternatePhoneNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Alt_Phone");
		String AlterHomeWorkMobile = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Alt_HomeWork");
		String AlternateExtesnion = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Alt_Extension");
		String AmPM = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "PI_BestTime");
		String Besttimetocall = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_BesttimetoCall");
		String ReciveText_BD = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Message");
		String NeedspecialAccomidation = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Accomodation");
		String preferredlanguage = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_PrefferedLang");
		String EmailAddress = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PI_Email");
		Proposedinsure.personal_Information(Suffix, Birth_state, ssn);
		Proposedinsure.Address(RESADDStreet1, RESADDStreet2, RESADDCity, RESADDZIP, MailingADD, MailingStreet1,
				MailingStreet2, MailingCity, MailingState, MailingZIPPostalCode);
		Proposedinsure.Additionalinfo(PreferredPhoneNumber, HomeWorkMobile, WorkExtension, AlternatePhoneNumber,
				AlterHomeWorkMobile, AlternateExtesnion, AmPM, ReciveText_BD, Besttimetocall, NeedspecialAccomidation,
				preferredlanguage, EmailAddress);
	}

	@When("^user fills Primary Insured Cont details and click on Next$")
	public void user_fills_Primary_Insured_Cont_details_and_click_on_Next() throws IOException  {
		String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_U.S.DriversLicense");
		String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_IdentificationNumber");
		String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_ReaspnWhy");
		String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_TypeOfIdentification");
		String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_StateProvinceofIssue");
		String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_Other");
		String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_TypeofCitizenship");
		String Expr_MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LOC_Exp_MM");
		String Expr_DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LOC_Exp_DD");
		String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LOC_Exp_YYYY");
		PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
				PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
				TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
	}

	@When("^user fills Personal History Information details and click on Next$")
	public void user_fills_Personal_History_Information_details_and_click_on_Next() throws IOException {
		String InsuredDisability = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_applyingdisabilitybenefits");
		String InsuredDisabilityDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_applyingdisabilitybenefits_Details");
		String Tobaccoin12M = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Withinthelast12months");
		String Tobaccoin12MDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Withinthelast12months_Details");
		String Tobaccoin24M = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Withinthelast24months");
		String Tobaccoin24MDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Withinthelast24months_Details");
		String Cigarin24M = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Cigarswithinthelast24months");
		String Cigarin24count = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Cigarswithinthelast24months_NOofcigarsperyear");
		String PrescriptionMedicationin12M = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_assistwithsmokingcessation");
		String PrescriptionMedicationin12MDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_assistwithsmokingcessation_Details");
		String ConvictedProbation = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_paroleorprobation");
		String ConvictedProbationDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_paroleorprobation_Details");
		String ConvictedwithAlcoholin2Y = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_influenceofalcoholwithin5yrs");
		String ConvictedwithAlcoholin2YDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_influenceofalcoholwithin5yrs_Details");
		String Accidentin3Y = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_foundtobeatfault");
		//have to include in testdata
		String Faultmotorvehicleaccident = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Atfaultmotorvehicleaccident?");
		String FaultmotorvehicleaccidentHowMany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Atfaultmotorvehicleaccident?_Howmany");
		String FaultmotorvehicleaccidentWhen1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Atfaultmotorvehicleaccident?_When1");
		String FaultmotorvehicleaccidentWhen2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Atfaultmotorvehicleaccident?_When2");
		String FaultmotorvehicleaccidentWhen3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Atfaultmotorvehicleaccident?_When3");
		String Speedingticket = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Speedingticket?");
		String Lessthan15milesspeedlimit = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Lessthan15milesoverthespeedlimit?");
		String Lessthan15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Lessthan15milesoverthespeedlimit?_Howmany");
		String Lessthan15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Lessthan15milesoverthespeedlimit?_When1");
		String Lessthan15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Lessthan15milesoverthespeedlimit?_When2");
		String Lessthan15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Lessthan15milesoverthespeedlimit?_When3");
		String Greaterthanorequal15milesspeedlimit = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Greaterthanorequalto15milesoverthespeedlimit?");
		String Greaterthanorequal15milesspeedlimitHowmany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Greaterthanorequalto15milesoverthespeedlimit?_Howmany");
		String Greaterthanorequal15milesspeedlimitWhen1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Greaterthanorequalto15milesoverthespeedlimit?_When1");
		String Greaterthanorequal15milesspeedlimitWhen2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Greaterthanorequalto15milesoverthespeedlimit?_When2");
		String Greaterthanorequal15milesspeedlimitWhen3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Greaterthanorequalto15milesoverthespeedlimit?_When3");
		String Suspendedlicense = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Suspendedlicense?");
		String Suspenedlicenseduetononpayment = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Suspenedlicenseduetononpaymentofchildsupport?");
		String Whenwasthelicensesuspended = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Whenwasthelicensesuspended?");
		String Reasonforsuspension = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Reasonforsuspension?");
		String Hasitbeenreinstated = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Hasitbeenreinstated?");
		String Whenreinstated = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Whenreinstated?");
		String Recklessdriving = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Recklessdriving?");
		String Recklessdrivinghowmany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Recklessdriving?_Howmany?");
		String RecklessdrivingWhen1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Recklessdriving?_When1");
		String RecklessdrivingWhen2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Recklessdriving?_When2");
		String RecklessdrivingWhen3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Recklessdriving?_When3");
		String CarelessDriving = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Carelessdriving?");
		String CarelessDrivinghowmany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Carelessdriving?_Howmany?");
		String CarelessDrivingWhen1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Carelessdriving?_When1");
		String CarelessDrivingWhen2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Carelessdriving?_When2");
		String CarelessDrivingWhen3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Carelessdriving?_When3");
		String Movingviolation = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Movingviolation?");
		String MovingviolationHowmany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Movingviolation?_Howmany?");
		String MovingviolationWhen1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Movingviolation?_When1");
		String MovingviolationWhen2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Movingviolation?_When2");
		String MovingviolationWhen3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PH_Movingviolation?_When3"); 
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
	}

	@When("^user fills Personal History Information cont one details and click on Next$")
	public void user_fills_Personal_History_Information_cont_one_details_and_click_on_Next() throws IOException {
		String State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		String AntcptForgnTravelQuestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC1_thenext2years");
		String HaveAgmtToBcmArmedforcesQuestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC1_oftheArmedForces");
		String ExpectedMemberofPilotQuestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC1_studentpilotormemberofanyaircraft");
		String TakePartinUnderwaterdivingHangglidParaSailing = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC1_hanggliding_parasailing");
		String ultralight_soaring_ballooning = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC1_ultralight_soaring_ballooning");
		String motorboat_snowmobile = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC1_motorboat_snowmobile");
		// Need to implement more
		String PhysicianType = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"PhysicianType");
		String Firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"FirstName");
		String MiddleName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "MidleName");
		String LastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LastName");
		String Suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Suffix");
		String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Street1");
		String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Street2");
		String City = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"City");
		String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"State");
		String Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "pinCode");
		String Telephone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Telephonenumber");
		String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Month");
		String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"date");
		String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Year");
		String TimeFrameLastSeen = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"TimeFrameLastScene");
		String Details = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Details");
		String FacilityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Office/Facility Name");
		PHCOne.enterPersonalHistoryInformationContOneDetails(State,AntcptForgnTravelQuestn, HaveAgmtToBcmArmedforcesQuestn,
				ExpectedMemberofPilotQuestn, TakePartinUnderwaterdivingHangglidParaSailing,ultralight_soaring_ballooning,
				motorboat_snowmobile,PhysicianType, Firstname, MiddleName, LastName, Suffix, street1, street2, City,
				 state, Zip, Telephone, MM, DD, YYYY, TimeFrameLastSeen, Details, FacilityName);

	}

	@When("^user fills Personal History Information cont two and and click on Next$")
	public void user_fills_Personal_History_Information_cont_two_and_and_click_on_Next() throws IOException {
		String ProposedInsuredIS_questn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_Theproposedinsuredis");
		String EmpCurrentOcc = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-CurrentOccupation");
		String EmpDuties = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PHC2_EMP-Duties");
		String EmployerName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP_Employer/BusinessName");
		String EmployerCountry = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-Country");
		String EmployerStree1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-Street1");
		String EmployerStree2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-Street2");
		String EmployerStree3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-Street3");
		String EmployerCity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PHC2_EMP-City");
		String EmployerState = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PersonalHistoryC2_EMP-State");
		String EmployerZip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PersonalHistoryC2_EMP-Zip");
		String EarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-EarnedIncome-CurrentYear");
		String EarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-EarnedIncome-PriorYear");
		String UNEarnedIncmCurrentYear = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-UnEarnedIncome-CurrentYear");
		String UNEarnedIncmPriorYear = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_EMP-UnEarnedIncome-PriorYear");
		String EmpNetworth = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PHC2_EMP-NetWorth");
		String UnEmpReason = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_UNEMP-UnemployedReason");
		String AnnHouseEarnedIncm = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_UNEMP-AnnualHouseholdEarnedIncome");
		String HouseholdNetworth = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_UNEMP-HouseholdNetWorth");
		String AnnHouse_UNEarnedIncm = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_UNEMP-AnnualHouseholdUnearnedIncome");
		String OthercovWorkingspous = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PHC2_OtherCoverageOnWorkingSpouse");
		PHCTwo.enterPersonalHistContTwo_screenDetails(ProposedInsuredIS_questn, EmpCurrentOcc, EmpDuties, EmployerName,
				EmployerCountry, EmployerStree1, EmployerStree2, EmployerStree3, EmployerCity, EmployerState,
				EmployerZip, EarnedIncmCurrentYear, EarnedIncmPriorYear, UNEarnedIncmCurrentYear, UNEarnedIncmPriorYear,
				EmpNetworth, UnEmpReason, AnnHouseEarnedIncm, HouseholdNetworth, AnnHouse_UNEarnedIncm,
				OthercovWorkingspous);

	}

	@When("^user fills whole Life details and click on Next$")
	public void user_fills_whole_Life_details_and_click_on_Next() throws IOException {
		String AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WL_AutomaticPremiumLoan");
		String LoanRate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WL_LoanRate");
		String dividendoption = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WLP_DividendOption");
		String Waiver = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_WaiverofPremium(for Disability)Rider");
		String AlternateAdditionalPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ alternate_additional policy");
		String Plan_Product_Alt = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Plan_Product_alternate");
		String Plan_Product_Add = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Plan_Product_additional");
		String Rider_Ltcr = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WLP_LTCR_Rider");
		String RenwalTermRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WLP_RenwelTermRider");
		String RenwalTermRideramount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_RenwelTermRiderAmount");
		String ALIR = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALIR");
		String ModalPayment = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALIR_ModalPayment");
		String ALIRModal1035 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALIR_ALIRModal1035");
		String no_of_years = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALIR_numberofYears");
		String lumpsum = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALIR_Unsheduled_Lump");
		String ALIRLump1035 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALIR_ALIRLump1035");
		String DividendOption = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALIR_DividentOption");
		String PlannedALIR = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_PlannedALIR");
		String  one035funds = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_PlannedALIR_1035funds");
		
		
		String GIRAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"GIRAmount");
		String LISRamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LISRamount");
		String LISRModalPayment = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LISRModalPayment");
		String LISRlumsum = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LISRlumsum");
		String GIR = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"GIR");
		String LISR = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LISR");
		
		pwl.wholelife(AutomaticPremiumLoan, LoanRate, dividendoption);
		pwl.OptionalRiders(Waiver, Rider_Ltcr, RenwalTermRider, RenwalTermRideramount,GIR,GIRAmount,LISR,LISRamount,LISRModalPayment,LISRlumsum, ALIR, ModalPayment,ALIRModal1035,
				no_of_years, lumpsum,ALIRLump1035, DividendOption, PlannedALIR, one035funds, AlternateAdditionalPolicy, Plan_Product_Alt, Plan_Product_Add);
		//Alt and Addproduct
		String Alt_Faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Alt_FaceAmount");
		String ALT_WavierOfPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WLP_Alt_WavierOfPemiumrider");
		String ALT_AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WLP_Alt_AutomaticPremiumLoan_UL");
		String ALT_LoanRate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Alt_LoanRate_UL");
		String ALT_DividentOption_WL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Alt_DividentOption_UL");
		String Alt_WLPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ALT_WaiverOfPremiumRider");
		String ALT_PlannedAmount_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Alt_PlannedAmount_UL");
		String ALT_unsheduledPremium_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Alt_unsheduledpremium_UL");
		String ADD_Faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Add_FaceAmount");
		String ADD_WavierOfPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WLP_Add_WavierOfPemiumrider");
		String ADD_AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WLP_Add_AutomaticPremiumLoan_UL");
		String ADD_LoanRate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Add_LoanRate_UL");
		String ADD_DividentOption_WL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Add_DividentOption_UL");
		String ADD_WLPremiumRider = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_ADD_WaiverOfPremiumRider");
		String ADD_PlannedAmount_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Ad_PlannedAmount_UL");
		String ADD_unsheduledPremium_UL = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Add_unsheduledpremium_UL");
		String Alt_UL_intialpremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Alt_UL_intialpremium");
		String Add_UL_intialpremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"WLP_Add_UL_intialpremium");
		
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
		//AcceleratedDeathBene
		String DressingEatingTransferring = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"DressingEatingTransferring");
		String AIDS_HIV = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AIDS_HIV");
		String AlzheimerDisease = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AlzheimerDisease");
		String GehrigsDisease = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"GehrigsDisease");
		String CerebralPalsy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"CerebralPalsy");
		String Fibrosis = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Fibrosis");
		String Dementia = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Dementia");
		String Chorea = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Chorea");
		String Diabetes = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Diabetes");
		String Dialysis = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Dialysis");
		String Cirrhosis = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Cirrhosis");
		String Sclerosis = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Sclerosis");
		String Dystrophy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Dystrophy");
		String Myasthenia = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Myasthenia");
		String OrganicBrain = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"OrganicBrain");
		String Paralysis = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Paralysis");
		String  Parkinson = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Parkinson");
		String Stroke = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Stroke");
		String PRELIM_TIA = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PRELIM_TIA");
		String Schizophrenia = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Schizophrenia");
		String  Lupus = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Lupus");
		String  Wheelchair = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Wheelchair");
		//LTCR CoverageInformation
		String Intialmaxbenefit = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Intialmaxbenefit");
		String MonthlybenefitIncrease = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"MonthlybenefitIncrease");
		String benefitperiod = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"benefitperiod");
		String faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"faceamount");
		String BaseBenefitpool = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"BaseBenefitpool");
		String  DividendsBaseBenefit = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"DividendsBaseBenefit");
		//LTCROtherCoverage
		String ExistingLTC = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"ExistingLTC");
		String OtherPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"OtherPolicy");
		String OCOV_Replace = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"OCOV_Replace");
		String DisabilityBenefit = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"DisabilityBenefit");
		String Medicaid = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Medicaid");
		
		//LTCR ProtectionAgainstUnintentionalLapse
		String PINotDesignate_Designate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_PINotDesignate_Designate");
		String PIfirstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_Pifirstname");
		String PImiddle = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_Pimiddle");
		String PIlastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_LastName");
		String suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_Suffix");
		String PIstreet1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_Street1");
		String PIstreet2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_Street2");
		String  PIcity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_City");
		String PIstate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_state");
		String PIZip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_Zip");
		String PO_NotDesignate_Designate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_PO_NotDesignate_Designate");
		String  PO_firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POfirstname");
		String  PO_middle = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POmiddle");
		String PO_lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POLastName");
		String PO_suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POSuffix");
		String PO_street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POStreet1");
		String  PO_street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POStreet2");
		String  PO_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POCity");
		String PO_state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POstate");
		String  PO_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PAUL_POZip");
		
		//LTCR_InsuribilityInformation
		String INS_Declined = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_Declined");
		String INS_DeclinedDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_DeclinedDetails");
		String INS_NeedsHelp = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_NeedsHelp");
		String INS_NeedsHelpNoDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_NeedsHelpNoDetails");
		String INS_Amnesia = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_Amnesia");
		String INS_AmnesiaDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_AmnesiaDetails");
		String INS_Joint = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_Joint");
		String  INS_JointDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_JointDetails");
		String INS_Ataxia = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_Ataxia");
		String INS_AtaxiaDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_AtaxiaDetails");
		String INS_Motion = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_Motion");
		String  INS_MotionDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_MotionDetails");
		String  INS_MemLoss = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_MemLoss");
		String INS_MemLossDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_MemLossDetails");
		String INS_Tremors = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_Tremors");
		String INS_TremorsDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_TremorsDetails");
		String  INS_Fall = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_Fall");
		String  INS_FallDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_FallDetails");
		String medication = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_medication");
		String  doseAndFrequency = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_doseAndFrequency");
		String doctor = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_doctor");
		String reason = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_reason");
		String dateStarted = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_dateStarted");
		String dateStopped = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"INS_dateStopped");
		
		
	
		// Alt and Add
		
		// additional Riders
		ALTCR.Rider(DressingEatingTransferring, AIDS_HIV, AlzheimerDisease, GehrigsDisease, CerebralPalsy, Fibrosis, Dementia, Chorea, Diabetes, Dialysis, Cirrhosis,
				Sclerosis, Dystrophy, Myasthenia, OrganicBrain, Paralysis, Parkinson, Stroke, PRELIM_TIA, Schizophrenia, Lupus, Wheelchair);
		//LTCRCoverageinfo
		CoverageInfo.CoverageInformation(Intialmaxbenefit, MonthlybenefitIncrease, benefitperiod, faceamount, BaseBenefitpool, DividendsBaseBenefit);
		//LTCROtherCoverage
		LTCRoc.LTCR_OtherCoverageRiders(ExistingLTC, OtherPolicy, OCOV_Replace, DisabilityBenefit, Medicaid);
		//protectionAgainstUnintentialLapse
		PAUL.LTCRprotectionAgainstUL(PINotDesignate_Designate, PIfirstname, PImiddle, PIlastname, suffix, PIstreet1, PIstreet2,
				PIcity, PIstate, PIZip, PO_NotDesignate_Designate, PO_firstname, PO_middle, PO_lastname, PO_suffix, PO_street1,
				PO_street2, PO_city, PO_state, PO_Zip);
		insuribilityInfo.insurablityInformation(INS_Declined, INS_DeclinedDetails, INS_NeedsHelp, INS_NeedsHelpNoDetails, INS_Amnesia,
				INS_AmnesiaDetails, INS_Joint, INS_JointDetails, INS_Ataxia, INS_AtaxiaDetails, INS_Motion, INS_MotionDetails, INS_MemLoss,
				INS_MemLossDetails, INS_Tremors, INS_TremorsDetails, INS_Fall, INS_FallDetails, medication, doseAndFrequency, doctor, reason,
				dateStarted,dateStopped);
	}

	@When("^user fills Life Purpose of Insurance details and click on Next$")
	public void user_fills_Life_Purpose_of_Insurance_details_and_click_on_Next() throws IOException {
		String LPOI_Personal = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LPOI_Personal");
		String LPOI_sponserdplan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LPOI_Isthispolicybeingpurchasedinconnectionwithanemployer_sponsoredplan?");
		String LPOI_policybecollaterallyassigned = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LPOI_Willthispolicybecollaterallyassigned?");
		String LPOI_Insurance_Type = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LPOI_Type");
		String LPOI_nameofAssigne = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_CompleteNameofAssignee:");
		String LPOI_Assignee_Street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_Street1");
		String LPOI_Assignee_Street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_Street2");
		String LPOI_Assignee_City = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_City");
		String LPOI_Assignee_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_State");
		String LPOI_Assignee_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_Zip");
		String LPOI_Assignee_phone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_phone");
		String LPOI_Assignee_Homeworkcell = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_Homeworkmobile");
		String LPOI_Assignee_Extension = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Assignee_Extension");
		String LPOI_EconomicIncntvFreeQuestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_HastheProposedInsured(s)and_ortheProposedPolicyOwner(s)beenofferedanyeconomicincentivesuchas'free'");
		String LPOI_EconomicIncntvFreeQuestn_details = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Details:");
		String LPOI_Does_the_Proposed_Insured = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_DoestheProposedInsured(s)and/ortheProposedPolicyOwner(s)haveacurrentagreementorcommitmenttosell");
		String LPOI_Does_the_Proposed_Insured_details = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_commitmenttosell_Details:");
		String LPOI_Is_the_policy_directly_or_indirectly = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Isthepolicydirectlyorindirectlyownedbyacaptiveinsurancecompany");
		String LPOI_Is_the_policy_directly_or_indirectly_details = testdata.get(HooksTest.scenario.getName(),
				"WholeLife_TestData",TestDataSheetName, "LPOI_captiveinsurancecompany_Details:");
		String LPOI_Will_the_source_of_any_premium_payments = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPOI_Willthesourceofanypremiumpaymentsbeassetsoforfromcontributionstoacaptiveinsurancecompany?");
		String LPOI_Will_the_source_of_any_premium_payments_details = testdata.get(HooksTest.scenario.getName(),
				"WholeLife_TestData",TestDataSheetName, "LPOI_Willthesourceofanypremium_Details:");
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
	@When("^user fills Life Owner details and Life Owner cont then click on Next$")
	public void user_fills_Life_Owner_details_and_Life_Owner_cont_then_click_on_Next() throws Throwable {
		String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_Indiviual or EntityOWner");
		String InsuredonlyOwnerquestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_owneronallpolicies?");
		if(Indiviual_Entity.equalsIgnoreCase("Indiviualowner") && InsuredonlyOwnerquestn.equalsIgnoreCase("No") ){
			String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_IndividualOwnerType");
			String firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_street2");
			String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_state");
			String Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_extension");
			String email = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_email");
			String relationship = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_SSN");
			//LifeOwner Continuous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LOC_Exp_YYYY");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//lifeownerContinuous
			PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
		
	}
	@When("^user fills JointContigent Owner cont setup details and click on Next$")
	public void user_fills_JointContigent_Owner_cont_setup_details_and_click_on_Next() throws Throwable {
		String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_Indiviual or EntityOWner");
		String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_IndividualOwnerType");
		String InsuredonlyOwnerquestn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LCS_owneronallpolicies?");
		if (indiviualOwnertype.equalsIgnoreCase("One individual owner during his/her lifetime and thereafter a contingent owner and thereafter the Insured")&& InsuredonlyOwnerquestn.equalsIgnoreCase("No") && Indiviual_Entity.equalsIgnoreCase("Indiviualowner")) {
			String firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_street2");
			String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_state");
			String Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_extension");
			String email = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_email");
			String relationship = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName, "LO_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(),TestDataFileName, TestDataSheetName,"LO_SSN");
			//jointcontigentowner continous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LOC_Exp_YYYY");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//jointcontigentowner continous
			PI_cont.identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
	}
	@When("^user fills EntityOwner and Trust Certification details and click on Next$")
	public void user_fills_EntityOwner_and_Trust_Certification_details_and_click_on_Next() throws Throwable {
		
		String Entitytype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_TypeofEntityOwnership");
		String SpecificEntityType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_SpecifyType");
		String EntityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NameOfEntity_or Trust");
		String ProposedInsuredDirector = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_ProposedInsuredaDirector");
		String EntityMaxfaceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_MaxFaceAmount");
		String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "DateOfTrust_MM");
		String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"DateOfTrust_DD");
		String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "DateOfTrust_YYYY");
		String TypeofTrust = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "TypeOfTrust(Yes_revoc/No_Irrevoc");
		String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Enity_SameasAddress");
		String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_Stree1");
		String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Entity_Street2");
		String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_City");
		String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_State");
		String Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Entity_Zip");
		String Mailingadd = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_MailAdd");
		String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Entity_MailingStreet1");
		String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Entity_MailingStreet2");
		String Mail_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_MailingCity");
		String Mail_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_MailState");
		String Mail_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Entity_MailZip");
		String SSN_EIN = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Entity_SSn_OR_EIN");
		String SSN_EINnumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Entity_SSN_EINNumber");
		String TypeOfCitizenship = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Entity_TypeOfCitizenship_UsEntity(Yes)_Foreign(No)");
		//TrustCertificaiton
		String TrusteeType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Trustee_Type");
		String FirstName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Trustee_Indiviual/Entity_firstName");
		String MiddleName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Trustee_Indiviual/Entity_MiddleName");
		String LastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Trustee_Indiviual/Entity_LastName");
		String Suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Trustee_Indiviual/Entity_Suffix");
		String email = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Trustee_Indiviual/Entity_Email");
		String trustEntityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Trustee_EntityName");
		String title = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Trustee_entityTitle");
		
		String Grantortype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_Type");
		String GrantorFirstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_Indiviual/Entity_firstName");
		String GrantorMiddlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_Indiviual/Entity_MiddleName");
		String GrantorLastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_Indiviual/Entity_LastName");
		String Grantorsuffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_Indiviual/Entity_Suffix");
		String Grantorcountry = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_Indiviual/Entity_CountyCitizen");
		String mm = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_DOB_MM");
		String dd = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_DOB_DD");
		String yyyy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_DOB_YYYY");
		String ssn = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_INDIV_SSN_ITN");
		String AddressSamePI = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_AddressSameAsPI");
		String streetone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_IndivEntity_Stree1");
		String streettwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_IndivEntity_Stree2");
		String City = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_IndivEntity_City");
		String Grantorstate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_IndivEntity_State");
		String zipcode = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_IndivEntity_Zipcode");
		String GrantorEntityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Grantor_EntityName");
		String TaxPayerno = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Grantor_TaxpayerId");
		
		String RelationShipBene = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"Relationto Bene");
		String RelationshipOtherDtls = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "RelationshipOtherDtls");
		String AuthorizeTrusteee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"AuthorizeTrusteee");
		String viaticalCompany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "viaticalCompany");
		String RelationGrantor = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "RelationGrantor");
		String SigningTrustee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"SigningTrustee");
		//Apex
		String Signertitle = testdata.get(HooksTest.scenario.getName(), TestDataFileName,TestDataSheetName,"Entity_SignerTitle");
		String SolefiicerYesNo = testdata.get(HooksTest.scenario.getName(), TestDataFileName,TestDataSheetName, "Entity_SoleOfficer_Yes_No");
		String SoleFirstName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,TestDataSheetName, "Entity_Sole_FirstName");
		String SoleLastName = testdata.get(HooksTest.scenario.getName(), TestDataFileName,TestDataSheetName,"Entity_soleLastName");
		String VULBussinesphoneno = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "RelationGrantor");
		String VULphonetype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"SigningTrustee");
		
		EO.Entityowner(Entitytype, SpecificEntityType, EntityName, ProposedInsuredDirector, EntityMaxfaceamount, MM, DD, YYYY, TypeofTrust);
		EO.Address(AddresssameasPI, street1, street2, city, state, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State, Mail_Zip, Signertitle, SolefiicerYesNo, SoleFirstName, SoleLastName, SSN_EIN, SSN_EINnumber, TypeOfCitizenship,
				VULBussinesphoneno, VULphonetype);
		Trust.trustees_Grantor(TrusteeType, FirstName, MiddleName, LastName, Suffix, email,
				trustEntityName, title, Grantortype, GrantorFirstname, GrantorMiddlename, GrantorLastname, 
				Grantorsuffix, Grantorcountry, mm, dd, yyyy, ssn, AddressSamePI, streetone, streettwo, City, Grantorstate,
				zipcode, GrantorEntityName, TaxPayerno);
		Trust.BeneficiaryInformation(RelationShipBene, RelationshipOtherDtls, AuthorizeTrusteee, viaticalCompany, RelationGrantor, SigningTrustee);
	}

	@When("^user fills Life Beneficiaries details and click on Next$")
	public void user_fills_Life_Beneficiaries_details_and_click_on_Next() throws IOException {
		String LB_Distributiontype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_BusinessSupplement_DistributionType");
		String LB_beneaddition_yesorNo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_Beneficiary_ClickHeretoAdd");
		String LB_Beneficiary_Type = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_Beneficiary_Type");
		String LB_firstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_FirstName");
		String LB_Middlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_M.I.");
		String LB_Lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_LastName");
		String LB_suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_Suffix");
		String LB_MAilingadd_yesorNo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_MailingAddresssameasPrimaryInsured?");
		String LB_HomeWorkMobile = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_HomeWorkMobile");
		String LB_phonenumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_PhoneNumber");
		String LB_Extension = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_Extension");
		String LB_Month = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_DOB_MM");
		String LB_Date = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_DOB_DD");
		String LB_Year = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_DOB_YYYY");
		String LB_TinType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_TINType");
		String LB_SSNno = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LB_NI_TaxIDNo");
		String LB_RelationShip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_RelationshiptoInsured");
		String LB_Distribution = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_Distribution");
		String LB_IssueStripes = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_NI_Issueperstirpes");
		
		String LB_WouldyouliketonameaCustodian = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_WouldyouliketonameaCustodian");
		String LB_Custodian_First = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_Custodian_First");
		String LB_Custodian_MI = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_Custodian_MI");
		String LB_Custodian_Last = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_Custodian_Last");
		String LB_Custodian_Suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_Custodian_Suffix");
		String LB_Custodian_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LB_Custodian_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_ProductType");
		LifeBene.distribution_Type(LB_Distributiontype);
		LifeBene.beneficiary_addition(ProductType,LB_beneaddition_yesorNo, LB_Beneficiary_Type, LB_firstname, LB_Middlename,
				LB_Lastname, LB_suffix, LB_MAilingadd_yesorNo, LB_HomeWorkMobile, LB_phonenumber, LB_Extension,
				LB_Month, LB_Date, LB_Year, LB_TinType, LB_SSNno, LB_RelationShip, LB_Distribution, LB_IssueStripes);
	
		LifeBene.custodian(LB_WouldyouliketonameaCustodian, LB_Custodian_First, LB_Custodian_MI, LB_Custodian_Last,
				LB_Custodian_Suffix, LB_Custodian_State);
	}

	@When("^user fills Other Coverage or Replacement details and click on Next$")
	public void user_fills_Other_Coverage_or_Replacement_details_and_click_on_Next() throws IOException {
		String State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		String LOC_field1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LifeOtherCoverage_textfield1");
		String LOC_field2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LifeOtherCoverage_textfield2");
		String LOC_fieldtext2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LifeOtherCoverage_textfield3");
		String LOC_field3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LifeOtherCoverage_(excludingMassMutual)thatarenotbeingreplaced/changed?");
		String LOC_field4 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LifeOtherCoverage_rannuitycontractinforcewithMassMutualorothercompanies?");
		String NYAppliedWithMassMutual = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NYAppliedWithMassMutual");
		String NYinsthatwillbeplacedwithMM= testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NYinsthatwillbeplacedwithMM");
		String NYinforcewithMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NYinforcewithMM");
		String NYreplacedchanged = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NYreplacedchanged");
		String NYcontractinforcewithMassMutual = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"NYcontractinforcewithMassMutual");
		LOC.othercoverage(State,LOC_field1, LOC_field2, LOC_fieldtext2, LOC_field3, LOC_field4,NYAppliedWithMassMutual,NYinsthatwillbeplacedwithMM ,NYinforcewithMM
				,NYreplacedchanged,NYcontractinforcewithMassMutual);
	}

	@When("^user fills Life Payment Information details and click on Next$")
	public void user_fills_Life_Payment_Information_details_and_click_on_Next() throws IOException {
		String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		String Billing= testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPI_BillingType");
		String freq_M = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPI_Frequnecy");
		String Initialpremiumbeingsubmitted = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPI_remium being submitted with this Application?");
		String premiumpayor = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPI_Premium Payor");
		String PremincludeLoanorPremFinancing = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPI_ include a loan or premium financing?");
		String selectPRemium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_PayInfoSourceOfPremium");
		String selectPRemiumotherdetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"NY_PayInfoSourceOfPremium_otherdetails");

		lpinfo.life_pay_field_entry(state,freq_M,Billing,  Initialpremiumbeingsubmitted, premiumpayor, PremincludeLoanorPremFinancing,selectPRemium,selectPRemiumotherdetails);

	}

	@When("^user fills Certification or Requirements details and click on Next$")
	public void user_fills_Certification_or_Requirements_details_and_click_on_Next() throws IOException {
		  String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
	        String SalesCertification = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "salesCertification");
	       
	        certify.salesCertification(SalesCertification);
	        String Certi_taxpayer_id = testdata.get(HooksTest.scenario.getName(), TestDataFileName,TestDataSheetName, "Certification_TaxpayerIdentificationNumber");
			String Certi_backup = testdata.get(HooksTest.scenario.getName(), TestDataFileName,TestDataSheetName, "Certification_IamNOTsubjecttobackupwithholding");
			String Certi_us = testdata.get(HooksTest.scenario.getName(), TestDataFileName,TestDataSheetName,"Certification_IamaU.S.person");
	        certify.TaxPayerIdentification(Certi_taxpayer_id,Certi_backup, Certi_us);


	}

	@When("^user fills HIV consent details and click on Next$")
	public void user_fills_HIV_consent_details_and_click_on_Next() throws IOException {
		String CI_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		String AZ_KY_personalphysician_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AZ_KY_personalphysician_RD");
		String CT_physician_or_health = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CT_HIV");
		String DC_Fl_physician_or_health = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "DC_FL_HIV");
		String IA_Alternate_Myphysician_none = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "IA_HIV");
		String Ks_Ma_MePIandPhysician = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "KS_MA_HIV");
		String NY_physician_or_health = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_HIV");
		String MI_YEsNo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"MI_HIV_YEsNo");
		String MI_authorizeHiv = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"MI_Hiv");
		String Fname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_FirstName");
		String Lname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_LastName");
		String Addrs = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_Address");
		String Cty = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_City");
		String ST = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_State");
		String Zpcd = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_Zip");
		String HCprovidername = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_HealthCareProviderName");
		String Alternativesitename = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_AlternativeSite");
		String Dname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Hiv_Designeename");
		String MoPhysician_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Mo_HIV");
		String ExaminerName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "HIV_ExaminerName");
		String FacilityName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Hiv_FacilityName");
		Consent_HIV.personalPhysician_Yes_No(CI_State, AZ_KY_personalphysician_RD, CT_physician_or_health, DC_Fl_physician_or_health, IA_Alternate_Myphysician_none,
				Ks_Ma_MePIandPhysician, NY_physician_or_health,MoPhysician_RD, Fname, Lname, Addrs, Cty, ST, Zpcd, HCprovidername, Alternativesitename, MI_YEsNo, MI_authorizeHiv,
				Dname,ExaminerName,FacilityName);
	
	}

	@When("^user fills Life Producer Statement details and click on Next$")
	public void user_fills_Life_Producer_Statement_details_and_click_on_Next() throws IOException {
		
		String RiskClassification = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LPS_RiskClassificationPresentedtoClient");
		String AC_Offer = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LPS_AC_Offer");
		String MultipolicyCase = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_Isthispartofamulti-policycase(i.e.familymembers,businesspartners,etc.)?");
		String MultipolicyCasePolicyNumbers = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_MultiPolicyProvidedassociatedPolicyNumber(s)");
		String Otherapplicationssubmitted = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LIfeProducerStatement_Arethereanyotherapplications(e.g.Disability,LongTermCare)beingsubmittedconcurrentlywiththisApplicationorwithinthelasttwomonths?");
		String OtherapplicationssubmittedPolicyNumbers = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_OtherapplicationssubmittedProvideassociatedPolicyNumber(s)");
		String Dividends = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_WilldividendsfromanexistingMassMutualpolicybeusedtopayallorpartoftheinitialpremiumonthispolicy?");
		String ServiceRequest = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_WouldyouliketocompleteaServiceRequestform?");
		String PurchaseSinglePremiumImmediateAnnuity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LIfeProducerStatement_IstheLifeInsurancebeingappliedforinconjunctionwiththepurchaseofaSinglePremiumImmediateAnnuity?");
		String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers = testdata.get(HooksTest.scenario.getName(),
				"WholeLife_TestData",TestDataSheetName, "LIfeProducerStatement_PurchaseSinglePremiumProvideassociatedPolicyNumber(s)");
		String DiscussedArrangingFinancingForPurchase = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LIfeProducerStatement_AreyouawareofwhethertheProposedOwnerorProposedInsuredhasarranged,ordiscussedarranging,anyfinancingforthepurchaseofthispolicy?");
		String KnowledgeReasontoBelieve = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_KnowledgeReasontoBelieve");
		String KnowledgeReasontoBelieveDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_Details");
		String AC_HearingImpairment = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"AC_HearingImpairment");
		String AC_OtherPreferredLanguage = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"AC_OtherPreferredLanguage");
		String UnderstandEnglish = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LIfeProducerStatement_DideverypersonsigningthisApplicationunderstandandanswereachquestioninEnglish?");
		String IndicateLanguage = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_IndicateLanguage");
		String MarketType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LIfeProducerStatement_MarketType");
		String Prospectusandany = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_ProducerRole");
		String Prospectus_MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Email");
		String Prospectus_DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,"LifeProducerCompensation_FloridLIC");
		String Prospectus_YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_1stYearCommission");
		
		producerStatement.enterProducerStatement(RiskClassification,AC_Offer, MultipolicyCase, MultipolicyCasePolicyNumbers,
				Otherapplicationssubmitted, OtherapplicationssubmittedPolicyNumbers, Dividends, ServiceRequest,
				PurchaseSinglePremiumImmediateAnnuity, PurchaseSinglePremiumImmediateAnnuityPolicyNumbers,
				DiscussedArrangingFinancingForPurchase, KnowledgeReasontoBelieve, KnowledgeReasontoBelieveDetails,
				UnderstandEnglish,AC_HearingImpairment,AC_OtherPreferredLanguage, IndicateLanguage, MarketType,Prospectusandany, Prospectus_MM, Prospectus_DD, Prospectus_YYYY);
		

	}

	@When("^user fills Life Producer Compensation details and click on Next$")
	public void user_fills_Life_Producer_Compensation_details_and_click_on_Next() throws IOException {

		String ProducerRole = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_ProducerRole");
		String ProducerEmail = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Email");
		String LicenceID = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LifeProducerCompensation_FloridLIC");
		String Firstyearcommission = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_1stYearCommission");
		String RenewalCommision = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_RenewalCommission");
		String AdditionalProducer = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_Arethereadditionalproducers?");
		String ContactOneFirstName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact1FirstName");
		String ContactOneLastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact1LastName");
		String ContactOnePhone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact1Phone");
		String ContactOneHomeWorkMobile = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_Contact1HomeWorkMobile");
		String ContactOneExtension = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_Contact1WorkExtension");
		String ContactOneEmail = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact1Email");
		String ContactTwoFirstName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact2FirstName");
		String ContactTwoLastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact2LastName");
		String ContactTwoPhone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact2Phone");
		String ContactTwoHomeWorkMobile = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_Contact2HomeWorkMobile");
		String ContactTwoExtension = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_Contact2WorkExtension");
		String ContactTwoEmail = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Contact2Email");

		String Add_ProducerRole = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_Add_ProducerRole");
		String NumberOfProducer = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Number_OF_producer");
		
		String ProducerID = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_ProducerID");
		String AgencyId = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_AgencyId");
		String ProducerID2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_ProducerID2");
		String AgencyId2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_AgencyId2");
		String ProducerID3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_ProducerID3");
		String AgencyId3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LPC_AgencyId3");
		
		String fst_Year_Commission1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_%_1st_Year_Commission1");
		String Renewal_Commission1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_%_Renewal_Commission1");
		String fst_Year_Commission2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_%_1st_Year_Commission2");
		String Renewal_Commission2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_%_Renewal_Commission2");
		String fst_Year_Commission3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_%_1st_Year_Commission3");
		String Renewal_Commission3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"LPC_%_Renewal_Commission3");
		String firm1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"firm1");
		String firm2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"firm2");
		String firm3 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"firm3");

		producerCompensation.enterProducerCompensation(ProducerRole, ProducerEmail, LicenceID, Firstyearcommission,
				RenewalCommision, AdditionalProducer);
		producerCompensation.AdditionalProducer(AdditionalProducer, NumberOfProducer, Add_ProducerRole, 
				ProducerID, AgencyId,firm1, ProducerID2, AgencyId2,firm2, ProducerID3, AgencyId3, firm3,
				fst_Year_Commission1, Renewal_Commission1, fst_Year_Commission2, Renewal_Commission2, fst_Year_Commission3, Renewal_Commission3);
		producerCompensation.ContactDetails(ContactOneFirstName, ContactOneLastName, ContactOnePhone,
				ContactOneHomeWorkMobile, ContactOneExtension, ContactOneEmail, ContactTwoFirstName, ContactTwoLastName,
				ContactTwoPhone, ContactTwoHomeWorkMobile, ContactTwoExtension, ContactTwoEmail);
		
		
		  String IntendonConvertingpolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "IntendonConvertingpolicy");
		    String Anticipatedtimecoverage = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_coverageisneeded");
	        String Primarypurposeof_ins = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_PrimaryPurposeOfIns");
	        String InsOptionsAbove = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_InsOptionsAbove");        
	        String Dependent = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_dependents");
	        String DependentDetails = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_dependentDetails");
	        String OtherText = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_dependentOtherDetails");
	        String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");        
	        NYlps.productAndPremiumPayorInfo(state,IntendonConvertingpolicy, Anticipatedtimecoverage, Primarypurposeof_ins, InsOptionsAbove, Dependent, DependentDetails,
	                OtherText);
// Alternate and additional for ny Life Products suitability
		    String alt_intend_on_converting = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_alt_intend_on_converting");
	        String alt_Anticipated_coverageNeeded = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_alt_Anticipated_coverageNeeded");
	        String alt_PorposeofInsure = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_alt_PorposeofInsure");        
	        String Alt_Ins_option_above_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_Ins_option_above_RD");
	        String add_Anticipated_coverageNeeded = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_add_Anticipated_coverageNeeded");
	        String add_PorposeofInsure = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_add_PorposeofInsure");     
	        String Add_Ins_option_above_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_Ins_option_above_RD");      
	        NYlps.ALternate_and_additional(state,alt_intend_on_converting, alt_Anticipated_coverageNeeded, alt_PorposeofInsure, Alt_Ins_option_above_RD,
	        		add_Anticipated_coverageNeeded, add_PorposeofInsure, Add_Ins_option_above_RD);
	        
	        String sourceofPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilitysourceofPremium");
	        String TaxPenality = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_TaxPenality");
	        String hardshipwithdrawal = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_hardshipwithdrawal");        
	        String surrenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_surrenderCharge");
	        String surrenderChargeDetail = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_surrenderChargeDetail");
	        String Exchangeamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_Exchangeamount");
	        String exchangSurenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_exchangSurenderCharge");        
	        String surrenderChargeAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_surrenderChargeAmount");
	        String AnnuitizationSurenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_AnnuitizationSurenderCharge");
	        String AnnuitizationSurenderChargeAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.financialinfo(state, sourceofPremium, TaxPenality, hardshipwithdrawal, surrenderCharge, surrenderChargeDetail, Exchangeamount,
	                exchangSurenderCharge, surrenderChargeAmount, AnnuitizationSurenderCharge, AnnuitizationSurenderChargeAmount);
	        //For NY State Additional field dispalying for ALternate and Additonal Products
	        String ALT_sourceofPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitabilitysourceofPremium");
	        String Alt_TaxPenality = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_TaxPenality");
	        String Alt_hardshipwithdrawal = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_hardshipwithdrawal");        
	        String Alt_surrenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_surrenderCharge");
	        String Alt_surrenderChargeDetail = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_surrenderChargeDetail");
	        String Alt_Exchangeamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_Exchangeamount");
	        String Alt_exchangSurenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_exchangSurenderCharge");        
	        String Alt_surrenderChargeAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_surrenderChargeAmount");
	        String Alt_AnnuitizationSurenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_AnnuitizationSurenderCharge");
	        String Alt_AnnuitizationSurenderChargeAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Alt_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.NY_Alt_financialinfo(state,ALT_sourceofPremium, Alt_TaxPenality, Alt_hardshipwithdrawal, Alt_surrenderCharge, Alt_surrenderChargeDetail, Alt_Exchangeamount, Alt_exchangSurenderCharge, Alt_surrenderChargeAmount, Alt_AnnuitizationSurenderCharge, Alt_AnnuitizationSurenderChargeAmount);
	        
	        String ADD_sourceofPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitabilitysourceofPremium");
	        String ADD_TaxPenality = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_TaxPenality");
	        String Add_hardshipwithdrawal = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_hardshipwithdrawal");        
	        String Add_surrenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_surrenderCharge");
	        String AdD_surrenderChargeDetail = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_surrenderChargeDetail");
	        String Add_Exchangeamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_Exchangeamount");
	        String Add_exchangSurenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_exchangSurenderCharge");        
	        String Add_surrenderChargeAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_surrenderChargeAmount");
	        String Add_AnnuitizationSurenderCharge = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_AnnuitizationSurenderCharge");
	        String Add_AnnuitizationSurenderChargeAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_Add_ProductsSuitability_AnnuitizationSurenderChargeAmount");
	        NYlps.NY_Add_financialinfo(state,ADD_sourceofPremium, ADD_TaxPenality, Add_hardshipwithdrawal, Add_surrenderCharge, AdD_surrenderChargeDetail, Add_Exchangeamount,
	        		Add_exchangSurenderCharge, Add_surrenderChargeAmount, Add_AnnuitizationSurenderCharge, Add_AnnuitizationSurenderChargeAmount);
	        //For NY State Additional field dispalying for ALternate and Additonal Products Ends
	        String securitiess = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_securitiess");
	        String Annuitiess = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_Annuitiess");
	        String CashValues = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_CashValues");        
	        String AlternativeInvestmentss = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_AlternativeInvestmentss");
	        String FinancialObject = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitability_FinancialObject");
	        
	        NYlps.financialExperience(state, securitiess, Annuitiess, CashValues, AlternativeInvestmentss, FinancialObject);
		
	        
	        NYLifeproductsuitabilityContinues NYPSC=new NYLifeproductsuitabilityContinues();
	        
	        String T20million = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_T20million");
	        String Proposedannualpremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_Proposedannualpremium");
	        String Faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_FaceAmount");        
	        String ReplaceByPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_ReplaceByPolicy");
	        String AnnualPrem_Cost = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_AnnualPrem_Cost");
	        String Totalfaceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_Totalfaceamount");        
	        String TotalannualIncome = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_TotalannualIncome");
	        String RiskTolerance = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_Risktoleranceaboutpremiums");
	        String RiskToleranceTwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_Risktoleranceaboutdeathbenefit");
	        String UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityUnsheduledALIR");        
	        String amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_amountofUnSheduled");
	        String Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_Exchange1035_RD");
	        String exchange1035Amount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_exchange1035Amount");
	        String LTCRiskTolerance = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilityContinus_LTCRiskTolerance");
	        
	        NYPSC.suitabilitycontinues(state, T20million, Proposedannualpremium, Faceamount,UnsheduledALIR,
	    			amountofUnSheduled,Exchange1035_RD,exchange1035Amount, ReplaceByPolicy, AnnualPrem_Cost, Totalfaceamount,
	                TotalannualIncome, RiskTolerance,RiskToleranceTwo,LTCRiskTolerance);
	        
	        String Alt_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_propsedAnnualPremium");
	        String Alt_faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_faceamount");
	        String Alt_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_ReplacedByPolicy");        
	        String Alt_TotalFaceAmount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_TotalFaceAmount");
	        String Alt_TotalAnnualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_TotalAnnualPremium");
	        String Alt_AnnuaLPremiumCost = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_AnnuaLPremiumCost");        
	        String Alt_UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_UnsheduledALIR");        
	        String Alt_amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_amountofUnSheduled");
	        String Alt_Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_Exchange1035_RD");
	        String Alt_exchange1035Amount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_exchange1035Amount");        
	        
	        String Add_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_propsedAnnualPremium");
	        String Add_faceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_faceamount");
	        String Add_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_ReplacedByPolicy");
	        String Add_UnsheduledALIR = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_UnsheduledALIR");        
	        String Add_amountofUnSheduled = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_amountofUnSheduled");
	        String Add_Exchange1035_RD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_Exchange1035_RD");
	        String Add_exchange1035Amount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_exchange1035Amount");        
	        
	        
	        String Add_Totalfaceamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_TotalFaceAmount");
	        String Add_totalannualPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_TotalAnnualPremium");
	        String Add_annuaLpremiumCost = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_AnnuaLPremiumCost");
	        //For NY and Alt and Additional Product
	        NYPSC.suitabiltycont_coverage_costinfo(Alt_propsedAnnualPremium, Alt_faceamount, Alt_UnsheduledALIR,
	    			 Alt_amountofUnSheduled, Alt_Exchange1035_RD, Alt_exchange1035Amount, Alt_ReplacedByPolicy, Alt_TotalFaceAmount, Alt_TotalAnnualPremium, Alt_AnnuaLPremiumCost,
	        		Add_propsedAnnualPremium, Add_faceamount, Add_UnsheduledALIR, Add_amountofUnSheduled, Add_Exchange1035_RD, Add_exchange1035Amount,Add_ReplacedByPolicy, Add_Totalfaceamount, Add_totalannualPremium, Add_annuaLpremiumCost);
	        
	        //For NY Risk tollerance for both alt and additional
	        String ALt_RiskTolerance = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_ALt_RiskTolerance");
	        String Alt_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Alt_RiskToleranceAboutDeath");
	        String Add_RiskTolerance = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_RiskTolerance");
	        String Add_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_LPSC_Add_RiskToleranceAboutDeath");
	        NYPSC.RiskTolerance_Alt_Add(state,ALt_RiskTolerance, Alt_RiskToleranceAboutDeath, Add_RiskTolerance, Add_RiskToleranceAboutDeath);
	        
	        NGE.nonFuaranteeedelement(state);    
	        String txtareaone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilitySummary_Textareaone");
	        String txtareaTwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilitySummary_TextareaTwo");
	        String txtareaThree = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_ProductsSuitabilitySummary_TextareaThree");
	        String Alt_TextAreaone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_PSS_Alt_TextAreaone");
	        String Alt_Textareatwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_PSS_Alt_Textareatwo");
	        String Alt_TextAreathree = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_PSS_Alt_TextAreathree");
	        String Add_TextAreaone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_PSS_Add_TextAreaone");
	        String Add_Textareatwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_PSS_Add_Textareatwo");
	        String Add_Textareathree = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "NY_PSS_Add_Textareathree");
	        NGE.productsuitability(state,txtareaone, txtareaTwo, txtareaThree, Alt_TextAreaone,Alt_Textareatwo,Alt_TextAreathree,
	    			 Add_TextAreaone, Add_Textareatwo,Add_Textareathree);
	        
	}

	@When("^user fills Additional Forms details and click on Next$")
	public void user_fills_Additional_Forms_details_and_click_on_Next() throws IOException {
		String preferedLanguage = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PI_PrefferedLang");
		String languages = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AdditionalForms_Foreign_Language_Language");
		String Others = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AdditionalForms_Foreign_Language_Language_Other");
		String Translator = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AdditionalForms_Foreign_Language_Language_Translator_is_a_or_an");
		String AgentFirstname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_GeneralAgent_FirstName");
		String Agent_Midlename = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_GeneralAgent_MI");
		String AgentLastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_GeneralAgent_LastName");
		String Agent_suffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_GeneralAgent_Sufix");
		String ProfessionalFirstName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AF_Professional_FirstName");
		String ProfessionalMidleName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_Professional_MI");
		String ProfessionalSuffix = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_Professional_Sufix");
		String ProfessionalLastName = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AF_Professional_LastName");
		String ProfessionalTranslationFirm = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AF_Professional_TranslationFirm");
		String ProfessionalStreet_1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AF_ProfessionalStreet_1");
		String ProfessionalStreet_2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName,
				"AF_ProfessionalStreet_2");
		String Professional_City = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_Professional_City");
		String Professional_State = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_Professional_State");
		String Professional_Zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AF_Professional_Zip");
		Addforms.enterAdditionalFormsDetail(preferedLanguage, languages, Others, Translator, AgentFirstname,
				Agent_Midlename, AgentLastname, Agent_suffix, ProfessionalFirstName, ProfessionalMidleName,
				ProfessionalLastName, ProfessionalSuffix, ProfessionalTranslationFirm, ProfessionalStreet_1,
				ProfessionalStreet_2, Professional_City, Professional_State, Professional_Zip);
	}

	@When("^user fills Attachments details and click on Next$")
	public void user_fills_Attachments_details_and_click_on_Next() throws IOException, AWTException, InterruptedException {
		String Policytype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Policytype");
        String PlantrustType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PlantrustType");
        String pleasespecify = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "pleasespecify");
        String Howlongplanbeen = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Howlongplanbeen");
        String Planname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Planname");
        String trustee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "trustee");
        String street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifed_street1");
        String street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifed_street2");
        String city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifed_city");
        String qualifedstate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifedstate");
        String zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifiedzip");
        String MM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifed_MM");
        String DD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifed_DD");
        String YYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "qualifed_YYYY");
		
		
        String Qualified_PlanTrustSponsorEIN = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Qualified_PlanTrustSponsorEIN");
        String Qualified_TotalnoEmployee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Qualified_TotalnoEmployee");
        String Qualified_NoofEmployecoverdPlan = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Qualified_NoofEmployecoverdPlan");
        String Qualified_ExplainBasisofEmployee = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Qualified_ExplainBasisofEmployee");
        String PlanTrustSponsorEInumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Qualified_PlanTrustSponsorEInumber");
		QP.PolicyTrust_Plantrust(Policytype, PlantrustType,pleasespecify, Howlongplanbeen, Planname, trustee, street1, street2,
				city, qualifedstate, zip, MM, DD, YYYY,PlanTrustSponsorEInumber, Qualified_PlanTrustSponsorEIN, Qualified_TotalnoEmployee, Qualified_NoofEmployecoverdPlan, Qualified_ExplainBasisofEmployee);
		
	
		String fullnameEmploye = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "fullnameEmploye");
        String plansponsor_street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "plansponsor_street1");
        String plansponsor_street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "plansponsor_street2");
        String plansponsor_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "plansponsor_city");
        String plansponsor_state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "plansponsor_state");
        String plansponsor_zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "plansponsor_zip");
        String Employer_sponsor_EINNumber = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Employer_sponsor_EINNumber");
        String PlanSponsore_Authorized_fullname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PlanSponsore_Authorized_fullname");
        String PlanSponsor_Authorized_lastname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PlanSponsor_Authorized_lastname");
		QP.EmployerPlanSponsor(fullnameEmploye, plansponsor_street1, plansponsor_street2, plansponsor_city, plansponsor_state, plansponsor_zip, Employer_sponsor_EINNumber,PlanSponsore_Authorized_fullname, PlanSponsor_Authorized_lastname);
		
		String ThirdParty_fullname = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ThirdParty_fullname");
        String ThirdParty_street1 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ThirdParty_street1");
        String ThirdParty_street2 = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ThirdParty_street2");
        String ThirdParty_city = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ThirdParty_city");
        String ThirdParty_state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ThirdParty_state");
        String ThirdParty_zip = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ThirdParty_zip");
        String Thirdparty_preferredphone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Thirdparty_preferredphone");
        String Thirdparty_phonetype = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Thirdparty_phonetype");
        String Thirdparty_email = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Thirdparty_email");
		QP.ThirdPartyAdministrationinfo(ThirdParty_fullname, ThirdParty_street1, ThirdParty_street2, ThirdParty_city, ThirdParty_state, ThirdParty_zip, Thirdparty_preferredphone,
				Thirdparty_phonetype, Thirdparty_email);
		
		String Whatlimitofamount = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PurposeOFLifeINS");
        String ApproxValueAssets = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ApproximateValue");
        String annualpremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "AnnualPremium");
        String EmployerContribution = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "EmployerContribution");
        String FundingMethod = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "DefinedBenefitPlans");
        String LimitOFDeathBenefit = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "LimitsOFDeathBenefit");
        String Totalamountaggreemnt = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "TotalAmountAgrrement");
        String yearone = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "YearONe");
        String yeartwo = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "YearTwo");
        String SelectAllType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "SelectAllType");
        String ParticipantLive = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "ParticipantLive");
        String Pleasexpalin = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Participant_PleaseExpalain");
        String FundedpleaseSpecify = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "FundedpleaseSpecify");
       
        String Self_DDC_IsReducedPremium = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Self_DDC_IsReducedPremium");
        String Self_DDC_approxvalue = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Self_DDC_approxvalue");
		QP.Self_DDCPlanInfo(Whatlimitofamount, ApproxValueAssets, annualpremium, EmployerContribution, FundingMethod, LimitOFDeathBenefit, Totalamountaggreemnt, yearone, yeartwo,
				SelectAllType, ParticipantLive, Pleasexpalin, FundedpleaseSpecify,Self_DDC_IsReducedPremium,Self_DDC_approxvalue);
		
		
		
		String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_ProductType");
		attach.attachDocuments(state,ProductType);
		/*
		String state = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_State");
		attach.attachDocuments(state);*/
	}

	@Then("^Validate Good order message and policy number created$")
	public void validate_Good_order_message_and_policy_number_created() {

	}

	@When("^Lock the policy and do wet sign$")
	public void lock_the_policy_and_do_wet_sign() throws IOException {

		String ProductType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "CI_ProductType");
		ExcelUtility rowcount=new ExcelUtility();
		int RowCount=rowcount.getRowCount("Ez-AppUnderWriters", "Hub");
		System.out.println("the rowcount is " + RowCount);
		int policyrow = row + 2;
		lock.LockScreen(policyrow,ProductType);

		String SignType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "SignatureMethod");
		String InsIDproof = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Esign_InsuredIdType");
		String InsIdNum = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "Esign_InsuredIdNumber");

		String OwnerInsIDproof = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "OwnerInsIDproof");
		String OwnerInsIdNum = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "OwnerInsIdNum");
		String proposedInsuredCity = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "proposedInsuredCity");
		String proposedinsuredstate = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "proposedinsuredstate");
		
		String WetsignType = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "WetsignType");
		String InsMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "InsMM");
		String InsDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "InsDD");
		String InsYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "InsYYYY");

		String PrdMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PrdMM");
		String PrdDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PrdDD");
		String PrdYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PrdYYYY");
		String OwnerMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "OwnerMM");
		

		String OwnerDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "OwnerDD");
		String OwnerYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "OwnerYYYY");
	
		String PlanSponsorMM = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PlanSponsorMM	");
		String PlanSponsorDD = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PlanSponsorDD");
		String PlanSponsorYYYY = testdata.get(HooksTest.scenario.getName(),TestDataFileName,TestDataSheetName, "PlanSponsorYYYY");
		
		
		lock.signature(SignType, InsIDproof, InsIdNum,policyrow,ProductType, OwnerInsIDproof, OwnerInsIdNum,WetsignType, InsMM, InsDD,InsYYYY,
				PrdMM,PrdDD, PrdYYYY,OwnerMM, OwnerDD, OwnerYYYY, proposedInsuredCity, proposedinsuredstate,PlanSponsorMM,PlanSponsorDD,PlanSponsorYYYY);

	}

	@Then("^check if policy submitted$")
	public void check_if_policy_submitted() throws Exception {

	}
	
	

}
