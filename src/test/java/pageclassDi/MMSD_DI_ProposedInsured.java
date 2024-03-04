package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class MMSD_DI_ProposedInsured extends GlobalCap {

	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By Birthstate = By.xpath("//select[@id='lb_327']");
	By SocialSN = By.xpath("//label[text()='SSN/ITIN']//following-sibling::input[@id='flda_109']");
	By AddressStreet1 = By.xpath("//input[@id='flda_8']");
	By AddressCity = By.xpath("//input[@id='flda_115']");
	// By AddressZip =By.xpath( "//label[text()='ZIP/Postal
	// Code']//following-sibling::input[@id='flda_116']");
	By AddressZip = By.xpath("//input[@id='flda_116']");
	By MailAddressYes = By.xpath("//input[@id='rdo_138_1']");
	By MailAddressNo = By.xpath("//input[@id='rdo_138_2']");
	// By PreferredPhone = By.xpath("//label[text()='Preferred Phone
	// Number']//following-sibling::input[@id='flda_53']");
	By AddAdd = By.xpath("//input[@id='flda_146' or @name='flda_146']");
	By Addcity = By.xpath("//input[@id='flda_142' or @name='flda_142']");
	By AddState = By.xpath("//select[@id='lb_141' or @name='lb_141']");
	By AddZip = By.xpath("//input[@id='flda_140' or @name='flda_140']");
	By PreferredPhone = By.xpath("//input[@id='flda_53' or @name='flda_53']");
	By HomeWork = By.xpath("//select[@id='lb_166']");
	By BestTimeAM = By.xpath("//input[@id='rdo_328_1']");
	By BestTimePM = By.xpath("//input[@id='rdo_328_2']");
	By TextMessageYes = By.xpath("//input[@id='rdo_356_1']");
	By TextMessageNo = By.xpath("//input[@id='rdo_356_2']");
	By SpclAccomodationYes = By.xpath("//input[@id='rdo_360_1']");
	By SpclAccomodationNo = By.xpath("//input[@id='rdo_360_2']");
	By EnglishYes = By.xpath("//input[@id='rdo_365_1']");
	By EnglishNo = By.xpath("//input[@id='rdo_365_2']");
	By Email = By.xpath("//input[@id='flda_117']");
	By Next = By.xpath("//button[@id='btn_16']");
	 JavascriptExecutor j = (JavascriptExecutor)HooksTest.idriver;
	public void PersonalInformation(String BirthState, String Ssn, String AddressStreet, String AddCity, String Zip,
			String MailAdd, String Mail_Strt, String Mail_city, String Mail_State, String Mail_Zip) {

		// GlobalCap.sleep(6000);
		$(Birthstate).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(BirthState);
		GlobalCap.sleep(1000);
	
	     //j.executeScript ("document.getElementById('flda_109').value='"+Ssn+"'");
		$(SocialSN).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(SocialSN).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Keys.HOME + Ssn);
		$(AddressStreet1).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AddressStreet);
		$(AddressCity).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(AddCity);
		
		
	$(AddressZip).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Keys.HOME + Zip);

		if (MailAdd.equalsIgnoreCase("No")) {
			selectRadioYesorNo(MailAddressYes, MailAddressNo, MailAdd);
			$(AddAdd).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Mail_Strt);
			$(Addcity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Mail_city);
			$(AddState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Mail_State);
			$(AddZip).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Mail_Zip);

		} else if (MailAdd.equalsIgnoreCase("Yes")) {
			selectRadioYesorNo(MailAddressYes, MailAddressNo, MailAdd);
		}
	}

	public void AdditionalInformation(String Phone, String Home, String Time, String Message, String Acc,
			String English, String EMail) {

		//$(PreferredPhone).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		//j.executeScript ("document.getElementById('flda_53').value='"+Phone+"'");
		$(PreferredPhone).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(Keys.HOME + Phone);

		$(HomeWork).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Home);

		GlobalCap.selectAM_PM(BestTimeAM, BestTimePM, Time);

		GlobalCap.selectRadioYesorNo(TextMessageYes, TextMessageNo, Message);

		GlobalCap.selectRadioYesorNo(SpclAccomodationYes, SpclAccomodationNo, Acc);

		GlobalCap.selectRadioYesorNo(EnglishYes, EnglishNo, English);

		$(Email).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(EMail);

		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

	}
}
