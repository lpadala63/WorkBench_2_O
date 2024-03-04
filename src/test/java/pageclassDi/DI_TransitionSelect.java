package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class DI_TransitionSelect {
	
	By MonthlyBenefit= By.xpath("//input[@alt_id='TS_Amount']");
	By WaitingPeriod= By.xpath("//select[@alt_id='TS_WaitingPeriod']");
	By heading = By.xpath("//span[contains(text(),'Complete Age 65 Plus (2 Year Benefit Period Only)')]");
	By TSNext= By.xpath("//button[@alt_id='btnNext' or @name='btn_76']");
	
	public void Transition(String Product, String MB, String WP){
		
		GlobalCap.pageload(40);
		
		if ($(heading).isDisplayed()) {
			$(MonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(MB);
			$(WaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(WP);
			$(TSNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}
	}


