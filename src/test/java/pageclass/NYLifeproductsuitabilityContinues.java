package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class NYLifeproductsuitabilityContinues extends GlobalCap {
	By T20million_Yes= By.xpath("//label[contains(text(),'20 million')]//following::input[@alt_id='LS_IAE_Worth20Mil_YesNo_1']");
	By T20million_No= By.xpath("//label[contains(text(),'20 million')]//following::input[@alt_id='LS_IAE_Worth20Mil_YesNo_2']");
	By ProposedAnnualPremium= By.xpath("//label[contains(text(),'Proposed Annual Premium')]//following-sibling::input[@alt_id='LS_Product_LICCI_AnnualPremium_Amount']");
	By FaceAmount= By.xpath("//label[contains(text(),'Face amount ')]//following-sibling::input[@alt_id='LS_Product_LICCI_AnnualPremium_FaceAmount']");
	
	By UnsheduledALIR_Yes= By.xpath("//input[@id='rdo_41_1']");
	By UnsheduledALIR_No= By.xpath("//input[@id='rdo_41_2']");
	By AmountofUnSheduled= By.xpath("//input[@id='flda_38']");
	By Exchange1035_Yes= By.xpath("//input[@id='rdo_35_1']");
	By Exchange1035_No= By.xpath("//input[@id='rdo_35_2']");
	By Exchange1035Amount= By.xpath("//input[@id='flda_32']");
	
	
	
	
	
	By ReplaceByPolicy_Yes= By.xpath("//label[contains(text(),'replaced by this policy')]//following::input[@alt_id='LS_Product_LICCI_Inforce_YesNo_1']");
	By ReplaceByPolicy_No= By.xpath("//label[contains(text(),'replaced by this policy')]//following::input[@alt_id='LS_Product_LICCI_Inforce_YesNo_2']");
	By TotalFaceamount= By.xpath("//label[contains(text(),'Total face amount')]//following::input[@alt_id='LS_Product_LICCI_Inforce_TotalFaceAmount']");
	By TotalAnnualIncome= By.xpath("//label[contains(text(),'Total annual')]//following::input[@alt_id='LS_Product_LICCI_Inforce_TotalAnualPremium']");
	By AnnualPremium_Cost= By.xpath("//label[contains(text(),'Annual premium/cost')]//following::input[@alt_id='LS_Product_LICCI_OtherAnnualPremium']");
	
	//LTCRiskTolerance
	By LTCbenefitnotuse= By.xpath("//input[@id='cb_5']");
	By LTCCashValueaccumulation= By.xpath("//input[@id='cb_4']");
	
	
	
	By NoPremiumFlexibility= By.xpath("//input[@alt_id='LS_Product_RT_Premiums_A']");
	By somepointinfuture= By.xpath("//input[@alt_id='LS_Product_RT_Premiums_B']");
	By premiumsinthefuture= By.xpath("//input[@alt_id='LS_Product_RT_Premiums_C']");
	By maintiancoverage= By.xpath("//input[@alt_id='LS_Product_RT_Premiums_D']");
	
	By numberofyears= By.xpath("//input[@alt_id='LS_Product_RT_DeathBenefit_A']");
	By DeathBenefitforLife= By.xpath("//input[@alt_id='LS_Product_RT_DeathBenefit_B']");
	By non_guaranteedDividends= By.xpath("//input[@alt_id='LS_Product_RT_DeathBenefit_C']");
	By premiumflexibility= By.xpath("//input[@alt_id='LS_Product_RT_DeathBenefit_D']");
	By Next=By.xpath("//button[text()='Next  ']");
	//aLt
	By AlternateProduct= By.xpath("//strong[text()='Alternate Product:']");
	By AnnualPremium_Proposed= By.xpath("//input[@id='flda_154']");
	By Alt_FaceAmount= By.xpath("//input[@id='flda_152']");
	By Alt_UnsheduledALIR_Yes= By.xpath("//input[@id='rdo_144_1']");
	By Alt_UnsheduledALIR_No= By.xpath("//input[@id='rdo_144_2']");
	By Alt_AmountofUnSheduled= By.xpath("//input[@id='flda_141']");
	By Alt_Exchange1035_Yes= By.xpath("//input[@id='rdo_138_1']");
	By Alt_Exchange1035_No= By.xpath("//input[@id='rdo_138_2']");
	By Alt_Exchange1035Amount= By.xpath("//input[@id='flda_135']");
	By ReplacedByPolicy_Yes= By.xpath("//input[@id='rdo_150_1']");
	By ReplacedByPolicy_No= By.xpath("//input[@id='rdo_150_2']");
	By TotalFaceAmount= By.xpath("//input[@id='flda_148']");
	By TotalAnnualPremium= By.xpath("//input[@id='flda_147']");
	By AnnuaLPremiumCost= By.xpath("//input[@id='flda_122']");
	//Additional
	
	By AdditionalProduct= By.xpath("//strong[text()='Additional Product:']");
	By Add_AnnualPremium_Proposed= By.xpath("//input[@id='flda_190']");
	By Add_FaceAmount= By.xpath("//input[@id='flda_188']");
	By Add_UnsheduledALIR_Yes= By.xpath("//input[@id='rdo_180_1']");
	By Add_UnsheduledALIR_No= By.xpath("//input[@id='rdo_180_2']");
	By Add_AmountofUnSheduled= By.xpath("//input[@id='flda_177']");
	By Add_Exchange1035_Yes= By.xpath("//input[@id='rdo_174_1']");
	By Add_Exchange1035_No= By.xpath("//input[@id='rdo_174_2']");
	By Add_Exchange1035Amount= By.xpath("//input[@id='flda_171']");
	By Add_ReplacedByPolicy_Yes= By.xpath("//input[@id='rdo_186_1']");
	By Add_ReplacedByPolicy_No= By.xpath("//input[@id='rdo_186_2']");
	By Add_TotalFaceAmount= By.xpath("//input[@id='flda_184']");
	By Add_TotalAnnualPremium= By.xpath("//input[@id='flda_183']");
	By Add_AnnuaLPremiumCost= By.xpath("//input[@id='flda_158']");
	
	
	//ALT Risk tolerance about premiums:
	By RiskToleranceAlternate = By.xpath("//strong[contains(text(),'Risk Tolerance for the Alternate Product')]");
	By Alt_NoPremiumFlexibility = By.xpath("//input[@id='cb_207']");
	By ALt_PayPremiumatSomePoint = By.xpath("//input[@id='cb_206']");
	By Alt_Higherpremiumsinthefuture = By.xpath("//input[@id='cb_205']");
	By Alt_futuretoMaintainCoverage = By.xpath("//input[@id='cb_204']");

	// ALT Risk tolerance about death benefit:
	By Alt_SpcdNoofYearsonly = By.xpath("//input[@id='cb_202']");
	By Alt_DeathBenefitforlife = By.xpath("//input[@id='cb_201']");
	By Alt_Nonguaranteeeddividends = By.xpath("//input[@id='cb_200']");
	By Alt_forPremiumflexibility = By.xpath("//input[@id='cb_199']");

	// Additional Risk tolerance about premiums:
	By RiskToleranceAddition = By.xpath("//strong[contains(text(),'Risk Tolerance for the Additional Product')]");
	By Add_NoPremiumFlexibility = By.xpath("//input[@id='cb_222']");
	By Add_PayPremiumatSomePoint = By.xpath("//input[@id='cb_221']");
	By Add_Higherpremiumsinthefuture = By.xpath("//input[@id='cb_220']");
	By Add_futuretoMaintainCoverage = By.xpath("//input[@id='cb_219']");

	// Additional Risk tolerance about death benefit:
	By Add_SpcdNoofYearsonly = By.xpath("//input[@id='cb_217']");
	By Add_DeathBenefitforlife = By.xpath("//input[@id='cb_216']");
	By Add_Nonguaranteeeddividends = By.xpath("//input[@id='cb_215']");
	By Add_forPremiumflexibility = By.xpath("//input[@id='cb_214']");

	public void suitabilitycontinues(String state, String T20million, String Proposedannualpremium, String Faceamount,String UnsheduledALIR,
			String amountofUnSheduled,String Exchange1035_RD,String exchange1035Amount,String ReplaceByPolicy, String AnnualPrem_Cost, String Totalfaceamount, String TotalannualIncome,
			String RiskTolerance, String RiskToleranceTwo,String LTCRiskTolerance) {
		if (state.equalsIgnoreCase("New York")) {
			selectRadioYesorNo(T20million_Yes, T20million_No, T20million);
			$(ProposedAnnualPremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Proposedannualpremium);
			$(FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Faceamount);
			
			if($(UnsheduledALIR_Yes).isDisplayed()){
				selectRadioYesorNo(UnsheduledALIR_Yes, UnsheduledALIR_No, UnsheduledALIR);
				if(UnsheduledALIR.equalsIgnoreCase("Yes")){
					$(AmountofUnSheduled).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(amountofUnSheduled);
					selectRadioYesorNo(Exchange1035_Yes, Exchange1035_No, Exchange1035_RD);
					if(Exchange1035_RD.equalsIgnoreCase("Yes")){
						$(Exchange1035Amount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(exchange1035Amount);
					}
				}
			}	
			selectRadioYesorNo(ReplaceByPolicy_Yes, ReplaceByPolicy_No, ReplaceByPolicy);
			if (ReplaceByPolicy.equalsIgnoreCase("Yes")) {
				$(TotalFaceamount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Totalfaceamount);
				$(TotalAnnualIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(TotalannualIncome);
			}
			$(AnnualPremium_Cost).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AnnualPrem_Cost);

			switch (RiskTolerance) {
			case "period with no premium flexibility":
				$(NoPremiumFlexibility).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "premiums at some point in the future":
				$(somepointinfuture).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "higher premiums in the future":
				$(premiumsinthefuture).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Desires low premium payments":
				$(maintiancoverage).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				break;
			default:
				System.out.println("Not able to select the option");
				break;

			}
			switch (RiskToleranceTwo) {
			case "specified number of years only":
				$(numberofyears).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "death benefit for life":
				$(DeathBenefitforLife).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "non-guaranteed dividends":
				$(non_guaranteedDividends).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "no guarantees for premium flexibility":
				$(premiumflexibility).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				break;

			default:
				System.out.println("Not able to select the option");
				break;

			}
			
			if($(LTCbenefitnotuse).isDisplayed()){
				if(LTCRiskTolerance.equalsIgnoreCase("LTC benefit not used")){
					$(LTCbenefitnotuse).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
				else{
					$(LTCCashValueaccumulation).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
			}
		
		}
	}
	
	public void suitabiltycont_coverage_costinfo(String Alt_propsedAnnualPremium,String Alt_faceamount,String Alt_UnsheduledALIR,
			String Alt_amountofUnSheduled,String Alt_Exchange1035_RD,String Alt_exchange1035Amount,String Alt_ReplacedByPolicy,String Alt_TotalFaceAmount,
			String Alt_TotalAnnualPremium,String Alt_AnnuaLPremiumCost,String Add_propsedAnnualPremium,String Add_faceamount,String Add_UnsheduledALIR,
			String Add_amountofUnSheduled,String Add_Exchange1035_RD,String Add_exchange1035Amount,String Add_ReplacedByPolicy,String Add_Totalfaceamount,
			String Add_totalannualPremium,String Add_annuaLpremiumCost){
		
		
		if($(AlternateProduct).isDisplayed()){
			$(AnnualPremium_Proposed).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_propsedAnnualPremium);
			$(Alt_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_faceamount);
			
			selectRadioYesorNo(ReplacedByPolicy_Yes, ReplacedByPolicy_No, Alt_ReplacedByPolicy);
			
			if($(Alt_UnsheduledALIR_Yes).isDisplayed()){
				selectRadioYesorNo(Alt_UnsheduledALIR_Yes, Alt_UnsheduledALIR_No, Alt_UnsheduledALIR);
				if(Alt_UnsheduledALIR.equalsIgnoreCase("Yes")){
					$(Alt_AmountofUnSheduled).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_amountofUnSheduled);
					selectRadioYesorNo(Alt_Exchange1035_Yes, Alt_Exchange1035_No, Alt_Exchange1035_RD);
					if(Alt_Exchange1035_RD.equalsIgnoreCase("Yes")){
						$(Alt_Exchange1035Amount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_exchange1035Amount);
					}
				}
			}	
			
			
			if(Alt_ReplacedByPolicy.equalsIgnoreCase("Yes")){
				$(TotalFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_TotalFaceAmount);
				$(TotalAnnualPremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_TotalAnnualPremium);
			}
			$(AnnuaLPremiumCost).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_AnnuaLPremiumCost);
		}
		
		if($(AdditionalProduct).isDisplayed()){
			$(Add_AnnualPremium_Proposed).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_propsedAnnualPremium);
			$(Add_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_faceamount);
			if($(Add_UnsheduledALIR_Yes).isDisplayed()){
				selectRadioYesorNo(Add_UnsheduledALIR_Yes, Add_UnsheduledALIR_No, Add_UnsheduledALIR);
				if(Add_UnsheduledALIR.equalsIgnoreCase("Yes")){
					$(Add_AmountofUnSheduled).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_amountofUnSheduled);
					selectRadioYesorNo(Add_Exchange1035_Yes, Add_Exchange1035_No, Add_Exchange1035_RD);
					if(Add_Exchange1035_RD.equalsIgnoreCase("Yes")){
						$(Add_Exchange1035Amount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_exchange1035Amount);
					}
				}
			}	
			selectRadioYesorNo(Add_ReplacedByPolicy_Yes, Add_ReplacedByPolicy_No, Add_ReplacedByPolicy);
			if(Add_ReplacedByPolicy.equalsIgnoreCase("Yes")){
				$(Add_TotalFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_Totalfaceamount);
				$(Add_TotalAnnualPremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_totalannualPremium);
			}
			$(Add_AnnuaLPremiumCost).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_annuaLpremiumCost);
		}
		
	}
	public void RiskTolerance_Alt_Add(String state,String ALt_RiskTolerance,String Alt_RiskToleranceAboutDeath,String Add_RiskTolerance,String Add_RiskToleranceAboutDeath){
		if (state.equalsIgnoreCase("New York")) {
		if($(RiskToleranceAlternate).isDisplayed()){
			switch (ALt_RiskTolerance) {
			case "Alternate period with no premium flexibility":
				$(Alt_NoPremiumFlexibility).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Alternate premiums at some point in the future":
				$(ALt_PayPremiumatSomePoint).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Alternate higher premiums in the future":
				$(Alt_Higherpremiumsinthefuture).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Alternate Desires low premium payments":
				$(Alt_futuretoMaintainCoverage).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				break;
			default:
				System.out.println("Not able to select the option");
				break;

			}
			switch (Alt_RiskToleranceAboutDeath) {
			case "Alternate specified number of years only":
				$(Alt_SpcdNoofYearsonly).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Alternate death benefit for life":
				$(Alt_DeathBenefitforlife).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Alternate non-guaranteed dividends":
				$(Alt_Nonguaranteeeddividends).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Alternate no guarantees for premium flexibility":
				$(Alt_forPremiumflexibility).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				break;

			default:
				System.out.println("Not able to select the option");
				break;

			}
			
		}
		
		if($(RiskToleranceAddition).isDisplayed()){
			switch (Add_RiskTolerance) {
			case "Additional period with no premium flexibility":
				$(Add_NoPremiumFlexibility).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Additional premiums at some point in the future":
				$(Add_PayPremiumatSomePoint).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Additional higher premiums in the future":
				$(Add_Higherpremiumsinthefuture).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Additional Desires low premium payments":
				$(Add_futuretoMaintainCoverage).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				break;
			default:
				System.out.println("Not able to select the option");
				break;

			}
			switch (Add_RiskToleranceAboutDeath) {
			case "Additional specified number of years only":
				$(Add_SpcdNoofYearsonly).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Additional death benefit for life":
				$(Add_DeathBenefitforlife).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Additional non-guaranteed dividends":
				$(Add_Nonguaranteeeddividends).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Additional no guarantees for premium flexibility":
				$(Add_forPremiumflexibility).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				break;

			default:
				System.out.println("Not able to select the option");
				break;

			}

			
		}
		
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
	}
}
