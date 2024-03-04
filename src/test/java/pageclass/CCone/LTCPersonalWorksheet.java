package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class LTCPersonalWorksheet extends GlobalCap {

	By Current_income_employment = By.xpath("//span[text()='Current income from employment']");
	By Current_income_investments = By.xpath("//span[text()='Current income from investments']");
	By Other_current_income = By.xpath("//span[text()='Other current income']");
	By Savings = By.xpath("//span[text()='Savings']");
	By Sell_investments = By.xpath("//span[text()='Sell investments']");
	By Sell_other_assets = By.xpath("//span[text()='Sell other assets' and @id='lbl_70']");
	By Money_from_my_family = By.xpath("//span[text()='Money from my family']");
	By Other = By.xpath("//span[text()='Other' and @id='lbl_18']");
	By Details = By.xpath("//input[@id='flda_47' or @name='flda_47']");
	
	By partnerDiesFirst = By.xpath("//select[@id='lb_49' or @name='lb_49']");
	By WhatIsYourHouseholdAnnual = By.xpath("//select[@id='lb_16' or @name='lb_16']");
	By nextTenYears = By.xpath("//select[@id='lb_15' or @name='lb_15']");
	By continueToPayThePremium = By.xpath("//select[@id='lb_50' or @name='lb_50']");
	By inflationProtection_Yes = By.xpath("//input[@id='rdo_13_1' or @name='rdo_13_1']");
	By inflationProtection_No = By.xpath("//input[@id='rdo_13_2' or @name='rdo_13_2']");
	By eliminationPeriod = By.xpath("//select[@id='lb_9' or @name='lb_9']");
	By NotCountingYourHome = By.xpath("//select[@id='lb_26' or @name='lb_26']");
	By liquidNetWorth = By.xpath("//input[@id='flda_42' or @name='flda_42']");
	By DoyouExpectValue = By.xpath("//select[@id='lb_27' or @name='lb_27']");
	By AnswersTotheQuestions = By.xpath("//input[@id='cb_33' or @name='cb_33']");
	By explainedProposed  = By.xpath("//input[@id='cb_80' or @name='cb_80']");
	By MyproducerhasAdvised  = By.xpath("//input[@id='cb_31' or @name='cb_31']");
	
	By choosenottoComplete  = By.xpath("//input[@id='cb_41' or @name='cb_41']");
	
	By FromMyIncome  = By.xpath("//input[@id='cb_40']");
	By FromSavings  = By.xpath("//input[@id='cb_39']");
	By FromInvestments  = By.xpath("//input[@id='cb_57']");
	By SellOtherAssets  = By.xpath("//input[@id='cb_58']");
	By MoneyfromMyFamily  = By.xpath("//input[@id='cb_60']");
	By Otherr  = By.xpath("//input[@id='cb_59']");
	By OtherDetails  = By.xpath("//input[@id='flda_62']");
	By headingmonthybenefit  = By.xpath("//Strong[contains(text(),'your daily benefit amount?')]");
	By CaseSetup  = By.xpath("//button[text()='Case Setup']");
	By Next  = By.xpath("//button[contains(text(),'Next')]");
	

	public void LTCdetails(String state, String PayYourPremium, String details) {
		if (!state.contentEquals("New York")) {
			if (PayYourPremium.equalsIgnoreCase("CurrentIncomeEmployment")) {
				$(Current_income_employment).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (PayYourPremium.equalsIgnoreCase("CurrentIncomeInvestments")) {
				$(Current_income_investments).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (PayYourPremium.equalsIgnoreCase("OtherCurrentIncome")) {
				$(Other_current_income).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (PayYourPremium.equalsIgnoreCase("Saving")) {
				$(Savings).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (PayYourPremium.equalsIgnoreCase("SellInvestments")) {
				$(Sell_investments).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (PayYourPremium.equalsIgnoreCase("SellOtherAsset")) {
				$(Sell_other_assets).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (PayYourPremium.equalsIgnoreCase("MoneyFromMyFamily")) {
				$(Money_from_my_family).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (PayYourPremium.equalsIgnoreCase("other")) {
				$(Other).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(Other).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(details);
			}

		}

	}
	
	public void LTC_detaisl_Two(String state,String CA_PartnerDiesFirst,String CA_whatIsYourHouseholdannual,String CA_NextTenYears,String CA_ContinueToPayPremium, String PartnerDiesFirst,
			String whatIsYourHouseholdannual,String NextTenYears, String ContinueToPayPremium, String inflationProtection, String EliminationPeriod, String DailyBenefitAmount,String otherDetails,
			String NotCountingHome, String NetWorth, String DidyouExpectValue, String AnswerstotheQuestions,String ExplainedProposed, String MyProducerHasAdvised, String ChoosenottoComplete) {
		
		if (state.equalsIgnoreCase("California") || state.equalsIgnoreCase("Montana")) {
			$(partnerDiesFirst).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(CA_PartnerDiesFirst);
			$(WhatIsYourHouseholdAnnual).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(CA_whatIsYourHouseholdannual);
			$(nextTenYears).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(CA_NextTenYears);
			$(continueToPayThePremium).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(CA_ContinueToPayPremium);
			selectRadioYesorNo(inflationProtection_Yes, inflationProtection_No, inflationProtection);
		
			GlobalCap.sleep(1000);
			
			if($(headingmonthybenefit).isDisplayed()){
				if(DailyBenefitAmount.equalsIgnoreCase("From my income")){
					$(FromMyIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("From savings")){
					$(FromSavings).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("From investments")){
					$(FromInvestments).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("Sell other assets")){
					$(SellOtherAssets).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("Money from my family")){
					$(MoneyfromMyFamily).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("Other")){
					$(Otherr).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					$(OtherDetails).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(otherDetails);
				}
			}
			
			
			
			$(eliminationPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(EliminationPeriod);
			$(NotCountingYourHome).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(NotCountingHome);
			$(liquidNetWorth).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NetWorth);
			$(DoyouExpectValue).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(DidyouExpectValue);
			if (AnswerstotheQuestions.equalsIgnoreCase("Yes")) {
				$(AnswersTotheQuestions).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if (ExplainedProposed.equalsIgnoreCase("Yes")) {
				$(explainedProposed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if (MyProducerHasAdvised.equalsIgnoreCase("Yes")) {
				$(MyproducerhasAdvised).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if (ChoosenottoComplete.equalsIgnoreCase("Yes")) {
				$(choosenottoComplete).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			$(CaseSetup).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(2000);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if (!state.equalsIgnoreCase("New York") && !state.equalsIgnoreCase("California") && !state.equalsIgnoreCase("Montana") ) {
			
			$(partnerDiesFirst).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(PartnerDiesFirst);
			$(WhatIsYourHouseholdAnnual).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(whatIsYourHouseholdannual);
			$(nextTenYears).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(NextTenYears);
			$(continueToPayThePremium).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(ContinueToPayPremium);
			
			selectRadioYesorNo(inflationProtection_Yes, inflationProtection_No, inflationProtection);
			
			
			if($(headingmonthybenefit).isDisplayed()){
				if(DailyBenefitAmount.equalsIgnoreCase("From my income")){
					$(FromMyIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("From savings")){
					$(FromSavings).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("From investments")){
					$(FromInvestments).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("Sell other assets")){
					$(SellOtherAssets).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("Money from my family ")){
					$(MoneyfromMyFamily).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}else if(DailyBenefitAmount.equalsIgnoreCase("Other")){
					$(Other).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					$(OtherDetails).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(otherDetails);
				}
			}
			
			
			$(eliminationPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(EliminationPeriod);
			$(NotCountingYourHome).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(NotCountingHome);
			$(liquidNetWorth).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NetWorth);
			$(DoyouExpectValue).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(DidyouExpectValue);
			if (AnswerstotheQuestions.equalsIgnoreCase("Yes")) {
				$(AnswersTotheQuestions).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if (ExplainedProposed.equalsIgnoreCase("Yes")) {
				$(explainedProposed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if (MyProducerHasAdvised.equalsIgnoreCase("Yes")) {
				$(MyproducerhasAdvised).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if (ChoosenottoComplete.equalsIgnoreCase("Yes")) {
				$(choosenottoComplete).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}

		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		}
		
		
		
		
	}

}
