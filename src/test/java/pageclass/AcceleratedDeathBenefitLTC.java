package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class AcceleratedDeathBenefitLTC extends GlobalCap {
	By DressingEatingTransferring_Yes = By.xpath("//input[@alt_id='LTCR_PRELIM_NeedsAssistanceYesNo_1']");
	By DressingEatingTransferring_No = By.xpath("//input[@alt_id='LTCR_PRELIM_NeedsAssistanceYesNo_2']");
	By AIDS_HIV_Yes = By.xpath("//input[@alt_id='LTCR_PRELIM_AIDSYesNo_1']");
	By AIDS_HIV_No = By.xpath("//input[@alt_id='LTCR_PRELIM_AIDSYesNo_2']");
	By AlzheimerDisease_YEs = By.xpath("//input[@alt_id='LTCR_PRELIM_AlzheimerYesNo_1']");
	By AlzheimerDisease_No = By.xpath("//input[@alt_id='LTCR_PRELIM_AlzheimerYesNo_2']");
	By GehrigsDisease_Yes = By.xpath("//input[@alt_id='LTCR_PRELIM_ALSYesNo_1']");
	By GehrigsDisease_No = By.xpath("//input[@alt_id='LTCR_PRELIM_ALSYesNo_2']");

	By CerebralPalsy_Yes = By.xpath("//input[@alt_id='LTCR_PRELIM_PalsyYesNo_1']");
	By CerebralPalsy_No = By.xpath("//input[@alt_id='LTCR_PRELIM_PalsyYesNo_2']");
	By FibrosisYes = By.xpath("//input[@alt_id='LTCR_PRELIM_FibrosisYesNo_1']");
	By FibrosisNo = By.xpath("//input[@alt_id='LTCR_PRELIM_FibrosisYesNo_2']");
	By DementiaYes = By.xpath("//input[@alt_id='LTCR_PRELIM_DementiaYesNo_1']");
	By DementiaNo = By.xpath("//input[@alt_id='LTCR_PRELIM_DementiaYesNo_2']");
	By ChoreaYes = By.xpath("//input[@alt_id='LTCR_PRELIM_ChoreaYesNo_1']");
	By ChoreaNo = By.xpath("//input[@alt_id='LTCR_PRELIM_ChoreaYesNo_2']");
	By DiabetesYes = By.xpath("//input[@alt_id='LTCR_PRELIM_DiabetesYesNo_1']");
	By DiabetesNo = By.xpath("//input[@alt_id='LTCR_PRELIM_DiabetesYesNo_2']");
	By DialysisYes = By.xpath("//input[@alt_id='LTCR_PRELIM_DialysisYesNo_1']");
	By DialysisNo = By.xpath("//input[@alt_id='LTCR_PRELIM_DialysisYesNo_2']");
	By CirrhosisYes = By.xpath("//input[@alt_id='LTCR_PRELIM_CirrhosisYesNo_1']");
	By CirrhosisNo = By.xpath("//input[@alt_id='LTCR_PRELIM_CirrhosisYesNo_2']");
	By SclerosisYes = By.xpath("//input[@alt_id='LTCR_PRELIM_SclerosisYesNo_1']");
	By SclerosisNo = By.xpath("//input[@alt_id='LTCR_PRELIM_SclerosisYesNo_2']");
	By DystrophyYes = By.xpath("//input[@alt_id='LTCR_PRELIM_DystrophyYesNo_1']");
	By DystrophyNo = By.xpath("//input[@alt_id='LTCR_PRELIM_DystrophyYesNo_2']");
	By MyastheniaYes = By.xpath("//input[@alt_id='LTCR_PRELIM_MyastheniaYesNo_1']");
	By MyastheniaNo = By.xpath("//input[@alt_id='LTCR_PRELIM_MyastheniaYesNo_2']");
	By OrganicBrainYes = By.xpath("//input[@alt_id='LTCR_PRELIM_OrganicBrainYesNo_1']");
	By OrganicBrainNo = By.xpath("//input[@alt_id='LTCR_PRELIM_OrganicBrainYesNo_2']");

	By ParalysisYes = By.xpath("//input[@alt_id='LTCR_PRELIM_ParalysisYesNo_1']");
	By ParalysisNo = By.xpath("//input[@alt_id='LTCR_PRELIM_ParalysisYesNo_2']");
	By ParkinsonYes = By.xpath("//input[@alt_id='LTCR_PRELIM_ParkinsonYesNo_1']");
	By ParkinsonNo = By.xpath("//input[@alt_id='LTCR_PRELIM_ParkinsonYesNo_2']");
	By StrokeYes = By.xpath("//input[@alt_id='LTCR_PRELIM_StrokeYesNo_1']");
	By StrokeNo = By.xpath("//input[@alt_id='LTCR_PRELIM_StrokeYesNo_2']");
	By PRELIM_TIAYes = By.xpath("//input[@alt_id='LTCR_PRELIM_TIAYesNo_1']");
	By PRELIM_TIANo = By.xpath("//input[@alt_id='LTCR_PRELIM_TIAYesNo_2']");
	By SchizophreniaYes = By.xpath("//input[@alt_id='LTCR_PRELIM_SchizophreniaYesNo_1']");
	By SchizophreniaNo = By.xpath("//input[@alt_id='LTCR_PRELIM_SchizophreniaYesNo_2']");
	By LupusYes = By.xpath("//input[@alt_id='LTCR_PRELIM_LupusYesNo_1']");
	By LupusNo = By.xpath("//input[@alt_id='LTCR_PRELIM_LupusYesNo_2']");
	By WheelchairYes = By.xpath("//input[@alt_id='LTCR_PRELIM_WheelchairYesNo_1']");
	By WheelchairNo = By.xpath("//input[@alt_id='LTCR_PRELIM_WheelchairYesNo_2']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By heading = By.xpath("//h1[contains(text(),'(LTCR)')]");

	public void Rider(String DressingEatingTransferring, String AIDS_HIV, String AlzheimerDisease,
			String GehrigsDisease, String CerebralPalsy, String Fibrosis, String Dementia, String Chorea,
			String Diabetes, String Dialysis, String Cirrhosis, String Sclerosis, String Dystrophy, String Myasthenia,
			String OrganicBrain, String Paralysis, String Parkinson, String Stroke, String PRELIM_TIA,
			String Schizophrenia, String Lupus, String Wheelchair) {
		if ($(heading).isDisplayed()) {
			selectRadioYesorNo(DressingEatingTransferring_Yes, DressingEatingTransferring_No,
					DressingEatingTransferring);
			selectRadioYesorNo(AIDS_HIV_Yes, AIDS_HIV_No, AIDS_HIV);
			selectRadioYesorNo(AlzheimerDisease_YEs, AlzheimerDisease_No, AlzheimerDisease);
			selectRadioYesorNo(GehrigsDisease_Yes, GehrigsDisease_No, GehrigsDisease);
			selectRadioYesorNo(CerebralPalsy_Yes, CerebralPalsy_No, CerebralPalsy);
			selectRadioYesorNo(FibrosisYes, FibrosisNo, Fibrosis);
			selectRadioYesorNo(DementiaYes, DementiaNo, Dementia);
			selectRadioYesorNo(ChoreaYes, ChoreaNo, Chorea);
			selectRadioYesorNo(DiabetesYes, DiabetesNo, Diabetes);
			selectRadioYesorNo(DialysisYes, DialysisNo, Dialysis);
			selectRadioYesorNo(CirrhosisYes, CirrhosisNo, Cirrhosis);
			selectRadioYesorNo(SclerosisYes, SclerosisNo, Sclerosis);
			selectRadioYesorNo(DystrophyYes, DystrophyNo, Dystrophy);
			selectRadioYesorNo(MyastheniaYes, MyastheniaNo, Myasthenia);
			selectRadioYesorNo(OrganicBrainYes, OrganicBrainNo, OrganicBrain);
			selectRadioYesorNo(ParalysisYes, ParalysisNo, Paralysis);
			selectRadioYesorNo(ParkinsonYes, ParkinsonNo, Parkinson);
			selectRadioYesorNo(StrokeYes, StrokeNo, Stroke);
			selectRadioYesorNo(PRELIM_TIAYes, PRELIM_TIANo, PRELIM_TIA);
			selectRadioYesorNo(SchizophreniaYes, SchizophreniaNo, Schizophrenia);
			selectRadioYesorNo(LupusYes, LupusNo, Lupus);
			selectRadioYesorNo(WheelchairYes, WheelchairNo, Wheelchair);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}
}
