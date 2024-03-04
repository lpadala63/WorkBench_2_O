package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

public class VULproduct {

	By Frequency_dd = By.xpath("//select[@id='lb_413']");
	By PlannedPremium = By.xpath("//*[@id='flda_412']");
	// error message - Planned Premium cannot be less than $20
	By Non_1035UnscheduledPremium = By.xpath("//input[@id='flda_417']");
	By DeathBenefitOption = By.xpath("//select[@id='lb_428']");
	By CashValueAccumulationTest = By.xpath("//input[@id='rdo_441_1']");
	By GuidelinePremiumTest = By.xpath("//input[@id='rdo_441_2']");

	//Riders
	By WaiverSpecificPremiumRider = By.xpath("//input[@id='cb_457']");
	By WaiverSpecificPremiumRiderAmount = By.xpath("//input[@id='flda_459']");
	
	By WaiverMonthlyCharge = By.xpath("//input[@id='cb_495']");
	By WaiverMonthlyChargeAmount = By.xpath("//input[@id='flda_459']");
	
	By DisabilityBenefitRider = By.xpath("//input[@id='cb_498']");
	By DisabilityBenefitRiderAmount = By.xpath("//input[@id='flda_510']");
	
	By OtherRider = By.xpath("//input[@id='cb_502']");
	By OtherRiderName = By.xpath("//input[@id='flda_504']");
	By OtherRiderAmount = By.xpath("//input[@id='flda_505']");
	
	By Intialpremium= By.xpath("//input[@alt_id='UL_Initial_Premium']");
	
	
	By pul_Next = By.xpath("//*[@id='btn_39']");
	By pul_Back = By.xpath("//*[@id='btn_40']");

	public void enterproductUL(String Frequency,String intialpremium, String PlannedPremiumamount, String UnsheduledPremium1035,
			String DeathBenefitOption_DD, String DefinitionOfLifeInsurance) {

		// making sure application navigates to Product UL page
		$(Frequency_dd).shouldBe(Visible.exist, Duration.ofSeconds(60));
		// Frequency
		$(Frequency_dd).selectOptionByValue(Frequency);
		// intial premium
		if($(Intialpremium).isDisplayed()){
			$(Intialpremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(intialpremium);
		}
		if ($(PlannedPremium).isEnabled()) {
			$(PlannedPremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(PlannedPremiumamount);
			
		}
		if ($(Non_1035UnscheduledPremium).isEnabled()) {
			$(Non_1035UnscheduledPremium).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.sendKeys(UnsheduledPremium1035);
		}
		if ($(DeathBenefitOption).isEnabled()) {
			$(DeathBenefitOption).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionByValue(DeathBenefitOption_DD);
		}
		if (DefinitionOfLifeInsurance.equalsIgnoreCase("Cash Value Accumulation Test")) {
			$(CashValueAccumulationTest).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		} else if (DefinitionOfLifeInsurance.equalsIgnoreCase("Guideline Premium Test")) {
			$(GuidelinePremiumTest).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
	}
	
	public void VulOptionalRiders(String SpecificPremiumRider,String MonthlyChargeRider,String DisabilityRdier,String otherRider,String SpecificPremiumRiderAmount,String DiBenefitRiderAmount,String RiderAmount,String RiderName){
		if(SpecificPremiumRider.equalsIgnoreCase("Yes")){
			if ($(WaiverSpecificPremiumRider).isEnabled()) {
				$(WaiverSpecificPremiumRider).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(WaiverSpecificPremiumRiderAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(SpecificPremiumRiderAmount);
			}
			
		}
		if(MonthlyChargeRider.equalsIgnoreCase("Yes")){
			if ($(WaiverMonthlyCharge).isEnabled()) {
				$(WaiverMonthlyCharge).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				
			}
		}
		if(DisabilityRdier.equalsIgnoreCase("Yes")){
			if ($(DisabilityBenefitRider).isEnabled()) {
				$(DisabilityBenefitRider).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(DisabilityBenefitRiderAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DiBenefitRiderAmount);
			}
		}
		if(otherRider.equalsIgnoreCase("Yes")){
			if ($(OtherRider).isEnabled()) {
				$(OtherRider).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
				$(OtherRiderName).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RiderName);
				$(OtherRiderAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RiderAmount);
			}
		}
	}
}


