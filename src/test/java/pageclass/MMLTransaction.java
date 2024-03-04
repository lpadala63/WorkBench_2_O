package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

public class MMLTransaction {
	//h1[contains(text(),'MML Transaction Detail')]
	By MMLHeading = By.xpath("//h1[contains(text(),'MML Transaction Detail')]");
	By Section1 =By.xpath("//span[contains(text(),'Section I: Source of Funds/Redemption Information')]");
	By Section2 =By.xpath("//span[contains(text(),'Section II: Recommendation/Purchase Information')]");
	By Section3 =By.xpath("//span[contains(text(),'Section III: Transaction Rational')]");
	By Section4 =By.xpath("//span[contains(text(),'Section IV: Transaction Statements and Questions')]");
	By RightBridgeProductProfile = By.xpath("//input[@alt_id='TD_CaseNumber']");
	By Fundingsource_Advisory = By.xpath("//input[@alt_id='TD_FS_Advisory']");
	By Fundingsource_Brokerage = By.xpath("//input[@alt_id='TD_FS_Brokerage']");
	By Fundingsource_DirectMutualFunds = By.xpath("//input[@alt_id='TD_FS_DirectFunds']");
	By Fundingsource_VariableAnuity = By.xpath("//input[@alt_id='TD_FS_VariableAnnuity']");
	By Fundingsource_VariableLife = By.xpath("//input[@alt_id='TD_FS_VariableLife']");
	By Fundingsource_Employersponser = By.xpath("//input[@alt_id='TD_FS_EmployerPlan']");
	By Fundingsource_Other = By.xpath("//input[@alt_id='TD_FS_Other']");
	By Fundingsource_OtherPleaseSpecify = By.xpath("//input[@alt_id='TD_OtherSpecify']");
	
	By RedemptionInfo_EmployerSponsoredPlan = By.xpath("//input[@alt_id='TD_RS_EmployerPlan']");
	By RedemptionInfo_FixedFixedIndexAnnuity = By.xpath("//input[@alt_id='TD_RS_Fixed']");
	By RedemptionInfo_MutualFunds = By.xpath("//input[@alt_id='TD_RS_MutualFunds']");
	By RedemptionInfo_VariableAnnuity = By.xpath("//input[@alt_id='TD_RS_VariableAnnuity']");
	By RedemptionInfo_VariableLife_UL_WL = By.xpath("//input[@alt_id='TD_RS_VLULWL']");
	By RedemptionInfo_UIT = By.xpath("//input[@alt_id='TD_RS_UIT']");
	
	By Add_Replacement = By.xpath("//button[contains(text(),'Add Another')]");
	By Replacement_ProductName = By.xpath("//input[@alt_id='Name']");
	By Replacement_PoicyType = By.xpath("//select[@alt_id='Policy']");
	By Replacement_PoicyContractNumber = By.xpath("//input[@alt_id='Number']");
	By Replacement_issueMM = By.xpath("//div[@id='div_33']/div/span/span[1]/input[1]");
	By Replacement_issueDD = By.xpath("//div[@id='div_33']/div/span/span[1]/input[2]");
	By Replacement_issueYYYY = By.xpath("//div[@id='div_33']/div/span/span[1]/input[3]");
	By Replacement_faceAmount = By.xpath("//input[@alt_id='FAmount']");
	By Replacement_AnnualPremiumAmount = By.xpath("//input[@alt_id='APremium']");
	By Replacement_CashValue = By.xpath("//input[@alt_id='Cash']");
	By Replacement_SurrenderCharge = By.xpath("//input[@alt_id='Charge']");
	By Replacement_Full_Partial = By.xpath("//select[@alt_id='ReplaceSurrenderList']");
	By Replacement_This1035 = By.xpath("//select[@alt_id='Replace1035']");
	By Add_Replacement_Save = By.xpath("//h1[contains(text(),'TransactionStmts')]//following::button[contains(text(),'Save')]");
	By Recomendation_InvestmentAmount = By.xpath("//input[@alt_id='TD_InvestAmount']");
		
	By Transaction_Brokerage = By.xpath("//input[@alt_id='TD_TR_Brokerage']");
	By Transaction_Brokerage_PleaseProvide = By.xpath("//select[@alt_id='TD_TR_BrokerageDetails']");
	By Transaction_DirectMutualFunds = By.xpath("//input[@alt_id='TD_TR_DMF']");
	By Transaction_DirectMutualFunds_PleaseProvide = By.xpath("//input[@alt_id='TD_TR_DMFDetails']");
	By Transaction_Annuties = By.xpath("//input[@alt_id='TD_TR_Annuity']");
	By Transaction_Annuties_PleaseProvide = By.xpath("//input[@alt_id='TD_TR_AnnuityDetails']");
	By Transaction_InsuranceProduct = By.xpath("//input[@alt_id='TD_TR_Insurance']");
	By Transaction_InsuranceProduct_PleaseSpecify = By.xpath("//input[@alt_id='TD_TR_InsuranceDetails']");
	By Transaction_Other = By.xpath("//input[@alt_id='TD_TR_Other']");
	By Transaction_Other_PleaseSpecify = By.xpath("//input[@alt_id='TD_TR_OtherDetails']");
	By Transaction_ProvideRationaleforwhythisRecommendation = By.xpath("//textarea[@alt_id='TD_Rationale']");
	By Transaction_Whywasthisproductrecommended = By.xpath("//textarea[@alt_id='TD_Recommend']");
	
	By TransactionStmt_clientwillsubjecttonewcontingent = By.xpath("//select[@alt_id='TD_Contingent']");
	By TransactionStmt_contractpolicybeingreplaced = By.xpath("//select[@alt_id='TD_ContractUtilized']");
	By TransactionStmt_clientwillgiveupcertainbenefits = By.xpath("//select[@alt_id='TD_Benefits']");
	By TransactionStmt_clienthadaguaranteedminimumdeathbenefit = By.xpath("//select[@alt_id='TD_MinDeathBenefit']");
	By TransactionStmt_clientmaypaytaxesonthistransaction = By.xpath("//select[@alt_id='TD_PayTaxes']");
	By TransactionStmt_registeredrepresentativeontheoriginal  = By.xpath("//select[@alt_id='TD_RegisteredRep']");
	By TransactionStmt_clientisawareofthecontestablesuicide = By.xpath("//select[@alt_id='TD_ClientAware']");
	By TransactionStmt_replacementtheclient  = By.xpath("//select[@alt_id='TD_UnderwritingClass']");
	By TransactionStmt_Rolloversource  = By.xpath("//input[@alt_id='TD_SourcePensionDetails']");
	By TransactionStmt_Newinvestment = By.xpath("//input[@alt_id='TD_SourceInvestmentDetails']");
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	public void method1(String rightBridgeProductProfile,String FunidngResourceAdvisory,String Fundingsource_brokerage,String Fundingsource_directMutualFunds,String Fundingsource_variableAnuity,String Fundingsource_variableLife,String Fundingsource_employersponser,
			String Fundingsource_other,String Fundingsource_otherPleaseSpecify,String RedemptionInfo_employerSponsoredPlan, String RedemptionInfo_fixedFixedIndexAnnuity,String RedemptionInfo_mutualFunds,String RedemptionInfo_variableAnnuity,String RedemptionInfo_variableLife_UL_WL,
			String RedemptionInfo_uIT,String Replacement_productName,String Replacement_poicyType,String Replacement_poicyContractNumber,String Replacement_issuemm,String Replacement_issuedd,String Replacement_issueyyyy,String Replacement_FaceAmount,String Replacement_annualPremiumAmount,
			String Replacement_cashValue,String Replacement_surrenderCharge,String Replacement_full_Partial,String Replacement_this1035,String Recomendation_investmentAmount,String Transaction_brokerage,String Transaction_Brokerage_pleaseProvide,String Transaction_directMutualFunds,String Transaction_DirectMutualFunds_pleaseProvide,
			String Transaction_annuties,String Transaction_Annuties_pleaseProvide,String Transaction_insuranceProduct,String Transaction_InsuranceProduct_pleaseSpecify,String Transaction_other,String Transaction_Other_pleaseSpecify,String RationalforWhythisrecommendation,String Transaction_whywasthisproductrecommended,String TransactionStmt_Clientwillsubjecttonewcontingent,String TransactionStmt_Contractpolicybeingreplaced,String TransactionStmt_Clientwillgiveupcertainbenefits,String TransactionStmt_Clienthadaguaranteedminimumdeathbenefit,String TransactionStmt_Clientmaypaytaxesonthistransaction,String TransactionStmt_Registeredrepresentativeontheoriginal,
			String TransactionStmt_Clientisawareofthecontestablesuicide,String TransactionStmt_Replacementtheclient,String TransactionStmt_rolloversource,String TransactionStmt_newinvestment){
		if($(MMLHeading).isDisplayed()){
			if($(Section1).isDisplayed()){
				$(RightBridgeProductProfile).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(rightBridgeProductProfile);
			}
			if($(Section2).isDisplayed()){
				if (FunidngResourceAdvisory.equalsIgnoreCase("Yes")) {
					$(Fundingsource_Advisory).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (FunidngResourceAdvisory.equalsIgnoreCase("Yes")) {
					$(Fundingsource_Brokerage).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (FunidngResourceAdvisory.equalsIgnoreCase("Yes")) {
					$(Fundingsource_DirectMutualFunds).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (FunidngResourceAdvisory.equalsIgnoreCase("Yes")) {
					$(Fundingsource_VariableAnuity).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (FunidngResourceAdvisory.equalsIgnoreCase("Yes")) {
					$(Fundingsource_VariableLife).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (FunidngResourceAdvisory.equalsIgnoreCase("Yes")) {
					$(Fundingsource_Employersponser).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (FunidngResourceAdvisory.equalsIgnoreCase("Yes")) {
					$(Fundingsource_Other).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Fundingsource_OtherPleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Fundingsource_otherPleaseSpecify);
				}
				
				
				if (RedemptionInfo_employerSponsoredPlan.equalsIgnoreCase("Yes")) {
					$(RedemptionInfo_EmployerSponsoredPlan).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (RedemptionInfo_fixedFixedIndexAnnuity.equalsIgnoreCase("Yes")) {
					$(RedemptionInfo_FixedFixedIndexAnnuity).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (RedemptionInfo_mutualFunds.equalsIgnoreCase("Yes")) {
					$(RedemptionInfo_MutualFunds).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (RedemptionInfo_variableAnnuity.equalsIgnoreCase("Yes")) {
					$(RedemptionInfo_VariableAnnuity).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (RedemptionInfo_variableLife_UL_WL.equalsIgnoreCase("Yes")) {
					$(RedemptionInfo_VariableLife_UL_WL).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (RedemptionInfo_uIT.equalsIgnoreCase("Yes")) {
					$(RedemptionInfo_UIT).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				
				if($(Add_Replacement).isDisplayed()){
					$(Add_Replacement).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Replacement_ProductName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_productName);
					$(Replacement_PoicyType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Replacement_poicyType);
					$(Replacement_PoicyContractNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_poicyContractNumber);
					$(Replacement_issueMM).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_issuemm);
					$(Replacement_issueDD).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_issuedd);
					$(Replacement_issueYYYY).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_issueyyyy);
					$(Replacement_faceAmount).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_FaceAmount);
					
					$(Replacement_AnnualPremiumAmount).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_annualPremiumAmount);
					$(Replacement_CashValue).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_cashValue);
					$(Replacement_SurrenderCharge).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Replacement_surrenderCharge);
					$(Replacement_Full_Partial).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Replacement_full_Partial);
					$(Replacement_This1035).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Replacement_this1035);
					$(Add_Replacement_Save).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Recomendation_InvestmentAmount).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Recomendation_investmentAmount);
				}
			}
	
			if($(Section2).isDisplayed()){
				$(Recomendation_InvestmentAmount).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Recomendation_investmentAmount);
			}
			
			
			
			if($(Section3).isDisplayed()){
				if (Transaction_brokerage.equalsIgnoreCase("Yes")) {
					$(Transaction_Brokerage).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Transaction_Brokerage_PleaseProvide).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Transaction_Brokerage_pleaseProvide);
				}
				if (Transaction_directMutualFunds.equalsIgnoreCase("Yes")) {
					$(Transaction_DirectMutualFunds).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Transaction_DirectMutualFunds_PleaseProvide).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Transaction_DirectMutualFunds_pleaseProvide);
				}
				if (Transaction_annuties.equalsIgnoreCase("Yes")) {
					$(Transaction_Annuties).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Transaction_Annuties_PleaseProvide).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Transaction_Annuties_pleaseProvide);
				}
				if (Transaction_insuranceProduct.equalsIgnoreCase("Yes")) {
					$(Transaction_InsuranceProduct).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Transaction_InsuranceProduct_PleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Transaction_InsuranceProduct_pleaseSpecify);
				}
				if (Transaction_other.equalsIgnoreCase("Yes")) {
					$(Transaction_Other).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(Transaction_Other_PleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Transaction_Other_pleaseSpecify);
				}
				
				$(Transaction_ProvideRationaleforwhythisRecommendation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(RationalforWhythisrecommendation);
				$(Transaction_Whywasthisproductrecommended).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Transaction_whywasthisproductrecommended);
			}

			
			
			if($(Section4).isDisplayed()){
				$(TransactionStmt_clientwillsubjecttonewcontingent).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Clientwillsubjecttonewcontingent);
				$(TransactionStmt_contractpolicybeingreplaced).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Contractpolicybeingreplaced);
				$(TransactionStmt_clientwillgiveupcertainbenefits).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Clientwillgiveupcertainbenefits);
				$(TransactionStmt_clienthadaguaranteedminimumdeathbenefit).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Clienthadaguaranteedminimumdeathbenefit);
				$(TransactionStmt_clientmaypaytaxesonthistransaction).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Clientmaypaytaxesonthistransaction);
				$(TransactionStmt_registeredrepresentativeontheoriginal).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Registeredrepresentativeontheoriginal);
				$(TransactionStmt_clientisawareofthecontestablesuicide).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Clientisawareofthecontestablesuicide);
				$(TransactionStmt_replacementtheclient).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TransactionStmt_Replacementtheclient);
				$(TransactionStmt_Rolloversource).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(TransactionStmt_rolloversource);
				$(TransactionStmt_Newinvestment).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(TransactionStmt_newinvestment);
			}
			
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		}
						
	}
	

}