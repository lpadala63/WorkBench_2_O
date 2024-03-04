package pageclass;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class LifePaymentInfo extends GlobalCap {

	By LPI_BillingType_DD = By.xpath("//select[@id='lb_19']");

	By LPI_Frequency_DD = By.xpath("//select[@id='lb_15']");
	By LPI_IsInitialPremiumbeingsubmittedWiththisApplicationQuestn_RB = By.xpath("//*[@id='div_12']/div[2]");
	By LPI_InitialPremiumPaymentMode_DD = By.xpath("//*[@id='lb_10']");
	By LPI_InitialPremiumAmount = By.xpath("//*[@id='flda_8']");
	By LPI_WillYouBeProvidingPACinfoThisTymeQuestn_RB = By.xpath("//*[@id='div_142']/div[2]");
	By LPI_DoesPremiumPayorSourceofPremincludeLoanorPremFinancingQuestn_RB = By.xpath(
			"//label[text()='Does the Premium Payor’s source of premium include a loan or premium financing?']//following::div[1]");
	By LPI_SourceofPremium = By.xpath("//*[@id='cb_<change>']|6|5|4|3|2|1");
	By LPI_PremiumPayor_DD = By.xpath("//div[@id='div_25']/select[@id='lb_25']");
	By LPI_PayorType_RB = By.xpath("//*[@id='div_112']/div[2]");
	By LPI_PayorIndividualOrEntityLegalNameofEnity = By.xpath("//*[@id='flda_30']");
	By LPI_PayorOrAuthorizedSignerfirst = By.xpath("//*[@id='flda_33']");
	By LPI_PayorOrAuthorizedSignerMI = By.xpath("//*[@id='flda_31']");
	By LPI_PayorOrAuthorizedSignerLast = By.xpath("//*[@id='flda_35']");
	By LPI_PayorOrAuthorizedSignerSuffix = By.xpath("//*[@id='lb_37']");
	By LPI_AuthorizedSignerTitle = By.xpath("//*[@id='flda_22']");
	By LPI_PayorCountry = By.xpath("//*[@id='lb_54']");
	By LPI_PayorStreet1 = By.xpath("//*[@id='flda_48']");
	By LPI_PayorStreet2 = By.xpath("//*[@id='flda_44']");
	By LPI_PayorStreet3 = By.xpath("//*[@id='flda_41']");
	By LPI_PayorCity = By.xpath("//*[@id='flda_49']");
	By LPI_PayorState = By.xpath("//*[@id='lb_47']");
	By LPI_PayorZip = By.xpath("//*[@id='flda_52']");
	By LPI_SecondaryAdressee = By.xpath("//*[@id='div_147']/div[2]");
	By LPI_SecondaryAddresseRole = By.xpath("//*[@id='lb_186']");
	By LPI_PremiumFinancing = By.xpath("//*[@id='div_192']/div[2]");
	By LPI_BACK = By.xpath("//*[@id='btn_67']");
	By LPI_NEXT = By.xpath("//*[@id='btn_66']");
	By LPI_HaveSecondaryNO = By.xpath("//*[@alt_id='PAY_HaveSecondaryYESNO_2']");
	By LPI_Bill_type = By.xpath("//*[@id='rdo_12_1']");
	By LPI_radio1_text = By.xpath("//*[@id='lbl_113']");
	By Radio_No = By.xpath("//*[@id='rdo_12_2']");
	By Radio_Yes_dropdown1 = By.xpath("[@id='lb_10']");
	By Radio_Yes_textbox = By.xpath("[@id='flda_8']");
	By checkbox = By.xpath("//span[contains(text(),'Earned Income')]");
	By LPI_rad2 = By.xpath("//span[@id='lbl_192_2']");
	By LPI_rad3 = By.xpath("//span[@id='lbl_147_2']");
	By LPI_yes1 = By.xpath("//span[@id='lbl_12_1']");
	By LPI_R_NO = By.xpath("//*[@id='div_12']/div[2]/label[2]");
	By LPI_R_NO_input = By.xpath("//input[@id='rdo_12_2']");
	By LPI_lastRadio_No = By.xpath("//*[@id='div_192']/div[2]/label[2]/div/span[2]");
	By LPI_No_input = By.xpath("//input[@id='rdo_192_2']");
	By LPI_LR_No = By.xpath("//*[@id='rdo_147_2']");
	By LPI_pac_extra_field = By.xpath("//*[contains(text(),'Will you be providing PAC information at this time?')]");
	By LPI_pac_No = By.xpath("//*[@id='rdo_142_2']");
	By LPI_Billingtype_label = By.xpath("//label[contains(text(),'Billing Type')]");
	By LPI_pac_label = By.xpath("//input[@value='PAC' and @id='flda_19']");
	By BillType = By.xpath("//select[@id='lb_19']");
	By FreqBanner = By.xpath("//label[@id='lbl_16']");

	// actual
	//By LPI_Frequency = By.xpath("//label[text()='Frequency']//following::select[1]");
	By LPI_Frequency= By.xpath("//select[@id='lb_15']");
	// label[text()='Is initial premium being submitted with this
	// Application?']//following::div[1]
	By initialpremiumbeingsubmitted = By
			.xpath("//label[text()='Is initial premium being submitted with this Application?']//following::div[1]");
	By initialpremiumbeingsubmitted_Yes = By.xpath("//input[@id='rdo_12_1']");
	By initialpremiumbeingsubmitted_No = By.xpath("//input[@id='rdo_12_2']"); 
	By LPI_PremiumPayor = By.xpath("//label[text()='Premium Payor']//following::select[1]");
	By LPI_PremincludeLoanorPremFinancing = By.xpath(
			"//label[text()='Does the Premium Payor’s source of premium include a loan or premium financing?']//following::div[1]");
	By LPI_PremincludeLoanorPremFinancing_Yes = By.xpath("//input[@id='rdo_192_1']");
	By LPI_PremincludeLoanorPremFinancing_No = By.xpath("//input[@id='rdo_192_2']");

	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	// Newyork
	By NySP_EarnedIncome = By
			.xpath("//strong[contains(text(),'Source of Premium')]//following::span[text()='Earned Income']");
	By NYSP_Investment = By
			.xpath("//strong[contains(text(),'Source of Premium')]//following::span[text()='Investment/Savings']");
	By NYSP_Gifts = By
			.xpath("//strong[contains(text(),'Source of Premium')]//following::span[text()='Gifts/Inheritance']");
	By NYSP_InvestmentIncome = By
			.xpath("//strong[contains(text(),'Source of Premium')]//following::span[text()='Investment Income']");
	By NYSP_PremiumFinancing = By
			.xpath("//strong[contains(text(),'Source of Premium')]//following::span[text()='Loan/Premium Financing']");
	By NYSP_Other = By.xpath("//strong[contains(text(),'Source of Premium')]//following::span[text()='Other']");
	By NYSP_OtherDetails = By.xpath("//Input[@alt_id='PAY_SOPOtherDetails']");

	public void life_pay_field_entry(String state, String freq_M, String Billing, String Initialpremiumbeingsubmitted,
			String premiumpayor, String PremincludeLoanorPremFinancing, String selectPRemium,
			String selectPRemiumotherdetails) {
		if ($(BillType).isEnabled()) {
			$(BillType).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Billing);
		}
                $(FreqBanner).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		GlobalCap.sleep(2000);
		if ($(LPI_Frequency).isDisplayed() && $(LPI_Frequency).isEnabled()) {
			$(LPI_Frequency).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(LPI_Frequency).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(freq_M);
		}
		if ($(initialpremiumbeingsubmitted).isDisplayed()) {
			selectRadioYesorNo(initialpremiumbeingsubmitted_Yes, initialpremiumbeingsubmitted_No,
					Initialpremiumbeingsubmitted);
		}
		if ($(LPI_pac_No).isDisplayed()){
			$(LPI_pac_No).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();}
		
		if ($(NySP_EarnedIncome).isDisplayed()) {
			switch (selectPRemium) {
			case "Earned Income":
				$(NySP_EarnedIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Investment/Savings":
				$(NYSP_Investment).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Gifts/Inheritance":
				$(NYSP_Gifts).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Investment Income":
				$(NYSP_InvestmentIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Loan/Premium Financing":
				$(NYSP_PremiumFinancing).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Other":
				$(NYSP_Other).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(NYSP_Other).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(selectPRemiumotherdetails);
				break;

			default:
				System.out.println("Not able to select the option");
				break;
			}

		}
		if ($(LPI_PremiumPayor).isDisplayed()) {
			$(LPI_PremiumPayor).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionContainingText(premiumpayor);
		}
		if ($(LPI_PremincludeLoanorPremFinancing).isDisplayed()) {
			selectRadioYesorNo(LPI_PremincludeLoanorPremFinancing_Yes, LPI_PremincludeLoanorPremFinancing_No,
					PremincludeLoanorPremFinancing);
		}
		if ($(LPI_HaveSecondaryNO).isDisplayed()) {
			$(LPI_HaveSecondaryNO).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		$(LPI_NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}

}
