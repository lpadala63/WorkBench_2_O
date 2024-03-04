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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class AdditionalForms extends GlobalCap{


	By AF_GeneralForms = By.xpath("//*[@id='cb_<change>']|8|51|171|30|22");
	By AF_CoverPageCBX = By.xpath("//*[@id='cb_8']");
	By AF_MECNoticeAckCBX = By.xpath("//*[@id='cb_51']");
	By AF_DiscAckQualPlanCBX = By.xpath("//*[@id='cb_30']");
	By AF_PersonalFinSuplmntCBX = By.xpath("//*[@id='cb_22']");	
	By AF_ProposedInsuredForms = By.xpath("//*[@id='cb_<change>']|20|47|176|21|26");
	By AF_PsychHIPAACBX = By.xpath("//*[@id='cb_20']");
	By AF_AshBrkrgCBX = By.xpath("//*[@id='cb_47']");
	By AF_CrumpFormCBX = By.xpath("//*[@id='cb_176']");
	By AF_AlcoholDrugQuestnrCBX = By.xpath("//*[@id='cb_21']");
	By AF_DiabetesQuestnrCBX = By.xpath("//*[@id='cb_26']");
	By AF_ForeignlangCBX = By.xpath("//*[@id='cb_118']");
	By AF_VolAuthRelInfCBX = By.xpath("//*[@id='cb_194']");	
	By AF_AgentPHNumber = By.xpath("//*[@id='flda_191']");
	By AF_PHNumberType_DD = By.xpath("//*[@id='lb_188']");
	By AF_VoluntaryAuthtoDiscloseHealthRelatedInfo = By.xpath("//*[@id='cb_194']");
	By AF_Form_AgentPhoneNum = By.xpath("//*[@id='flda_241']");
	By AF_Form_PhNumberType = By.xpath("//*[@id='lb_238']");
	By AF_OtherCompany = By.xpath("//*[@id='flda_56']");
	By AF_ForeignLanguage_Language_DD = By.xpath("//select[@id='lb_168' or @name='lb_168']");
	By AF_ForeignLanguage_Other = By.xpath("//input[@id='flda_115' or @name='flda_115']");
	By AF_ForeignLanguage_TranslatorIsAn_DD = By.xpath("//select[@id='lb_113' or @name='lb_113']");
	By AF_AgentFirstName = By.xpath("//input[@id='lb_113' or @name='lb_113']");
	By AF_AgentMidleName = By.xpath("//input[@id='lb_113' or @name='lb_113']");
	By AF_AgentLastName = By.xpath("//input[@id='lb_113' or @name='lb_113']");
	By AF_AgentSuffix = By.xpath("//select[@id='lb_113' or @name='lb_113']");
	
	By AF_ProfessionalFirstName = By.xpath("//input[@id='flda_123' or @name='flda_123']");
	By AF_ProfessionalMidleName = By.xpath("//input[@id='flda_121' or @name='flda_121']");
	By AF_ProfessionalLastName = By.xpath("//input[@id='flda_119' or @name='flda_119']");
	By AF_ProfessionalSuffix = By.xpath("//select[@id='lb_109' or @name='lb_109']");
	
	By AF_ProfessionalTranslationFirm = By.xpath("//input[@id='flda_111' or @name='flda_111']");
	By AF_ProfessionalStreet_1 = By.xpath("//input[@id='flda_134' or @name='flda_134']");
	By AF_ProfessionalStreet_2 = By.xpath("//input[@id='flda_132' or @name='flda_132']");
	By AF_Professional_City = By.xpath("//input[@id='flda_128' or @name='flda_128']");
	By AF_Professional_State= By.xpath("//select[@id='lb_126' or @name='lb_126']");
	By AF_Professional_Zip= By.xpath("//input[@id='flda_136' or @name='flda_136']");
	
	By AF_GDBPA = By.xpath("//*[@id='cb_260']");
	By AF_GrossGDBPA = By.xpath("//*[@id='cb_262']");
	By AF_Amount = By.xpath("//*[@id='flda_270']");
	By AF_BACK = By.xpath("//*[@id='btn_3']");
	 By NEXT = By.xpath("//button[contains(text(),'Next')]");
	

	
	public void enterAdditionalFormsDetail(String preferedLanguage, String languages,String Others,String Translator,String AgentFirstname,
			String Agent_Midlename, String AgentLastname, String Agent_suffix,String ProfessionavlFirstName,
			String ProfessionalMidleName, String ProfessionalLastName, String ProfessionalSuffix,String ProfessionalTranslationFirm,
			String ProfessionalStreet_1, String ProfessionalStreet_2, String Professional_City,
			String Professional_State, String Professional_Zip) {
		
		//Next
		if(preferedLanguage.equalsIgnoreCase("Yes")){
			$(AF_ForeignLanguage_Language_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(languages);
			if(languages.equalsIgnoreCase("Other")){
				$(AF_ForeignLanguage_Language_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Others);
			}
			$(AF_ForeignLanguage_TranslatorIsAn_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Translator);
			if(Translator.equalsIgnoreCase("General Agent / Agency Staff")){
				$(AF_AgentFirstName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(AgentFirstname);
				$(AF_AgentMidleName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Agent_Midlename);
				$(AF_AgentLastName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(AgentLastname);
				$(AF_AgentSuffix).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Agent_suffix);
			}
			if(Translator.equalsIgnoreCase("General Agent / Agency Staff")){
				$(AF_AgentFirstName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(AgentFirstname);
				$(AF_AgentMidleName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Agent_Midlename);
				$(AF_AgentLastName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(AgentLastname);
				$(AF_AgentSuffix).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Agent_suffix);
			}
			if(Translator.equalsIgnoreCase("Professional Translator")){
				$(AF_ProfessionalFirstName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProfessionavlFirstName);
				$(AF_ProfessionalMidleName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProfessionalMidleName);
				$(AF_ProfessionalLastName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProfessionalLastName);
				$(AF_ProfessionalSuffix).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(ProfessionalSuffix);
				
				$(AF_ProfessionalTranslationFirm).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProfessionalTranslationFirm);
				$(AF_ProfessionalStreet_1).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProfessionalStreet_1);
				$(AF_ProfessionalStreet_2).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ProfessionalStreet_2);
				$(AF_Professional_City).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Professional_City);
				$(AF_Professional_State).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Professional_State);
				$(AF_Professional_Zip).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Professional_Zip);
			}
			$(NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			System.out.println("clicked additional ny next");
		}else{
			System.out.println("clicked addional all next");
		$(NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}
	
	
	
}
	
	