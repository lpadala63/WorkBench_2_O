package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class NYCConeLifeproductsuitabilityContinues extends GlobalCap {
	By T20million_Yes= By.xpath("//label[contains(text(),'20 million')]//following::input[@alt_id='LS_IAE_Worth20Mil_YesNo_1']");
	By T20million_No= By.xpath("//label[contains(text(),'20 million')]//following::input[@alt_id='LS_IAE_Worth20Mil_YesNo_2']");
	By ProposedAnnualPremium= By.xpath("//label[contains(text(),'Proposed Annual Premium')]//following-sibling::input[@alt_id='LS_Product_LICCI_AnnualPremium_Amount']");
	By FaceAmount= By.xpath("//label[contains(text(),'Face amount ')]//following-sibling::input[@alt_id='LS_Product_LICCI_AnnualPremium_FaceAmount']");
	By ReplaceByPolicy_Yes= By.xpath("//label[contains(text(),'replaced by this policy')]//following::input[@alt_id='LS_Product_LICCI_Inforce_YesNo_1']");
	By ReplaceByPolicy_No= By.xpath("//label[contains(text(),'replaced by this policy')]//following::input[@alt_id='LS_Product_LICCI_Inforce_YesNo_2']");
	By TotalFaceamount= By.xpath("//label[contains(text(),'Total face amount')]//following::input[@alt_id='LS_Product_LICCI_Inforce_TotalFaceAmount']");
	By TotalAnnualIncome= By.xpath("//label[contains(text(),'Total annual')]//following::input[@alt_id='LS_Product_LICCI_Inforce_TotalAnualPremium']");
	By AnnualPremium_Cost= By.xpath("//label[contains(text(),'Annual premium/cost')]//following::input[@alt_id='LS_Product_LICCI_OtherAnnualPremium']");
	
	By DesireSinglePremium= By.xpath("//input[@alt_id='LS_Product_RT_Premiums_A']");
	By DesireguaranteedPremium= By.xpath("//input[@alt_id='LS_Product_RT_Premiums_B']");
	By DesirepremiumOverperiod= By.xpath("//input[@alt_id='LS_Product_RT_Premiums_C']");
	
	By LTCBenefitNotUSed= By.xpath("//input[@alt_id='LS_Product_RT_DeathBenefit_A']");
	By cashValueAccumulation= By.xpath("//input[@alt_id='LS_Product_RT_DeathBenefit_B']");
	
	By WillingToAcceptPotentially= By.xpath("//input[@alt_id='LS_Product_RT_LTC_A']");
	By DesireRichestLTC= By.xpath("//input[@alt_id='LS_Product_RT_LTC_B']");
	
	By Next=By.xpath("//button[text()='Next  ']");

	public void suitabilitycontinues(String state, String T20million, String Proposedannualpremium, String Faceamount,
			String ReplaceByPolicy, String AnnualPrem_Cost, String Totalfaceamount, String TotalannualIncome,
			String RiskTolerance, String Risktoleranceaboutdeath, String RiskToleranceTwo) {
		if (state.equalsIgnoreCase("New York")) {
			selectRadioYesorNo(T20million_Yes, T20million_No, T20million);
			$(ProposedAnnualPremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Proposedannualpremium);
			$(FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Faceamount);
			selectRadioYesorNo(ReplaceByPolicy_Yes, ReplaceByPolicy_No, ReplaceByPolicy);
			if (ReplaceByPolicy.equalsIgnoreCase("Yes")) {
				$(TotalFaceamount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Totalfaceamount);
				$(TotalAnnualIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(TotalannualIncome);
			}
			$(AnnualPremium_Cost).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AnnualPrem_Cost);

			switch (RiskTolerance) {
			case "DesireSinglePremium":
				$(DesireSinglePremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "DesireguaranteedPremium":
				$(DesireguaranteedPremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "DesirepremiumOverperiod":
				$(DesirepremiumOverperiod).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;

			default:
				System.out.println("Not able to select the option");
				break;

			}
			
			if(Risktoleranceaboutdeath.equalsIgnoreCase("LTCBenefitNotUSed") ){
				$(LTCBenefitNotUSed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			else if(Risktoleranceaboutdeath.equalsIgnoreCase("cashValueAccumulation")){
				$(cashValueAccumulation).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			
			
			
			switch (RiskToleranceTwo) {
			case "WillingToAcceptPotentially":
				$(WillingToAcceptPotentially).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "death benefit for life":
				$(DesireRichestLTC).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			default:
				System.out.println("Not able to select the option");
				break;

			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}

}
