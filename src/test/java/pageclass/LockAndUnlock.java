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

public class LockAndUnlock extends GlobalCap {
	// div[@id='div_34']//following-sibling::div
   
    
	By LAU_Lock = By.xpath("//button[@id='btn_8']");
	By LAU_BasePolicyNumber = By.xpath("//div[@id='div_34']//following-sibling::div");
	By Alt_policyNumber=By.xpath("//div[@id='div_45']//following-sibling::div");
	By ADD_policyNumber=By.xpath("//div[@id='div_44']//following-sibling::div");
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
	ESign esign = new ESign();
//	WetSign wsign = new WetSign();
	
	
	By WetSign = By.xpath("//input[@id='cb_99' or @alt_id='chkPrintSub']");
	By AlertOK = By.xpath("//button[text()='OK']");
	By Next = By.xpath("//button[@id='btn_6' or @name='btn_6']");
	By Apex_Next = By.xpath("//button[@id='btn_5' or @name='btn_5']");
	By InsuredMM = By.xpath("//div[@id='date_39'] //following::input[1]");
	By InsuredDD = By.xpath("//div[@id='date_39'] //following::input[2]");
	By InsuredYYYY = By.xpath("//div[@id='date_39'] //following::input[3]");
	By PrintapplicationClick = By.xpath("//h1[@id='lbl_21']");
	By ProducerMM = By.xpath("//div[@id='date_41'] //following::input[1]");
	By ProducerDD = By.xpath("//div[@id='date_41'] //following::input[2]");
	By ProducerYYYY = By.xpath("//div[@id='date_41'] //following::input[3]");
	
	By OwnerProducerMM = By.xpath("//div[@id='div_44'] //following::input[2]");
	By OwnerProducerDD = By.xpath("//div[@id='div_44'] //following::input[3]");
	By OwnerProducerYYYY = By.xpath("//div[@id='div_44'] //following::input[4]");
	
	By PlanSponsorMM = By.xpath("//div[@id='div_68'] //following::input[2]");
	By PlanSponsorDD = By.xpath("//div[@id='div_68'] //following::input[3]");
	By PlanSponsorYYYY = By.xpath("//div[@id='div_68'] //following::input[4]");
	
	By OwnerWet=By.xpath("//label[contains(text(),'Proposed Owner Signed on:')]");
	
	By plansponosr =By.xpath("//label[contains(text(),'Plan Sponsor Signed on:')]");
	
	
	By Submit = By.xpath("//div[@id='div_23']//button[contains(text(),'Submit')]");
	By SubmitNY = By.xpath("//button[contains(text(),'Submit Application')]");
	By Label = By.xpath("//h1[@id='lbl_21']");
	By name = By.xpath("//span[@id='header_client_name']");
	By Frame = By.xpath("//iframe[@id='CossScreenFrame']");
	GetDataFromExcel testdata = new GetDataFromExcel();
	TestPropertyFileRead testPropertyFileRead = new TestPropertyFileRead();
	//LTC
	String MainPolicyNumber,Alternatepolicy,AdditionalPolicy;
	
	String writeFilename= testPropertyFileRead.getThePropertyValue("WriteFilename");
	//String writeSheetname= testPropertyFileRead.getThePropertyValue("WriteSheetname");
	String writeSheetname=System.getenv("PolicyInfo_SheetName");
	
	public void LockScreen(int rowNum, String Product) {
		
		
		HooksTest.idriver.switchTo().defaultContent();
		$(name).shouldBe(Visible.exist, Duration.ofSeconds(60));
		String policyname = $(name).getText();
		System.out.println("The Policy Name is :" +policyname);
		testdata.setCellData(writeFilename, writeSheetname, "WL_InsuredName", rowNum, policyname);
		$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(Frame));
		$(LAU_Lock).shouldBe(Visible.exist, Duration.ofSeconds(60));
		if ($(LAU_Lock).isDisplayed()) {
			$(LAU_Lock).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if($(LAU_BasePolicyNumber).isDisplayed()){
			$(LAU_BasePolicyNumber).shouldBe(Visible.exist, Duration.ofSeconds(60));
			String BasePolicyNumber = $(LAU_BasePolicyNumber).getText();
			MainPolicyNumber = BasePolicyNumber.replaceAll("[^0-9]", "");
			System.out.println("The Main Policy Number is :" +MainPolicyNumber);
		}
		testdata.setCellData("Ez-AppUnderWriters", "Hub", "PolicyNumber", rowNum, MainPolicyNumber);
		testdata.setCellData("Ez-AppUnderWriters", "BussinesPackageCheck", "BPID", rowNum, MainPolicyNumber);
		if($(Alt_policyNumber).isDisplayed()){
			$(Alt_policyNumber).shouldBe(Visible.exist, Duration.ofSeconds(60));
			String Alternate = $(Alt_policyNumber).getText();
			Alternatepolicy = Alternate.replaceAll("[^0-9]", "");
			System.out.println("The Alternate Policy Number is :" + Alternatepolicy);
		}
		if($(ADD_policyNumber).isDisplayed()){
			$(ADD_policyNumber).shouldBe(Visible.exist, Duration.ofSeconds(60));
			String Additional = $(ADD_policyNumber).getText();
			AdditionalPolicy = Additional.replaceAll("[^0-9]", "");
			System.out.println("The Additional Policy Number is :" + AdditionalPolicy);
		}
		
		Reporter.addStepLog("The Base Policy Name is "+ policyname);

		
		Reporter.addStepLog("The Base Policy Number is "+ MainPolicyNumber);
		Reporter.addStepLog("The Alternate Policy Number is "+ Alternatepolicy);
		Reporter.addStepLog("The Additional Policy Number is "+ AdditionalPolicy);
		
		if (Product.equalsIgnoreCase("Term Life")) {
			testdata.setCellData(writeFilename, writeSheetname, "Term_InsuredName", rowNum, policyname);
			if ($(LAU_BasePolicyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "Term_PolicyNumber", rowNum, MainPolicyNumber);
			}
			if ($(Alt_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "Term_AltPolicyNumber", rowNum, Alternatepolicy);
			}
			if ($(ADD_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "Term_AddPolicyNumber", rowNum, AdditionalPolicy);
			}

		} else if (Product.equalsIgnoreCase("Universal Life")) {
			testdata.setCellData(writeFilename, writeSheetname, "UL_InsuredName", rowNum, policyname);
			if ($(LAU_BasePolicyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "UL_BasePolicyNumber", rowNum, MainPolicyNumber);
			}
			if ($(Alt_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "UL_AltPolicyNumber", rowNum, Alternatepolicy);
			}
			if ($(ADD_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "UL_AddPolicyNumber", rowNum, AdditionalPolicy);
			}
		} else if (Product.equalsIgnoreCase("Whole Life")) {
			testdata.setCellData(writeFilename, writeSheetname, "WL_InsuredName", rowNum, policyname);
			if ($(LAU_BasePolicyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "WL_BasePolicyNumber", rowNum, MainPolicyNumber);
			}
			if ($(Alt_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "WL_AltPolicyNumber", rowNum, Alternatepolicy);
			}
			if ($(ADD_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "WL_AddPolicyNumber", rowNum, AdditionalPolicy);
			}
		} else if (Product.equalsIgnoreCase("Disability Products")) {
			testdata.setCellData(writeFilename, writeSheetname, "DI_InsuredName", rowNum, policyname);
			if ($(LAU_BasePolicyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "DI_PolicyNumber", rowNum, MainPolicyNumber);
			}
			if ($(Alt_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "DI_AltPolicyNumber", rowNum, Alternatepolicy);
			}
			if ($(ADD_policyNumber).isDisplayed()) {
				testdata.setCellData(writeFilename, writeSheetname, "DI_AddPolicyNumber", rowNum, AdditionalPolicy);
			}
		}
			
			$(LAU_NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		
	}

	public void signature(String SignType, String InsIDproof, String InsIdNum,int rowNum, String Product,String OwnerInsIDproof,String OwnerInsIdNum,
			String WetsignType,String InsMM,String InsDD,String InsYYYY,String PrdMM,String PrdDD,String PrdYYYY,String OwnerMM,String OwnerDD,String OwnerYYYY, String proposedInsuredCity,String proposedinsuredstate,
			String palnsponsorMM,String palnsponsorDD,String palnsponsorYYYY) {
		
		if (SignType.equalsIgnoreCase("Esign")) {
			GlobalCap.signature(Esign, WetSign, SignType);
			esign.ESignInsured(InsIDproof, InsIdNum, OwnerInsIDproof, OwnerInsIdNum, proposedInsuredCity, proposedinsuredstate);
			esign.ESignProducer();
			
			if (Product.equalsIgnoreCase("Term Life")) {
				testdata.setCellData(writeFilename, writeSheetname, "Term_Time", rowNum, GlobalCap.Date_Time());

			} else if (Product.equalsIgnoreCase("Universal Life")) {
				testdata.setCellData(writeFilename, writeSheetname, "UL_Time", rowNum, GlobalCap.Date_Time());

			} else if (Product.equalsIgnoreCase("Whole Life")) {
				testdata.setCellData(writeFilename, writeSheetname, "WL_Time", rowNum, GlobalCap.Date_Time());

			} else if (Product.equalsIgnoreCase("Disability Products")) {
				testdata.setCellData(writeFilename, writeSheetname, "DI_Time", rowNum, GlobalCap.Date_Time());

			}
			

		} else if (SignType.equalsIgnoreCase("WetSign")) {
			if($(WetSign).isDisplayed()){
				GlobalCap.signature(Esign, WetSign, SignType);

				$(AlertOK).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			}else{By ApexWetSign=By.xpath("//input[@id='rdo_12_2']");
				$(ApexWetSign).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(Apex_Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			
			

			GlobalCap.sleep(1000);
			if (WetsignType.equalsIgnoreCase("CurrentDate")) {
				$(InsuredMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Month());
				GlobalCap.sleep(1000);
				$(InsuredDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Date());
				GlobalCap.sleep(1000);
				$(InsuredYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Year());
				GlobalCap.sleep(1000);
				$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				
				$(ProducerMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Month());
				GlobalCap.sleep(1000);
				$(ProducerDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Date());
				GlobalCap.sleep(1000);
				$(ProducerYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Year());
				GlobalCap.sleep(1000);
				$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				
				if ($(OwnerWet).isDisplayed()) {
					GlobalCap.sleep(1000);
					$(OwnerProducerMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Month());
					GlobalCap.sleep(1000);
					$(OwnerProducerDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Date());
					GlobalCap.sleep(1000);
					$(OwnerProducerYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Year());
					GlobalCap.sleep(1000);
					$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
				
				if ($(plansponosr).isDisplayed()) {
					GlobalCap.sleep(1000);
					$(PlanSponsorMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Month());
					GlobalCap.sleep(1000);
					$(PlanSponsorDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Date());
					GlobalCap.sleep(1000);
					$(PlanSponsorYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(GlobalCap.Year());
					GlobalCap.sleep(1000);
					$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
			}else if(WetsignType.equalsIgnoreCase("PastDate")){
				$(InsuredMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(InsMM);
				GlobalCap.sleep(1000);
				$(InsuredDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(InsDD);
				GlobalCap.sleep(1000);
				$(InsuredYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(InsYYYY);
				GlobalCap.sleep(1000);
				$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(ProducerMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(PrdMM);
				GlobalCap.sleep(1000);
				$(ProducerDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(PrdDD);
				GlobalCap.sleep(1000);
				$(ProducerYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(PrdYYYY);
				GlobalCap.sleep(1000);
				$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				if ($(OwnerWet).isDisplayed()) {
					GlobalCap.sleep(1000);
					$(OwnerProducerMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(OwnerMM);
					GlobalCap.sleep(1000);
					$(OwnerProducerDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(OwnerDD);
					GlobalCap.sleep(1000);
					$(OwnerProducerYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(OwnerYYYY);
					GlobalCap.sleep(1000);
					$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
				
				if ($(plansponosr).isDisplayed()) {
					GlobalCap.sleep(1000);
					$(PlanSponsorMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(palnsponsorMM);
					GlobalCap.sleep(1000);
					$(PlanSponsorDD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(palnsponsorDD);
					GlobalCap.sleep(1000);
					$(PlanSponsorYYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(palnsponsorYYYY);
					GlobalCap.sleep(1000);
					$(PrintapplicationClick).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
			}
			
			
			
			$(Label).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			if ($(SubmitNY).isDisplayed()) {
				$(SubmitNY).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else {
				$(Submit).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if (Product.equalsIgnoreCase("Term Life")) {
				testdata.setCellData(writeFilename, writeSheetname, "Term_Time", rowNum, GlobalCap.Date_Time());

			} else if (Product.equalsIgnoreCase("Universal Life")) {
				testdata.setCellData(writeFilename, writeSheetname, "UL_Time", rowNum, GlobalCap.Date_Time());

			} else if (Product.equalsIgnoreCase("Whole Life")) {
				testdata.setCellData(writeFilename, writeSheetname, "WL_Time", rowNum, GlobalCap.Date_Time());

			} else if (Product.equalsIgnoreCase("Disability Products")) {
				testdata.setCellData(writeFilename, writeSheetname, "DI_Time", rowNum, GlobalCap.Date_Time());

			}
			
		} else if (SignType.equalsIgnoreCase("Lock")) {
			HooksTest.idriver.close();

		}
	}
}
