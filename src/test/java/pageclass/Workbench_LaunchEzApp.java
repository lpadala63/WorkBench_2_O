package pageclass;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class Workbench_LaunchEzApp extends GlobalCap{
	public Workbench_LaunchEzApp(){
		System.out.println("😀 😀 😀 😀 😀  OrderEntrying in WorkBench 😀 😀 😀 😀 😀");
	}
	By userIDInputField = By.xpath("//input[@id='idp-discovery-username']");
	By OktaUserID = By.xpath("//h2[text()='Login']//following::input[1]");
	By OktaNext = By.xpath("//input[@value = 'Next']");
	By OktaPassword = By.xpath("//h2[text()='Verify with your password']//following::input[1]");
	By OktaVerify = By.xpath("//h2[text()='Verify with your password']//following::input[2]");
	By FieldnetDev_chicklet = By.xpath("//span[text()='FieldNet Dev']");
	By nextButton = By.xpath("//input[@id='idp-discovery-submit']");
	By passwordInputField = By.xpath("//input[@class='password-with-toggle']");
	By verifyButton = By.xpath("//input[@value='Verify']");
	By username_fd = By.xpath("//*[@name='j_username']");
	By password_fd = By.xpath("//*[@name='j_password']");
	By login_fd = By.xpath("//img[@src='/fldnet/fnmmfg/images/login_submit.gif']");
	By submitNewBusinesslnk = By.xpath("//a[text()='Submit New Business']");
	By insuranceworkbenchlnk = By.xpath("//a[@id='ez_a']");
	By producerIdRadioBtn = By.xpath("//*[@id='WorkBenchForm_ez_']/input[3]");
	By producerInput = By.xpath("//*[@id='WorkBenchForm_ez_']/input[4]");
	By searchBtn = By.xpath("//form[@id= 'WorkBenchForm_ez_']/child::input[@id='submitButton']");
	By plusIconSubmitNB_btn = By.xpath("//button[@class= 'newAppButtonAdmin' and @name= 'wbModalButton']");
	By environment = By.xpath("//select[@name= 'newEZappChoice']");
	By continueBtnEnv = By.xpath("//input[@id='selectEZappProducerButtonAdmin']");
	By directusername = By.xpath("//input[@id='username']");
	By directpass = By.xpath("//input[@id='password']");
	By StartNewCase = By.xpath("//a[@id='newcase-button']");
	By login = By.xpath("//button[@id='btnLogin']");

	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	public void enterUserIDClickNext() {
	
		//$(directusername).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(testPropertyFileRead.getThePropertyValue("Directusername"));
		$(OktaUserID).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(testPropertyFileRead.getThePropertyValue("workBenchusername"));
		$(OktaNext).click();
	}

	public void enterPasswordClickVerify() {
		/*$(directpass).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(testPropertyFileRead.getThePropertyValue("Directpassword"));
		$(login).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();*/
		$(OktaPassword).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(testPropertyFileRead.getThePropertyValue("workBenchpassword"));
		$(OktaVerify).click();
	}

	public void clickOnFieldnetDev() {
	//	$(StartNewCase).shouldBe(Visible.exist, Duration.ofSeconds(40)).click();
		$(FieldnetDev_chicklet).shouldBe(Visible.exist, Duration.ofSeconds(40)).click();
		switchToWindow(1);
	}

	public void enterProducerNumberClickSearch(String ProducerID) {
		js.executeScript("window.scrollBy(0,750)", "");
		$(submitNewBusinesslnk).shouldBe(Visible.exist, Duration.ofSeconds(50)).click();
		$(insuranceworkbenchlnk).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(producerIdRadioBtn).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		System.out.println(ProducerID);
		$(producerInput).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(ProducerID);
		$(searchBtn).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		switchToWindow(2);
	}

	public void clickonSubmitNewBusinessWB(String Environment) {
		$(plusIconSubmitNB_btn).shouldBe(Visible.exist, Duration.ofSeconds(120));
		GlobalCap.sleep(7000);
		$(plusIconSubmitNB_btn).shouldBe(Visible.exist, Duration.ofSeconds(90)).click();
		$(environment).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(Environment);
		$(continueBtnEnv).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		switchToWindow(3);
		//HooksTest.idriver.navigate().refresh();

	}

}
