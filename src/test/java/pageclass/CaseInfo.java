package pageclass;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.Keys;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideTargetLocator;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class CaseInfo extends GlobalCap {

	By FirstName = By.xpath("//input[@id='txtFirstName' or @name='txtFirstName']");
	By LastName = By.xpath("//input[@id='txtLastName' or @name='txtLastName']");
	By MM = By.xpath("//*[@id='divDOB']/div/span/span[1]/input[1]");
	By DD = By.xpath("//*[@id='divDOB']/div/span/span[1]/input[2]");
	By YYYY = By.xpath("//*[@id='divDOB']/div/span/span[1]/input[3]");
	By GenderClick = By.xpath("//div[@id='divGEN']/div/button");
	
	By Description = By.xpath("//input[@id='txtCaseDescription']");
	By State = By.xpath("//div[@id='UpdatePanel1']/div/button");
	By producttypetext = By.xpath("//label[@id='lblProductType']");
	By ProductType = By.xpath("//*[@id='UpdatePanel2']/div/button");
	By FindProduct = By.xpath("//div[@id='UpdatePanel3']/child::input[@name='btnFindAvailableProducts']");
	By ProductSel = By.xpath("//*[@id='btnFindAvailableProducts']");
	By GenderList=By.xpath("//*[@id='divGEN']/div/div/ul/li/a");
	By StateList= By.xpath("//*[@id='UpdatePanel1']/div/div/ul/li/a/span[1]");
	By ProductList=By.xpath("//*[@id='UpdatePanel2']/div/div/ul/li/a/span[1]");
	By Frame= By.xpath("//iframe[@id='CossScreenFrame']");
	By carierProdcuts=By.xpath("//h3[contains(text(),'Carrier and Product')]");
	By scrolwl= By.xpath("//table[@id='GridView1']/tbody/tr[6]/td[4]/input[1]");
	By scrolprod= By.xpath("//input[@id='GridView1_ctl03_btnIgo1']");
	// *[@id="ddlGender"]/option[2]
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;
	public void enterCaseInfoDetails(String firstName, String lastName, String DOBMonth, String DOBDay, String DOBYear,
			String Gender, String CaseDescription)  {
//Keys.HOME + 
		
			$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
			HooksTest.idriver.switchTo().frame($(Frame));
			$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(firstName);
			
			Reporter.addStepLog("The Base Policy Name is "+ firstName);
			
			
			$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(lastName);
			$(MM).shouldBe(Visible.exist, Duration.ofSeconds(100)).setValue(DOBMonth);
			GlobalCap.sleep(1000);
			$(DD).shouldBe(Visible.exist, Duration.ofSeconds(100)).setValue(DOBDay);
			GlobalCap.sleep(1000);
			$(YYYY).shouldBe(Visible.exist, Duration.ofSeconds(100)).setValue(DOBYear);
			GlobalCap.sleep(1000);
			$(GenderClick).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			GlobalCap.Dropdownlist(GenderList, Gender);			
			$(Description).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(CaseDescription);
			$(carierProdcuts).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			GlobalCap.sleep(1500);
			$(producttypetext).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
			 /* JavascriptExecutor js = (JavascriptExecutor)HooksTest.idriver;
  	        //Scroll down till the bottom of the page
  	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");*/
			
			
	}

	public void CarrierAndProduct(String state, String productType)  {
		
		$(State).shouldBe(Visible.exist, Duration.ofSeconds(50)).click();
		GlobalCap.Dropdownlist(StateList, state);
		GlobalCap.sleep(1500);	
		$(ProductType).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();	
		GlobalCap.Dropdownlist(ProductList, productType);
		GlobalCap.sleep(1500);	
		$(FindProduct).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();		
	}

	public void selectProduct(String product)  {
		GlobalCap.sleep(1500);
		int rowCount = HooksTest.idriver.findElements(By.xpath("//table[@id='GridView1']/tbody/tr")).size();								
		for (int i = 1; i <= rowCount; i++) {
			String ProductName = HooksTest.idriver.findElement(By.xpath("//table[@id='GridView1']/tbody/tr[" + i + "]/td[3]")).getText();
			if (ProductName.equalsIgnoreCase(product)) {
				GlobalCap.sleep(2800);
				HooksTest.idriver.findElement(By.xpath("//table[@id='GridView1']/tbody/tr[" + i + "]/td[4]/input[1]")).click();
			}
		}
	
	}
	
}
