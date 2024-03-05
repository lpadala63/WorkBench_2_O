package pageclass;

import static com.codeborne.selenide.Selenide.$;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.openqa.selenium.By;
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

public class searchOperationObjects extends GlobalCap {

	SoftAssert softAssert = new SoftAssert();
	JavascriptExecutor js = (JavascriptExecutor)idriver;

	By searchIcon = By.xpath("//span[@class='icon-search']");
	By searchToolTipLocator = By.xpath("//button[@aria-label='Show/Hide search']");
	By searchTextBox = By.xpath("//input[@placeholder='Search']");
	By clearSearchIcon = By.xpath("//span[@aria-label='Clear search']");
	By currentlyShowingText = By.xpath("//span[contains(text(),'Currently showing ')]");
	By navigateToFirstPage = By.xpath("//button[@aria-label='Go to first page']");
	By navigateToPreviousPage = By.xpath("//button[@aria-label='Go to previous page']");
	By firstPage = By.xpath("//button[@aria-label='page 1']");
	By secondPage = By.xpath("//button[@aria-label='Go to page 2']");
	By thirdPage = By.xpath("//button[@aria-label='Go to page 3']");
	By navigateToNextPage = By.xpath("//button[@aria-label='Go to next page']");
	By navigateToLastPage = By.xpath("//button[@aria-label='Go to last page']");
	By currentlyShowingTextForLimit = By.xpath("//span[contains(text(),'Currently showing ')]");
	By allCasesLinkText = By.xpath("//a[contains(text(),'All Cases')]");
	By allCasesHeaderText = By.xpath(" //h2[contains(text(),'All Cases')]");
	By workBasketHeaderText = By.xpath("//h2[contains(text(),'Workbasket')]");
	By workBasketLinkText = By.xpath("//a[contains(text(),'Workbasket')]");
	By afterSearchIcon = By.xpath("//span[@class='icon-search-white']");
	By mismatchIcon = By.xpath("//span[@title='No data found']");
	By notFoundText = By.xpath("//p[text()='Your search or filtering did not match any data in our records.']");

	int count;
	String commonpath;
	String menuItemCommonpath;
	String headerCommonPath;
	int totalResultsCount;

	public void validateToolTips() {
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		String searchToolTip = $(searchToolTipLocator).getAttribute("aria-label");
		softAssert.assertEquals(searchToolTip, "Show/Hide search");
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys("sample");
		String enteredValue = $(searchTextBox).getAttribute("value");
		softAssert.assertEquals(enteredValue, "sample");
		GlobalCap.sleep(3000);
		$(clearSearchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10));
		String clearSearchToolTip = $(clearSearchIcon).getAttribute("aria-label");
		softAssert.assertEquals(clearSearchToolTip, "Clear search");
		$(clearSearchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		String afterClearValue = $(searchTextBox).getAttribute("value");
		softAssert.assertEquals(afterClearValue, "");
		System.out.println("Validated search tooltips and entered values");
	}

	By textRequired = By.xpath("//span[contains(text(),'Currently showing')]");

	public void performSearchAndValidateResults(String keyword, String menuItem) {
		menuItemCommonpath = "//a[contains(text(),'" + menuItem + "')]";
		headerCommonPath = "//h2[contains(text(),'" + menuItem + "')]";
		By mainMenuItem = By.xpath(menuItemCommonpath);
		By mainHeader = By.xpath(headerCommonPath);
		$(mainMenuItem).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(mainHeader).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(keyword);
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr"));
		int n = noOfRows.size();
		String output = $(textRequired).getText();
		if (n > 9) {
			totalResultsCount = Integer.parseInt((output).substring(18, 20));
		} else {
			totalResultsCount = Integer.parseInt((output).substring(18, 19));
		}
		System.out.println("totalResultsCount :" + totalResultsCount);
		if (totalResultsCount > 20) {
			$(navigateToFirstPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(navigateToPreviousPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(firstPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(secondPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(thirdPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(navigateToNextPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(navigateToLastPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		} else if (totalResultsCount > 10) {
			$(navigateToPreviousPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(firstPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(secondPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(navigateToNextPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		} else if (totalResultsCount < 10) {
			$(navigateToPreviousPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(firstPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(navigateToNextPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		}
		System.out.println("No of rows matched : " + n);
		for (int i = 1; i < n; i++) {
			count = 0;
			for (int j = 1; j < 7; j++) {
				commonpath = "(//tr[@class='MuiTableRow-root css-sszzkj'])[" + i + "]//td[" + j + "]";
				By rowsLocator = By.xpath(commonpath);
				String matchedValue = $(rowsLocator).getText();
				if (matchedValue.toLowerCase().contains(keyword.toLowerCase())) {
					System.out.println(matchedValue);
					count++;
					System.out.println("Value matched in row :" + i);
				}
			}
			softAssert.assertNotEquals(0, count);
		}
		softAssert.assertAll();
		$(clearSearchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}

	public void performCaseSensitiveSearchAndValidateResults(String keyword, String casekeyword, String menuItem) {
		menuItemCommonpath = "//a[contains(text(),'" + menuItem + "')]";
		headerCommonPath = "//h2[contains(text(),'" + menuItem + "')]";
		By mainMenuItem = By.xpath(menuItemCommonpath);
		By mainHeader = By.xpath(headerCommonPath);
		$(mainMenuItem).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(mainHeader).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(keyword);
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr"));
		int keywordRows = noOfRows.size();
		$(clearSearchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		GlobalCap.sleep(2000);
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(casekeyword);
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		List<WebElement> noOfRowsForCasekeyword = idriver.findElements(By.xpath("//tr"));
		int casekeywordRows = noOfRowsForCasekeyword.size();
		softAssert.assertEquals(keywordRows, casekeywordRows);
		System.out
				.println("size of Keyword1 results : " + keywordRows + "size of Keyword1 results : " + casekeywordRows);
		$(clearSearchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}

	public void validateSearchKeywordLimit(String keyword, String menuItem) {
		menuItemCommonpath = "//a[contains(text(),'" + menuItem + "')]";
		headerCommonPath = "//h2[contains(text(),'" + menuItem + "')]";
		By mainMenuItem = By.xpath(menuItemCommonpath);
		By mainHeader = By.xpath(headerCommonPath);
		$(mainMenuItem).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(mainHeader).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(keyword);
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		String enteredValue = $(searchTextBox).getAttribute("value");
		softAssert.assertEquals(enteredValue, "Hubert Blaine Wolfeschleg");
		System.out.println($(currentlyShowingTextForLimit).getText());
		softAssert.assertEquals($(currentlyShowingTextForLimit).getText(),
				"Currently showing 0 \"Hubert Blaine Wolfeschleg\" search results .");
		softAssert.assertAll();
	}

	public void validateClearSearch() {
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(allCasesHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys("sample");
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		String enteredValue = $(searchTextBox).getAttribute("value");
		softAssert.assertEquals(enteredValue, "sample");
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(workBasketHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		String expectedValue = $(searchTextBox).getAttribute("value");
		softAssert.assertEquals(expectedValue, "");
		softAssert.assertAll();
	}

	public void validateSearchFunctionality() {
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(allCasesHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10));
		GlobalCap.sleep(5000);
		$(afterSearchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(searchTextBox).shouldNot(Visible.exist, Duration.ofSeconds(10));
	}
	
	public void validateUsingLastPageAmount(String amount) {
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(amount);
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		String enteredValue = $(searchTextBox).getAttribute("value");
		softAssert.assertEquals(enteredValue, amount);
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr"));
		int n = noOfRows.size();
		for (int i = 1; i < n; i++) {
			count = 0;
			for (int j = 1; j < 7; j++) {
				commonpath = "(//tr[@class='MuiTableRow-root css-sszzkj'])[" + i + "]//td[" + j + "]";
				By rowsLocator = By.xpath(commonpath);
				String matchedValue = $(rowsLocator).getText();
				if (matchedValue.equals(amount)) {
					System.out.println(matchedValue);
					count++;
					System.out.println("Value matched in row :" + i);
				}
			}
			softAssert.assertNotEquals(0, count);
		}
		softAssert.assertAll();
		$(clearSearchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}
	
	public void validateUsingSpecialCharacters(String keyword, String menuItem) {
		menuItemCommonpath = "//a[contains(text(),'" + menuItem + "')]";
		headerCommonPath = "//h2[contains(text(),'" + menuItem + "')]";
		By mainMenuItem = By.xpath(menuItemCommonpath);
		By mainHeader = By.xpath(headerCommonPath);
		$(mainMenuItem).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(mainHeader).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(keyword);
		$(searchTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		String enteredValue = $(searchTextBox).getAttribute("value");
		softAssert.assertEquals(enteredValue, "ㄱ ㄴ ㄷ ㄹ ㅁ ㅂ ㅅ ㅇ ㅈ ㅊ ㅋ ㅌ ㅍ");
		$(mismatchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(notFoundText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		String previousButtonStatus = $(navigateToPreviousPage).getAttribute("disabled");
		String nextButtonStatus = $(navigateToNextPage).getAttribute("disabled");
		softAssert.assertEquals(previousButtonStatus, "true");
		softAssert.assertEquals(nextButtonStatus, "true");
		softAssert.assertAll();
	}
	
	public void validatePagenation() {
		$(navigateToFirstPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(navigateToPreviousPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(firstPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(secondPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(thirdPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(navigateToNextPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(navigateToLastPage).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("completed pagenation validation" );
	}
}
