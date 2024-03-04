package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class PremiumAllocation {
	By MMLAggressiveAllocation = By.xpath("//input[@id='flda_6']");
	By MMLGrowthAllocation = By.xpath("//input[@id='flda_17' or @name='flda_17']");
	By MMLAmericanFundsCoreAllocation = By.xpath("//input[@id='flda_11']");
	By MMLiSharesAllocation = By.xpath("//input[@id='flda_19']");
	By MMLBalancedAllocation = By.xpath("//input[@id='flda_13']");
	By MMLiShares80_20llocation = By.xpath("//input[@id='flda_21']");
	By MMLConservativeAllocation = By.xpath("//input[@id='flda_15']");
	By MMLModerateAllocation = By.xpath("//input[@id='flda_23' or @name='flda_23']");
	By MMLBlend = By.xpath("//input[@id='flda_26' or @name='flda_26']");
	
	//fixed income
	By FidelityVIPBondIndex = By.xpath("//input[@id='flda_29']");
	By MMLManagedBond = By.xpath("//input[@id='flda_37' or @name='flda_37']");
	By FidelityVIPStrategicIncome = By.xpath("//input[@id='flda_31']");
	By MMLShortDurationBond = By.xpath("//input[@id='flda_39']");
	By InvescoVIGlobalStrategicIncome = By.xpath("//input[@id='flda_33']");
	By MMLTotalReturnBond = By.xpath("//input[@id='flda_41']");
	By MMLDynamicBond = By.xpath("//input[@id='flda_35']");
	By PIMCOIncome = By.xpath("//input[@id='flda_43' or @name='flda_43']");
	By MMLHighYield = By.xpath("//input[@id='flda_122' or @name='flda_122']");
	By VanguardVIFGlobalBondIndex = By.xpath("//input[@id='flda_130' or @name='flda_130']");
	By MMLInflationProtectedandIncome = By.xpath("//input[@id='flda_132' or @name='flda_132']");
	
	//International/ Global
	By FidelityVIPInternationalIndex = By.xpath("//input[@id='flda_45']");
	By MMLForeign = By.xpath("//input[@id='flda_53' or @name='flda_53']");
	By FidelityVIPOverseas = By.xpath("//input[@id='flda_47']");
	By MMLGlobal = By.xpath("//input[@id='flda_55']");
	By InvescoVIGlobal = By.xpath("//input[@id='flda_49']");
	By MMLInternationalEquity = By.xpath("//input[@id='flda_57']");
	By InvescoOppenheimerVIInternationalGrowth = By.xpath("//input[@id='flda_51']");
	By MMLStrategicEmergingMarkets = By.xpath("//input[@id='flda_59' or @name='flda_59']");
	
	
	//Large Cap Blend
	By FidelityVIPContrafund = By.xpath("//input[@id='flda_63']");
	By MMLFocusedEquity = By.xpath("//input[@id='flda_70' or @name='flda_70']");
	By FidelityVIPTotalMarketIndex = By.xpath("//input[@id='flda_65']");
	By MMLFundamentalEquity = By.xpath("//input[@id='flda_72']");
	By InvescoVIMainStreet = By.xpath("//input[@id='flda_67']");
	By MMLSustainableEquity = By.xpath("//input[@id='flda_74']");
	By MMLEquityIndex = By.xpath("//input[@id='flda_124']");
	
	
	//Large Cap Growth
	By MMLAmericanFundsGrowth = By.xpath("//input[@id='flda_126']");
	By MMLBlueChipGrowth = By.xpath("//input[@id='flda_128' or @name='flda_128']");
	By MMLLargeCapGrowth = By.xpath("//input[@id='flda_134']");
	

	//Large Cap Value
	By MMLEquity = By.xpath("//input[@id='flda_106']");
	By MMLEquityIncome = By.xpath("//input[@id='flda_108' or @name='flda_108']");
	By MMLFundamentalValue = By.xpath("//input[@id='flda_114']");
	By MMLIncomeGrowth = By.xpath("//input[@id='flda_116']");
	
	//Money Market
	By MMLUSGovernmentMoneyMarketFund = By.xpath("//input[@id='flda_136']");
	
	//Small/Mid Cap Blend
	By BlackRockSmallCapIndexVI = By.xpath("//input[@id='flda_110']");
	By FidelityVIPExtendedMarketIndex = By.xpath("//input[@id='flda_112' or @name='flda_112']");
	By MMLSmallCapEquity = By.xpath("//input[@id='flda_118']");
	By VanguardVIFMidCapIndex = By.xpath("//input[@id='flda_120']");
	
	
	//Small/Mid Cap Growth
	
	By InvescoVIDiscoveryMidCapGrowth = By.xpath("//input[@id='flda_90']");
	By MMLMidCapGrowth = By.xpath("//input[@id='flda_92' or @name='flda_92']");
	By MMLSmallCapGrowthEquity = By.xpath("//input[@id='flda_98']");
	
	//Small/Mid Cap Value
	By MMLMidCapValue = By.xpath("//input[@id='flda_94']");
	By MMLSmallCompanyValue = By.xpath("//input[@id='flda_100' or @name='flda_100']");
	By MMLSmallMidCapValue = By.xpath("//input[@id='flda_102']");
	
	//Speciality
	By CboeVestUSLargeCapBufferStrategiesVI = By.xpath("//input[@id='flda_96']");
	By JanusHendersonGlobalTechnologyandInnovation = By.xpath("//input[@id='flda_104' or @name='flda_104']");
	By DelawareIvyVIPAssetStrategy = By.xpath("//input[@id='flda_76']");
	By MMLEquityRotation = By.xpath("//input[@id='flda_84']");
	By FidelityVIPHealthCare = By.xpath("//input[@id='flda_78']");
	By MMLManagedVolatility = By.xpath("//input[@id='flda_86']");
	By FidelityVIPRealEstate = By.xpath("//input[@id='flda_80']");
	By VanguardVIFRealEstateIndex = By.xpath("//input[@id='flda_88' or @name='flda_88']");
	By GuaranteedPrincipalAccount = By.xpath("//input[@id='flda_82' or @name='flda_82']");
	
	
	By Wouldyouliketoelect = By.xpath("//select[@id='lb_4']");
	By deductMonthlyCharges_Yes = By.xpath("//input[@id='rdo_2_1' or @name='rdo_2_1']");
	By deductmonthlyCharges_No = By.xpath("//input[@id='rdo_2_2' or @name='rdo_2_2']");
	By Next=By.xpath("//button[contains(text(),'Next')]");
	By PremiumallocationscreeHeading = By.xpath("//h1[contains(text(),'Premium Allocation Screen')]");
	
	
	public void InvestmentOption(String AggressiveAllocation,String GrowthAllocation,String AmericanFundsCoreAllocation,String iSharesAllocation,String BalancedAllocation,String iShares80_20llocation,String ConservativeAllocation,
			String ModerateAllocation,String Blend,String FidelityVIPbondIndex,String ManagedBond,String ShortDurationBond,String InvescoVIGlobalstrategicincome,String TotalReturnBond,String DynamicBond,String PimCOIncome,String HighYield,
			String VanguardVIFGlobalbondindex,String InflationProtectedandIncome,String fidelityViPInternationalIndex,String Foreign,String FidelityVipOverseas,String Global,String InvescoViGlobal,String InternationalEquity,
			String InvescoOppenheimerViInternationalGrowth,String StrategicEmergingMarkets,String FidelityViPContrafund,String FocusedEquity,String FidelityViPTotalMarketIndex,String FundamentalEquity,String InvescoViMainStreet,String SustainableEquity,
			String EquityIndex,String AmericanFundsGrowth,String BlueChipGrowth,String LargeCapGrowth,String Equity,String EquityIncome,String FundamentalValue,String IncomeGrowth,String  GovernmentMoneyMarketFund ){
		if($(PremiumallocationscreeHeading).isDisplayed()){
			$(MMLAggressiveAllocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AggressiveAllocation);
			$(MMLGrowthAllocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + GrowthAllocation);
			$(MMLAmericanFundsCoreAllocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AmericanFundsCoreAllocation);
			$(MMLiSharesAllocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + iSharesAllocation);
			$(MMLBalancedAllocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + BalancedAllocation);
			$(MMLiShares80_20llocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + iShares80_20llocation);
			$(MMLConservativeAllocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + ConservativeAllocation);
			$(MMLModerateAllocation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + ModerateAllocation);
			$(MMLBlend).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Blend);
			
			
			//fixed income
			$(FidelityVIPBondIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FidelityVIPbondIndex);
			$(MMLManagedBond).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + ManagedBond);
			$(MMLShortDurationBond).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + ShortDurationBond);
			$(InvescoVIGlobalStrategicIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + InvescoVIGlobalstrategicincome);
			$(MMLTotalReturnBond).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + TotalReturnBond);
			$(MMLDynamicBond).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + DynamicBond);
			$(PIMCOIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + PimCOIncome);
			$(MMLHighYield).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + HighYield);
			$(VanguardVIFGlobalBondIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + VanguardVIFGlobalbondindex);
			$(MMLInflationProtectedandIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + InflationProtectedandIncome);
			
			//International/global
			$(FidelityVIPInternationalIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + fidelityViPInternationalIndex);
			$(MMLForeign).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Foreign);
			$(FidelityVIPOverseas).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FidelityVipOverseas);
			$(MMLGlobal).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Global);
			$(InvescoVIGlobal).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + InvescoViGlobal);
			$(MMLInternationalEquity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + InternationalEquity);
			$(InvescoOppenheimerVIInternationalGrowth).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + InvescoOppenheimerViInternationalGrowth);
			$(MMLStrategicEmergingMarkets).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + StrategicEmergingMarkets);
			
			//Large Cap Blend
			$(FidelityVIPContrafund).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FidelityViPContrafund);
			$(MMLFocusedEquity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FocusedEquity);
			$(FidelityVIPTotalMarketIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FidelityViPTotalMarketIndex);
			$(MMLFundamentalEquity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FundamentalEquity);
			$(InvescoVIMainStreet).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + InvescoViMainStreet);
			$(MMLSustainableEquity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + SustainableEquity);
			$(MMLEquityIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + EquityIndex);
			
			//Large Cap Growth
			$(MMLAmericanFundsGrowth).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AmericanFundsGrowth);
			$(MMLBlueChipGrowth).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + BlueChipGrowth);
			$(MMLLargeCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + LargeCapGrowth);
			
			//Large Cap Value
			$(MMLEquity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Equity);
			$(MMLEquityIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + EquityIncome);
			$(MMLFundamentalValue).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FundamentalValue);
			$(MMLIncomeGrowth).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + IncomeGrowth);
			
			//Money Market
			$(MMLUSGovernmentMoneyMarketFund).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + GovernmentMoneyMarketFund);

		}
	}

	public void InvestionOptionTwo(String BlackrockSmallCapIndexVI,String FidelityViPExtendedMarketIndex,String SmallCapEquity,String VanguardViFMidCapIndex,String InvescoViDiscoveryMidCapGrowth,String MidCapGrowth,String SmallCapGrowthEquity,String MidCapValue,
			String SmallCompanyValue,String SmallMidCapValue,String CboeVestUsLargeCapBufferStrategiesVI,String janusHendersonGlobalTechnologyandInnovation,String DelawareIvyViPAssetStrategy,String EquityRotation,String FidelityViPHealthCare,String ManagedVolatility,
			String FidelityViPRealEstate,String VanguardViFRealEstateIndex,String GuarantedPrincipalAccount,String WouldyouLiketoelect,String deductMonthlyCharges ) {
		
		if ($(PremiumallocationscreeHeading).isDisplayed()) {
			//Small/Mid Cap Blend
			$(BlackRockSmallCapIndexVI).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + BlackrockSmallCapIndexVI);
			$(FidelityVIPExtendedMarketIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FidelityViPExtendedMarketIndex);
			$(MMLSmallCapEquity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + SmallCapEquity);
			$(VanguardVIFMidCapIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + VanguardViFMidCapIndex);
			
			//Small/Mid Cap Growth
			$(InvescoVIDiscoveryMidCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + InvescoViDiscoveryMidCapGrowth);
			$(MMLMidCapGrowth).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + MidCapGrowth);
			$(MMLSmallCapGrowthEquity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + SmallCapGrowthEquity);
			
			//Small/Mid Cap Value
			$(MMLMidCapValue).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + MidCapValue);
			$(MMLSmallCompanyValue).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + SmallCompanyValue);
			$(MMLSmallMidCapValue).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + SmallMidCapValue);
			
			//Speciality
			if($(CboeVestUSLargeCapBufferStrategiesVI).isDisplayed()){
				$(CboeVestUSLargeCapBufferStrategiesVI).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + CboeVestUsLargeCapBufferStrategiesVI);
			}
			
			$(JanusHendersonGlobalTechnologyandInnovation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + janusHendersonGlobalTechnologyandInnovation);
			$(DelawareIvyVIPAssetStrategy).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + DelawareIvyViPAssetStrategy);
			$(MMLEquityRotation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + EquityRotation);
			$(FidelityVIPHealthCare).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FidelityViPHealthCare);
			$(MMLManagedVolatility).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + ManagedVolatility);
			$(FidelityVIPRealEstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + FidelityViPRealEstate);
			$(VanguardVIFRealEstateIndex).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + VanguardViFRealEstateIndex);
			$(GuaranteedPrincipalAccount).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + GuarantedPrincipalAccount);
			
			$(Wouldyouliketoelect).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(WouldyouLiketoelect);
			GlobalCap.selectRadioYesorNo(deductMonthlyCharges_Yes, deductmonthlyCharges_No, deductMonthlyCharges);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			
		}
	}

}
