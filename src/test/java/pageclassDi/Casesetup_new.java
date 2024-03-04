
package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class Casesetup_new extends GlobalCap {
	By ciPageFrame= By.xpath("//iframe[@id='CossScreenFrame']");
	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By DIpolicy_yes = By.xpath("//span[text()='Yes']//preceding::input[@id='rdo_244_1']");
	By DIpolicy_No = By.xpath("//span[text()='No']//preceding::input[@id='rdo_244_2']");
	By ResidentState = By.xpath("//select[@id='lb_162' or @name='lb_162']");
	By Occupational = By.xpath("//label[text()='Occupational Class']//following-sibling::Select[1]");
	By OccupationalModifier = By.xpath("//select[@id='lb_240']");
	By Group = By.xpath("//input[@id='flda_229' or @name='flda_229']");
	By OwnerLabel = By.xpath("//label[@alt_id='Label5']");
	By OwnerIndi = By.xpath("//input[@id='rdo_234_1' or @name='rdo_234_1']");
	By OwnerEntt = By.xpath("//input[@id='rdo_234_2' or @name='rdo_234_2']");
	By ExecutiveSelect = By.xpath("//input[@alt_id='CSDI_ExecSelect']");
	By OwnerState = By.xpath("//select[@id='lb_232' or @name='lb_232']");
	By HoldIssueLabel = By.xpath("//label[@alt_id='lblHoldIssue']");
	By Holdissue_No = By.xpath("//input[@id='rdo_195_2']");
	By Holdissue_Yes = By.xpath("//input[@id='rdo_195_1']");
	By SavageNo = By.xpath("//input[@id='rdo_206_2']");
	By DateOfIssue = By.xpath("//span[text()='Date of Issue']//preceding::input[1]");
	By PointofSaleYes = By.xpath("//input[@id='rdo_251_1' or @name='rdo_251_1']");
	By PointofSaleNo = By.xpath("//input[@id='rdo_251_2' or @name='rdo_251_2']");
	By POSFname = By.xpath("//input[@id='flda_254' or @name='flda_254']");
	By POSLname = By.xpath("//input[@id='flda_252' or @name='flda_252']");
	By ProducerAgency = By.xpath("//input[@id='flda_182']");
	By Label = By.xpath("//label[contains(text(),'Submitting Agency')]");
	By AgentFirm=By.xpath("//select[@alt_id='AGENT_SDPFirm']");
	By SignState = By
			.xpath("//label[text()='State in which the Owner will Sign the Part 1']//following-sibling::select");
	By Signcity = By.xpath("//label[text()='City in which the Owner will Sign the Part 1']//following-sibling::input");
	By QuickCloseYes = By.xpath("//input[@id='rdo_196_1' or @name='rdo_196_1']");
	By RestrictedfileClick = By.xpath("//div[@id='div_217']");
	By QuickCloseNo = By.xpath("//input[@id='rdo_196_2' or @name='rdo_196_2']");
	By Next = By.xpath("//button[text()='Next  ']");
	By SalesPerson_Yes = By.xpath("//input[@id='rdo_251_1' or @name='rdo_251_1']");
	By SalesPerson_No = By.xpath("//input[@id='rdo_251_2' or @name='rdo_251_2']");
	By SalesFirstName = By.xpath("//input[@id='flda_254' or @name='flda_254']");
	By SalesLastName = By.xpath("//input[@id='flda_252' or @name='flda_252']");
	public void casedata(String Product, String RigthDI, String Rstate, String Occup, String OccupModi,String GRP_YesNo, String Grp,
			String Holdissue, String Signstate, String SignCity, String QuickClose, String bsOwnerType,
			String bsOwnstate, String bsGrp, String Agency,String firm,String SalesPerson_RD,String SalesFirstname,String salesLastName ) {

		//$(frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		//HooksTest.idriver.switchTo().frame($(frame));
		
		HooksTest.idriver.switchTo().frame(0);
		
		//HooksTest.idriver.switchTo().frame($(ciPageFrame));
		GlobalCap.selectRadioYesorNo(DIpolicy_yes, DIpolicy_No, RigthDI);
		$(ResidentState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Rstate);
		$(Occupational).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Occup);

		if ($(OccupationalModifier).isDisplayed() && $(OccupationalModifier).isEnabled()) {
			$(OccupationalModifier).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(OccupModi);
		}	
	//	if ($(ExecutiveSelect).isDisplayed()) {
	//		$(ExecutiveSelect).click();
	//	}
		if(GRP_YesNo.equalsIgnoreCase("Yes")){
			if ($(Group).isDisplayed()) {
				$(Group).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(bsGrp);
			}
		}
		
		if ($(OwnerLabel).isDisplayed()) {
			selectownertype(OwnerIndi, OwnerEntt, bsOwnerType);
		}
		if ($(OwnerState).isDisplayed()) {
			$(OwnerState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(bsOwnstate);
		}
		if ($(HoldIssueLabel).isDisplayed()) {
			selectRadioYesorNo(Holdissue_Yes, Holdissue_No, Holdissue);
		}

		if ($(SavageNo).isDisplayed()) {
			$(SavageNo).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		$(DateOfIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(ProducerAgency).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(Agency);
		$(Label).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(1500);
		if($(AgentFirm).isDisplayed()){
			$(AgentFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(firm);
		}
		$(SignState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Signstate);
		$(Label).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(Signcity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(SignCity);
		$(Label).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(6000);	
		if($(SalesPerson_Yes).isDisplayed()){
			selectRadioYesorNo(SalesPerson_Yes, SalesPerson_No, SalesPerson_RD);
			if(SalesPerson_RD.equalsIgnoreCase("Yes")){
				$(SalesFirstName).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(SalesFirstname);
				$(SalesLastName).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(salesLastName);
			}
		}
		if ($(QuickCloseYes).isDisplayed()) {
			$(QuickCloseNo).click();
			$(QuickCloseNo).click();
		}
		$(RestrictedfileClick).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(12000);
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

	}
}
