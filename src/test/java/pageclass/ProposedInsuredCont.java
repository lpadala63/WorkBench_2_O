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

public class ProposedInsuredCont extends GlobalCap {

	By PIC_USDriverLicense_RD_yes = By.xpath("//label[contains(text(),'Driver')]//following::label[1]");//input[@id='rdo_38_1' or @name='rdo_38_1']
	By PIC_USDriverLicense_RD_No = By.xpath("//label[contains(text(),'Driver')]//following::label[2]");//input[@id='rdo_38_2' or @name='rdo_38_2']
	By PIC_IdentNumber = By.xpath("//*[@id='flda_36' or @name='flda_36']");
	By PIC_StateProvinceofIssue_DD = By.xpath("//*[@id='lb_95']");
	By PIC_CountryofIssue_DD = By.xpath("//*[@id='lb_96']");
	By PIC_ReasonWhy_DD = By.xpath("//select[@id='lb_415' or name='lb_415']");
	By PIC_Passport_RD = By.xpath("//input[@id='rdo_392_1' or @name='rdo_392_1']");
	By PIC_other_RD = By.xpath("//input[@id='rdo_392_2']");
	By PIC_StateProvinceofIssue_DD_pass = By.xpath("//select[@id='lb_95']");
	By PIC_other_input = By.xpath("//input[@id='flda_98']");
	By PIC_TypeofCitizenship = By.xpath("//span[contains(text(),'Citizenship')]//following::select[@alt_id='Citizenship']");
	By Indiv_TypeofCitizenship = By.xpath("//select[@alt_id='Ind_Citizenship']");
	By PIC_Back = By.xpath("//*[@id='btn_8']");
	By PIC_Next = By.xpath("//*[@id='btn_7']");
	By PIC_TypeOfcit_label = By.xpath("//label[contains(text(),'Type of Citizenship')]");
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
	By exp_MM = By.xpath("//*[@id='div_123']/div/span/span[1]/input[1]");
	By exp_DD = By.xpath("//*[@id='div_123']/div/span/span[1]/input[2]");
	By exp_YYYY = By.xpath("//*[@id='div_123']/div/span/span[1]/input[3]");
	
	public void identification(String UsdriverLic, String reason, String Typeofidentification, String Identification_No,
			String StateProvinceofIssue_pass, String other, String TypeofCitizenship,String Expr_MM,String Expr_DD,String Expr_YYYY) {
		if($(PIC_USDriverLicense_RD_yes).isDisplayed() && $(PIC_USDriverLicense_RD_yes).isEnabled()){
			if (UsdriverLic.equalsIgnoreCase("Yes")) {
				$(PIC_USDriverLicense_RD_yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(PIC_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Identification_No);
				$(PIC_StateProvinceofIssue_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(StateProvinceofIssue_pass);
			} else if (UsdriverLic.equalsIgnoreCase("No")) {
				$(PIC_USDriverLicense_RD_No).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				if ($(PIC_ReasonWhy_DD).isDisplayed()) {
					$(PIC_ReasonWhy_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(reason);
				}
				if (Typeofidentification.equalsIgnoreCase("Passport")) {
					$(PIC_Passport_RD).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(PIC_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Identification_No);
					$(PIC_StateProvinceofIssue_DD_pass).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(StateProvinceofIssue_pass);
				} else if (Typeofidentification.equalsIgnoreCase("Other")) {
					$(PIC_other_RD).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(PIC_other_input).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(other);
					$(PIC_IdentNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Identification_No);
					$(PIC_StateProvinceofIssue_DD_pass).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(StateProvinceofIssue_pass);
				}
				if($(exp_MM).isDisplayed()){
					GlobalCap.sleep(500);
					$(exp_MM).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Expr_MM);
					GlobalCap.sleep(500);
					$(exp_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Expr_DD);
					GlobalCap.sleep(500);
					$(exp_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Expr_YYYY);
					
				}
				
			}
		}
		
		if ($(PIC_TypeofCitizenship).isDisplayed()&&$(PIC_TypeofCitizenship).isEnabled()) {
			$(PIC_TypeofCitizenship).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TypeofCitizenship);
		}
		if ($(Indiv_TypeofCitizenship).isDisplayed()&&$(Indiv_TypeofCitizenship).isEnabled()) {
			$(Indiv_TypeofCitizenship).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TypeofCitizenship);
		}
		$(PIC_Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
}
