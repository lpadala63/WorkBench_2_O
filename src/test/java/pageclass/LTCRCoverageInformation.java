package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class LTCRCoverageInformation extends GlobalCap{
	By InitialMaxBenefit = By.xpath("//input[@alt_id='LTCR_COV_InitialMaxBenefit']");
	By MMBIOYes = By.xpath("//input[@alt_id='LTCR_COV_MMBIOYesNo_1']");
	By MMBIONo = By.xpath("//input[@alt_id='LTCR_COV_MMBIOYesNo_2']");	
	By BenefitPeriod = By.xpath("//select[@alt_id='LTCR_COV_BenefitPeriod']");
	By ResidualFaceAmount = By.xpath("//input[@alt_id='LTCR_COV_ResidualFaceAmount']");
	By BaseBenefitPool = By.xpath("//input[@alt_id='LTCR_COV_BaseBenefitPool']");
	By BasePaidToPoolYes = By.xpath("//input[@alt_id='LTCR_COV_BasePaidToPoolYesNo_1']");
	By BasePaidToPoolNo = By.xpath("//input[@alt_id='LTCR_COV_BasePaidToPoolYesNo_2']");
	By Heading = By.xpath("//h1[contains(text(),'LTCR Coverage Information')]");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	public void CoverageInformation(String Intialmaxbenefit,String MonthlybenefitIncrease,String benefitperiod,String faceamount,String BaseBenefitpool,
			String DividendsBaseBenefit){
		if($(Heading).isDisplayed()){
			$(InitialMaxBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Intialmaxbenefit);
			selectRadioYesorNo(MMBIOYes, MMBIONo,MonthlybenefitIncrease);
			$(BenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(benefitperiod);
			$(ResidualFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(faceamount);
			$(BaseBenefitPool).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(BaseBenefitpool);
			if($(BasePaidToPoolYes).isEnabled()){
				selectRadioYesorNo(BasePaidToPoolYes, BasePaidToPoolNo,DividendsBaseBenefit);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
	}
}
