package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class DI_BOE_ProductInformation {

	By BOE_DisabilityPrdInfo_Qtn=By.xpath("//label[@id='lbl_9']");
	By PolicyOwnerYes = By.xpath("//input[@id='rdo_8_1' or @name='rdo_8_1']");
	By PolicyOwnerNo = By.xpath("//input[@id='rdo_8_2' or @name='rdo_8_2']");
	By PolicyOwnerBusiness = By.xpath("//input[@id='rdo_6_1' or @name='rdo_6_1']");
	By PolicyOwnerOther = By.xpath("//input[@id='rdo_6_2' or @name='rdo_6_2']");
	By TaxPayerINum = By.xpath("//input[@id='flda_82' or @name='flda_82']");
	By OwnerIndividual = By.xpath("//input[@id='rdo_4_1' or @name='rdo_4_1']");
	By OwnerEntitiy = By.xpath("//input[@id='rdo_4_2' or @name='rdo_4_2']");
	By RecipientOfBeneOwnerYes = By.xpath("//input[@id='rdo_23_1' or @name='rdo_23_1']");
	By RecipientOfBeneOwnerNo = By.xpath("//input[@id='rdo_23_2' or @name='rdo_23_2']");
	By Rent = By.xpath("//input[@id='flda_152' or @name='flda_152']");
	By ProposedInsuredPercentage = By.xpath("//input[@id='flda_150' or @name='flda_150']");
	By RecBenefitInd = By.xpath("//input[@id='rdo_78_1' or @name='rdo_78_1']");
	By RecBenefitEntity = By.xpath("//input[@id='rdo_78_2' or @name='rdo_78_2']");
	By IndFname = By.xpath("//input[@id='flda_124' or @name='flda_124']");
	By IndLname = By.xpath("//input[@id='flda_120' or @name='flda_120']");
	By LegalName = By.xpath("//input[@id='flda_126' or @name='flda_126']");
	By IndRelatonship = By.xpath("//select[@id='lb_201' or @name='lb_201']");
	By SSN = By.xpath("//input[@id='rdo_128_1' or @name='rdo_128_1']");
	By TIN = By.xpath("//input[@id='rdo_128_2' or @name='rdo_128_2']");
	By Input = By.xpath("//input[@id='flda_127' or @name='flda_127']");
	By ROBAddress1 = By.xpath("//input[@id='flda_140' or @name='flda_140']");
	By ROBCity = By.xpath("//input[@id='flda_134' or @name='flda_134']");
	By ROBState = By.xpath("//selectt[@id='lb_132' or @name='lb_132']");
	By ROBZip = By.xpath("//input[@id='flda_130' or @name='flda_130']");
	By ClickHereToAdd = By.xpath("//button[@id='grdx202_addRowButton']");
	By Iframe = By.xpath("//iframe[@id='modalIframe']");
	By Title = By.xpath("//input[@id='flda_29' or @name='flda_29']");
	By NoOfEmp = By.xpath("//input[@id='flda_30' or @name='flda_30']");
	By MonthlySalary = By.xpath("//input[@id='flda_34' or @name='flda_34']");
	By Hours = By.xpath("//input[@id='flda_33' or @name='flda_33']");
	By Save = By.xpath("//button[@id='btn_6' or @name='btn_6']");
	By Next = By.xpath("//button[@id='btn_76' or @name='btn_76']");

	public void BOE_ProductInformation(String Product, String PolicyOwner, 
			String RecipientofBenefit, String RentValue, String Percentage, String TitleDuty, String EmployeeCount,
			String Salary, String WorkingHrs) {
System.out.println("Boe PRoduction information is reached");
		if ($(BOE_DisabilityPrdInfo_Qtn).isDisplayed()) {
			System.out.println("Boe PRoduction information is reached in if condiition");
			GlobalCap.selectRadioYesorNo(PolicyOwnerYes, PolicyOwnerNo, PolicyOwner);

			// GlobalCap.selectRadioYesorNo(PolicyOwnerBusiness,
			// PolicyOwnerOther, PolicyOwnerType);
			// $(TaxPayerINum).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).setValue(TaxId);
			// GlobalCap.selectRadioYesorNo(PolicyOwnerBusiness,
			// PolicyOwnerOther, PolicyOwnerType);

			// GlobalCap.selectRadioYesorNo(OwnerIndividual, OwnerEntitiy,
			// ProposedOwnerType);

			// if (ProposedOwnerType.equalsIgnoreCase("Individual Owner"))
			// {
			// $(IndFname).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).setValue(Fname);
			// $(IndLname).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).setValue(Lname);
			// }

			// $(LegalName).shouldBe(Visible.exist,
			// Duratiodn.ofSeconds(30)).setValue(Legalname);

			// $(IndRelatonship).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).selectOptionByValue(Relationship);

			// GlobalCap.selectRadioYesorNo(SSN, TIN, IdentityType);

			// $(Input).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).setValue(IDnum);
			//
			// $(ROBAddress1).shouldBe(Visible.exist,
			// Duration.ofSeconds(60)).setValue(AddressStreet);
			// $(ROBCity).shouldBe(Visible.exist,
			// Duration.ofSeconds(60)).setValue(AddCity);
			// $(ROBState).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).selectOptionByValue(State);
			// $(ROBZip).shouldBe(Visible.exist,
			// Duration.ofSeconds(30)).sendKeys(Zip);

			GlobalCap.selectRadioYesorNo(RecipientOfBeneOwnerYes, RecipientOfBeneOwnerNo, RecipientofBenefit);

			$(Rent).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(RentValue);

			$(ProposedInsuredPercentage).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Percentage);

			$(ClickHereToAdd).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
//
//			GlobalCap.sleep(3000);
//			
//			$(Iframe).shouldBe(Visible.exist, Duration.ofSeconds(60));
//			HooksTest.idriver.switchTo().frame($(Iframe));
//
//			$(Title).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(TitleDuty);
//			$(NoOfEmp).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmployeeCount);
//			$(MonthlySalary).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Salary);
//			$(Hours).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(WorkingHrs);
//			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
//
//			HooksTest.idriver.switchTo().defaultContent();
//			GlobalCap.sleep(1000);

			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}
}
