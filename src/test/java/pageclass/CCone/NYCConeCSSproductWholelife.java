package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class NYCConeCSSproductWholelife extends GlobalCap {
	By AutomaticPremiumLoan_Yes = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='Yes' and @id='lbl_434_1']");
	By AutomaticPremiumLoan_No = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='No' and @id='lbl_434_2']");
	By CCsAnuualIncome = By.xpath("//label[contains(text(),'Annual Premium')]//following-sibling::input[@alt_id='WL_TotalAnnualPremium']");
	By waiverofPremium_Yes = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='Yes' and @id='lbl_426_1']");
	By waiverofPremium_No = By.xpath("//label[contains(text(),'Premium Loan')]//following::span[text()='No' and @id='lbl_426_2']");
	By LTCIRiderSinglePremium = By
			.xpath("//label[contains(text(),'LTCI Rider Single Premium')]//following::input[@id='flda_400']");	
	By DividendOption_CCS = By.xpath("//label[contains(text(),'Dividend Option')]//following::select[@id='lb_430']");
	By Alternate_AdditionalPolicy = By
			.xpath("//label[contains(text(),'alternate/additional policy')]//following::select[@id='lb_77']");

	//NY
	By NYLifePolicySinglePremium = By.xpath("//label[contains(text(),'Life Policy Single Premium')]//following::input[@id='flda_398']");
	By NYAcceleratedDeathBenefit = By.xpath("//label[contains(text(),'Accelerated Death Benefit')]//following-sibling::input[@alt_id='WL_ADBforLTCRider']");
	By NYExtendedLTCBenefits = By.xpath("//label[contains(text(),'Extended LTC Benefits Rider')]//following::input[@alt_id='WL_ExtendedLTCRider']");
	By NYInitialMaximumLifetimeRiderBenefit = By.xpath("//label[contains(text(),'LTC Benefit')]//following::input[@id='flda_397']");
	By NYInitialMaximumMonthlyBenefit = By.xpath("//label[contains(text(),'Monthly Benefit')]//following::input[@id='flda_404']");
	By NYDividendOption = By.xpath("//label[contains(text(),'Dividend Option')]//following::select[@id='lb_395']");
	By NYMEC_Yes = By.xpath("//label[contains(text(),'MEC')]//following::span[@id='lbl_393_1']");
	By NYMEC_No = By.xpath("//label[contains(text(),'MEC')]//following::span[@id='lbl_393_2']");
	By NYinflationPRotection_Yes = By.xpath("//input[@alt_id='WL_SPIPO_1']");
	By NYinflationPRotection_No = By.xpath("//input[@alt_id='WL_SPIPO_2']");
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	public void CConePRoductwholelife(String state, String Product, String PolicySinglePremium,
			String nyAcceleratedDeathBenefit, String nyExtendedLTCBenefits,String NYLifetimeRiderBenefit, String NYMonthlyBenefit,
			 String NYdividendoption, String MEC,String NYinflationPRotection) {
		if (Product.equalsIgnoreCase("CareChoice One")) {
			if (state.equalsIgnoreCase("New York")) {
				$(NYLifePolicySinglePremium).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(PolicySinglePremium);
				$(NYAcceleratedDeathBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(nyAcceleratedDeathBenefit);

				$(NYExtendedLTCBenefits).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(nyExtendedLTCBenefits);
				$(NYInitialMaximumLifetimeRiderBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(NYLifetimeRiderBenefit);
				$(NYInitialMaximumMonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(NYMonthlyBenefit);

				$(NYDividendOption).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionContainingText(NYdividendoption);
				selectRadioYesorNo(NYMEC_Yes, NYMEC_No, MEC);
				selectRadioYesorNo(NYinflationPRotection_Yes, NYinflationPRotection_No, NYinflationPRotection);
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
		}
		
	}
}
