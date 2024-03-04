package pageclass;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;

public class PersonalHistoryContTwo extends GlobalCap{
	By PHCtwo_TheProposedInsuredisquestn_RB_Employed = By.xpath("//*[@id='lbl_513_1']");
	By PHCtwo_TheProposedInsuredisquestn_RB_UnEmployed = By.xpath("//*[@id='lbl_513_2']");
	By PHCtwo_EMPCurrentOcc = By.xpath("//*[@id='lb_537']");
	By PHCtwo_EMP_Duties = By.xpath("//*[@id='flda_35']");
	By PHCtwo_EMP_EmployerORBusinessName = By.xpath("//*[@id='flda_33']");
	By PHCtwo_EMPCountry_DD = By.xpath("//*[@id='lb_17']");
	By PHCtwo_EMP_Street1 = By.xpath("//*[@id='flda_13']");
	By PHCtwo_EMP_Street2 = By.xpath("//*[@id='flda_7']");
	By PHCtwo_EMP_Street3  = By.xpath("//*[@id='flda_5']");	
	By PHCtwo_EMP_City = By.xpath("//*[@id='flda_11']");	
	By PHCtwo_EMP_State_DD = By.xpath("//*[@id='lb_9']");	
	By PHCtwo_EMP_Zipcode = By.xpath("//*[@id='flda_19']");
	By Zipcodetext = By.xpath("//label[@id='lbl_4_1']");
	By Zipcode = By.xpath("//input[@id='flda_19_fmt']");
	By PHCtwo_EMP_EarnedIncmCurrentyear = By.xpath("//*[@id='flda_29']");
	By PHCtwo_EMP_EarnedIncmPrioryear = By.xpath("//*[@id='flda_521']");
	By PHCtwo_EMP_UnEarnedIncmCurrentyear = By.xpath("//*[@id='flda_28']");
	By PHCtwo_EMP_UnEarnedIncmPrioryear = By.xpath("//*[@id='flda_522']");
	By PHCtwo_EMP_Networth = By.xpath("//*[@id='flda_27']");
	By PHCtwo_UnEMP_Reason_DD = By.xpath("//*[@id='lb_510']");
	By PHCtwo_UnEMP_AnnualHouseholdEarnIncm = By.xpath("//*[@id='flda_39']");
	By PHCtwo_UnEMP_AnnualHouseholdNetworth = By.xpath("//*[@id='flda_37']");
	By PHCtwo_UnEMP_AnnualHouseholUnEarnedIncm = By.xpath("//*[@id='flda_38']");
	By PHCtwo_OthercovOnWorkingSpouse = By.xpath("//*[@id='flda_525']");
	By PHCtwo_Back = By.xpath("//*[@id='btn_26']");
	By PHCtwo_Next = By.xpath("//*[@id='btn_25']");
	
	
	public void enterPersonalHistContTwo_screenDetails(String ProposedInsuredIS_questn, String EmpCurrentOcc,
			String EmpDuties, String EmployerName, String EmployerCountry, String EmployerStree1, String EmployerStree2,
			String EmployerStree3, String EmployerCity, String EmployerState, String EmployerZip,
			String EarnedIncmCurrentYear, String EarnedIncmPriorYear, String UNEarnedIncmCurrentYear,
			String UNEarnedIncmPriorYear, String EmpNetworth, String UnEmpReason, String AnnHouseEarnedIncm,
			String HouseholdNetworth, String AnnHouse_UNEarnedIncm, String OthercovWorkingspous) {
		if (ProposedInsuredIS_questn.equalsIgnoreCase("Employed")) {
			$(PHCtwo_TheProposedInsuredisquestn_RB_Employed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(1000);
			$(PHCtwo_EMPCurrentOcc).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmpCurrentOcc);
			GlobalCap.sleep(1000);
			$(PHCtwo_EMP_Duties).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmpDuties);
			$(PHCtwo_EMP_EmployerORBusinessName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmployerName);
			$(PHCtwo_EMP_Street1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmployerStree1);
			$(PHCtwo_EMP_Street2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmployerStree2);
			$(PHCtwo_EMP_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmployerCity);
			$(PHCtwo_EMP_State_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(EmployerState);
			$(PHCtwo_EMP_Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + EmployerZip);
			$(PHCtwo_EMP_EarnedIncmCurrentyear).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EarnedIncmCurrentYear);
			$(PHCtwo_EMP_EarnedIncmPrioryear).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EarnedIncmPriorYear);
			$(PHCtwo_EMP_UnEarnedIncmCurrentyear).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(UNEarnedIncmCurrentYear);
			$(PHCtwo_EMP_UnEarnedIncmPrioryear).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(UNEarnedIncmPriorYear);
			$(PHCtwo_EMP_Networth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmpNetworth);
		} else {
			$(PHCtwo_TheProposedInsuredisquestn_RB_UnEmployed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(PHCtwo_UnEMP_Reason_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(UnEmpReason);
			$(PHCtwo_UnEMP_AnnualHouseholdEarnIncm).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(AnnHouseEarnedIncm);
			$(PHCtwo_UnEMP_AnnualHouseholdNetworth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HouseholdNetworth);
			$(PHCtwo_UnEMP_AnnualHouseholUnEarnedIncm).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(AnnHouse_UNEarnedIncm);
			$(PHCtwo_OthercovOnWorkingSpouse).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(OthercovWorkingspous);
		}
		$(PHCtwo_Next).click();
	}
}
	
	