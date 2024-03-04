package pageclass;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class ProposedInsured extends GlobalCap {

	By PI_Middlename = By.xpath("//input[@id='flda_118']");
	By Suffix_DD = By.xpath("//select[@id='lb_94' or @name='lb_94']");
	By PI_GenderMale_RB = By.xpath("//*[@id='rdo_133_1']");
	By PI_GenderFeMale_RB = By.xpath("//*[@id='rdo_133_2']");
	By CountryofBirth_DD = By.xpath("//*[@id='lb_126']");
	By BirthState_DD = By.xpath("//select[@id='lb_327']");
	By SSN = By.xpath("//input[@id='flda_109' or @name='flda_109']");
	By RESADDStreet1 = By.xpath("//input[@id='flda_8']");
	By RESADDStreet2 = By.xpath("//input[@id='flda_173']");
	By RESADDCity = By.xpath("//input[@id='flda_115']");
	By RESADDZIP = By.xpath("//label[text()='ZIP/Postal Code']//following-sibling::input[@id='flda_116']");
	By MailAddSameasResADD_yes = By.xpath("//input[@id='rdo_138_1' and @value='Yes']");
	By MailAddSameasResADD_No = By.xpath("//input[@id='rdo_138_2' and @value='No']");
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
    By Ssn_Tin = By.xpath("//label[@id='lbl_165']"); 
	By EmailAddress = By.xpath("//input[@id='flda_117']");
	By Next = By.xpath("//button[@id='btn_16']");
	By Frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By SSN_Number = By.xpath("//input[@id='flda_109_fmt']");
	By ZIP_number = By.xpath("//input[@id='flda_116_fmt']");
	By ziptext = By.xpath("//label[@id='lbl_10']");
	By PhoneNumber = By.xpath("//input[@id='flda_53_fmt']");
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	public void personal_Information(String Suffix, String Birth_state, String ssn) {
		$(Suffix_DD).selectOptionContainingText(Suffix);
		if ($(BirthState_DD).isDisplayed()) {
			$(BirthState_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Birth_state);
		}
		$(SSN).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME+ssn);
		GlobalCap.sleep(1500);
		$(Ssn_Tin).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
	}

	public void Address(String street1, String street2, String city, String Zip, String Mailingadd, String Mail_Strt1,
			String Mail_Strt2, String Mail_city, String Mail_State, String Mail_Zip) {
		$(RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1);
		$(RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
		$(RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
		$(RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Zip);
		selectRadioYesorNo(MailAddSameasResADD_yes, MailAddSameasResADD_No, Mailingadd);
		if (Mailingadd.equalsIgnoreCase("No")) {
			$(Mailing_RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt1);
			$(Mailing_RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt2);
			$(Mailing_RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_city);
			$(Mailing_RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15))
					.selectOptionContainingText(Mail_State);
			$(Mailing_RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Mail_Zip);
		}
	}

	public void Additionalinfo(String prefphno, String homeworkmob, String Extension, String alterphno,
			String alterhomeworkmob, String altrxtension, String AM_PM, String Recieve_txt, String timetocall,
			String Accomidation, String Preflang, String mail) {
		$(PreferredPhoneNum).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + prefphno);
		$(HomeWorkMobile_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(homeworkmob);
		if (homeworkmob.equalsIgnoreCase("Work")) {
			$(WorkExtension).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Extension);
		}
		$(AlternatePhoneNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + alterphno);
		$(AltHomeWorkMobile_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(alterhomeworkmob);
		if (alterhomeworkmob.equalsIgnoreCase("Work")) {
			$(AltExtension).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(altrxtension);
		}
		$(BestTime).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(timetocall);
		if (AM_PM.equalsIgnoreCase("AM")) {
			$(AM_RB).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
		} else if (AM_PM.equalsIgnoreCase("PM")) {
			$(PM_RB).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
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
		$(EmailAddress).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(mail);
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
	}
}
