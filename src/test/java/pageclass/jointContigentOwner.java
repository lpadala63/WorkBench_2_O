package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class jointContigentOwner extends GlobalCap {
	
	By FirstName = By.xpath("//input[@alt_id='Ind_FirstName']");
	By Middlename = By.xpath("//input[@alt_id='Ind_MiddleName']");
	By LastName = By.xpath("//input[@alt_id='Ind_LastName']");
	By Suffix_DD = By.xpath("//select[@alt_id='Ind_Suffix']");
	By GenderMale_RB = By.xpath("//input[@alt_id='Ind_Gender_1']");
	By GenderFeMale_RB = By.xpath("//input[@alt_id='Ind_Gender_2']");
	By DateofBirth_MM = By.xpath("//div[@id='div_13']//div//span//span[1]//input[1]");
	By DateofBirth_DD = By.xpath("//div[@id='div_13']//div//span//span[1]//input[2]");
	By DateofBirth_YYYY = By.xpath("//div[@id='div_13']//div//span//span[1]//input[3]");
	
	By Ent_SameAddressAsPI = By.xpath("//input[@alt_id='Ind_SameAddressAsPI']");
	By RESADDStreet1 = By.xpath("//input[@alt_id='Ind_ADDR_Line1']");
	By RESADDStreet2 = By.xpath("//input[@alt_id='Ind_ADDR_Line2']");
	By RESADDCity = By.xpath("//input[@alt_id='Ind_ADDR_City']");
	By RESADDstate = By.xpath("//input[@alt_id='Ind_ADDR_State']");
	By RESADDZIP = By.xpath("//input[@alt_id='Ind_ADDR_Zip']");

	By MailAddSameasResADD_yes = By.xpath("//input[@alt_id='Ind_ResSameAsMailing_1']");
	By MailAddSameasResADD_No = By.xpath("//input[@alt_id='Ind_ResSameAsMailing_2']");
	By Mailing_RESADDStreet1 = By.xpath("//input[@alt_id='Ind_MAILADDR_Line1']");
	By Mailing_RESADDStreet2 = By.xpath("//input[@alt_id='Ind_MAILADDR_Line2']");
	By Mailing_RESADDCity = By.xpath("//input[@alt_id='Ind_MAILADDR_City']");
	By Mailing_RESADDstate = By.xpath("//select[@alt_id='Ind_MAILADDR_State']");
	By Mailing_RESADDZIP = By.xpath("//input[@alt_id='Ind_MAILADDR_Zip']");
	By Phone = By.xpath("//input[@alt_id='Ind_Phone']");
	By PhoneType = By.xpath("//select[@alt_id='Ind_PhoneType']");
	By PhoneExt = By.xpath("//input[@alt_id='Ind_PhoneExt']");
	By Email = By.xpath("//input[@alt_id='Ind_Email']");
	By RelationShip = By.xpath("//select[@alt_id='Ind_Relationship']");
	By SSN_ITIN = By.xpath("//input[@alt_id='Ind_SSN']");
	By Headingaddr = By.xpath("//span[contains(text(),'Address')]");
	By HeadingEntr = By.xpath("//h1[contains(text(),'Joint/Contingent Owner')]");
	By Headinglifeownecont = By.xpath("//h1[contains(text(),'Joint/Contingent Owner (Cont)')]");
	
	By citizenship = By.xpath("//select[@alt_id='Ind_Citizenship']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	public void IndiviualOwnerDetials(String firstname,String middlename,String lastname,String suffix,String MM,String DD,
			String YYYY,String Gender) {
		if ($(HeadingEntr).isDisplayed()) {
			$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(firstname);
			$(Middlename).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(middlename);
			$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(lastname);
			$(Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(suffix);
			$(DateofBirth_MM).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MM);
			$(DateofBirth_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(DD);
			$(DateofBirth_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(YYYY);
			if (Gender.equalsIgnoreCase("Male")) {
				$(GenderMale_RB).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			} else {
				$(GenderFeMale_RB).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		}
	}
	public void Address(String AddresssameasPI, String street1, String street2, String city,String resState,String Zip,
			String Mailingadd, String Mail_Strt1, String Mail_Strt2, String Mail_city, String Mail_State,
			String Mail_Zip, String prefphno, String homeworkmob,String Extension,String email,String relationship,String ssn,String Citizenship
			) {
		if ($(Headingaddr).isDisplayed()) {
			if (AddresssameasPI.equalsIgnoreCase("Yes")) {
				$(Ent_SameAddressAsPI).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			} else {
				$(RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1);
				$(RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
				$(RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
				$(RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(resState);
				$(RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Zip);
			}
			selectRadioYesorNo(MailAddSameasResADD_yes, MailAddSameasResADD_No, Mailingadd);
			if (Mailingadd.equalsIgnoreCase("No")) {
				$(Mailing_RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt1);
				$(Mailing_RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt2);
				$(Mailing_RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_city);
				$(Mailing_RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Mail_State);
				$(Mailing_RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Zip);
			}
			$(Phone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(prefphno);
			$(PhoneType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(homeworkmob);
			if (homeworkmob.equalsIgnoreCase("Work")) {
				$(PhoneExt).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Extension);
			}
			$(Email).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(email);
			$(RelationShip).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(relationship);
			$(SSN_ITIN).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(ssn);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if ($(Headinglifeownecont).isDisplayed()) {
			$(citizenship).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Citizenship);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}
}
