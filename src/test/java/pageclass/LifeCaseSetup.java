package pageclass;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;
import utilities.GetDataFromExcel;

public class LifeCaseSetup extends GlobalCap {
	public LifeCaseSetup(){
		System.out.println("😀 😀 😀 😀 😀 OrderEntrying in LifeCaseSetup 😀 😀 😀 😀 😀");
	}

	By InsuredResState = By.xpath("//select[@id='lb_162' or @name='lb_162']");
	By InsuredCitizenship= By.xpath("//select[@id='lb_322' or @name='lb_322']");
	By FaceAmount = By.xpath("//input[@id='flda_18' or @name='flda_18']");
	By GroupBill = By.xpath("//input[@id='flda_197' or @name=id='flda_197']");
	By PlatniumPass_Yes=By.xpath("//input[@id='rdo_241_1' or @name=id='rdo_241_1']");
	By PlatniumPass_No=By.xpath("//input[@id='rdo_241_2' or @name=id='rdo_241_2']");
	By LifeconvInsurabilityOpt_Yes = By.xpath("//input[@id='rdo_216_1' or @name=id='rdo_216_1']");
	By LifeconvInsurabilityOpt_No = By.xpath("//input[@id='rdo_216_2' or @name=id='rdo_216_2']");
	By PolicyUnderwriting_Yes = By.xpath("//input[@id='rdo_247_1' or @name='rdo_247_1']");
	By PolicyUnderwriting_No = By.xpath("//input[@id='rdo_247_2' or @name='rdo_247_2']");
	By MMLISRegisteredRep_Yes= By.xpath("//input[@id='rdo_221_1' or @name='rdo_221_1']"); 
	By MMLISRegisteredRep_No= By.xpath("//input[@id='rdo_221_2' or @name='rdo_221_2']");
	
	By ApexMMLISRegisteredRep_Yes= By.xpath("//input[@id='rdo_356_1']"); 
	By ApexMMLISRegisteredRep_No= By.xpath("//input[@id='rdo_356_2']");
	By ApexResultBridge_DD=By.xpath("//select[@id='lb_354']");
	
	By QualifiedPlan_Yes=By.xpath("//input[@id='rdo_223_1' or @name='rdo_223_1']");
	By QualifiedPlan_No=By.xpath("//input[@id='rdo_223_2' or @name='rdo_223_2']");
	By financialservicesrepresentative_Yes=By.xpath("//input[@id='rdo_224_1' or @name='rdo_224_1']");
	By financialservicesrepresentative_No=By.xpath("//input[@id='rdo_224_2' or @name='rdo_224_2']");
	
	By IsPolicyJointlyOwned_Yes=By.xpath("//input[@id='rdo_344_1']");
	By IsPolicyJointlyOwned_No=By.xpath("//input[@id='rdo_344_2']");
	
	
	
	By AccountPurchaseThisPolicy_Yes =By.xpath("//input[@id='rdo_226_1' or @name='rdo_226_1']");
	By AccountPurchaseThisPolicy_No =By.xpath("//input[@id='rdo_226_2' or @name='rdo_226_2']");
	
	By hardshipwithdrawal_Yes =By.xpath("//input[@id='rdo_237_1' or @name='rdo_237_1']");
	By hardshipwithdrawal_No =By.xpath("//input[@id='rdo_237_2' or @name='rdo_237_2']");
	
	By Retirement_paythepremiums_Yes =By.xpath("//input[@id='rdo_234_1' or @name='rdo_234_1']");
	By Retirement_paythepremiums_No =By.xpath("//input[@id='rdo_234_2' or @name='rdo_234_2']");
	
	By Whatistheprimarypurpose =By.xpath("//select[@id='lb_229' or @name='lb_229']");
	By SurrenderChargeAmount =By.xpath("//input[@id='flda_232' or @name='flda_232']");
	
	By DIPolicyonthesameapplication_Yes =By.xpath("//input[@id='rdo_191_1' or @name='rdo_191_1']");
	By DIPolicyonthesameapplication_No =By.xpath("//input[@id='rdo_191_2' or @name='rdo_191_2']");
	
	By OwnerAllpolicies_Yes =By.xpath("//input[@id='rdo_20_1' or @name='rdo_20_1']");
	By OwnerAllpolicies_No =By.xpath("//input[@id='rdo_20_2' or @name='rdo_20_2']");
	
	By OwnerResidentState =By.xpath("//select[@alt_id='CS_OwnerResidentState']");
	By IndiviualOwner =By.xpath("//input[@alt_id='PIOwnerType1_1']");
	By EntityOwner =By.xpath("//input[@alt_id='PIOwnerType1_2']");
	
	By EntityaTrust_Yes =By.xpath("//input[@alt_id='CS_EntityATrust_1']");
	By EntityaTrust_No =By.xpath("//input[@alt_id='CS_EntityATrust_2']");
			
	By existingDIpolicy_Yes =By.xpath("//input[@id='rdo_208_1' or @name='rdo_208_1']");
	By existingDIpolicy_No =By.xpath("//input[@id='rdo_208_2' or @name='rdo_208_2']");
	
	By HoldIssue_Yes =By.xpath("//input[@id='rdo_188_1' or @name='rdo_188_1']");
	By HoldIssue_No =By.xpath("//input[@id='rdo_188_2' or @name='rdo_188_2']");
	
	By BackdateSaveAge_Yes =By.xpath("//input[@id='rdo_10_1' or @name='rdo_10_1']");
	By BackdateSaveAge_No =By.xpath("//input[@id='rdo_10_2' or @name='rdo_10_2']"); 
	
	By PolicyDating_DateOfIssue = By.xpath("//*[@id='rdo_8_1']");
	By PolicyDating_SpecificDate = By.xpath("//*[@id='rdo_8_2']");
	
	By SpecificDate_Month = By.xpath("//*[@id='div_6']/div/span/span[1]/input[1]");
	By SpecificDate_Day = By.xpath("//*[@id='div_6']/div/span/span[1]/input[2]");
	By SpecificDate_Year = By.xpath("//*[@id='div_6']/div/span/span[1]/input[3]");
	
	By OwnerMM = By.xpath("//div[@id='div_364']/div/span/span[1]/input[1]");
	By OwnerDD = By.xpath("//div[@id='div_364']/div/span/span[1]/input[2]");
	By OwnerYYYY = By.xpath("//div[@id='div_364']/div/span/span[1]/input[3]");
	
	
	By submittingAgency =By.xpath("//input[@id='flda_182' or @name='flda_182']");
	By ownerstate =By.xpath("//select[@id='lb_157' or @name='lb_157']"); 
	By ownerCountry =By.xpath("//select[@alt_id='CS_SignCounty']");
	By cityowner =By.xpath("//input[@id='flda_160' or @name='flda_160']");
	By QuickClose_Yes = By.xpath("//input[@id='rdo_151_1' or @name='rdo_151_1']");
	By QuickClose_No = By.xpath("//input[@id='rdo_151_2' or @name='rdo_151_2']");
	By SalesPerson_Yes = By.xpath("//input[@id='rdo_329_1' or @name='rdo_329_1']");
	By SalesPerson_No = By.xpath("//input[@id='rdo_329_2' or @name='rdo_329_2']");
	By SalesFirstName = By.xpath("//input[@id='flda_332' or @name='flda_332']");
	By SalesLastName = By.xpath("//input[@id='flda_330' or @name='flda_330']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By ciPageFrame= By.xpath("//iframe[@id='CossScreenFrame']");
	//By ciPageFrame= By.xpath("//div[@id='iframeWrapper']//iframe");
	GetDataFromExcel testdata = new GetDataFromExcel();
	   By AgentFirm=By.xpath("//select[@alt_id='AGENT_SDPFirm']");
	By SubmittingAgency= By.xpath("//label[text()='Submitting Agency']");
	//label[text()='Submitting Agency']
	By City= By.xpath("//select[@alt_id='CS_OwnerResidentState']");
	
	
	
	By individualsigningNo = By.xpath("//input[@id='rdo_167_2']");
	By individualsigningYes = By.xpath("//input[@id='rdo_167_1']");
	By Firstname = By.xpath("//input[@id='flda_47']");
	By lastname = By.xpath("//input[@id='flda_43']");
	By Suffix = By.xpath("//select[@id='lb_55']");
	By RelationshiptoInsured = By.xpath("//select[@id='lb_165']");
	
	
	
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;
    static String ContractCity =" ";
	public void enterLifeCaseSetup(String InsuredResidentState, String insuredCitizenship, String faceAmount,
			String groupbill, String platniumpass, String LifeconvInsurabilityOpt, String PolicyUnderwriting,
			String MMLCRegesterd,String ApexMMLIS,String ApexResultOfRightBridge, String Qualifedplan, String financialservicesrepresentative,
			String purchasethispolicy, String hardshipwithdrawal, String Retirement_paythepremiums,
			String whatisthePrimarypurpose, String surrenderchargeamount) {
		/*$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(100));
		HooksTest.idriver.switchTo().frame($(ciPageFrame));*/
			HooksTest.idriver.switchTo().frame(0);

			$(InsuredResState).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(InsuredResidentState);
		
			if ($(InsuredCitizenship).isDisplayed()) {
				$(InsuredCitizenship).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(insuredCitizenship);
			}
			$(FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(faceAmount);
			if ($(GroupBill).isDisplayed()) {
				$(GroupBill).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(groupbill);
			}
			//for UL
			if (LifeconvInsurabilityOpt.equalsIgnoreCase("Yes")) {
				if($(LifeconvInsurabilityOpt_Yes).isDisplayed()){
					selectRadioYesorNo(LifeconvInsurabilityOpt_Yes, LifeconvInsurabilityOpt_No, LifeconvInsurabilityOpt);
				}
				if($(PolicyUnderwriting_Yes).isDisplayed()){
					selectRadioYesorNo(PolicyUnderwriting_Yes, PolicyUnderwriting_No, PolicyUnderwriting);
				}
				
			} else {
				if($(LifeconvInsurabilityOpt_Yes).isDisplayed()){
					if($(LifeconvInsurabilityOpt_Yes).isDisplayed()){
						selectRadioYesorNo(LifeconvInsurabilityOpt_Yes, LifeconvInsurabilityOpt_No, LifeconvInsurabilityOpt);
					}
				}
			}
			
			if (platniumpass.equalsIgnoreCase("Yes") && $(PlatniumPass_Yes).isDisplayed()) {
				selectRadioYesorNo(PlatniumPass_Yes, PlatniumPass_No, platniumpass);
			} else if (platniumpass.equalsIgnoreCase("No") && $(PlatniumPass_No).isDisplayed()) {
				selectRadioYesorNo(PlatniumPass_Yes, PlatniumPass_No, platniumpass);
				if (LifeconvInsurabilityOpt.equalsIgnoreCase("Yes")) {
					if($(LifeconvInsurabilityOpt_Yes).isDisplayed()){
						selectRadioYesorNo(LifeconvInsurabilityOpt_Yes, LifeconvInsurabilityOpt_No, LifeconvInsurabilityOpt);
					}
					if($(PolicyUnderwriting_Yes).isDisplayed()){
						selectRadioYesorNo(PolicyUnderwriting_Yes, PolicyUnderwriting_No, PolicyUnderwriting);
					}
					
				} else {
					if($(LifeconvInsurabilityOpt_Yes).isDisplayed()){
						selectRadioYesorNo(LifeconvInsurabilityOpt_Yes, LifeconvInsurabilityOpt_No, LifeconvInsurabilityOpt);
					}
					
				}
			}
			
			
			selectRadioYesorNo(MMLISRegisteredRep_Yes, MMLISRegisteredRep_No, MMLCRegesterd);
			
			if(MMLCRegesterd.equalsIgnoreCase("Yes")){
				if($(ApexMMLISRegisteredRep_Yes).isDisplayed()){
					selectRadioYesorNo(ApexMMLISRegisteredRep_Yes, ApexMMLISRegisteredRep_No, ApexMMLIS);
					if(ApexMMLIS.equalsIgnoreCase("Yes")){
						$(ApexResultBridge_DD).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(ApexResultOfRightBridge);
					}
				}
			}
			selectRadioYesorNo(QualifiedPlan_Yes, QualifiedPlan_No, Qualifedplan);
			if($(financialservicesrepresentative_Yes).isDisplayed()){
				if (MMLCRegesterd.equalsIgnoreCase("Yes") && Qualifedplan.equalsIgnoreCase("No")) {
					selectRadioYesorNo(financialservicesrepresentative_Yes, financialservicesrepresentative_No,financialservicesrepresentative);
					if (financialservicesrepresentative.equalsIgnoreCase("Yes")) {
						selectRadioYesorNo(AccountPurchaseThisPolicy_Yes, AccountPurchaseThisPolicy_No, purchasethispolicy);
						selectRadioYesorNo(hardshipwithdrawal_Yes, hardshipwithdrawal_No, hardshipwithdrawal);
						if (purchasethispolicy.equalsIgnoreCase("No") && hardshipwithdrawal.equalsIgnoreCase("No")) {
							selectRadioYesorNo(Retirement_paythepremiums_Yes, Retirement_paythepremiums_No,Retirement_paythepremiums);
							$(Whatistheprimarypurpose).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(whatisthePrimarypurpose);
							if (Retirement_paythepremiums.equalsIgnoreCase("Yes")) {
								$(SurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(surrenderchargeamount);
							}
						}
					}
				}
			}
		//}
		/*$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(100));
		HooksTest.idriver.switchTo().frame($(ciPageFrame));*/
		
	}

	public void RadioQuestionTwo(String DIonSameApplication, String existingDIpolicy, String OwnerAllpolicies,String Indiviual_Entity,String IsPolicyJointlyOwned,
			String OwnerState,String Owner_MM,String Owner_DD,String Owner_YYYY,String EntityTrust,String HoldIssue, String Backdatesaveage, String Policydate, String MM, String DD, String YYYY,
			String Agency,String Agentfirm,String FirmsListdisplay, String Stateowner, String CountryOwner, String Cityowner, String Quickclose,String SalesPerson_RD,
			String SalesFirstname,String salesLastName) {
	/*	$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(100));
		HooksTest.idriver.switchTo().frame($(ciPageFrame));*/
		if($(DIPolicyonthesameapplication_Yes).isDisplayed()){
			selectRadioYesorNo(DIPolicyonthesameapplication_Yes, DIPolicyonthesameapplication_No, DIonSameApplication);
		}
		if($(DIPolicyonthesameapplication_Yes).isDisplayed()){
			selectRadioYesorNo(DIPolicyonthesameapplication_Yes, DIPolicyonthesameapplication_No, DIonSameApplication);	
		}
		if($(OwnerAllpolicies_Yes).isDisplayed() && $(OwnerAllpolicies_Yes).isEnabled() ){
			selectRadioYesorNo(OwnerAllpolicies_Yes, OwnerAllpolicies_No, OwnerAllpolicies);
		}
	
		if(OwnerAllpolicies.equalsIgnoreCase("No")){
			if(Indiviual_Entity.equalsIgnoreCase("Indiviualowner")){
				$(IndiviualOwner).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
				
				if($(IsPolicyJointlyOwned_Yes).isDisplayed()){
					selectRadioYesorNo(IsPolicyJointlyOwned_Yes, IsPolicyJointlyOwned_No, IsPolicyJointlyOwned);
				}				
				$(OwnerResidentState).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(OwnerState);
				
				if($(OwnerMM).isDisplayed()){
					$(OwnerMM).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Owner_MM);
				}
				if($(OwnerDD).isDisplayed()){
					$(OwnerDD).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Owner_DD);
				}
				if($(OwnerYYYY).isDisplayed()){
					$(OwnerYYYY).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Owner_YYYY);
				}
			}else{
				$(EntityOwner).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
				$(OwnerResidentState).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(OwnerState);
				selectRadioYesorNo(EntityaTrust_Yes, EntityaTrust_No, EntityTrust);
			}
			
		}
		//need to implement
		if (DIonSameApplication.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(existingDIpolicy_Yes, existingDIpolicy_No, existingDIpolicy);
		}
		if (DIonSameApplication.equalsIgnoreCase("No")) {
			selectRadioYesorNo(HoldIssue_Yes, HoldIssue_No, HoldIssue);
		}
		selectRadioYesorNo(BackdateSaveAge_Yes, BackdateSaveAge_No, Backdatesaveage);
		if (Backdatesaveage.equalsIgnoreCase("No")) {
			selectRadioYesorNo(PolicyDating_DateOfIssue, PolicyDating_SpecificDate, Policydate);
			if (Policydate.equalsIgnoreCase("No")) {
				$(SpecificDate_Month).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(MM);
				$(SpecificDate_Day).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(MM);
				$(SpecificDate_Year).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(YYYY);
			}
		}
		$(submittingAgency).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Agency);
		GlobalCap.sleep(900);
		$(SubmittingAgency).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		if(FirmsListdisplay.equalsIgnoreCase("Yes")){
			List<WebElement> FirmList = HooksTest.idriver.findElements(By.xpath("//select[@alt_id='AGENT_SDPFirm']//following-sibling::option"));
			System.out.println(FirmList.size());
			for (int i = 0; i <= FirmList.size() - 1; i++) {
				String list = FirmList.get(i).getText();
				System.out.println(list);
			}
		}
		if($(AgentFirm).isDisplayed()){
			$(AgentFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(Agentfirm);
			GlobalCap.sleep(7500);
		}
		ContractCity=$(City).getText();
        System.out.println("The Output of sate"+ContractCity);
		$(ownerstate).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Stateowner);
		GlobalCap.sleep(6000);
		if ($(ownerCountry).isDisplayed()) {
			$(ownerCountry).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(CountryOwner);
		}
		if($(cityowner).isDisplayed()){
			$(cityowner).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Cityowner);	
		}
		$(SubmittingAgency).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(6000);	
		selectRadioYesorNo(QuickClose_Yes, QuickClose_No, Quickclose);
		selectRadioYesorNo(QuickClose_Yes, QuickClose_No, Quickclose);
		if($(SalesPerson_Yes).isDisplayed()){
			selectRadioYesorNo(SalesPerson_Yes, SalesPerson_No, SalesPerson_RD);
			if(SalesPerson_RD.equalsIgnoreCase("Yes")){
				$(SalesFirstName).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(SalesFirstname);
				$(SalesLastName).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(salesLastName);
			}
		}
		
		GlobalCap.sleep(2000);
		
	}
	
	
	public void individualsigning1(String individualsigningYes_No, String firstname, String Lastname, String suffix,
			String relationshiptoInsured) {

		if ($(individualsigningYes).isDisplayed()) {
			GlobalCap.selectRadioYesorNo(individualsigningYes, individualsigningNo, individualsigningYes_No);

			if (individualsigningYes_No.equalsIgnoreCase("No")) {
				$(Firstname).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(firstname);
				$(lastname).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Lastname);
				$(Suffix).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(suffix);
			}

			$(RelationshiptoInsured).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(relationshiptoInsured);

		}
		GlobalCap.sleep(2000);
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
	
}
