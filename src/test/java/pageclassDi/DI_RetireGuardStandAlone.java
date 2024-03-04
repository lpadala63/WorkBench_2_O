package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class DI_RetireGuardStandAlone {

	By RGSA_MB = By.xpath("//input[@id='flda_35' or @name='flda_35']");
	By RGSA_BP = By.xpath("//select[@id='lb_37' or @name='lb_37']");
	By RGSA_WP = By.xpath("//select[@id='lb_36' or @name='lb_36']");
	By RGSA_EmployerAmt = By.xpath("//label[text()='Employer Amount']//following-sibling::input[@id='flda_52']");
	By RGSA_EmployeeAmt = By.xpath("//label[text()='Employee Amount']//following-sibling::input[@id='flda_42']");
	By Banner = By.xpath("//h3//span[text()='RetireGuard StandAlone']");

	// riders
	By OtherRiderHeading = By.xpath("//h3[@id='lbl_4']");
	By MaximunBenefitPeriodEndorsement_CB = By.xpath("//input[@id='cb_53']");
	By CostOfLivingRider_CB = By.xpath("//input[@id='cb_38']");
	By FutureInsurabilityOptionRider_CB = By.xpath("//input[@id='cb_41']");
	By FutureInsurabilityOptionRider_Amount = By.xpath("//input[@id='flda_40']");
	By RGSANext = By.xpath("//button[@id='btn_30' or @name='btn_30']");

	public void RGSAProduct(String RGSAProduct, String RGSAMB, String RGSABP, String RGSAWP, String Employer,
			String Employee) {
		if (RGSAProduct.equalsIgnoreCase("RetireGuard StandAlone")) {
			System.out.println("RGSA Riders)");

			$(RGSA_MB).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RGSAMB);
			$(RGSA_BP).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(RGSABP);
			$(RGSA_WP).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(RGSAWP);

			$(RGSA_EmployerAmt).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Employer);
			GlobalCap.sleep(1000);
			$(Banner).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(1000);
			$(RGSA_EmployeeAmt).shouldBe(Visible.exist, Duration.ofSeconds(70)).setValue(Employee);
			GlobalCap.sleep(2000);

			$(Banner).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(1000);
		}
	}

	public void RGSARiders(String DI_MaximumBenefitPeriod_Rider, String DI_CostOfLivingRider,
			String DI_FutureinsOptionRider_FIO, String DI_FutureinsOptionRider_FIO_Amount)

	{
		if ($(Banner).isDisplayed()) {
			System.out.println("RGSA Riders)");
			// *********************************Maximun Benefit Period
			// Endorsement************************************** retireGuard,
			if (DI_MaximumBenefitPeriod_Rider.equalsIgnoreCase("Yes")) {
				if ($(MaximunBenefitPeriodEndorsement_CB).isDisplayed()
						&& $(MaximunBenefitPeriodEndorsement_CB).isEnabled()) {
					$(MaximunBenefitPeriodEndorsement_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println(
							"MaximunBenefitPeriodEndorsement Rider CheckBox is DISABLED - Please check the Condition");
				}
			}
			// *************************************** Cost of Living Rider
			// ***************************************** retireGuard
			if (DI_CostOfLivingRider.equalsIgnoreCase("Yes")) {
				if ($(CostOfLivingRider_CB).isDisplayed() && $(CostOfLivingRider_CB).isEnabled()) {
					$(CostOfLivingRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println("Cost of Living Rider Rider is DISABLED - Please check the Condition");
				}
			}

			// ***************************************Future Insurability Option
			// Rider (FIO) Rider *****************************************
			// retireGuard,BOE
			if (DI_FutureinsOptionRider_FIO.equalsIgnoreCase("Yes")) {
				if ($(FutureInsurabilityOptionRider_CB).isDisplayed()
						&& $(FutureInsurabilityOptionRider_CB).isEnabled()) {
					$(FutureInsurabilityOptionRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(FutureInsurabilityOptionRider_Amount).shouldBe(Visible.exist, Duration.ofSeconds(60))
							.setValue(DI_FutureinsOptionRider_FIO_Amount);
				} else {
					System.out.println(
							"Future Insurability Option Rider (FIO)  Rider is DISABLED - Please check the Condition");
				}
			}
			$(RGSANext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

		

	}
}
