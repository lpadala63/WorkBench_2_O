package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class LTCWorksheet_ALt extends GlobalCap{
	By LTC_Alt=By.xpath("//a[contains(@id,'MassMutualScreens_LTCWorksheet2019Alt')]");
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
	By CaseSetup  = By.xpath("//button[text()='Case Setup']");
	By Next  = By.xpath("//button[contains(text(),'Next')]");
	By LockPolicy = By.xpath("//button[contains(@alt_id,'btnLockAndGo')]");
	By Lockandunlocklabel= By.xpath("//a[contains(@id,'LockAndUnlock')]");
	By LAU_NEXT = By.xpath("//button[contains(text(),'Next')]");
	public void ResourcesPremiums(String PayYourPremium, String details, String PartnerDiesFirst,
			String whatIsYourHouseholdannual, String NextTenYears, String ContinueToPayPremium,
			String inflationProtection, String EliminationPeriod, String NotCountingHome, String NetWorth,
			String DidyouExpectValue, String AnswerstotheQuestions, String ExplainedProposed,
			String MyProducerHasAdvised, String ChoosenottoComplete) {
		if ($(LTC_Alt).isDisplayed()) {
			$(LTC_Alt).click();
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
			$(partnerDiesFirst).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(PartnerDiesFirst);
			$(WhatIsYourHouseholdAnnual).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(whatIsYourHouseholdannual);
			$(nextTenYears).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(NextTenYears);
			$(continueToPayThePremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(ContinueToPayPremium);
			selectRadioYesorNo(inflationProtection_Yes, inflationProtection_No, inflationProtection);
			$(eliminationPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(EliminationPeriod);
			$(NotCountingYourHome).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(NotCountingHome);
			$(liquidNetWorth).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NetWorth);
			$(DoyouExpectValue).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DidyouExpectValue);
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
			$(Lockandunlocklabel).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(4000);
			$(LockPolicy).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(LAU_NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}
}
