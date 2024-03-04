package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class CConeProduceStatement extends GlobalCap {
	
    By LPS_RiskClassification= By.xpath("//label[text()='Risk Classification']//following::select");
	By LPS_MultiPolicycase_Yes= By.xpath("//label[contains(text(),'multi-policy case')]//following::input[@alt_id='AC_MultiPolYesNo_1']");
	By LPS_MultiPolicycase_No= By.xpath("//label[contains(text(),'multi-policy case')]//following::input[@alt_id='AC_MultiPolYesNo_2']");
	By LPS_MultiPolicycase_details= By.xpath("//input[@alt_id='AC_MultiPolDetails']");
	
	By LPS_Otherapplicationssubmitted_Yes= By.xpath("//label[contains(text(),'other applications')]//following::input[@alt_id='AC_LTCYesNo_1']");
	By LPS_Otherapplicationssubmitted_No= By.xpath("//label[contains(text(),'other applications')]//following::input[@alt_id='AC_LTCYesNo_2']");
	By LPS_Otherapplicationssubmitted_PolicyNumbers= By.xpath("//input[@alt_id='AC_LTCDetails']");
	
	By LPS_ReplacementQuestion_WarningMsg= By.xpath("//*[@id='lbl_74']");
	
	By LPS_DividendfromExistingMMPolicy_Yes= By.xpath("//label[contains(text(),'Will dividends')]//following::input[@alt_id='AC_DividendsYesNo_1']");
	By LPS_DividendfromExistingMMPolicy_No= By.xpath("//label[contains(text(),'Will dividends')]//following::input[@alt_id='AC_DividendsYesNo_2']");
	
	By LPS_ServiceRequestForm_Yes= By.xpath("//label[contains(text(),'Service Request form')]//following::input[@alt_id='AC_ServiceRequestYesNo_1']");
	By LPS_ServiceRequestForm_No= By.xpath("//label[contains(text(),'Service Request form')]//following::input[@alt_id='AC_ServiceRequestYesNo_2']");
	
	By LPS_PurchaseSinglePremiumImmediateAnnuity_Yes= By.xpath("//label[contains(text(),'Single Premium Immediate')]//following::input[@alt_id='AC_SinglePremiumAnnuityYesNo_1']");
	By LPS_PurchaseSinglePremiumImmediateAnnuity_No= By.xpath("//label[contains(text(),'Single Premium Immediate')]//following::input[@alt_id='AC_SinglePremiumAnnuityYesNo_2']");
	By LPS_PurchaseSinglePremiumImmediateAnnuity_ProvideAssociatedPolicyNumber= By.xpath("//label[contains(text(),'Single Premium Immediate')]//following::input[@alt_id='AC_SinglePremiumAnnuityDetails']");
	
	By LPS_PersonSigningApplicationUnderstandEnglish_Yes= By.xpath("//label[contains(text(),'English')]//following::input[@alt_id='AC_AnswerEnglishYesNo_1']");
	By LPS_PersonSigningApplicationUnderstandEnglish_No= By.xpath("//label[contains(text(),'English')]//following::input[@alt_id='AC_AnswerEnglishYesNo_2']");
	
	By Pre_QualifyingChecklistU0100_Yes= By.xpath("//label[contains(text(),'U0100')]//following::input[@alt_id='AC_CheckListYesNo_1']");
	By Pre_QualifyingChecklistU0100_No= By.xpath("//label[contains(text(),'U0100')]//following::input[@alt_id='AC_CheckListYesNo_2']");

	
	//By LPI_Personal = By.xpath("//*[@id='cb_<change>']|67|60|61|62|59|58|65|68|63|64");
	By MarketType_NA=By.xpath("//span[contains(text(),'N/A')]");
	By MarketType_BusinessOwner=By.xpath("//span[contains(text(),'Business Owner')]");
	By MarketType_ExistingCustomer=By.xpath("//span[contains(text(),'Existing Customer')]");
	By MarketType_FamilyMarkets=By.xpath("//span[contains(text(),'Family Markets')]");
	By MarketType_LGBTQMarkets=By.xpath("//span[contains(text(),'LGBT')]");
	By MarketType_MulticulturalMarkets=By.xpath("//span[contains(text(),'Multicultural Markets')]");
	By MarketType_SpecialCare=By.xpath("//span[contains(text(),'SpecialCare')]");	
	By MarketType_WomansMarkets=By.xpath("//span[contains(text(),'Women')]");
	By MarketType_Other=By.xpath("//span[contains(text(),'Other')]");
	By MarketType_Othertextbox=By.xpath("//label[contains(text(),'Other')]//following-sibling::input");	
	By Next=By.xpath("//button[contains(text(),'Next')]");

	public void enterProducerStatement(String RiskClassification, String MultipolicyCase, String MultipolicyCasePolicyNumbers, 
			String Otherapplicationssubmitted, String OtherapplicationssubmittedPolicyNumbers, String Dividends, String ServiceRequest, 
			String PurchaseSinglePremiumImmediateAnnuity, String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers,
			String UnderstandEnglish, String MarketType, String MarketOthertextbox,String U0100){
		
		$(LPS_RiskClassification).shouldBe(Visible.exist, Duration.ofSeconds(100)).selectOptionContainingText(RiskClassification);
		selectRadioYesorNoDetails(LPS_MultiPolicycase_Yes, LPS_MultiPolicycase_No, MultipolicyCase, LPS_MultiPolicycase_details, MultipolicyCasePolicyNumbers);
		selectRadioYesorNoDetails(LPS_Otherapplicationssubmitted_Yes, LPS_Otherapplicationssubmitted_No, Otherapplicationssubmitted, LPS_Otherapplicationssubmitted_PolicyNumbers, OtherapplicationssubmittedPolicyNumbers);
		selectRadioYesorNo(LPS_DividendfromExistingMMPolicy_Yes, LPS_DividendfromExistingMMPolicy_No, Dividends);
	
		if (Dividends.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(LPS_ServiceRequestForm_Yes, LPS_ServiceRequestForm_No, ServiceRequest);
		}
	    selectRadioYesorNoDetails(LPS_PurchaseSinglePremiumImmediateAnnuity_Yes, LPS_PurchaseSinglePremiumImmediateAnnuity_No, PurchaseSinglePremiumImmediateAnnuity, LPS_PurchaseSinglePremiumImmediateAnnuity_ProvideAssociatedPolicyNumber, PurchaseSinglePremiumImmediateAnnuityPolicyNumbers);
		
		selectRadioYesorNo(LPS_PersonSigningApplicationUnderstandEnglish_Yes, LPS_PersonSigningApplicationUnderstandEnglish_No, UnderstandEnglish);
		
		selectRadioYesorNo(Pre_QualifyingChecklistU0100_Yes, Pre_QualifyingChecklistU0100_No, U0100);
		switch (MarketType) {
		case "N/A":
			GlobalCap.sleep(1000);
			$(MarketType_NA).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			break;
		case "Family Markets":
			GlobalCap.sleep(1000);
			$(MarketType_FamilyMarkets).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			break;
		case "Multicultural Markets":
			GlobalCap.sleep(1000);
			$(MarketType_MulticulturalMarkets).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			break;
		case "Womens Markets":
			GlobalCap.sleep(1000);
			$(MarketType_WomansMarkets).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			break;
		case "Other":
			GlobalCap.sleep(1000);
			$(MarketType_Other).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(MarketType_Othertextbox).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MarketOthertextbox);
			break;
		case "Business Owner":
			GlobalCap.sleep(1000);
			$(MarketType_BusinessOwner).click();
			break;
		case "LGBT Markets":
			GlobalCap.sleep(1000);
			$(MarketType_LGBTQMarkets).click();
			break;
		case "SpecialCare":
			GlobalCap.sleep(1000);
			$(MarketType_SpecialCare).click();
			break;
		case "Existing Customer":
			GlobalCap.sleep(1000);
			$(MarketType_ExistingCustomer).click();
			break;
		
		default:
			System.out.println("Not able to select the option");
			break;
		}
		$(Next).click();
	}
}
