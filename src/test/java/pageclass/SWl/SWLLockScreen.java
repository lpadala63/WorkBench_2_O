package pageclass.SWl;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;
import utilities.GetDataFromExcel;
public class SWLLockScreen extends GlobalCap {
		// div[@id='div_34']//following-sibling::div

		By LAU_Lock = By.xpath("//button[@id='btn_8']");
		By LAU_BasePolicyNumber = By.xpath("//div[@id='div_34']//following-sibling::div");
		By LAU_ConcurPolicyNumber = By.xpath("//div[@class='alert alert-info' and contains(.,'Concur')]");
		By LAU_BACK = By.xpath("//*[@id='btn_2']");
		By LAU_NEXT = By.xpath("//button[contains(text(),'Next')]");
		By LAU_PolicyNumber = By.xpath("//div[@id='lbl_34']");
		// div[@id='lbl_34']
		By return_to = By.xpath("//*[@id='btn_16']");
		By base_policy = By.xpath("//*[@id='lbl_34']");
		By base_policy_number = By.xpath("//*[contains(text(),'Base Policy')]");
		By app_links = By.xpath("//*[@id='collapse_Application']/div/a");
		By q_marks = By.xpath("//span[@class='fa fa-lg fa-question']");
		By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
		JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;
		Actions ac = new Actions(HooksTest.idriver);
		By ssn = By.xpath("//*[@id='flda_109']");
		By check_mark = By.xpath("//div[@id='lbl_54']/i[@aria-hidden='true']");
		By Esign = By.xpath("//input[@id='cb_66' and @name='cb_66']");
		//SWL_esignscreen esign = new SWL_esignscreen();
		SWL_esignscreen esign= new SWL_esignscreen();
//		WetSign wsign = new WetSign();
		
		
		By WetSign = By.xpath("//input[@id='cb_99' or @alt_id='chkPrintSub']");
		By AlertOK = By.xpath("//button[text()='OK']");
		By Next = By.xpath("//button[@id='btn_6' or @name='btn_6']");
		By InsuredMM = By.xpath("//div[@id='date_39'] //following::input[1]");
		By InsuredDD = By.xpath("//div[@id='date_39'] //following::input[2]");
		By InsuredYYYY = By.xpath("//div[@id='date_39'] //following::input[3]");
		By ProducerMM = By.xpath("//div[@id='date_41'] //following::input[1]");
		By ProducerDD = By.xpath("//div[@id='date_41'] //following::input[2]");
		By ProducerYYYY = By.xpath("//div[@id='date_41'] //following::input[3]");
		By Submit = By.xpath("//button[@id='btn_23' or @name='btn_23']");
		By SubmitNY = By.xpath("//button[contains(text(),'Submit Application')]");
		By Label = By.xpath("//h1[@id='lbl_21']");
		GetDataFromExcel testdata = new GetDataFromExcel();

		public void addInfo_Next(int rowNum) {
			// $(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(60));

			// HooksTest.idriver.switchTo().frame($(ciPageFrame));
			// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

			$(LAU_Lock).shouldBe(Visible.exist, Duration.ofSeconds(60));
			if ($(LAU_Lock).isDisplayed()) {
				$(LAU_Lock).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(LAU_BasePolicyNumber).shouldBe(Visible.exist, Duration.ofSeconds(60));

				String base_policy_no = $(LAU_BasePolicyNumber).getText();
				System.out.println(base_policy_no);

				String policynumber = base_policy_no.replaceAll("[^0-9]", "");

				testdata.setCellData("EzApp_WholeLife_TestData", "CCOne", "Policy_Number", rowNum, policynumber);

				$(LAU_NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			}
		}

		public void signature(String SignType, String InsIDproof, String InsIdNum,String IdproofIns2,String IdNumberIns2,String insd2signedcity,
				String insd2signedState,String InsMM, String InsDD, String InsYYYY, String ProdMM, String ProdDD,
				String ProdYYYY) {
			if (SignType.equalsIgnoreCase("Esign")) {
				GlobalCap.signature(Esign, WetSign, SignType);
				esign.ESignInsured(InsIDproof, InsIdNum,IdproofIns2,IdNumberIns2,insd2signedcity,insd2signedState);
				esign.ESignProducer();

			}
			else if (SignType.equalsIgnoreCase("WetSign")) {
				GlobalCap.signature(Esign, WetSign, SignType);

				$(AlertOK).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				GlobalCap.sleep(1000);
				$(InsuredMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(InsMM);
				GlobalCap.sleep(1000);
				$(InsuredDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(InsDD);
				GlobalCap.sleep(1000);
				$(InsuredYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(InsYYYY);
				GlobalCap.sleep(1000);
				$(ProducerMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProdMM);
				GlobalCap.sleep(1000);
				$(ProducerDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProdDD);
				GlobalCap.sleep(1000);
				$(ProducerYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProdYYYY);
				GlobalCap.sleep(1000);
				$(Label).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				if($(SubmitNY).isDisplayed()){
				$(SubmitNY).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
				else{			
				$(Submit).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
			}
		}
	}


