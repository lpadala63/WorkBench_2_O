package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class LTCR_InsurabilityInformation extends GlobalCap{
	By LTCR_INS_DeclinedYes = By.xpath("//input[@alt_id='LTCR_INS_DeclinedYesNo_1']");
	By LTCR_INS_DeclinedNo = By.xpath("//input[@alt_id='LTCR_INS_DeclinedYesNo_2']");
	By LTCR_INS_DeclinedDetails = By.xpath("//input[@alt_id='LTCR_INS_DeclinedDetails']");
	
	By LTCR_INS_NeedsHelpYes = By.xpath("//input[@alt_id='LTCR_INS_NeedsHelpYesNo_1']");
	By LTCR_INS_NeedsHelpNo = By.xpath("//input[@alt_id='LTCR_INS_NeedsHelpYesNo_2']");
	By LTCR_INS_NeedsHelpNoDetails = By.xpath("//input[@alt_id='LTCR_INS_NeedsHelpDetails']");
	
	By LTCR_INS_AmnesiaYes = By.xpath("//input[@alt_id='LTCR_INS_AmnesiaYesNo_1']");
	By LTCR_INS_AmnesiaNo = By.xpath("//input[@alt_id='LTCR_INS_AmnesiaYesNo_2']");
	By LTCR_INS_AmnesiaDetails = By.xpath("//input[@alt_id='LTCR_INS_AmnesiaDetails']");
	
	By LTCR_INS_JointYes = By.xpath("//input[@alt_id='LTCR_INS_JointYesNo_1']");
	By LTCR_INS_JointNo = By.xpath("//input[@alt_id='LTCR_INS_JointYesNo_2']");
	By LTCR_INS_JointDetails = By.xpath("//input[@alt_id='LTCR_INS_JointDetails']");
	
	
	By LTCR_INS_AtaxiaYes = By.xpath("//input[@alt_id='LTCR_INS_AtaxiaYesNo_1']");
	By LTCR_INS_AtaxiaNo = By.xpath("//input[@alt_id='LTCR_INS_AtaxiaYesNo_2']");
	By LTCR_INS_AtaxiaDetails = By.xpath("//input[@alt_id='LTCR_INS_AtaxiaDetails']");
	
	
	By LTCR_INS_MotionYes = By.xpath("//input[@alt_id='LTCR_INS_MotionYesNo_1']");
	By LTCR_INS_MotionNo = By.xpath("//input[@alt_id='LTCR_INS_MotionYesNo_2']");
	By LTCR_INS_MotionDetails = By.xpath("//input[@alt_id='LTCR_INS_MotionDetails']");
	
	By LTCR_INS_MemLossYes = By.xpath("//input[@alt_id='LTCR_INS_MemLossYesNo_1']");
	By LTCR_INS_MemLossNo = By.xpath("//input[@alt_id='LTCR_INS_MemLossYesNo_2']");
	By LTCR_INS_MemLossDetails = By.xpath("//input[@alt_id='LTCR_INS_MemLossDetails']");
	
	By LTCR_INS_TremorsYes = By.xpath("//input[@alt_id='LTCR_INS_TremorsYesNo_1']");
	By LTCR_INS_TremorsNo = By.xpath("//input[@alt_id='LTCR_INS_TremorsYesNo_2']");
	By LTCR_INS_TremorsDetails = By.xpath("//input[@alt_id='LTCR_INS_TremorsDetails']");
	
	
	By LTCR_INS_FallYes = By.xpath("//input[@alt_id='LTCR_INS_FallYesNo_1']");
	By LTCR_INS_FallNo = By.xpath("//input[@alt_id='LTCR_INS_FallYesNo_2']");
	By LTCR_INS_FallDetails = By.xpath("//input[@alt_id='LTCR_INS_FallDetails']");
	
	By Clickheretoadd = By.xpath("//button[contains(text(),'Click here to add')]");
	By PageFrame = By.xpath("//iframe[@id='modalIframe']");
	By Frame= By.xpath("//iframe[@id='CossScreenFrame']");
	By Medication = By.xpath("//input[@alt_id='Medication']");
	By DoseAndFrequency = By.xpath("//input[@alt_id='DoseAndFrequency']");
	By Doctor = By.xpath("//input[@alt_id='Doctor']");
	By Reason = By.xpath("//input[@alt_id='Reason']");
	By DateStarted = By.xpath("//input[@alt_id='DateStarted']");
	By DateStoped = By.xpath("//input[@alt_id='DateStopped']");
	By Save = By.xpath("//button[text()='Save']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By Heading = By.xpath("//h1[contains(text(),'Insurability Information')]");

	public void insurablityInformation(String INS_Declined, String INS_DeclinedDetails, String INS_NeedsHelp,
			String INS_NeedsHelpNoDetails, String INS_Amnesia, String INS_AmnesiaDetails, String INS_Joint,
			String INS_JointDetails, String INS_Ataxia, String INS_AtaxiaDetails, String INS_Motion,
			String INS_MotionDetails, String INS_MemLoss, String INS_MemLossDetails, String INS_Tremors,
			String INS_TremorsDetails, String INS_Fall, String INS_FallDetails, String medication,
			String doseAndFrequency, String doctor, String reason, String dateStarted,String dateStopped) {
		if ($(Heading).isDisplayed()) {
			selectRadioYesorNoDetails(LTCR_INS_DeclinedYes, LTCR_INS_DeclinedNo, INS_Declined,LTCR_INS_DeclinedDetails, INS_DeclinedDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_NeedsHelpYes, LTCR_INS_NeedsHelpNo, INS_NeedsHelp,LTCR_INS_NeedsHelpNoDetails, INS_NeedsHelpNoDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_AmnesiaYes, LTCR_INS_AmnesiaNo, INS_Amnesia, LTCR_INS_AmnesiaDetails,INS_AmnesiaDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_JointYes, LTCR_INS_JointNo, INS_Joint, LTCR_INS_JointDetails,INS_JointDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_AtaxiaYes, LTCR_INS_AtaxiaNo, INS_Ataxia, LTCR_INS_AtaxiaDetails,INS_AtaxiaDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_MotionYes, LTCR_INS_MotionNo, INS_Motion, LTCR_INS_MotionDetails,INS_MotionDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_MemLossYes, LTCR_INS_MemLossNo, INS_MemLoss, LTCR_INS_MemLossDetails,INS_MemLossDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_TremorsYes, LTCR_INS_TremorsNo, INS_Tremors, LTCR_INS_TremorsDetails,INS_TremorsDetails);
			GlobalCap.selectRadioYesorNoDetails(LTCR_INS_FallYes, LTCR_INS_FallNo, INS_Fall, LTCR_INS_FallDetails,INS_FallDetails);
			$(Clickheretoadd).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			HooksTest.idriver.switchTo().defaultContent();
			HooksTest.idriver.switchTo().frame($(PageFrame));
			$(Medication).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(medication);
			$(DoseAndFrequency).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(doseAndFrequency);
			$(Doctor).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(doctor);
			$(Reason).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(reason);
			$(DateStarted).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(dateStarted);
			$(DateStoped).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(dateStopped);
			HooksTest.idriver.switchTo().defaultContent();
			$(Save).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(4000);
			
			HooksTest.idriver.switchTo().frame($(Frame));
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

	}

}
