package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class MMSD_DI_PaymentInformation extends GlobalCap {

	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By NetworthYes = By.xpath("//input[@id='rdo_122_1']");
	By NetworthNo = By.xpath("//input[@id='rdo_122_2']");
	By EmplymentRelation = By.xpath("//select[@id='lb_5' or @name='lb_5']");
	By percentofOwnership = By.xpath("//input[@id='flda_9']");
	By Payor = By.xpath("//select[@id='lb_157' or @name='lb_157']");
	By BillingType = By.xpath("//select[@id='lb_146' or @name='lb_146']");
	By Level = By.xpath("//input[@id='rdo_153_1' or @name='rdo_153_1']");
	By Frequency = By.xpath("//select[@id='lb_144' or @name='lb_144']");
	By InitialPaymentYes = By.xpath("//input[@id='rdo_154_1' or @name='rdo_154_1']");
	By InitialPaymentNo = By.xpath("//input[@id='rdo_154_2' or @name='rdo_154_2']");
	By PaymentMode = By.xpath("//select[@id='lb_149' or @name='lb_149']");
	By PaymentAmount = By.xpath("//input[@id='flda_147' or @name='flda_147']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By RealEstate = By.xpath("//input[@id='flda_6' or @name='flda_6']");
	By Cash = By.xpath("//input[@id='flda_10' or @name='flda_10']");
	By Stocks = By.xpath("//input[@id='flda_12' or @name='flda_12']");
	By AssetYes = By.xpath("//input[@id='rdo_4_1' or @name='rdo_4_1']");
	By AssetNo = By.xpath("//input[@id='rdo_4_2' or @name='rdo_4_2']");
	By AssetDescribe = By.xpath("//input[@id='flda_2' or @name='flda_2']");
	By AssetValues = By.xpath("//input[@id='flda_14' or @name='flda_14']");
	By Mortgages = By.xpath("//input[@id='flda_28' or @name='flda_28']");
	By Payable = By.xpath("//input[@id='flda_31' or @name='flda_31']");
	By liabilitiesYes = By.xpath("//input[@id='rdo_26_1' or @name='rdo_26_1']");
	By liabilitiesNo = By.xpath("//input[@id='rdo_26_2' or @name='rdo_26_2']");
	By LiabilityDescribe = By.xpath("//input[@id='flda_24' or @name='flda_24']");
	By LiabilityValues = By.xpath("//input[@id='flda_33' or @name='flda_33']");
	By NetworthNext = By.xpath("//button[@id='btn_43' or @name='btn_43']");

	public void DisabilityIncomePayinfo(String Networth) {
		GlobalCap.sleep(2000);
		GlobalCap.selectRadioYesorNo(NetworthYes, NetworthNo, Networth);
	}

	public void EmploymentRelationship(String Relationship, String PremiumPayor, String PercentageofOwnerShip) {
		if ($(EmplymentRelation).isDisplayed() && $(EmplymentRelation).isEnabled()) {
			$(EmplymentRelation).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(Relationship);
		}

		if ($(percentofOwnership).isDisplayed()) {
			$(percentofOwnership).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(PercentageofOwnerShip);
		}

		$(Payor).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(PremiumPayor);
	}

	public void BillingInformation(String Billing, String Freq, String InitialPay, String PayMode, String Amount) {
		if ($(BillingType).isDisplayed() && $(BillingType).isEnabled()) {
			$(BillingType).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Billing);
		}

		if ($(Frequency).isDisplayed() && $(Frequency).isEnabled()) {
			$(Frequency).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Freq);
		}

		GlobalCap.selectRadioYesorNo(InitialPaymentYes, InitialPaymentNo, InitialPay);

		if (InitialPay.equalsIgnoreCase("Yes")) {

			GlobalCap.selectRadioYesorNo(InitialPaymentYes, InitialPaymentNo, InitialPay);

			$(PaymentMode).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(PayMode);

			$(PaymentAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Amount);

		} else {
			GlobalCap.selectRadioYesorNo(InitialPaymentYes, InitialPaymentNo, InitialPay);
		}

		if ($(Level).isDisplayed()) {
			Boolean level = $(Level).isEnabled();
			System.out.println("The boolean value of level is " + level);
			// level.equals("true");
			// if (level.equals("false")) {
			// GlobalCap.sleep(1000);
			// $(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			if (level.equals("true")) {
				$(Level).click();
				GlobalCap.sleep(2000);
				// $(Next).shouldBe(Visible.exist,
				// Duration.ofSeconds(60)).click();
			}

		}

		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		// GlobalCap.sleep(2000);

	}

	public void Networth(String Yes_No, String REstate, String NWCash, String Stock, String Assets, String AssetDesc,
			String AssetVal, String Mortgage, String Payble, String Liability, String LiablityDesc,
			String LiabilityVal) {

		if (Yes_No.equalsIgnoreCase("Yes")) {
			$(RealEstate).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(REstate);

			$(Cash).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NWCash);

			$(Stocks).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Stock);

			GlobalCap.selectRadioYesorNo(AssetYes, AssetNo, Assets);

			$(AssetDescribe).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AssetDesc);

			$(AssetValues).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AssetVal);

			$(Mortgages).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Mortgage);

			$(Payable).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Payble);

			GlobalCap.selectRadioYesorNo(liabilitiesYes, liabilitiesNo, Liability);

			$(LiabilityDescribe).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(LiablityDesc);

			$(LiabilityValues).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(LiabilityVal);

			$(NetworthNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}
}