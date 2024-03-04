package pageclass.SWl;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class SWL_PrimaryInsuredTwo extends GlobalCap {

	By PI_Firstname = By.xpath("//div[@id='div_120']//label[contains(text(),'First Name')]//following-sibling::input");
	By PI_Middlename = By.xpath("//div[@id='div_118']//label[contains(text(),'M.I')]//following-sibling::input");
	By PI_Middlenameclick = By.xpath("//div[@id='div_118']//label[contains(text(),'M.I')]");
	By PI_Lastname = By.xpath("//div[@id='div_111']//label[contains(text(),'Last Name')]//following-sibling::input");
	By Suffix_DD = By.xpath("//select[@id='lb_94' or @name='lb_94']");
	By PI_GenderMale_RB = By.xpath("//*[@id='rdo_133_1']");
	By PI_GenderFeMale_RB = By.xpath("//*[@id='rdo_133_2']");

	By CountryofBirth_DD = By.xpath("//*[@id='lb_126']");
	By BirthState_DD = By.xpath("//select[@id='lb_327']");
	By SSN = By.xpath("//input[@id='flda_109' or @name='flda_109']");
	
	//By ResidentialAddresssameasInsured = By.xpath("//span[contains(text(),'Residential Address same as Insured 1')]");
	By ResidentialAddresssameasInsured = By.xpath("//span[contains(text(),'Residential Address same as Insured 1')]//preceding::input[@alt_id='SameAddressAsPI']");
	By RESADDStreet1 = By.xpath("//input[@id='flda_8']");
	By RESADDStreet2 = By.xpath("//input[@id='flda_173']");
	By RESADDCity = By.xpath("//input[@id='flda_115']");
	By RESADDState = By.xpath("//select[@alt_id='ADDR_State']");
	By RESADDZIP = By.xpath("//label[text()='ZIP/Postal Code']//following-sibling::input[@id='flda_116']");

	By MailAddSameasResADD_yes = By.xpath("//input[@id='rdo_138_1' and @value='Yes']");
	By MailAddSameasResADD_No = By.xpath("//input[@id='rdo_138_2' and @value='No']");
	By MailingAddresssameasInsured = By.xpath("//span[contains(text(),'Mailing Address same as Insured 1')]");
	By Mailing_RESADDStreet1 = By.xpath("//input[@id='flda_146' or @name='flda_146']");
	By Mailing_RESADDStreet2 = By.xpath("//input[@id='flda_182' or @name='flda_182']");
	By Mailing_RESADDCity = By.xpath("//input[@id='flda_142' or @name='flda_142']");
	By Mailing_RESADDstate = By.xpath("//select[@id='lb_141' or @name='lb_141']");
	By Mailing_RESADDZIP = By.xpath("	//input[@id='flda_140' or @name='flda_140']");

	By PreferredPhoneNum = By.xpath("//input[@id='flda_53' or @id='flda_339']");
	By HomeWorkMobile_DD = By.xpath("//select[@id='lb_166']");
	By WorkExtension = By.xpath("//input[@id='flda_168']");
	By AlternatePhoneNumber = By.xpath("//input[@id='flda_335' or @id='flda_334']");
	By AltHomeWorkMobile_DD = By.xpath("//select[@id='lb_333' or @id='lb_331']");
	By AltExtension = By.xpath("//input[@id='flda_331']");
	By Besttimetocall = By.xpath("//input[@id='flda_329' or @id='flda_337']");

	By AM_RB = By.xpath("//input[@id='rdo_328_1' and @value='AM' or@id='rdo_338_1']");
	By PM_RB = By.xpath("//input[@id='rdo_328_2' and @value='PM' or @id='rdo_338_2']");
	By Received_Yes = By.xpath("//input[@id='rdo_356_1' and @class='top-aligned' or @id='rdo_351_1']");
	By Received_No = By.xpath("//input[@id='rdo_356_2' and @class='top-aligned' or @id='rdo_351_2']");

	By BestTime = By.xpath("//input[@id='flda_329' or @name='flda_337']");

	By NeedSpecial_Yes = By.xpath("//input[@id='rdo_360_1' or @id='rdo_352_1']");
	By NeedSpecial_No = By.xpath("//input[@id='rdo_360_2' or @id='rdo_352_2']");

	By PrefLang_Yes = By.xpath("//input[@id='rdo_365_1' or @id='rdo_354_1']");
	By PrefLang_No = By.xpath("//input[@id='rdo_365_2' or @id='rdo_354_2']");

	By rectxtmsg_RB = By.xpath("//*[@id='div_356']/div[2]");
	By rectxtmsgVal = By.xpath("//*[@id='lbl_357']");

	By EmailAddress = By.xpath("//input[@id='flda_117']");
	By Next = By.xpath("//button[@id='btn_16']");
	By Frame = By.xpath("//iframe[@id='CossScreenFrame']");
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;
	
	By Relationship = By.xpath("//select[@alt_id='Relationship']");

	public void personal_Information(String Firstname,String MidleName,String Lastname,String Suffix,String Gender, String Birth_state, String ssn) {

		
		$(PI_Firstname).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Firstname);
		$(PI_Middlename).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(MidleName);
		$(PI_Lastname).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lastname);
		$(Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Suffix);
		if(Gender.equalsIgnoreCase("MALE")){
			$(PI_GenderMale_RB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		else if(Gender.equalsIgnoreCase("FE-MALE")){
			$(PI_GenderFeMale_RB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if ($(BirthState_DD).isDisplayed()) {
			$(BirthState_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Birth_state);
		}
		$(SSN).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + ssn);
	}

	public void Address(String ResidentialAddresssameInsured, String street1, String street2, String city, String State,
			String Zip, String Mailingadd, String MailingaddresssameasInsured, String Mail_Strt1, String Mail_Strt2,
			String Mail_city, String Mail_State, String Mail_Zip) {

		if (ResidentialAddresssameInsured.equalsIgnoreCase("Yes")) {
			$(ResidentialAddresssameasInsured).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		} else if (ResidentialAddresssameInsured.equalsIgnoreCase("No")) {

			$(RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street1);
			$(RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street2);
			$(RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(city);
			$(RESADDState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
			$(RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zip);
		}
		if (Mailingadd.equalsIgnoreCase("No")) {
			if (MailingaddresssameasInsured.equalsIgnoreCase("No")) {
				selectRadioYesorNo(MailAddSameasResADD_yes, MailAddSameasResADD_No, Mailingadd);
				$(Mailing_RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Mail_Strt1);
				$(Mailing_RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Mail_Strt2);
				$(Mailing_RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Mail_city);
				$(Mailing_RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.selectOptionContainingText(Mail_State);
				$(Mailing_RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Mail_Zip);
			} else {
				$(MailingAddresssameasInsured).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}

		} else if (Mailingadd.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(MailAddSameasResADD_yes, MailAddSameasResADD_No, Mailingadd);

		}

	}

	public void Additionalinfo(String prefphno, String homeworkmob, String Extension, String alterphno,
			String alterhomeworkmob, String altrxtension, String AM_PM, String Recieve_txt, String timetocall,
			String Accomidation, String Preflang, String mail,String relationship) {

		$(PreferredPhoneNum).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + prefphno); 
																									
		$(HomeWorkMobile_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(homeworkmob);

		if (homeworkmob.equalsIgnoreCase("Work")) {
			$(WorkExtension).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Extension);

		}

		$(AlternatePhoneNumber).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + alterphno);
		$(AltHomeWorkMobile_DD).shouldBe(Visible.exist, Duration.ofSeconds(30))
				.selectOptionContainingText(alterhomeworkmob);

		if (alterhomeworkmob.equalsIgnoreCase("Work")) {
			$(AltExtension).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(altrxtension);
		}
		$(BestTime).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(timetocall);

		if (AM_PM.equalsIgnoreCase("AM")) {

			$(AM_RB).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		} else if (AM_PM.equalsIgnoreCase("PM")) {

			$(PM_RB).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

		}
		if ($(Received_Yes).isDisplayed()) {
			selectRadioYesorNo(Received_Yes, Received_No, Recieve_txt);
		}
		if ($(NeedSpecial_Yes).isDisplayed()) {
			selectRadioYesorNo(NeedSpecial_Yes, NeedSpecial_No, Accomidation);
		}
		if ($(PrefLang_Yes).isDisplayed()) {
			selectRadioYesorNo(PrefLang_Yes, PrefLang_No, Preflang);
		}
		$(EmailAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(mail);
		$(Relationship).shouldBe(Visible.exist, Duration.ofSeconds(30))
		.selectOptionContainingText(relationship);

		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

	}

}
