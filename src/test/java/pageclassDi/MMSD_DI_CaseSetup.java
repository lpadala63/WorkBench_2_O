package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class MMSD_DI_CaseSetup extends GlobalCap {
	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By DIpolicy_yes = By.xpath("//span[text()='Yes']//preceding::input[@id='rdo_244_1']");
	By DIpolicy_No = By.xpath("//span[text()='No']//preceding::input[@id='rdo_244_2']");
	By ResidentState = By.xpath("//select[@id='lb_162' or @name='lb_162']");
	By Occupational = By.xpath("//label[text()='Occupational Class']//following-sibling::Select[1]");
	By OccupationalModifier = By.xpath("//label[text()='Occupation Class Modifiers']//following-sibling::Select[1]");
	By Group = By.xpath("//input[@id='flda_229' or @name='flda_229']");
	By OwnerLabel = By.xpath("//label[@alt_id='Label5']");
	By OwnerIndi = By.xpath("//input[@id='rdo_234_1' or @name='rdo_234_1']");
	By OwnerEntt = By.xpath("//input[@id='rdo_234_2' or @name='rdo_234_2']");
	By OwnerState = By.xpath("//select[@id='lb_232' or @name='lb_232']");
	By ExecutiveSelect = By.xpath("//input[@alt_id='CSDI_ExecSelect']");
	By Holdissue_No = By.xpath("//input[@id='rdo_195_2']");
	By Holdissue_Yes = By.xpath("//input[@id='rdo_195_1']");
	By SavageNo = By.xpath("//input[@id='rdo_206_2']");
	By DateOfIssue = By.xpath("//span[text()='Date of Issue']//preceding::input[1]");
	By PointofSaleYes = By.xpath("//input[@id='rdo_251_1' or @name='rdo_251_1']");
	By PointofSaleNo = By.xpath("//input[@id='rdo_251_2' or @name='rdo_251_2']");
	By POSFname = By.xpath("//input[@id='flda_254' or @name='flda_254']");
	By POSLname = By.xpath("//input[@id='flda_252' or @name='flda_252']");
	By ProducerSSN = By.xpath("//input[@id='flda_259' or @name='flda_259']");
	By Label = By.xpath("//h1[@id='lbl_12']");
	By SignState = By
			.xpath("//label[text()='State in which the Owner will Sign the Part 1']//following-sibling::select");
	By Signcity = By.xpath("//label[text()='City in which the Owner will Sign the Part 1']//following-sibling::input");
	By Next = By.xpath("//button[text()='Next  ']");

	public void casedata(String RigthDI, String Rstate, String Occup, String OccupModi, String Grp, String bsGrp,
			String Holdissue, String POS, String POSFName, String POSLName, String PSSN, String Signstate,
			String SignCity, String bsOwnerType, String bsOwnstate) {

		$(frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(frame));
		GlobalCap.selectRadioYesorNo(DIpolicy_yes, DIpolicy_No, RigthDI);

		// $(DIpolicy_No).shouldBe(Visible.exist,
		// Duration.ofSeconds(30)).click();

		$(ResidentState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Rstate);

		$(Occupational).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Occup);

		$(OccupationalModifier).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(OccupModi);

		if ($(ExecutiveSelect).isDisplayed()) {
			$(ExecutiveSelect).click();
		}
		if ($(Group).isDisplayed()) {
			$(Group).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(bsGrp);
		}
		if ($(OwnerLabel).isDisplayed()) {
			selectownertype(OwnerIndi, OwnerEntt, bsOwnerType);
		}
		if ($(OwnerState).isDisplayed()) {
			$(OwnerState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(bsOwnstate);
			GlobalCap.selectRadioYesorNo(Holdissue_Yes, Holdissue_No, Holdissue);
			// $(Holdissue).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).click();

			$(SavageNo).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

			$(DateOfIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

			GlobalCap.selectRadioYesorNo(PointofSaleYes, PointofSaleNo, POS);

			if (POS.equalsIgnoreCase("Yes")) {
				$(POSFname).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(POSFName);
				$(POSLname).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(POSLName);
			}
			$(ProducerSSN).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(ProducerSSN).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(PSSN);
			$(Label).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			GlobalCap.sleep(10000);

			$(SignState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Signstate);

			$(Signcity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(SignCity);

			GlobalCap.sleep(5000);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

	}
}
