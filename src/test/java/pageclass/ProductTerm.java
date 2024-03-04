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

public class ProductTerm extends GlobalCap{

	By ptl_WaiverofPremium_Yes = By.xpath("//*[@id='rdo_28_1']");
	By ptl_WaiverofPremium_No = By.xpath("//*[@id='rdo_28_2']");
	By Alternate_AdditionalPolicy = By.xpath("//*[@id='lb_20']");
	By Plan_Product_alt = By.xpath("//*[@id='lb_18']");
	By Plan_Product_add = By.xpath("//*[@id='lb_14']");
	By ptl_Next = By.xpath("//*[@id='btn_12']");
	By ptl_back = By.xpath("//*[@id='btn_13']");

	
	public void enterproductTerm(String WaiverofPremium) {
		
		// making sure the application navigates to Product Term page
		$(ptl_WaiverofPremium_Yes).shouldBe(Visible.exist, Duration.ofSeconds(60));
		
		// Waiver of Premium (for Disability) Rider
		if($(ptl_WaiverofPremium_Yes).isEnabled()){
		selectRadioYesorNo(ptl_WaiverofPremium_Yes, ptl_WaiverofPremium_No, WaiverofPremium);
		}
	}
		
		public void Altoradd( String AlternateAdditionalPolicy,String Plan_Product_Alt,String Plan_Product_Add) {
			
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
			
			$(ptl_Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			
		}

}