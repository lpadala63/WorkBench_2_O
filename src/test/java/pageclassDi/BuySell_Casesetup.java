package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class BuySell_Casesetup extends GlobalCap {
	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By DIpolicy_yes = By.xpath("//span[text()='Yes']//preceding::input[@id='rdo_244_1']");
	By DIpolicy_No = By.xpath("//span[text()='No']//preceding::input[@id='rdo_244_2']");
	By ResidentState = By.xpath("//select[@id='lb_162' or @name='lb_162']");
	By Occupational = By.xpath("//label[text()='Occupational Class']//following-sibling::Select[1]");
	By Group = By.xpath("//input[@id='flda_229' or @name='flda_229]");
	By OwnerIndi = By.xpath("//input[@id='rdo_234_1' or @name='rdo_234_1']");
	By OwnerEntt = By.xpath("//input[@id='rdo_234_2' or @name='rdo_234_2']");
	By OwnerState = By.xpath("//select[@id='lb_232' or @name='lb_232']");
	By Holdissue_No = By.xpath("//input[@id='rdo_195_2']");
	By Holdissue_Yes = By.xpath("//input[@id='rdo_195_1']");
	By SavageNo = By.xpath("//input[@id='rdo_206_2']");
	By DateOfIssue = By.xpath("//span[text()='Date of Issue']//preceding::input[1]");
	By SignState = By
			.xpath("//label[text()='State in which the Owner will Sign the Part 1']//following-sibling::select");
	By Signcity = By.xpath("//label[text()='City in which the Owner will Sign the Part 1']//following-sibling::input");
	By QuickCloseYes = By.xpath("//input[@id='rdo_196_1' or @name='rdo_196_1']");
	By Next = By.xpath("//button[text()='Next  ']");

	public void casedata(String Productbs, String bsRigthDI, String bsRstate, String bsOccup, String bsOccupModi,
			String bsGrp, String bsSignstate, String bsHoldissue, String bsSignCity, String bsOwnerType,
			String bsOwnstate) {

		if (Productbs.equalsIgnoreCase("Buy/Sell")) {

			HooksTest.idriver.switchTo().frame(0);
			GlobalCap.selectRadioYesorNo(DIpolicy_yes, DIpolicy_No, bsRigthDI);

			// $(DIpolicy_No).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).click();

			$(ResidentState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(bsRstate);

			$(Occupational).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(bsOccup);

			$(Group).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(bsGrp);

			GlobalCap.selectownertype(OwnerIndi, OwnerEntt, bsOwnerType);

			$(OwnerState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(bsOwnstate);

			GlobalCap.selectRadioYesorNo(Holdissue_Yes, Holdissue_No, bsHoldissue);

			$(SavageNo).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

			$(DateOfIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

			$(SignState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(bsSignstate);

			$(Signcity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(bsSignCity);

			GlobalCap.sleep(12000);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

	}
}
