package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class Alternate_AdditionalProduct extends GlobalCap {
	By FaceAmount = By.xpath("//input[@alt_id='WL_FaceAmount']");
	By CC1_LifePolicySinglePremium = By.xpath("//input[@id='flda_398' and @name='flda_398']");
	By CC1_LTCI_Rider_SinglePremium = By.xpath("//input[@id='flda_400' and @name='flda_400']");
	By AutomaticPremiumLoan_Yes = By.xpath("//input[@alt_id='WL_APL_1']");
	By AutomaticPremiumLoan_No = By.xpath("//input[@alt_id='WL_APL_2']");
	By DividentOption = By.xpath("//select[@id='lb_430' and @name='lb_430']");
	By frequency = By.xpath("//select[@id='lb_438' and @name='lb_438']");
	By CC1_DividentOption = By.xpath("//select[@id='lb_395' and @name='lb_395']");
	By Max_LifeTimeRider = By.xpath("//input[@id='flda_397' and @name='flda_397']");
	By MaxMonthlyBenefit = By.xpath("//input[@id='flda_404' and @name='flda_404']");
	By TotalAnnualPrem = By.xpath("//input[@id='flda_436' and @name='flda_436']");
	By Mec_Yes = By.xpath("//input[@id='rdo_393_1' and @name='rdo_393_1']");
	By Mec_No = By.xpath("//input[@id='rdo_393_2' and @name='rdo_393_2']");
	By WaiverOfPremiumRider_Yes = By.xpath("//input[@id='rdo_426_1' and @name='rdo_426_1']");
	By WaiverOfPremiumRider_No = By.xpath("//input[@id='rdo_426_2' and @name='rdo_426_2']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By LTCRALt = By.xpath("//a[contains(@id,'LTCWorksheet2019Alt')]");
	By AlternateHeading = By.xpath("//h1[@id='lbl_12']");

	public void CCAlternateandAdditional(String ALternate_Additional, String Alternate_Additionaltype,
			String faceamount, String CC1_PolicySinglePremium, String CC1_LTCI_SinglePremium,
			String AutomaticPremiumLoan, String CCsdividentotpion, String CCS_Frequency, String CC1dividentotpion,
			String LifeTimeRiderBenefit, String MaxiMonthlyBenefit, String TotalAnnualPremium, String MEC,
			String WaiverOfPremiumRider) {
		if (ALternate_Additional.equalsIgnoreCase("Alternate") || ALternate_Additional.equalsIgnoreCase("Additional")) {
			if (Alternate_Additionaltype.equalsIgnoreCase("CareChoice Select")) {

				if ($(AlternateHeading).isDisplayed()) {
					$(FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(faceamount);
					selectRadioYesorNo(AutomaticPremiumLoan_Yes, AutomaticPremiumLoan_No, AutomaticPremiumLoan);
					$(DividentOption).shouldBe(Visible.exist, Duration.ofSeconds(10))
							.selectOptionContainingText(CCsdividentotpion);
					$(frequency).shouldBe(Visible.exist, Duration.ofSeconds(10))
							.selectOptionContainingText(CCS_Frequency);
					$(Max_LifeTimeRider).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(LifeTimeRiderBenefit);
					$(MaxMonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(MaxiMonthlyBenefit);
					$(TotalAnnualPrem).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(TotalAnnualPremium);
					selectRadioYesorNo(Mec_Yes, Mec_No, MEC);
					selectRadioYesorNo(WaiverOfPremiumRider_Yes, WaiverOfPremiumRider_No, WaiverOfPremiumRider);
					$(Next).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
					/*
					 * GlobalCap.sleep(3000); $(LTCRALt).shouldBe(Visible.exist,
					 * Duration.ofSeconds(10)).click();
					 */
				}

			} else if (Alternate_Additionaltype.equalsIgnoreCase("CareChoice One")) {
				if ($(AlternateHeading).isDisplayed()) {
					$(FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(faceamount);
					$(CC1_LifePolicySinglePremium).shouldBe(Visible.exist, Duration.ofSeconds(10))
							.setValue(CC1_PolicySinglePremium);
					$(CC1_LTCI_Rider_SinglePremium).shouldBe(Visible.exist, Duration.ofSeconds(10))
							.setValue(CC1_LTCI_SinglePremium);
					$(Max_LifeTimeRider).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(LifeTimeRiderBenefit);
					$(MaxMonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(MaxiMonthlyBenefit);
					$(CC1_DividentOption).shouldBe(Visible.exist, Duration.ofSeconds(10))
							.selectOptionContainingText(CC1dividentotpion);
					// $(frequency).shouldBe(Visible.exist,
					// Duration.ofSeconds(10)).selectOptionContainingText(CConeFrequency);
					selectRadioYesorNo(Mec_Yes, Mec_No, MEC);
					$(Next).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
					/*
					 * GlobalCap.sleep(3000); $(LTCRALt).shouldBe(Visible.exist,
					 * Duration.ofSeconds(10)).click();
					 */
				}
			}
		}

	}
}
