package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class productwholelife extends GlobalCap {
	By AutomaticPremiumLoan_Yes = By.xpath("//input[@id='rdo_57_1']");
	By AutomaticPremiumLoan_No = By.xpath("//input[@id='rdo_57_2']");

	By LoanRate_Yes = By.xpath("//input[@id='rdo_62_1']");
	By LoanRate_No = By.xpath("//input[@id='rdo_62_2']");

	By DividendOption = By.xpath("//select[@id='lb_61']");

	By WaiverxofPremium_Disability_Rider_Yes = By.xpath("//input[@id='rdo_386_1']");
	By WaiverxofPremium_Disability_Rider_No = By.xpath("//input[@id='rdo_386_2']");

	By Alternate_AdditionalPolicy = By.xpath("//select[@id='lb_77']");
	By Plan_Product_alt = By.xpath("//select[@alt_id='ProductNameAlt']");
	By Plan_Product_add = By.xpath("//select[@alt_id='ProductNameAdd']");

	By Rider_LTCR = By.xpath("//input[@alt_id='WL_LTCR']");
	By Renwel_TermRider = By.xpath("//input[@alt_id='WL_RTR']");
	By Rider_ALIR = By.xpath("//input[@alt_id='WL_ALIR']");
	By PlannedALIR = By.xpath("//input[@alt_id='WL_PlannedALIR']");
	
	By RTRAmount = By.xpath("//input[@alt_id='WL_RTRAmount']");
	By ALIRModalAmount = By.xpath("//input[@alt_id='WL_ALIRModalAmount']");
	By ModalPaymentclick = By.xpath("//label[contains(text(),'Modal Payment')]");
	By ALIRNumYears = By.xpath("//input[@alt_id='WL_ALIRNumYears']");
	By ALIRLumpSumAmount = By.xpath("//input[@alt_id='WL_ALIRLumpSumAmount']");
	
	By SameasBasePolicy = By.xpath("//input[@alt_id='WL_ALIRDivOption_1']");
	By PaidupAdditon = By.xpath("//input[@alt_id='WL_ALIRDivOption_2']");
	By Planned_ALIR = By.xpath("//input[@alt_id='WL_PlannedALIR']");
	By Planned_ALIRModalAmount = By.xpath("//input[@alt_id='WL_PlannedALIRAmount']");
	By Planned_ALIRNumYears = By.xpath("//input[@alt_id='WL_PlannedALIRNumYears']");
	
	By ALIRModal1035_Yes = By.xpath("//input[@alt_id='WL_ALIRModal1035_1']");
	By ALIRModal1035_No = By.xpath("//input[@alt_id='WL_ALIRModal1035_2']");
	
	By ALIRLump1035_Yes = By.xpath("//input[@alt_id='WL_ALIRLump1035_1']");
	By ALIRLump1035_No = By.xpath("//input[@alt_id='WL_ALIRLump1035_1']");
	
	By PlannedALIR1035_Yes = By.xpath("//input[@alt_id='WL_PlannedALIR1035_1']");
	By PlannedALIR1035_No = By.xpath("//input[@alt_id='WL_PlannedALIR1035_2']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	
	By GIRriderCK=By.xpath("//input[@id='cb_24']");
	By GIR_Amount=By.xpath("//input[@id='flda_23']");
	
	By LISR_CK=By.xpath("//input[@id='cb_15']");
	By LISR_Amount=By.xpath("//input[@id='flda_37']");
	By LISR_ModalPayment=By.xpath("//input[@id='flda_33']");
	By LISR_Lumsum=By.xpath("//input[@id='flda_65']");
	By LISR_1035=By.xpath("//input[@id='rdo_67_2']");
	
	By LISRUnscheduledLumpSum=By.xpath("//label[@id='lbl_36']");
	

	public void wholelife(String AutomaticPremiumLoan, String LoanRate, String dividendoption) {
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

	public void OptionalRiders(String Waiver, String Rider_Ltcr, String RenwalTermRider, String RenwalTermRideramount,String GIR,String GIRAmount,String LISR,String LISRamount,String LISRModalPayment,
			String LISRlumsum,String ALIR, String ModalPayment,String ALIRModal1035, String no_of_years, String lumpsum,String ALIRLump1035, String DividendOption,
			String PlannedAiIR, String one035funds, String AlternateAdditionalPolicy, String Plan_Product_Alt,
			String Plan_Product_Add) {
		if($(WaiverxofPremium_Disability_Rider_Yes).isEnabled()){
			selectRadioYesorNo(WaiverxofPremium_Disability_Rider_Yes, WaiverxofPremium_Disability_Rider_No, Waiver);
		}
		
		if($(Rider_LTCR).isEnabled()){
			if (Rider_Ltcr.equalsIgnoreCase("Yes")) {
				$(Rider_LTCR).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
		}
		if($(Renwel_TermRider).isEnabled()){
			if (RenwalTermRider.equalsIgnoreCase("Yes")) {
				$(Renwel_TermRider).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(RTRAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(RenwalTermRideramount);
			}
		}
		
		if(GIR.equalsIgnoreCase("Yes")){
			if($(GIRriderCK).isEnabled()){
				$(GIRriderCK).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(GIR_Amount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(GIRAmount);
			}
		}
		
		if(LISR.equalsIgnoreCase("Yes")){
			if($(LISR_CK).isEnabled()){
				$(LISR_CK).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(LISR_Amount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(LISRamount);
				$(LISR_ModalPayment).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(LISRModalPayment);
				$(LISR_Lumsum).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(LISRlumsum);
				GlobalCap.sleep(400);
				$(LISRUnscheduledLumpSum).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
				GlobalCap.sleep(400);
				if($(LISR_1035).isDisplayed()){
					$(LISR_1035).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				}
				
			}
				
		}
		
		
		if($(Rider_ALIR).isEnabled()){
			if (ALIR.equalsIgnoreCase("Yes")) {
				$(Rider_ALIR).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(ALIRModalAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(ModalPayment);
				$(ModalPaymentclick).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
				GlobalCap.sleep(1000);
				if($(ALIRModal1035_Yes).isDisplayed()){
					selectRadioYesorNo(ALIRModal1035_Yes, ALIRModal1035_No, ALIRModal1035);
				}
				
				$(ALIRNumYears).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(no_of_years);
				$(ALIRLumpSumAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(lumpsum);
				$(ModalPaymentclick).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
				GlobalCap.sleep(500);
				if($(ALIRLump1035_Yes).isDisplayed()){
					selectRadioYesorNo(ALIRLump1035_Yes, ALIRLump1035_No, ALIRLump1035);
				}
				if (DividendOption.equalsIgnoreCase("SameasBasePolicy")) {
					$(SameasBasePolicy).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				} else {
					$(PaidupAdditon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				}
			}
		}
		if($(Planned_ALIR).isEnabled()){
			if (PlannedAiIR.equalsIgnoreCase("Yes")) {
				$(Planned_ALIR).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(Planned_ALIRModalAmount).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(ModalPayment);
				$(Planned_ALIRNumYears).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(no_of_years);
				selectRadioYesorNo(PlannedALIR1035_Yes, PlannedALIR1035_No, one035funds);
			}
		}
		$(Alternate_AdditionalPolicy).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AlternateAdditionalPolicy);
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
