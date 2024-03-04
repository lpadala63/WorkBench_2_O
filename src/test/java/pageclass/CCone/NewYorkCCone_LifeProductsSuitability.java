package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class NewYorkCCone_LifeProductsSuitability extends GlobalCap {
	By Anticipatedtimecoverage_DD = By.xpath(
			"//label[contains(text(),'coverage is needed')]//following::select[@alt_id='LS_Product_TimeCoverageNeeded']");
	By Primarypurposeof_ins_DD = By
			.xpath("//label[contains(text(),'Primary purpose')]//following::select[@alt_id='LS_Product_POI']");
	By Ins_options_above_Yes = By.xpath(
			"//label[contains(text(),'Insurance options above')]//following::input[@alt_id='LS_Product_MoreInfoPOIYesNo_1']");
	By Ins_options_above_No = By.xpath(
			"//label[contains(text(),'Insurance options above')]//following::input[@alt_id='LS_Product_MoreInfoPOIYesNo_2']");
	By Dependent_Yes = By
			.xpath("//label[contains(text(),'dependents')]//following::input[@alt_id='LS_DependentsYesNo_1']");
	By Dependent_No = By
			.xpath("//label[contains(text(),'dependents')]//following::input[@alt_id='LS_DependentsYesNo_2']");
	By Dependent_Spouse = By.xpath("//span[text()='Spouse']");
	By Dependent_Children = By.xpath("//span[text()='Child(ren)']");
	By Dependent_Parent = By
			.xpath("//input[@alt_id='LS_DependentRelationship_Parent']//following::span[text()='Parent(s)']");
	By Dependent_family = By.xpath("//span[text()='Disabled family member']");
	By Dependent_other = By.xpath("//span[text()='Other']");
	By Dependent_otherText = By.xpath("//label[contains(text(),'Explain')]//following-sibling::input");

	By EarnedIncome = By.xpath("//span[contains(text(),'Earned Income')]");
	By NonRetirement = By.xpath("//span[contains(text(),'Non-Retirement Savings')]");
	By unearnedincome = By.xpath("//span[contains(text(),'Investment/unearned income')]");
	By PremiumFinancing = By.xpath("//span[contains(text(),'Premium Financing/Borrowing')]");
	By Inheritance = By.xpath("//span[contains(text(),'Gift/Inheritance')]");
	By withdrawls = By.xpath("//span[contains(text(),'Withdrawals from Retirement')]");
	By TaxPenality_Yes = By.xpath("//label[contains(text(),'tax penalty')]//following::input[@alt_id='LS_Product_SOP_401IRA_TaxYesNo_1']");
	By TaxPenality_No = By.xpath("//label[contains(text(),'tax penalty')]//following::input[@alt_id='LS_Product_SOP_401IRA_TaxYesNo_2']");
	By hardshipwithdrawal_Yes = By.xpath("//label[contains(text(),'hardship withdrawal')]//following::input[@alt_id='LS_Product_SOP_401IRA_WithdrawalYesNo_1']");
	By hardshipwithdrawal_No = By.xpath("//label[contains(text(),'hardship withdrawal')]//following::input[@alt_id='LS_Product_SOP_401IRA_WithdrawalYesNo_2']");
	By surrenderCharge_Yes = By.xpath("//label[contains(text(),'surrender charge')]//following::input[@alt_id='LS_Product_SOP_401IRA_SurrenderChargeYesNo_1']");
	By surrenderCharge_No = By.xpath("//label[contains(text(),'surrender charge')]//following::input[@alt_id='LS_Product_SOP_401IRA_SurrenderChargeYesNo_2']");
	By surrenderChargeDetails = By.xpath("//label[contains(text(),'surrender charge amount')]//following-sibling::input[@alt_id='LS_Product_SOP_401IRA_SurrenderAmount']");

	By SocialSecurity = By.xpath("//span[contains(text(),'Pension/Social Security')]");

	By Existinglifeins = By.xpath("//span[contains(text(),'Existing life insurance')]");
	By exchangeamount = By.xpath("//label[contains(text(),'exchange amount') ]//following-sibling::input[@alt_id='LS_Product_SOP_1035_Amount']");
	By exchangSurenderCharge_Yes = By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_1035_SurrenderYesNo_1']");
	By exchangSurenderCharge_No = By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_1035_SurrenderYesNo_2']");
	By exchangsurrenderChargeAmount = By.xpath("//label[contains(text(),'surrender charge amount')]//following-sibling::input[@alt_id='LS_Product_SOP_1035_SurrenderAmount']");

	By singlePremium = By.xpath("//span[contains(text(),'Single Premium Program')]");
	By AnnuitizationSurrender = By.xpath("//span[contains(text(),'Annuitization or Surrender')]");
	By AnnuitizationexchangSurenderCharge_Yes = By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_Annuitization_SurrenderYesNo_1']");
	By AnnuitizationexchangSurenderCharge_No = By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_Annuitization_SurrenderYesNo_2']");
	By AnnuitizationexchangsurrenderChargeAmount = By.xpath("//label[contains(text(),'surrender charge') ]//following::input[@alt_id='LS_Product_SOP_Annuitization_SurrenderAmount']");

	By PolicyLoan = By.xpath("//span[contains(text(),'Policy Loan')]");
	By TrustDistribution = By.xpath("//span[contains(text(),'Trust Distribution')]");
	By securities = By.xpath("//label[contains(text(),'Securities')]//following-sibling::select");
	By Annuities = By.xpath("//label[contains(text(),'Annuities')]//following-sibling::select");
	By CashValue = By.xpath("//label[contains(text(),'Cash Value')]//following-sibling::select");
	By AlternativeInvestments = By
			.xpath("//label[contains(text(),'Alternative Investments')]//following-sibling::select");

	By Financialobjectives = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Family Protection')]");
	By LongTermCare = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Long Term Care')]");
	By Savingforretirement = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Saving for retirement')]");
	By Significantpurchase = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Significant purchase')]");
	By BusinessStartup = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Business Start-up')]");
	By Longtermcash = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Long term cash')]");
	By Payingforchild = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Paying for child')]");
	By Wealthpreservation = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Wealth preservation')]");
	By Providingexecutive = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Providing executive')]");
	By Planningforthefuture = By.xpath(
			"//strong[contains(text(),'Financial objectives')]//following::span[contains(text(),'Planning for the future')]");
	By Next = By.xpath("//button[text()='Next  ']");

	public void productAndPremiumPayorInfo(String State, String Anticipatedtimecoverage, String Primarypurposeof_ins,
			String InsOptionsAbove, String Dependent, String DependentDetails, String OtherText) {
		if (State.equalsIgnoreCase("New York")) {
			$(Anticipatedtimecoverage_DD).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(Anticipatedtimecoverage);
			$(Primarypurposeof_ins_DD).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(Primarypurposeof_ins);
			selectRadioYesorNo(Ins_options_above_Yes, Ins_options_above_No, InsOptionsAbove);
			selectRadioYesorNo(Dependent_Yes, Dependent_No, Dependent);
			if (Dependent.equalsIgnoreCase("Yes")) {
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

	public void financialinfo(String state, String sourceofPremium, String TaxPenality, String hardshipwithdrawal,
			String surrenderCharge, String surrenderChargeDetail, String Exchangeamount, String exchangSurenderCharge,
			String surrenderChargeAmount, String AnnuitizationSurenderCharge,
			String AnnuitizationSurenderChargeAmount) {

		if (state.equalsIgnoreCase("New York")) {
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
				// $(Dependent_otherText).shouldBe(Visible.exist,
				// Duration.ofSeconds(60)).setValue(OtherText);
				break;
			case "Withdrawals from Retirement Account":
				$(withdrawls).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				selectRadioYesorNo(TaxPenality_Yes, TaxPenality_No, TaxPenality);
				selectRadioYesorNo(hardshipwithdrawal_Yes, hardshipwithdrawal_No, hardshipwithdrawal);
				selectRadioYesorNo(surrenderCharge_Yes, surrenderCharge_No, surrenderCharge);
				if (surrenderCharge.equalsIgnoreCase("Yes")) {
					$(surrenderChargeDetails).shouldBe(Visible.exist, Duration.ofSeconds(60))
							.setValue(surrenderChargeDetail);
				}
				// $(Dependent_otherText).shouldBe(Visible.exist,
				// Duration.ofSeconds(60)).setValue(OtherText);
				break;
			case "Pension/Social Security":
				$(SocialSecurity).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				// $(Dependent_otherText).shouldBe(Visible.exist,
				// Duration.ofSeconds(60)).setValue(OtherText);
				break;
			case "1035 of Existing life insurance":
				$(Existinglifeins).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(exchangeamount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Exchangeamount);
				selectRadioYesorNo(exchangSurenderCharge_Yes, exchangSurenderCharge_No, exchangSurenderCharge);
				if (exchangSurenderCharge.equalsIgnoreCase("Yes")) {
					$(exchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60))
							.setValue(surrenderChargeAmount);
				}

				// $(Dependent_otherText).shouldBe(Visible.exist,
				// Duration.ofSeconds(60)).setValue(OtherText);
				break;
			case "Single Premium Program (SPP)":
				$(singlePremium).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				// $(Dependent_otherText).shouldBe(Visible.exist,
				// Duration.ofSeconds(60)).setValue(OtherText);
				break;
			case "Annuitization or Surrender of deferred annuity":
				$(AnnuitizationSurrender).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				selectRadioYesorNo(AnnuitizationexchangSurenderCharge_Yes, AnnuitizationexchangSurenderCharge_No,
						AnnuitizationSurenderCharge);
				if (exchangSurenderCharge.equalsIgnoreCase("Yes")) {
					$(AnnuitizationexchangsurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60))
							.setValue(AnnuitizationSurenderChargeAmount);
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
