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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class LifeProducerCompensation extends GlobalCap {
	int i;
	// By LPC_ProducerRole = By.xpath("//label[text()='Producer
	// Role']//following-sibling::select[@id='lb_131']")";
	By LPC_ProducerRole = By.xpath("//label[text()='Producer Role']//following-sibling::select[1]");
	By LPC_FirstName = By.xpath("//*[@id='flda_28']");
	By LPC_LastName = By.xpath("//*[@id='flda_46']");
	By LPC_ProducerID = By.xpath("//*[@id='flda_85']");
	By LPC_Email = By.xpath("//label[text()='Email']//following-sibling::input[@id='flda_172']");
	By LPC_FloridaLicenceID = By.xpath("//*[@id='flda_145']");
	// By LPC_IsDIProducerinfoandCommissionSplitsSameasLifeQuestn_RB =
	// By.xpath("//*[@id='div_152']/div[2]");
	By LPC_EntityName_DD = By.xpath("//select[@id='lb_130']");
	By LPC_FirstYearComsn = By
			.xpath("//label[text()='% 1st Year Commission']//following-sibling::input[@id='flda_91']");
	By LPC_RenewalComsn = By.xpath("//label[text()='% Renewal Commission']//following-sibling::input[@id='flda_93']");
	By LPC_RenewalComsnHeading=By.xpath("//label[text()='% Renewal Commission']");
	By LPC_AreThereAddProducersQuestn_Yes = By.xpath("//input[@id='rdo_5_1' and @name='rdo_5_1']");
	By LPC_AreThereAddProducersQuestn_No = By.xpath("//input[@id='rdo_5_2' and @name='rdo_5_2']");

	By LPC_ClicktoAddProducer = By.xpath("//button[text()='Click here to add...']");
	By LPC_AdditionalFrame = By.xpath("//iframe[@id='modalIframe']");
	By LPC_AdditionalProducerRole = By.xpath("//label[text()='Producer Role']//following::select[@id='lb_17']");
	By LPC_AdditionalProducerid = By.xpath("//label[text()='Producer ID #']//following::input[@id='flda_29']");
	By LPC_AdditionalAgencyId = By
			.xpath("//label[text()='Agency # / Distributor ID']//following-sibling::input[@id='flda_27']");
	By LPC_ADDFirstYearComsn = By.xpath("//input[@id='flda_34']");
	By LPC_ADDRenewalComsn = By.xpath("//input[@id='flda_35']");
	By LPC_Save = By.xpath("//div[@class='modal-footer']//button[@id='btn_6' or @name='btn_6']");
	By LPC_AdditionalHeading = By.xpath("//h1[text()='Additional Producer']");
	By AgentFirm=By.xpath("//select[@alt_id='SDPFirm']");
	By LPC_addproducerBtn = By.xpath("//button[@id='grdx15_addRowButton']");
	By Frame = By.xpath("//iframe[@id='CossScreenFrame']");

	By LPC_Contact1_FirstName = By.xpath("//label[text()='First Name']//following-sibling::input[@id='flda_103']");
	By LPC_Contact1_LastName = By.xpath("//label[text()='Last Name']//following-sibling::input[@id='flda_102']");
	By LPC_Contact1_Phone = By.xpath("//label[text()='Phone']//following-sibling::input[@id='flda_117']");
	By Phone_click = By.xpath("//label[@id='lbl_99']");
	By LPC_Contact1_Phonenumber = By.xpath("//input[@id='flda_117_fmt']");
	By LPC_Contact1_HomeWorkMobile = By
			.xpath("//label[text()='Home/Work/Mobile']//following-sibling::select[@id='lb_163']");
	By LPC_Contact1_work_extension = By.xpath("//label[text()='Extension']//following-sibling::input[@id='flda_164']");
	By LPC_Contact1_Email = By.xpath("//label[text()='Email']//following-sibling::input[@id='flda_118']");
	By LPC_Contact2_FirstName = By.xpath("//label[text()='First Name']//following-sibling::input[@id='flda_125']");
	By LPC_Contact2_LastName = By.xpath("//label[text()='Last Name']//following-sibling::input[@id='flda_124']");
	By LPC_Contact2_Phone = By.xpath("//label[text()='Phone']//following-sibling::input[@id='flda_126']");
	By LPC_Contact2_HomeWorkMobile = By
			.xpath("//label[text()='Home/Work/Mobile']//following-sibling::select[@id='lb_165']");
	By LPC_Contact2_WorkExtension = By.xpath("//label[text()='Extension']//following-sibling::input[@id='flda_166']");
	By LPC_Contact2_Email = By.xpath("//label[text()='Email']//following-sibling::input[@id='flda_127']");
	By LPC_License = By.xpath("//*[@id='flda_148']");
	By LPC_BACK = By.xpath("//*[@id='btn_32']");
	By LPC_NEXT = By.xpath("//*[@id='btn_31']");
	By LPC_sidebarheading = By.xpath("//a[contains(@id,'screen_button_MassMutualDI_MassMutualScreens_AgentComp')]");
	By LPC_AdditionalEntityName_DD = By.xpath("//select[@id='lb_36']");
	public void enterProducerCompensation(String ProducerRole, String ProducerEmail, String LicenceID,
			String Firstyearcommission, String RenewalCommision, String AdditionalProducer) {
		$(LPC_sidebarheading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(LPC_ProducerRole).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(ProducerRole); // Soliciting
		$(LPC_Email).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ProducerEmail);
		if ($(LPC_FloridaLicenceID).isDisplayed()) {
			$(LPC_FloridaLicenceID).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(LicenceID);
		}
		int PCentitycount2 = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_130']//option")).size();	
		//System.out.println("The entity values are"+entitycount);
		if(PCentitycount2>1){
			Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_130']")));
			sc.selectByIndex(1);
		}
		$(LPC_RenewalComsnHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		GlobalCap.sleep(7000);
		
		
		$(LPC_FirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcommission);
		$(LPC_RenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenewalCommision);
		$(LPC_RenewalComsnHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		GlobalCap.sleep(4000);
		selectRadioYesorNo(LPC_AreThereAddProducersQuestn_Yes, LPC_AreThereAddProducersQuestn_No, AdditionalProducer);
		GlobalCap.sleep(1000);
		HooksTest.idriver.switchTo().defaultContent();

	}

	public void AdditionalProducer(String AdditionalProducer, String num, String ProducerRole, String producerID1,
			String Agency1,String firm1, String producerID2, String Agency2,String firm2, String producerID3, String Agency3,
			String firm3,String Firstyearcomm1, String RenwalComm1, String Firstyearcomm2, String RenwalComm2, String Firstyearcomm3,
			String RenwalComm3) {

		if (AdditionalProducer.equalsIgnoreCase("Yes")) {
			int number = Integer.parseInt(num);

			for (i = 1; i <= number; i++) {
				System.out.println(number);
				GlobalCap.sleep(8000);
				$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
				HooksTest.idriver.switchTo().frame($(Frame));
				$(LPC_addproducerBtn).shouldBe(Visible.exist, Duration.ofSeconds(160)).click();
				GlobalCap.sleep(1000);
				HooksTest.idriver.switchTo().defaultContent();
				GlobalCap.sleep(1500);
				$(LPC_AdditionalFrame).shouldBe(Visible.exist, Duration.ofSeconds(100));
				HooksTest.idriver.switchTo().frame($(LPC_AdditionalFrame));
				$(LPC_AdditionalProducerRole).shouldBe(Visible.exist, Duration.ofSeconds(60))
						.selectOptionContainingText(ProducerRole);
				GlobalCap.sleep(1000);

				if (i == 1) {
					$(LPC_AdditionalProducerid).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(producerID1);
					$(LPC_AdditionalAgencyId).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Agency1);
					$(LPC_AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(2000);
					if($(AgentFirm).isDisplayed()){
						$(AgentFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(firm1);
					}
					$(LPC_AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(10000);
					int entitycount = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_36']//following::option")).size();	
					//System.out.println("The entity values are"+entitycount);
					if(entitycount>1){
						Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_36']")));
						sc.selectByIndex(1);
					}
					
					$(LPC_ADDFirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcomm1);
					$(LPC_ADDRenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenwalComm1);

				}
				if (i == 2) {
					$(LPC_AdditionalProducerid).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(producerID2);
					$(LPC_AdditionalAgencyId).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Agency2);
					$(LPC_AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					//GlobalCap.sleep(5000);
					GlobalCap.sleep(2000);
					if($(AgentFirm).isDisplayed()){
						$(AgentFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(firm2);
					}
					$(LPC_AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(10000);
					int entitycount2 = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_36']//following::option")).size();	
					//System.out.println("The entity values are"+entitycount);
					if(entitycount2>1){
						Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_36']")));
						sc.selectByIndex(1);
					}
					$(LPC_ADDFirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcomm2);
					$(LPC_ADDRenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenwalComm2);

				}
				if (i == 3) {
					$(LPC_AdditionalProducerid).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(producerID3);
					$(LPC_AdditionalAgencyId).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Agency3);
					$(LPC_AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(2000);
					if($(AgentFirm).isDisplayed()){
						$(AgentFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(firm3);
					}
					$(LPC_AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(10000);
					int entitycount3 = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_36']//following::option")).size();	
					//System.out.println("The entity values are"+entitycount);
					if(entitycount3>1){
						Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_36']")));
						sc.selectByIndex(1);
					}
					$(LPC_ADDFirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcomm3);
					$(LPC_ADDRenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenwalComm3);
				}

				$(LPC_AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				GlobalCap.sleep(2000);
				HooksTest.idriver.switchTo().defaultContent();
				$(LPC_Save).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				if (i == 2 || i == 3) {
					GlobalCap.sleep(10000);
				}
			}
		}
	}
	public void ContactDetails(String ContactOneFirstName, String ContactOneLastName, String ContactOnePhone,
			String ContactOneHomeWorkMobile, String ContactOneExtension, String ContactOneEmail,
			String ContactTwoFirstName, String ContactTwoLastName, String ContactTwoPhone,
			String ContactTwoHomeWorkMobile, String ContactTwoExtension, String ContactTwoEmail) {
		$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(Frame));
		GlobalCap.sleep(5000);
		$(LPC_Contact1_FirstName).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ContactOneFirstName);
		$(LPC_Contact1_LastName).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ContactOneLastName);
		$(LPC_Contact1_Phone).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Keys.HOME + ContactOnePhone);
		$(LPC_Contact1_HomeWorkMobile).shouldBe(Visible.exist, Duration.ofSeconds(60))
				.selectOptionContainingText(ContactOneHomeWorkMobile);
		if ($(LPC_Contact2_WorkExtension).isDisplayed()) {
			$(LPC_Contact1_work_extension).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.setValue(ContactOneExtension);
		}
		$(LPC_Contact1_Email).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ContactOneEmail);
		$(LPC_NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
}