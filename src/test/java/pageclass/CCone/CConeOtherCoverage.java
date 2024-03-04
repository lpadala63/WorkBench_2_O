package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class CConeOtherCoverage extends GlobalCap {

	By AZ_Replacementform_Yss = By
			.xpath("//label[contains(text(),'Replacement Form')]//following::input[@id='rdo_4_1']");
	By AZ_Replacementform_No = By
			.xpath("//label[contains(text(),'Replacement Form')]//following::input[@id='rdo_4_2']");

	/*By Az_AnotherLTCInsPolicy_yes = By.xpath(
			"//label[contains(text(),'another long-term care insurance policy')]//following::input[@alt_id='OTHINS_HasExistingLTCYesNo_1']");
	By Az_AnotherLTCInsPolicy_No = By.xpath(
			"//label[contains(text(),'another long-term care insurance policy')]//following::input[@alt_id='OTHINS_HasExistingLTCYesNo_2']");*/
	By Az_AnotherLTCInsPolicy_yes = By.xpath(
			"//input[@alt_id='OTHINS_HasExistingLTCYesNo_1']");
	By Az_AnotherLTCInsPolicy_No = By.xpath(
			"//input[@alt_id='OTHINS_HasExistingLTCYesNo_2']");

	
	By AZ_completedbyProducer_yes = By.xpath(
			"//label[contains(text(),'completed by the Producer')]//following::input[@alt_id='OTHINS_AgentReplace_1']");
	By AZ_completedbyProducer_No = By.xpath(
			"//label[contains(text(),'completed by the Producer')]//following::input[@alt_id='OTHINS_AgentReplace_2']");

	By AZ_PolicesThatareSold = By.xpath(
			"//label[contains(text(),'policies that you have sold')]//following::input[@alt_id='OTHINS_AgentOtherPolicies']");
	By AZ_Policesarestillininforce = By.xpath(
			"//label[contains(text(),'policies listed above are still in force')]//following::input[@alt_id='OTHINS_AgentInforce']");
	By AZ_Soldinpast5years = By.xpath(
			"//label[contains(text(),'sold in the past 5 years')]//following::input[@alt_id='OTHINS_AgentTerminated']");

	By OTHINS_HasExisting_Yes = By.xpath("//input[@id='rdo_4_1']");
	By OTHINS_HasExisting_No = By.xpath("//input[@id='rdo_4_2']");
	By OTHINS_ApplicationPending_Yes = By.xpath("//input[@alt_id='OTHINS_ApplicationPending_1']");
	By OTHINS_ApplicationPending_No = By.xpath("//input[@alt_id='OTHINS_ApplicationPending_2']");
	By OTHINS_HasExistingLTC_Yes = By.xpath(
			"//label[contains(text(),'another long term care policy')]//following::input[@alt_id='OTHINS_HasExistingLTCYesNo_1']");
	By OTHINS_HasExistingLTC_No = By.xpath(
			"//label[contains(text(),'another long term care policy')]//following::input[@alt_id='OTHINS_HasExistingLTCYesNo_2']");
	By OTHINS_HasTerminatedLTC_Yes = By.xpath(
			"//label[contains(text(),' force or that has terminated')]//following::input[@alt_id='OTHINS_HasTerminatedLTCYesNo_1']");/// ny
	By OTHINS_HasTerminatedLTC_No = By.xpath(
			"//label[contains(text(),' force or that has terminated')]//following::input[@alt_id='OTHINS_HasTerminatedLTCYesNo_2']");
	By OTHINS_ReplaceLTC_Yes = By.xpath("//input[@alt_id='OTHINS_ReplaceLTCYesNo_1']");// ny
	By OTHINS_ReplaceLTC_No = By.xpath("//input[@alt_id='OTHINS_ReplaceLTCYesNo_2']");

	By OTHINS_Replace_Yes = By.xpath(
			"//label[contains(text(),'term or coverage benefits')]//following::input[@alt_id='OTHINS_ReplaceYesNo_1']");// ny
	By OTHINS_Replace_No = By.xpath(
			"//label[contains(text(),'term or coverage benefits')]//following::input[@alt_id='OTHINS_ReplaceYesNo_2']");
	By OTHINS_TotalInforceAmount = By.xpath("//input[@alt_id='OTHINS_TotalInforceAmount']");
	By OTHINS_TotalPendingAmount = By.xpath("//input[@alt_id='OTHINS_TotalPendingAmount']");
	By OTHINS_TotalPlacedAmount = By.xpath(
			"//label[contains(text(),'will be placed in all companies')]//following::input[@alt_id='OTHINS_TotalPlacedAmount']");// ny
	
	
	By NEXT = By.xpath("//button[contains(text(),'Next')]");

	public void OtherCoverage(String Az_Replacement, String Az_AnotherLTCInsPolicy, String OTHINS_HasExisting,
			String OTHINS_ApplicationPending, String OTHINS_HasExistingLTC, String OTHINS_HasTerminatedLTC,
			String OTHINS_ReplaceLTC, String OTHINS_Replace, String TotalInforceAmount, String TotalPendingAmount,
			String TotalPlacedAmount, String AZ_completedbyProducer, String Az_PolicesThatareSold,
			String Az_Policesarestillininforce, String Az_Soldinpast5years) {
		if ($(AZ_Replacementform_Yss).isDisplayed()) {
			selectRadioYesorNo(AZ_Replacementform_Yss, AZ_Replacementform_No, Az_Replacement);
		}
		if ($(Az_AnotherLTCInsPolicy_yes).isDisplayed()) {
			selectRadioYesorNo(Az_AnotherLTCInsPolicy_yes, Az_AnotherLTCInsPolicy_No, Az_AnotherLTCInsPolicy);
		}
		if ($(OTHINS_HasExisting_Yes).isDisplayed()) {
			selectRadioYesorNo(OTHINS_HasExisting_Yes, OTHINS_HasExisting_No, OTHINS_HasExisting);
		}

		if ($(OTHINS_ApplicationPending_Yes).isDisplayed()) {
			selectRadioYesorNo(OTHINS_ApplicationPending_Yes, OTHINS_ApplicationPending_No, OTHINS_ApplicationPending);
		}
		if ($(OTHINS_HasExistingLTC_Yes).isDisplayed()) {
			selectRadioYesorNo(OTHINS_HasExistingLTC_Yes, OTHINS_HasExistingLTC_No, OTHINS_HasExistingLTC);
		}
		if ($(OTHINS_HasTerminatedLTC_Yes).isDisplayed()) {
			selectRadioYesorNo(OTHINS_HasTerminatedLTC_Yes, OTHINS_HasTerminatedLTC_No, OTHINS_HasTerminatedLTC);
		}
		if ($(OTHINS_ReplaceLTC_Yes).isDisplayed()) {
			selectRadioYesorNo(OTHINS_ReplaceLTC_Yes, OTHINS_ReplaceLTC_No, OTHINS_ReplaceLTC);
		}
		if ($(OTHINS_Replace_Yes).isDisplayed()) {
			selectRadioYesorNo(OTHINS_Replace_Yes, OTHINS_Replace_No, OTHINS_Replace);
		}
		if ($(OTHINS_TotalInforceAmount).isDisplayed()) {
			$(OTHINS_TotalInforceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(TotalInforceAmount);
		}
		if ($(OTHINS_TotalPendingAmount).isDisplayed()) {
			$(OTHINS_TotalPendingAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(TotalPendingAmount);
		}
		if ($(OTHINS_TotalPlacedAmount).isDisplayed()) {
			$(OTHINS_TotalPlacedAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(TotalPlacedAmount);
		}
		if ($(AZ_completedbyProducer_yes).isDisplayed()) {
			selectRadioYesorNo(AZ_completedbyProducer_yes, AZ_completedbyProducer_No, AZ_completedbyProducer);
		}

		if ($(AZ_PolicesThatareSold).isDisplayed()) {
			$(AZ_PolicesThatareSold).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Az_PolicesThatareSold);
		}
		if ($(AZ_Policesarestillininforce).isDisplayed()) {
			$(AZ_Policesarestillininforce).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.setValue(Az_Policesarestillininforce);
		}
		if ($(AZ_Soldinpast5years).isDisplayed()) {
			$(AZ_Soldinpast5years).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Az_Soldinpast5years);
		}
		

		$(NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
}
