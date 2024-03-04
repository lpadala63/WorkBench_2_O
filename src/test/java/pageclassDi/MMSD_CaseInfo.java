package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

import stepdefinitions.HooksTest;

public class MMSD_CaseInfo extends GlobalCap {

	By FirstName = By.xpath("//input[@id='txtFirstName' or @name='txtFirstName']");
	By LastName = By.xpath("//input[@id='txtLastName' or @name='txtLastName']");
	By MM = By.xpath("//*[@id='divDOB']/div/span/span[1]/input[1]");
	By DD = By.xpath("//*[@id='divDOB']/div/span/span[1]/input[2]");
	By YYYY = By.xpath("//*[@id='divDOB']/div/span/span[1]/input[3]");
	By GenderClick = By.xpath("//div[@id='divGEN']/div/button");

	By Description = By.xpath("//input[@id='txtCaseDescription']");
	By State = By.xpath("//div[@id='UpdatePanel1']/div/button");
	By ProductType = By.xpath("//*[@id='UpdatePanel2']/div/button");
	By FindProduct = By.xpath("//div[@id='UpdatePanel3']/child::input[@name='btnFindAvailableProducts']");
	By ProductSel = By.xpath("//*[@id='btnFindAvailableProducts']");
	By GenderList = By.xpath("//*[@id='divGEN']/div/div/ul/li/a");
	By StateList = By.xpath("//*[@id='UpdatePanel1']/div/div/ul/li/a/span[1]");
	By ProductList = By.xpath("//*[@id='UpdatePanel2']/div/div/ul/li/a/span[1]");
	By CaseFrame = By.xpath("//iframe[@id='CossScreenFrame' or @name='CossScreenFrame']");
	By Frame= By.xpath("//iframe[@id='CossScreenFrame']");
	// *[@id="ddlGender"]/option[2]
	// JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;
	HooksTest HK = new HooksTest();

	public void enterCaseInfoDetails(String firstName, String lastName, String DOBMonth, String DOBDay, String DOBYear,
			String Gender, String CaseDescription) {
		
		//GlobalCap.sleep(2000);
		$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(Frame));
		$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(firstName);
		$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(lastName);
		$(MM).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(DOBMonth);
		$(DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(DOBDay);
		$(YYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(DOBYear);
		$(GenderClick).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.Dropdownlist(GenderList, Gender);

		$(Description).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CaseDescription);

	}

	public void CarrierAndProduct(String state, String productType) {

		$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.Dropdownlist(StateList, state);
		GlobalCap.sleep(2000);

		$(ProductType).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.Dropdownlist(ProductList, productType);
		GlobalCap.sleep(2000);

		$(FindProduct).shouldBe(Visible.exist, Duration.ofSeconds(1000)).click();

	}

	public void selectProduct(String product) {

		// js.executeScript("window.scrollBy(0,850)", "");
		GlobalCap.sleep(4000);
		int rowCount = HooksTest.idriver.findElements(By.xpath("//table[@id='GridView1']/tbody/tr")).size();

		for (int i = 1; i <= rowCount; i++) {
			String ProductName = HooksTest.idriver
					.findElement(By.xpath("//table[@id='GridView1']/tbody/tr[" + i + "]/td[3]")).getText();
			// System.out.println("Product Name :" + ProductName);
			if (ProductName.equalsIgnoreCase(product)) {
				HooksTest.idriver.findElement(By.xpath("//table[@id='GridView1']//tbody//tr[" + i + "]//td[3]//following::input[1]"))
						.click();
			}
		}

	}

}