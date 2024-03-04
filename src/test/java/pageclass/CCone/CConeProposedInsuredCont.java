package pageclass.CCone;

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

public class CConeProposedInsuredCont extends GlobalCap {

	By PIC_USDriverLicense_RD_yes = By.xpath("//label[contains(text(),'Driver')]//following::label[1]");
	By PIC_USDriverLicense_RD_No = By.xpath("//label[contains(text(),'Driver')]//following::label[2]");// input[@id='rdo_38_2'																																																			// @name='rdo_38_2']
	By PIC_IdentNumber = By.xpath("//label[contains(text(),'Identification ')]//following-sibling::input[@alt_id='DLIdentNum']");
	By PIC_StateProvinceofIssue_DD = By.xpath("//label[contains(text(),'Province of Issue')]//following-sibling::select[@id='lb_406']");
	By PIC_ReasonWhy_DD = By.xpath("//label[contains(text(),'Reason Why')]//following-sibling::select");	
	By PIC_TypeofCitizenship = By.xpath("//label[contains(text(),'Citizenship')]//following-sibling::select[@id='lb_120']");
	By PIC_Back = By.xpath("//*[@id='btn_8']");
	By PIC_Next = By.xpath("//*[@id='btn_7']");
	
	By NY_USDriverLicense_RD_yes = By.xpath("//label[contains(text(),'Driver')]//following::input[@alt_id='DLicenseYesNo_1']");
	By NY_USDriverLicense_RD_No = By.xpath("//label[contains(text(),'Driver')]//following::input[@alt_id='DLicenseYesNo_2']");
	By NY_IdentNumber = By.xpath("//label[contains(text(),'Identification ')]//following-sibling::input[@alt_id='IDNumber']");
	By NY_StateProvinceofIssue_DD = By.xpath("//label[contains(text(),'Province of Issue')]//following-sibling::select[@alt_id='IDStateList']");
	By NY_passport = By.xpath("//span[contains(text(),'Passport')]");	
	By NY_passport_other = By.xpath("//span[contains(text(),'Other')]");
	By NY_passport_otherDetails = By.xpath("//input[@alt_id='IDOtherType']");
	By NY_TypeofCitizenship = By.xpath("//label[contains(text(),'Citizenship')]//following-sibling::select[@id='lb_120']");
	By NY_Back = By.xpath("//*[@id='btn_8']");
	By NY_Next = By.xpath("//*[@id='btn_7']");
	
	
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");

	public void identification(String state,String passport,String OtherDetails, String UsdriverLic, String reason, String Identification_No,
			String StateProvinceofIssue_pass, String TypeofCitizenship) {
		if (!state.equalsIgnoreCase("New York") && !state.equalsIgnoreCase("California")) {
			if (UsdriverLic.equalsIgnoreCase("Yes")) {
				$(PIC_USDriverLicense_RD_yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(PIC_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Identification_No);
				$(PIC_StateProvinceofIssue_DD).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionContainingText(StateProvinceofIssue_pass);
			}

			else if (UsdriverLic.equalsIgnoreCase("No")) {
				$(PIC_USDriverLicense_RD_No).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(PIC_ReasonWhy_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(reason);

			}
			$(PIC_TypeofCitizenship).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(TypeofCitizenship);
			$(PIC_Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		} else {
			if (UsdriverLic.equalsIgnoreCase("Yes")) {
				$(NY_USDriverLicense_RD_yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(NY_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Identification_No);
				$(NY_StateProvinceofIssue_DD).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionContainingText(StateProvinceofIssue_pass);
			}

			else if (UsdriverLic.equalsIgnoreCase("No")) {	
				$(NY_USDriverLicense_RD_No).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				if(passport.equalsIgnoreCase("Passport")){
					$(NY_passport).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
				else if(passport.equalsIgnoreCase("Other")){
					$(NY_passport_other).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					$(NY_passport_otherDetails).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(OtherDetails);
				}
				$(NY_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Identification_No);
				$(NY_StateProvinceofIssue_DD).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionContainingText(StateProvinceofIssue_pass);

			}
			$(PIC_TypeofCitizenship).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(TypeofCitizenship);
			$(PIC_Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}

	public void PIC_identification(String UsdriverLic, String reason, String Typeofidentification,
			String Identification_No, String StateProvinceofIssue_pass, String other, String TypeofCitizenship,
			String Expr_MM, String Expr_DD, String Expr_YYYY) {
		By PIC_USDriverLicense_RD_yes = By.xpath("//label[contains(text(),'Driver')]//following::label[1]");// input[@id='rdo_38_1'
																											// or
																											// @name='rdo_38_1']
		By PIC_USDriverLicense_RD_No = By.xpath("//label[contains(text(),'Driver')]//following::label[2]");// input[@id='rdo_38_2'
																											// or
																											// @name='rdo_38_2']
		By PIC_IdentNumber = By.xpath("//input[@id='flda_399']");
		By PIC_StateProvinceofIssue_DD = By.xpath("//select[@id='lb_410']");
		By PIC_CountryofIssue_DD = By.xpath("//*[@id='lb_96']");
		By PIC_ReasonWhy_DD = By.xpath("//select[@id='lb_415' or name='lb_415']");
		By PIC_Passport_RD = By.xpath("//input[@id='rdo_397_1']");
		By PIC_other_RD = By.xpath("//input[@id='rdo_397_2']");
		By PIC_other_input = By.xpath("//input[@id='flda_395']");
		By PIC_TypeofCitizenship = By
				.xpath("//span[contains(text(),'Citizenship')]//following::select[@alt_id='Citizenship']");
		By Indiv_TypeofCitizenship = By.xpath("//select[@alt_id='Ind_Citizenship']");

		By PIC_Next = By.xpath("//*[@id='btn_7']");
		By PIC_TypeOfcit_label = By.xpath("//label[contains(text(),'Type of Citizenship')]");
		By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
		By exp_MM = By.xpath("//div[@id='div_408']/div/span/span[1]/input[1]");
		By exp_DD = By.xpath("//div[@id='div_408']/div/span/span[1]/input[2]");
		By exp_YYYY = By.xpath("//div[@id='div_408']/div/span/span[1]/input[3]");

		if (UsdriverLic.equalsIgnoreCase("Yes")) {
			$(PIC_USDriverLicense_RD_yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(PIC_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Identification_No);
			$(PIC_StateProvinceofIssue_DD).shouldBe(Visible.exist, Duration.ofSeconds(15))
					.selectOptionContainingText(StateProvinceofIssue_pass);
		} else if (UsdriverLic.equalsIgnoreCase("No")) {
			$(PIC_USDriverLicense_RD_No).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			if ($(PIC_ReasonWhy_DD).isDisplayed()) {
				$(PIC_ReasonWhy_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(reason);
			}
			if (Typeofidentification.equalsIgnoreCase("Passport")) {
				$(PIC_Passport_RD).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(PIC_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Identification_No);
				$(PIC_StateProvinceofIssue_DD).shouldBe(Visible.exist, Duration.ofSeconds(15))
						.selectOptionContainingText(StateProvinceofIssue_pass);
			} else if (Typeofidentification.equalsIgnoreCase("Other")) {
				$(PIC_other_RD).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(PIC_other_input).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(other);
				$(PIC_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Identification_No);
				$(PIC_StateProvinceofIssue_DD).shouldBe(Visible.exist, Duration.ofSeconds(15))
						.selectOptionContainingText(StateProvinceofIssue_pass);
			}
			if ($(exp_MM).isDisplayed()) {
				$(exp_MM).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Expr_MM);
				$(exp_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Expr_DD);
				$(exp_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Expr_YYYY);
			}

		}
		if ($(PIC_TypeofCitizenship).isDisplayed()) {
			$(PIC_TypeofCitizenship).shouldBe(Visible.exist, Duration.ofSeconds(15))
					.selectOptionContainingText(TypeofCitizenship);
		}
		if ($(Indiv_TypeofCitizenship).isDisplayed()) {
			$(Indiv_TypeofCitizenship).shouldBe(Visible.exist, Duration.ofSeconds(15))
					.selectOptionContainingText(TypeofCitizenship);
		}
		$(PIC_Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}

}
