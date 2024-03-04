package stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;

import commonutils.TestPropertyFileRead;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclass.AdditionalForms;
import pageclass.Attachments;
import pageclass.HIVConsent;
import pageclass.LifeProducerCompensation;
import pageclass.LockAndUnlock;
import pageclass.QualifiedPlan;
import pageclass.Workbench_LaunchEzApp;
import pageclassDi.Casesetup_new;
import pageclassDi.DI_BOE;
import pageclassDi.DI_BOE_ProductInformation;
import pageclassDi.DI_BuySell_ProdInfo;
import pageclassDi.DI_BuySell_ProdInfo_Continued;
import pageclassDi.DI_BuySell_Product;
import pageclassDi.DI_RetireGuardStandAlone;
import pageclassDi.DI_TransitionSelect;
import pageclassDi.MMSD_CaseInfo;
import pageclassDi.MMSD_DI_AltAdd;
import pageclassDi.MMSD_DI_EmploymentInfo;
import pageclassDi.MMSD_DI_HIV;
import pageclassDi.MMSD_DI_OtherCoverageInformation;
import pageclassDi.MMSD_DI_Outlineofcoverage;
import pageclassDi.MMSD_DI_PaymentInformation;
import pageclassDi.MMSD_DI_PersonalHistContTwo;
import pageclassDi.MMSD_DI_PersonalHistoryCont;
import pageclassDi.MMSD_DI_PersonalHistoryInformation;
import pageclassDi.MMSD_DI_ProducerCertificate;
import pageclassDi.MMSD_DI_ProducerCompensation;
import pageclassDi.MMSD_DI_ProposedInsured;
import pageclassDi.MMSD_DI_ProposedInsuredContntinues;
import pageclassDi.MMSD_DI_RadiusChoice;
import utilities.GetDataFromExcel;

public class DI {
	GetDataFromExcel testdata = new GetDataFromExcel();
	Workbench_LaunchEzApp workbenchLaunchEzApp = new Workbench_LaunchEzApp();
	MMSD_CaseInfo MMSDCaseInfo = new MMSD_CaseInfo();
	Casesetup_new MMSDDICS = new Casesetup_new();
	MMSD_DI_ProposedInsured MMSDDIPI = new MMSD_DI_ProposedInsured();
	MMSD_DI_ProposedInsuredContntinues MMSDDIPIC = new MMSD_DI_ProposedInsuredContntinues();
	MMSD_DI_PersonalHistoryInformation MMSDDIPHI = new MMSD_DI_PersonalHistoryInformation();
	MMSD_DI_PersonalHistoryCont MMSDDIPHIC = new MMSD_DI_PersonalHistoryCont();
	MMSD_DI_PersonalHistContTwo MMSDDIPHICT = new MMSD_DI_PersonalHistContTwo();
	MMSD_DI_RadiusChoice MMSDDIRC = new MMSD_DI_RadiusChoice();
	DI_RetireGuardStandAlone MMSDRGSA = new DI_RetireGuardStandAlone();
	DI_BOE BOE = new DI_BOE();
	DI_TransitionSelect DI_Transition = new DI_TransitionSelect();
	DI_BuySell_Product BuysellProd = new DI_BuySell_Product();
	DI_BuySell_ProdInfo BuySellProdInfor = new DI_BuySell_ProdInfo();
	DI_BuySell_ProdInfo_Continued BuySellProduInfoContinued = new DI_BuySell_ProdInfo_Continued();
	DI_BOE_ProductInformation BOEPI = new DI_BOE_ProductInformation();
	MMSD_DI_AltAdd MMSDDIAdd = new MMSD_DI_AltAdd();
	HIVConsent Consent_HIV = new HIVConsent();
	MMSD_DI_HIV MMSDHIV = new MMSD_DI_HIV();
	MMSD_DI_EmploymentInfo MMSDDIEmpInfo = new MMSD_DI_EmploymentInfo();
	MMSD_DI_PaymentInformation MMSDDIPayInfo = new MMSD_DI_PaymentInformation();
	MMSD_DI_OtherCoverageInformation MMSDDIOC = new MMSD_DI_OtherCoverageInformation();
	MMSD_DI_ProducerCertificate MMSDDIProdCert = new MMSD_DI_ProducerCertificate();
	MMSD_DI_ProducerCompensation MMSDDIProdComp = new MMSD_DI_ProducerCompensation();
	MMSD_DI_Outlineofcoverage MMSDDIOOC = new MMSD_DI_Outlineofcoverage();

	TestPropertyFileRead PropertyFileRead = new TestPropertyFileRead();
	LockAndUnlock lock = new LockAndUnlock();
	AdditionalForms Addforms = new AdditionalForms();
	Attachments attach = new Attachments();

	String diFilename = TestPropertyFileRead.getThePropertyValue("ExcelFileName");
	String disheetname = TestPropertyFileRead.getThePropertyValue("Disheetname");
	int Row;

	@Given("^Launch Fieldnet dev application to enter userid and Password click on Next (\\d+)$")
	public void launch_Fieldnet_dev_application_to_enter_userid_and_Password_click_on_Next(int arg1) throws Throwable {
		Row = arg1;
		workbenchLaunchEzApp.enterUserIDClickNext();
		workbenchLaunchEzApp.enterPasswordClickVerify();

	}

	@Given("^Click on SubmitNewBusiness Menu and Enter producer id and click on search$")
	public void click_on_SubmitNewBusiness_Menu_and_Enter_producer_id_and_click_on_search() throws Throwable {
		String producerID = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "ProducerID");
		workbenchLaunchEzApp.clickOnFieldnetDev();
		workbenchLaunchEzApp.enterProducerNumberClickSearch(producerID);
		String Environment = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Environment");
		workbenchLaunchEzApp.clickonSubmitNewBusinessWB(Environment);
	}

	@When("^EzApp is launched and user enters Di Insured details state and Di product$")
	public void ezapp_is_launched_and_user_enters_Di_Insured_details_state_and_Di_product() throws Throwable {
		String firstName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_Firstname");
		String lastName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_Lastname");
		String DOBMonth = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_Month");
		String DOBDay = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_Date");
		String DOBYear = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_Year");
		String Gender = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_Gender");
		String CaseDescription = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_Description");
		MMSDCaseInfo.enterCaseInfoDetails(firstName, lastName, DOBMonth, DOBDay, DOBYear, Gender, CaseDescription);
		String state = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_State");
		String productType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_productType");
		MMSDCaseInfo.CarrierAndProduct(state, productType);
		String subProductSelection = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		MMSDCaseInfo.selectProduct(subProductSelection);

	}

	@When("^user fills MMSD DIcase setup details and click on Next$")
	public void user_fills_MMSD_DIcase_setup_details_and_click_on_Next() throws IOException {
		String RigthDI = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_RightTo DI");
		String Rstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_ResidentState");
		String Occup = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_Occupational");
		String OccupModi = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LCS_OccupationalModifiers");
		String bsGrp = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_GroupNumber");
		String GRP_YesNo=testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_GrpYes_No");
		String Grp = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_GroupNumber");
		String Holdissue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_HoldIssue");
		String Agency = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Agency");
		String Signstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_SignState");
		String SignCity = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_SignCity");
		String QuickClose = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_QuickClose");
		String bsOwnerType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_OwnerType");
		String bsOwnstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LCS_OwnerState");
		String Firm = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "listFirm");
		String Product = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		String SalesPerson_RD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"SalesPerson_YesNo");
		String SalesFirstname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "SalesFirstname");
		String salesLastName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "SalesLastName");

		MMSDDICS.casedata(Product, RigthDI, Rstate, Occup, OccupModi, GRP_YesNo, Grp, Holdissue, Signstate, SignCity, QuickClose,
				bsOwnerType, bsOwnstate, bsGrp, Agency, Firm, SalesPerson_RD, SalesFirstname, salesLastName);

	}

	@When("^user fills MMSD Primary Insured details and click on Next$")
	public void user_fills_MMSD_Primary_Insured_details_and_click_on_Next() throws IOException {
		String BirthState = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_BirthState");
		String Ssn = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_SSN");
		String AddressStreet = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_AddressStreet");
		String AddCity = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_City");
		String Zip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Zip");
		String MailAdd = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_MailAdd");
		String Mail_Strt = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Add_Street");
		String Mail_city = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Add_City");
		String Mail_State = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Add_State");
		String Mail_Zip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Add_Zip");
		MMSDDIPI.PersonalInformation(BirthState, Ssn, AddressStreet, AddCity, Zip, MailAdd, Mail_Strt, Mail_city,
				Mail_State, Mail_Zip);

		String Phone = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Phone");
		String Home = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_HomeWork");
		String Time = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_BestTime");
		String Message = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Message");
		String Acc = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Accomodation");
		String English = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_PrefferedLang");
		String EMail = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PI_Email");
		MMSDDIPI.AdditionalInformation(Phone, Home, Time, Message, Acc, English, EMail);

	}

	@When("^user fills MMSD Primary Insured Cont details and click on Next$")
	public void user_fills_MMSD_Primary_Insured_Cont_details_and_click_on_Next() throws IOException {
		String DL_YesNo = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PIC_DriverLicense");
		String idnum = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PIC_identificationNo");
		String Signstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PIC_Province of Issue");
		String Reason = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PIC_Reason why");
		String TypeOfIdentificaion = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PIC_identification");
		String Other = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PIC_Other");
		MMSDDIPIC.identification(DL_YesNo, idnum, Signstate, Reason, TypeOfIdentificaion, Other);

		String Citizenship = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PIC_Type of Citizenship");
		MMSDDIPIC.citizenship(Citizenship);

	}

	@When("^user fills MMSD Personal History Information details and click on Next$")
	public void user_fills_MMSD_Personal_History_Information_details_and_click_on_Next() throws IOException {
		String Medical = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_Medical");
		String Tob12 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_Tobacco12");
		String Tob24 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_Tobacco24");
		String Cigar = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_Cigar");
		String Medication = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_Medication");
		String FeloParole = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_Felony");
		String AlcDrugs = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_Drug");
		String MotorAcc = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHI_MotorAccident");
		MMSDDIPHI.ProposedInsuredPersonalHistory(Medical, Tob12, Tob24, Cigar, Medication, FeloParole, AlcDrugs,
				MotorAcc);

	}

	@When("^user fills MMSD Personal History Information cont one details and click on Next$")
	public void user_fills_MMSD_Personal_History_Information_cont_one_details_and_click_on_Next() throws IOException {
		String Anticipate2yr = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PHC_Anticipate2yrQues");
		String ArmedForces = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHC_ArmedForcesQues");
		String yr3PilotAircraft = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PHC_yr3PilotAircraftQues");
		String underwriting2yr3yr = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PHC_underwriting2yr3yrQues");
		String text = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHC_TextArea");
		MMSDDIPHIC.proposedinsureQuestions(Anticipate2yr, ArmedForces, yr3PilotAircraft, underwriting2yr3yr, text);

	}

	@When("^user fills MMSD Personal History Information cont two and and click on Next$")
	public void user_fills_MMSD_Personal_History_Information_cont_two_and_and_click_on_Next()
			throws IOException, InterruptedException {
		String CurrOcc = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_CurrentOccupation");
		String Duty = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_Duties");
		String Business = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_BusinessName");
		MMSDDIPHICT.EmploymentInformation(CurrOcc, Duty, Business);

		String EmpStreet = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_EmpStreetAddress");
		String EmpCity = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_EmpCityName");
		String EmployerState = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_EmpStateName");
		String EmpZip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_EmpZipCode");
		MMSDDIPHICT.BusinessAddress(EmpStreet, EmpCity, EmployerState, EmpZip);

		String ECurrent = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_EarnedCurrent");
		String EPrior = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_EarnedPrior");
		String UECurrent = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_UnEarnedCurrent");
		String UEPrior = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PHCT_UnEarnedPrior");
		MMSDDIPHICT.IncomeInformation(ECurrent, EPrior, UECurrent, UEPrior);

	}

	@When("^user fills MMSD DI Radius Choice details and click on Next$")
	public void user_fills_MMSD_DI_Radius_Choice_details_and_click_on_Next() throws IOException {
		String product = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		String Monthlybenefit = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_MonthlyBenefit");
		String Benefitperiod = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_BenefitPeriod");
		String Waitingperiod = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_WaitingPeriod");
		MMSDDIRC.Radiochoiceproduct(product, Monthlybenefit, Benefitperiod, Waitingperiod);

		String UseOfPI = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_RC_usepropsedInsured");
		String Product = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		MMSDDIRC.RecipientOfBenefitsAssignment(Product, UseOfPI);

		String DI_RC_MaximumBenefitPeriod_Rider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_MaximumBenefitPeriod_Rider");
		String DI_RC_SocialInsuranceRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_SocialInsuranceRider");
		String DI_RC_SocialInsuranceRider_MntlyBenfit = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_SocialInsuranceRider_MntlyBenfit");
		String DI_RC_ExtendedPartialDiRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_ExtendedPartialDiRider");
		String DI_RC_AutomaticBenefitIncreaseRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_AutomaticBenefitIncreaseRider");
		String DI_RC_CatastrophicRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_CatastrophicRider");
		String DI_RC_CatastrophicRider_MonthlyBenefit = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_CatastrophicRider_MonthlyBenefit");
		String DI_RC_CatastrophicRider_BenefitPeriod = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_CatastrophicRider_BenefitPeriod");
		String DI_RC_CatastrophicRider_WaitingPeriod = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_CatastrophicRider_WaitingPeriod");
		String DI_Rc_CostOfLivingRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_Rc_CostOfLivingRider");
		String DI_RC_OwnOccupationRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_OwnOccupationRider");
		String DI_RC_FutureinsOptionRider_FIO = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_FutureinsOptionRider_FIO");
		String DI_RC_FutureinsOptionRider_FIO_Amount = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_FutureinsOptionRider_FIO_Amount");
		String DI_RC_BenefitIncreaseRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_BenefitIncreaseRider");
		String DI_RC_ShortTermDisabilityBenefitRider_Option1 = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_ShortTermDisabilityBenefitRider_Option1");
		String DI_RC_ShortTermDisabilityBenefitRider_Option1_MonthlyBenefitAmount = testdata.get(
				HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_ShortTermDisabilityBenefitRider_Option1_MonthlyBenefitAmount");
		String DI_RC_ShortTermDisabilityBenefitRider_Option1_WaitingPeriod_BenefitPeriod = testdata.get(
				HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_ShortTermDisabilityBenefitRider_Option1_WaitingPeriod_BenefitPeriod");
		String DI_RC_ShortTermDisabilityBenefitRider_Option2 = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_ShortTermDisability BenefitRider _Option2");
		String DI_RC_ShortTermDisabilityBenefitRider_Option2_MonthlyBenefitAmount = testdata.get(
				HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_ShortTermDisability BenefitRider _Option2_MonthlyBenefitAmount");
		String DI_RC_GroupSuppliementDisabilityRider = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_GroupSuppliementDisabilityRider");
		String DI_RC_GroupSuppliementDisabilityRider_CoverageA = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_GroupSuppliementDisabilityRider_CoverageA");
		String DI_RC_GroupSuppliementDisabilityRider_CoverageA_MonthlyBenefit = testdata.get(
				HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_GroupSuppliementDisabilityRider_CoverageA_MonthlyBenefit");
		String DI_RC_GroupSuppliementDisabilityRider_CoverageA_WaitingPeriod = testdata.get(
				HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_GroupSuppliementDisabilityRider_CoverageA_WaitingPeriod");
		String DI_RC_GroupSuppliementDisabilityRider_CoverageB = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_GroupSuppliementDisabilityRider_CoverageB");
		String DI_RC_GroupSuppliementDisabilityRider_CoverageB_MonthlyBenefit = testdata.get(
				HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_GroupSuppliementDisabilityRider_CoverageB_MonthlyBenefit");
		String DI_RC_GroupSuppliementDisabilityRider_CoverageB_WaitingPeriod = testdata.get(
				HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_GroupSuppliementDisabilityRider_CoverageB_WaitingPeriod");
		String DI_RC_RetireGuardRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_RetireGuardRider");
		String DI_RC_RetireGuardRider_MonthlyBenefit = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardRider_MonthlyBenefit");
		String DI_RC_RetireGuardRider_BenefitPeriod = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardRider_BenefitPeriod");
		String DI_RC_RetireGuardRider_WaitingPeriod = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardRider_WaitingPeriod");
		String DI_RC_RetireGuardRider_AmountOfContribution = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardRider_AmountOfContribution");
		String DI_RC_RetireGuardRider_Frequency = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_RetireGuardRider_Frequency");
		String DI_RC_RetireGuardRider_AmployerAmount = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardRider_AmployerAmount");
		String DI_RC_RetireGuardRider_EmployeeAmount = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardRider_EmployeeAmount");
		String DI_RC_RetireGuardFutureInsurabilityOptionFIO = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardFutureInsurabilityOptionFIO");
		String DI_RC_RetireGuardFutureInsurabilityOptionFIO_Amount = testdata.get(HooksTest.scenario.getName(),
				diFilename, disheetname, "DI_RC_RetireGuardFutureInsurabilityOptionFIO_Amount");
		String DI_RC_RetireGuardCostofLivingOptionCOLA = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_RetireGuardCostof LivingOption(COLA)");

		MMSDDIRC.RadioChoiceRiders(DI_RC_MaximumBenefitPeriod_Rider, DI_RC_SocialInsuranceRider,
				DI_RC_SocialInsuranceRider_MntlyBenfit, DI_RC_ExtendedPartialDiRider,
				DI_RC_AutomaticBenefitIncreaseRider, DI_RC_CatastrophicRider, DI_RC_CatastrophicRider_MonthlyBenefit,
				DI_RC_CatastrophicRider_BenefitPeriod, DI_RC_CatastrophicRider_WaitingPeriod, DI_Rc_CostOfLivingRider,
				DI_RC_OwnOccupationRider, DI_RC_FutureinsOptionRider_FIO, DI_RC_FutureinsOptionRider_FIO_Amount,
				DI_RC_BenefitIncreaseRider, DI_RC_ShortTermDisabilityBenefitRider_Option1,
				DI_RC_ShortTermDisabilityBenefitRider_Option1_MonthlyBenefitAmount,
				DI_RC_ShortTermDisabilityBenefitRider_Option1_WaitingPeriod_BenefitPeriod,
				DI_RC_ShortTermDisabilityBenefitRider_Option2,
				DI_RC_ShortTermDisabilityBenefitRider_Option2_MonthlyBenefitAmount,
				DI_RC_GroupSuppliementDisabilityRider, DI_RC_GroupSuppliementDisabilityRider_CoverageA,
				DI_RC_GroupSuppliementDisabilityRider_CoverageA_MonthlyBenefit,
				DI_RC_GroupSuppliementDisabilityRider_CoverageA_WaitingPeriod,
				DI_RC_GroupSuppliementDisabilityRider_CoverageB,
				DI_RC_GroupSuppliementDisabilityRider_CoverageB_MonthlyBenefit,
				DI_RC_GroupSuppliementDisabilityRider_CoverageB_WaitingPeriod, DI_RC_RetireGuardRider,
				DI_RC_RetireGuardRider_MonthlyBenefit, DI_RC_RetireGuardRider_BenefitPeriod,
				DI_RC_RetireGuardRider_WaitingPeriod, DI_RC_RetireGuardRider_AmountOfContribution,
				DI_RC_RetireGuardRider_Frequency, DI_RC_RetireGuardRider_AmployerAmount,
				DI_RC_RetireGuardRider_EmployeeAmount, DI_RC_RetireGuardFutureInsurabilityOptionFIO,
				DI_RC_RetireGuardFutureInsurabilityOptionFIO_Amount, DI_RC_RetireGuardCostofLivingOptionCOLA);

		String Additionalprod = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_AdditionalProduct");
		String Product1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		MMSDDIRC.OtherBenefitsRiders(Product1, Additionalprod);

	}

	@When("^user fills MMSD RetireGuard StandAlone details and click on Next$")
	public void user_fills_DI_RetireGuard_StandAlone_details_and_click_on_Next() throws Throwable {
		String RGSAProduct = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		String RGSAMB = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_MB");
		String RGSABP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_BP");
		String RGSAWP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_WP");
		String Employer = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_Employer");
		String Employee = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_Employee");
		MMSDRGSA.RGSAProduct(RGSAProduct, RGSAMB, RGSABP, RGSAWP, Employer, Employee);
		String DI_MaximumBenefitPeriod_Rider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_MaximumBenefitPeriod_Rider");
		String DI_CostOfLivingRider = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_Rc_CostOfLivingRider");
		String DI_FutureinsOptionRider_FIO = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_FutureinsOptionRider_FIO");
		String DI_FutureinsOptionRider_FIO_Amount = testdata.get(HooksTest.scenario.getName(), diFilename,
				disheetname, "DI_RC_FutureinsOptionRider_FIO_Amount");
		MMSDRGSA.RGSARiders(DI_MaximumBenefitPeriod_Rider, DI_CostOfLivingRider, DI_FutureinsOptionRider_FIO, DI_FutureinsOptionRider_FIO_Amount);
	}

	@When("^user fills MMSD DI BOE details and click on Next$")
	public void user_fills_DI_BOE_details_and_click_on_Next() throws Throwable {
		String Product = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		String MB = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Monthly Benefit");
		String BP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_BP");
		String WP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_WP");
		BOE.BOE(Product, MB, BP, WP);
		
		String AMB = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_AMB");
		String AMBAmount = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_AMBAmount");
		String AMBBP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_AMBBP");
		String AMBWP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_AMBWP");
		String ABIR = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_ABIR");
		String BOEFIO = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_FIO");
		String BOEFIOAmount = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_FIOAmount");
		String BOEIPR = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_IPR");
		String BOEIPRAmount = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_IPRAmount");
		String BOEPRD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_PartialDIsability");
		String BOEPRED = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_PartialReplacementExpense");
		String BOEPREamount = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_PartialReplacementExpenseAmount");
		String BOEPREBP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rider_PartialReplacementExpenseBP");
		BOE.BOERiders(AMB, AMBAmount, AMBBP, AMBWP, ABIR, BOEFIO, BOEFIOAmount, BOEIPR, BOEIPRAmount, BOEPRD, BOEPRED, BOEPREamount, BOEPREBP);
	}

	@When("^user fills MMSD DI TransitionSelect details and click on Next$")
	public void user_fills_MMSD_DI_TransitionSelect_details_and_click_on_Next() throws Throwable {
		String Product = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		String MB = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Monthly Benefit");
		String WP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_WP");
		DI_Transition.Transition(Product, MB, WP);
	}

	@When("^user fills MMSD DI BuySell details and click on Next$")
	public void user_fills_DI_BuySell_details_and_click_on_Next() throws Throwable {
		String Product = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		String LegalFname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BuySell_Fname");
		String LegalLname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BuySell_Lname");
		String LegalAdd = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BuySell_Add1");
		String City = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BuySell_City");
		String Zip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BuySell_Zip");
		String Relationship = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BuySell_Relationship");
		String Id = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BuySell_IdType");
		String IdValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BuySell_IdValue");
		BuysellProd.BuySellP(Product, LegalFname, LegalLname, LegalAdd, City, Zip, Relationship, Id, IdValue);

		String BusType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_Info");
		String Employee = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_No_Employess");
		String IndusType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_IndustryType");
		String Owner = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_OwnerName");
		String OwnerPercent = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_PercentOwnership");
		String OwnerYear = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_Year");
		String OwnerAge = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_Age");
		String ActiveBusiness = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_ActiveBusiness");
		String ActiveBusinessDetails = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_ActiveBusiness_Details");
		String NetValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_NetEarning");
		String BusinessYear = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_BussYear");
		String BankrupctyStatus = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_Bankruptcy");
		String BankruptcyDetails = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_ExplainBankruptcy");
		String BusinessAgreementStatus = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_BussAgreement");
		String BusinessAgreementDetails = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_ExplainBussAgreement");
		String BusinessValueStatus = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_BussValue");
		String BusinessValueDetails = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_ExplainBussValue");
		String TypeOfAgreementDD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_TypeofAgreement");
		String CurrentProjectionYear = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_CurrentFiscalProjectionYear");
		String CurrentAssets = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_CurrentFiscalAssets");
		String CurrentLiabilities = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_CurrentFiscalLiabilities");
		String CurrentLoss = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_CurrentFiscalLoss");
		String CurrentBookValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_CurrentFiscalBookValue");
		String RecentProjectionYear = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_RecentFiscalProjection");
		String RecentAssets = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_RecentFiscalAssets");
		String RecentLiabilities = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_RecentFiscalLiabilities");
		String RecentLoss = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_RecentFiscalLoss");
		String RecentBookValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BS_RecentFiscalBookValue");
		String Valuation = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BS_BusinessValuation");

		BuySellProdInfor.BSProductInfo(BusType, Product, Employee, IndusType, Owner, OwnerPercent, OwnerYear, OwnerAge,
				ActiveBusiness, ActiveBusinessDetails, NetValue, BusinessYear, BankrupctyStatus, BankruptcyDetails,
				BusinessAgreementStatus, BusinessAgreementDetails, BusinessValueStatus, BusinessValueDetails,
				TypeOfAgreementDD, CurrentProjectionYear, CurrentAssets, CurrentLiabilities, CurrentLoss,
				CurrentBookValue, RecentProjectionYear, RecentAssets, RecentLiabilities, RecentLoss, RecentBookValue,
				Valuation);

		String WPeriod = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BSC_WPeriod");
		String Funding = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BSC_Funding");
		String LumpSumValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BSC_LumpSumValue");
		String MonthlypaymentValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BSC_MonthlypaymentValue");
		String BSBenefitPeriodValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BSC_BSBenefitPeriodValue");
		String Billing = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BSC_Billing");
		String FrequencyValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BSC_FrequencyValue");
		String GroupSelection = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BSC_GroupSelection");
		String PayorValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BSC_PayorValue");
		BuySellProduInfoContinued.BSProductInfo_Continued(Product, WPeriod, Funding, LumpSumValue, MonthlypaymentValue,
				BSBenefitPeriodValue, Billing, FrequencyValue, GroupSelection, PayorValue);
	}

	@When("^user fills BOE Product Information details and click on Next$")
	public void user_fills_BOE_Product_Information_details_and_click_on_Next() throws Throwable {
		String Product = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Sub_product");
		String PolicyOwner = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_InsureOwner");
		String RecipientofBenefit = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BOE_RecipientOfBenefit");
		String RentValue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "BOE_Rent");
		String Percentage = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BOE_InsuredBusinessPercentage");
		String TitleDuty = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BOE_NonEmployer_Duties");
		String EmployeeCount = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BOE_NonEmployer_No Of Employees");
		String Salary = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BOE_NonEmployer_MonthlySalary");
		String WorkingHrs = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BOE_NonEmployer_Hours");
		BOEPI.BOE_ProductInformation(Product, PolicyOwner, RecipientofBenefit, RentValue, Percentage, TitleDuty,
				EmployeeCount, Salary, WorkingHrs);
	}

	@When("^user fills MMSD Additional Product details and click on Next$")
	public void user_fills_MMSD_Additional_Product_details_and_click_on_Next() throws IOException {
		String Additionalprod = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_AdditionalProduct");
		String RGSAMB = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_MB");
		String RGSABP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_BP");
		String RGSAWP = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_WP");
		String Employer = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_Employer");
		String Employee = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ADD_RGSA_Employee");

		MMSDDIAdd.AddProduct(Additionalprod, RGSAMB, RGSABP, RGSAWP, Employer, Employee);

	}

	@When("^user fills MMSD DI Employment Info and click on Next$")
	public void user_fills_MMSD_DI_Employment_Info_and_click_on_Next() throws IOException {
		String whatpercentOfPI = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_Emp_Pipercentage");
		String StatePi = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Emp_Pistates");
		String howlongPI = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Emp_HowLong");
		String previousOccup = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_Emp_previousOccup");
		String duration = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Emp_Duration");
		String Years = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Emp_Years");
		String Howmanyyrs = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Emp_HowmanyHrs");
		String Last90days = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Emp_Last90days");
		String FullorPartialdays = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_Emp_fullorpartialdays");
		String ProvideDatesforSick = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_Emp_providedatesforsick");

		MMSDDIEmpInfo.EmpInfo(whatpercentOfPI, StatePi, howlongPI, previousOccup, duration, Years, Howmanyyrs,
				Last90days, FullorPartialdays, ProvideDatesforSick);

	}

	@When("^user fills MMSD DI Payment Information details and click on Next$")
	public void user_fills_MMSD_DI_Payment_Information_details_and_click_on_Next() throws IOException {
		String Networth = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_Networth");
		MMSDDIPayInfo.DisabilityIncomePayinfo(Networth);

		String Relationship = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_Pay_Relationship");
		String PremiumPayor = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_Payor");
		String PercentageofOwnerShip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"BSC_PercentageofOwnerShip");
		MMSDDIPayInfo.EmploymentRelationship(Relationship, PremiumPayor, PercentageofOwnerShip);

		String Billing = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_BillingType");
		String Freq = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_Frequency");
		String InitialPay = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_PremiumSubmit");
		String PayMode = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_PaymentMode");
		String Amount = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_Amount");
		MMSDDIPayInfo.BillingInformation(Billing, Freq, InitialPay, PayMode, Amount);

		String REstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_Estate");
		String NWCash = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_Cash");
		String Stock = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_Stocks");
		String Assets = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_assets");
		String AssetDesc = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Networth_assetsDescribe");
		String AssetVal = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_Asset Value");
		String Mortgage = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_Mortgages");
		String Payble = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_Payable");
		String Liability = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Networth_liabilities");
		String LiablityDesc = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Networth_LiabilityDescribe");
		String LiabilityVal = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Networth_Liability Value");
		String Yes_No = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_Pay_Networth");
		MMSDDIPayInfo.Networth(Yes_No, REstate, NWCash, Stock, Assets, AssetDesc, AssetVal, Mortgage, Payble, Liability,
				LiablityDesc, LiabilityVal);

	}

	@When("^user fills MMSD DI Other Coverage details and click on Next$")
	public void user_fills_MMSD_DI_Other_Coverage_details_and_click_on_Next() throws IOException {
		String Inforce = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_OCI_Inforce");
		String AddContributory = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_OCI_AddContributory");
		String EligibileParticipate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_OCI_EligibileParticipate");
		String StateCashSick = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_OCI_StateCashSick");
		String SalaryIncome = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_OCI_SalaryIncome");
		String Reinstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_OCI_Reinstate");
		MMSDDIOC.OtherCovInformation(Inforce, AddContributory, EligibileParticipate, StateCashSick, SalaryIncome,
				Reinstate);

	}

	@When("^user fills MMSD Certification or Requirements details and click on Next$")
	public void user_fills_MMSD_Certification_or_Requirements_details_and_click_on_Next() {
		MMSDDIOC.CertificationRequirements();

	}

	@When("^user fills MMSD HIV consent details and click on Next$")
	public void user_fills_MMSD_HIV_consent_details_and_click_on_Next() throws IOException {

		String CI_State = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_State");
		String AZ_KY_personalphysician_RD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AZ_KY_personalphysician_RD");
		String CT_physician_or_health = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CT_HIV");
		String DC_Fl_physician_or_health = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DC_FL_HIV");
		String IA_Alternate_Myphysician_none = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"IA_HIV");
		String Ks_Ma_MePIandPhysician = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"KS_MA_HIV");
		String NY_physician_or_health = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "NY_HIV");
		String MI_YEsNo = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "MI_HIV_YEsNo");
		String MI_authorizeHiv = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "MI_Hiv");
		String Fname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "HIV_FirstName");
		String Lname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "HIV_LastName");
		String Addrs = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "HIV_Address");
		String Cty = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "HIV_City");
		String ST = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "HIV_State");
		String Zpcd = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "HIV_Zip");
		String HCprovidername = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"HIV_HealthCareProviderName");
		String Alternativesitename = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"HIV_AlternativeSite");
		String Dname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Hiv_Designeename");
		String MoPhysician_RD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Mo_HIV");
		String ExaminerName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "HIV_ExaminerName");
		String FacilityName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Hiv_FacilityName");
		Consent_HIV.personalPhysician_Yes_No(CI_State, AZ_KY_personalphysician_RD, CT_physician_or_health,
				DC_Fl_physician_or_health, IA_Alternate_Myphysician_none, Ks_Ma_MePIandPhysician,
				NY_physician_or_health, MoPhysician_RD, Fname, Lname, Addrs, Cty, ST, Zpcd, HCprovidername,
				Alternativesitename, MI_YEsNo, MI_authorizeHiv, Dname, ExaminerName, FacilityName);

		/*
		 * String CI_State = testdata.get(HooksTest.scenario.getName(),
		 * diFilename, disheetname, "CI_State"); String personalPhysician_Typ1 =
		 * testdata.get(HooksTest.scenario.getName(), diFilename,
		 * disheetname,"HIV_personalPhysician_Typ1"); String
		 * physician_or_health_Typ3 = testdata.get(HooksTest.scenario.getName(),
		 * diFilename, disheetname, "HIV_physician_or_health_Typ3"); String
		 * physician_or_health_Typ4 = testdata.get(HooksTest.scenario.getName(),
		 * diFilename, disheetname, "HIV_physician_or_health_Typ4"); String
		 * HealthCareProviderName = testdata.get(HooksTest.scenario.getName(),
		 * diFilename, disheetname, "HIV_HealthCareProviderName"); String
		 * FirstName = testdata.get(HooksTest.scenario.getName(), diFilename,
		 * disheetname, "HIV_FirstName"); String LastName =
		 * testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
		 * "HIV_LastName"); String Address =
		 * testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
		 * "HIV_Address"); String City =
		 * testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
		 * "HIV_City"); String State =
		 * testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
		 * "HIV_State"); String Zip = testdata.get(HooksTest.scenario.getName(),
		 * diFilename, disheetname, "HIV_Zip");
		 * 
		 * MMSDHIV.HivStates_Type1(CI_State, personalPhysician_Typ1, FirstName,
		 * LastName, Address, City, State, Zip);
		 * MMSDHIV.HivStates_Type2(CI_State, personalPhysician_Typ1, FirstName,
		 * LastName, Address, City, State, Zip);
		 * 
		 * MMSDHIV.HivStates_Type3(CI_State, physician_or_health_Typ3,
		 * FirstName, LastName, Address, City, State, Zip,
		 * HealthCareProviderName); MMSDHIV.HivStates_Type4(CI_State,
		 * physician_or_health_Typ4, FirstName, LastName, Address, City, State,
		 * Zip, HealthCareProviderName);
		 */

	}

	@When("^user fills MMSD DI Producer Certificate details and click on Next$")
	public void user_fills_MMSD_DI_Producer_Certificate_details_and_click_on_Next() throws IOException {
		String Disc = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ProdCert_Discount");
		String LTC = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "DI_ProdCert_LTC");
		String LTCDetails = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_ProdCert_LTCDetails");
		String ConsumerInfo = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_ProdCert_ConsumerInfoNotice");
		String Termination = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_ProdCert_Termination");
		String TDetails = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_ProdCert_TerminationDetails");
		MMSDDIProdCert.DI_ProducerCert(Disc, LTC, LTCDetails, ConsumerInfo, Termination, TDetails);

	}

	@When("^user fills MMSD DI Producer Compensation details and click on Next$")
	public void user_fills_MMSD_DI_Producer_Compensation_details_and_click_on_Next() throws IOException {
		String ProducerRole = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_ProducerRole");
		String ProducerEmail = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_Email");
		String LicenceID = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LifeProducerCompensation_FloridLIC");
		String Firstyearcommission = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_1stYearCommission");
		String RenewalCommision = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_RenewalCommission");
		String AdditionalProducer = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Arethereadditionalproducers?");
		String ContactOneFirstName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact1FirstName");
		String ContactOneLastName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact1LastName");
		String ContactOnePhone = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact1Phone");
		String ContactOneHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact1HomeWorkMobile");
		String ContactOneExtension = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact1WorkExtension");
		String ContactOneEmail = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact1Email");
		String ContactTwoFirstName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact2FirstName");
		String ContactTwoLastName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact2LastName");
		String ContactTwoPhone = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact2Phone");
		String ContactTwoHomeWorkMobile = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact2HomeWorkMobile");
		String ContactTwoExtension = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact2WorkExtension");
		String ContactTwoEmail = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Contact2Email");
		String NumberOfProducer = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Number_OF_producer");

		String LPC_Add_ProducerRole = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_Add_ProducerRole");
		String producerID1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_ProducerID1");
		String Agency1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_AgencyId1");
		String firm1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "firm1");
		String producerID2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_ProducerID2");
		String Agency2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_AgencyId2");
		String firm2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "firm2");
		String producerID3 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_ProducerID3");
		String Agency3 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "LPC_AgencyId3");
		String firm3 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "firm3");
		String Firstyearcomm1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_%_1st_Year_Commission1");
		String RenwalComm1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_%_Renewal_Commission1");
		String Firstyearcomm2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_%_1st_Year_Commission2");
		String RenwalComm2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_%_Renewal_Commission2");
		String Firstyearcomm3 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_%_1st_Year_Commission3");
		String RenwalComm3 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LPC_%_Renewal_Commission3");
		String Agency = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Agency");

		MMSDDIProdComp.enterProducerCompensation(ProducerRole, ProducerEmail, LicenceID, Firstyearcommission,
				RenewalCommision, AdditionalProducer);
		MMSDDIProdComp.AdditionalProducer(AdditionalProducer, NumberOfProducer, LPC_Add_ProducerRole, producerID1,
				Agency1, firm1, producerID2, Agency2, firm2, producerID3, Agency3, firm3, Firstyearcomm1, RenwalComm1,
				Firstyearcomm2, RenwalComm2, Firstyearcomm3, RenwalComm3);
		MMSDDIProdComp.ContactDetails(Agency, ContactOneFirstName, ContactOneLastName, ContactOnePhone,
				ContactOneHomeWorkMobile, ContactOneExtension, ContactOneEmail, ContactTwoFirstName, ContactTwoLastName,
				ContactTwoPhone, ContactTwoHomeWorkMobile, ContactTwoExtension, ContactTwoEmail);

	}

	@When("^user fills MMSD Outline of Coverage details and click on Next$")
	public void user_fills_MMSD_Outline_of_Coverage_details_and_click_on_Next() throws IOException {
		String state = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_State");
		String AddProduct = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DI_RC_AdditionalProduct");
		MMSDDIOOC.OOC(state);
		MMSDDIOOC.OOC2(state, AddProduct);

	}

	@When("^user fills MMSD Additional Forms details and click on Next$")
	public void user_fills_MMSD_Additional_Forms_details_and_click_on_Next() throws IOException {
		String preferedLanguage = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PI_PrefferedLang");
		String languages = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AdditionalForms_Foreign_Language_Language");
		String Others = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AdditionalForms_Foreign_Language_Language_Other");
		String Translator = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AdditionalForms_Foreign_Language_Language_Translator_is_a_or_an");
		String AgentFirstname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_GeneralAgent_FirstName");
		String Agent_Midlename = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_GeneralAgent_MI");
		String AgentLastname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_GeneralAgent_LastName");
		String Agent_suffix = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_GeneralAgent_Sufix");
		String ProfessionalFirstName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_FirstName");
		String ProfessionalMidleName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_MI");
		String ProfessionalSuffix = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_Sufix");
		String ProfessionalLastName = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_LastName");
		String ProfessionalTranslationFirm = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_TranslationFirm");
		String ProfessionalStreet_1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_ProfessionalStreet_1");
		String ProfessionalStreet_2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_ProfessionalStreet_2");
		String Professional_City = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_City");
		String Professional_State = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_State");
		String Professional_Zip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"AF_Professional_Zip");
		Addforms.enterAdditionalFormsDetail(preferedLanguage, languages, Others, Translator, AgentFirstname,
				Agent_Midlename, AgentLastname, Agent_suffix, ProfessionalFirstName, ProfessionalMidleName,
				ProfessionalLastName, ProfessionalSuffix, ProfessionalTranslationFirm, ProfessionalStreet_1,
				ProfessionalStreet_2, Professional_City, Professional_State, Professional_Zip);

	}

	@When("^user fills MMSD Attachments details and click on Next$")
	public void user_fills_MMSD_Attachments_details_and_click_on_Next()
			throws IOException, AWTException, InterruptedException {
		QualifiedPlan QP = new QualifiedPlan();

		String Policytype = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Policytype");
		String PlantrustType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PlantrustType");
		String pleasespecify = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "pleasespecify");
		String Howlongplanbeen = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Howlongplanbeen");
		String Planname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Planname");
		String trustee = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "trustee");
		String street1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifed_street1");
		String street2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifed_street2");
		String city = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifed_city");
		String qualifedstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifedstate");
		String zip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifiedzip");
		String MM = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifed_MM");
		String DD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifed_DD");
		String YYYY = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "qualifed_YYYY");

		String Qualified_PlanTrustSponsorEIN = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Qualified_PlanTrustSponsorEIN");
		String Qualified_TotalnoEmployee = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Qualified_TotalnoEmployee");
		String Qualified_NoofEmployecoverdPlan = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Qualified_NoofEmployecoverdPlan");
		String Qualified_ExplainBasisofEmployee = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Qualified_ExplainBasisofEmployee");

		String PlanTrustSponsorEInumber = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Qualified_PlanTrustSponsorEInumber");
		QP.PolicyTrust_Plantrust(Policytype, PlantrustType, pleasespecify, Howlongplanbeen, Planname, trustee, street1,
				street2, city, qualifedstate, zip, MM, DD, YYYY, PlanTrustSponsorEInumber,
				Qualified_PlanTrustSponsorEIN, Qualified_TotalnoEmployee, Qualified_NoofEmployecoverdPlan,
				Qualified_ExplainBasisofEmployee);

		String fullnameEmploye = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "fullnameEmploye");
		String plansponsor_street1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"plansponsor_street1");
		String plansponsor_street2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"plansponsor_street2");
		String plansponsor_city = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"plansponsor_city");
		String plansponsor_state = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"plansponsor_state");
		String plansponsor_zip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "plansponsor_zip");

		String Employer_sponsor_EINNumber = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Employer_sponsor_EINNumber");
		String PlanSponsore_Authorized_fullname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PlanSponsore_Authorized_fullname");
		String PlanSponsor_Authorized_lastname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PlanSponsor_Authorized_lastname");

		QP.EmployerPlanSponsor(fullnameEmploye, plansponsor_street1, plansponsor_street2, plansponsor_city,
				plansponsor_state, plansponsor_zip, Employer_sponsor_EINNumber, PlanSponsore_Authorized_fullname,
				PlanSponsor_Authorized_lastname);

		String ThirdParty_fullname = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"ThirdParty_fullname");
		String ThirdParty_street1 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"ThirdParty_street1");
		String ThirdParty_street2 = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"ThirdParty_street2");
		String ThirdParty_city = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "ThirdParty_city");
		String ThirdParty_state = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"ThirdParty_state");
		String ThirdParty_zip = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "ThirdParty_zip");
		String Thirdparty_preferredphone = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Thirdparty_preferredphone");
		String Thirdparty_phonetype = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Thirdparty_phonetype");
		String Thirdparty_email = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Thirdparty_email");
		QP.ThirdPartyAdministrationinfo(ThirdParty_fullname, ThirdParty_street1, ThirdParty_street2, ThirdParty_city,
				ThirdParty_state, ThirdParty_zip, Thirdparty_preferredphone, Thirdparty_phonetype, Thirdparty_email);

		String Whatlimitofamount = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"PurposeOFLifeINS");
		String ApproxValueAssets = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"ApproximateValue");
		String annualpremium = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "AnnualPremium");
		String EmployerContribution = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"EmployerContribution");
		String FundingMethod = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"DefinedBenefitPlans");
		String LimitOFDeathBenefit = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"LimitsOFDeathBenefit");
		String Totalamountaggreemnt = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"TotalAmountAgrrement");
		String yearone = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "YearONe");
		String yeartwo = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "YearTwo");
		String SelectAllType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "SelectAllType");
		String ParticipantLive = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "ParticipantLive");
		String Pleasexpalin = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Participant_PleaseExpalain");
		String FundedpleaseSpecify = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"FundedpleaseSpecify");

		String Self_DDC_IsReducedPremium = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Self_DDC_IsReducedPremium");
		String Self_DDC_approxvalue = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"Self_DDC_approxvalue");
		QP.Self_DDCPlanInfo(Whatlimitofamount, ApproxValueAssets, annualpremium, EmployerContribution, FundingMethod,
				LimitOFDeathBenefit, Totalamountaggreemnt, yearone, yeartwo, SelectAllType, ParticipantLive,
				Pleasexpalin, FundedpleaseSpecify, Self_DDC_IsReducedPremium, Self_DDC_approxvalue);

		String state = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_State");
		String ProductType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_ProductType");
		attach.attachDocuments(state,ProductType);
	/*	String state = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_State");
		attach.attachDocuments(state);*/

	}

	@Then("^Lock the MMSD policy and do wet sign and check if policy submitted$")
	public void lock_the_MMSD_policy_and_do_wet_sign_and_check_if_policy_submitted() throws IOException {

		String ProductType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "CI_ProductType");
		int policyrow = Row + 2;
		lock.LockScreen(policyrow, ProductType);

		String SignType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "SignatureMethod");
		String InsIDproof = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Esign_InsuredIdType");
		String InsIdNum = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "Esign_InsuredIdNumber");

		String OwnerInsIDproof = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "OwnerInsIDproof");
		String OwnerInsIdNum = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "OwnerInsIdNum");
		String proposedInsuredCity = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"proposedInsuredCity");
		String proposedinsuredstate = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname,
				"proposedinsuredstate");

		String WetsignType = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "WetsignType");
		String InsMM = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "InsMM");
		String InsDD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "InsDD");
		String InsYYYY = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "InsYYYY");

		String PrdMM = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PrdMM");
		String PrdDD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PrdDD");
		String PrdYYYY = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PrdYYYY");
		String OwnerMM = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "OwnerMM");

		String PlanSponsorMM = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PlanSponsorMM	");
		String PlanSponsorDD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PlanSponsorDD");
		String PlanSponsorYYYY = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "PlanSponsorYYYY");

		String OwnerDD = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "OwnerDD");
		String OwnerYYYY = testdata.get(HooksTest.scenario.getName(), diFilename, disheetname, "OwnerYYYY");

		lock.signature(SignType, InsIDproof, InsIdNum, policyrow, ProductType, OwnerInsIDproof, OwnerInsIdNum,
				WetsignType, InsMM, InsDD, InsYYYY, PrdMM, PrdDD, PrdYYYY, OwnerMM, OwnerDD, OwnerYYYY,
				proposedInsuredCity, proposedinsuredstate, PlanSponsorMM, PlanSponsorDD, PlanSponsorYYYY);

	}
}
