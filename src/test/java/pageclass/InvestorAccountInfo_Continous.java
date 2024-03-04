package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

public class InvestorAccountInfo_Continous {
	By InvestorAccountInfoContH1 = By.xpath("//h1[contains(text(),'Investor Account Info Cont.')]");
	By SuitabilityHeading = By.xpath("//span[contains(text(),'Suitability Financial Position')]");
	By AnnualIncome = By.xpath("//select[@id='lb_54']");
	By EstimatedNetWorth = By.xpath("//select[@id='lb_55']");
	By InvestableAssets = By.xpath("//select[@id='lb_56']");
	By FederalTaxRate = By.xpath("//select[@id='lb_57']");
	By Accountfundingsource	 = By.xpath("//select[@id='lb_58']");
	By AnnualExpenses = By.xpath("//select[@id='lb_59']");
	By SpecialExpenses = By.xpath("//select[@id='lb_60']");
	By TimeFrame = By.xpath("//select[@id='lb_61']");
	By Otherpleasespecify = By.xpath("//input[@id='flda_53']");
	
	By investmentprofile =By.xpath("//span[contains(text(),'Investment Profile')]");
	
	//investment purpose
	By saveforeducation =By.xpath("//input[@id='cb_52']");
	By Saveforretirement =By.xpath("//input[@id='cb_63']");
	By Saveforshorttermgoal =By.xpath("//input[@id='cb_62']");
	By Others =By.xpath("//input[@id='cb_64']");
	By pleaseSpecify =By.xpath("//input[@id='flda_65']");
	By investmentobjective =By.xpath("//select[@id='lb_66']");
	By investmenthehorizon =By.xpath("//select[@id='lb_67']");
	By generalInvestmentknowledge =By.xpath("//select[@id='lb_68']");
	
	
	
	By productknowledge =By.xpath("//span[contains(text(),'Product Knowledge')]");
	

	By productknowledge_Stocks =By.xpath("//select[@id='lb_75']");
	By productknowledge_Bonds =By.xpath("//select[@id='lb_69']");
	By productknowledge_VariableContracts =By.xpath("//select[@id='lb_71']");
	By productknowledge_MutualFunds =By.xpath("//select[@id='lb_70']");
	By productknowledge_LimitedPartnerships =By.xpath("//select[@id='lb_72']");
	By productknowledge_AlternativeInvestments =By.xpath("//select[@id='lb_73']");
	By productknowledge_Annuities =By.xpath("//select[@id='lb_74']");
	

	By AssestHeldAway =By.xpath("//span[contains(text(),'Assets Held Away')]");
	
	By AssestHeldAway_Totalvalueofassetsheldaway =By.xpath("//input[@id='flda_102']");
	By AssestHeldAway_Stocks =By.xpath("//input[@id='flda_101']");
	By AssestHeldAway_Bonds =By.xpath("//input[@id='flda_100']");
	By AssestHeldAway_ShortTerm =By.xpath("//input[@id='flda_99']");
	By AssestHeldAway_MutualFunds =By.xpath("//input[@id='flda_98']");
	By AssestHeldAway_Options =By.xpath("//input[@id='flda_97']");
	By AssestHeldAway_VariableContracts =By.xpath("//input[@id='flda_96']");
	By AssestHeldAway_LimitedPartnerships =By.xpath("//input[@id='flda_95']");
	By AssestHeldAway_AlternativeInvestments =By.xpath("//input[@id='flda_94']");
	By AssestHeldAway_Annuities =By.xpath("//input[@id='flda_93']");
	By AssestHeldAway_Others =By.xpath("//input[@id='flda_92']");
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	
	public void SuitabilityFinancialPosition(String Annualincome,String EstimatednetWorth,String Investableassets,String FederalTaxrate,String AccountFundingsource,String AccountFundingsourcePleaseSpecify, String Annualexpenses,String Specialexpenses,
			String Timeframe,String InvestmentPurpose,String PleaseSpecify,String Investmentobjective,String Investmenthehorizon,String GeneralInvestmentknowledge,String Productknowledge_Stocks,String Productknowledge_Bonds,String Productknowledge_VariableContracts,
			String Productknowledge_MutualFunds,String Productknowledge_LimitedPartnerships,String Productknowledge_AlternativeInvestments,String Productknowledge_Annuities,String AssestHeldAway_totalvalueofassetsheldaway,String AssestHeldAway_stocks,String AssestHeldAway_bonds,
			String AssestHeldAway_shortTerm,String AssestHeldAway_mutualFunds,String AssestHeldAway_options,String AssestHeldAway_variableContracts,String AssestHeldAway_limitedPartnerships,String AssestHeldAway_alternativeInvestments,String AssestHeldAway_annuities,String AssestHeldAway_others){
		if($(InvestorAccountInfoContH1).isDisplayed()){
			if($(SuitabilityHeading).isDisplayed()){
				$(AnnualIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Annualincome);
				$(EstimatedNetWorth).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(EstimatednetWorth);
				$(InvestableAssets).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Investableassets);
				$(FederalTaxRate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(FederalTaxrate);
				$(Accountfundingsource).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AccountFundingsource);
				if($(Otherpleasespecify).isDisplayed()){
					$(Accountfundingsource).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AccountFundingsourcePleaseSpecify);
				}
				$(AnnualExpenses).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Annualexpenses);
				$(SpecialExpenses).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Specialexpenses);
				$(TimeFrame).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Timeframe);	
			}
			
			if($(investmentprofile).isDisplayed()){
				if (InvestmentPurpose.equalsIgnoreCase("Save for education")) {
					$(saveforeducation).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				} else if (InvestmentPurpose.equalsIgnoreCase("Save for retirement")) {
					$(Saveforretirement).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				} else if (InvestmentPurpose.equalsIgnoreCase("Save for short term goal(s)")) {
					$(Saveforshorttermgoal).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				} else if (InvestmentPurpose.equalsIgnoreCase("Other")) {
					$(Others).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(pleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15))
							.selectOptionContainingText(PleaseSpecify);
				}
				
				$(investmentobjective).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Investmentobjective);
				$(investmenthehorizon).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Investmenthehorizon);
				$(generalInvestmentknowledge).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(GeneralInvestmentknowledge);	
			}
			if($(productknowledge).isDisplayed()){
				$(productknowledge_Stocks).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Productknowledge_Stocks);
				$(productknowledge_Bonds).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Productknowledge_Bonds);
				$(productknowledge_VariableContracts).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Productknowledge_VariableContracts);
				$(productknowledge_MutualFunds).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Productknowledge_MutualFunds);
				$(productknowledge_LimitedPartnerships).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Productknowledge_LimitedPartnerships);
				$(productknowledge_AlternativeInvestments).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Productknowledge_AlternativeInvestments);
				$(productknowledge_Annuities).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Productknowledge_Annuities);
			}
			if($(AssestHeldAway).isDisplayed()){
				$(AssestHeldAway_Totalvalueofassetsheldaway).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_totalvalueofassetsheldaway);
				$(AssestHeldAway_Stocks).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_stocks);
				$(AssestHeldAway_Bonds).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_bonds);
				$(AssestHeldAway_ShortTerm).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_shortTerm);
				$(AssestHeldAway_MutualFunds).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_mutualFunds);
				$(AssestHeldAway_Options).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_options);
				$(AssestHeldAway_VariableContracts).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_variableContracts);
				$(AssestHeldAway_LimitedPartnerships).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_limitedPartnerships);
				$(AssestHeldAway_AlternativeInvestments).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_alternativeInvestments);
				$(AssestHeldAway_Annuities).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_annuities);
				$(AssestHeldAway_Others).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AssestHeldAway_others);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		
	}
}
