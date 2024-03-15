package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.util.Date;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class allCasesObjects extends GlobalCap {

	By navigateRightIcon = By.xpath("//button[@aria-label='Go to next page']");
	By firstPageIcon = By.xpath("//button[@aria-label='Go to first page']");

	SoftAssert softAssert = new SoftAssert();

	private boolean verifyNumeric(String policy) {
		policy = policy.trim();
		if (policy == null || policy.equals(""))
			return false;
		if (!policy.matches("[0-9]*"))
			return false;
		return true;
	}

	public void verifyLengthAndType() {
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr//td[1]"));
		int n = noOfRows.size();
		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			String commonpath = "(//tr//td[1])[" + i + "]";
			By policyLocator = By.xpath(commonpath);
			String policyNumber = $(policyLocator).getText();
			System.out.println(policyNumber);
			boolean value = verifyNumeric(policyNumber);
			softAssert.assertEquals(value, true);
			System.out.println("policy number type is verified");
			int policyNumberLength = policyNumber.length();
			if (policyNumberLength > 0 && policyNumberLength <= 10) {
				flag = true;
			}
			softAssert.assertEquals(flag, true);
			System.out.println("policy number length is validated");
			softAssert.assertAll();
		}
	}

	public void validatePolicyNumberLength() {
		while ($(navigateRightIcon).isEnabled()) {
			verifyLengthAndType();
			$(navigateRightIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			System.out.println($(navigateRightIcon).isEnabled());
		}
		verifyLengthAndType();
		$(firstPageIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}

	public boolean verifyCharacters(String name) {
		name = name.trim();
		if (name == null || name.equals(""))
			return false;
		if (!name.matches("[a-zA-Z\\s]*"))
			return false;
		return true;
	}

	public void verifyInsuredName() {
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr//td[2]"));
		int n = noOfRows.size();
		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			String commonpath = "(//tr//td[2])[" + i + "]";
			By policyLocator = By.xpath(commonpath);
			String insuredName = $(policyLocator).getAttribute("aria-label");
			System.out.println(insuredName);
			boolean value = verifyCharacters(insuredName);
			softAssert.assertEquals(value, true);
			System.out.println("Insured Name type is verified");
			int insuredNameLength = insuredName.length();
			if (insuredNameLength > 0 && insuredNameLength <= 80) {
				flag = true;
			}
			softAssert.assertEquals(flag, true);
			System.out.println("Insured Name length is validated");
			softAssert.assertAll();
		}
	}

	public void validateInsuredNameCharacters() {
		while ($(navigateRightIcon).isEnabled()) {
			verifyInsuredName();
			$(navigateRightIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			System.out.println($(navigateRightIcon).isEnabled());
		}
		verifyInsuredName();
		$(firstPageIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}

	public boolean validatePlanText(String plan) {
		plan = plan.trim();
		if (plan == null || plan.equals(""))
			return false;
		if (!plan.matches("[A-Z0-9]*"))
			return false;
		return true;
	}

	public void verifyPolicyPlan() {
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr//td[4]"));
		int n = noOfRows.size();
		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			String commonpath = "(//tr//td[4])[" + i + "]";
			By policyLocator = By.xpath(commonpath);
			String policyPlan = $(policyLocator).getText();
			System.out.println(policyPlan);
			boolean value = validatePlanText(policyPlan);
			softAssert.assertEquals(value, true);
			System.out.println("policy plan type is verified");
			int policyPlanLength = policyPlan.length();
			if (policyPlanLength > 0 && policyPlanLength <= 10) {
				flag = true;
			}
			softAssert.assertEquals(flag, true);
			System.out.println("policy Plan length is validated");
			softAssert.assertAll();
		}
	}

	public void validatePolicyPlanType() {
		while ($(navigateRightIcon).isEnabled()) {
			verifyPolicyPlan();
			$(navigateRightIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			System.out.println($(navigateRightIcon).isEnabled());
		}
		verifyPolicyPlan();
		$(firstPageIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}

	public void validateDateOfBirthInsured() {
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr//td[3]"));
		int n = noOfRows.size();

		for (int i = 1; i <= n; i++) {
			boolean flag = false;
			String commonpath = "(//tr//td[3])[" + i + "]";
			By policyLocator = By.xpath(commonpath);
			String date = $(policyLocator).getText();
			System.out.println(date);
			boolean value = isValid(date);
			softAssert.assertEquals(value, true);
			System.out.println("DOB is verified");
			softAssert.assertAll();
		}
	}

	public boolean isValid(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		try {
			Date d1 = sdf.parse(date);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void validateDateOfBirth() {
		while ($(navigateRightIcon).isEnabled()) {
			validateDateOfBirthInsured();
			$(navigateRightIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			System.out.println($(navigateRightIcon).isEnabled());
		}
		validateDateOfBirthInsured();
		$(firstPageIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}

}