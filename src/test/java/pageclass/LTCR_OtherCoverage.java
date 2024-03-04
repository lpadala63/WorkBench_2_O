package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class LTCR_OtherCoverage extends GlobalCap{
	By OCOV_ExistingLTC_Yes = By.xpath("//input[@alt_id='LTCR_OCOV_ExistingLTC_1']");
	By OCOV_ExistingLTC_No = By.xpath("//input[@alt_id='LTCR_OCOV_ExistingLTC_2']");
	By OCOV_OtherPolicyYes = By.xpath("//input[@alt_id='LTCR_OCOV_OtherPolicyYesNo_1']");
	By OCOV_OtherPolicyNo = By.xpath("//input[@alt_id='LTCR_OCOV_OtherPolicyYesNo_2']");
	By OCOV_ReplaceYes = By.xpath("//input[@alt_id='LTCR_OCOV_ReplaceYesNo_1']");
	By OCOV_ReplaceNo = By.xpath("//input[@alt_id='LTCR_OCOV_ReplaceYesNo_2']");
	By OCOV_DisabilityBenefitYes = By.xpath("//input[@alt_id='LTCR_OCOV_DisabilityBenefitYesNo_1']");
	By OCOV_DisabilityBenefitNo = By.xpath("//input[@alt_id='LTCR_OCOV_DisabilityBenefitYesNo_2']");
	By OCOV_MedicaidYes = By.xpath("//input[@alt_id='LTCR_OCOV_MedicaidYesNo_1']");
	By OCOV_MedicaidNo = By.xpath("//input[@alt_id='LTCR_OCOV_MedicaidYesNo_2']");
	By Heading = By.xpath("//h1[contains(text(),'LTCR Other Coverage')]");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By Clickheretoadd = By.xpath("//button[contains(text(),'Click here to add')]");
	public void LTCR_OtherCoverageRiders(String ExistingLTC,String OtherPolicy,String OCOV_Replace,String DisabilityBenefit,String Medicaid  ){
		if ($(Heading).isDisplayed()) {
			selectRadioYesorNo(OCOV_ExistingLTC_Yes, OCOV_ExistingLTC_No, ExistingLTC);
			selectRadioYesorNo(OCOV_OtherPolicyYes, OCOV_OtherPolicyNo, OtherPolicy);
			selectRadioYesorNo(OCOV_ReplaceYes, OCOV_ReplaceNo, OCOV_Replace);
			selectRadioYesorNo(OCOV_DisabilityBenefitYes, OCOV_DisabilityBenefitNo, DisabilityBenefit);
			selectRadioYesorNo(OCOV_MedicaidYes, OCOV_MedicaidNo, Medicaid);
			/*if($(Clickheretoadd).isDisplayed()){
				$(Clickheretoadd).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}*/
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

	}
	
}
