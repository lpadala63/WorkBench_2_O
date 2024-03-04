package pageclass.SWl;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;


public class SwlProducerStatement  extends GlobalCap{

		By LPS_RiskClassification= By.xpath("//label[text()='Risk classification presented to client:']//following::select[1]");
		By SWLRiskClassification1= By.xpath("//select[@alt_id='AC_RiskClass']");
		By SWLRiskClassification2= By.xpath("//select[@alt_id='OI1_AC_RiskClass']");
		
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
		By LPS_Back=By.xpath("//*[@id='btn_35']");
		By LPS_Next=By.xpath("//*[@id='btn_34']");

		public void enterProducerStatement(String swlRiskClassification1,String swlRiskClassification2,String MultipolicyCase, String MultipolicyCasePolicyNumbers, 
				String Otherapplicationssubmitted, String OtherapplicationssubmittedPolicyNumbers, String Dividends, String ServiceRequest, 
				String PurchaseSinglePremiumImmediateAnnuity, String PurchaseSinglePremiumImmediateAnnuityPolicyNumbers, 
				String DiscussedArrangingFinancingForPurchase, String KnowledgeReasontoBelieve, String KnowledgeReasontoBelieveDetails, 
				String UnderstandEnglish, String IndicateLanguage, String MarketType){
			if($(SWLRiskClassification1).isDisplayed()){
				$(SWLRiskClassification1).shouldBe(Visible.exist, Duration.ofSeconds(100)).selectOptionContainingText(swlRiskClassification1);
			}
			
           if($(SWLRiskClassification2).isDisplayed()){
        	   $(SWLRiskClassification2).shouldBe(Visible.exist, Duration.ofSeconds(100)).selectOptionContainingText(swlRiskClassification2);
			}
			
					
			// Is this part of a multi-policy case (i.e. family members, business partners, etc.)?
			selectRadioYesorNo(LPS_MultiPolicycase_Yes,LPS_MultiPolicycase_No,MultipolicyCase);
			// Provide associated Policy Number(s)
			if (MultipolicyCase.equalsIgnoreCase("Yes")) {
				$(LPS_MultiPolicycase_AssociatedPolicyNumbers).setValue(MultipolicyCasePolicyNumbers);
			}
			
			// Are there any other applications (e.g. Disability) being submitted concurrently with this Application or within the last two months?
			selectRadioYesorNo(LPS_Otherapplicationssubmitted_Yes, LPS_Otherapplicationssubmitted_No, Otherapplicationssubmitted);
			// Provide associated Policy Number(s)
			if (Otherapplicationssubmitted.equalsIgnoreCase("Yes")) {
				$(LPS_Otherapplicationssubmitted_AssociatedPolicyNumbers).setValue(OtherapplicationssubmittedPolicyNumbers);
			}
			
			// Will dividends from an existing MassMutual policy be used to pay all or part of the initial premium on this policy?
			selectRadioYesorNo(LPS_DividendfromExistingMMPolicy_Yes, LPS_DividendfromExistingMMPolicy_No, Dividends);
			// Would you like to complete a Service Request form?
			if (Dividends.equalsIgnoreCase("Yes")) {
				selectRadioYesorNo(LPS_ServiceRequestForm_Yes, LPS_ServiceRequestForm_No, ServiceRequest);
			}
			
			// Is the Life Insurance being applied for in conjunction with the purchase of a Single Premium Immediate Annuity?
			selectRadioYesorNo(LPS_PurchaseSinglePremiumImmediateAnnuity_Yes, LPS_PurchaseSinglePremiumImmediateAnnuity_No, PurchaseSinglePremiumImmediateAnnuity);
			// Provide associated Policy Number(s)
			if (PurchaseSinglePremiumImmediateAnnuity.equalsIgnoreCase("Yes")) {
				$(LPS_PurchaseSinglePremiumImmediateAnnuity_ProvideAssociatedPolicyNumber).setValue(PurchaseSinglePremiumImmediateAnnuityPolicyNumbers);
			}
			
			// Are you aware of whether the Proposed Owner or Proposed Insured has arranged, or discussed arranging, any financing for the purchase of this policy?
			selectRadioYesorNo(LPS_DiscussedArrangingFinancingForPurchase_Yes, LPS_DiscussedArrangingFinancingForPurchase_No, DiscussedArrangingFinancingForPurchase);
			
			// Do you have any knowledge or reason to believe the Proposed Insured has any present or future intention to sell or assign this policy, or has ever sold or assigned any policy, to a life settlement, viatical or other secondary market provider?
			selectRadioYesorNo(LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_Yes, LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_No, KnowledgeReasontoBelieve);
			// Details
			if (KnowledgeReasontoBelieve.equalsIgnoreCase("Yes")) {
				$(LPS_AnyKnowledgeReasonBelievePIhasPresentFutureIntentionSellAssignPolicy_Details).setValue(KnowledgeReasontoBelieveDetails);
			}
			
			// Are you aware of any person signing this Application who did not understand and answer each question in English?
			selectRadioYesorNo(LPS_PersonSigningApplicationUnderstandEnglish_Yes, LPS_PersonSigningApplicationUnderstandEnglish_No, UnderstandEnglish);
			// Indicate Language
			if (UnderstandEnglish.equalsIgnoreCase("Yes")) {
				$(LPS_PersonSigningApplicationUnderstandEnglish_IndicateLanguage).setValue(IndicateLanguage);
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
			$(LPS_Next).click();
		}
	}

