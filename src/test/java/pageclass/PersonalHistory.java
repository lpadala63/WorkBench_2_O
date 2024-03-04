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

public class PersonalHistory extends GlobalCap {

	By PHInsuredCurrentlyDisabledquestn_No = By.xpath("//input[@id='rdo_32_2']");
	By PHInsuredCurrentlyDisabledquestn_Yes = By.xpath("//input[@id='rdo_32_1']");
	By PHInsuredCurrentlyDisabledquestn_Yes_Details = By.xpath("//*[@id='flda_40']");
	By PHUsedTobaccoin12mnths_No = By.xpath("//input[@id='rdo_4_2']");
	By PHUsedTobaccoin12mnths_Yes = By.xpath("//input[@id='rdo_4_1']");
	By PHUsedTobaccoin12mnths_Yes_Details = By.xpath("//*[@id='flda_6']");
	By PHUsedTobaccoin24mnths_No = By.xpath("//input[@id='rdo_9_2']");
	By PHUsedTobaccoin24mnths_Yes = By.xpath("//input[@id='rdo_9_1']");
	By PHUsedTobaccoin24mnths_Yes_Details = By.xpath("//*[@id='flda_10']");
	By PHUsedCigarsWithin24mnths_No = By.xpath("//input[@id='rdo_43_2']");
	By PHUsedCigarsWithin24mnths_Yes = By.xpath("//input[@id='rdo_43_1']");
	By PHNumberofCigarsperyear_1to24 = By.xpath("//*[@id='rdo_42_1']");
	By PHNumberofCigarsperyear_25ormore = By.xpath("//*[@id='rdo_42_2']");
	By PHUsedPrescMedtoAssistSmokingCessation_No = By.xpath("//input[@id='rdo_13_2']");
	By PHUsedPrescMedtoAssistSmokingCessation_Yes = By.xpath("//input[@id='rdo_13_1']");
	By PHUsedPrescMedtoAssistSmokingCessation_Yes_Detils = By.xpath("//*[@id='flda_14']");
	By PHEverConvictedofFelonyORCurrentlyonPayrolProbtnQuest_No = By.xpath("//input[@id='rdo_17_2']");
	By PHEverConvictedofFelonyORCurrentlyonPayrolProbtnQuest_Yes = By.xpath("//input[@id='rdo_17_1']");
	By PHEverConvictedofFelonyORCurrentlyonPayrolProbtnQuest_Yes_Details = By.xpath("//*[@id='flda_18']");
	By PHBeenConvictedofOperatingMotorVehicleunderAlcoholinflnc_No = By.xpath("//input[@id='rdo_21_2']");
	By PHBeenConvictedofOperatingMotorVehicleunderAlcoholinflnc_Yes = By.xpath("//input[@id='rdo_21_1']");
	By PHBeenConvictedofOperatingMotorVehicleunderAlcoholinflnc_Yes_Details = By.xpath("//*[@id='flda_22']");
	By PHBeeninMotorVehicleAccdntWhichFoundatFault_No = By.xpath("//input[@id='rdo_25_2']");
	By PHBeeninMotorVehicleAccdntWhichFoundatFault_Yes = By.xpath("//input[@id='rdo_25_1']");
	By PHAtfaultmotorvehicleaccident_No = By.xpath("//input[@id='rdo_50_2']");
	By PHAtfaultmotorvehicleaccident_Yes = By.xpath("//input[@id='rdo_50_1']");
	By PHAtfaultmotorvehicleaccident_Yes_Howmany = By.xpath("//*[@id='lb_46']");
	By PHAtfaultmotorvehicleaccident_Yes_When1 = By.xpath("//*[@id='flda_57']");
	By PHAtfaultmotorvehicleaccident_Yes_When2 = By.xpath("//*[@id='flda_59']");
	By PHAtfaultmotorvehicleaccident_Yes_When3 = By.xpath("//*[@id='flda_61']");
	By PHSpeedingticket_No = By.xpath("//input[@id='rdo_62_2']");
	By PHSpeedingticket_Yes = By.xpath("//input[@id='rdo_62_1']");
	By PHLessthan15milesoverthespeedlimit_No = By.xpath("//input[@id='rdo_133_2']");
	By PHLessthan15milesoverthespeedlimit_Yes = By.xpath("//input[@id='rdo_133_1']");
	By PHLessthan15milesoverthespeedlimit_Yes_Howmany = By.xpath("//*[@id='lb_134']");
	By PHLessthan15milesoverthespeedlimit_Yes_When1 = By.xpath("//*[@id='flda_135']");
	By PHLessthan15milesoverthespeedlimit_Yes_When2 = By.xpath("//*[@id='flda_136']");
	By PHLessthan15milesoverthespeedlimit_Yes_When3 = By.xpath("//*[@id='flda_137']");
	By PHGreaterthanorequalto15milesoverthespeedlimit_No = By.xpath("//input[@id='rdo_138_2']");
	By PHGreaterthanorequalto15milesoverthespeedlimit_Yes = By.xpath("//input[@id='rdo_138_1']");
	By PHGreaterthanorequalto15milesoverthespeedlimit_Yes_Howmany = By.xpath("//*[@id='lb_139']");
	By PHGreaterthanorequalto15milesoverthespeedlimit_Yes_When1 = By.xpath("//*[@id='flda_140']");
	By PHGreaterthanorequalto15milesoverthespeedlimit_Yes_When2 = By.xpath("//*[@id='flda_141']");
	By PHGreaterthanorequalto15milesoverthespeedlimit_Yes_When3 = By.xpath("//*[@id='flda_142']");
	By PHSuspendedlicense_No = By.xpath("//input[@id='rdo_143_2']");
	By PHSuspendedlicense_Yes = By.xpath("//input[@id='rdo_143_1']");
	By PHSuspenedlicenseduetononpaymentofchildsupport_Yes = By.xpath("//input[@id='rdo_147_1']");
	By PHSuspenedlicenseduetononpaymentofchildsupport_No = By.xpath("//input[@id='rdo_147_2']");
	By PHWhenwasthelicensesuspended = By.xpath("//*[@id='flda_145']");
	By PHReasonforsuspension = By.xpath("//*[@id='flda_146']");
	By PHHasitbeenreinstated_No = By.xpath("//input[@id='rdo_144_2']");
	By PHHasitbeenreinstated_Yes = By.xpath("//input[@id='rdo_144_1']");
	By PHWhenreinstated = By.xpath("//*[@id='flda_148']");
	By PHRecklessdriving_No = By.xpath("//input[@id='rdo_152_2']");
	By PHRecklessdriving_Yes = By.xpath("//input[@id='rdo_152_1']");
	By PHRecklessdriving_Yes_Howmany = By.xpath("//*[@id='lb_153']");
	By PHRecklessdriving_Yes_When1 = By.xpath("//*[@id='flda_154']");
	By PHRecklessdriving_Yes_When2 = By.xpath("//*[@id='flda_155']");
	By PHRecklessdriving_Yes_When3 = By.xpath("//*[@id='flda_156']");
	By PHCarelessdriving_No = By.xpath("//input[@id='rdo_157_2']");
	By PHCarelessdriving_Yes = By.xpath("//input[@id='rdo_157_1']");
	By PHCarelessdriving_Yes_Howmany = By.xpath("//*[@id='lb_158']");
	By PHCarelessdriving_Yes_When1 = By.xpath("//*[@id='flda_159']");
	By PHCarelessdriving_Yes_When2 = By.xpath("//*[@id='flda_160']");
	By PHCarelessdriving_Yes_When3 = By.xpath("//*[@id='flda_161']");
	By PHMovingviolation_No = By.xpath("//input[@id='rdo_162_2']");
	By PHMovingviolation_Yes = By.xpath("//input[@id='rdo_162_1']");
	By PHMovingviolation_Yes_Howmany = By.xpath("//*[@id='lb_163']");
	By PHMovingviolation_Yes_When1 = By.xpath("//*[@id='flda_164']");
	By PHMovingviolation_Yes_When2 = By.xpath("//*[@id='flda_165']");
	By PHMovingviolation_Yes_When3 = By.xpath("//*[@id='flda_166']");

	By PHBack = By.xpath("//*[@id='btn_28']");
	By PHNext = By.xpath("//*[@id='btn_27']");

	public void enterPersonalHistory(String InsuredDisability, String InsuredDisabilityDetails, String Tobaccoin12M,
			String Tobaccoin12MDetails, String Tobaccoin24M, String Tobaccoin24MDetails, String Cigarin24M,
			String Cigarin24count, String PrescriptionMedicationin12M, String PrescriptionMedicationin12MDetails,
			String ConvictedProbation, String ConvictedProbationDetails, String ConvictedwithAlcoholin2Y,
			String ConvictedwithAlcoholin2YDetails, String Accidentin3Y) {
		selectRadioYesorNo(PHInsuredCurrentlyDisabledquestn_Yes, PHInsuredCurrentlyDisabledquestn_No,InsuredDisability);
		if (InsuredDisability.equalsIgnoreCase("Yes")) {
			$(PHInsuredCurrentlyDisabledquestn_Yes_Details).setValue(InsuredDisabilityDetails);
		}
		selectRadioYesorNo(PHUsedTobaccoin12mnths_Yes, PHUsedTobaccoin12mnths_No, Tobaccoin12M);
		if (Tobaccoin12M.equalsIgnoreCase("Yes")) {
			$(PHUsedTobaccoin12mnths_Yes_Details).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.setValue(Tobaccoin12MDetails);
		}
		selectRadioYesorNo(PHUsedTobaccoin24mnths_Yes, PHUsedTobaccoin24mnths_No, Tobaccoin24M);
		if (Tobaccoin24M.equalsIgnoreCase("Yes")) {
			$(PHUsedTobaccoin24mnths_Yes_Details).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.setValue(Tobaccoin24MDetails);
		}
		selectRadioYesorNo(PHUsedCigarsWithin24mnths_Yes, PHUsedCigarsWithin24mnths_No, Cigarin24M);
		if (Cigarin24M.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(PHNumberofCigarsperyear_1to24, PHNumberofCigarsperyear_25ormore, Cigarin24count);
		}
		selectRadioYesorNo(PHUsedPrescMedtoAssistSmokingCessation_Yes, PHUsedPrescMedtoAssistSmokingCessation_No,
				PrescriptionMedicationin12M);
		if (PrescriptionMedicationin12M.equalsIgnoreCase("Yes")) {
			$(PHUsedPrescMedtoAssistSmokingCessation_Yes_Detils).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.setValue(PrescriptionMedicationin12MDetails);
		}
		selectRadioYesorNo(PHEverConvictedofFelonyORCurrentlyonPayrolProbtnQuest_Yes,
				PHEverConvictedofFelonyORCurrentlyonPayrolProbtnQuest_No, ConvictedProbation);
		if (ConvictedProbation.equalsIgnoreCase("Yes")) {
			$(PHEverConvictedofFelonyORCurrentlyonPayrolProbtnQuest_Yes_Details)
					.shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ConvictedProbationDetails);
		}
		selectRadioYesorNo(PHBeenConvictedofOperatingMotorVehicleunderAlcoholinflnc_Yes,
				PHBeenConvictedofOperatingMotorVehicleunderAlcoholinflnc_No, ConvictedwithAlcoholin2Y);
		if (ConvictedwithAlcoholin2Y.equalsIgnoreCase("Yes")) {
			$(PHBeenConvictedofOperatingMotorVehicleunderAlcoholinflnc_Yes_Details)
					.shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ConvictedwithAlcoholin2YDetails);
		}
		selectRadioYesorNo(PHBeeninMotorVehicleAccdntWhichFoundatFault_Yes,
				PHBeeninMotorVehicleAccdntWhichFoundatFault_No, Accidentin3Y);
		
	}
	public void PersonalHistoryAccident(String Accidentin3Y, String Faultmotorvehicleaccident,
			String FaultmotorvehicleaccidentHowMany, String FaultmotorvehicleaccidentWhen1,
			String FaultmotorvehicleaccidentWhen2, String FaultmotorvehicleaccidentWhen3, String Speedingticket,
			String Lessthan15milesspeedlimit, String Lessthan15milesspeedlimitHowmany,
			String Lessthan15milesspeedlimitWhen1, String Lessthan15milesspeedlimitWhen2,
			String Lessthan15milesspeedlimitWhen3, String Greaterthanorequal15milesspeedlimit,
			String Greaterthanorequal15milesspeedlimitHowmany, String Greaterthanorequal15milesspeedlimitWhen1,
			String Greaterthanorequal15milesspeedlimitWhen2, String Greaterthanorequal15milesspeedlimitWhen3,
			String Suspendedlicense, String Suspenedlicenseduetononpayment, String Whenwasthelicensesuspended,
			String Reasonforsuspension, String Hasitbeenreinstated, String Whenreinstated, String Recklessdriving,
			String Recklessdrivinghowmany, String RecklessdrivingWhen1, String RecklessdrivingWhen2,
			String RecklessdrivingWhen3, String CarelessDriving, String CarelessDrivinghowmany,
			String CarelessDrivingWhen1, String CarelessDrivingWhen2, String CarelessDrivingWhen3,
			String Movingviolation, String MovingviolationHowmany, String MovingviolationWhen1,
			String MovingviolationWhen2, String MovingviolationWhen3){
		if (Accidentin3Y.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(PHAtfaultmotorvehicleaccident_Yes, PHAtfaultmotorvehicleaccident_No,
					Faultmotorvehicleaccident);
			if (Faultmotorvehicleaccident.equalsIgnoreCase("Yes")) {
				$(PHAtfaultmotorvehicleaccident_Yes_Howmany).selectOptionByValue(FaultmotorvehicleaccidentHowMany);
				$(PHAtfaultmotorvehicleaccident_Yes_When1).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(FaultmotorvehicleaccidentWhen1);
				$(PHAtfaultmotorvehicleaccident_Yes_When2).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(FaultmotorvehicleaccidentWhen2);
				$(PHAtfaultmotorvehicleaccident_Yes_When3).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(FaultmotorvehicleaccidentWhen3);
			}
			selectRadioYesorNo(PHSpeedingticket_Yes, PHSpeedingticket_No, Speedingticket);
			if (Speedingticket.equalsIgnoreCase("Yes")) {
				selectRadioYesorNo(PHLessthan15milesoverthespeedlimit_Yes, PHLessthan15milesoverthespeedlimit_No,
						Lessthan15milesspeedlimit);
				if (Lessthan15milesspeedlimit.equalsIgnoreCase("Yes")) {
					$(PHLessthan15milesoverthespeedlimit_Yes_Howmany).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionByValue(Lessthan15milesspeedlimitHowmany);
					$(PHLessthan15milesoverthespeedlimit_Yes_When1).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(Lessthan15milesspeedlimitWhen1);
					$(PHLessthan15milesoverthespeedlimit_Yes_When2).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(Lessthan15milesspeedlimitWhen2);
					$(PHLessthan15milesoverthespeedlimit_Yes_When3).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(Lessthan15milesspeedlimitWhen3);
				}
				selectRadioYesorNo(PHGreaterthanorequalto15milesoverthespeedlimit_Yes,
						PHGreaterthanorequalto15milesoverthespeedlimit_No, Greaterthanorequal15milesspeedlimit);
				if (Greaterthanorequal15milesspeedlimit.equalsIgnoreCase("Yes")) {
					$(PHGreaterthanorequalto15milesoverthespeedlimit_Yes_Howmany)
							.shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionByValue(Lessthan15milesspeedlimitHowmany);
					$(PHGreaterthanorequalto15milesoverthespeedlimit_Yes_When1)
							.shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(Greaterthanorequal15milesspeedlimitWhen1);
					$(PHGreaterthanorequalto15milesoverthespeedlimit_Yes_When2)
							.shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(Greaterthanorequal15milesspeedlimitWhen2);
					$(PHGreaterthanorequalto15milesoverthespeedlimit_Yes_When3)
							.shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(Greaterthanorequal15milesspeedlimitWhen3);

				}
			}
			selectRadioYesorNo(PHSuspendedlicense_Yes, PHSuspendedlicense_No, Suspendedlicense);
			if (Suspendedlicense.equalsIgnoreCase("Yes")) {
				selectRadioYesorNo(PHSuspenedlicenseduetononpaymentofchildsupport_Yes,
						PHSuspenedlicenseduetononpaymentofchildsupport_No, Suspenedlicenseduetononpayment);
				$(PHWhenwasthelicensesuspended).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(Whenwasthelicensesuspended);
				if (Suspenedlicenseduetononpayment.equalsIgnoreCase("Yes")) {
					$(PHReasonforsuspension).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(Reasonforsuspension);
					selectRadioYesorNo(PHHasitbeenreinstated_Yes, PHHasitbeenreinstated_No, Hasitbeenreinstated);
					if (Hasitbeenreinstated.equalsIgnoreCase("Yes")) {
						$(PHWhenreinstated).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Whenreinstated);
					}
				}
			}

			selectRadioYesorNo(PHRecklessdriving_Yes, PHRecklessdriving_No, Recklessdriving);
			if (Recklessdriving.equalsIgnoreCase("Yes")) {
				$(PHRecklessdriving_Yes_Howmany).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionByValue(Recklessdrivinghowmany);
				$(PHRecklessdriving_Yes_When1).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(RecklessdrivingWhen1);
				$(PHRecklessdriving_Yes_When2).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(RecklessdrivingWhen2);
				$(PHRecklessdriving_Yes_When3).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(RecklessdrivingWhen3);
			}
			selectRadioYesorNo(PHCarelessdriving_Yes, PHCarelessdriving_No, CarelessDriving);
			if (CarelessDriving.equalsIgnoreCase("Yes")) {
				$(PHCarelessdriving_Yes_Howmany).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionByValue(CarelessDrivinghowmany);
				$(PHCarelessdriving_Yes_When1).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(CarelessDrivingWhen1);
				$(PHCarelessdriving_Yes_When2).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(CarelessDrivingWhen2);
				$(PHCarelessdriving_Yes_When3).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(CarelessDrivingWhen3);
			}
			selectRadioYesorNo(PHMovingviolation_Yes, PHMovingviolation_No, Movingviolation);
			if (Movingviolation.equalsIgnoreCase("Yes")) {
				$(PHMovingviolation_Yes_Howmany).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionByValue(CarelessDrivinghowmany);
				$(PHMovingviolation_Yes_When1).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(MovingviolationWhen1);
				$(PHMovingviolation_Yes_When2).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(MovingviolationWhen2);
				$(PHMovingviolation_Yes_When3).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(MovingviolationWhen3);
			}
		}

		$(PHNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
	

}