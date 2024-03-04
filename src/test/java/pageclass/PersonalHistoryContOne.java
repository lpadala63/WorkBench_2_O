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

public class PersonalHistoryContOne extends GlobalCap{

	By PHC_AnticipateForgnTravelinNext2yearsquestn_RB_yes = By.xpath("//*[@id='rdo_4_1']");
	By PHC_AnticipateForgnTravelinNext2yearsquestn_RB_No = By.xpath("//*[@id='rdo_4_2']");	
	By PHC_HaveWrittenAgrmntOrCurrentmemberofArmedforcesQuestn_RB_yes = By.xpath("//*[@id='rdo_6_1']");
	By PHC_HaveWrittenAgrmntOrCurrentmemberofArmedforcesQuestn_RB_No = By.xpath("//*[@id='rdo_6_2']");
	By PHC_ExpectTobePilotNext2yrsOrinLast3yrsQuestn_RB_yes = By.xpath("//*[@id='rdo_8_1']");
	By PHC_ExpectTobePilotNext2yrsOrinLast3yrsQuestn_RB_No = By.xpath("//*[@id='rdo_8_2']");
	By PHC_TakepartinUnderwaterdivingQuestn_RB_yes = By.xpath("//*[@id='rdo_10_1']");
	By PHC_TakepartinUnderwaterdivingQuestn_RB_No = By.xpath("//*[@id='rdo_10_2']");
	
	By ultralight_soaring_ballooning_Yes = By.xpath("//label[contains(text(),'ultralight, soaring or ballooning')]//following::input[@alt_id='UW_Q12a_1']");
	By ultralight_soaring_ballooning_No = By.xpath("//label[contains(text(),'ultralight, soaring or ballooning')]//following::input[@alt_id='UW_Q12a_2']");
	By motorboat_snowmobile_Yes = By.xpath("//label[contains(text(),'motorboat or snowmobile')]//following::input[@alt_id='UW_Q12b_1']");
    By motorboat_snowmobile_No=By.xpath("//label[contains(text(),'motorboat or snowmobile')]//following::input[@alt_id='UW_Q12b_2']");
	
    //CA
  
    By PhysicianName = By.xpath("//input[@alt_id='PhysicianType_1']");
    By PracticeName = By.xpath("//span[contains(text(),'Practice Name')]");
	By PhysicianFirstName = By.xpath("//input[@alt_id='PhysicianFirstName']");
	By PhysicianMiddleName = By.xpath("//input[@alt_id='PhysicianMiddleName']");	
	By PhysicianLastName = By.xpath("//input[@alt_id='PhysicianLastName']");
	By PhysicianSuffix = By.xpath("//input[@alt_id='PhysicianSuffix']");
	By PhysicianADDR_Line1 = By.xpath("//input[@alt_id='PhysicianADDR_Line1']");
	By PhysicianADDR_Line2 = By.xpath("//input[@alt_id='PhysicianADDR_Line2']");
	By PhysicianADDR_City = By.xpath("//input[@alt_id='PhysicianADDR_City']");
	By PhysicianADDR_State = By.xpath("//input[@alt_id='PhysicianADDR_State']");	
	By PhysicianADDR_Zip = By.xpath("//input[@alt_id='PhysicianADDR_Zip']");
	By PhysicianPhone = By.xpath("//input[@alt_id='PhysicianPhone']");
	By DateLastseenMM = By.xpath("//input[@class='jq-dte-month jq-dte-is-required hint']");
	By DateLastseenDD = By.xpath("//span[@class='jq-dte-inner jq-dte-is-required']//following-sibling::input[@class='jq-dte-day jq-dte-is-required hint']");
	By DateLastseenYYYY = By.xpath("//span[@class='jq-dte-inner jq-dte-is-required']//following-sibling::input[@class='jq-dte-year jq-dte-is-required hint']"); 
	By TimeFrameLastseen = By.xpath("//*[@alt_id='PhysicianDateLastConsultedTimeFrame']");
	By details = By.xpath("//*[@alt_id='UW_AdditionalDetails']");
	
    By PhysicianFacilityName= By.xpath("//input[@alt_id='PhysicianFacilityName']");
    By Unknown = By.xpath("//span[contains(text(),'Unknown')]");
    By None = By.xpath("//span[contains(text(),'None')]");
	By PH_Next = By.xpath("//*[@id='btn_30']");
	
	public void enterPersonalHistoryInformationContOneDetails(String state, String AntcptForgnTravelQuestn,
			String HaveAgmtToBcmArmedforcesQuestn, String ExpectedMemberofPilotQuestn,
			String TakePartinUnderwaterdivingHangglidParaSailing, String ultralight_soaring_ballooning,
			String motorboat_snowmobile, String PhysicianType, String Firstname, String MiddleName, String LastName,
			String Suffix, String street1, String street2, String City, String State, String Zip, String Telephone,
			String MM, String DD, String YYYY, String TimeFrameLastSeen, String Details, String FacilityName) {
		selectRadioYesorNo(PHC_AnticipateForgnTravelinNext2yearsquestn_RB_yes,PHC_AnticipateForgnTravelinNext2yearsquestn_RB_No, AntcptForgnTravelQuestn);
		selectRadioYesorNo(PHC_HaveWrittenAgrmntOrCurrentmemberofArmedforcesQuestn_RB_yes,PHC_HaveWrittenAgrmntOrCurrentmemberofArmedforcesQuestn_RB_No, HaveAgmtToBcmArmedforcesQuestn);
		selectRadioYesorNo(PHC_ExpectTobePilotNext2yrsOrinLast3yrsQuestn_RB_yes,PHC_ExpectTobePilotNext2yrsOrinLast3yrsQuestn_RB_No, ExpectedMemberofPilotQuestn);
		if ($(PHC_TakepartinUnderwaterdivingQuestn_RB_yes).isDisplayed()) {
			selectRadioYesorNo(PHC_TakepartinUnderwaterdivingQuestn_RB_yes, PHC_TakepartinUnderwaterdivingQuestn_RB_No,TakePartinUnderwaterdivingHangglidParaSailing);
		}
		if (state.equalsIgnoreCase("New York")) {
			selectRadioYesorNo(ultralight_soaring_ballooning_Yes, ultralight_soaring_ballooning_No,ultralight_soaring_ballooning);
			selectRadioYesorNo(motorboat_snowmobile_Yes, motorboat_snowmobile_No, motorboat_snowmobile);
		}
		if (state.equalsIgnoreCase("California")) {
			if (PhysicianType.equalsIgnoreCase("Physician Name")) {
				$(PhysicianName).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(PhysicianFirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Firstname);
				$(PhysicianMiddleName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MiddleName);
				$(PhysicianLastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LastName);
				$(PhysicianSuffix).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Suffix);
				$(PhysicianADDR_Line1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street1);
				$(PhysicianADDR_Line2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street2);
				$(PhysicianADDR_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
				$(PhysicianADDR_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
				$(PhysicianADDR_Zip).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zip);
				$(PhysicianPhone).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Telephone);
				$(DateLastseenMM).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MM);
				$(DateLastseenDD).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(DD);
				$(DateLastseenYYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(YYYY);
				$(TimeFrameLastseen).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(TimeFrameLastSeen);
				$(details).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Details);
			}
			if (PhysicianType.equalsIgnoreCase("Practice Name")) {
				$(PracticeName).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(PhysicianFacilityName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(FacilityName);
				$(PhysicianADDR_Line1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street1);
				$(PhysicianADDR_Line2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street2);
				$(PhysicianADDR_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
				$(PhysicianADDR_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
				$(PhysicianADDR_Zip).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zip);
				$(PhysicianPhone).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Telephone);
				$(DateLastseenMM).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MM);
				$(DateLastseenDD).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(DD);
				$(DateLastseenYYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(YYYY);
				$(TimeFrameLastseen).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(TimeFrameLastSeen);
				$(details).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Details);
			}
			if (PhysicianType.equalsIgnoreCase("Unknown")) {
				$(Unknown).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(DateLastseenMM).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MM);
				$(DateLastseenDD).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(DD);
				$(DateLastseenYYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(YYYY);
				$(TimeFrameLastseen).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(TimeFrameLastSeen);
				$(details).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Details);
			} else {
				$(None).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(details).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Details);
			}
		}
		$(PH_Next).click();
	}
}
	
	