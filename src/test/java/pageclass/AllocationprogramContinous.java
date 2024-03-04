package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

public class AllocationprogramContinous {
	By Heading = By.xpath("//h1[contains(text(),'Allocation Programs Cont')]");
	
	By DollarCost_Frequency = By.xpath("//select[@id='lb_154' or @name='lb_154']");
	By DollarCost_startdate = By.xpath("//select[@alt_id='AP_DCA_StartDate']");

	By NumberofTransfers = By.xpath("//input[@id='flda_157' or @name='flda_157']");
	By TransferFromAmount = By.xpath("//input[@id='flda_156' or @name='flda_156']");
	By TransferFromDivisionName = By.xpath("//select[@id='lb_155' or @name='lb_155']");

	// Divisions by Asset Class
	// Speciality -
	By CboeVestUSLargeCapBufferStrategiesVI = By.xpath("//input[@id='flda_163']");
	By DelawareIvyVIPAssetStrategy = By.xpath("//input[@id='flda_164']");
	By FidelityVIPHealthCare = By.xpath("//input[@id='flda_165']");
	By FidelityVIPRealEstate = By.xpath("//input[@id='flda_166']");
	By JanusHendersonGlobalTechnologyInnovation = By.xpath("//input[@id='flda_167']");
	By MMLEquityRotation = By.xpath("//input[@id='flda_168']");
	By MMLManagedVolatility = By.xpath("//input[@id='flda_169']");
	By VanguardVIFRealEstateIndex = By.xpath("//input[@id='flda_170']");

	// International/ Global
	By FidelityVIPInternationalIndex = By.xpath("//input[@id='flda_179']");
	By FidelityVIPOverseas = By.xpath("//input[@id='flda_179']");
	By InvescoVIGlobal = By.xpath("//input[@id='flda_181']");
	By InvescoOppenheimerVIInternationalGrowth = By.xpath("//input[@id='flda_182']");
	By MMLForeign = By.xpath("//input[@id='flda_183' or @name='flda_183']");
	By MMLGlobal = By.xpath("//input[@id='flda_184']");
	By MMLInternationalEquity = By.xpath("//input[@id='flda_185']");
	By MMLStrategicEmergingMarkets = By.xpath("//input[@id='flda_186' or @name='flda_186']");

	// Small/Mid Cap Growth

	By InvescoVIDiscoveryMidCapGrowth = By.xpath("//input[@id='flda_210']");
	By MMLMidCapGrowth = By.xpath("//input[@id='flda_211' or @name='flda_211']");
	By MMLSmallCapGrowthEquity = By.xpath("//input[@id='flda_212']");

	// Small/Mid Cap Blend
	By BlackRockSmallCapIndexVI = By.xpath("//input[@id='flda_171']");
	By FidelityVIPExtendedMarketIndex = By.xpath("//input[@id='flda_172' or @name='flda_172']");
	By MMLSmallCapEquity = By.xpath("//input[@id='flda_173']");
	By VanguardVIFMidCapIndex = By.xpath("//input[@id='flda_174']");

	// Small/Mid Cap Value
	By MMLMidCapValue = By.xpath("//input[@id='flda_207']");
	By MMLSmallCompanyValue = By.xpath("//input[@id='flda_208' or @name='flda_208']");
	By MMLSmallMidCapValue = By.xpath("//input[@id='flda_209']");

	// Large Cap Growth
	By MMLAmericanFundsGrowth = By.xpath("//input[@id='flda_214']");
	By MMLBlueChipGrowth = By.xpath("//input[@id='flda_215' or @name='flda_215']");
	By MMLLargeCapGrowth = By.xpath("//input[@id='flda_216']");

	// Large Cap Blend
	By FidelityVIPContrafund = By.xpath("//input[@id='flda_187']");
	By FidelityVIPTotalMarketIndex = By.xpath("//input[@id='flda_188']");
	By InvescoVIMainStreet = By.xpath("//input[@id='flda_189']");
	By MMLEquityIndex = By.xpath("//input[@id='flda_190']");
	By MMLFocusedEquity = By.xpath("//input[@id='flda_191' or @name='flda_191']");
	By MMLFundamentalEquity = By.xpath("//input[@id='flda_192']");
	By MMLSustainableEquity = By.xpath("//input[@id='flda_193']");

	// Large Cap Value
	By MMLEquity = By.xpath("//input[@id='flda_175']");
	By MMLEquityIncome = By.xpath("//input[@id='flda_176' or @name='flda_176']");
	By MMLFundamentalValue = By.xpath("//input[@id='flda_177']");
	By MMLIncomeGrowth = By.xpath("//input[@id='flda_178']");

	// Blend

	By MMLBlend = By.xpath("//input[@id='flda_194']");

	// AssetAllocation
	By MMLAggressiveAllocation = By.xpath("//input[@id='flda_159']");
	By MMLAmericanFundsCoreAllocation = By.xpath("//input[@id='flda_160']");
	By MMLBalancedAllocation = By.xpath("//input[@id='flda_195']");
	By MMLConservativeAllocation = By.xpath("//input[@id='flda_196']");
	By MMLGrowthAllocation = By.xpath("//input[@id='flda_197' or @name='flda_197']");
	By MMLiShares_60_40Allocation = By.xpath("//input[@id='flda_198']");
	By MMLiShares_80_20_Allocation = By.xpath("//input[@id='flda_161']");
	By MMLModerateAllocation = By.xpath("//input[@id='flda_162']");
	


	// FixedAllocation
	By FidelityVIPBondIndex = By.xpath("//input[@id='flda_199']");
	By FidelityVIPStrategicIncome = By.xpath("//input[@id='flda_200']");
	By InvescoVIGlobalStrategicIncome = By.xpath("//input[@id='flda_201']");
	By MMLDynamicBond = By.xpath("//input[@id='flda_202']");
	By MMLHighYield = By.xpath("//input[@id='flda_203' or @name='flda_203']");
	By MMLInflationProtectedandIncome = By.xpath("//input[@id='flda_204']");
	By MMLManagedBond = By.xpath("//input[@id='flda_205']");
	By MMLShortDurationBond = By.xpath("//input[@id='flda_206']");
	
	By MMLTotalReturnBond = By.xpath("//input[@id='flda_217']");
	By PIMCOIncome = By.xpath("//input[@id='flda_218']");
	By VanguardVIFGlobalBondIndex = By.xpath("//input[@id='flda_219']");
	
	


	By portfolioheading = By.xpath("//strong[contains(text(),'Portfolio Rebalancing Information')]");
	
	By DollarCostAveragingInformationHeading = By.xpath("//strong[contains(text(),'Dollar Cost Averaging Information')]");
	
	// Money Market
	By MMLUSGovernmentMoneyMarketFund = By.xpath("//input[@id='flda_213']");
	
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	
	public void AllocationContinous_directedMonthly(String ALPC_dollarCost_Frequency,String ALPC_dollarCost_startdate,String ALPC_numberofTransfers, String ALPC_transferFromAmount,String ALPC_transferFromDivisionName,
			String ALPC_cboeVestUSLargeCapBufferStrategiesVI,String ALPC_delawareIvyVIPAssetStrategy,String ALPC_fidelityVIPHealthCare,String ALPC_fidelityVIPRealEstate,String ALPC_janusHendersonGlobalTechnologyInnovation,String ALPC_mMLEquityRotation,String ALPC_mMLManagedVolatility,
			String ALPC_vanguardVIFRealEstateIndex,String ALPC_fidelityVIPInternationalIndex,String ALPC_fidelityVIPOverseas,String ALPC_invescoVIGlobal,String ALPC_invescoOppenheimerVIInternationalGrowth,String ALPC_mMLForeign,String ALPC_mMLGlobal,String ALPC_mMLInternationalEquity,String ALPC_mMLStrategicEmergingMarkets,
			String ALPC_invescoVIDiscoveryMidCapGrowth,String ALPC_mMLMidCapGrowth,String ALPC_mMLSmallCapGrowthEquity,String ALPC_blackRockSmallCapIndexVI,String ALPC_fidelityVIPExtendedMarketIndex,String ALPC_mMLSmallCapEquity,String ALPC_vanguardVIFMidCapIndex,String ALPC_mMLMidCapValue,String ALPC_mMLSmallCompanyValue,
			String ALPC_mMLSmallMidCapValue,String ALPC_mMLAmericanFundsGrowth,String ALPC_mMLBlueChipGrowth,String ALPC_mMLLargeCapGrowth,String ALPC_fidelityVIPContrafund,String ALPC_fidelityVIPTotalMarketIndex,String ALPC_invescoVIMainStreet,String ALPC_mMLEquityIndex,String ALPC_mMLFocusedEquity,String ALPC_mMLFundamentalEquity,
			String ALPC_mMLSustainableEquity,String ALPC_mMLEquity,String ALPC_mMLEquityIncome,String ALPC_mMLIncomeGrowth,String ALPC_mMLFundamentalValue,String ALPC_mMLBlend,String ALPC_mMLAggressiveAllocation,String ALPC_mMLAmericanFundsCoreAllocation,String ALPC_mMLBalancedAllocation,String ALPC_mMLConservativeAllocation,
			String ALPC_mMLGrowthAllocation,String ALPC_mMLiShares_60_40Allocation,String ALPC_mMLiShares_80_20_Allocation,String ALPC_mMLModerateAllocation,String ALPC_fidelityVIPBondIndex,String ALPC_fidelityVIPStrategicIncome,String ALPC_invescoVIGlobalStrategicIncome,String ALPC_mMLDynamicBond,String ALPC_mMLHighYield,
			String ALPC_mMLInflationProtectedandIncome,String ALPC_mMLManagedBond,String ALPC_mMLShortDurationBond,String ALPC_mMLTotalReturnBond,String ALPC_pIMCOIncome,String ALPC_vanguardVIFGlobalBondIndex, String ALPC_mMLUSGovernmentMoneyMarketFund) {
		
		
		if($(Heading).isDisplayed()){
	
			
			
			if($(DollarCostAveragingInformationHeading).isDisplayed()){
				
				$(DollarCost_Frequency).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ALPC_dollarCost_Frequency);
				$(DollarCost_startdate).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ALPC_dollarCost_startdate);
				/*$(CancellationDate_Month).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(cancellationDate_Month);
				$(CancellationDate_Month).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(cancellationDate_Month);
				$(CancellationDate_Year).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + cancellationDate_Year);*/
				$(NumberofTransfers).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_numberofTransfers);
				$(TransferFromAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_transferFromAmount);
				$(TransferFromDivisionName).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ALPC_transferFromDivisionName);
				
				
				//Specialty
				if($(CboeVestUSLargeCapBufferStrategiesVI).isDisplayed()){
					$(CboeVestUSLargeCapBufferStrategiesVI).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_cboeVestUSLargeCapBufferStrategiesVI);
				}
				
				$(DelawareIvyVIPAssetStrategy).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_delawareIvyVIPAssetStrategy);
				$(FidelityVIPHealthCare).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPHealthCare);
				$(FidelityVIPRealEstate).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPRealEstate);
				$(JanusHendersonGlobalTechnologyInnovation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_janusHendersonGlobalTechnologyInnovation);
				$(MMLEquityRotation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLEquityRotation);
				$(MMLManagedVolatility).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLManagedVolatility);
				$(VanguardVIFRealEstateIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_vanguardVIFRealEstateIndex);
			
				
				$(FidelityVIPInternationalIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPInternationalIndex);
				$(FidelityVIPOverseas).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPOverseas);
				$(InvescoVIGlobal).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_invescoVIGlobal);
				$(InvescoOppenheimerVIInternationalGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_invescoOppenheimerVIInternationalGrowth);
				$(MMLForeign).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLForeign);
				$(MMLGlobal).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLGlobal);
				$(MMLInternationalEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLInternationalEquity);
				$(MMLStrategicEmergingMarkets).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLStrategicEmergingMarkets);

				
				//Small/Mid Cap Growth
				$(InvescoVIDiscoveryMidCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_invescoVIDiscoveryMidCapGrowth);
				$(MMLMidCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLMidCapGrowth);
				$(MMLSmallCapGrowthEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLSmallCapGrowthEquity);
				//
				//Small/Mid Cap Blend
				$(BlackRockSmallCapIndexVI).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_blackRockSmallCapIndexVI);
				$(FidelityVIPExtendedMarketIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPExtendedMarketIndex);
				$(MMLSmallCapEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLSmallCapEquity);
				$(VanguardVIFMidCapIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_vanguardVIFMidCapIndex);
				// 
				//Small/Mid Cap Value
				$(MMLMidCapValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLMidCapValue);
				$(MMLSmallCompanyValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLSmallCompanyValue);
				$(MMLSmallMidCapValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLSmallMidCapValue);
				
				//Large Cap Growth
				$(MMLAmericanFundsGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLAmericanFundsGrowth);
				$(MMLBlueChipGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLBlueChipGrowth);
				$(MMLLargeCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLLargeCapGrowth);
				//
				//Large Cap Blend
				$(FidelityVIPContrafund).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPContrafund);
				$(FidelityVIPTotalMarketIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPTotalMarketIndex);
				$(InvescoVIMainStreet).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_invescoVIMainStreet);
				$(MMLEquityIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLEquityIndex);
				$(MMLFocusedEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLFocusedEquity);
				$(MMLFundamentalEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLFundamentalEquity);
				$(MMLSustainableEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLSustainableEquity);
				
				//Large Cap Value
				$(MMLEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLEquity);
				$(MMLEquityIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLEquityIncome);
				$(MMLFundamentalValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLFundamentalValue);
				$(MMLIncomeGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLIncomeGrowth);
				//Blend
				$(MMLBlend).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLBlend);
				
				//AssetAllocation
				$(MMLAggressiveAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLAggressiveAllocation);
				$(MMLAmericanFundsCoreAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLAmericanFundsCoreAllocation);
				$(MMLBalancedAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLBalancedAllocation);
				$(MMLConservativeAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLConservativeAllocation);
				$(MMLGrowthAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLGrowthAllocation);
				$(MMLiShares_60_40Allocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLiShares_60_40Allocation);
				$(MMLiShares_80_20_Allocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLiShares_80_20_Allocation);
				$(MMLModerateAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLModerateAllocation);
			
				
				//FixedIcome
				$(FidelityVIPBondIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPBondIndex);
				$(FidelityVIPStrategicIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_fidelityVIPStrategicIncome);
				$(InvescoVIGlobalStrategicIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_invescoVIGlobalStrategicIncome);
				$(MMLDynamicBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLDynamicBond);
				$(MMLHighYield).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLHighYield);
				$(MMLInflationProtectedandIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLInflationProtectedandIncome);
				$(MMLManagedBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLManagedBond);
				$(MMLShortDurationBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLShortDurationBond);
				$(MMLTotalReturnBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLTotalReturnBond);
				$(PIMCOIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_pIMCOIncome);
				$(VanguardVIFGlobalBondIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_vanguardVIFGlobalBondIndex);
				//Money Market
				$(MMLUSGovernmentMoneyMarketFund).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ALPC_mMLUSGovernmentMoneyMarketFund);
				
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
