package stepdefinitions;
import static com.codeborne.selenide.Selenide.$;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.TestPropertyFileRead;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclass.AdditionalForms;
import pageclass.Attachments;
import pageclass.CaseInfo;
import pageclass.EntityOwner;
import pageclass.LifeOwner;
import pageclass.LockAndUnlock;
import pageclass.NYLifeproductsuitabilityContinues;
import pageclass.NY__NonGuaranteedElement;
import pageclass.NewYorkRegSixty;
import pageclass.NewYork_LifeProductsSuitability;
import pageclass.ProposedInsured;
import pageclass.ProposedInsuredCont;
import pageclass.QualifiedPlan;
import pageclass.TrustCertification;
import pageclass.Workbench_LaunchEzApp;
import pageclass.CCone.Alternate_AdditionalProduct;
import pageclass.CCone.CCOneLifeCaseSetup;
import pageclass.CCone.CCOnePayementInformation;
import pageclass.CCone.CConeBeneficiary;
import pageclass.CCone.CConeCertification;
import pageclass.CCone.CConeEmploymentInformation;
import pageclass.CCone.CConeOtherCoverage;
import pageclass.CCone.CConeProduceStatement;
import pageclass.CCone.CConeProducerCompensation;
import pageclass.CCone.CConeProductWhole;
import pageclass.CCone.CConeProposedInsuredCont;
import pageclass.CCone.LTCPersonalWorksheet;
import pageclass.CCone.LTCRLapse;
import pageclass.CCone.LTCWorksheet_ALt;
import pageclass.CCone.NYCConeCSSproductWholelife;
import pageclass.CCone.NYCConeLifeproductsuitabilityContinues;
import pageclass.CCone.NewYorkCCone_LifeProductsSuitability;
import pageclass.CCone.NewYorkRegSixtyCCone;
import utilities.GetDataFromExcel;
public class CareChoice {
	
	By EmpInfo =By.xpath("//a[contains(@id,'Screens_PIEmployment')]");
	int row;
	GetDataFromExcel testdata = new GetDataFromExcel();
	Workbench_LaunchEzApp workbenchLaunchEzApp = new Workbench_LaunchEzApp();
	CaseInfo caseinfo = new CaseInfo();
	CCOneLifeCaseSetup lifecasesetup = new CCOneLifeCaseSetup();
	LTCPersonalWorksheet LTC=new LTCPersonalWorksheet();
	ProposedInsured Proposedinsure = new ProposedInsured();
	CConeProposedInsuredCont PI_cont = new CConeProposedInsuredCont();
	ProposedInsuredCont LOcont = new ProposedInsuredCont();
	LifeOwner LO=new LifeOwner();
	CCOnePayementInformation CPI = new CCOnePayementInformation();
	CConeProductWhole pwl = new CConeProductWhole();
	CConeEmploymentInformation EI= new CConeEmploymentInformation();
	CConeBeneficiary LifeBene = new CConeBeneficiary();
	CConeOtherCoverage CoOC = new CConeOtherCoverage();
	LTCRLapse LTCR=new LTCRLapse();
	CConeCertification CC=new CConeCertification();
	CConeProduceStatement producerStatement = new CConeProduceStatement();
	CConeProducerCompensation producerCompensation = new CConeProducerCompensation();
	AdditionalForms Addforms = new AdditionalForms();
	Attachments attach = new Attachments();
	LockAndUnlock lock = new LockAndUnlock();
	NYCConeLifeproductsuitabilityContinues NYPSC = new NYCConeLifeproductsuitabilityContinues();
	Alternate_AdditionalProduct AltAdd=new Alternate_AdditionalProduct();
	EntityOwner EO=new EntityOwner();
	QualifiedPlan QP=new QualifiedPlan();
	TrustCertification Trust=new TrustCertification();
	//NY
	NewYorkRegSixtyCCone NyR=new NewYorkRegSixtyCCone();
	NewYorkCCone_LifeProductsSuitability NYlps= new NewYorkCCone_LifeProductsSuitability();
	NY__NonGuaranteedElement NGE=new NY__NonGuaranteedElement();
	
	NYCConeCSSproductWholelife NywLp=new NYCConeCSSproductWholelife();
	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();
	
	
    String WriteFilename= TestPropertyFileRead.getThePropertyValue("WriteFilename");
	String WriteSheetname= TestPropertyFileRead.getThePropertyValue("WriteSheetname");
	
	String inputfilename=TestPropertyFileRead.getThePropertyValue("ExcelFileName");
	String inputsheetname=TestPropertyFileRead.getThePropertyValue("Cc_sheetname");
//	final String SECRET_KEY = System.getenv("Excelfile");

	
	@Given("^Launch Fieldnet_dev application then enter User ID click on Next and enter Password then click on Verify (\\d+)$")
	public void launch_Fieldnet_dev_application_then_enter_User_ID_click_on_Next_and_enter_Password_then_click_on_Verify(int arg1)  {
		row = arg1;
		workbenchLaunchEzApp.enterUserIDClickNext();
		workbenchLaunchEzApp.enterPasswordClickVerify();
		workbenchLaunchEzApp.clickOnFieldnetDev();
	   
	}

	@Given("^click on SubmitNewBusiness link then click Insurance Workbench and enter ProducerID and click on search for CCone$")
	public void click_on_SubmitNewBusiness_link_then_click_Insurance_Workbench_and_enter_ProducerID_and_click_on_search_for_CCone() throws IOException  {
	    
		String producerID = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "ProducerID");
		workbenchLaunchEzApp.enterProducerNumberClickSearch(producerID);
		
	}

	@Given("^click on Plus icon then select environment to  and click on continue to select CCone$")
	public void click_on_Plus_icon_then_select_environment_to_and_click_on_continue_to_select_CCone() throws IOException  {
		String Environment = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Environment");
		workbenchLaunchEzApp.clickonSubmitNewBusinessWB(Environment);
	   
	}

	@When("^EzApp launched and user enters CCOne Insured details and case description$")
	public void ezapp_launched_and_user_enters_CCOne_Insured_details_and_case_description() throws IOException  {
	    
		String FirstName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Firstname");
		String LastName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_LastName");
		String DOBMonth = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_MM");
		String DOBDay = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_DD");
		String DOBYear = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_YYYY");
		String Gender = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Gender");
		String CaseDescription = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_CaseDescription");
		String State = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_ProductType");
		String Product = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Product");
		caseinfo.enterCaseInfoDetails(FirstName, LastName, DOBMonth, DOBDay, DOBYear, Gender, CaseDescription);
		caseinfo.CarrierAndProduct(State, ProductType);
		caseinfo.selectProduct(Product);
	   
	}

	@When("^select state and wholelife Product type and click on Find Available Products$")
	public void select_state_and_wholelife_Product_type_and_click_on_Find_Available_Products() throws IOException  {
	    
		
	}

	@When("^select CCOne product variant so Application screen open$")
	public void select_CCOne_product_variant_so_Application_screen_open() throws IOException  {


	}

	@When("^user fills CCone Life case setup details and click on Next$")
	public void user_fills_CCone_Life_case_setup_details_and_click_on_Next() throws IOException  {
		String InsuredResidentState = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_InsuredResidentState");
		String FaceAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_FaceAmount");
		String registeredbrokerwithMMLIS = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_ MMLISRegistered Rep?");	
		String WithdrawalFromRetirementAccount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_FinancialServicesRepresentative?");
		String PenalityTaxAmountWithdrawn = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_Account10%PurchaseThisPolicy?");
		String HardshipWidrawal = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_hardshipwithdrawal?");
		String Retirement_paythepremiums = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_retirement_account_pay_the_premiums?");
		String SurrenderChargeAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_surrenderchargeamount?");
		String PrimaryPurposeLifeInsurance = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_Whatistheprimarypurpose");
		String Thirdparty = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_Thirdparty");		
		String Product = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Product");
		String proposed_insured_the_owner = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_proposed_insured_the_owner");
		String Owner_an_individual_or_entity = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_Owner_an_individual_or_entity");	
		String individualOwnerState = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_individualOwnerState");
		String EntityState = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_EntityState");
		String HoldIssue = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_HoldIssue");		
		String BackdateSaveAge = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_Backdatetosaveage?");
		String PolicyDating = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_PolicyDating");
		String SpecificDateMonth = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_SpecificDate_MM");
		String SpecificDateDay = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_SpecificDate_DD");
		String SpecificDateYear = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_pecificDate_YYYY");
		String SubmittingAgency = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_SubmitAgency");
		String StateofOwnersign = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_OwnerState");
		String CityofOwnersign = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LCS_OwnerCity");
		String FloridaCountryname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "FL_CountryName");
		String State = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		String Lapsed = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NyReg_LAPSED_SURRENDERED");
		String CashValues = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NyReg_OTHER_CASH_VALUES");
		String tobeInforce = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NyReg_CONTINUE_TO_BE_IN_FORCE");
		String Reissued = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NyReg_REISSUED_WITH_REDUCTION");
		String Collateral = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NyReg_ASSIGNED_AS_COLLATERAL");
		String Premium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NyReg_PREMIUM PAID");
		String externalReplacement = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NyReg_EXTERNAL_REPLACEMENT");
		String firm = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Firm");
		String firmdisplay = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "firmdisplay");
		String SalesPerson_RD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "SalesPerson_YesNo");
		String SalesFirstname = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "SalesFirstname");
		String salesLastName = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "SalesLastName");
		lifecasesetup.EnterLifeCaseSetup(InsuredResidentState,  FaceAmount);
		lifecasesetup.RadioQuestionsone(registeredbrokerwithMMLIS, WithdrawalFromRetirementAccount, PenalityTaxAmountWithdrawn, HardshipWidrawal, Retirement_paythepremiums, PrimaryPurposeLifeInsurance, SurrenderChargeAmount,Thirdparty);
		lifecasesetup.RadioQuestionsctwo(Product,proposed_insured_the_owner,Owner_an_individual_or_entity, individualOwnerState, 
				EntityState ,HoldIssue, BackdateSaveAge, PolicyDating, SpecificDateMonth, SpecificDateDay,
				SpecificDateYear, SubmittingAgency,firm,firmdisplay, StateofOwnersign,FloridaCountryname, CityofOwnersign,SalesPerson_RD,
				SalesFirstname,salesLastName);
		NyR.NeyworkReg(State, Lapsed, CashValues, tobeInforce, Reissued, Collateral, Premium, externalReplacement);
		

		
	}
	@When("^user fills CCone Long Term Care Insurance Personal Worksheet and click on Next$")
	public void user_fills_CCone_Long_Term_Care_Insurance_Personal_Worksheet_and_click_on_Next() throws IOException  {	
		String CA_PartnerDiesFirst = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CA_LTC_spouseor_partner_dies_first");
		String CA_whatIsYourHouseholdannual = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CA_LTC_What_is_your_household_annual_income");	
		String CA_NextTenYears = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CA_LTC_change_over_the_next_10 years");
		String CA_ContinueToPayPremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_ plan_to_pay_premiums_from_your_income");
		String PayYourPremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_pay_your_premium");
		String details = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_pay_your_premium_Details");	
		String PartnerDiesFirst = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_spouseor_partner_dies_first");
		String whatIsYourHouseholdannual = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_What_is_your_household_annual_income");
		String NextTenYears = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_change_over_the_next_10 years");		
		String ContinueToPayPremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_ plan_to_pay_premiums_from_your_income");
		String inflationProtection = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_Inflation_protection");
		String EliminationPeriod = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_care_during_the_elimination_period");
		String NotCountingHome = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_ Not_counting_your_home");
		String NetWorth = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_ liquid net worth");
		String DidyouExpectValue = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_change_over_the_next_ten_years");
		String AnswerstotheQuestions = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_form_describe_my_financial_situation");
		String ExplainedProposed = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_I_explained_to_the_Proposed_Owner_the_importance");
		String MyProducerHasAdvised = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_My_producer_has_advised_me ");
		String ChoosenottoComplete = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTC_I_choose_not_to_complete");
		String State = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		String DailyBenefitAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "DailyBenefitAmountdetails");
		String otherDetails = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "otherDetailsamount");
	   LTC.LTCdetails(State,PayYourPremium, details);
	   LTC.LTC_detaisl_Two(State,CA_PartnerDiesFirst,CA_whatIsYourHouseholdannual,CA_NextTenYears,CA_ContinueToPayPremium,PartnerDiesFirst, whatIsYourHouseholdannual, NextTenYears, ContinueToPayPremium, inflationProtection,  EliminationPeriod,DailyBenefitAmount,otherDetails,
			   NotCountingHome,NetWorth, DidyouExpectValue, AnswerstotheQuestions, ExplainedProposed, MyProducerHasAdvised, ChoosenottoComplete);
	}


	@When("^user fills CCone Primary Insured details and click on Next$")
	public void user_fills_CCone_Primary_Insured_details_and_click_on_Next() throws IOException  {
	    
		String Suffix = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Suffix");
		String Birth_state = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_BirthState");
		String ssn = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_SSN");
		String RESADDStreet1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_AddressStreet1");
		String RESADDStreet2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_AddressStreet2");
		String RESADDCity = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_City");
		String RESADDZIP = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Zip");
		String MailingADD = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_MailAdd");
		String MailingStreet1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_ALT_ AddressStreet1");
		String MailingStreet2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_ALT_AddressStreet2");
		String MailingCity = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_ALT_City");
		String MailingState = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_ALT_State");
		String MailingZIPPostalCode = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_ALT_Zip");
		String PreferredPhoneNumber = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Phone");
		String HomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_HomeWork");
		String WorkExtension = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Extension");
		String AlternatePhoneNumber = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Alt_Phone");
		String AlterHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Alt_HomeWork");
		String AlternateExtesnion = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Alt_Extension");
		String AmPM = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_BestTime");
		String Besttimetocall = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_BesttimetoCall");
		String ReciveText_BD = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Message");
		String NeedspecialAccomidation = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Accomodation");
		String preferredlanguage = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_PrefferedLang");
		String EmailAddress = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_Email");

		Proposedinsure.personal_Information(Suffix, Birth_state, ssn);
		Proposedinsure.Address(RESADDStreet1, RESADDStreet2, RESADDCity, RESADDZIP, MailingADD, MailingStreet1,
				MailingStreet2, MailingCity, MailingState, MailingZIPPostalCode);
		Proposedinsure.Additionalinfo(PreferredPhoneNumber, HomeWorkMobile, WorkExtension, AlternatePhoneNumber,
				AlterHomeWorkMobile, AlternateExtesnion, AmPM, ReciveText_BD, Besttimetocall, NeedspecialAccomidation,
				preferredlanguage, EmailAddress);
	}

	@When("^user fills CCone Primary Insured Cont details and click on Next$")
	public void user_fills_CCone_Primary_Insured_Cont_details_and_click_on_Next() throws IOException  {
		String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PIC_U.S.DriversLicense");
		String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PIC_IdentificationNumber");
		String TypeOfCitizenship = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PIC_TypeofCitizenship");
		String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PIC_ReaspnWhy");	
		String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PIC_StateProvinceofIssue");
		String State = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		String passport = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NY_PrimaryinsCont_OtherIdentification");	
		String OtherDetails = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_PrimaryinsCont_OtherIdentificationDetails");
		PI_cont.identification(State,passport,OtherDetails,PICont_USDriversLicense, PIC_ReasonWhy, PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, TypeOfCitizenship);
	}
	
	@When("^user fills CCone Payment Information and click on Next$")
	public void user_fills_CCone_Payment_Information_and_click_on_Next() throws IOException {
		String Product = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Product");
		String frequency = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Pinfo_Frequency");
		String BankingINfo = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Pinfo_BankingInformation");	
		String PremiumPayor = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Payinfo_PremiumPayor");
		CPI.paymentinformation( Product, frequency,BankingINfo, PremiumPayor);
	}


	

	@When("^user fills CCone whole Life details and click on Next$")
	public void user_fills_CCone_whole_Life_details_and_click_on_Next() throws IOException  {
		String Product = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Product");
		String CCsAutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_CCsAutomaticPremiumLoan");
		String CCsAnnualPremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "WL_CCsTotalAnnualPremium");
		String CCSWaiverofPremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "WL_CCsWaiverofPremium");
		String PolicySinglePremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_Life Policy Single Premium"); //s
		String RiderSinglePremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "WL_LTCI Rider Single Premium");//s
		String LifetimeRiderBenefit = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "WL_Initial Maximum Lifetime Rider Benefit");//s
		String MonthlyBenefit = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_Initial Maximum Monthly Benefit");//s
		String dividendoption = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_Dividend Option");//s
		String MEC = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_MEC");//s
		String inflationProtection = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_InflationProtection");
		String AlternateAdditionalPolicy = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_alternate_additionalpolicy");//s
		String AlternateAdditionalPRoductTpe = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WL_CC_AlternateandAdditionalProductType");
		String State = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		
		//NY
		String NyPolicySinglePremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_NyPolicySinglePremium");
		String nyAcceleratedDeathBenefit = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_nyAcceleratedDeathBenefit");
		String nyExtendedLTCBenefits = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_nyExtendedLTCBenefits");
		String NYLifetimeRiderBenefit = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_NYLifetimeRiderBenefit");
		String NYMonthlyBenefit = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_NYMonthlyBenefit");
		String NYdividendoption = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_Nydividendoption");
		String NYMec = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_Mec");
		String NYinflationPRotection = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_productwholelife_NYinflationPRotection");
		
		//AlternateAdditional
		String faceamount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"faceamount");
		String CC1_PolicySinglePremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"CC1_PolicySinglePremium");
		String CC1_LTCI_SinglePremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"CC1_LTCI_SinglePremium");
		String AutomaticPremiumLoan = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AutomaticPremiumLoan");
		String CCSdividentotpion = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"CCS_dividentotpion");
		String CC1_dividentotpion = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"CC1_dividentotpion");
		String LifeTimeRiderBenefit = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LifeTimeRiderBenefit");
		String MaxiMonthlyBenefit = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"MaxiMonthlyBenefit");
		String TotalAnnualPremium = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"TotalAnnualPremium");
		String Mec = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Mec");
		String WaiverOfPremiumRider = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"WaiverOfPremiumRider");
		
		pwl.wholelife(State,CCsAutomaticPremiumLoan, Product,CCsAnnualPremium,CCSWaiverofPremium,PolicySinglePremium, 
				RiderSinglePremium, LifetimeRiderBenefit, MonthlyBenefit,dividendoption, MEC,inflationProtection, AlternateAdditionalPolicy,AlternateAdditionalPRoductTpe);
		
		String CA_PartnerDiesFirst = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "CA_LTC_spouseor_partner_dies_first");
		String CA_whatIsYourHouseholdannual = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "CA_LTC_What_is_your_household_annual_income");	
		String CA_NextTenYears = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "CA_LTC_change_over_the_next_10 years");
		String CA_ContinueToPayPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_ plan_to_pay_premiums_from_your_income");
		String PayYourPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_pay_your_premium");
		String details = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_pay_your_premium_Details");	
		String PartnerDiesFirst = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_spouseor_partner_dies_first");
		String whatIsYourHouseholdannual = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_What_is_your_household_annual_income");
		String NextTenYears = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_change_over_the_next_10 years");		
		String ContinueToPayPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_ plan_to_pay_premiums_from_your_income");
		String ltcNYinflationPRotection = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_Inflation_protection");
		String EliminationPeriod = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_care_during_the_elimination_period");
		String NotCountingHome = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_ Not_counting_your_home");
		String NetWorth = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_ liquid net worth");
		String DidyouExpectValue = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_change_over_the_next_ten_years");
		String AnswerstotheQuestions = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_form_describe_my_financial_situation");
		String ExplainedProposed = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_I_explained_to_the_Proposed_Owner_the_importance");
		String MyProducerHasAdvised = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_My_producer_has_advised_me ");
		String ChoosenottoComplete = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LTC_I_choose_not_to_complete");
		String state = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "CI_State");
		
		String CCS_Frequency = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "CCS_Frequency");
		String CCone_Frequency = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "CI_State");
		String DailyBenefitAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "DailyBenefitAmountdetails_ALT");
		String otherDetails = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "otherDetailsamount_ALT");
		
		pwl.ALternateLTC(state, PayYourPremium, details, CA_PartnerDiesFirst, CA_whatIsYourHouseholdannual, CA_NextTenYears, CA_ContinueToPayPremium, PartnerDiesFirst, whatIsYourHouseholdannual,
				NextTenYears, ContinueToPayPremium, ltcNYinflationPRotection, EliminationPeriod,DailyBenefitAmount,otherDetails, NotCountingHome, NetWorth, DidyouExpectValue, AnswerstotheQuestions, ExplainedProposed,
				MyProducerHasAdvised, ChoosenottoComplete);
		
		pwl.AdditionalLTC(state, PayYourPremium, details, CA_PartnerDiesFirst, CA_whatIsYourHouseholdannual, CA_NextTenYears, CA_ContinueToPayPremium,
				PartnerDiesFirst, whatIsYourHouseholdannual, NextTenYears, ContinueToPayPremium, ltcNYinflationPRotection, EliminationPeriod,DailyBenefitAmount, otherDetails, NotCountingHome, NetWorth, DidyouExpectValue,
				AnswerstotheQuestions, ExplainedProposed, MyProducerHasAdvised, ChoosenottoComplete);
		NywLp.CConePRoductwholelife(State, Product, NyPolicySinglePremium, nyAcceleratedDeathBenefit, nyExtendedLTCBenefits, NYLifetimeRiderBenefit, NYMonthlyBenefit,
				NYdividendoption, NYMec, NYinflationPRotection);
		AltAdd.CCAlternateandAdditional(AlternateAdditionalPolicy, AlternateAdditionalPRoductTpe, faceamount, CC1_PolicySinglePremium, CC1_LTCI_SinglePremium,
				AutomaticPremiumLoan,CCSdividentotpion,CCS_Frequency, CC1_dividentotpion, LifeTimeRiderBenefit, MaxiMonthlyBenefit, TotalAnnualPremium, Mec, WaiverOfPremiumRider);
	}
	@When("^user fills CC_EntityOwner and Trust Certification details and click on Next$")
	public void user_fills_EntityOwner_and_Trust_Certification_details_and_click_on_Next() throws Throwable {
		
		String Entitytype = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_TypeofEntityOwnership");
		String SpecificEntityType = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_SpecifyType");
		String EntityName = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NameOfEntity_or Trust");
		String ProposedInsuredDirector = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_ProposedInsuredaDirector");
		String EntityMaxfaceamount = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_MaxFaceAmount");
		String MM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "DateOfTrust_MM");
		String DD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"DateOfTrust_DD");
		String YYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "DateOfTrust_YYYY");
		String TypeofTrust = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "TypeOfTrust(Yes_revoc/No_Irrevoc");
		String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Enity_SameasAddress");
		String street1 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_Stree1");
		String street2 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Entity_Street2");
		String city = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_City");
		String state = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_State");
		String Zip = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Entity_Zip");
		String Mailingadd = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_MailAdd");
		String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Entity_MailingStreet1");
		String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Entity_MailingStreet2");
		String Mail_city = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_MailingCity");
		String Mail_State = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_MailState");
		String Mail_Zip = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Entity_MailZip");
		String SSN_EIN = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Entity_SSn_OR_EIN");
		String SSN_EINnumber = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Entity_SSN_EINNumber");
		String TypeOfCitizenship = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Entity_TypeOfCitizenship_UsEntity(Yes)_Foreign(No)");
		//TrustCertificaiton
		String TrusteeType = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Trustee_Type");
		String FirstName = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Trustee_Indiviual/Entity_firstName");
		String MiddleName = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Trustee_Indiviual/Entity_MiddleName");
		String LastName = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Trustee_Indiviual/Entity_LastName");
		String Suffix = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Trustee_Indiviual/Entity_Suffix");
		String email = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Trustee_Indiviual/Entity_Email");
		String trustEntityName = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Trustee_EntityName");
		String title = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Trustee_entityTitle");
		
		String Grantortype = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_Type");
		String GrantorFirstname = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_Indiviual/Entity_firstName");
		String GrantorMiddlename = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_Indiviual/Entity_MiddleName");
		String GrantorLastname = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_Indiviual/Entity_LastName");
		String Grantorsuffix = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_Indiviual/Entity_Suffix");
		String Grantorcountry = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_Indiviual/Entity_CountyCitizen");
		String mm = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_DOB_MM");
		String dd = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_DOB_DD");
		String yyyy = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_DOB_YYYY");
		String ssn = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_INDIV_SSN_ITN");
		String AddressSamePI = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_AddressSameAsPI");
		String streetone = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_IndivEntity_Stree1");
		String streettwo = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_IndivEntity_Stree2");
		String City = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_IndivEntity_City");
		String Grantorstate = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_IndivEntity_State");
		String zipcode = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_IndivEntity_Zipcode");
		String GrantorEntityName = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Grantor_EntityName");
		String TaxPayerno = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Grantor_TaxpayerId");
		
		String RelationShipBene = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"Relationto Bene");
		String RelationshipOtherDtls = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "RelationshipOtherDtls");
		String AuthorizeTrusteee = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"AuthorizeTrusteee");
		String viaticalCompany = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "viaticalCompany");
		String RelationGrantor = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "RelationGrantor");
		String SigningTrustee = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"SigningTrustee");
		
		
	
		
		// Apex
		String Signertitle = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Entity_SignerTitle");
		String SolefiicerYesNo = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Entity_SoleOfficer_Yes_No");
		String SoleFirstName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Entity_Sole_FirstName");
		String SoleLastName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Entity_soleLastName");
		
		String VULBussinesphoneno = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "RelationGrantor");
		String VULphonetype = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "SigningTrustee");

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

	@When("^user fills CC_Life Owner details and Life Owner cont then click on Next$")
	public void user_fills_Life_Owner_details_and_Life_Owner_cont_then_click_on_Next() throws Throwable {
		String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_Owner_an_individual_or_entity");
		String InsuredonlyOwnerquestn = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LCS_proposed_insured_the_owner");
		if(Indiviual_Entity.equalsIgnoreCase("IndividualOwner") && InsuredonlyOwnerquestn.equalsIgnoreCase("No") ){
			String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_IndividualOwnerType");
			String firstname = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_street2");
			String city = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_state");
			String Zip = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_extension");
			String email = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_email");
			String relationship = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "LO_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"LO_SSN");
			//LifeOwner Continuous
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//lifeownerContinuous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_Exp_YYYY");
			PI_cont.PIC_identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
	}
	
	@When("^user fills CCone Employment Information and click on Next$")
	public void user_fills_CCone_Employment_Information_and_click_on_Next() throws Throwable {
		String OwnerEmployed = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"EI_Owner_Employed");
		String businesname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "EI_BussinesNames");
		String street1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "EI_Street1");
		String street2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"EI_Street2");
		String city = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"EI_City");
		String state = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"EI_State");
		String zip = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"EI_Zipcode");
	
	   EI.empolyementInformation(OwnerEmployed, businesname, street1, street2, city, state, zip);
	}

	@When("^user fills CC_JointContigent Owner cont setup details and click on Next$")
	public void user_fills_JointContigent_Owner_cont_setup_details_and_click_on_Next() throws Throwable {
		String Indiviual_Entity = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LCS_Owner_an_individual_or_entity");
		String indiviualOwnertype = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_IndividualOwnerType");
		String InsuredonlyOwnerquestn = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LCS_proposed_insured_the_owner");
		if (indiviualOwnertype.equalsIgnoreCase("One individual owner during his/her lifetime and thereafter a contingent owner and thereafter the Insured")&&
				InsuredonlyOwnerquestn.equalsIgnoreCase("No") && Indiviual_Entity.equalsIgnoreCase("IndividualOwner")) {
			String firstname = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_FirstName");
			String middlename = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_MiddleName");
			String lastname = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_lastName");
			String suffix = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_Suffix");
			String MM = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_DOB_MM");
			String DD = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_DOB_DD");
			String YYYY = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_DOB_YYY");
			String Gender = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_Gender");	
			String AddresssameasPI = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_ResdentialAdrs_sameas");
			String street1 = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LOStreet1");
			String street2 = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_street2");
			String city = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_city");
			String Resd_State = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_state");
			String Zip = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_zip");
			String Mailingadd = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_MailingAdrs_sameas");
			String Mail_Strt1 = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_MailingStreet1");
			String Mail_Strt2 = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_Mailing_street2");
			String Mail_city = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_Mailing_city");
			String Mail_State = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_Mailing_state");
			String Mail_Zip = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_Mailing_zip");
			String prefphno = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_Phoneno");
			String homeworkmob = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_HomeWorkCell");
			String Extension = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_extension");
			String email = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_email");
			String relationship = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname, "LO_RelationshiptoInsured");
			String ssn = testdata.get(HooksTest.scenario.getName(),inputfilename, inputsheetname,"LO_SSN");
			LO.IndiviualOwnerDetials(indiviualOwnertype, firstname, middlename, lastname, suffix, MM, DD, YYYY, Gender);
			LO.Address(AddresssameasPI, street1, street2, city,Resd_State, Zip, Mailingadd, Mail_Strt1, Mail_Strt2, Mail_city, Mail_State,
					Mail_Zip, prefphno, homeworkmob, Extension, email, relationship, ssn);
			//jointcontigentowner continous
			String PICont_USDriversLicense = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_U.S.DriversLicense");
			String PIC_IdentificationNumber = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_IdentificationNumber");
			String PIC_ReasonWhy = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_PIC_ReaspnWhy");
			String PICType_of_identification = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_TypeOfIdentification");
			String PIC_State_ProvinceofIssue_pass = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_PIC_StateProvinceofIssue");
			String PICProposedInsuredCont_Others = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_PIC_Other");
			String TypeofCitizenship = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_PIC_TypeofCitizenship");
			String Expr_MM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname,"LOC_Exp_MM");
			String Expr_DD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_Exp_DD");
			String Expr_YYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LOC_Exp_YYYY");
			PI_cont.PIC_identification(PICont_USDriversLicense, PIC_ReasonWhy, PICType_of_identification,
					PIC_IdentificationNumber, PIC_State_ProvinceofIssue_pass, PICProposedInsuredCont_Others,
					TypeofCitizenship,Expr_MM,Expr_DD,Expr_YYYY);
		}
	}
	

	@When("^user fills CCone Life Beneficiaries details and click on Next$")
	public void user_fills_CCone_Life_Beneficiaries_details_and_click_on_Next() throws Throwable {
		
		String beneficiaryform = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_Beneficiaryform");
		String LB_Distributiontype = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_BusinessSupplement_DistributionType");
		String LB_beneaddition_yesorNo = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_Beneficiary_ClickHeretoAdd");
		String LB_Beneficiary_Type = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_Beneficiary_Type");
		String LB_firstname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_FirstName");
		String LB_Middlename = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_M.I.");
		String LB_Lastname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_LastName");
		String LB_suffix = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_Suffix");
		String LB_MAilingadd_yesorNo = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_MailingAddresssameasPrimaryInsured?");
		String LB_HomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_HomeWorkMobile");
		String LB_phonenumber = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_PhoneNumber");
		String LB_Extension = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_Extension");
		String LB_Month = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_DOB_MM");
		String LB_Date = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_DOB_DD");
		String LB_Year = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_DOB_YYYY");
		String LB_TinType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_TINType");
		String LB_SSNno = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LB_NI_TaxIDNo");
		String LB_RelationShip = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_RelationshiptoInsured");
		String LB_Distribution = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_Distribution");
		String LB_IssueStripes = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_NI_Issueperstirpes");
		String SecondaryBeneficiary = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_SecondaryBeneficiary");
		String additionalInfo = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LB_AdditionalInfo");
		
		LifeBene.bene(beneficiaryform);
		LifeBene.distribution_Type(LB_Distributiontype);
		LifeBene.beneficiary_addition(LB_beneaddition_yesorNo, LB_Beneficiary_Type, LB_firstname, LB_Middlename,
				LB_Lastname, LB_suffix, LB_MAilingadd_yesorNo, LB_HomeWorkMobile, LB_phonenumber, LB_Extension,
				LB_Month, LB_Date, LB_Year, LB_TinType, LB_SSNno, LB_RelationShip, LB_Distribution, LB_IssueStripes,SecondaryBeneficiary,additionalInfo);
	
		
	}

	@When("^user fills CCone Other Coverage or Replacement details and CCselect LTCR Lapse details and click on Next$")
	public void user_fills_CCone_Other_Coverage_or_Replacement_details_and_CCselect_LTCR_Lapse_details_and_click_on_Next() throws Throwable {
		String OTHINS_HasExisting = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "OC_OTHINS_HasExisting");
		String OTHINS_ApplicationPending = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "OC_OTHINS_ApplicationPending");
		String OTHINS_HasExistingLTC = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"OC_OTHINS_HasExistingLTC");
		String OTHINS_HasTerminatedLTC = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"OC_OTHINS_HasTerminatedLTC");
		String OTHINS_ReplaceLTC = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"OC_OTHINS_ReplaceLTC");
		String OTHINS_Replace = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "OC_OTHINS_Replace");
		String TotalInforceAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"NY_OtherCoverage_TotalInforceAmount");
		String TotalPendingAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NY_OtherCoverage_TotalPendingAmount");
		String TotalPlacedAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Oc_TotalPlacedAmount");
		//AZ
		String Az_Replacement = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Az_OC_Replacement");
		String Az_AnotherLTCInsPolicy = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Az_OC_AnotherLTCInsPolicy");
		String AZ_completedbyProducer = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AZ_OC_completedbyProducer");
		String Az_PolicesThatareSold = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Az_OC_PolicesThatareSold");
		String Az_Policesarestillininforce = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Az_OC_Policesarestillininforce");	
		String Az_Soldinpast5years = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Az_OC_Soldinpast5years");
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Product");
		String PINottoDesignate = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_ProtectionAgainstlapse");
		String firstname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_Firstname");
		String lastname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_LastName");
		String middlename = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_Middle");
		String suffix = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_suffix");
		String street1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTR_stree1");
		String street2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_stree2");
		String city = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_city");
		String state = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_State");
		String Zip = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_zip");
		String Phone = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_phone");
		String PhoneType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_phoneType");
		String Statename = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		String PO_PINottoDesignate = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_ProtectionAgainstlapse");
		String PO_firstname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_Firstname");
		String PO_lastname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_LastName");
		String PO_middlename = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_Middle");
		String PO_suffix = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_suffix");
		String PO_street1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_stree1");
		String PO_street2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_stree2");
		String PO_city = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_city");
		String PO_state = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_State");
		String PO_Zip = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_zip");
		String PO_Phone = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_phone");
		String PO_PhoneType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PO_LTCR_phoneType");
		
		
		CoOC.OtherCoverage(Az_Replacement,Az_AnotherLTCInsPolicy,OTHINS_HasExisting, OTHINS_ApplicationPending, OTHINS_HasExistingLTC, OTHINS_HasTerminatedLTC, OTHINS_ReplaceLTC, 
				OTHINS_Replace, TotalInforceAmount,TotalPendingAmount,TotalPlacedAmount,AZ_completedbyProducer,Az_PolicesThatareSold,Az_Policesarestillininforce,
				Az_Soldinpast5years);
		LTCR.protectionAgainstLapse(ProductType, Statename, PINottoDesignate, firstname, lastname, middlename, suffix, street1, street2, city, state,
				Zip, Phone, PhoneType, PO_PINottoDesignate, PO_firstname, PO_lastname, PO_middlename, PO_suffix, PO_street1, PO_street2,
				PO_city, PO_state, PO_Zip, PO_Phone, PO_PhoneType);
	}
	
	/*@When("^user fills CCselect LTCR Lapse details and click on Next$")
	public void user_fills_CCselect_LTCR_Lapse_details_and_click_on_Next() throws Throwable {
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Product");
		String PINottoDesignate = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_ProtectionAgainstlapse");
		String firstname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_Firstname");
		String lastname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_LastName");
		String middlename = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_Middle");
		String suffix = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_suffix");

		String street1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTR_stree1");
		String street2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_stree2");
		String city = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_city");
		String state = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_State");
		String Zip = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_zip");
		String Phone = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_phone");
		String PhoneType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LTCR_phoneType");
		LTCR.protectionAgainstLapse(ProductType,PINottoDesignate, firstname, lastname, middlename, suffix, street1, street2, city,
				state, Zip, Phone, PhoneType);
	}*/

	@When("^user fills CCone Certification or Requirements details and click on Next$")
	public void user_fills_CCone_Certification_or_Requirements_details_and_click_on_Next() throws Throwable {
		String salesofcertification = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Cert_salesillustration");
		String Certi_taxpayer_id = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Cert_Taxpayer_id");
		String Certi_backupwithholding_id = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Cert_backupwithholding");
		String Certi_IamUs = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"Cert_UsPerson");
		String State = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
	    CC.salesCertification(State,salesofcertification,Certi_taxpayer_id, Certi_backupwithholding_id, Certi_IamUs);
	   
	}

	@When("^user fills CCone Life Producer Statement details and click on Next$")
	public void user_fills_CCone_Life_Producer_Statement_details_and_click_on_Next() throws Throwable {
		String RiskClassification = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPS_RiskClassificationPresentedtoClient");
		String MultipolicyCase = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LIfeProducerStatement_Isthispartofamulti-policycase");
		String MultipolicyCasePolicyNumbers = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PS_MultiPolicyProvidedassociatedPolicyNumber");
		String Otherapplicationssubmitted = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PS_Arethereanyotherapplications");
		String OtherapplicationssubmittedPolicyNumbers = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PS_OtherapplicationssubmittedPolicyNumber");
		String Dividends = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPS_Willdividendsfrom");
		String ServiceRequest = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPS_ServiceRequestform");
		String PurchaseSinglePremiumImmediateAnnuity = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPS_SinglePremiumImmediateAnnuity");
		String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PS_PurchaseSinglePremiumProvideassociatedPolicyNumber");
		String UnderstandEnglish = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PS_English");
		String MarketType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PS_MarketType");
		String MarketType_other = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PS_MarketTypeOther");
		String U0100 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"PS_U0100");
		
		producerStatement.enterProducerStatement(RiskClassification, MultipolicyCase, MultipolicyCasePolicyNumbers, Otherapplicationssubmitted,
				OtherapplicationssubmittedPolicyNumbers, Dividends, ServiceRequest, PurchaseSinglePremiumImmediateAnnuity, 
				PurchaseSinglePremiumImmediateAnnuityPolicyNumbers, UnderstandEnglish, MarketType, MarketType_other,U0100);
	}

	@When("^user fills CCone Life Producer Compensation details and click on Next$")
	public void user_fills_CCone_Life_Producer_Compensation_details_and_click_on_Next() throws Throwable {
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_Product");
		String ProducerRole = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_ProducerRole");
		String ProducerEmail = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_Email");
		String LicenceID = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LifeProducerCompensation_FloridLIC");
		String Firstyearcommission = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_1stYearCommission");
		String RenewalCommision = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_RenewalCommission");
		String AdditionalProducer = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_Arethereadditionalproducers?");
		String PC_Indicate_Sales_and_Marketing  = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PC_Indicate_Sales_and_Marketing");
		String otherdetails = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PC_otherdetails");
		String ContactOneFirstName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_Contact1FirstName");
		String ContactOneLastName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_Contact1LastName");
		String ContactOnePhone = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_Contact1Phone");
		String ContactOneHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_Contact1HomeWorkMobile");
		String ContactOneExtension = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_Contact1WorkExtension");
		String ContactOneEmail = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_Contact1Email");
		String Add_ProducerRole = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_Add_ProducerRole");
		String NumberOfProducer = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Number_OF_producer");
		String ProducerID = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_ProducerID");
		String AgencyId = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_AgencyId");
		String ProducerID2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_ProducerID2");
		String AgencyId2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_AgencyId2");
		String ProducerID3 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_ProducerID3");
		String AgencyId3 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "LPC_AgencyId3");
		String fst_Year_Commission1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_%_1st_Year_Commission1");
		String Renewal_Commission1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_%_Renewal_Commission1");
		String fst_Year_Commission2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_%_1st_Year_Commission2");
		String Renewal_Commission2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_%_Renewal_Commission2");
		String fst_Year_Commission3 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_%_1st_Year_Commission3");
		String Renewal_Commission3 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"LPC_%_Renewal_Commission3");
		String firm1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"firm1");
		String firm2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"firm2");
		String firm3 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"firm3");

		producerCompensation.enterProducerCompensation(ProductType,ProducerRole, ProducerEmail, LicenceID, Firstyearcommission,
				RenewalCommision, AdditionalProducer);
		producerCompensation.AdditionalProducer(ProductType,AdditionalProducer, NumberOfProducer, Add_ProducerRole, 
				ProducerID, AgencyId,firm1, ProducerID2, AgencyId2,firm2, ProducerID3, AgencyId3,firm3, 
				fst_Year_Commission1, Renewal_Commission1, fst_Year_Commission2, Renewal_Commission2, fst_Year_Commission3, Renewal_Commission3);
		producerCompensation.ContactDetails( PC_Indicate_Sales_and_Marketing, otherdetails,ContactOneFirstName, ContactOneLastName, ContactOnePhone,
				ContactOneHomeWorkMobile, ContactOneExtension, ContactOneEmail);
		
		   
		
	}
	
	@When("^user fills CCone NewYork screens when state is NewYork then click on Next$")
	public void user_fills_CCone_NewYork_screens_when_state_is_NewYork_then_click_on_Next() throws Throwable {
		String Anticipatedtimecoverage = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_coverageisneeded");
		String Primarypurposeof_ins = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_PrimaryPurposeOfIns");
		String InsOptionsAbove = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_InsOptionsAbove");
		String Dependent = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_dependents");
		String DependentDetails = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_dependentDetails");
		String OtherText = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_dependentOtherDetails");
		String state = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname, "CI_State");
		String sourceofPremium = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilitysourceofPremium");
		String TaxPenality = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_TaxPenality");
		String hardshipwithdrawal = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_hardshipwithdrawal");
		String surrenderCharge = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_surrenderCharge");
		String surrenderChargeDetail = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_surrenderChargeDetail");
		String Exchangeamount = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_Exchangeamount");
		String exchangSurenderCharge = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_exchangSurenderCharge");
		String surrenderChargeAmount = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_surrenderChargeAmount");
		String AnnuitizationSurenderCharge = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NY_ProductsSuitability_AnnuitizationSurenderCharge");
		String AnnuitizationSurenderChargeAmount = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "NY_ProductsSuitability_AnnuitizationSurenderChargeAmount");
		String securitiess = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_securitiess");
		String Annuitiess = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_Annuitiess");
		String CashValues = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_CashValues");
		String AlternativeInvestmentss = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_AlternativeInvestmentss");
		String FinancialObject = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitability_FinancialObject");
		String T20million = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_T20million");
		String Proposedannualpremium = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_Proposedannualpremium");
		String Faceamount = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_FaceAmount");
		String ReplaceByPolicy = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_ReplaceByPolicy");
		String AnnualPrem_Cost = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_AnnualPrem_Cost");
		String Totalfaceamount = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_Totalfaceamount");
		String TotalannualIncome = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_TotalannualIncome");
		String RiskTolerance = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_Risktoleranceaboutpremiums");
		String Risktoleranceaboutdeath = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_Risktoleranceaboutdeathbenefit");
		String RiskToleranceTwo = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilityContinus_Risk toleranceaboutLongTermCare");	
		String txtareaone = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilitySummary_Textareaone");
		String txtareaTwo = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilitySummary_TextareaTwo");
		String txtareaThree = testdata.get(HooksTest.scenario.getName(), inputfilename, inputsheetname,"NY_ProductsSuitabilitySummary_TextareaThree");
		
		NYlps.productAndPremiumPayorInfo(state, Anticipatedtimecoverage, Primarypurposeof_ins, InsOptionsAbove,
				Dependent, DependentDetails, OtherText);
		NYlps.financialinfo(state, sourceofPremium, TaxPenality, hardshipwithdrawal, surrenderCharge,
				surrenderChargeDetail, Exchangeamount, exchangSurenderCharge, surrenderChargeAmount,
				AnnuitizationSurenderCharge, AnnuitizationSurenderChargeAmount);
		NYlps.financialExperience(state, securitiess, Annuitiess, CashValues, AlternativeInvestmentss, FinancialObject);
		/*NYPSC.suitabilitycontinues(state, T20million, Proposedannualpremium, Faceamount, ReplaceByPolicy, AnnualPrem_Cost, Totalfaceamount, TotalannualIncome, RiskTolerance, Risktoleranceaboutdeath, RiskToleranceTwo);
		 
        String Alt_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Alt_propsedAnnualPremium");
        String Alt_faceamount = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Alt_faceamount");
        String Alt_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Alt_ReplacedByPolicy");        
        String Alt_TotalFaceAmount = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Alt_TotalFaceAmount");
        String Alt_TotalAnnualPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Alt_TotalAnnualPremium");
        String Alt_AnnuaLPremiumCost = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Alt_AnnuaLPremiumCost");        
        String Add_propsedAnnualPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_propsedAnnualPremium");
        String Add_faceamount = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_faceamount");
        String Add_ReplacedByPolicy = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_ReplacedByPolicy");
        String Add_Totalfaceamount = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_TotalFaceAmount");
        String Add_totalannualPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_TotalAnnualPremium");
        String Add_annuaLpremiumCost = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_AnnuaLPremiumCost");
        //For NY and Alt and Additional Product
        NYPSC.suitabiltycont_coverage_costinfo(Alt_propsedAnnualPremium, Alt_faceamount, Alt_ReplacedByPolicy, Alt_TotalFaceAmount, Alt_TotalAnnualPremium, Alt_AnnuaLPremiumCost,
        		Add_propsedAnnualPremium, Add_faceamount, Add_ReplacedByPolicy, Add_Totalfaceamount, Add_totalannualPremium, Add_annuaLpremiumCost);
        
        //For NY Risk tollerance for both alt and additional
        String ALt_RiskTolerance = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_ALt_RiskTolerance");
        String Alt_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Alt_RiskToleranceAboutDeath");
        String Add_RiskTolerance = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_RiskTolerance");
        String Add_RiskToleranceAboutDeath = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_LPSC_Add_RiskToleranceAboutDeath");
        NYPSC.RiskTolerance_Alt_Add(ALt_RiskTolerance, Alt_RiskToleranceAboutDeath, Add_RiskTolerance, Add_RiskToleranceAboutDeath);*/
		NGE.nonFuaranteeedelement(state);
		
		 String Alt_TextAreaone = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_PSS_Alt_TextAreaone");
	        String Alt_Textareatwo = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_PSS_Alt_Textareatwo");
	        String Alt_TextAreathree = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_PSS_Alt_TextAreathree");
	        String Add_TextAreaone = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_PSS_Add_TextAreaone");
	        String Add_Textareatwo = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_PSS_Add_Textareatwo");
	        String Add_Textareathree = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "NY_PSS_Add_Textareathree");
	     
	        NGE.productsuitability(state,txtareaone, txtareaTwo, txtareaThree, Alt_TextAreaone,Alt_Textareatwo,Alt_TextAreathree,
	    			 Add_TextAreaone, Add_Textareatwo,Add_Textareathree);
	}

	@When("^user fills CCone Additional Forms details and click on Next$")
	public void user_fills_CCone_Additional_Forms_details_and_click_on_Next() throws Throwable {
		String preferedLanguage = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "PI_PrefferedLang");
		String languages = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AdditionalForms_Foreign_Language_Language");
		String Others = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AdditionalForms_Foreign_Language_Language_Other");
		String Translator = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AdditionalForms_Foreign_Language_Language_Translator_is_a_or_an");
		String AgentFirstname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_GeneralAgent_FirstName");
		String Agent_Midlename = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_GeneralAgent_MI");
		String AgentLastname = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_GeneralAgent_LastName");
		String Agent_suffix = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_GeneralAgent_Sufix");
		String ProfessionalFirstName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AF_Professional_FirstName");
		String ProfessionalMidleName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_Professional_MI");
		String ProfessionalSuffix = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_Professional_Sufix");
		String ProfessionalLastName = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AF_Professional_LastName");
		String ProfessionalTranslationFirm = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AF_Professional_TranslationFirm");
		String ProfessionalStreet_1 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AF_ProfessionalStreet_1");
		String ProfessionalStreet_2 = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname,"AF_ProfessionalStreet_2");
		String Professional_City = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_Professional_City");
		String Professional_State = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_Professional_State");
		String Professional_Zip = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "AF_Professional_Zip");
		Addforms.enterAdditionalFormsDetail(preferedLanguage, languages, Others, Translator, AgentFirstname,
				Agent_Midlename, AgentLastname, Agent_suffix, ProfessionalFirstName, ProfessionalMidleName,
				ProfessionalLastName, ProfessionalSuffix, ProfessionalTranslationFirm, ProfessionalStreet_1,
				ProfessionalStreet_2, Professional_City, Professional_State, Professional_Zip);
	}

	@When("^user fills CCone Attachments details and click on Next$")
	public void user_fills_CCone_Attachments_details_and_click_on_Next() throws Throwable {
		
		String Policytype = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Policytype");
        String PlantrustType = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PlantrustType");
        String pleasespecify = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "pleasespecify");
        String Howlongplanbeen = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Howlongplanbeen");
        String Planname = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Planname");
        String trustee = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "trustee");
        String street1 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifed_street1");
        String street2 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifed_street2");
        String city = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifed_city");
        String qualifedstate = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifedstate");
        String zip = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifiedzip");
        String MM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifed_MM");
        String DD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifed_DD");
        String YYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "qualifed_YYYY");
		
        String Qualified_PlanTrustSponsorEIN = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Qualified_PlanTrustSponsorEIN");
        String Qualified_TotalnoEmployee = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Qualified_TotalnoEmployee");
        String Qualified_NoofEmployecoverdPlan = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Qualified_NoofEmployecoverdPlan");
        String Qualified_ExplainBasisofEmployee = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Qualified_ExplainBasisofEmployee");
		
        String PlanTrustSponsorEInumber = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Qualified_PlanTrustSponsorEInumber");
		QP.PolicyTrust_Plantrust(Policytype, PlantrustType,pleasespecify, Howlongplanbeen, Planname, trustee, street1, street2,
				city, qualifedstate, zip, MM, DD, YYYY,PlanTrustSponsorEInumber, Qualified_PlanTrustSponsorEIN, Qualified_TotalnoEmployee, Qualified_NoofEmployecoverdPlan, Qualified_ExplainBasisofEmployee);
		
		
		
		String fullnameEmploye = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "fullnameEmploye");
        String plansponsor_street1 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "plansponsor_street1");
        String plansponsor_street2 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "plansponsor_street2");
        String plansponsor_city = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "plansponsor_city");
        String plansponsor_state = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "plansponsor_state");
        String plansponsor_zip = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "plansponsor_zip");
        String Employer_sponsor_EINNumber = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Employer_sponsor_EINNumber");
        String PlanSponsore_Authorized_fullname = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PlanSponsore_Authorized_fullname");
        String PlanSponsor_Authorized_lastname = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PlanSponsor_Authorized_lastname");
      
		QP.EmployerPlanSponsor(fullnameEmploye, plansponsor_street1, plansponsor_street2, plansponsor_city, plansponsor_state, plansponsor_zip,Employer_sponsor_EINNumber,PlanSponsore_Authorized_fullname, PlanSponsor_Authorized_lastname);
		
		String ThirdParty_fullname = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ThirdParty_fullname");
        String ThirdParty_street1 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ThirdParty_street1");
        String ThirdParty_street2 = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ThirdParty_street2");
        String ThirdParty_city = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ThirdParty_city");
        String ThirdParty_state = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ThirdParty_state");
        String ThirdParty_zip = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ThirdParty_zip");
        String Thirdparty_preferredphone = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Thirdparty_preferredphone");
        String Thirdparty_phonetype = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Thirdparty_phonetype");
        String Thirdparty_email = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Thirdparty_email");
		QP.ThirdPartyAdministrationinfo(ThirdParty_fullname, ThirdParty_street1, ThirdParty_street2, ThirdParty_city, ThirdParty_state, ThirdParty_zip, Thirdparty_preferredphone,
				Thirdparty_phonetype, Thirdparty_email);
		
		String Whatlimitofamount = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PurposeOFLifeINS");
        String ApproxValueAssets = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ApproximateValue");
        String annualpremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "AnnualPremium");
        String EmployerContribution = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "EmployerContribution");
        String FundingMethod = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "DefinedBenefitPlans");
        String LimitOFDeathBenefit = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "LimitsOFDeathBenefit");
        String Totalamountaggreemnt = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "TotalAmountAgrrement");
        String yearone = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "YearONe");
        String yeartwo = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "YearTwo");
        String SelectAllType = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "SelectAllType");
        String ParticipantLive = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "ParticipantLive");
        String Pleasexpalin = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Participant_PleaseExpalain");
        String FundedpleaseSpecify = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "FundedpleaseSpecify");
       
        String Self_DDC_IsReducedPremium = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Self_DDC_IsReducedPremium");
        String Self_DDC_approxvalue = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "Self_DDC_approxvalue");
		QP.Self_DDCPlanInfo(Whatlimitofamount, ApproxValueAssets, annualpremium, EmployerContribution, FundingMethod, LimitOFDeathBenefit, Totalamountaggreemnt, yearone, yeartwo,
				SelectAllType, ParticipantLive, Pleasexpalin, FundedpleaseSpecify,Self_DDC_IsReducedPremium,Self_DDC_approxvalue);
		
		String state = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_ProductType");
		attach.attachDocuments(state,ProductType);
		/*String state = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "CI_State");
		attach.attachDocuments(state);*/
	}

	@Then("^Lock the CCone policy and do wet sign or Esign$")
	public void lock_the_CCone_policy_and_do_wet_sign_or_Esign() throws IOException  {

		
		String ProductType = testdata.get(HooksTest.scenario.getName(), inputfilename,"Term", "CI_ProductType");
		int policyrow = row + 2;
		lock.LockScreen(policyrow,ProductType);

		String SignType = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "SignatureMethod");
		String InsIDproof = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Esign_InsuredIdType");
		String InsIdNum = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "Esign_InsuredIdNumber");

		String OwnerInsIDproof = testdata.get(HooksTest.scenario.getName(), inputfilename,inputsheetname, "OwnerInsIDproof");
		String OwnerInsIdNum = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "OwnerInsIdNum");
		String proposedInsuredCity = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "proposedInsuredCity");
		String proposedinsuredstate = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "proposedinsuredstate");
		
		String WetsignType = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "WetsignType");
		String InsMM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "InsMM");
		String InsDD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "InsDD");
		String InsYYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "InsYYYY");

		String PrdMM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PrdMM");
		String PrdDD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PrdDD");
		String PrdYYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PrdYYYY");
		String OwnerMM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "OwnerMM");
		

		String OwnerDD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "OwnerDD");
		String OwnerYYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "OwnerYYYY");
		
		String PlanSponsorMM = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PlanSponsorMM	");
		String PlanSponsorDD = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PlanSponsorDD");
		String PlanSponsorYYYY = testdata.get(HooksTest.scenario.getName(),inputfilename,inputsheetname, "PlanSponsorYYYY");
		
		lock.signature(SignType, InsIDproof, InsIdNum,policyrow,ProductType, OwnerInsIDproof, OwnerInsIdNum,
				WetsignType, InsMM, InsDD,InsYYYY, PrdMM,PrdDD, PrdYYYY,OwnerMM, OwnerDD, OwnerYYYY, proposedInsuredCity, proposedinsuredstate
				,PlanSponsorMM,PlanSponsorDD,PlanSponsorYYYY);

		System.out.println("error cmeae");
	}
	



}
