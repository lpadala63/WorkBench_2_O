package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class DI_BuySell_ProdInfo extends GlobalCap {
	By lcsIframe = By.xpath("//iframe[@id='CossScreenFrame']");
	By BusinessType = By.xpath("//select[@alt_id='BS_BUS_BusinessType']");
	By EmpNo = By.xpath("//input[@alt_id='BS_BUS_NumEmployees']");
	By IndustryType = By.xpath("//select[@alt_id='BS_BUS_IndustryType']");
	By ClickToAdd = By.xpath("//button[@id='grdx34_addRowButton']");
	By Iframe = By.xpath("//iframe[@id='modalIframe']");
	By OwnerName = By.xpath("//input[@id='flda_46']");
	By PercentOwnership = By.xpath("//input[@alt_id='Percent']");
	By Year = By.xpath("//input[@id='flda_33']");
	By Age = By.xpath("//input[@alt_id='Age']");
	By ActiveBusinessYes = By.xpath("//input[@alt_id='Active_1']");
	By ActiveBusinessNo = By.xpath("//input[@alt_id='Active_2']");
	By Details = By.xpath("//input[@alt_id='InactiveDetails']");
	By NetEarning = By.xpath("//input[@alt_id='NetEarnings']");
	By Save = By.xpath("//div[@id='pnlContent']//following::button[contains(text(),'Save')]");
	By BussYear = By.xpath("//input[@alt_id='BS_BUS_Year']");
	By BankruptcyYes = By.xpath("//input[@alt_id='BS_BUS_Bankruptcy_1']");
	By BankruptcyNo = By.xpath("//input[@alt_id='BS_BUS_Bankruptcy_2']");
	By ExplainBankruptcy = By.xpath("//input[@alt_id='BS_BUS_BankruptcyDetails']");
	By BussAgreementYes = By.xpath("//input[@alt_id='BS_BUS_Agreement_1']");
	By BussAgreementNo = By.xpath("//input[@alt_id='BS_BUS_Agreement_2']");
	By ExplainBussAgreement = By.xpath("//input[@alt_id='BS_BUS_AgreementDetails']");
	By BussValueYes = By.xpath("//input[@alt_id='BS_BUS_Value_1']");
	By BussValueNo = By.xpath("//input[@alt_id='BS_BUS_Value_2']");
	By ExplainBussValue = By.xpath("//input[@alt_id='BS_BUS_ValueDetails']");
	By TypeOfAgreement = By.xpath("//select[@alt_id='BS_BUS_AgreementType']");
	By CurrentFiscalProjectionYear = By.xpath("//input[@alt_id='BS_FD_CurYear']");
	By CurrentFiscalAssets = By.xpath("//input[@alt_id='BS_FD_CurAssets']");
	By CurrentFiscalLiabilities = By.xpath("//input[@alt_id='BS_FD_CurLiabilities']");
	By CurrentFiscalLoss = By.xpath("//input[@alt_id='BS_FD_CurProfit']");
	By CurrentFiscalBookValue = By.xpath("//input[@alt_id='BS_FD_CurNetWorth']");
	By RecentFiscalProjection = By.xpath("//input[@alt_id='BS_FD_RecentYear']");
	By RecentFiscalAssets = By.xpath("//input[@alt_id='BS_FD_RecentAssets']");
	By RecentFiscalLiabilities = By.xpath("//input[@alt_id='BS_FD_RecentLiabilities']");
	By RecentFiscalLoss = By.xpath("//input[@alt_id='BS_FD_RecentProfit']");
	By RecentFiscalBookValue = By.xpath("//input[@alt_id='BS_FD_RecentNetWorth']");
	By BusinessValuation = By.xpath("//input[@alt_id='BS_FD_ValuationMethod']");
	By Next = By.xpath("//button[text()='Next  ']");

	public void BSProductInfo(String BusType, String Product, String Employee, String IndusType, String Owner,String OwnerPercent,
			String OwnerYear, String OwnerAge, String ActiveBusiness, String ActiveBusinessDetails, String NetValue,
			String BusinessYear, String BankrupctyStatus, String BankruptcyDetails, String BusinessAgreementStatus,
			String BusinessAgreementDetails, String BusinessValueStatus, String BusinessValueDetails, String TypeOfAgreementDD, String CurrentProjectionYear,
			String CurrentAssets, String CurrentLiabilities,String CurrentLoss, String CurrentBookValue, String RecentProjectionYear,
			String RecentAssets, String RecentLiabilities,String RecentLoss, String RecentBookValue, String Valuation ) {
		
		if (Product.equalsIgnoreCase("Buy/Sell")) {
			$(BusinessType).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(BusType);
			$(EmpNo).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(Employee);
			$(IndustryType).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(IndusType);
			GlobalCap.sleep(800);
			$(ClickToAdd).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			GlobalCap.sleep(1000);
			HooksTest.idriver.switchTo().defaultContent();
			$(Iframe).shouldBe(Visible.exist, Duration.ofSeconds(60));
			HooksTest.idriver.switchTo().frame($(Iframe));
			
			$(OwnerName).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(Owner);
			GlobalCap.sleep(500);
			$(PercentOwnership).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(OwnerPercent);
			GlobalCap.sleep(500);
			$(Year).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(OwnerYear);
		
			$(Age).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(OwnerAge);
			selectRadioYesorNo(ActiveBusinessYes, ActiveBusinessNo, ActiveBusiness);
			
			if ($(Details).isDisplayed()) {
				$(Details).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(ActiveBusinessDetails);
			}
			
			$(NetEarning).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(NetValue);
			
			HooksTest.idriver.switchTo().defaultContent();
			$(Save).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			
			
			$(lcsIframe).shouldBe(Visible.exist, Duration.ofSeconds(60));
			HooksTest.idriver.switchTo().frame($(lcsIframe));
			GlobalCap.sleep(3000);
			$(BussYear).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(BusinessYear);
			selectRadioYesorNo(BankruptcyYes, BankruptcyNo, BankrupctyStatus);
			if ($(ExplainBankruptcy).isDisplayed()) 
			{
				$(ExplainBankruptcy).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(BankruptcyDetails);
			}
			
			selectRadioYesorNo(BussAgreementYes, BussAgreementNo, BusinessAgreementStatus);
			if ($(ExplainBussAgreement).isDisplayed()) {
				$(ExplainBussAgreement).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(BusinessAgreementDetails);
			}
			
			selectRadioYesorNo(BussValueYes, BussValueNo, BusinessValueStatus);
			if ($(ExplainBussValue).isDisplayed()) {
				$(ExplainBussValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(BusinessValueDetails);
			}
			
			$(TypeOfAgreement).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(TypeOfAgreementDD);
			
			$(CurrentFiscalProjectionYear).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(CurrentProjectionYear);
			$(CurrentFiscalAssets).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(CurrentAssets);
			$(CurrentFiscalLiabilities).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(CurrentLiabilities);
			$(CurrentFiscalLoss).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(CurrentLoss);
			$(CurrentFiscalBookValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(CurrentBookValue);
			
			$(RecentFiscalProjection).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(RecentProjectionYear);
			$(RecentFiscalAssets).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(RecentAssets);
			$(RecentFiscalLiabilities).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(RecentLiabilities);
			$(RecentFiscalLoss).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(RecentLoss);
			$(RecentFiscalBookValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(RecentBookValue);
			
			$(BusinessValuation).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(Valuation);
			
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}

}
