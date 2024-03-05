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

public class UiValidationObjects extends GlobalCap {

	JavascriptExecutor js = (JavascriptExecutor) idriver;
	SoftAssert softAssert = new SoftAssert();

	public UiValidationObjects() {
		System.out.println("Started workbench UI Validation");
	}

	By massMutualLogo = By.xpath("//*[@aria-label='MassMutual logo']");
	By helpButton = By.xpath("//a[contains(text(),'Help')]");
	By allCasesLinkText = By.xpath("//a[contains(text(),'All Cases')]");
	By workBasketLinkText = By.xpath("//a[contains(text(),'Workbasket')]");
	By pendingLinkText = By.xpath("//a[contains(text(),'Pending')]");
	By issuedReportedLinkText = By.xpath("//a[contains(text(),'Issued & Reported')]");
	By inactiveLinkText = By.xpath("//a[contains(text(),'Inactive')]");
	By allCasesHeaderText = By.xpath(" //h2[contains(text(),'All Cases')]");
	By workBasketHeaderText = By.xpath("//h2[contains(text(),'Workbasket')]");
	By pendingHeaderText = By.xpath("//h2[contains(text(),'Pending Applications')]");
	By issuedReportedHeaderText = By.xpath("//h2[contains(text(),'Issued & Reported Policies')]");
	By inactiveHeaderText = By.xpath("//h2[contains(text(),'Inactive Cases')]");
	By welcomeText = By.xpath("//p[contains(text(),'Hi')]");
	By firstPolicytoLeftPanel = By
			.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-e4rusy'])[1]");
	By policyNumberSidePanelText = By.xpath("//*[contains(text(),'Policy Number')]");
	By searchIcon = By.xpath("//span[@class='icon-search']");
	By searchBarTextField = By.xpath(
			"//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-1iw8x6f']");
	By sidePanelCloseButton = By.xpath("//span[@class='icon-close emperor action-btn']");
	By currentlyShowingText = By.xpath("//span[contains(text(),'Currently showing ')]");
	By allCasesAttributeText = By.xpath("//*[contains(@aria-label,'All policies')]");
	By workBasketAttributeText = By.xpath("//*[contains(@aria-label,'All outstanding')]");
	By pendingAttributeText = By.xpath("//*[contains(@aria-label,'pending')]");
	By issuedReportedAttributeText = By.xpath("//*[contains(@aria-label,'issued & reported')]");
	By inactiveAttributeText = By.xpath("//div[contains(@aria-label,'inactive ')]");
	By helpAttributeText = By.xpath("//div[contains(@aria-label,'Useful resources')]");
	By logoAttributeText = By.xpath("//div[@aria-label='Workbench']");
	By exportIcon = By.xpath("//span[@class='icon-download ']");
	By exportPopUpBox = By.xpath("//h2[contains(text(),'Export Data')]");
	By exportPopupBoxText = By.xpath("//p[contains(text(),'Exporting a csv file with ')]");
	By exportPopupClose = By.xpath("//button[@aria-label='Close']");
	By exportPopupCloseButton = By.xpath("//button[text()='Close']");
	By exportPopupOkButton = By.xpath("//button[text()='Ok']");
	By filterByInsuredIcon = By
			.xpath("//*[@data-testid='FilterAltIcon']/../../button[@aria-label='Filter by Insured']");
	By filterTextBox = By.xpath("//input[@title='Filter by Insured']");

	String allCasesUrl = "";
	String workBasketUrl = "";
	String pendingUrl = "";
	String issuedReportedUrl = "";
	String inactiveUrl = "";
	String inactiveRowsCommonPath = "";
	int n;
	int count = 0;

	public void verifyWorkbenchLaunch() {
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("Launched work bench");
		GlobalCap.sleep(2000);
	}

	public void validateHeaderElements() {
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("Validated header elements");
	}

	public void scrollDownValidateHeader() {
		js.executeScript("window.scrollBy(0,250)");
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		js.executeScript("window.scrollBy(0,-250)");
		GlobalCap.sleep(2000);
		System.out.println("Scrolled down Validated header elements");
	}

	public void validateInactiveHeader() {
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(welcomeText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		inactiveUrl = idriver.getCurrentUrl();
		softAssert.assertTrue(inactiveUrl.contains("inactive"));
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("Navigated to Inactive and Validated header elements");
	}

	public void validateIssuedReportedHeader() {
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(welcomeText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		issuedReportedUrl = idriver.getCurrentUrl();
		softAssert.assertTrue(issuedReportedUrl.contains("issuedAndReported"));
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("Navigated to IssuedReported and Validated header elements");
	}

	public void validatePendingHeader() {
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(welcomeText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		pendingUrl = idriver.getCurrentUrl();
		softAssert.assertTrue(pendingUrl.contains("pending"));
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("Navigated to Pending and Validated header elements");
	}

	public void validateWorkbasketHeader() {
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(welcomeText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		workBasketUrl = idriver.getCurrentUrl();
		softAssert.assertTrue(workBasketUrl.contains("workbasket"));
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("Navigated to Workbasket and Validated header elements");
	}

	public void validateAllCasesHeader() {
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(welcomeText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		allCasesUrl = idriver.getCurrentUrl();
		softAssert.assertTrue(allCasesUrl.contains("allCases"));
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		System.out.println("Navigated to all cases and Validated header elements");
	}

	public void navigateToleftPannelVerifyHeader() {
		$(firstPolicytoLeftPanel).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(policyNumberSidePanelText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(workBasketLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(pendingLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(issuedReportedLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(inactiveLinkText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(helpButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(sidePanelCloseButton).shouldBe(Visible.exist, Duration.ofSeconds(100)).click();
		System.out.println("Navigated to side panel and Validated header elements");
	}

	public void navigateToNewTabAndValidateHeader() {
		String parentWindow = idriver.getWindowHandle();
		System.out.println("The mainwindow handle is " + idriver.getWindowHandle());
		// all cases
		WebElement allCasesLink = idriver.findElement(By.xpath("//a[contains(text(),'All Cases')]"));
		new Actions(idriver).keyDown(Keys.CONTROL).click(allCasesLink).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindowHandles = idriver.getWindowHandles();
		java.util.Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				idriver.switchTo().window(childWindow);
				System.out.println("The childwindow id is " + idriver.getWindowHandle());
				$(allCasesHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
				validateHeaderElements();
				idriver.close();
			}
		}
		idriver.switchTo().window(parentWindow);
		// work basket
		WebElement workBasketLink = idriver.findElement(By.xpath("//a[contains(text(),'Workbasket')]"));
		new Actions(idriver).keyDown(Keys.CONTROL).click(workBasketLink).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindowHandlesTwo = idriver.getWindowHandles();
		java.util.Iterator<String> iteratorTwo = allWindowHandlesTwo.iterator();
		while (iteratorTwo.hasNext()) {
			String childWindow = iteratorTwo.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				idriver.switchTo().window(childWindow);
				System.out.println("The childwindow id is " + idriver.getWindowHandle());
				$(workBasketHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
				validateHeaderElements();
				idriver.close();
			}
		}
		idriver.switchTo().window(parentWindow);
		// pending
		WebElement pendingLink = idriver.findElement(By.xpath("//a[contains(text(),'Pending')]"));
		new Actions(idriver).keyDown(Keys.CONTROL).click(pendingLink).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindowHandlesThree = idriver.getWindowHandles();
		java.util.Iterator<String> iteratorThree = allWindowHandlesThree.iterator();
		while (iteratorThree.hasNext()) {
			String childWindow = iteratorThree.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				idriver.switchTo().window(childWindow);
				System.out.println("The childwindow id is " + idriver.getWindowHandle());
				$(pendingHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
				validateHeaderElements();
				idriver.close();
			}
		}
		idriver.switchTo().window(parentWindow);
		// issued and reported
		WebElement issuedLink = idriver.findElement(By.xpath("//a[contains(text(),'Issued & Reported')]"));
		new Actions(idriver).keyDown(Keys.CONTROL).click(issuedLink).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindowHandlesFour = idriver.getWindowHandles();
		java.util.Iterator<String> iteratorFour = allWindowHandlesFour.iterator();
		while (iteratorFour.hasNext()) {
			String childWindow = iteratorFour.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				idriver.switchTo().window(childWindow);
				System.out.println("The childwindow id is " + idriver.getWindowHandle());
				$(issuedReportedHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
				validateHeaderElements();
				idriver.close();
			}
		}
		idriver.switchTo().window(parentWindow);
		// inactive
		WebElement inactiveLink = idriver.findElement(By.xpath("//a[contains(text(),'Inactive')]"));
		new Actions(idriver).keyDown(Keys.CONTROL).click(inactiveLink).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindowHandlesFive = idriver.getWindowHandles();
		java.util.Iterator<String> iteratorFive = allWindowHandlesFive.iterator();
		while (iteratorFive.hasNext()) {
			String childWindow = iteratorFive.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				idriver.switchTo().window(childWindow);
				System.out.println("The childwindow id is " + idriver.getWindowHandle());
				$(inactiveHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
				validateHeaderElements();
				idriver.close();
			}
		}
		idriver.switchTo().window(parentWindow);
	}

	public void validateAllToolTips() {
		String allCasesTooltip = $(allCasesAttributeText).getAttribute("aria-label");
		String workbasketTooltip = $(workBasketAttributeText).getAttribute("aria-label");
		String pendingTooltip = $(pendingAttributeText).getAttribute("aria-label");
		String issuedTooltip = $(issuedReportedAttributeText).getAttribute("aria-label");
		String inactiveTooltip = $(inactiveAttributeText).getAttribute("aria-label");
		String helpToolTip = $(helpAttributeText).getAttribute("aria-label");
		String logoToolTip = $(logoAttributeText).getAttribute("aria-label");
		softAssert.assertEquals(allCasesTooltip, "All policies in all statuses");
		softAssert.assertEquals(workbasketTooltip, "All outstanding requirements");
		softAssert.assertEquals(pendingTooltip, "All cases in pending status");
		softAssert.assertEquals(issuedTooltip, "All cases issued & reported");
		softAssert.assertEquals(inactiveTooltip, "All cases in inactive status");
		softAssert.assertEquals(helpToolTip, "Useful resources for using Workbench");
		softAssert.assertEquals(logoToolTip, "Workbench");
		System.out.println("validated tool tips");
		softAssert.assertAll();
	}

	public void performExport() {
		$(exportIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(exportPopUpBox).shouldBe(Visible.exist, Duration.ofSeconds(10));
		softAssert.assertTrue(($(exportPopupBoxText).getText()).contains("Exporting a csv file"));
		$(exportPopupCloseButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(exportPopupOkButton).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(exportPopupClose).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		validateHeaderElements();
		System.out.println("export performed");
	}

	public void performBasicFilterFunctionality(String keyword) {
		$(filterByInsuredIcon).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		$(filterTextBox).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(keyword);
		GlobalCap.sleep(5000);
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr"));
		n = noOfRows.size();
		System.out.println("No of rows identified : " + n);
		for (int i = 1; i < n; i++) {
			count = 0;
			for (int j = 1; j < 7; j++) {
				inactiveRowsCommonPath = "(//tr[@class='MuiTableRow-root css-sszzkj'])[" + i + "]//td[" + j + "]";
				By inactiveRowsLocator = By.xpath(inactiveRowsCommonPath);
				String matchedValue = $(inactiveRowsLocator).getText();
				if (matchedValue.toLowerCase().contains(keyword.toLowerCase())) {
					System.out.println(matchedValue);
					count++;
					System.out.println("Found keyword in row :" + i);
				}
			}
			softAssert.assertNotEquals(0, count);
		}
		softAssert.assertAll();
	}

	By policyColumnForSort = By.xpath("//div[@title='Policy #']");

	public void performBasicSort() {
		List<WebElement> policyNoColumnsBeforeSorting = idriver.findElements(By.xpath("//td[1]"));
		int totalPolicyCount = policyNoColumnsBeforeSorting.size();
		$(policyColumnForSort).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(5000);
		List<Integer> policyNumbersListFromWorkBenchSorting = new ArrayList<Integer>();
		System.out.println("Total policies in page" + totalPolicyCount);
		String commonXpath;
		for (int i = 1; i <= totalPolicyCount; i++) {
			commonXpath = "(//td[1])[" + i + "]";
			By paths = By.xpath(commonXpath);
			String value = $(paths).getText();
			policyNumbersListFromWorkBenchSorting.add(Integer.parseInt(value));
		}
		System.out.println("policy numbers after workbench sorting" + policyNumbersListFromWorkBenchSorting);
		GlobalCap.sleep(5000);
		List<Integer> policyNumbersListAfterOurSorting = new ArrayList<Integer>();
		String commonSortedXpath;
		for (int i = 1; i <= totalPolicyCount; i++) {
			commonSortedXpath = "(//td[1])[" + i + "]";
			By paths = By.xpath(commonSortedXpath);
			String value = $(paths).getText();
			policyNumbersListAfterOurSorting.add(Integer.parseInt(value));
		}
		Collections.sort(policyNumbersListAfterOurSorting, Collections.reverseOrder());
		System.out.println("policy numbers after our sorting" + policyNumbersListAfterOurSorting);
		softAssert.assertEquals(policyNumbersListFromWorkBenchSorting, policyNumbersListAfterOurSorting,
				"Soting done successfully");
		validateHeaderElements();
		softAssert.assertAll();
	}

	public void performSearchAndValidateHeaderForInactive(String keyword) {
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(searchBarTextField).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(keyword);
		$(searchBarTextField).shouldBe(Visible.exist, Duration.ofSeconds(10)).sendKeys(Keys.ENTER);
		$(currentlyShowingText).shouldBe(Visible.exist, Duration.ofSeconds(30));
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr"));
		n = noOfRows.size();
		System.out.println("No of rows matched : " + n);
		for (int i = 1; i < n; i++) {
			count = 0;
			for (int j = 1; j < 7; j++) {
				inactiveRowsCommonPath = "(//tr[@class='MuiTableRow-root css-sszzkj'])[" + i + "]//td[" + j + "]";
				By inactiveRowsLocator = By.xpath(inactiveRowsCommonPath);
				String matchedValue = $(inactiveRowsLocator).getText();
				if (matchedValue.toLowerCase().contains(keyword.toLowerCase())) {
					System.out.println(matchedValue);
					count++;
					System.out.println("Value matched in row :" + i);
				}
			}
			softAssert.assertNotEquals(0, count);
		}
		softAssert.assertAll();
	}

	public void navigateToMenuitem(String menuitem) {
		String menuItem = "//a[contains(text(),'" + menuitem + "')]";
		By menuItemLocator = By.xpath(menuItem);
		$(menuItemLocator).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
	}

	public void clickLogoNavigateToMenuitem(String menuitem) {
		$(massMutualLogo).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(welcomeText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(allCasesHeaderText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		allCasesUrl = idriver.getCurrentUrl();
		softAssert.assertTrue(allCasesUrl.contains("allCases"));
	}

	public void verifyWelcomeMessageAndIcons() {
		$(welcomeText).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(searchIcon).shouldBe(Visible.exist, Duration.ofSeconds(10));
		$(exportIcon).shouldBe(Visible.exist, Duration.ofSeconds(10));
	}

	// all cases column names

	By policyColumn = By.xpath("//div[text()='Policy #']");
	By insuredColumn = By.xpath("//div[text()='Insured']");
	By dobColumn = By.xpath("//div[text()='Date of Birth']");
	By planColumn = By.xpath("//div[text()='Plan']");
	By amountColumn = By.xpath("//div[text()='Amount']");
	By solicitingProducerColumn = By.xpath("//div[text()='Soliciting Producer']");
	By submittedColumn = By.xpath("//div[text()='Submitted']");
	By caseStatusColumn = By.xpath("//div[text()='Case Status']");
	By statusDate = By.xpath("//div[text()='Status Date']");
	By other = By.xpath("//div[text()='Other']");

	public void verifyTableColumnsAndRows(String menuitem) {
		List<WebElement> noOfRows = idriver.findElements(By.xpath("//tr"));
		int n = noOfRows.size();
		switch (menuitem) {
		case "All Cases":
			$(policyColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(insuredColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(dobColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(planColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(amountColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(solicitingProducerColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(submittedColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(caseStatusColumn).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(statusDate).shouldBe(Visible.exist, Duration.ofSeconds(10));
			$(other).shouldBe(Visible.exist, Duration.ofSeconds(10));
			System.out.println("Verified all columns of all cases page");
			softAssert.assertEquals(n, 11, "no of rows not matched");
			break;
		case "Workbasket":
			break;
		case "Pending":
			break;
		case "Issued & Reported":
			break;
		case "Inactive":
			break;
		}
		softAssert.assertAll();
	}

	public void validateFilterIcons(String menuitem) {
       List<WebElement> noOfIcons = idriver.findElements(By.xpath("//*[@data-testid='FilterAltIcon']"));
       int n = noOfIcons.size();
       switch (menuitem) {
		case "All Cases":
			softAssert.assertEquals(n, 9);
			System.out.println("Verified no of icons in page");
			break;
		case "Workbasket":
			break;
		case "Pending":
			break;
		case "Issued & Reported":
			break;
		case "Inactive":
			break;
		}
		softAssert.assertAll();
	}
}