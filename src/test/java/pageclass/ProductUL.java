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

public class ProductUL extends GlobalCap{

	By pul_Frequency_dd = By.xpath("//*[@id='lb_413']");
	By pul_PlannedPremium = By.xpath("//*[@id='flda_412']");
	//error message - Planned Premium cannot be less than $20
	By pul_IntialPremium = By.xpath("//input[@id='flda_482']");
	By pul_1035UnsheduledPremium = By.xpath("//*[@id='flda_417']");
	By pul_WaiverofSpecifiedPremiumRider_cb = By.xpath("//*[@id='cb_457']");
	By pul_Amount = By.xpath("//*[@id='flda_459']");
	By Alternate_AdditionalPolicy = By.xpath("//*[@id='lb_475']");
	By Plan_Product_alt = By.xpath("//*[@id='lb_468']");
	By Plan_Product_add = By.xpath("//*[@id='lb_469']");
	By pul_Next = By.xpath("//*[@id='btn_39']");
	By pul_Back = By.xpath("//*[@id='btn_40']");

	
	public void enterproductUL(String Frequency,String intialPremium, String PlannedPremium, String UnsheduledPremium1035, String WaiverAmount) {
		
		// making sure application navigates to Product UL page
		$(pul_Frequency_dd).shouldBe(Visible.exist, Duration.ofSeconds(60));
		
		// Frequency
		$(pul_Frequency_dd).selectOptionByValue(Frequency);
		//intial premium
		
		if($(pul_IntialPremium).isDisplayed()){
			$(pul_IntialPremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(intialPremium);;
		}
		// Planned Premium
		if($(pul_PlannedPremium).isDisplayed()){
		$(pul_PlannedPremium).setValue(PlannedPremium);
		}
		
		// Non-1035 unscheduled premium
		$(pul_1035UnsheduledPremium).setValue(UnsheduledPremium1035);
		
		// Waiver of Specified Premium Rider
		$(pul_WaiverofSpecifiedPremiumRider_cb).click();
		
		//Amount
		$(pul_Amount).setValue(WaiverAmount);
		
				
	}

	public void AltorAdd( String AlternateAdditionalPolicy,String Plan_Product_Alt,String Plan_Product_Add) {
		
		$(Alternate_AdditionalPolicy).shouldBe(Visible.exist, Duration.ofSeconds(30))
				.selectOptionContainingText(AlternateAdditionalPolicy);
		if(AlternateAdditionalPolicy.equalsIgnoreCase("Alternate")){
			$(Plan_Product_alt).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Alt);
		}
		else if(AlternateAdditionalPolicy.equalsIgnoreCase("Additional")){
			$(Plan_Product_add).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Add);
		}
		else if(AlternateAdditionalPolicy.equalsIgnoreCase("Both")){
			$(Plan_Product_alt).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Alt);
			$(Plan_Product_add).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Plan_Product_Add);
		}
		//$(clickdivert).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		
		$(pul_Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		
	}

}
