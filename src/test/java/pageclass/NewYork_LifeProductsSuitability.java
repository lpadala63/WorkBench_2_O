package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class NewYork_LifeProductsSuitability extends GlobalCap{
	By Anticipatedtimecoverage_DD =By.xpath("//label[contains(text(),'coverage is needed')]//following::select[@alt_id='LS_Product_TimeCoverageNeeded']");	
    By Primarypurposeof_ins_DD=By.xpath("//label[contains(text(),'Primary purpose')]//following::select[@alt_id='LS_Product_POI']");	
    By Ins_options_above_Yes=By.xpath("//label[contains(text(),'Insurance options above')]//following::input[@alt_id='LS_Product_MoreInfoPOIYesNo_1']");
    By Ins_options_above_No=By.xpath("//label[contains(text(),'Insurance options above')]//following::input[@alt_id='LS_Product_MoreInfoPOIYesNo_2']");
    By Dependent_Yes=By.xpath("//label[contains(text(),'dependents')]//following::input[@alt_id='LS_DependentsYesNo_1']");
    By Dependent_No=By.xpath("//label[contains(text(),'dependents')]//following::input[@alt_id='LS_DependentsYesNo_2']");
    By Dependent_Spouse=By.xpath("//span[text()='Spouse']");
    By Dependent_Children=By.xpath("//span[text()='Child(ren)']");
    By Dependent_Parent=By.xpath("//input[@alt_id='LS_DependentRelationship_Parent']//following::span[text()='Parent(s)']");
    By Dependent_family=By.xpath("//span[text()='Disabled family member']");
    By Dependent_other=By.xpath("//span[text()='Other']");
    By Dependent_otherText=By.xpath("//label[contains(text(),'Explain')]//following-sibling::input");
    
    //
    By EarnedIncome=By.xpath("//span[contains(text(),'Earned Income') and @id='lbl_414']");
    By NonRetirement=By.xpath("//span[contains(text(),'Non-Retirement Savings') and @id='lbl_413']");
    By unearnedincome=By.xpath("//span[contains(text(),'Investment/unearned income') and @id='lbl_412']");
    By PremiumFinancing=By.xpath("//span[contains(text(),'Premium Financing/Borrowing') and @id='lbl_411']");
    By Inheritance=By.xpath("//span[contains(text(),'Gift/Inheritance') and @id='lbl_410']");
    
    By withdrawls=By.xpath("//span[contains(text(),'Withdrawals from Retirement') and @id='lbl_409']");
    By TaxPenality_Yes=By.xpath("//label[contains(text(),'tax penalty')]//following::input[@alt_id='LS_Product_SOP_401IRA_TaxYesNo_1']");
    By TaxPenality_No=By.xpath("//label[contains(text(),'tax penalty')]//following::input[@alt_id='LS_Product_SOP_401IRA_TaxYesNo_2']");
    By hardshipwithdrawal_Yes=By.xpath("//label[contains(text(),'hardship withdrawal')]//following::input[@alt_id='LS_Product_SOP_401IRA_WithdrawalYesNo_1']");
    By hardshipwithdrawal_No=By.xpath("//label[contains(text(),'hardship withdrawal')]//following::input[@alt_id='LS_Product_SOP_401IRA_WithdrawalYesNo_2']");
    By surrenderCharge_Yes=By.xpath("//label[contains(text(),'surrender charge')]//following::input[@alt_id='LS_Product_SOP_401IRA_SurrenderChargeYesNo_1']");
    By surrenderCharge_No=By.xpath("//label[contains(text(),'surrender charge')]//following::input[@alt_id='LS_Product_SOP_401IRA_SurrenderChargeYesNo_2']");
    By surrenderChargeDetails=By.xpath("//label[contains(text(),'surrender charge amount')]//following-sibling::input[@alt_id='LS_Product_SOP_401IRA_SurrenderAmount']");
    
    
    
    By SocialSecurity=By.xpath("//span[contains(text(),'Pension/Social Security') and @id='lbl_408']");
    
    By Existinglifeins=By.xpath("//span[contains(text(),'Existing life insurance') and @id='lbl_407']"); 
    By exchangeamount=By.xpath("//label[contains(text(),'exchange amount') ]//following-sibling::input[@alt_id='LS_Product_SOP_1035_Amount']");
    By exchangSurenderCharge_Yes=By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_1035_SurrenderYesNo_1']");
    By exchangSurenderCharge_No=By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_1035_SurrenderYesNo_2']");
    By exchangsurrenderChargeAmount=By.xpath("//label[contains(text(),'surrender charge amount')]//following-sibling::input[@alt_id='LS_Product_SOP_1035_SurrenderAmount']");
    
    By singlePremium=By.xpath("//span[contains(text(),'Single Premium Program') and @id='lbl_406']");
    By AnnuitizationSurrender=By.xpath("//span[contains(text(),'Annuitization or Surrender') and @id='lbl_405']");
    By AnnuitizationexchangSurenderCharge_Yes=By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_Annuitization_SurrenderYesNo_1']");
    By AnnuitizationexchangSurenderCharge_No=By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_Annuitization_SurrenderYesNo_2']");
    By AnnuitizationexchangsurrenderChargeAmount=By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_Annuitization_SurrenderAmount']");
    
    By PolicyLoan=By.xpath("//span[contains(text(),'Policy Loan') and @id='lbl_404']");
    By TrustDistribution=By.xpath("//span[contains(text(),'Trust Distribution') and @id='lbl_403']");
    
      
    By Alt_EarnedIncome=By.xpath("//input[@id='cb_496']");
    By Alt_NonRetirement=By.xpath("//input[@id='cb_495']");
    By Alt_unearnedincome=By.xpath("//input[@id='cb_494']");
    By Alt_PremiumFinancing=By.xpath("//input[@id='cb_493']");
    By Alt_Inheritance=By.xpath("//input[@id='cb_492']");
    
    By Alt_withdrawls=By.xpath("//input[@id='cb_491']");
    By Alt_TaxPenality_Yes=By.xpath("//input[@id='rdo_484_1']");
    By Alt_TaxPenality_No=By.xpath("//input[@id='rdo_484_2']");
    By Alt_hardshipwithdrawal_Yes=By.xpath("//input[@id='rdo_483_1']");
    By Alt_hardshipwithdrawal_No=By.xpath("//input[@id='rdo_483_2']");
    By Alt_surrenderCharge_Yes=By.xpath("//input[@id='rdo_482_1']");
    By Alt_surrenderCharge_No=By.xpath("//input[@id='rdo_482_2']");
    By Alt_surrenderChargeDetails=By.xpath("//input[@id='flda_481']");
    
    By Alt_SocialSecurity=By.xpath("//input[@id='cb_490']");
    By Alt_Existinglifeins=By.xpath("//input[@id='cb_489']"); 
    By Alt_exchangeamount=By.xpath("//input[@id='flda_480']");
    By Alt_exchangSurenderCharge_Yes=By.xpath("//input[@id='rdo_479_1']");
    By Alt_exchangSurenderCharge_No=By.xpath("//input[@id='rdo_479_2']");
    By Alt_exchangsurrenderChargeAmount=By.xpath("//input[@id='flda_478']");
    
    By Alt_singlePremium=By.xpath("//input[@id='cb_488']");
    By Alt_AnnuitizationSurrender=By.xpath("//input[@id='cb_487']");
    By Alt_AnnuitizationexchangSurenderCharge_Yes=By.xpath("//input[@id='rdo_497_1']");
    By Alt_AnnuitizationexchangSurenderCharge_No=By.xpath("//input[@id='rdo_497_2']");
    By Alt_AnnuitizationexchangsurrenderChargeAmount=By.xpath("//input[@id='flda_477']");
    
    By Alt_PolicyLoan=By.xpath("//input[@id='cb_486']");
    By Alt_TrustDistribution=By.xpath("//input[@id='cb_485']");
    By Alt_heading=By.xpath("//strong[contains(text(),'Alternate product (Select all that apply)')]");
    
    By Add_heading=By.xpath("//strong[contains(text(),'Additional product (Select all that apply)')]");
    By Add_EarnedIncome=By.xpath("//input[@id='cb_496']");
    By Add_NonRetirement=By.xpath("//input[@id='cb_495']");
    By Add_unearnedincome=By.xpath("//input[@id='cb_494']");
    By Add_PremiumFinancing=By.xpath("//input[@id='cb_493']");
    By Add_Inheritance=By.xpath("//input[@id='cb_492']");
    
    By Add_withdrawls=By.xpath("//input[@id='cb_491']");
    By Add_TaxPenality_Yes=By.xpath("//input[@id='rdo_484_1']");
    By Add_TaxPenality_No=By.xpath("//input[@id='rdo_484_2']");
    By Add_hardshipwithdrawal_Yes=By.xpath("//input[@id='rdo_483_1']");
    By Add_hardshipwithdrawal_No=By.xpath("//input[@id='rdo_483_2']");
    By Add_surrenderCharge_Yes=By.xpath("//input[@id='rdo_482_1']");
    By Add_surrenderCharge_No=By.xpath("//input[@id='rdo_482_2']");
    By Add_surrenderChargeDetails=By.xpath("//input[@id='flda_481']");
    
    By Add_SocialSecurity=By.xpath("//input[@id='cb_490']");
    By Add_Existinglifeins=By.xpath("//input[@id='cb_489']"); 
    By Add_exchangeamount=By.xpath("//input[@id='flda_480']");
    By Add_exchangSurenderCharge_Yes=By.xpath("//input[@id='rdo_479_1']");
    By Add_exchangSurenderCharge_No=By.xpath("//input[@id='rdo_479_2']");
    By Add_exchangsurrenderChargeAmount=By.xpath("//input[@id='flda_478']");
    
    By Add_singlePremium=By.xpath("//input[@id='cb_488']");
    By Add_AnnuitizationSurrender=By.xpath("//input[@id='cb_487']");
    By Add_AnnuitizationexchangSurenderCharge_Yes=By.xpath("//input[@id='rdo_497_1']");
    By Add_AnnuitizationexchangSurenderCharge_No=By.xpath("//input[@id='rdo_497_2']");
    By Add_AnnuitizationexchangsurrenderChargeAmount=By.xpath("//input[@id='flda_477']");
    
    By Add_PolicyLoan=By.xpath("//input[@id='cb_486']");
    By Add_TrustDistribution=By.xpath("//input[@id='cb_485']");
    
    
    By securities=By.xpath("//label[contains(text(),'Securities')]//following-sibling::select");
    By Annuities=By.xpath("//label[contains(text(),'Annuities')]//following-sibling::select");
    By CashValue=By.xpath("//label[contains(text(),'Cash Value')]//following-sibling::select"); 
    By AlternativeInvestments=By.xpath("//label[contains(text(),'Alternative Investments')]//following-sibling::select");
    
    By Financialobjectives=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Family Protection')]");
    By LongTermCare=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Long Term Care')]");
    By Savingforretirement=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Saving for retirement')]");
    By Significantpurchase=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Significant purchase')]");
    By BusinessStartup=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Business Start-up')]");
    By Longtermcash=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Long term cash')]");
    By Payingforchild=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Paying for child')]");
    By Wealthpreservation=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Wealth preservation')]");
    By Providingexecutive=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Providing executive')]");
    By Planningforthefuture=By.xpath("//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Planning for the future')]");
    By Next=By.xpath("//button[text()='Next  ']");
    
    
    //Alternate
    By AlternateProduct=By.xpath("//label[contains(text(),'Alternate Product:')]");
    By Alt_intend_on_converting=By.xpath("//select[@id='lb_206']");
    By Alt_Anticipated_coverageNeeded=By.xpath("//select[@id='lb_219']");
    By Alt_PorposeofInsure=By.xpath("//select[@id='lb_221']");
    By Alt_Ins_option_above_Yes=By.xpath("//input[@id='rdo_218_1']");
    By Alt_Ins_option_above_No=By.xpath("//input[@id='rdo_218_2']");
    
    //Additional
    By AdditionalProduct=By.xpath("//label[contains(text(),'Additional Product:')]");
    By Add_Anticipated_coverageNeeded=By.xpath("//select[@id='lb_222']");
    By Add_PorposeofInsure=By.xpath("//select[@id='lb_224']");
    By Add_Ins_option_above_Yes=By.xpath("//input[@id='rdo_217_1']");
    By Add_Ins_option_above_No=By.xpath("//input[@id='rdo_217_2']");
    
    
    
    
    By familyprotection=By.xpath("//input[@id='cb_543']");
    By LTC=By.xpath("//input[@id='cb_542']");
    By savingfrRetiremnet=By.xpath("//input[@id='cb_541']"); 
    By significantpurchase=By.xpath("//input[@id='cb_540']");
    By BussinessStartup=By.xpath("//input[@id='cb_539']");
    By LongTermCash=By.xpath("//input[@id='cb_538']");
    By payingforchilds=By.xpath("//input[@id='cb_537']");
    By wealthpreservation=By.xpath("//input[@id='cb_536']");
    By ProvidingExecution=By.xpath("//input[@id='cb_535']");
    By Planningforfuture=By.xpath("//input[@id='cb_534']");
 
    By IntendonConvertingPolicy=By.xpath("//select[@id='lb_204']");
    
    public void productAndPremiumPayorInfo(String State,String IntendonConvertingpolicy,String Anticipatedtimecoverage,String Primarypurposeof_ins,String InsOptionsAbove,
    		String Dependent,String DependentDetails,String OtherText ){
    	if (State.equalsIgnoreCase("New York")){ 
    		if($(IntendonConvertingPolicy).isDisplayed()){
    			$(IntendonConvertingPolicy).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(IntendonConvertingpolicy);
    		}
    		$(Anticipatedtimecoverage_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Anticipatedtimecoverage);
    		$(Primarypurposeof_ins_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Primarypurposeof_ins);
    		selectRadioYesorNo(Ins_options_above_Yes, Ins_options_above_No, InsOptionsAbove);
    		selectRadioYesorNo(Dependent_Yes, Dependent_No, Dependent);
    		if(Dependent.equalsIgnoreCase("Yes")){
    			selectRadioYesorNo(Dependent_Yes, Dependent_No, Dependent);
    			
    			switch (DependentDetails) {
    			case "Spouse":
    				$(Dependent_Spouse).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Child(ren)":
    				$(Dependent_Children).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Parent(s)":
    				$(Dependent_Parent).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Disabled family member":
    				$(Dependent_family).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Other":
    				$(Dependent_other).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    				break;   				
    				
    			default:
    				System.out.println("Not able to select the option");
    				break;
    			}
    		}
    		
    	}
    	
    }
    
    
    
    public void ALternate_and_additional(String State,String alt_intend_on_converting,String alt_Anticipated_coverageNeeded,String alt_PorposeofInsure,String Alt_Ins_option_above_RD,
    		String add_Anticipated_coverageNeeded,String add_PorposeofInsure,String Add_Ins_option_above_RD){
    	if (State.equalsIgnoreCase("New York")){ 
    	if($(AlternateProduct).isDisplayed()){
    		$(Alt_intend_on_converting).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(alt_intend_on_converting);
    		$(Alt_Anticipated_coverageNeeded).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(alt_Anticipated_coverageNeeded);
    		$(Alt_PorposeofInsure).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(alt_PorposeofInsure);
    		selectRadioYesorNo(Alt_Ins_option_above_Yes, Alt_Ins_option_above_No, Alt_Ins_option_above_RD);
    	}
    	if($(AdditionalProduct).isDisplayed()){
    		
    		$(Add_Anticipated_coverageNeeded).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(add_Anticipated_coverageNeeded);
    		$(Add_PorposeofInsure).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(add_PorposeofInsure);
    		selectRadioYesorNo(Add_Ins_option_above_Yes, Add_Ins_option_above_No, Add_Ins_option_above_RD);
    	}
    	}
    }
    public void financialinfo(String state,String sourceofPremium,String TaxPenality,String hardshipwithdrawal,String surrenderCharge,
    		String surrenderChargeDetail,String Exchangeamount,String exchangSurenderCharge,String surrenderChargeAmount,String AnnuitizationSurenderCharge,
    		String AnnuitizationSurenderChargeAmount ){
    	
    	if(state.equalsIgnoreCase("New York")){   			
    			switch (sourceofPremium) {
    			case "Earned Income (individual or household)":
    				$(EarnedIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Non-Retirement Savings":
    				$(NonRetirement).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Investment/unearned income":
    				$(unearnedincome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Premium Financing/Borrowing":
    				$(PremiumFinancing).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    			case "Gift/Inheritance":
    				$(Inheritance).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    				break;  
    			case "Withdrawals from Retirement Account":
    				$(withdrawls).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				selectRadioYesorNo(TaxPenality_Yes, TaxPenality_No, TaxPenality);
    				selectRadioYesorNo(hardshipwithdrawal_Yes, hardshipwithdrawal_No, hardshipwithdrawal);
    				selectRadioYesorNo(surrenderCharge_Yes, surrenderCharge_No, surrenderCharge);
    				if(surrenderCharge.equalsIgnoreCase("Yes")){
    					$(surrenderChargeDetails).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(surrenderChargeDetail);
    				}
    				//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    				break;  
    			case "Pension/Social Security":
    				$(SocialSecurity).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			//	$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    				break;  
    			case "1035 of Existing life insurance":
    				$(Existinglifeins).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				$(exchangeamount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Exchangeamount);
    				selectRadioYesorNo(exchangSurenderCharge_Yes, exchangSurenderCharge_No, exchangSurenderCharge);
    				if(exchangSurenderCharge.equalsIgnoreCase("Yes")){
    					$(exchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(surrenderChargeAmount);
    				}
    				
    				//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    				break;  
    			case "Single Premium Program (SPP)":
    				$(singlePremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    				break;
    			case "Annuitization or Surrender of deferred annuity":
    				$(AnnuitizationSurrender).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				selectRadioYesorNo(AnnuitizationexchangSurenderCharge_Yes, AnnuitizationexchangSurenderCharge_No, AnnuitizationSurenderCharge);
    				if(exchangSurenderCharge.equalsIgnoreCase("Yes")){
    					$(AnnuitizationexchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AnnuitizationSurenderChargeAmount);
    				}
    				break;  
    			case "Policy Loan":
    				$(PolicyLoan).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();    			
    				break;
    			case "Trust Distribution":
    				$(TrustDistribution).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    				break;
    				
    				
    			default:
    				System.out.println("Not able to select the option");
    				break;
    			}
    	}
	}
    
    public void NY_Alt_financialinfo(String state,String ALT_sourceofPremium,String Alt_TaxPenality,String Alt_hardshipwithdrawal,String Alt_surrenderCharge,
    		String Alt_surrenderChargeDetail,String Alt_Exchangeamount,String Alt_exchangSurenderCharge,String Alt_surrenderChargeAmount,String Alt_AnnuitizationSurenderCharge,
    		String Alt_AnnuitizationSurenderChargeAmount ){
    	
    	if (state.equalsIgnoreCase("New York")){ 
    	if($(Alt_heading).isDisplayed()){
  		  JavascriptExecutor js = (JavascriptExecutor)HooksTest.idriver;
  	        //Scroll down till the bottom of the page
  	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    		switch (ALT_sourceofPremium) {
    		case "Alternate Earned Income (individual or household)":
    			$(Alt_EarnedIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Alternate Non-Retirement Savings":
    			$(Alt_NonRetirement).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Alternate Investment/unearned income":
    			$(Alt_unearnedincome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Alternate Premium Financing/Borrowing":
    			$(Alt_PremiumFinancing).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Alternate Gift/Inheritance":
    			$(Alt_Inheritance).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Alternate Withdrawals from Retirement Account":
    			$(Alt_withdrawls).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			selectRadioYesorNo(Alt_TaxPenality_Yes, Alt_TaxPenality_No, Alt_TaxPenality);
    			selectRadioYesorNo(Alt_hardshipwithdrawal_Yes, Alt_hardshipwithdrawal_No, Alt_hardshipwithdrawal);
    			selectRadioYesorNo(Alt_surrenderCharge_Yes, Alt_surrenderCharge_No, Alt_surrenderCharge);
    			if(Alt_surrenderCharge.equalsIgnoreCase("Yes")){
    				$(Alt_surrenderChargeDetails).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_surrenderChargeDetail);
    			}
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Alternate Pension/Social Security":
    			$(Alt_SocialSecurity).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    		//	$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Alternate 1035 of Existing life insurance":
    			$(Alt_Existinglifeins).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			$(Alt_exchangeamount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_Exchangeamount);
    			selectRadioYesorNo(Alt_exchangSurenderCharge_Yes, Alt_exchangSurenderCharge_No, Alt_exchangSurenderCharge);
    			if(Alt_exchangSurenderCharge.equalsIgnoreCase("Yes")){
    				$(Alt_exchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_surrenderChargeAmount);
    			}
    			
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Alternate Single Premium Program (SPP)":
    			$(Alt_singlePremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;
    		case "AlternateAnnuitization or Surrender of deferred annuity":
    			$(Alt_AnnuitizationSurrender).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			selectRadioYesorNo(Alt_AnnuitizationexchangSurenderCharge_Yes, Alt_AnnuitizationexchangSurenderCharge_No, Alt_AnnuitizationSurenderCharge);
    			if(Alt_AnnuitizationSurenderCharge.equalsIgnoreCase("Yes")){
    				$(Alt_AnnuitizationexchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_AnnuitizationSurenderChargeAmount);
    			}
    			break;  
    		case "Alternate Policy Loan":
    			$(Alt_PolicyLoan).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();    			
    			break;
    		case "Alternate Trust Distribution":
    			$(Alt_TrustDistribution).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		default:
    			System.out.println("Not able to select the option");
    			break;
    		}
    	}
    	}
    	
    }
    public void NY_Add_financialinfo(String state,String ADD_sourceofPremium,String ADD_TaxPenality,String Add_hardshipwithdrawal,String Add_surrenderCharge,
    		String AdD_surrenderChargeDetail,String Add_Exchangeamount,String Add_exchangSurenderCharge,String Add_surrenderChargeAmount,String Add_AnnuitizationSurenderCharge,
    		String Add_AnnuitizationSurenderChargeAmount ){
    	if (state.equalsIgnoreCase("New York")){ 
    	if($(Add_heading).isDisplayed()){
    		  JavascriptExecutor js = (JavascriptExecutor)HooksTest.idriver;
    	        //Scroll down till the bottom of the page
    	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    		switch (ADD_sourceofPremium) {
    		case "Additonal Earned Income (individual or household)":
    			$(Add_EarnedIncome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Additional Non-Retirement Savings":
    			$(Add_NonRetirement).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Additonal Investment/unearned income":
    			$(Add_unearnedincome).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Additonal Premium Financing/Borrowing":
    			$(Add_PremiumFinancing).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		case "Additonal Gift/Inheritance":
    			$(Add_Inheritance).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Additonal Withdrawals from Retirement Account":
    			$(Add_withdrawls).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			selectRadioYesorNo(Add_TaxPenality_Yes, Add_TaxPenality_No, ADD_TaxPenality);
    			selectRadioYesorNo(Add_hardshipwithdrawal_Yes, Add_hardshipwithdrawal_No, Add_hardshipwithdrawal);
    			selectRadioYesorNo(Add_surrenderCharge_Yes, Add_surrenderCharge_No, Add_surrenderCharge);
    			if(Add_surrenderCharge.equalsIgnoreCase("Yes")){
    				$(Add_surrenderChargeDetails).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AdD_surrenderChargeDetail);
    			}
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Additonal Pension/Social Security":
    			$(Add_SocialSecurity).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    		//	$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Additonal 1035 of Existing life insurance":
    			$(Add_Existinglifeins).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			$(Add_exchangeamount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_Exchangeamount);
    			selectRadioYesorNo(Add_exchangSurenderCharge_Yes, Add_exchangSurenderCharge_No, Add_exchangSurenderCharge);
    			if(Add_exchangSurenderCharge.equalsIgnoreCase("Yes")){
    				$(Add_exchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_surrenderChargeAmount);
    			}
    			
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;  
    		case "Additonal Single Premium Program (SPP)":
    			$(Add_singlePremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			//$(Dependent_otherText).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(OtherText);
    			break;
    		case "AdditonalAnnuitization or Surrender of deferred annuity":
    			$(Add_AnnuitizationSurrender).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			selectRadioYesorNo(Add_AnnuitizationexchangSurenderCharge_Yes, Add_AnnuitizationexchangSurenderCharge_No, Add_AnnuitizationSurenderCharge);
    			if(Add_AnnuitizationSurenderCharge.equalsIgnoreCase("Yes")){
    				$(Add_AnnuitizationexchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_AnnuitizationSurenderChargeAmount);
    			}
    			break;  
    		case "Additonal Policy Loan":
    			$(Add_PolicyLoan).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();    			
    			break;
    		case "Additonal Trust Distribution":
    			$(Add_TrustDistribution).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
    			break;
    		default:
    			System.out.println("Not able to select the option");
    			break;
    		}
    	}
    	
    	}
    }
	public void financialExperience(String state, String securitiess, String Annuitiess, String CashValues,
			String AlternativeInvestmentss, String FinancialObject) {
		if (state.equalsIgnoreCase("New York")) {
			$(securities).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(securitiess);
			$(Annuities).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Annuitiess);
			$(CashValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(CashValues);
			$(AlternativeInvestments).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(AlternativeInvestmentss);
			switch (FinancialObject) {
			case "Family Protection":
				$(Financialobjectives).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Long Term Care":
				$(LongTermCare).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Saving for retirement":
				$(Savingforretirement).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Significant purchase":
				$(Significantpurchase).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Business Start-up / Operations":
				$(BusinessStartup).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				
				break;
			case "Long term cash accumulation":
				$(Longtermcash).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Paying for child":
				$(Payingforchild).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				
				break;
			case "Wealth preservation":
				$(Wealthpreservation).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Providing executive benefits for key employees":
				$(Providingexecutive).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Planning for the future":
				$(Planningforthefuture).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
				
			default:
				System.out.println("Not able to select the option");
				break;
				
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		

	}
    
  
}
