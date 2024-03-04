package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;
import utilities.GetDataFromExcel;

public class CCOneLifeCaseSetup extends GlobalCap {
	By InsuredResidentState = By.xpath("//select[@id='lb_162' or @name='lb_162']");
	By InsuredCitizenship = By.xpath("//select[@id='lb_322' or @name='lb_322']");
	By FaceAmount = By.xpath("//input[@id='flda_18' or @name='flda_18']");
	By MMLISRegisteredRep_Yes = By.xpath("//label[text()= 'Is the writing producer a career agent/advisor with MassMutual or registered broker with MMLIS?']//following::input[1]");
	By MMLISRegisteredRep_No = By.xpath("//label[text()= 'Is the writing producer a career agent/advisor with MassMutual or registered broker with MMLIS?']//following::input[2]");
	By financialservicesrepresentative_Yes = By.xpath("//input[@id='rdo_224_1' or @name='rdo_224_1']");
	By financialservicesrepresentative_No = By.xpath("//input[@id='rdo_224_2' or @name='rdo_224_2']");
	By AccountPurchaseThisPolicy_Yes = By.xpath("//input[@id='rdo_226_1' or @name='rdo_226_1']");
	By AccountPurchaseThisPolicy_No = By.xpath("//input[@id='rdo_226_2' or @name='rdo_226_2']");
	By hardshipwithdrawal_Yes = By.xpath("//input[@id='rdo_237_1' or @name='rdo_237_1']");
	By hardshipwithdrawal_No = By.xpath("//input[@id='rdo_237_2' or @name='rdo_237_2']");
	By Retirement_paythepremiums_Yes = By.xpath("//input[@id='rdo_234_1' or @name='rdo_234_1']");
	By Retirement_paythepremiums_No = By.xpath("//input[@id='rdo_234_2' or @name='rdo_234_2']");
	By Whatistheprimarypurpose = By.xpath("//select[@id='lb_229' or @name='lb_229']");
	By SurrenderChargeAmount = By.xpath("//input[@id='flda_232' or @name='flda_232']");
	By thirdPArty_Yes = By.xpath("//label[text()='Is this policy being sold through a third party entity?']//following::input[1]");
	By thirdPArty_No = By.xpath("//label[text()='Is this policy being sold through a third party entity?']//following::input[2]");
	By proposed_insured_the_owner_Yes = By.xpath("//input[@id='rdo_20_1' or @name='rdo_20_1']");
	By proposed_insured_the_owner_No = By.xpath("//input[@id='rdo_20_2' or @name='rdo_20_2']");
	By owner_an_individualOwner = By.xpath("//label[text()='Is the proposed owner an individual or an entity?']//following::input[1]");
	By owner_an_Entity = By.xpath("//label[text()='Is the proposed owner an individual or an entity?']//following::input[2]");
	By individualOwnerownerstate = By.xpath("//label[text()='Owner Resident State']//following::Select[@id='lb_194']");
	By Entityownerstate = By.xpath("//label[text()='Owner Legal/Resident State or Trust Situs State']//following::Select[@id='lb_194']");
	By HoldIssue_Yes = By.xpath("//label[text()='Hold Issue']//following::input[1]");
	By HoldIssue_No = By.xpath("//label[text()='Hold Issue']//following::input[2]");
	By BackdateSaveAge_Yes = By.xpath("//input[@id='rdo_10_1' or @name='rdo_10_1']");
	By BackdateSaveAge_No = By.xpath("//input[@id='rdo_10_2' or @name='rdo_10_2']");
	By PolicyDating_DateOfIssue = By.xpath("//*[@id='rdo_8_1']");
	By PolicyDating_SpecificDate = By.xpath("//*[@id='rdo_8_2']");
	By SpecificDate_Month = By.xpath("//*[@id='div_6']/div/span/span[1]/input[1]");
	By SpecificDate_Day = By.xpath("//*[@id='div_6']/div/span/span[1]/input[2]");
	By SpecificDate_Year = By.xpath("//*[@id='div_6']/div/span/span[1]/input[3]");
	By submittingAgency = By.xpath("//input[@id='flda_182' or @name='flda_182']");
	By ownerstate = By.xpath("//select[@id='lb_157' or @name='lb_157']");
	By FloridaCountry=By.xpath("//select[@alt_id='CS_SignCounty']");
	By cityowner = By.xpath("//input[@id='flda_160' or @name='flda_160']");
	
	By SalesPerson_Yes = By.xpath("//input[@id='rdo_241_1' or @name='rdo_241_1']");
	By SalesPerson_No = By.xpath("//input[@id='rdo_241_2' or @name='rdo_241_2']");
	By SalesFirstName = By.xpath("//input[@id='flda_239' or @name='flda_239']");
	By SalesLastName = By.xpath("//input[@id='flda_237' or @name='flda_237']");
	
	By RestrictedFile = By.xpath("//strong[text()='Restricted File']");
	By Next = By.xpath("//button[@id='btn_24' or @name='btn_24']");
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
	By Lists= By.xpath("//select[@alt_id='AGENT_SDPFirm']");
	By Agent=By.xpath("//label[text()='Submitting Agency']");
	GetDataFromExcel testdata = new GetDataFromExcel();
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	public void EnterLifeCaseSetup(String insuredResidentState,  String faceAmount) {

		HooksTest.idriver.switchTo().frame(0);
		//$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(100));
		//HooksTest.idriver.switchTo().frame($(ciPageFrame));
		$(InsuredResidentState).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(insuredResidentState);
		$(FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(faceAmount);

	}
	public void RadioQuestionsone(String MMLCRegesterd, String financialservicesrepresentative,String purchasethispolicy,
			String hardshipwithdrawal,String Retirement_paythepremiums, String whatisthePrimarypurpose, String surrenderchargeamount,String Thirdparty ){
			selectRadioYesorNo(MMLISRegisteredRep_Yes, MMLISRegisteredRep_No, MMLCRegesterd);
			if(MMLCRegesterd.equalsIgnoreCase("Yes") ){
				selectRadioYesorNo(financialservicesrepresentative_Yes, financialservicesrepresentative_No, financialservicesrepresentative);
				if(financialservicesrepresentative.equalsIgnoreCase("Yes")){
					selectRadioYesorNo(AccountPurchaseThisPolicy_Yes, AccountPurchaseThisPolicy_No, purchasethispolicy);
					selectRadioYesorNo(hardshipwithdrawal_Yes, hardshipwithdrawal_No, hardshipwithdrawal);
					if(purchasethispolicy.equalsIgnoreCase("No") && hardshipwithdrawal.equalsIgnoreCase("No")){
						selectRadioYesorNo(Retirement_paythepremiums_Yes, Retirement_paythepremiums_No, Retirement_paythepremiums);
						$(Whatistheprimarypurpose).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(whatisthePrimarypurpose);
						if(Retirement_paythepremiums.equalsIgnoreCase("Yes")){
							$(SurrenderChargeAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(surrenderchargeamount);
						}
					}
				}
			}
			selectRadioYesorNo(thirdPArty_Yes, thirdPArty_No, Thirdparty);
	}
	public void RadioQuestionsctwo(String ProductType,String proposed_insured_the_owner,String Owner_an_individual_or_entity,String individualOwnerState,
			String EntityState,String HoldIssue,String Backdatesaveage, 
			String Policydate, String MM, String DD, String YYYY,String Agency,String firm,String FirmsDisplay, String Stateowner,String FloridaCountryname,String Cityowner,
			String SalesPerson_RD,String SalesFirstname,String SalesLastname){
		if (proposed_insured_the_owner.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(proposed_insured_the_owner_Yes, proposed_insured_the_owner_No,proposed_insured_the_owner);
		} 
		else if (proposed_insured_the_owner.equalsIgnoreCase("No")) {
			selectRadioYesorNo(proposed_insured_the_owner_Yes, proposed_insured_the_owner_No,proposed_insured_the_owner);
			if (Owner_an_individual_or_entity.equalsIgnoreCase("IndividualOwner")){
				$(owner_an_individualOwner).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				GlobalCap.sleep(1000);
			    $(individualOwnerownerstate).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(individualOwnerState);
			}
			else if (Owner_an_individual_or_entity.equalsIgnoreCase("Entity")) {
				$(owner_an_Entity).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(Entityownerstate).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(EntityState);
			}
		}
		selectRadioYesorNo(HoldIssue_Yes, HoldIssue_No, HoldIssue);
		selectRadioYesorNo(BackdateSaveAge_Yes, BackdateSaveAge_No, Backdatesaveage);
		if (ProductType.equalsIgnoreCase("CareChoice Select")) {
			if (Backdatesaveage.equalsIgnoreCase("No")) {
				// Yes = DateOfIssue , No=specficdate
				selectRadioYesorNo(PolicyDating_DateOfIssue, PolicyDating_SpecificDate, Policydate);
				if (Policydate.equalsIgnoreCase("No")) {
					$(SpecificDate_Month).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MM);
					$(SpecificDate_Day).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MM);
					$(SpecificDate_Year).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(YYYY);
				}
			}
		}
		$(submittingAgency).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Agency);
		$(Agent).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(1500);
		if (FirmsDisplay.equalsIgnoreCase("Yes")) {
			if ($(Lists).isDisplayed()) {
				List<WebElement> FirmList = HooksTest.idriver
						.findElements(By.xpath("//select[@alt_id='AGENT_SDPFirm']//following-sibling::option"));
				System.out.println(FirmList.size());
				System.out.println("agency is " + Agency);
				for (int i = 0; i <= FirmList.size() - 1; i++) {
					String list = FirmList.get(i).getText();
					System.out.println(list);
				}
			}
		}
		if ($(Lists).isDisplayed()) {
			$(Lists).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(firm);
		}
		GlobalCap.sleep(6000);
		$(ownerstate).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Stateowner);
		GlobalCap.sleep(6000);
		if ($(FloridaCountry).isDisplayed()) {
			$(FloridaCountry).shouldBe(Visible.exist, Duration.ofSeconds(30))
					.selectOptionContainingText(FloridaCountryname);
		}
		$(cityowner).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cityowner);
		$(RestrictedFile).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		if($(SalesPerson_Yes).isDisplayed()){
			selectRadioYesorNo(SalesPerson_Yes, SalesPerson_No, SalesPerson_RD);
			if(SalesPerson_RD.equalsIgnoreCase("Yes")){
				$(SalesFirstName).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(SalesFirstname);
				$(SalesLastName).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(SalesLastname);
			}
		}
		GlobalCap.sleep(5000);
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(100)).click();		
	}
}