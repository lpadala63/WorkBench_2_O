package pageclass;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
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

public class LifeProducerStatement extends GlobalCap{

	By LPS_RiskClassification= By.xpath("//label[text()='Risk classification presented to client:']//following::select[1]");
	By SWLRiskClassification1= By.xpath("//select[@alt_id='AC_RiskClass']");
	By SWLRiskClassification2= By.xpath("//select[@alt_id='OI1_AC_RiskClass']");
	
	
	By AC_OfferYes=By.xpath("//input[@alt_id='AC_OfferYesNo_1']");
	By AC_OfferNo=By.xpath("//input[@alt_id='AC_OfferYesNo_2']");
	
	By AC_HearingImpairmentYes=By.xpath("//input[@alt_id='AC_HearingImpairmentYesNo_1']");
	By AC_HearingImpairmentNo=By.xpath("//input[@alt_id='AC_HearingImpairmentYesNo_2']");
	
	By AC_OtherPreferredLanguageYes=By.xpath("//input[@alt_id='AC_OtherPreferredLanguageYesNo_1']");
	By AC_OtherPreferredLanguageNo=By.xpath("//input[@alt_id='AC_OtherPreferredLanguageYesNo_2']");
	By LPS_MultiPolicycase_Yes= By.xpath("//*[@id='rdo_26_1']");
	By LPS_MultiPolicycase_No= By.xpath("//*[@id='rdo_26_2']");
	By LPS_MultiPolicycase_AssociatedPolicyNumbers= By.xpath("//*[@id='flda_24']");
	By LPS_Otherapplicationssubmitted_Yes= By.xpath("//*[@id='rdo_22_1']");
	By LPS_Otherapplicationssubmitted_No= By.xpath("//*[@id='rdo_22_2']");
	By LPS_Otherapplicationssubmitted_AssociatedPolicyNumbers= By.xpath("//*[@id='flda_20']");
	By LPS_ReplacementQuestion_WarningMsg= By.xpath("//*[@id='lbl_74']");
	By LPS_DividendfromExistingMMPolicy_Yes= By.xpath("//*[@id='rdo_16_1']");
	By LPS_DividendfromExistingMMPolicy_No= By.xpath("//*[@id='rdo_16_2']");
	By LPS_ServiceRequestForm_Yes= By.xpath("//*[@id='rdo_50_1']");
	By LPS_ServiceRequestForm_No= By.xpath("//*[@id='rdo_50_2']");
	By LPS_PurchaseSinglePremiumImmediateAnnuity_Yes= By.xpath("//*[@id='rdo_13_1']");
	By LPS_PurchaseSinglePremiumImmediateAnnuity_No= By.xpath("//*[@id='rdo_13_2']");
	By LPS_PurchaseSinglePremiumImmediateAnnuity_ProvideAssociatedPolicyNumber= By.xpath("//*[@id='flda_11']");
	By LPS_DiscussedArrangingFinancingForPurchase_Yes= By.xpath("//*[@id='rdo_9_1']");
	By LPS_DiscussedArrangingFinancingForPurchase_No= By.xpath("//*[@id='rdo_9_2']");
	By LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_Yes= By.xpath("//*[@id='rdo_7_1']");
	By LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_No= By.xpath("//*[@id='rdo_7_2']");
	By LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_Details= By.xpath("//*[@id='flda_5']");
	By LPS_PersonSigningApplicationUnderstandEnglish_Yes= By.xpath("//*[@id='rdo_54_1']");
	By LPS_PersonSigningApplicationUnderstandEnglish_No= By.xpath("//*[@id='rdo_54_2']");
	By LPS_PersonSigningApplicationUnderstandEnglish_IndicateLanguage= By.xpath("//*[@id='flda_87']");
	
	//By LPI_Personal = By.xpath("//*[@id='cb_<change>']|67|60|61|62|59|58|65|68|63|64");
	By LPS_MarketType_NA=By.xpath("//*[@id='cb_67']");
	By LPS_MarketType_FamilyMarkets=By.xpath("//*[@id='cb_60']");
	By LPS_MarketType_MulticulturalMarkets=By.xpath("//*[@id='cb_61']");
	By LPS_MarketType_WomansMarkets=By.xpath("//*[@id='cb_62']");
	By LPS_MarketType_Other=By.xpath("//*[@id='cb_59']");
	By LPS_MarketType_Othertextbox=By.xpath("//*[@id='flda_58']");
	By LPS_MarketType_BusinessOwner=By.xpath("//*[@id='cb_65']");
	By LPS_MarketType_LGBTQMarkets=By.xpath("//*[@id='cb_68']");
	By LPS_MarketType_SpecialCare=By.xpath("//*[@id='cb_63']");
	By LPS_MarketType_ExistingCustomer=By.xpath("//*[@id='cb_64']");
	
	//Apex
	By Prospectusandany_Yes=By.xpath("//input[@alt_id='AC_ProspectusYesNo_1']");
	By Prospectusandany_No=By.xpath("//input[@alt_id='AC_ProspectusYesNo_2']");
	
	/*By Prospectusdate_MM=By.xpath("//div[@id='div_90']/div/span/span[1]/input[1]");
	By Prospectusdate_DD=By.xpath("//div[@id='div_90']/div/span/span[1]/input[2]");
	By Prospectusdate_YYYY=By.xpath("//div[@id='div_90']/div/span/span[1]/input[3]");
*/	
	
	
	By Prospectusdate_MM=By.xpath("//div[@id='div_95']/div/span/span[1]/input[1]");
	By Prospectusdate_DD=By.xpath("//div[@id='div_95']/div/span/span[1]/input[2]");
	By Prospectusdate_YYYY=By.xpath("//div[@id='div_95']/div/span/span[1]/input[3]");
	
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	
	By LPS_Back=By.xpath("//*[@id='btn_35']");
	By LPS_Next=By.xpath("//*[@id='btn_34']");
	
	public void enterProducerStatement(String RiskClassification,String AC_Offer, String MultipolicyCase, String MultipolicyCasePolicyNumbers, 
			String Otherapplicationssubmitted, String OtherapplicationssubmittedPolicyNumbers, String Dividends, String ServiceRequest, 
			String PurchaseSinglePremiumImmediateAnnuity, String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers, 
			String DiscussedArrangingFinancingForPurchase, String KnowledgeReasontoBelieve, String KnowledgeReasontoBelieveDetails, 
			String UnderstandEnglish,String AC_HearingImpairment,String AC_OtherPreferredLanguage, String IndicateLanguage, String MarketType,
			String Prospectusandany,String Prospectus_MM,String Prospectus_DD,String Prospectus_YYYY){
		$(LPS_RiskClassification).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(RiskClassification);	
		if($(AC_OfferYes).isDisplayed()){
		selectRadioYesorNo(AC_OfferYes,AC_OfferNo,AC_Offer);
		}
		selectRadioYesorNo(LPS_MultiPolicycase_Yes,LPS_MultiPolicycase_No,MultipolicyCase);
		if (MultipolicyCase.equalsIgnoreCase("Yes")) {
			$(LPS_MultiPolicycase_AssociatedPolicyNumbers).setValue(MultipolicyCasePolicyNumbers);
		}
		selectRadioYesorNo(LPS_Otherapplicationssubmitted_Yes, LPS_Otherapplicationssubmitted_No, Otherapplicationssubmitted);
		if (Otherapplicationssubmitted.equalsIgnoreCase("Yes")) {
			$(LPS_Otherapplicationssubmitted_AssociatedPolicyNumbers).setValue(OtherapplicationssubmittedPolicyNumbers);
		}
		selectRadioYesorNo(LPS_DividendfromExistingMMPolicy_Yes, LPS_DividendfromExistingMMPolicy_No, Dividends);
		if (Dividends.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(LPS_ServiceRequestForm_Yes, LPS_ServiceRequestForm_No, ServiceRequest);
		}
		selectRadioYesorNo(LPS_PurchaseSinglePremiumImmediateAnnuity_Yes, LPS_PurchaseSinglePremiumImmediateAnnuity_No, PurchaseSinglePremiumImmediateAnnuity);
		if (PurchaseSinglePremiumImmediateAnnuity.equalsIgnoreCase("Yes")) {
			$(LPS_PurchaseSinglePremiumImmediateAnnuity_ProvideAssociatedPolicyNumber).setValue(PurchaseSinglePremiumImmediateAnnuityPolicyNumbers);
		}
		selectRadioYesorNo(LPS_DiscussedArrangingFinancingForPurchase_Yes, LPS_DiscussedArrangingFinancingForPurchase_No, DiscussedArrangingFinancingForPurchase);
		selectRadioYesorNo(LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_Yes, LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_No, KnowledgeReasontoBelieve);
		if (KnowledgeReasontoBelieve.equalsIgnoreCase("Yes")) {
			$(LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_Details).setValue(KnowledgeReasontoBelieveDetails);
		}
		selectRadioYesorNo(LPS_PersonSigningApplicationUnderstandEnglish_Yes, LPS_PersonSigningApplicationUnderstandEnglish_No, UnderstandEnglish);
		if($(AC_HearingImpairmentYes).isDisplayed()){
			selectRadioYesorNo(AC_HearingImpairmentYes, AC_HearingImpairmentNo, AC_HearingImpairment);
		}
		
	if($(AC_OtherPreferredLanguageYes).isDisplayed()){
		selectRadioYesorNo(AC_OtherPreferredLanguageYes, AC_OtherPreferredLanguageNo, AC_OtherPreferredLanguage);
		}
	if($(LPS_PersonSigningApplicationUnderstandEnglish_IndicateLanguage).isDisplayed()){
		if (UnderstandEnglish.equalsIgnoreCase("Yes")) {
			$(LPS_PersonSigningApplicationUnderstandEnglish_IndicateLanguage).setValue(IndicateLanguage);
		}
	}
		

		
		switch (MarketType) {
		case "N/A":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_NA).click();
			break;
		case "Family Markets":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_FamilyMarkets).click();
			break;
		case "Multicultural Markets":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_MulticulturalMarkets).click();
			break;
		case "Women's Markets":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_WomansMarkets).click();
			break;
		case "Other":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_Other).click();
			break;
		case "Business Owner":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_BusinessOwner).click();
			break;
		case "LGBTQ Markets":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_LGBTQMarkets).click();
			break;
		case "SpecialCare - Families with special needs":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_SpecialCare).click();
			break;
		case "Existing Customer":
			GlobalCap.sleep(1000);
			$(LPS_MarketType_ExistingCustomer).click();
			break;
		
		default:
			System.out.println("Not able to select the option");
			break;
		}
		
		if($(Prospectusandany_Yes).isDisplayed()){
			selectRadioYesorNo(Prospectusandany_Yes, Prospectusandany_No, Prospectusandany);
			if(Prospectusandany.equalsIgnoreCase("Yes")){
				$(Prospectusdate_MM).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Prospectus_MM);
				$(Prospectusdate_DD).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Prospectus_DD);
				$(Prospectusdate_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Prospectus_YYYY);
			}
		}
		
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
	public void Apex_Prospectus(String Prospectusandany,String Prospectus_MM,String Prospectus_DD,String Prospectus_YYYY){
		if($(Prospectusandany_Yes).isDisplayed()){
			selectRadioYesorNo(Prospectusandany_Yes, Prospectusandany_No, Prospectusandany);
			if(Prospectusandany.equalsIgnoreCase("Yes")){
				$(Prospectusdate_MM).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Prospectus_MM);
				$(Prospectusdate_DD).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Prospectus_DD);
				$(Prospectusdate_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(Prospectus_YYYY);
			}
		}
	}
	
	
	
	
}