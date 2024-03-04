package pageclass.SWl;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;
import stepdefinitions.HooksTest;
import utilities.GetDataFromExcel;

public class SurvivorshipLifeCaseSetup extends GlobalCap {
	
	By Suffix_DD = By.xpath("//select[@id='lb_217' or @name='lb_217']");
	By InsurabilityOptionExercise_Yes = By.xpath("//input[@alt_id='PIConversionYesNo_1']");
	By InsurabilityOptionExercise_No = By.xpath("//input[@alt_id='PIConversionYesNo_2']");
	By PolicyRequireUndertaking_Yes= By.xpath("//label[contains(text(),'policy require underwriting')]//following::input[@alt_id='CONV_Eligibility_1']");
	By PolicyRequireUndertaking_No= By.xpath("//label[contains(text(),'policy require underwriting')]//following::input[@alt_id='CONV_Eligibility_2']");
	//insured2 details
	By InsuredFirstname = By.xpath("//label[contains(text(),'First Name')]//following::input[@alt_id='OI1_FirstName']");
	By InsuredMiddletname = By.xpath("//label[contains(text(),'M.I')]//following::input[@alt_id='OI1_MiddleName']");
	By InsuredLasttname = By.xpath("//label[contains(text(),'Last Name')]//following::input[@alt_id='OI1_LastName']");
	By InsuredSuffix = By.xpath("//select[@alt_id='OI1_Suffix']");
	By InsuredDOBMM = By.xpath("//*[@id='div_235']//div/span/span[1]/input[1]");
	By InsuredDOBDD = By.xpath("//*[@id='div_235']//div/span/span[1]/input[2]");
	By InsuredDOBYYY = By.xpath("//*[@id='div_235']//div/span/span[1]/input[3]");
	By InsuredInsurabilityOptionExercise_Yes = By.xpath("//input[@alt_id='OI1_ConversionYesNo_1']");
	By InsuredInsurabilityOptionExercise_No = By.xpath("//input[@alt_id='OI1_ConversionYesNo_2']");
	
	By Insuredunderwriting_yes = By.xpath("//label[contains(text(),'policy require underwriting')]//following::input[@alt_id='OI1_CONV_Eligibility_1']");
	By Insuredunderwriting_No = By.xpath("//label[contains(text(),'policy require underwriting')]//following::input[@alt_id='OI1_CONV_Eligibility_2']");
	
	By InsuredResidentState = By.xpath("//label[contains(text(),'Resident State')]//following::select[@alt_id='PIADDR_State']");
	By FaceAmount = By.xpath("//label[contains(text(),'Face Amount')]//following::input[@alt_id='FaceAmount']");
	By FranchiseNumber = By.xpath("//label[contains(text(),'Franchise Number')]//following::input[@alt_id='PAY_InvoiceNumber']");	
	By MMLISRegisteredRep_Yes = By.xpath("//label[text()= 'Is the writing producer a Career Agent / Alternate Agent or MMLIS Registered Rep?']//following::input[1]");
	By MMLISRegisteredRep_No = By.xpath("//label[text()= 'Is the writing producer a Career Agent / Alternate Agent or MMLIS Registered Rep?']//following::input[2]");
	By QualifiedPlan_Yes = By.xpath("//label[contains(text(),'qualified plan')]//following::input[1]");
	By QualifiedPlan_No= By.xpath("//label[contains(text(),'qualified plan')]//following::input[2]");
	By financialservicesrepresentative_Yes = By.xpath("//label[contains(text(),'financial services representative')]//following::input[@alt_id='PIWithdrawFromRetirement_1']");
	By financialservicesrepresentative_No = By.xpath("//label[contains(text(),'financial services representative')]//following::input[@alt_id='PIWithdrawFromRetirement_2']");	
	By AccountPurchaseThisPolicy_Yes = By.xpath("//label[contains(text(),'account to purchase this policy')]//following::input[@alt_id='PITenPercentTax_1']");
	By AccountPurchaseThisPolicy_No = By.xpath("//label[contains(text(),'account to purchase this policy')]//following::input[@alt_id='PITenPercentTax_2']");
	By hardshipwithdrawal_Yes = By.xpath("//label[contains(text(),'hardship withdrawal')]//following::input[@alt_id='PIHardshipWithdrawal_1']");
	By hardshipwithdrawal_No = By.xpath("//label[contains(text(),'hardship withdrawal')]//following::input[@alt_id='PIHardshipWithdrawal_2']");	
	By Retirement_paythepremiums_Yes = By.xpath("//label[contains(text(),'retirement account to pay the premiums')]//following::input[@alt_id='PIRetirementSurcharge_1']");
	By Retirement_paythepremiums_No = By.xpath("//label[contains(text(),'retirement account to pay the premiums')]//following::input[@alt_id='PIRetirementSurcharge_2']");
	By Whatistheprimarypurpose = By.xpath("//u[contains(text(),'primary purpose')]//following::select[@alt_id='PIPrimaryPurpose']");
	By SurrenderChargeAmount = By.xpath("//input[@alt_id='PISurrenderCharge']");
	
	By oneowneronthispolicy_Yes = By.xpath("//label[contains(text(),'owner on this policy')]//following::input[@alt_id='CSSWL_MutlipleOwnersYesNo_1']");
	By oneowneronthispolicy_No = By.xpath("//label[contains(text(),'owner on this policy')]//following::input[@alt_id='CSSWL_MutlipleOwnersYesNo_2']");
	
	By Bothinsuredstheowners_Yes = By.xpath("//label[contains(text(),'both insureds the owners')]//following::input[@alt_id='CSSWL_BothInsuredAreOwnersYesNo_1']");
	By Bothinsuredstheowners_No = By.xpath("//label[contains(text(),'both insureds the owners')]//following::input[@alt_id='CSSWL_BothInsuredAreOwnersYesNo_2']");
	
	By insuredoneoftheowners_Yes= By.xpath("//label[contains(text(),'insured one of the owners')]//following::input[@alt_id='CSSWL_IsPIAnOwnerYesNo_1']");
	By insuredoneoftheowners_No= By.xpath("//label[contains(text(),'insured one of the owners')]//following::input[@alt_id='CSSWL_IsPIAnOwnerYesNo_2']");
	
	By ResidentStateOfIndivOwner= By.xpath("//select[@alt_id='CS_OwnerResidentState']");
	
	
	
	By proposed_insured_the_owner_Yes = By.xpath("//label[contains(text(),'primary insured the owner')]//following::input[@alt_id='CSSWL_IsPIOnlyOwnerYesNo_1']");
	By proposed_insured_the_owner_No = By.xpath("//label[contains(text(),'primary insured the owner')]//following::input[@alt_id='CSSWL_IsPIOnlyOwnerYesNo_2']");
	
	By owner_an_individualOwner = By.xpath("//span[contains(text(),'Individual Owner')]");
	By owner_an_Entity = By.xpath("//span[contains(text(),'Entity')]");
	
	By individualOwnerandEntityownerstate = By.xpath("//select[@alt_id='CS_OwnerResidentState']");
	
	
	By HoldIssue_Yes = By.xpath("//label[text()='Hold Issue']//following::input[1]");
	By HoldIssue_No = By.xpath("//label[text()='Hold Issue']//following::input[2]");
	
	By BackdateSaveAge_Yes = By.xpath("//label[contains(text(),'Backdate to save')]//following::input[1]");
	By BackdateSaveAge_No = By.xpath("//label[contains(text(),'Backdate to save')]//following::input[2]");
	By PolicyDating_DateOfIssue = By.xpath("//span[contains(text(),'Date of Issue')]//preceding::input[@alt_id='POL_PolicyDating_1']");
	By PolicyDating_SpecificDate = By.xpath("//span[contains(text(),'Specific Date')]//preceding::input[@alt_id='POL_PolicyDating_2']");
	By SpecificDate_Month = By.xpath("//*[@id='div_288']/div/span/span[1]/input[1]");
	By SpecificDate_Day = By.xpath("//*[@id='div_288']/div/span/span[1]/input[2]");
	By SpecificDate_Year = By.xpath("//*[@id='div_288']/div/span/span[1]/input[3]");
	By submittingAgency = By.xpath("//label[contains(text(),'Submitting Agency')]//following::input[@alt_id='AGENT_AgencyID']");
	By ownerstate = By.xpath("//label[contains(text(),'Owner will Sign')]//following::select[@alt_id='CS_SignState']");
	By cityowner = By.xpath("//label[contains(text(),'Owner will Sign')]//following::input[@alt_id='CS_SignCity']");
	
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
	By Lists= By.xpath("//select[@alt_id='AGENT_SDPFirm']");
	By Agent=By.xpath("//label[text()='Submitting Agency']");
	By AgentFirm=By.xpath("//select[@alt_id='AGENT_SDPFirm']");
	By Restricted=By.xpath("//strong[contains(text(),'Restricted File')]");
	GetDataFromExcel testdata = new GetDataFromExcel();
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	public void InsuredOneAndInsuredTwo(String Suffix,String insurabilityOptionExercise,  String requireUnderwriting,String ins2Firstname,String Insured2Middletname
			,String Insured2Lasttname,String Insured2Suffix,String Insured2DOBMM,String Insured2DOBDD,String Insured2DOBYYY,String Insured2InsurabilityOptionExercise
			,String Insured2requireUnderwriting,String Insured1ResidentState,String Faceamount,String Franchisenumber ) {

		HooksTest.idriver.switchTo().frame(0);
		if($(Suffix_DD).isDisplayed()){
			$(Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionByValue(Suffix);
		}
	
		selectRadioYesorNo(InsurabilityOptionExercise_Yes, InsurabilityOptionExercise_No, insurabilityOptionExercise);
		if(insurabilityOptionExercise.equalsIgnoreCase("Yes")){
			selectRadioYesorNo(QualifiedPlan_Yes, QualifiedPlan_No, requireUnderwriting);
		}
		$(InsuredFirstname).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ins2Firstname);
		$(InsuredMiddletname).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Insured2Middletname);
		$(InsuredLasttname).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Insured2Lasttname);
		$(InsuredSuffix).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionByValue(Insured2Suffix);
		
		$(InsuredDOBMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Insured2DOBMM);
		$(InsuredDOBDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Insured2DOBDD);
		$(InsuredDOBYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Insured2DOBYYY);
		selectRadioYesorNo(InsuredInsurabilityOptionExercise_Yes, InsuredInsurabilityOptionExercise_No, Insured2InsurabilityOptionExercise);
		if(Insured2InsurabilityOptionExercise.equalsIgnoreCase("Yes")){
			selectRadioYesorNo(Insuredunderwriting_yes, Insuredunderwriting_No, Insured2requireUnderwriting);	
		}
		$(InsuredResidentState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Insured1ResidentState);
		$(FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Faceamount);
		$(FranchiseNumber).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Franchisenumber);
		
	}
	public void RadioQuestionsone(String MMLCRegesterd,String QualPlan, String financialservicesrepresentative,String purchasethispolicy,
			String hardshipwithdrawal,String Retirement_paythepremiums, String whatisthePrimarypurpose, String surrenderchargeamount ){
		
			selectRadioYesorNo(MMLISRegisteredRep_Yes, MMLISRegisteredRep_No, MMLCRegesterd);
			selectRadioYesorNo(QualifiedPlan_Yes, QualifiedPlan_No, QualPlan);
			
			if(MMLCRegesterd.equalsIgnoreCase("Yes") && QualPlan.equalsIgnoreCase("No")){
				selectRadioYesorNo(financialservicesrepresentative_Yes, financialservicesrepresentative_No, financialservicesrepresentative);
				if(financialservicesrepresentative.equalsIgnoreCase("Yes")){
					selectRadioYesorNo(AccountPurchaseThisPolicy_Yes, AccountPurchaseThisPolicy_No, purchasethispolicy);
					selectRadioYesorNo(hardshipwithdrawal_Yes, hardshipwithdrawal_No, hardshipwithdrawal);
					if(purchasethispolicy.equalsIgnoreCase("No") && hardshipwithdrawal.equalsIgnoreCase("No")){
						selectRadioYesorNo(Retirement_paythepremiums_Yes, Retirement_paythepremiums_No, Retirement_paythepremiums);
						$(Whatistheprimarypurpose).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(whatisthePrimarypurpose);
						if(Retirement_paythepremiums.equalsIgnoreCase("Yes")){
							$(SurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(surrenderchargeamount);
						}
					}
				}
			}
			
			
			
	}

	public void RadioQuestionsctwo(String morethanoneowner, String Bothinsuredstheowners, String insuredoneoftheowners,
			String ResidentStateofIndivOwner,String proposed_insured_the_owner, String indivualorEntity, String IndividualOwnerandEntityownerstate, String HoldIssue, String Backdatesaveage,
			String Policydate, String MM, String DD, String YYYY, String Agency,String Agentfirm, String Stateowner, String Cityowner) {
		selectRadioYesorNo(oneowneronthispolicy_Yes, oneowneronthispolicy_No, morethanoneowner);

		if (morethanoneowner.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(Bothinsuredstheowners_Yes, Bothinsuredstheowners_No, Bothinsuredstheowners);
			if (Bothinsuredstheowners.equalsIgnoreCase("No")) {
				selectRadioYesorNo(insuredoneoftheowners_Yes, insuredoneoftheowners_No, insuredoneoftheowners);
				if (insuredoneoftheowners.equalsIgnoreCase("No")) {
					$(ResidentStateOfIndivOwner).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionContainingText(ResidentStateofIndivOwner);
				}
			}
		}
		
		else {

			selectRadioYesorNo(proposed_insured_the_owner_Yes, proposed_insured_the_owner_No,
					proposed_insured_the_owner);
			if (proposed_insured_the_owner.equalsIgnoreCase("No")) {
				if (indivualorEntity.equalsIgnoreCase("IndividualOwner")) {
					$(owner_an_individualOwner).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					$(individualOwnerandEntityownerstate).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionContainingText(IndividualOwnerandEntityownerstate);
				} else if (indivualorEntity.equalsIgnoreCase("Entity")) {
					$(owner_an_Entity).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					$(individualOwnerandEntityownerstate).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionContainingText(IndividualOwnerandEntityownerstate);
				}
			}

		}
		
		
		selectRadioYesorNo(HoldIssue_Yes, HoldIssue_No, HoldIssue);
		selectRadioYesorNo(BackdateSaveAge_Yes, BackdateSaveAge_No, Backdatesaveage);
		
			if (Backdatesaveage.equalsIgnoreCase("No")) {
				// Yes = DateOfIssue , No=specficdate
				selectRadioYesorNo(PolicyDating_DateOfIssue, PolicyDating_SpecificDate, Policydate);
				if (Policydate.equalsIgnoreCase("No")) {
					$(SpecificDate_Month).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MM);
					$(SpecificDate_Day).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MM);
					$(SpecificDate_Year).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(YYYY);
				}
			}
			$(submittingAgency).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Agency);
		
			GlobalCap.sleep(1000);
			$(Agent).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			GlobalCap.sleep(4000);
			if($(AgentFirm).isDisplayed()){
				GlobalCap.sleep(8000);
				$(AgentFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(Agentfirm);
				GlobalCap.sleep(7500);
			}
			
			$(ownerstate).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Stateowner);
			$(cityowner).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cityowner);
			$(Restricted).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			GlobalCap.sleep(13000);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		
		}
		
		
				
	}


