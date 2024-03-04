package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class CConeProductWhole extends GlobalCap {

	By AutomaticPremiumLoan_Yes = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='Yes' and @id='lbl_434_1']");
	By AutomaticPremiumLoan_No = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='No' and @id='lbl_434_2']");
	By CCsAnuualIncome = By.xpath("//label[contains(text(),'Annual Premium')]//following-sibling::input[@alt_id='WL_TotalAnnualPremium']");
	By waiverofPremium_Yes = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='Yes' and @id='lbl_426_1']");
	By waiverofPremium_No = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='No' and @id='lbl_426_2']");
	By LifePolicySinglePremium = By
			.xpath("//label[contains(text(),'Life Policy Single Premium')]//following::input[@id='flda_398']");
	By LTCIRiderSinglePremium = By
			.xpath("//label[contains(text(),'LTCI Rider Single Premium')]//following::input[@id='flda_400']");

	By InitialMaximumLifetimeRiderBenefit = By
			.xpath("//label[contains(text(),'Lifetime Rider Benefit')]//following::input[@id='flda_397']");
	By InitialMaximumMonthlyBenefit = By
			.xpath("//label[contains(text(),'Monthly Benefit')]//following::input[@id='flda_404']");

	By DividendOption = By.xpath("//label[contains(text(),'Dividend Option')]//following::select[@id='lb_395']");
	By DividendOption_CCS = By.xpath("//select[@id='lb_430']");

	By MEC_Yes = By.xpath("//label[contains(text(),'MEC')]//following::span[@id='lbl_393_1']");
	By MEC_No = By.xpath("//label[contains(text(),'MEC')]//following::span[@id='lbl_393_2']");	
	By Alternate_AdditionalPolicy = By
			.xpath("//label[contains(text(),'alternate/additional policy')]//following::select[@id='lb_77']");
	By Alternateproduct = By.xpath("//select[@alt_id='ProductNameAlt']");
	By Additionalproduct = By.xpath("//select[@alt_id='ProductNameAdd']");
	By Paymentinfoscreen = By.xpath("//button[text()='Payment Information']");
	//NY
	By NYAcceleratedDeathBenefit = By.xpath("//label[contains(text(),'Accelerated Death Benefit')]//following-sibling::input[@alt_id='WL_ADBforLTCRider']");
	By NYExtendedLTCBenefits = By.xpath("//label[contains(text(),'Extended LTC Benefits Rider')]//following::input[@alt_id='WL_ExtendedLTCRider']");
	By inflationPRotection_Yes = By.xpath("//input[@alt_id='WL_SPIPO_1']");
	By inflationPRotection_No = By.xpath("//input[@alt_id='WL_SPIPO_2']");
	By ALt_Ltc=By.xpath("//a[contains(@id,'LTCWorksheet2019Alt')]");
	By Add_Ltc=By.xpath("//a[contains(@id,'LTCWorksheet2019Add')]");
	By ProdutWLLabel=By.xpath("//a[contains(@id,'MutualScreens_ProductWL')]");
	By Next = By.xpath("//button[contains(text(),'Next')]");

	
	//alternate and Additonal Prodcuts
	By LTC_Alt=By.xpath("//a[contains(@id,'LTCWorksheet2019Alt')]");
	
	public void wholelife(String state,String CCsAutomaticPremiumLoan, String Product, String CCsAnnualPremium,
			String CCSWaiverofPremium, String PolicySinglePremium, String RiderSinglePremium,
			String LifetimeRiderBenefit, String MonthlyBenefit, String dividendoption, String MEC,String inflationProtection,
			String AlternateAdditionalPolicy,String AlternateAdditionalPRoductTpe) {

		if (Product.equalsIgnoreCase("CareChoice Select")) {
			if (!state.equalsIgnoreCase("New York")) {
				if($(AutomaticPremiumLoan_Yes).isDisplayed()){
					selectRadioYesorNo(AutomaticPremiumLoan_Yes, AutomaticPremiumLoan_No, CCsAutomaticPremiumLoan);	
				}
				
				$(DividendOption_CCS).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(dividendoption);
				$(Paymentinfoscreen).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(InitialMaximumLifetimeRiderBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LifetimeRiderBenefit);
				$(InitialMaximumMonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MonthlyBenefit);
				$(CCsAnuualIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CCsAnnualPremium);
				selectRadioYesorNo(MEC_Yes, MEC_No, MEC);
				selectRadioYesorNo(waiverofPremium_Yes, waiverofPremium_No, CCSWaiverofPremium);
				$(Alternate_AdditionalPolicy).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AlternateAdditionalPolicy);
				if(AlternateAdditionalPolicy.equalsIgnoreCase("Alternate")){
					$(Alternateproduct).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AlternateAdditionalPRoductTpe);
				}else if(AlternateAdditionalPolicy.equalsIgnoreCase("Additional")){
					$(Additionalproduct).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AlternateAdditionalPRoductTpe);
				}
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
		}
		else if (Product.equalsIgnoreCase("CareChoice One")) {
			if (!state.equalsIgnoreCase("New York")) {
				$(LifePolicySinglePremium).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(PolicySinglePremium);
				$(LTCIRiderSinglePremium).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(RiderSinglePremium);
				$(InitialMaximumLifetimeRiderBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(LifetimeRiderBenefit);
				$(InitialMaximumMonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(MonthlyBenefit);

				$(DividendOption).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionContainingText(dividendoption);
				selectRadioYesorNo(MEC_Yes, MEC_No, MEC);
				if($(inflationPRotection_Yes).isDisplayed()){
					selectRadioYesorNo(inflationPRotection_Yes, inflationPRotection_No, inflationProtection);
				}
				if($(Alternate_AdditionalPolicy).isDisplayed()){
				$(Alternate_AdditionalPolicy).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AlternateAdditionalPolicy);
				}
				// Modified
				if(AlternateAdditionalPolicy.equalsIgnoreCase("Alternate")){
					if($(Alternateproduct).isDisplayed()){
						$(Alternateproduct).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AlternateAdditionalPRoductTpe);
					}
					
				}else if(AlternateAdditionalPolicy.equalsIgnoreCase("Additional")){
					if($(Additionalproduct).isDisplayed()){
						$(Additionalproduct).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AlternateAdditionalPRoductTpe);
					}
					
				}
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
		}
	}
	
	public void Alternate_additonalPRoduct(String state, String PayYourPremium, String details,  
			String State,String CA_PartnerDiesFirst,String CA_whatIsYourHouseholdannual,String CA_NextTenYears,String CA_ContinueToPayPremium, String PartnerDiesFirst,
			String whatIsYourHouseholdannual,String NextTenYears, String ContinueToPayPremium, String inflationProtection, String EliminationPeriod, String DailyBenefitAmount,String otherDetails,
			String NotCountingHome, String NetWorth, String DidyouExpectValue, String AnswerstotheQuestions,String ExplainedProposed, String MyProducerHasAdvised, String ChoosenottoComplete){
		
		LTCPersonalWorksheet LTC=new LTCPersonalWorksheet();
		if($(LTC_Alt).isDisplayed() || $(LTC_Alt).isDisplayed()){
			$(LTC_Alt).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			LTC.LTCdetails(state, PayYourPremium, details);
			LTC.LTC_detaisl_Two(State, CA_PartnerDiesFirst, CA_whatIsYourHouseholdannual, CA_NextTenYears, CA_ContinueToPayPremium, PartnerDiesFirst, whatIsYourHouseholdannual, NextTenYears, ContinueToPayPremium, inflationProtection, EliminationPeriod,DailyBenefitAmount,otherDetails, NotCountingHome, NetWorth, DidyouExpectValue, AnswerstotheQuestions, ExplainedProposed, MyProducerHasAdvised, ChoosenottoComplete);
		}
		
	}
	public void ALternateLTC(String state, String PayYourPremium, String details,String CA_PartnerDiesFirst,String CA_whatIsYourHouseholdannual,String CA_NextTenYears,
			String CA_ContinueToPayPremium, String PartnerDiesFirst,String whatIsYourHouseholdannual,String NextTenYears, String ContinueToPayPremium, String inflationProtection, String EliminationPeriod,String DailyBenefitAmount,String otherDetails,
			String NotCountingHome, String NetWorth, String DidyouExpectValue, String AnswerstotheQuestions,String ExplainedProposed, String MyProducerHasAdvised, String ChoosenottoComplete){
		LTCPersonalWorksheet AltLtc=new LTCPersonalWorksheet();
		if($(ALt_Ltc).isDisplayed()){
			$(ALt_Ltc).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(2000);
			AltLtc.LTCdetails(state, PayYourPremium, details);
			AltLtc.LTC_detaisl_Two(state, CA_PartnerDiesFirst, CA_whatIsYourHouseholdannual, CA_NextTenYears, CA_ContinueToPayPremium, PartnerDiesFirst,
					whatIsYourHouseholdannual, NextTenYears, ContinueToPayPremium, inflationProtection, EliminationPeriod,DailyBenefitAmount,otherDetails, NotCountingHome, NetWorth,
					DidyouExpectValue, AnswerstotheQuestions, ExplainedProposed, MyProducerHasAdvised, ChoosenottoComplete);
			$(ProdutWLLabel).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			 
		}
		
	}
	
	public void AdditionalLTC(String state, String PayYourPremium, String details,String CA_PartnerDiesFirst,String CA_whatIsYourHouseholdannual,String CA_NextTenYears,
			String CA_ContinueToPayPremium, String PartnerDiesFirst,String whatIsYourHouseholdannual,String NextTenYears, String ContinueToPayPremium, String inflationProtection, String EliminationPeriod,String DailyBenefitAmount,String otherDetails,
			String NotCountingHome, String NetWorth, String DidyouExpectValue, String AnswerstotheQuestions,String ExplainedProposed, String MyProducerHasAdvised, String ChoosenottoComplete){
		LTCPersonalWorksheet AltLtc=new LTCPersonalWorksheet();
		if($(Add_Ltc).isDisplayed()){
			$(Add_Ltc).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(2000);
			AltLtc.LTCdetails(state, PayYourPremium, details);
			AltLtc.LTC_detaisl_Two(state, CA_PartnerDiesFirst, CA_whatIsYourHouseholdannual, CA_NextTenYears, CA_ContinueToPayPremium, PartnerDiesFirst,
					whatIsYourHouseholdannual, NextTenYears, ContinueToPayPremium, inflationProtection, EliminationPeriod, DailyBenefitAmount,otherDetails,NotCountingHome, NetWorth,
					DidyouExpectValue, AnswerstotheQuestions, ExplainedProposed, MyProducerHasAdvised, ChoosenottoComplete);
			$(ProdutWLLabel).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			 
		}
		
	}

}
