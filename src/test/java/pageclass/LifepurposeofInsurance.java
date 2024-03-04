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

public class LifepurposeofInsurance extends GlobalCap {

	By LPI_Personal = By.xpath("//*[@id='cb_<change>']|38|82|39|40|41|42|43|44|45|36|37");
	
	
	By Income_for_Dependents = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Income for Dependents']");
	By Future_Insurability = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Future Insurability']");
	By Charitable_Giving_Gift = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Charitable Giving (Gift)']");
	By Revocable_Trust = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Revocable Trust']");
	By Estate_Taxes = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Estate Taxes']");
	By Retirement_Planning = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Retirement Planning']");
	By Asset_Protection = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Asset Protection']");
	By Mortgage = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Mortgage']");
	By Education_Fund = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Irrevocable Trust']");	
	By Irrevocable_Trust = By
			.xpath("//div[@class='checkbox-caption-wrapping']//following::span[text()='Irrevocable Trust']");

	By Will_this_policy_be_collaterally_assigned_Yes=By.xpath("//*[@id='rdo_7_1']");
	By Will_this_policy_be_collaterally_assigned_No=By.xpath("//*[@id='rdo_7_2']");
	
	By LPI_Type=By.xpath("//select[@id='lb_114']");
	By LPI_Name_of_Assigne=By.xpath("//input[@id='flda_5']");
	By LPI_street1=By.xpath("//input[@id='flda_58']");
	By LPI_street2=By.xpath("//input[@id='flda_64']");
	By LPI_Cityname=By.xpath("//input[@id='flda_54']");
	By LPI_State=By.xpath("//select[@id='lb_53']");
	By LPI_Zipcode=By.xpath("//input[@id='flda_52']");
	By LPI_phoneno=By.xpath("//input[@id='flda_110']");
	By LPI_homeworkphone=By.xpath("//selectt[@id='lb_108']");
	
	
	
	By LPI_Click = By.xpath("//*[@id='cb_44']");
	By LPI_OthersPlsSpecify = By.xpath("//*[@id='flda_36']");
	By LPI_Business = By.xpath("//*[@id='cb_<change>']|19|20|21|22|23|24|24|25|26|27|28|29|30|31|17|18");
	By LPI_KeyEmployee = By.xpath("//*[@id='cb_31']");
	
	By LPI_Business_OtherSpecify = By.xpath("//*[@id='flda_51']");
	By LPI_Business_checkbox = By.xpath("//*[@id='cb_<change>']|104|103");
	By LPI_SplitDollar_RB = By.xpath("//*[@id='div_15']/div[2]");
	By LPI_CERP_RB = By.xpath("//*[@id='div_106']/div[2]");
	By LPI_CmpltNameofAssignee = By.xpath("//*[@id='flda_83']");
	By LPI_Address_Street1 = By.xpath("//*[@id='flda_91']");
	By LPI_Address_Street2 = By.xpath("//*[@id='flda_97']");
	By LPI_City = By.xpath("//*[@id='flda_87']");
	By LPI_State_DD = By.xpath("//*[@id='lb_86']");
	By LPI_ZIPcode = By.xpath("//*[@id='flda_85']");
	By LPI_IsPolicyPurchasedUnderEmplSponsorPlanQuestn_RB = By.xpath("//*[@id='div_13']/div[2]");
	
	By LPI_IsPolicyPurchasedUnderEmplSponsorPlanQuestn_RB_yes = By.xpath("//span[@id='lbl_13_1']");
	By LPI_IsPolicyPurchasedUnderEmplSponsorPlanQuestn_RB_No = By.xpath("//span[@id='lbl_13_2']");
	By LPI_IsPolicyPurchasedUnderEmplSponsorPlanQuestn_Details = By.xpath("//input[@id='flda_2']");
	
	By LPI_willPolicyIssuedonUnisexQuest_RB = By.xpath("//*[@id='div_9']/div[2]");
	By LPI_willPolicyCollaterallyAssignQuest_RB = By.xpath("//*[@id='div_7']/div[2]");
	By LPI_CompleteNameofAssignee = By.xpath("//*[@id='flda_5']");
	By LPI_Assignee_Country_DD = By.xpath("//*[@id='lb_67']");
	By LPI_Assignee_Street1 = By.xpath("//*[@id='flda_58']");
	By LPI_Assignee_Street2 = By.xpath("//*[@id='flda_64']");
	By LPI_Assignee_Street3 = By.xpath("//*[@id='flda_61']");
	By LPI_Assignee_City = By.xpath("//*[@id='flda_54']");
	By LPI_Assignee_State_DD = By.xpath("//*[@id='lb_53']");
	By LPI_Assignee_Zip = By.xpath("//*[@id='flda_52']");
	
	
	By LPI_HasPropsedInsuredOrOwnerOfferedEconomicIncntvFreeQuestn_RB = By.xpath("//*[@id='div_3']/div[2]");
	
	By LPI_HasPropsedInsuredOrOwnerOfferedEconomicIncntvFreeQuestn_RB_yes = By.xpath("//span[@id='lbl_3_1']");
	By LPI_HasPropsedInsuredOrOwnerOfferedEconomicIncntvFreeQuestn_RB_No = By.xpath("//input[@id='rdo_3_2']");
	
	By LPI_Details_InsuredorOwnerEcnmIncntv = By.xpath("//*[@id='flda_2']");
	
	By LPI_DoesPrpsdInsuredOrOwnerhaveAgremntorCmtmntToSellQuest_RB = By.xpath("//*[@id='div_72']/div[2]");
	By LPI_DoesPrpsdInsuredOrOwnerhaveAgremntorCmtmntToSellQuest_RB_yes =  By.xpath("//input[@id='rdo_72_1']");
	By LPI_DoesPrpsdInsuredOrOwnerhaveAgremntorCmtmntToSellQuest_RB_No =  By.xpath("//input[@id='rdo_72_2']");
	
	By LPI_Details_InsuredorOwnerAgmntorCmtmntToSell = By.xpath("//*[@id='flda_71']");
	
	By LPI_IsPolicydirectlyOrIndirectlyOwnedByCaptInsurnceCmpnyQuest_RB = By.xpath("//*[@id='div_76']/div[2]");
	By LPI_IsPolicydirectlyOrIndirectlyOwnedByCaptInsurnceCmpnyQuest_RB_yes =By.xpath("//input[@id='rdo_76_1']");
	By LPI_IsPolicydirectlyOrIndirectlyOwnedByCaptInsurnceCmpnyQuest_RB_No = By.xpath("//input[@id='rdo_76_2']");	
	
	By LPI_Details_IsPolDirOrIndirOwnedbyCaptvInsCmpny = By.xpath("//*[@id='flda_75']");
	
	By LPI_WillSourceofPremPaymntAssetsorFromCntrbtnToCaptvInsCmpnyQuest_RB = By.xpath("//*[@id='div_80']/div[2]");
	By LPI_WillSourceofPremPaymntAssetsorFromCntrbtnToCaptvInsCmpnyQuest_RB_Yes = By.xpath("//input[@id='rdo_80_1']");
	By LPI_WillSourceofPremPaymntAssetsorFromCntrbtnToCaptvInsCmpnyQuest_RB_No = By.xpath("//input[@id='rdo_80_2']");
	By LPI_Details_WillSrcofPremAssetsFromCntrbtn = By.xpath("//*[@id='flda_79']");
	
	By LPI_BACK = By.xpath("//*[@id='btn_49']");
	By LPI_NEXT = By.xpath("//*[@id='btn_48']");

	public void personal_and_Bussiness(String personalValue) {
		switch (personalValue) {
		case "Income for Dependents":

			$(Income_for_Dependents).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Future Insurability":

			$(Future_Insurability).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Charitable Giving (Gift)":

			$(Charitable_Giving_Gift).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Revocable Trust":

			$(Revocable_Trust).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Estate Taxes":

			$(Estate_Taxes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Retirement Planning":

			$(Retirement_Planning).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Asset Protection":

			$(Asset_Protection).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Mortgage":

			$(Mortgage).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Education Fund":

			$(Irrevocable_Trust).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "Irrevocable Trust":

			$(Irrevocable_Trust).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;

		default:
			System.out.println("Not able to select the option");
			break;

		}
	}

	public void Will_this_policy_be_collaterally_assigned(String RD_value,String LPI_Type , String Name_of_Assigne,String Street1, 
			String Street2,String City,String State,String pincode,String phoneno,String Home_work_Mobile ,String Extension){
		if (RD_value.equalsIgnoreCase("Yes")) {	
			$(Will_this_policy_be_collaterally_assigned_Yes).click();
			GlobalCap.sleep(1000);
			$(LPI_Type).selectOptionContainingText(LPI_Type);
			$(LPI_Name_of_Assigne).setValue(Name_of_Assigne);
			$(LPI_street1).setValue(Street1);
			$(LPI_street2).setValue(Street2);
			$(LPI_Cityname).setValue(City);
			$(LPI_State).selectOptionByValue(State);
			$(LPI_Zipcode).setValue(pincode);
			$(LPI_phoneno).setValue(phoneno);
			if (Home_work_Mobile.equalsIgnoreCase("Work")) {
				$(LPI_homeworkphone).selectOptionContainingText(Home_work_Mobile);
				$(LPI_Zipcode).setValue(Extension);
			}
			else{
				$(LPI_homeworkphone).selectOptionContainingText(Home_work_Mobile);
			}
			
		}
		else if(RD_value.equalsIgnoreCase("No")){
			$(Will_this_policy_be_collaterally_assigned_No).click();
		}
		
	}
	public void enterLPIdetails( String employer_sponsored_plan, String EconomicIncntvFreeQuestn,String EconomicIncntvFreeQuestndetails,String Does_the_Proposed_Insured,String Does_the_Proposed_Insured_Details, String Is_the_policy_directly_or_indirectly,String Is_the_policy_directly_or_indirectly_detials, String Will_the_source_of_any_premium_payments,String Will_the_source_of_any_premium_payments_Details){
		
		if($(LPI_IsPolicyPurchasedUnderEmplSponsorPlanQuestn_RB_yes).isDisplayed()){
			selectRadioYesorNo(LPI_IsPolicyPurchasedUnderEmplSponsorPlanQuestn_RB_yes, LPI_IsPolicyPurchasedUnderEmplSponsorPlanQuestn_RB_No, employer_sponsored_plan);		
		}
		if($(LPI_HasPropsedInsuredOrOwnerOfferedEconomicIncntvFreeQuestn_RB_yes).isDisplayed()){
			selectRadioYesorNoDetails(LPI_HasPropsedInsuredOrOwnerOfferedEconomicIncntvFreeQuestn_RB_yes, LPI_HasPropsedInsuredOrOwnerOfferedEconomicIncntvFreeQuestn_RB_No, EconomicIncntvFreeQuestn, LPI_Details_InsuredorOwnerEcnmIncntv, EconomicIncntvFreeQuestndetails);
		}
		if($(LPI_DoesPrpsdInsuredOrOwnerhaveAgremntorCmtmntToSellQuest_RB_yes).isDisplayed()){
			selectRadioYesorNoDetails(LPI_DoesPrpsdInsuredOrOwnerhaveAgremntorCmtmntToSellQuest_RB_yes, LPI_DoesPrpsdInsuredOrOwnerhaveAgremntorCmtmntToSellQuest_RB_No, Does_the_Proposed_Insured, LPI_Details_InsuredorOwnerAgmntorCmtmntToSell, Does_the_Proposed_Insured_Details);
		}
		if($(LPI_IsPolicydirectlyOrIndirectlyOwnedByCaptInsurnceCmpnyQuest_RB_yes).isDisplayed()){
			selectRadioYesorNoDetails(LPI_IsPolicydirectlyOrIndirectlyOwnedByCaptInsurnceCmpnyQuest_RB_yes, LPI_IsPolicydirectlyOrIndirectlyOwnedByCaptInsurnceCmpnyQuest_RB_No, Is_the_policy_directly_or_indirectly, LPI_Details_IsPolDirOrIndirOwnedbyCaptvInsCmpny, Is_the_policy_directly_or_indirectly_detials);	
		}
		
		if($(LPI_WillSourceofPremPaymntAssetsorFromCntrbtnToCaptvInsCmpnyQuest_RB_Yes).isDisplayed()){
			selectRadioYesorNoDetails(LPI_WillSourceofPremPaymntAssetsorFromCntrbtnToCaptvInsCmpnyQuest_RB_Yes, LPI_WillSourceofPremPaymntAssetsorFromCntrbtnToCaptvInsCmpnyQuest_RB_No, Will_the_source_of_any_premium_payments, LPI_Details_WillSrcofPremAssetsFromCntrbtn, Will_the_source_of_any_premium_payments_Details);
		}
		
		$(LPI_NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
	}

}
