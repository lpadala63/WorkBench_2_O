package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class ESign extends GlobalCap {
	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By Esign = By.xpath("//input[@id='cb_66' and @name='cb_66']");
	By Face = By.xpath("//input[@id='rdo_71_1' and @name='rdo_71_1']");
	By OwnerFace = By.xpath("//input[@id='rdo_76_1' and @name='rdo_76_1']");
	By PlanSponsor = By.xpath("//input[@id='rdo_136_1' and @name='rdo_136_1']");
	By Trustee = By.xpath("//input[@id='rdo_137_1' and @name='rdo_137_1']");
	//By ESignEmail = By.xpath("//input[@id='rdo_71_2' and @name='rdo_71_2']");
	By ESNext = By.xpath("//button[contains(text(),'Next')]");
	
	By SigInstructorInsNEXT = By.xpath("//button[contains(text(),'Next')]");
	
	By InsDisclosureYes = By.xpath("//input[@id='rdo_24_1' and @name='rdo_24_1']");
	By InsDisclosureNo = By.xpath("//input[@id='rdo_24_2' and @name='rdo_24_2']");
	By IdProof = By.xpath("//select[@id='lb_113' and @name='lb_113']");
	By IDNumber = By.xpath("//input[@id='flda_111' and @name='flda_111']");
	By owner= By.xpath("//span[text()='Owner']");
	By OwnerInsDisclosureYes = By.xpath("//input[@id='rdo_25_1' and @name='rdo_25_1']");
	By OwnerInsDisclosureNo = By.xpath("//input[@id='rdo_25_2' and @name='rdo_25_2']");
	By OwnerIdProof = By.xpath("//select[@id='lb_125' and @name='lb_125']");
	By OwnerIDNumber = By.xpath("//input[@id='flda_121' and @name='flda_121']");
	By PlanSponsorH= By.xpath("//span[contains(text(),'Plan Sponsor')]");
	By PlanInsDisclosureYes = By.xpath("//input[@id='rdo_226_1' and @name='rdo_226_1']");
	By PlanInsDisclosureNo = By.xpath("//input[@id='rdo_226_2' and @name='rdo_226_2']");
	By PlanIdProof = By.xpath("//select[@id='lb_232' and @name='lb_232']");
	By PlanIDNumber = By.xpath("//input[@id='flda_228' and @name='flda_228']");
	
	By TrusteeH= By.xpath("//span[contains(text(),'Plan Trustee')]");
	By TrusteeInsDisclosureYes = By.xpath("//input[@id='rdo_241_1' and @name='rdo_241_1']");
	By TrusteeInsDisclosureNo = By.xpath("//input[@id='rdo_241_2' and @name='rdo_241_2']");
	By TrusteeIdProof = By.xpath("//select[@id='lb_247' and @name='lb_247']");
	By TrusteeIDNumber = By.xpath("//input[@id='flda_243' and @name='flda_243']");
	By DiscNext = By.xpath("//button[contains(text(),'Next')]");
	
	
	
	
	By ReviewApp = By.xpath("//button[contains(text(),'Review Application')]");
	//By ReviewApp = By.xpath("//button[@id='btn_15' and @name='btn_15']");
	By AppClose = By.xpath(
			"//div[@class='modal-footer']//following::button[@type='button' and text()='Close' and @class='btn btn-default  btn-sm']");
	By InsuredAgree = By.xpath("//input[@id='cb_36' and @name='cb_36']");
	By OwnerAgree = By.xpath("//input[@id='cb_12' and @name='cb_12']");
	By PlanSponsorChk = By.xpath("//input[@id='cb_82' and @name='cb_82']");
	By trusteChk = By.xpath("//input[@id='cb_86' and @name='cb_86']");
	By ConsentNext = By.xpath("//button[contains(text(),'Next')]");
	
	
	
	By NyEsignFormCB=By.xpath("//input[@alt_id='CTS_PDFForms_Role1']");
	By NyEsignOwnerFormCB=By.xpath("//input[@id='cb_51']");
	By NyEsignNext=By.xpath("//button[contains(text(),'Next')]");
	 
	By ApplySignCB1 = By.xpath("//input[@id='cb_32' and @name='cb_32']");
	By ApplySignCB2 = By.xpath("//input[@id='cb_3' and @name='cb_3']");
	By ApplySignCB3 = By.xpath("//input[@id='cb_71' and @name='cb_71']");
	By ApplySignCB4 = By.xpath("//input[@id='cb_81' and @name='cb_81']");
	
	By OwnerApplySignCB1 = By.xpath("//input[@id='cb_61' and @name='cb_61']");
	By OwnerApplySignCB2 = By.xpath("//input[@id='cb_65' and @name='cb_65']");
	By OwnerApplySignCB3 = By.xpath("//input[@id='cb_75' and @name='cb_75']");
	By OwnerApplySignCB4 = By.xpath("//input[@id='cb_85' and @name='cb_85']");
	
	By PlansponsorApplySignCB1 = By.xpath("//input[@id='cb_179' and @name='cb_179']");
	By PlansponsorApplySignCB2 = By.xpath("//input[@id='cb_182' and @name='cb_182']");
	By PlansponsorApplySignCB3 = By.xpath("//input[@id='cb_184' and @name='cb_184']");
	By PlansponsorApplySignCB4 = By.xpath("//input[@id='cb_186' and @name='cb_186']");
	
	By TrusteeApplySignCB1 = By.xpath("//input[@id='cb_204' and @name='cb_204']");
	By TrusteeApplySignCB2 = By.xpath("//input[@id='cb_206' and @name='cb_206']");
	By TrusteeApplySignCB3 = By.xpath("//input[@id='cb_208' and @name='cb_208']");
	By TrusteeApplySignCB4 = By.xpath("//input[@id='cb_210' and @name='cb_210']");
	
	
	By ProposedInsuredCity=By.xpath("//input[@id='flda_190' and @name='flda_190']");
	By ProposedInsuredState=By.xpath("//select[@id='lb_188' and @name='lb_188']");
	
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
	By enter = By.xpath("//span[text()='Proposed Insured']");
	
	
	
    By AcknowledgeReceipt=By.xpath("//h1[@id='lbl_3']");
    By OutLineOfCoverage=By.xpath("//input[@id='cb_18']");
    By HICAP=By.xpath("//input[@id='cb_19']");
    By LTCtakingcare=By.xpath("//input[@id='cb_20']");
    By LTCIPW=By.xpath("//input[@id='cb_21']");
    By NoticetoApplicant=By.xpath("//input[@id='cb_22']");
    By BuyLTC=By.xpath("//input[@id='cb_23']");
    
    
    
	
	public void ESignInsured(String InsIDproof, String InsIdNum,String OwnerInsIDproof,String OwnerInsIdNum,String proposedInsuredCity,String proposedinsuredstate) {
//signatureMethod
		$(Face).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if($(OwnerFace).isDisplayed()){
			$(OwnerFace).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();			
		}
		if($(PlanSponsor).isDisplayed()){
			$(PlanSponsor).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();			
		}
		if($(Trustee).isDisplayed()){
			$(Trustee).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();			
		}
		$(ESNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
		
		//E-signature Instruction
		$(SigInstructorInsNEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		
		//Esign Disclosure
		
		//insured
		$(InsDisclosureYes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(IdProof).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(InsIDproof);
		$(IDNumber).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(InsIdNum);
		$(enter).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		//owner
		if($(owner).isDisplayed()){
			$(OwnerInsDisclosureYes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(OwnerIdProof).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(OwnerInsIDproof);
			$(OwnerIDNumber).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OwnerInsIdNum);
			$(owner).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		//plansponsor
		if($(PlanSponsorH).isDisplayed()){
			$(PlanInsDisclosureYes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(PlanIdProof).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(OwnerInsIDproof);
			$(PlanIDNumber).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OwnerInsIdNum);
			$(PlanSponsorH).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		//trustee
		if($(TrusteeH).isDisplayed()){
			$(TrusteeInsDisclosureYes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(TrusteeIdProof).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(OwnerInsIDproof);
			$(TrusteeIDNumber).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OwnerInsIdNum);
			$(TrusteeH).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		$(DiscNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		
		
		//Terms of Use and eSignature Consent -------  PAGE
		
		$(ReviewApp).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		HooksTest.idriver.switchTo().defaultContent();
		GlobalCap.sleep(6000);
		$(AppClose).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		GlobalCap.sleep(9000);
		$(frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(frame));

		$(InsuredAgree).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if($(OwnerAgree).isDisplayed()){
			$(OwnerAgree).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if($(PlanSponsorChk).isDisplayed()){
			$(PlanSponsorChk).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if($(trusteChk).isDisplayed()){
			$(trusteChk).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

		$(ConsentNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
		
		if($(NyEsignFormCB).isDisplayed()){
			$(NyEsignFormCB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			if($(NyEsignOwnerFormCB).isDisplayed()){
				$(NyEsignOwnerFormCB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			$(NyEsignNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if($(AcknowledgeReceipt).isDisplayed()){
			
			$(OutLineOfCoverage).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(HICAP).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(LTCtakingcare).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(LTCIPW).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(NoticetoApplicant).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(BuyLTC).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(ConsentNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		
		//Apply E-signature-----PAge
		
		$(ApplySignCB1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if($(OwnerApplySignCB1).isDisplayed()){
			$(OwnerApplySignCB1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		if($(PlansponsorApplySignCB1).isDisplayed()){
			$(PlansponsorApplySignCB1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		if($(TrusteeApplySignCB1).isDisplayed()){
			$(TrusteeApplySignCB1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}

		
		$(ApplySignCB2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if($(OwnerApplySignCB2).isDisplayed()){
			$(OwnerApplySignCB2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		if($(PlansponsorApplySignCB2).isDisplayed()){
			$(PlansponsorApplySignCB2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}if($(TrusteeApplySignCB2).isDisplayed()){
			$(TrusteeApplySignCB2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}	
		
		
		$(ApplySignCB3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if($(OwnerApplySignCB3).isDisplayed()){
			$(OwnerApplySignCB3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		if($(PlansponsorApplySignCB3).isDisplayed()){
			$(PlansponsorApplySignCB3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		if($(TrusteeApplySignCB3).isDisplayed()){
			$(TrusteeApplySignCB3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		

		
		$(ApplySignCB4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if($(OwnerApplySignCB4).isDisplayed()){
			$(OwnerApplySignCB4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		if($(PlansponsorApplySignCB4).isDisplayed()){
			$(PlansponsorApplySignCB4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		if($(TrusteeApplySignCB4).isDisplayed()){
			$(TrusteeApplySignCB4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		
		if($(ProposedInsuredCity).isDisplayed()){
			$(ProposedInsuredCity).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(proposedInsuredCity);
			$(ProposedInsuredState).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(proposedinsuredstate);
		}
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
		GlobalCap.sleep(1500);
		$(ProdConsentNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		
		
		// div[@class='modal-footer']//following::button[@type='button' and
		// text()='Close' and @class='btn btn-default btn-sm']

		$(ProdEsignCB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		$(ProdSIgnature).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if ($(ApplyToMM).isDisplayed()) {
			$(ApplyToMM).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if($(ApplyToMMNyesign).isDisplayed()){
			
			$(ApplyToMMNyesign).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

	}
}