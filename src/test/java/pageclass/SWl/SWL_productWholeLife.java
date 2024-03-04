package pageclass.SWl;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class SWL_productWholeLife extends GlobalCap{
   
	By AutomaticPremiumLoan_Yes = By.xpath("//input[@id='rdo_57_1']");
	By AutomaticPremiumLoan_No = By.xpath("//input[@id='rdo_57_2']");

	By LoanRate_Yes = By.xpath("//input[@id='rdo_62_1']");
	By LoanRate_No = By.xpath("//input[@id='rdo_62_2']");

	By DividendOption = By.xpath("//select[@id='lb_61']");
	
	By disablityRiderinsured1=By.xpath("//span[@id='lbl_390']");
	By disablityRiderinsured2=By.xpath("//span[@id='lbl_391']");
	
	By DeathofSpecifiedInsuredinsured1=By.xpath("//span[@id='lbl_394']");
	By DeathofSpecifiedInsuredinsured2=By.xpath("//span[@id='lbl_393']");
	
	By ALIR=By.xpath("//span[contains(text(),'ALIR')]");
	
	By ALIRModalAmount=By.xpath("//input[@alt_id='WL_ALIRModalAmount']");	
	By ALIRLumpSumAmount=By.xpath("//input[@alt_id='WL_ALIRLumpSumAmount']");
	
	By ALIRDivOption_BP=By.xpath("//input[@alt_id='WL_ALIRDivOption_1']");
	By ALIRDivOption_PD=By.xpath("//input[@alt_id='WL_ALIRDivOption_2']");
	
	By EstateProtectionRider_Yes=By.xpath("//input[@alt_id='WL_EPRS_1']");
	By EstateProtectionRider_No=By.xpath("//input[@alt_id='WL_EPRS_2']");	
	
	
	By WaiverxofPremium_Disability_Rider_Yes = By.xpath("//input[@id='rdo_386_1']");
	By WaiverxofPremium_Disability_Rider_No = By.xpath("//input[@id='rdo_386_2']");
	By Plan_Product_alt = By.xpath("//select[@alt_id='ProductNameAlt']");
	By Plan_Product_add = By.xpath("//select[@alt_id='ProductNameAdd']");
	By Alternate_AdditionalPolicy = By.xpath("//select[@id='lb_77']");
	//select[@id='lb_430']
	By UL_Alternate_AdditionalPolicy = By.xpath("//select[@id='lb_430']");
	By SWlHeading = By.xpath("//h1[@id='lbl_12']");
	By SulHeading = By.xpath("//h1[contains(text(),'Universal Life')]");
	By Frequency = By.xpath("//select[@id='lb_399' or name='lb_399']");
	By PlanedFrequency = By.xpath("//input[@id='flda_448' or @name='flda_448']");
	By Non_135_unschedule = By.xpath("//input[@id='flda_450']");
	By estateprotectionRider = By.xpath("//input[@id='cb_443']");
	By riderAmount = By.xpath("//input[@id='flda_444']");
	By Next = By.xpath("//button[@id='btn_39']");
public void wholelife(String AutomaticPremiumLoan, String LoanRate, String dividendoption) {
		if($(SWlHeading).isDisplayed()){

			if (AutomaticPremiumLoan.equalsIgnoreCase("Yes")) {
				$(AutomaticPremiumLoan_Yes).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				 
			} else {
				$(AutomaticPremiumLoan_No).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}

			if (LoanRate.equalsIgnoreCase("Fixed")) {
				$(LoanRate_Yes).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				 
			} else {
				$(LoanRate_No).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			$(DividendOption).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(dividendoption);
	
		}
	}

	public void SULProduct(String frequency, String PlannedPremium, String NON_Premium, String Rider, String Amount,String AlternateAdditionalPolicy,String Plan_Product_Alt,String Plan_Product_Add) {
		if ($(SulHeading).isDisplayed()) {
			$(Frequency).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(frequency);
			GlobalCap.sleep(1000);
			if (!frequency.equalsIgnoreCase("Single Premium")) {
				$(PlanedFrequency).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PlannedPremium);
			}
			$(Non_135_unschedule).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(NON_Premium);
			if (Rider.equalsIgnoreCase("Yes")) {
				$(estateprotectionRider).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				GlobalCap.sleep(1000);
				$(riderAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Amount);
			}
			
			$(UL_Alternate_AdditionalPolicy).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(AlternateAdditionalPolicy);
			if (AlternateAdditionalPolicy.equalsIgnoreCase("Alternate")) {
				$(Plan_Product_alt).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Alt);
				GlobalCap.sleep(30000);
			} else if (AlternateAdditionalPolicy.equalsIgnoreCase("Additional")) {
				$(Plan_Product_add).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Add);
				GlobalCap.sleep(30000);
			} else if (AlternateAdditionalPolicy.equalsIgnoreCase("Both")) {
				$(Plan_Product_alt).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Alt);
				$(Plan_Product_add).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Add);
				GlobalCap.sleep(40000);
			}
			GlobalCap.sleep(7000);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

	}

	public void OptionalRiders(String Product, String Alir, String ModalAmount, String LumpAmount,
			String DividentOption, String EstateProtectionRider, String AlternateAdditionalPolicy,String Plan_Product_Alt,String Plan_Product_Add ) {
		if ($(SWlHeading).isDisplayed()) {

			if ($(disablityRiderinsured1).isDisplayed()) {
				$(disablityRiderinsured1).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			if ($(disablityRiderinsured2).isDisplayed()) {
				$(disablityRiderinsured2).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			/*
			 * if(!Product.equalsIgnoreCase("Survivorship Whole Life 100")){
			 * $(DeathofSpecifiedInsuredinsured1).shouldBe(Visible.exist,
			 * Duration.ofSeconds(30)).click();
			 * 
			 * 
			 * $(DeathofSpecifiedInsuredinsured2).shouldBe(Visible.exist,
			 * Duration.ofSeconds(30)).click(); }
			 */
			if (Alir.equalsIgnoreCase("Yes")) {
				$(ALIR).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(ALIRModalAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ModalAmount);
				$(ALIRLumpSumAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LumpAmount);
				if (DividentOption.equalsIgnoreCase("Same as base policy")) {
					$(ALIRDivOption_BP).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				} else if (DividentOption.equalsIgnoreCase("Paid-up Additions (PD)")) {
					$(ALIRDivOption_PD).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				}

			}
			selectRadioYesorNo(EstateProtectionRider_Yes, EstateProtectionRider_No, EstateProtectionRider);
			$(Alternate_AdditionalPolicy).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(AlternateAdditionalPolicy);
			
			if (AlternateAdditionalPolicy.equalsIgnoreCase("Alternate")) {
				$(Plan_Product_alt).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Alt);
				GlobalCap.sleep(30000);
			} else if (AlternateAdditionalPolicy.equalsIgnoreCase("Additional")) {
				$(Plan_Product_add).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Add);
				GlobalCap.sleep(30000);
			} else if (AlternateAdditionalPolicy.equalsIgnoreCase("Both")) {
				$(Plan_Product_alt).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Alt);
				$(Plan_Product_add).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Add);
				GlobalCap.sleep(40000);
			}
			GlobalCap.sleep(7000);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(150)).click();
		}
			

		
	}
	
}
