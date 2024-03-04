package pageclass;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class Workbench_Launch extends GlobalCap{
	public Workbench_Launch() {
		System.out.println("Launching workbench");
	}

	By userIDInputField = By.xpath("//input[@id='idp-discovery-username']");
	By OktaUserID = By.xpath("//h2[text()='Login']//following::input[1]");
	By OktaNext = By.xpath("//input[@value = 'Next']");
	By OktaPassword = By.xpath("//h2[text()='Verify with your password']//following::input[1]");
	By OktaVerify = By.xpath("//h2[text()='Verify with your password']//following::input[2]");

	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	public void enterUserIDClickNext() {
		$(OktaUserID).shouldBe(Visible.exist, Duration.ofSeconds(10))
				.setValue(testPropertyFileRead.getThePropertyValue("workBenchusername"));
		$(OktaNext).click();
	}

	public void enterPasswordClickVerify() {
		$(OktaPassword).shouldBe(Visible.exist, Duration.ofSeconds(10))
				.setValue(testPropertyFileRead.getThePropertyValue("workBenchpassword"));
		$(OktaVerify).click();
	}

}
