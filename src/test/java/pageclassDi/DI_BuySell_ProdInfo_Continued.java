package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class DI_BuySell_ProdInfo_Continued extends GlobalCap {

	By WaitingPeriod = By.xpath("//select[@alt_id='BS_BD_BaseWaitingPeriod']");
	By FundingMethod = By.xpath("//select[@alt_id='BS_BD_BaseFundingMethod']");
	By LumpSum= By.xpath("//input[@alt_id='BS_BD_BaseLumpSumAmount']");
	By Monthlypayment= By.xpath("//input[@alt_id='BS_BD_BaseMonthlyPayment']");
	By BSBenefitPeriod = By.xpath("//select[@alt_id='BS_BD_BaseBenefitPeriod']");
	By BillingType = By.xpath("//select[@id='lb_41']");
	By Frequency = By.xpath("//select[@id='lb_39']");
	By ExistingBSGrp = By.xpath("//input[@alt_id='BS_BILL_Invoice_2']");
	By NewBSGrp = By.xpath("//input[@alt_id='BS_BILL_Invoice_1']");
	By Payor = By.xpath("//select[@alt_id='BS_BILL_Payor']");
	By Next = By.xpath("//button[contains(text(),'Next')]");

	public void BSProductInfo_Continued(String Product,String WPeriod,  String Funding, String LumpSumValue, String MonthlypaymentValue, String BSBenefitPeriodValue,
			String Billing, String FrequencyValue, String GroupSelection, String PayorValue) {
		
		if (Product.equalsIgnoreCase("Buy/Sell")) {
			$(WaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(WPeriod);
			$(FundingMethod).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Funding);			
			if (Funding.equalsIgnoreCase("Lump Sum")) {
				$(LumpSum).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(LumpSumValue);
			}
			if (Funding.equalsIgnoreCase("Monthly")) {
				$(Monthlypayment).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(MonthlypaymentValue);
				$(BSBenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(BSBenefitPeriodValue);
			}			
			if (Funding.equalsIgnoreCase("Down Payment")) {
				$(LumpSum).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(LumpSumValue);
				$(Monthlypayment).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(MonthlypaymentValue);
				$(BSBenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(BSBenefitPeriodValue);
			}
			$(BillingType).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Billing);
			$(Frequency).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(FrequencyValue);
			
			//yes = ExistingBSGrp  //No = NewBSGrp
			if(GroupSelection.equalsIgnoreCase("Add to Existing Buy/Sell Group")){
				$(ExistingBSGrp).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}else{
				$(NewBSGrp).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			$(Payor).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PayorValue);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}

	}
