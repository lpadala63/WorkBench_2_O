package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class NewYorkRegSixtyCCone extends GlobalCap{
	
	By lapsed_Yes=By.xpath("//label[contains(text(),'LAPSED, SURRENDERED')]//following::input[@alt_id='NYR60_TerminatedYesNo_1']");	
    By lapsed_No=By.xpath("//label[contains(text(),'LAPSED, SURRENDERED')]//following::input[@alt_id='NYR60_TerminatedYesNo_2']");	
    By ChangedOrModified_yes=By.xpath("//label[contains(text(),'CHANGED OR MODIFIED')]//following::input[@alt_id='NYR60_ChangedYesNo_1']");
    By ChangedOrModified_No=By.xpath("//label[contains(text(),'CHANGED OR MODIFIED')]//following::input[@alt_id='NYR60_ChangedYesNo_2']");
    By continueinfore_yes=By.xpath("//label[contains(text(),'CONTINUE IN FORCE')]//following::input[@alt_id='NYR60_ReducedYesNo_1']");
    By continueinfore_No=By.xpath("//label[contains(text(),'CONTINUE IN FORCE')]//following::input[@alt_id='NYR60_ReducedYesNo_2']");
    By ReissuedwithReduction_Yes=By.xpath("//label[contains(text(),'EXISTING POLICIES')]//following::input[@alt_id='NYR60_ReissuedYesNo_1']");
    By ReissuedwithReduction_No=By.xpath("//label[contains(text(),'EXISTING POLICIES')]//following::input[@alt_id='NYR60_ReissuedYesNo_2']");
    By AssignedasCollateral_Yes=By.xpath("//label[contains(text(),'ASSIGNED AS COLLATERAL')]//following::input[@alt_id='NYR60_CollateralYesNo_1']");
    By AssignedasCollateral_No=By.xpath("//label[contains(text(),'ASSIGNED AS COLLATERAL')]//following::input[@alt_id='NYR60_CollateralYesNo_2']");
    By Premiumpaid_Yes=By.xpath("//label[contains(text(),'PREMIUM PAID')]//following::input[@alt_id='NYR60_StoppageYesNo_1']");
    By Premiumpaid_No=By.xpath("//label[contains(text(),'PREMIUM PAID')]//following::input[@alt_id='NYR60_StoppageYesNo_2']");
    By Externalreplacement_Yes=By.xpath("//label[contains(text(),'EXTERNAL REPLACEMENT')]//following::input[@alt_id='NYR60_ExternalReplacementYesNo_1']");
    By Externalreplacement_No=By.xpath("//label[contains(text(),'EXTERNAL REPLACEMENT')]//following::input[@alt_id='NYR60_ExternalReplacementYesNo_2']");
    By NEXT = By.xpath("//button[contains(text(),'Next')]");
    
	public void NeyworkReg(String City, String Lapsed, String CashValues, String tobeInforce, String Reissued,
			String Collateral, String Premium, String externalReplacement) {
		if (City.equalsIgnoreCase("New York")) {
			GlobalCap.selectRadioYesorNo(lapsed_Yes, lapsed_No, Lapsed);
			GlobalCap.selectRadioYesorNo(ChangedOrModified_yes, ChangedOrModified_No, CashValues);
			GlobalCap.selectRadioYesorNo(continueinfore_yes, continueinfore_No, tobeInforce);
			GlobalCap.selectRadioYesorNo(ReissuedwithReduction_Yes, ReissuedwithReduction_No, Reissued);
			GlobalCap.selectRadioYesorNo(AssignedasCollateral_Yes, AssignedasCollateral_No, Collateral);
			GlobalCap.selectRadioYesorNo(Premiumpaid_Yes, Premiumpaid_No, Premium);
			if ($(Externalreplacement_Yes).isDisplayed()) {
				GlobalCap.selectRadioYesorNo(Externalreplacement_Yes, Externalreplacement_No, externalReplacement);
			}

			$(NEXT).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	
	}
    
    
    
    
    
}
