package pageclass;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class QualifiedPlan extends GlobalCap {
	By PolicyType = By.xpath("//input[@id='flda_21']");
	By PlanTrust_Yes = By.xpath("//input[@id='rdo_54_1']");
	By PlanTrustType = By.xpath("//select[@id='lb_44']");
	By HowLongPlanBeen = By.xpath("//input[@id='flda_62']");
	By PleaseSpecify = By.xpath("//input[@id='flda_60']");
	By PlanName = By.xpath("//input[@id='flda_64']");
	By Trustee = By.xpath("//input[@id='flda_67']");
	By TaxPayer = By.xpath("//input[@id='flda_155']");
	By TaxPayertext = By.xpath("//input[@id='flda_155_fmt']");
	By Street1 = By.xpath("//input[@id='flda_74']");
	By Street2 = By.xpath("//input[@id='flda_75']");
	By City = By.xpath("//input[@id='flda_72']");
	By State = By.xpath("//select[@id='lb_70']");
	By Zip = By.xpath("//input[@id='flda_80']");
	By Zipclick = By.xpath("//label[@id='lbl_69']");
	By Zipgettext = By.xpath("//input[@id='flda_80_fmt']");
	By DateofPlanTrust_MM = By.xpath("//div[@id='div_47']//div/span/span[1]/input[1]");
	By DateofPlanTrust_DD = By.xpath("//div[@id='div_47']//div/span/span[1]/input[2]");
	By DateofPlanTrust_YYYY = By.xpath("//div[@id='div_47']//div/span/span[1]/input[3]");
	By FullNameEmployer = By.xpath("//input[@id='flda_158']");
	By SponserStreet1 = By.xpath("//input[@id='flda_29']");
	By SponserStreet2 = By.xpath("//input[@id='flda_30']");
	By SponserCity = By.xpath("//input[@id='flda_27']");
	By SponserState = By.xpath("//select[@id='lb_25']");
	By SponserZip = By.xpath("	//input[@id='flda_35']");
	By SponZiptext = By.xpath("//input[@id='flda_35_fmt']");
	By TotalNoEmployee = By.xpath("//input[@id='flda_82']");
	By NoofEmployecoverdplan = By.xpath("//input[@id='flda_83']");
	By EIN = By.xpath("//input[@id='flda_36']");
	By ThirdParty_FullName = By.xpath("//input[@id='flda_87']");
	By ThirdParty_Street1 = By.xpath("//input[@id='flda_93']");
	By ThirdParty_Street2 = By.xpath("//input[@id='flda_94']");
	By ThirdParty_City = By.xpath("//input[@id='flda_91']");
	By ThirdParty_State = By.xpath("//select[@id='lb_89']");
	By ThirdParty_Zip = By.xpath("	//input[@id='flda_99']");
	By ThirdParty_Ziptext = By.xpath("	//input[@id='flda_99_fmt']");
	By ThirdParty_Zipclk = By.xpath("//label[@id='lbl_88']");
	By PreferredPhone = By.xpath("//input[@id='flda_101']");
	By PreferredPhonetext = By.xpath("//input[@id='flda_101_fmt']");
	By emailaddress = By.xpath("//input[@id='flda_104']");
	By Home = By.xpath("//input[@id='rdo_103_1']");
	By Work = By.xpath("//input[@id='rdo_103_2']");
	By Cell = By.xpath("//input[@id='rdo_103_3']");
	By PreferredPhoneNumclick = By.xpath("//label[text()='Preferred phone number:']");
	By Heading = By.xpath("//h1[text()='Disclosure & Acknowledgment Qualified Plan']");
	By ExistingAssets = By.xpath("//input[@id='rdo_110_1']");
	By LimitsBased = By.xpath("//input[@id='rdo_110_2']");
	By ApprxValueAssests = By.xpath("//input[@id='flda_113']");
	By AnnualPremium = By.xpath("//input[@id='flda_115']");
	By heading3 = By.xpath("//span[text()='Self-Directed Defined Contribution Plan Information']");
	By ParticipantLive_Yes = By.xpath("//input[@id='rdo_138_1']");
	By ParticipantLive_No = By.xpath("//input[@id='rdo_138_2']");
	By pleaseExpalin = By.xpath("//input[@id='flda_140']");
	By TotalAmountAggreemnt = By.xpath("//input[@id='flda_145']");
	By EmployerContribution_Yes = By.xpath("//input[@id='rdo_116_1']");
	By EmployerContribution_No = By.xpath("//input[@id='rdo_116_2']");
	By Yearone = By.xpath("//input[@id='flda_149']");
	By YearTwo = By.xpath("//input[@id='flda_147']");
	By TraditionalFunding = By.xpath("//input[@id='cb_130']");
	By FundedUnder = By.xpath("//input[@id='cb_129']");
	By CashBalance = By.xpath("//input[@id='cb_131']");
	By other = By.xpath("//input[@id='cb_132']");
	By fundedPleaseSpecify = By.xpath("//input[@id='flda_133']");
	By LimitMonthy = By.xpath("//input[@id='rdo_136_1']");
	By LimitAmountContribution = By.xpath("//input[@id='rdo_136_2']");
	//select allapply
	By UsingContract = By.xpath("//input[@id='cb_152']");
	By IncreasedTax = By.xpath("//input[@id='cb_153']");
	By ToprovideOppurtuinity = By.xpath("//input[@id='cb_154']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By Frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By IsreducedPremium_Yes=By.xpath("//input[@id='rdo_166_1']");
	By IsreducedPremium_No=By.xpath("//input[@id='rdo_166_2']");
	By ApprxValue=By.xpath("//input[@id='flda_143']");
	By PlanTrustSponsorEIN_Yes= By.xpath("//input[@name='rdo_164_1']");
	By PlanTrustSponsorEIN_No= By.xpath("//input[@name='rdo_164_2']");
	By PlanTrustSponsorEINumber= By.xpath("//input[@name='flda_155']");
	public void PolicyTrust_Plantrust(String Policytype,String PlantrustType,String pleasespecify,String Howlongplanbeen,String Planname,String trustee,String street1,String street2,
			String city,String state,String zip,String MM,String DD,String YYYY,String PlanTrustSponsorEInumber,String Qualified_PlanTrustSponsorEIN,String Qualified_TotalnoEmployee,String Qualified_NoofEmployecoverdPlan,String Qualified_ExplainBasisofEmployee ){
		if($(Heading).isDisplayed()){

			$(PolicyType).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Policytype);
			$(PlanTrust_Yes).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(PlanTrustType).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PlantrustType);
			if($(PleaseSpecify).isDisplayed()){
				$(PleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(pleasespecify);
			}
			$(HowLongPlanBeen).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Howlongplanbeen);
			$(PlanName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Planname);
			$(Trustee).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(trustee);
			$(Street1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1); 
			$(Street2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
			$(City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
			$(State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(state);
			$(Zip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + zip);	
			
			
			
			GlobalCap.selectRadioYesorNo(PlanTrustSponsorEIN_Yes, PlanTrustSponsorEIN_No, Qualified_PlanTrustSponsorEIN);
			
			
			
			$(PlanTrustSponsorEINumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME +PlanTrustSponsorEInumber);
			
			$(DateofPlanTrust_MM).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MM);
			$(DateofPlanTrust_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(DD);
			$(DateofPlanTrust_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(YYYY);
			
			$(TotalNoEmployee).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Qualified_TotalnoEmployee);
			$(NoofEmployecoverdplan).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Qualified_NoofEmployecoverdPlan);
			
			By ExplainBasisofEmployee= By.xpath("//input[@id='flda_163']");
			$(ExplainBasisofEmployee).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Qualified_ExplainBasisofEmployee);
	
		}		
	}
	public void EmployerPlanSponsor(String fullnameEmploye,String street1,String street2,
			String city,String state,String zip,String Employer_sponsor_EINNumber,String PlanSponsore_Authorized_fullname,String PlanSponsor_Authorized_lastname ){
		if($(Heading).isDisplayed()){

			$(FullNameEmployer).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(fullnameEmploye);
			$(SponserStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1); 
			$(SponserStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
			$(SponserCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
			$(SponserState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(state);
			$(SponserZip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + zip);
			
			By Employer_sponsor_EIN= By.xpath("//input[@id='flda_36']");
			
			$(Employer_sponsor_EIN).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Employer_sponsor_EINNumber);
			
			By Authorized_Fullname= By.xpath("//input[@id='flda_172']");
			$(Authorized_Fullname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PlanSponsore_Authorized_fullname);
			By Authorized_lastname= By.xpath("//input[@id='flda_173']");
			$(Authorized_lastname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PlanSponsor_Authorized_lastname);
		}
	}
	
	public void ThirdPartyAdministrationinfo(String ThirdParty_fullname,String street1,String street2,
			String city,String state,String zip,String preferredphone,String phonetype,String email){
		if($(Heading).isDisplayed()){
			$(ThirdParty_FullName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ThirdParty_fullname);
			$(ThirdParty_Street1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1); 
			$(ThirdParty_Street2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
			$(ThirdParty_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
			$(ThirdParty_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(state);
			$(ThirdParty_Zip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + zip);	
			$(PreferredPhone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + preferredphone);
			$(PreferredPhoneNumclick).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			switch (phonetype) {
			case "Home":
				$(Home).click();
				break;
			case "Work":
				$(Work).click();
				break;
			case "Cell":
				$(Cell).click();
				break;
			default:
				System.out.println("Not able to select the option");
				break;
			}
			$(emailaddress).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(email);
		}		
	}
	//,String FundedpleaseSpecify,String ParticipantLive,

	
	public void Self_DDCPlanInfo(String Whatlimitofamount, String ApproxvalueAssets, String annualpremium,
			String EmployerContribution, String FundingMethod, String LimitOFDeathBenefit, String Totalamountaggreemnt,
			String yearone, String yeartwo, String SelectAllType, String ParticipantLive, String Pleasexpalin,
			String FundedpleaseSpecify, String Self_DDC_IsReducedPremium, String Self_DDC_approxvalue) {
		if ($(Heading).isDisplayed()) {
			if ($(heading3).isDisplayed()) {
				if ($(TraditionalFunding).isDisplayed()) {
					switch (FundingMethod) {
					case "TraditionalFunding":
						$(TraditionalFunding).click();
						break;
					case "FundedUnder":
						$(FundedUnder).click();
						break;
					case "CashBalance":
						$(CashBalance).click();
						break;
					case "Other":
						$(other).click();
						$(fundedPleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15))
								.setValue(FundedpleaseSpecify);
						break;

					default:
						System.out.println("Not able to select the option");
						break;
					}
				}
				if($(IsreducedPremium_Yes).isDisplayed()){
					GlobalCap.selectRadioYesorNo(IsreducedPremium_Yes, IsreducedPremium_No, Self_DDC_IsReducedPremium);
				}
				

				if ($(LimitMonthy).isDisplayed()) {
					GlobalCap.selectRadioYesorNo(LimitMonthy, LimitAmountContribution, LimitOFDeathBenefit);
				}
				if ($(ParticipantLive_Yes).isDisplayed()) {
					GlobalCap.selectRadioYesorNo(ParticipantLive_Yes, ParticipantLive_No, ParticipantLive);
					if (ParticipantLive.equalsIgnoreCase("No")) {
						$(pleaseExpalin).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Pleasexpalin);
					}
				}
				if($(ApprxValue).isDisplayed()){
					$(ApprxValue).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Self_DDC_approxvalue);
				}
				

				if ($(TotalAmountAggreemnt).isDisplayed()) {
					$(TotalAmountAggreemnt).shouldBe(Visible.exist, Duration.ofSeconds(15))
							.setValue(Totalamountaggreemnt);
				}
				if ($(Yearone).isDisplayed()) {
					$(Yearone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(yearone);
				}
				if ($(YearTwo).isDisplayed()) {
					$(YearTwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(yeartwo);
				}

				if ($(UsingContract).isDisplayed()) {
					switch (SelectAllType) {
					case "UsingContract":
						$(UsingContract).click();
						break;
					case "IncreasedTax":
						$(IncreasedTax).click();
						break;
					case "ToprovideOppurtuinity":
						$(ToprovideOppurtuinity).click();
						break;

					default:
						System.out.println("Not able to select the option");
						break;
					}
				}

				if ($(ExistingAssets).isDisplayed()) {
					if (Whatlimitofamount.equalsIgnoreCase("ExistingAssets")) {
						$(ExistingAssets).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					} else {
						$(LimitsBased).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				}
				if ($(ApprxValueAssests).isDisplayed()) {
					$(ApprxValueAssests).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(ApproxvalueAssets);

				}
				if ($(AnnualPremium).isDisplayed()) {
					$(AnnualPremium).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(annualpremium);
				}
				if ($(EmployerContribution_Yes).isDisplayed()) {
					GlobalCap.selectRadioYesorNo(EmployerContribution_Yes, EmployerContribution_No,
							EmployerContribution);
				}
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
			}
		}
	}
}