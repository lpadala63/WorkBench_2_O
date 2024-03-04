package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class AllocationProgram extends GlobalCap {
	By Heading = By.xpath("//h1[contains(text(),'Allocation Programs')]");
	By StartDate_Month = By.xpath("//select[@id='lb_328' or @name='lb_328']");
	By StartDate_Year = By.xpath("//input[@id='flda_355' or @name='flda_355']");
	
	By CancellationDate_Month = By.xpath("//select[@id='lb_340' or @name='lb_340']");
	By CancellationDate_Year = By.xpath("//input[@id='flda_356' or @name='flda_356']");
	
	By InvestmentOption = By.xpath("//select[@id='lb_327']");
	By CBoeVest = By.xpath("//input[@id='flda_224']");
	
	//directed monthly end
	
	By Protofolio_Frequency = By.xpath("//select[@id='lb_326' or @name='lb_326']");
	By Protofolio_Startdate = By.xpath("//select[@id='lb_325' or @name='lb_325']");
	
	//specialty
	By CboeVestUSLargeCapBufferStrategiesVI = By.xpath("//input[@id='flda_224']");
	By DelawareIvyVIPAssetStrategy = By.xpath("//input[@id='flda_224']");
	By FidelityVIPHealthCare = By.xpath("//input[@id='flda_224']");
	By FidelityVIPRealEstate = By.xpath("//input[@id='flda_224']");
	By JanusHendersonGlobalTechnologyInnovation = By.xpath("//input[@id='flda_224']");
	By MMLEquityRotation = By.xpath("//input[@id='flda_224']");
	By MMLManagedVolatility = By.xpath("//input[@id='flda_224']");
	By VanguardVIFRealEstateIndex = By.xpath("//input[@id='flda_224']");
	
	
	// International/ Global
	By FidelityVIPInternationalIndex = By.xpath("//input[@id='flda_263']");
	By FidelityVIPOverseas = By.xpath("//input[@id='flda_265']");
	By InvescoVIGlobal = By.xpath("//input[@id='flda_267']");
	By InvescoOppenheimerVIInternationalGrowth = By.xpath("//input[@id='flda_269']");
	By MMLForeign = By.xpath("//input[@id='flda_271' or @name='flda_271']");
	By MMLGlobal = By.xpath("//input[@id='flda_273']");
	By MMLInternationalEquity = By.xpath("//input[@id='flda_275']");
	By MMLStrategicEmergingMarkets = By.xpath("//input[@id='flda_277' or @name='flda_277']");

	//Small/Mid Cap Growth
	
	By InvescoVIDiscoveryMidCapGrowth = By.xpath("//input[@id='flda_201']");
	By MMLMidCapGrowth = By.xpath("//input[@id='flda_204' or @name='flda_204']");
	By MMLSmallCapGrowthEquity = By.xpath("//input[@id='flda_205']");
	
	//Small/Mid Cap Blend
	By BlackRockSmallCapIndexVI = By.xpath("//input[@id='flda_295']");
	By FidelityVIPExtendedMarketIndex = By.xpath("//input[@id='flda_297' or @name='flda_297']");
	By MMLSmallCapEquity = By.xpath("//input[@id='flda_303']");
	By VanguardVIFMidCapIndex = By.xpath("//input[@id='flda_199']");
	
	//Small/Mid Cap Value
	By MMLMidCapValue = By.xpath("//input[@id='flda_208']");
	By MMLSmallCompanyValue = By.xpath("//input[@id='flda_209' or @name='flda_209']");
	By MMLSmallMidCapValue = By.xpath("//input[@id='flda_212']");
		
	//Large Cap Growth
	By MMLAmericanFundsGrowth = By.xpath("//input[@id='flda_309']");
	By MMLBlueChipGrowth = By.xpath("//input[@id='flda_311' or @name='flda_311']");
	By MMLLargeCapGrowth = By.xpath("//input[@id='flda_317']");

	
	//Large Cap Blend
	By FidelityVIPContrafund = By.xpath("//input[@id='flda_279']");
	By FidelityVIPTotalMarketIndex = By.xpath("//input[@id='flda_281']");
	By InvescoVIMainStreet = By.xpath("//input[@id='flda_283']");
	By MMLEquityIndex = By.xpath("//input[@id='flda_307']");
	By MMLFocusedEquity = By.xpath("//input[@id='flda_285' or @name='flda_285']");
	By MMLFundamentalEquity = By.xpath("//input[@id='flda_287']");
	By MMLSustainableEquity = By.xpath("//input[@id='flda_289']");
	
		
	//Large Cap Value
	By MMLEquity = By.xpath("//input[@id='flda_291']");
	By MMLEquityIncome = By.xpath("//input[@id='flda_293' or @name='flda_293']");
	By MMLFundamentalValue = By.xpath("//input[@id='flda_299']");
	By MMLIncomeGrowth = By.xpath("//input[@id='flda_301']");
	
	//Blend
	
	By MMLBlend = By.xpath("//input[@id='flda_245']");
	
	//AssetAllocation
	By MMLAggressiveAllocation = By.xpath("//input[@id='flda_229']");
	By MMLAmericanFundsCoreAllocation = By.xpath("//input[@id='flda_231']");
	By MMLBalancedAllocation = By.xpath("//input[@id='flda_233']");
	By MMLConservativeAllocation = By.xpath("//input[@id='flda_235']");
	By MMLGrowthAllocation = By.xpath("//input[@id='flda_237' or @name='flda_237']");
	By MMLiShares_60_40Allocation = By.xpath("//input[@id='flda_239']");
	By MMLiShares_80_20_Allocation = By.xpath("//input[@id='flda_241']");
	By MMLModerateAllocation = By.xpath("//input[@id='flda_243']");
	By MMLTotalReturnBond = By.xpath("//input[@id='flda_259']");
	By PIMCOIncome = By.xpath("//input[@id='flda_261']");
	By VanguardVIFGlobalBondIndex = By.xpath("//input[@id='flda_313']");
	
	//AssetAllocation
	By FidelityVIPBondIndex = By.xpath("//input[@id='flda_247']");
	By FidelityVIPStrategicIncome = By.xpath("//input[@id='flda_249']");
	By InvescoVIGlobalStrategicIncome = By.xpath("//input[@id='flda_251']");
	By MMLDynamicBond = By.xpath("//input[@id='flda_253']");
	By MMLHighYield = By.xpath("//input[@id='flda_305' or @name='flda_305']");
	By MMLInflationProtectedandIncome = By.xpath("//input[@id='flda_315']");
	By MMLManagedBond = By.xpath("//input[@id='flda_255']");
	By MMLShortDurationBond = By.xpath("//input[@id='flda_257']");

	By portfolioheading = By.xpath("//strong[contains(text(),'Portfolio Rebalancing Information')]");
	//Money Market
	By MMLUSGovernmentMoneyMarketFund = By.xpath("//input[@id='flda_319']");
	
	By ReceiveAnEmail_Yes = By.xpath("//input[@id='rdo_335_1']");
	By ReceiveAnEmail_No = By.xpath("//input[@id='rdo_335_2']");
	
	By Next=By.xpath("//button[contains(text(),'Next')]");
	public void Allocation_directedMonthly(String ReceiveAnEmail,String startDate_Month,String startDate_Year,String cancellationDate_Month,String cancellationDate_Year,String investmentOption,String Cboe,String protofolio_Frequency,String protofolio_Startdate,
			String cboeVestUSLargeCapBufferStrategiesVI,String delawareIvyVIPAssetStrategy,String fidelityVIPHealthCare,String fidelityVIPRealEstate,String janusHendersonGlobalTechnologyInnovation,String mMLEquityRotation,String mMLManagedVolatility,
			String vanguardVIFRealEstateIndex,String fidelityVIPInternationalIndex,String fidelityVIPOverseas,String invescoVIGlobal,String invescoOppenheimerVIInternationalGrowth,String mMLForeign,String mMLGlobal,String mMLInternationalEquity,String mMLStrategicEmergingMarkets,
			String invescoVIDiscoveryMidCapGrowth,String mMLMidCapGrowth,String mMLSmallCapGrowthEquity,String blackRockSmallCapIndexVI,String fidelityVIPExtendedMarketIndex,String mMLSmallCapEquity,String vanguardVIFMidCapIndex,String mMLMidCapValue,String mMLSmallCompanyValue,
			String mMLSmallMidCapValue,String mMLAmericanFundsGrowth,String mMLBlueChipGrowth,String mMLLargeCapGrowth,String fidelityVIPContrafund,String fidelityVIPTotalMarketIndex,String invescoVIMainStreet,String mMLEquityIndex,String mMLFocusedEquity,String mMLFundamentalEquity,
			String mMLSustainableEquity,String mMLEquity,String mMLEquityIncome,String mMLIncomeGrowth,String mMLFundamentalValue,String mMLBlend,String mMLAggressiveAllocation,String mMLAmericanFundsCoreAllocation,String mMLBalancedAllocation,String mMLConservativeAllocation,
			String mMLGrowthAllocation,String mMLiShares_60_40Allocation,String mMLiShares_80_20_Allocation,String mMLModerateAllocation,String mMLTotalReturnBond,String pIMCOIncome,String vanguardVIFGlobalBondIndex,String fidelityVIPBondIndex,String fidelityVIPStrategicIncome,
			String invescoVIGlobalStrategicIncome,String mMLDynamicBond,String mMLHighYield,String mMLInflationProtectedandIncome,String mMLManagedBond,String mMLShortDurationBond,String mMLUSGovernmentMoneyMarketFund) {
		if($(Heading).isDisplayed()){
			if($(ReceiveAnEmail_Yes).isDisplayed()){
				GlobalCap.selectRadioYesorNo(ReceiveAnEmail_Yes, ReceiveAnEmail_Yes, ReceiveAnEmail);
			}
			
			$(StartDate_Month).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(startDate_Month);
			$(StartDate_Year).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + startDate_Year);
			$(CancellationDate_Month).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(cancellationDate_Month);
			$(CancellationDate_Year).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + cancellationDate_Year);
			$(InvestmentOption).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(investmentOption);
			if($(CBoeVest).isDisplayed()){
				$(CBoeVest).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cboe);
			}
			
			if($(portfolioheading).isDisplayed()){
				//portfolio
				$(Protofolio_Frequency).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(protofolio_Frequency);
				$(Protofolio_Startdate).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(protofolio_Startdate);
				//Specialty
				
				
				$(CboeVestUSLargeCapBufferStrategiesVI).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(cboeVestUSLargeCapBufferStrategiesVI);
				$(DelawareIvyVIPAssetStrategy).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(delawareIvyVIPAssetStrategy);
				$(FidelityVIPHealthCare).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPHealthCare);
				$(FidelityVIPRealEstate).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPRealEstate);
				$(JanusHendersonGlobalTechnologyInnovation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(janusHendersonGlobalTechnologyInnovation);
				$(MMLEquityRotation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLEquityRotation);
				$(MMLManagedVolatility).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLManagedVolatility);
				$(VanguardVIFRealEstateIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(vanguardVIFRealEstateIndex);
			
				
				$(FidelityVIPInternationalIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPInternationalIndex);
				$(FidelityVIPOverseas).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPOverseas);
				$(InvescoVIGlobal).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(invescoVIGlobal);
				$(InvescoOppenheimerVIInternationalGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(invescoOppenheimerVIInternationalGrowth);
				$(MMLForeign).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLForeign);
				$(MMLGlobal).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLGlobal);
				$(MMLInternationalEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLInternationalEquity);
				$(MMLStrategicEmergingMarkets).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLStrategicEmergingMarkets);

				
				//Small/Mid Cap Growth
				$(InvescoVIDiscoveryMidCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(invescoVIDiscoveryMidCapGrowth);
				$(MMLMidCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLMidCapGrowth);
				$(MMLSmallCapGrowthEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLSmallCapGrowthEquity);
				//
				//Small/Mid Cap Blend
				$(BlackRockSmallCapIndexVI).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(blackRockSmallCapIndexVI);
				$(FidelityVIPExtendedMarketIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPExtendedMarketIndex);
				$(MMLSmallCapEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLSmallCapEquity);
				$(VanguardVIFMidCapIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(vanguardVIFMidCapIndex);
				// 
				//Small/Mid Cap Value
				$(MMLMidCapValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLMidCapValue);
				$(MMLSmallCompanyValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLSmallCompanyValue);
				$(MMLSmallMidCapValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLSmallMidCapValue);
				
				//Large Cap Growth
				$(MMLAmericanFundsGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLAmericanFundsGrowth);
				$(MMLBlueChipGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLBlueChipGrowth);
				$(MMLLargeCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLLargeCapGrowth);
				//
				//Large Cap Blend
				$(FidelityVIPContrafund).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPContrafund);
				$(FidelityVIPTotalMarketIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPTotalMarketIndex);
				$(InvescoVIMainStreet).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(invescoVIMainStreet);
				$(MMLEquityIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLEquityIndex);
				$(MMLFocusedEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLFocusedEquity);
				$(MMLFundamentalEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLFundamentalEquity);
				$(MMLSustainableEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLSustainableEquity);
				
				//Large Cap Value
				$(MMLEquity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLEquity);
				$(MMLEquityIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLEquityIncome);
				$(MMLFundamentalValue).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLFundamentalValue);
				$(MMLIncomeGrowth).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLIncomeGrowth);
				//Blend
				$(MMLBlend).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLBlend);
				
				//AssetAllocation
				$(MMLAggressiveAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLAggressiveAllocation);
				$(MMLAmericanFundsCoreAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLAmericanFundsCoreAllocation);
				$(MMLBalancedAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLBalancedAllocation);
				$(MMLConservativeAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLConservativeAllocation);
				$(MMLGrowthAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLGrowthAllocation);
				$(MMLiShares_60_40Allocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLiShares_60_40Allocation);
				$(MMLiShares_80_20_Allocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLiShares_80_20_Allocation);
				$(MMLModerateAllocation).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLModerateAllocation);
				$(MMLTotalReturnBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLTotalReturnBond);
				$(PIMCOIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(pIMCOIncome);
				$(VanguardVIFGlobalBondIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(vanguardVIFGlobalBondIndex);
				
				//FixedIcome
				$(FidelityVIPBondIndex).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPBondIndex);
				$(FidelityVIPStrategicIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fidelityVIPStrategicIncome);
				$(InvescoVIGlobalStrategicIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(invescoVIGlobalStrategicIncome);
				$(MMLDynamicBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLDynamicBond);
				$(MMLHighYield).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLHighYield);
				$(MMLInflationProtectedandIncome).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLInflationProtectedandIncome);
				$(MMLManagedBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLManagedBond);
				$(MMLShortDurationBond).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLShortDurationBond);
				//Money Market
				$(MMLUSGovernmentMoneyMarketFund).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mMLUSGovernmentMoneyMarketFund);
				
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();	
		}
	}

}
