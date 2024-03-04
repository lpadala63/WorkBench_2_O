package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class MMSD_DI_PersonalHistoryInformation extends GlobalCap {

	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By MedicalProfYes = By.xpath("//input[@id='rdo_32_1']");
	By MedicalProfNo = By.xpath("//input[@id='rdo_32_2']");
	By MedicalDetail= By.xpath("//textarea[@id='flda_40' or @name='flda_40']");
	By Tob12MonthYes = By.xpath("//input[@id='rdo_4_1']");
	By Tob12MonthNo = By.xpath("//input[@id='rdo_4_2']");
	By Tob12Detail=By.xpath("//textarea[@id='flda_6' or @name='flda_6']");
	By Tob24MonthYes = By.xpath("//input[@id='rdo_9_1']");
	By Tob24MonthNo = By.xpath("//input[@id='rdo_9_2']");
	By Tob24Detail=By.xpath("//textarea[@id='flda_10' or @name='flda_10']");
	By Cigar24MonthYes = By.xpath("//input[@id='rdo_43_1']");
	By Cigar24MonthNo = By.xpath("//input[@id='rdo_43_2']");
	By Cigar24TF=By.xpath("//input[@id='rdo_42_1' or @name='rdo_42_1']");
	By Cigar2425=By.xpath("//input[@id='rdo_42_2' or @name='rdo_42_2']");
	By PrecMedicationYes = By.xpath("//input[@id='rdo_13_1']");
	By PrecMedicationNo = By.xpath("//input[@id='rdo_13_2']");
	By PrecMedicationDetail=By.xpath("//textarea[@id='flda_14' or @name='flda_14']");
	By FelonyYes = By.xpath("//input[@id='rdo_17_1']");
	By FelonyNo = By.xpath("//input[@id='rdo_17_2']");
	By FelonyDetail=By.xpath("//textarea[@id='flda_18' or @name='flda_18']");
	By Alcohol5Yes = By.xpath("//input[@id='rdo_21_1']");
	By Alcohol5No = By.xpath("//input[@id='rdo_21_2']");
	By AlcoholDetail=By.xpath("//textarea[@id='flda_22' or @name='flda_22']");
	By AccidentYes = By.xpath("//input[@id='rdo_25_1']");
	By AccidentNo = By.xpath("//input[@id='rdo_25_2']");
	By Next = By.xpath("//button[@id='btn_27']");

	public void ProposedInsuredPersonalHistory(String Medical, String Tob12, String Tob24, String Cigar,
			String Medication, String FeloParole, String AlcDrugs, String MotorAcc) {

		GlobalCap.selectRadioYesorNo(MedicalProfYes, MedicalProfNo, Medical);
		GlobalCap.selectRadioYesorNo(Tob12MonthYes, Tob12MonthNo, Tob12);
		GlobalCap.selectRadioYesorNo(Tob24MonthYes, Tob24MonthNo, Tob24);
		GlobalCap.selectRadioYesorNo(Cigar24MonthYes, Cigar24MonthNo, Cigar);
		GlobalCap.selectRadioYesorNo(PrecMedicationYes, PrecMedicationNo, Medication);
		GlobalCap.selectRadioYesorNo(FelonyYes, FelonyNo, FeloParole);
		GlobalCap.selectRadioYesorNo(Alcohol5Yes, Alcohol5No, AlcDrugs);
		GlobalCap.selectRadioYesorNo(AccidentYes, AccidentNo, MotorAcc);
		
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
	}

}
