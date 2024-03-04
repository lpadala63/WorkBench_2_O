package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class MMSD_DI_PersonalHistoryCont extends GlobalCap {

	By Anticipate2yr_Yes =By.xpath("//span[text()='Yes']//preceding::input[@id='rdo_4_1']");
	By Anticipate2yr_No = By.xpath("//span[text()='No']//preceding::input[@id='rdo_4_2']");
	By ArmedForces_Yes = By.xpath("//span[text()='Yes']//preceding::input[@id='rdo_6_1']");
	By ArmedForces_No = By.xpath("//span[text()='Yes']//preceding::input[@id='rdo_6_2']");
	By yr3PilotAircraft_Yes = By.xpath("//span[text()='Yes']//preceding::input[@id='rdo_8_1']");
	By yr3PilotAircraft_No =By.xpath( "//span[text()='No']//preceding::input[@id='rdo_8_2']");
	By HangGliding_No= By.xpath("//input[@alt_id='UW_Q12a_2']");
	By UWDiving= By.xpath("//label//input[@alt_id='UW_Q12_2' and @value='No']");
	//By underwriting2yr3yr_Yes =By.xpath( "//span[text()='Yes']//preceding::input[@id='rdo_10_1']");
	//By underwriting2yr3yr_No = By.xpath("//span[text()='No']//preceding::input[@id='rdo_10_2']");
	By Textarea=By.xpath("//label[text()='Details. Please indicate question.']//following::textarea");
	By Next=By.xpath("//button[@id='btn_30' or @name='btn_30']");
	
	public  void proposedinsureQuestions(String Anticipate2yr,String ArmedForces,String yr3PilotAircraft,String underwriting2yr3yr,String text ){
		
		GlobalCap.selectRadioYesorNo(Anticipate2yr_Yes, Anticipate2yr_No, Anticipate2yr);
		GlobalCap.selectRadioYesorNo(ArmedForces_Yes, ArmedForces_No, ArmedForces);
		GlobalCap.selectRadioYesorNo(yr3PilotAircraft_Yes, yr3PilotAircraft_No, yr3PilotAircraft);
//		$(HangGliding_No).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(UWDiving).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		//GlobalCap.selectRadioYesorNo(underwriting2yr3yr_Yes, underwriting2yr3yr_No, underwriting2yr3yr);
		
		$(Textarea).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(text);
		
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
	}

}
