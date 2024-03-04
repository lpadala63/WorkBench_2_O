package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;
import org.openqa.selenium.By;
import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;

public class DI_BOE {

	By BoeHeading = By.xpath("//span[contains(text(),'Business Overhead Expense Supplement')]");
	By MonthlyBenefit = By.xpath("//input[@alt_id='BOE_BaseMonthlyBenefit' or @name='flda_62']");
	By BenefitPeriod = By.xpath("//select[@alt_id='BOE_BaseBenefitPeriod' or @name='lb_61']");
	By WaitingPeriod = By.xpath("//select[@alt_id='BOE_BaseWaitingPeriod' or @name='lb_60']");

	// riders
	By OtherRiderHeading = By.xpath("//span[contains(text(),'Other Benefits and Riders')]");
	By AdditionalMonthlyBenefit = By.xpath("//input[@id='cb_67']");
	By AddMonBeneAMount = By.xpath("//input[@id='flda_66']");
	By AddMonBeneBP = By.xpath("//select[@id='lb_65']");
	By AddMonBeneWP = By.xpath("//select[@id='lb_79']");
	By AutomaticBenefitIncreaseRider_CB = By.xpath("//input[@id='cb_83']");
	By FIO = By.xpath("//input[@id='cb_70']");
	By FIOAmount = By.xpath("//input[@id='flda_69']");
	By IncomeProtectionRider = By.xpath("//input[@id='cb_48']");
	By IPRAmount = By.xpath("//input[@id='flda_71']");
	By PartialDisability = By.xpath("//input[@id='cb_88']");
	By PartialReplacementExpense = By.xpath("//input[@id='cb_55']");
	By PREAmount = By.xpath("//input[@id='flda_75']");
	By PREBP = By.xpath("//select[@id='lb_74']");

	By BOENext = By.xpath("//button[contains(text(),'Next')]");

	public void BOE(String Product, String MB, String BP, String WP) {

		GlobalCap.pageload(40);

	 if (Product.equalsIgnoreCase("Business Overhead Expense")) {
		 System.out.println("BOE product)");
		if ($(BoeHeading).isDisplayed()) {
			$(MonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(MB);
			$(BenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(BP);
			$(WaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(WP);

		}
	}

	}

	public void BOERiders(String AMB, String AMBAmount, String AMBBP, String AMBWP, String ABIR, String BOEFIO,
			String BOEFIOAmount, String BOEIPR, String BOEIPRAmount, String BOEPRD, String BOEPRED, String BOEPREamount,
			String BOEPREBP) {
		if ($(BoeHeading).isDisplayed()) {
			System.out.println("BOE Riders)");
			// ***************Additional Benefit Rider*************
			if (AMB.equalsIgnoreCase("Yes")) {
				if ($(AdditionalMonthlyBenefit).isDisplayed() && $(AdditionalMonthlyBenefit).isEnabled()) {
					$(AdditionalMonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					$(AddMonBeneAMount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(AMBAmount);
					$(AddMonBeneBP).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(AMBBP);
					$(AddMonBeneWP).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(AMBWP);
				} else {
					System.out.println("Mentioned riders is DISABLED - Please check the Condition");
				}
			}
			// ***************Automatic Benefit Increase Rider*************
			if (ABIR.equalsIgnoreCase("Yes")) {
				if ($(AutomaticBenefitIncreaseRider_CB).isDisplayed() && $(AdditionalMonthlyBenefit).isEnabled()) {
					$(AutomaticBenefitIncreaseRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				} else {
					System.out.println("Mentioned riders is DISABLED - Please check the Condition");
				}
			}
			// ***************FIO Rider*************
			if (BOEFIO.equalsIgnoreCase("Yes")) {
				if ($(FIO).isDisplayed() && $(AdditionalMonthlyBenefit).isEnabled()) {
					$(FIO).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					$(FIOAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(BOEFIOAmount);
				} else {
					System.out.println("Mentioned riders is DISABLED - Please check the Condition");
				}
				
			}
			// ***************INcome Protection Rider*************
			if (BOEIPR.equalsIgnoreCase("Yes")) {
				if ($(IncomeProtectionRider).isDisplayed() && $(AdditionalMonthlyBenefit).isEnabled()) {
					$(IncomeProtectionRider).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					$(IPRAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(BOEIPRAmount);
				} else {
					System.out.println("Mentioned riders is DISABLED - Please check the Condition");
				}
			}

			// ***************Partial Disability Rider*************
			if (BOEPRD.equalsIgnoreCase("Yes")) {
				if ($(PartialDisability).isDisplayed() && $(AdditionalMonthlyBenefit).isEnabled()) {
					$(PartialDisability).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				} else {
					System.out.println("Mentioned riders is DISABLED - Please check the Condition");
				}
			}
		
		// ***************Professional Replacement Expense Rider*************
		if (BOEPRED.equalsIgnoreCase("Yes")) {
			if ($(PartialReplacementExpense).isDisplayed() && $(AdditionalMonthlyBenefit).isEnabled()) {
				$(PartialReplacementExpense).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(PREAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(BOEPREamount);
				$(PREBP).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(BOEPREBP);
			} else {
				System.out.println("Mentioned riders is DISABLED - Please check the Condition");
			}
			
		}
		$(BOENext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

	}
}
