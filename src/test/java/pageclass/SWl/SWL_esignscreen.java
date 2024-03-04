package pageclass.SWl;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class SWL_esignscreen extends GlobalCap {
	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By Esign = By.xpath("//input[@id='cb_66' and @name='cb_66']");
	By FaceInsured1= By.xpath("//input[@id='rdo_71_1' and @name='rdo_71_1']");
	By ESignEmailInsured1 = By.xpath("//input[@id='rdo_71_2' and @name='rdo_71_2']");
	
	By FaceInsured2= By.xpath("//input[@alt_id='Role2PresentQ_1']");
	By ESignEmailInsured2 = By.xpath("//input[@alt_id='Role2PresentQ_2']");
	
	By ESNext = By.xpath("//button[contains(text(),'Next')]");
	By SigInstructorInsNEXT = By.xpath("//button[contains(text(),'Next')]");
	By InsDisclosureYes = By.xpath("//input[@id='rdo_24_1' and @name='rdo_24_1']");
	By InsDisclosureNo = By.xpath("//input[@id='rdo_24_2' and @name='rdo_24_2']");
	By IdProofIns1 = By.xpath("//select[@id='lb_113' and @name='lb_113']");
	By IDNumberIns1 = By.xpath("//input[@id='flda_111' and @name='flda_111']");
	
	
	By InsDisclosureIns2Yes = By.xpath("//input[@alt_id='CTS_OI1Agree_1']");
	By InsDisclosureIns2No = By.xpath("//input[@alt_id='CTS_OI1Agree_2']");
	By IdProofIns2 = By.xpath("//select[@alt_id='CTS_OI1ID']");
	By IDNumberIns2 = By.xpath("//input[@alt_id='CTS_OI1IDNumber']");
	By DiscNext = By.xpath("//button[contains(text(),'Next')]");
	
	
	
	
	By ReviewApp = By.xpath("//button[contains(text(),'Review Application')]");
	// By ReviewApp = By.xpath("//button[@id='btn_15' and @name='btn_15']");
	By AppClose = By.xpath(
			"//div[@class='modal-footer']//following::button[@type='button' and text()='Close' and @class='btn btn-default  btn-sm']");
	By InsuredAgreeins1 = By.xpath("//input[@id='cb_36' and @name='cb_36']");
	By InsuredAgreeins2 = By.xpath("//input[@alt_id='CTS_Role2_TermsOfUse']");
	By ConsentNext = By.xpath("//button[contains(text(),'Next')]");

	By NyEsignFormCB = By.xpath("//input[@alt_id='CTS_PDFForms_Role1']");
	By NySWLEsignFormCB = By.xpath("//input[@alt_id='CTS_PDFForms_Role2']");
	By NyEsignNext = By.xpath("//button[contains(text(),'Next')]");

	By ApplySignIns1CB1 = By.xpath("//input[@id='cb_32' and @name='cb_32']");
	By ApplySignIns2CB1 = By.xpath("//input[@alt_id='CTS_OI1_AgreeA']");
	
	By ApplySignIns1CB2 = By.xpath("//input[@id='cb_3' and @name='cb_3']");
	By ApplySignIns2CB2 = By.xpath("//input[@alt_id='CTS_OI1_AgreeB']");
	
	By ApplySignIns1CB3 = By.xpath("//input[@id='cb_71' and @name='cb_71']");
	By ApplySignIns2CB3 = By.xpath("//input[@alt_id='CTS_OI1_AgreeC']");
	
	
	By ApplySignIns1CB4 = By.xpath("//input[@id='cb_81' and @name='cb_81']");
	By ApplySignIns2CB4 = By.xpath("//input[@alt_id='CTS_OI1_AgreeD']");
	
	By insured2signedcity = By.xpath("//input[@alt_id='CTS_PI2_CitySigned']");
	By insured2signedState = By.xpath("//select[@alt_id='CTS_PI2_StateSigned']");
	By ApplySignature = By.xpath("//button[contains(text(),'Apply eSignature')]");
	By AppySIgnNext = By.xpath("//button[contains(text(),'Next')]");
	
	
	By ProdSignConsentRevApp = By.xpath("//button[contains(text(),'Review Application')]");
	By ProdAPpClose = By.xpath(
			"//div[@class='modal-footer']//following::button[@type='button' and text()='Close' and @class='btn btn-default  btn-sm']");
	By ProdAgree = By.xpath("//input[@id='cb_35' and @name='cb_35']");
	By ProdConsentNext = By.xpath("//button[contains(text(),'Next')]");
	By ProdEsignCB = By.xpath("//input[@id='cb_40' or @name='cb_40']");
	By ProdSIgnature = By.xpath("//button[contains(text(),'Apply eSignature')]");
	By ApplyToMM = By.xpath("//button[contains(text(),'Submit to MassMutual')]");
	By ApplyToMMNy = By.xpath("//button[contains(text(),'Apply')]");
	By ApplyToMMNyesign = By.xpath("//button[contains(text(),'Submit Application ')]");
	By enter = By.xpath("//span[text()='Proposed Insured 1']");

	public void ESignInsured(String InsIDproof, String InsIdNum, String IdproofIns2,String IdNumberIns2,String insd2signedcity,String insd2signedState) {

		$(FaceInsured1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(FaceInsured2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(ESNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(SigInstructorInsNEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
		$(InsDisclosureYes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(IdProofIns1).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(InsIDproof);
		$(IDNumberIns1).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(InsIdNum);
		$(enter).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(InsDisclosureIns2Yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(IdProofIns2).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(IdproofIns2);
		$(IDNumberIns2).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(IdNumberIns2);
		$(enter).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
		$(DiscNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
		
		$(ReviewApp).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		HooksTest.idriver.switchTo().defaultContent();
		GlobalCap.sleep(1000);
		$(AppClose).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		GlobalCap.sleep(7000);

		$(frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(frame));

		$(InsuredAgreeins1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(InsuredAgreeins2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(ConsentNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		

		if ($(NyEsignFormCB).isDisplayed()) {
			$(NyEsignFormCB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			if ($(NySWLEsignFormCB).isDisplayed()) {
				$(NySWLEsignFormCB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				

			}
			$(NyEsignNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		}

		
		
		$(ApplySignIns1CB1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(ApplySignIns2CB1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
		$(ApplySignIns1CB2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(ApplySignIns2CB2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(ApplySignIns1CB3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(ApplySignIns2CB3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(ApplySignIns1CB4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(ApplySignIns2CB4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
		$(insured2signedcity).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(insd2signedcity);
		$(insured2signedState).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(insd2signedState);
	
		
		$(ApplySignature).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(AppySIgnNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

	}

	public void ESignProducer() {
		$(ProdSignConsentRevApp).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		HooksTest.idriver.switchTo().defaultContent();
		GlobalCap.sleep(1000);

		$(ProdAPpClose).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(frame));
		GlobalCap.sleep(2000);
		$(ProdAgree).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(ProdConsentNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		// div[@class='modal-footer']//following::button[@type='button' and
		// text()='Close' and @class='btn btn-default btn-sm']

		$(ProdEsignCB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(ProdSIgnature).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if ($(ApplyToMM).isDisplayed()) {
			$(ApplyToMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		} else {
			$(ApplyToMMNyesign).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

	}
}
