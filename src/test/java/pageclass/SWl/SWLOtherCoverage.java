package pageclass.SWl;

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

public class SWLOtherCoverage extends GlobalCap {

	By LOC_TotalamountofnonGrouplifeinsurancecurrentlyapplied1 = By.xpath("//input[@id='flda_77']");
	By LOC_TotalamountofnonGroupnewinsurance = By.xpath("//*[@id='flda_78']");
	By LOC_TotalamountofnonGrouplifeinsurancecurrentlyinforce = By.xpath("//*[@id='flda_74']");
	By LOC_DoestheProposedInsuredhavenonGrouplifeinsuranceorannuitycontractsQstn_No = By.xpath("//*[@id='rdo_70_2']");
	By LOC_DoestheProposedInsuredhavenonGrouplifeinsuranceorannuitycontractsQstn_Yes = By.xpath("//*[@id='rdo_70_1']");
	By LOC_IsthisApplicationintendedtoreplacechangeanyGroupornonGrouplifeinsuranceQstn_No = By
			.xpath("//*[@id='rdo_73_2']");
	By LOC_IsthisApplicationintendedtoreplacechangeanyGroupornonGrouplifeinsuranceQstn_Yes = By
			.xpath("//*[@id='rdo_73_1']");
	By LOC_OtherCoverageOrReplacementGrid = By.xpath("//*[@id='grdx17_addRowButton']");
	By LOC_Company = By.xpath("//*[@id='lb_197']");
	By LOC_TheExistingPolicyIsBeing = By.xpath("//*[@id='lb_61']");
	By LOC_PolicyNumber = By.xpath("//*[@id='flda_28']");
	By LOC_FaceAmount = By.xpath("//*[@id='flda_20']");
	By LOC_IssueYear = By.xpath("//*[@id='flda_123']");
	By LOC_ProductOrPlan_DD = By.xpath("//*[@id='lb_121']");
	By LOC_Purpose_Business = By.xpath("//*[@id='rdo_117_1']");
	By LOC_Purpose_Personal = By.xpath("//*[@id='rdo_117_2']");
	By LOC_Status_Appliedfor = By.xpath("//*[@id='rdo_115_1']");
	By LOC_Status_Inforce = By.xpath("//*[@id='rdo_115_2']");
	By LOC_PolicyType_Life_FL = By.xpath("//*[@id='rdo_143_1']");
	By LOC_PolicyType_Annuity_FL = By.xpath("//*[@id='rdo_143_2']");
	By LOC_OwnersameastheProposedOwnerforthenewpolicy_Yes_FL = By.xpath("//*[@id='rdo_157_1']");
	By LOC_OwnersameastheProposedOwnerforthenewpolicy_No_FL = By.xpath("//*[@id='rdo_157_2']");
	By LOC_CurrentDeathBenefit_FL = By.xpath("//*[@id='flda_139']");
	By LOC_PremiumAmount_FL = By.xpath("//*[@id='flda_137']");
	By LOC_ModeofPayment_FL = By.xpath("//*[@id='flda_135']");
	By LOC_CashSurrenderValue_FL = By.xpath("//*[@id='flda_133']");
	By LOC_PaidupAdditionValue_FL = By.xpath("//*[@id='flda_131']");
	By LOC_DividendValue_FL = By.xpath("//*[@id='flda_139']");
	By LOC_1035Exchange_Yes = By.xpath("//*[@id='rdo_35_1']");
	By LOC_1035Exchange_No = By.xpath("//*[@id='rdo_35_2']");
	By LOC_ThePrimaryInsuredonthenewpolicyisaninsuredontheexistingpolicy_Yes = By.xpath("//*[@id='rdo_124_1']");
	By LOC_ThePrimaryInsuredonthenewpolicyisaninsuredontheexistingpolicy_No = By.xpath("//*[@id='rdo_124_2']");
	By LOC_ApproximateCashSurrenderValue = By.xpath("//*[@id='flda_70']");
	By LOC_Delete = By.xpath("//*[@id='btn_30']");
	By LOC_Cancel = By.xpath("//*[@id='btn_29']");
	By LOC_Save = By.xpath("//*[@id='btn_31']");
	By LOC_Edit = By.xpath("//*[@class='btn btn-primary btn-sm']");
	By LOC_ProvideawrittenComparativeInformationFormwhichsummarizesyourpolicyvalues_Yes = By
			.xpath("//*[@id='rdo_60_1']");
	By LOC_ProvideawrittenComparativeInformationFormwhichsummarizesyourpolicyvalues_No = By
			.xpath("//*[@id='rdo_60_2']");

	
	By insurancethatwillbeplacedinallcompanies = By.xpath("//*[@id='flda_47']");
	By TotalamountofnonGrouplifeinsurance = By.xpath("//input[@id='flda_74']");

	By withinthenext12monthswithMassMutualorothercompanies = By.xpath("//*[@id='flda_12']");
	By transferredorassigned = By.xpath("//*[@id='flda_9']");
	By replacedchanged_Yes = By.xpath("//*[@id='rdo_4_1']");
	By replacedchanged_No = By.xpath("//*[@id='rdo_4_2']");
	By annuitycontractinforcewithMassMutualorothercompanies_Yes = By.xpath("//*[@id='rdo_7_1']");
	By annuitycontractinforcewithMassMutualorothercompanies_No = By.xpath("//*[@id='rdo_7_2']");

	
	By excludingMM_replacedchanged_Yes = By.xpath("//*[@id='rdo_70_1']");
	By excludingMM_replacedchanged_No = By.xpath("//*[@id='rdo_70_2']");
	By NonGrpannuitycontractinforcewithMassMutualorothercompanies_Yes = By.xpath("//*[@id='rdo_73_1']");
	By NonGrpannuitycontractinforcewithMassMutualorothercompanies_No = By.xpath("//*[@id='rdo_73_2']");
	
	//NewYork
	By NYcurrentlyAppliedWithMassMutual = By.xpath("//label[contains(text(),'currently applied for with MassMutual')]//following-sibling::input[@alt_id='OTHINS_TotalPendingAmount']");
	By NYinsurancethatwillbeplacedwithMM = By.xpath("//label[contains(text(),'non-Group new insurance')]//following-sibling::input[@alt_id='OTHINS_TotalPlacedAmount']");
	By NYlifeInsCurrentlyinforcewithMM = By.xpath("//label[contains(text(),'life insurance currently in force with MassMutual')]//following-sibling::input[@alt_id='OTHINS_TotalInforceAmount']");
	By NYreplacedchanged_Yes = By.xpath("//label[contains(text(),'replaced/changed')]//following::input[@alt_id='OTHINS_HasExistingYesNo_1']");
	By NYreplacedchanged_No = By.xpath("//label[contains(text(),'replaced/changed')]//following::input[@alt_id='OTHINS_HasExistingYesNo_2']");
	By NYcontractinforcewithMassMutualorothercompanies_Yes = By.xpath("//label[contains(text(),'other companies')]//following::input[@alt_id='OTHINS_ReplaceYesNo_1']");
	By NYcontractinforcewithMassMutualorothercompanies_No = By.xpath("//label[contains(text(),'other companies')]//following::input[@alt_id='OTHINS_ReplaceYesNo_2']");
	
	
	By LOC_Back = By.xpath("//*[@id='btn_29']");
	By Next = By.xpath("//button[contains(text(),'Next')]");

	public void othercoverage(String state,String LOC_field1, String LOC_field2, String LOC_field3, String LOC_field4,String LOC_field5,
			String NYAppliedWithMassMutual,String NYinsthatwillbeplacedwithMM,String NYinforcewithMM ,String NYreplacedchanged,String NYcontractinforcewithMassMutual) {

		/*String[] states_Type = new String[] { "Arizona","Alabama" };
		for (int i = 0; i <= states_Type.length - 1; i++) {
			if (state.equalsIgnoreCase(states_Type[i])) {
				$(withinthenext12monthswithMassMutualorothercompanies).shouldBe(Visible.exist, Duration.ofSeconds(60))
						.setValue(LOC_field1);
				$(insurancethatwillbeplacedinallcompanies).shouldBe(Visible.exist, Duration.ofSeconds(60))
						.setValue(LOC_field2);
				$(transferredorassigned).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(LOC_field3);
				selectRadioYesorNo(replacedchanged_Yes, replacedchanged_No, LOC_field4);
				selectRadioYesorNo(annuitycontractinforcewithMassMutualorothercompanies_Yes,
						NYcontractinforcewithMassMutualorothercompanies_No, LOC_field5);
				$(LOC_Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			}
		}*/
		
		if (state.equalsIgnoreCase("New York")) {
			$(NYcurrentlyAppliedWithMassMutual).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.setValue(NYAppliedWithMassMutual);
			$(NYinsurancethatwillbeplacedwithMM).shouldBe(Visible.exist, Duration.ofSeconds(60))
			.setValue(NYinsthatwillbeplacedwithMM);
			$(NYlifeInsCurrentlyinforcewithMM).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.setValue(NYinforcewithMM);
			selectRadioYesorNo(NYreplacedchanged_Yes, NYreplacedchanged_No, NYreplacedchanged);
			selectRadioYesorNo(NYcontractinforcewithMassMutualorothercompanies_Yes,
					NYcontractinforcewithMassMutualorothercompanies_No,NYcontractinforcewithMassMutual);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		else {
			
			if($(LOC_TotalamountofnonGrouplifeinsurancecurrentlyapplied1).isDisplayed()){
				$(LOC_TotalamountofnonGrouplifeinsurancecurrentlyapplied1).shouldBe(Visible.exist, Duration.ofSeconds(60))
				.setValue(LOC_field1);
			} 
			
			if($(withinthenext12monthswithMassMutualorothercompanies).isDisplayed()){
				$(withinthenext12monthswithMassMutualorothercompanies).shouldBe(Visible.exist, Duration.ofSeconds(60))
				.setValue(LOC_field1);
			}
			if($(LOC_TotalamountofnonGroupnewinsurance).isDisplayed()){
				$(LOC_TotalamountofnonGroupnewinsurance).shouldBe(Visible.exist, Duration.ofSeconds(60))
				.setValue(LOC_field2);
			} 
		
			
			if($(insurancethatwillbeplacedinallcompanies).isDisplayed()){
			$(insurancethatwillbeplacedinallcompanies).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.setValue(LOC_field2);
			}
			if($(TotalamountofnonGrouplifeinsurance).isDisplayed()){
				$(TotalamountofnonGrouplifeinsurance).shouldBe(Visible.exist, Duration.ofSeconds(60))
						.setValue(LOC_field3);
				}
			if($(transferredorassigned).isDisplayed()){
				$(transferredorassigned).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(LOC_field3);
			}
			if($(replacedchanged_Yes).isDisplayed()){
				selectRadioYesorNo(replacedchanged_Yes, replacedchanged_No, LOC_field4);
			}
			if($(annuitycontractinforcewithMassMutualorothercompanies_Yes).isDisplayed()){
				selectRadioYesorNo(annuitycontractinforcewithMassMutualorothercompanies_Yes,
						NYcontractinforcewithMassMutualorothercompanies_No, LOC_field5);
			}
			
			if($(excludingMM_replacedchanged_Yes).isDisplayed()){
				selectRadioYesorNo(excludingMM_replacedchanged_Yes, excludingMM_replacedchanged_No, LOC_field4);
			}
			if($(NonGrpannuitycontractinforcewithMassMutualorothercompanies_Yes).isDisplayed()){
				selectRadioYesorNo(NonGrpannuitycontractinforcewithMassMutualorothercompanies_Yes,
						NonGrpannuitycontractinforcewithMassMutualorothercompanies_No, LOC_field5);

			}
						$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		
	}

}
