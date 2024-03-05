package testclass;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.qameta.allure.selenide.AllureSelenide;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber/cucumber-html-report",
		"junit:target/cucumber/cucumber-junit-report.xml", "json:target/cucumber/cucumber.json",
		"io.qameta.allure.cucumberjvm.AllureCucumberJvm",
		"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepdefinitions", features = "src/test/resources/features", tags = {
				"@INSWB-156" }, monochrome = true)

public class BaseTest {

	@BeforeClass
	public static void setupAllureReports() {
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
	}

	@AfterClass
	public static void extentReportGenerate() {
		Reporter.loadXMLConfig(new File("extentfile.xml"));
		Reporter.addStepLog("in the extent report");
	}

}
