package pageclass.SWl;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class Swl_JointOwner extends GlobalCap {
	
	By Res_Insured1 = By.xpath("//input[@alt_id='Ind_SameAddressAsPI']");
	By Res_Insured2 = By.xpath("//input[@alt_id='Ind_SameAddressAsOI1']");
	
	//By Ent_SameAddressAsPI = By.xpath("//input[@alt_id='Ind_SameAddressAsPI']");
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
	By Phoneclick = By.xpath("//label[@id='lbl_75']");
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
	
	public void Address(String sameasIns,String street1, String street2, String city,String resState,String Zip,
			String Mailingadd, String Mail_Strt1, String Mail_Strt2, String Mail_city, String Mail_State,
			String Mail_Zip, String prefphno, String homeworkmob,String Extension,String email,String relationship,String ssn,String Citizenship
			) {
	
		if ($(Headingaddr).isDisplayed()) {
			
			if(sameasIns.equalsIgnoreCase("Insured1")){
				$(Res_Insured1).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			else if(sameasIns.equalsIgnoreCase("Insured2")){
				$(Res_Insured2).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			
			else {
				$(RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1);
				$(RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
				$(RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
				$(RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(resState);
				$(RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Zip);
			}
			selectRadioYesorNo(MailAddSameasResADD_yes, MailAddSameasResADD_No, Mailingadd);
			if (Mailingadd.equalsIgnoreCase("No")) {
				$(Mailing_RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt1);
				$(Mailing_RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt2);
				$(Mailing_RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_city);
				$(Mailing_RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Mail_State);
				$(Mailing_RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Mail_Zip);
			}
			$(Phone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + prefphno);
			$(Phoneclick).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			$(PhoneType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(homeworkmob);
			if (homeworkmob.equalsIgnoreCase("Work")) {
				$(PhoneExt).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Extension);
			}
			$(Email).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(email);
			$(RelationShip).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(relationship);
			$(SSN_ITIN).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + ssn);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		/*if ($(Headinglifeownecont).isDisplayed()) {
			$(citizenship).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Citizenship);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}*/
	}
}
