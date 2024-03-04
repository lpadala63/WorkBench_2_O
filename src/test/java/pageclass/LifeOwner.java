package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;
public class LifeOwner extends GlobalCap {
	By IndiviualOwnerType = By.xpath("//select[@id='lb_9']");
	By Swl_LifeOwner = By.xpath("//h1[@id='lbl_6']");
	By Swl_LifeOwnerCont = By.xpath("//h1[@id='lbl_11']");
	By FirstName = By.xpath("//input[@id='flda_21']");
	By Middlename = By.xpath("//input[@id='flda_19']");
	By LastName = By.xpath("//input[@id='flda_17']");
	By Suffix_DD = By.xpath("//select[@id='lb_15']");
	By GenderMale_RB = By.xpath("//input[@id='rdo_11_1']");
	By GenderFeMale_RB = By.xpath("//input[@id='rdo_11_2']");
	By DateofBirth_MM = By.xpath("//div[@id='div_13']//div//span//span[1]//input[1]");
	By DateofBirth_DD = By.xpath("//div[@id='div_13']//div//span//span[1]//input[2]");
	By DateofBirth_YYYY = By.xpath("//div[@id='div_13']//div//span//span[1]//input[3]");
	
	By Ent_SameAddressAsPI = By.xpath("//input[@id='cb_25']");
	By RESADDStreet1 = By.xpath("//input[@id='flda_37']");
	By RESADDStreet2 = By.xpath("//input[@id='flda_31']");
	By RESADDCity = By.xpath("//input[@id='flda_38']");
	By RESADDstate = By.xpath("//select[@id='lb_35']");
	By RESADDZIP = By.xpath("//input[@id='flda_41']");

	By MailAddSameasResADD_yes = By.xpath("//input[@id='rdo_43_1']");
	By MailAddSameasResADD_No = By.xpath("//input[@id='rdo_43_2']");
	By Mailing_RESADDStreet1 = By.xpath("//input[@id='flda_51']");
	By Mailing_RESADDStreet2 = By.xpath("//input[@id='flda_59']");
	By Mailing_RESADDCity = By.xpath("//input[@id='flda_47']");
	By Mailing_RESADDstate = By.xpath("//select[@id='lb_46']");
	By Mailing_RESADDZIP = By.xpath("//input[@id='flda_45']");
	By Phone = By.xpath("//input[@id='flda_73']");
	By PhoneTypeclickop = By.xpath("//label[@id='lbl_80']");
	By PhoneType = By.xpath("//select[@id='lb_67']");
	By PhoneExt = By.xpath("//input[@id='flda_69']");
	By Email = By.xpath("//input[@id='flda_79']");
	By RelationShip = By.xpath("//select[@id='lb_1']");
	By SSN_ITIN = By.xpath("//input[@id='flda_71']");
	By Headingaddr = By.xpath("//span[contains(text(),'Address')]");
	By HeadingEntr = By.xpath("//h1[contains(text(),'Owner')]");
	By Headinglifeownecont = By.xpath("//h1[contains(text(),'Life Owner (Cont)') or contains(text(),'Owner (Cont.)')]");
	By Typeofcitizen = By.xpath("//select[@alt_id='Ind_Citizenship']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By Productname =By.xpath("//span[@id='lblProductName']");
	By Frame= By.xpath("//iframe[@id='CossScreenFrame']");
	public void IndiviualOwnerDetials(String indiviualOwnertype,String firstname,String middlename,String lastname,String suffix,String MM,String DD,
			String YYYY,String Gender) {
	
			if ($(IndiviualOwnerType).isDisplayed()) {
				$(IndiviualOwnerType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(indiviualOwnertype);
			}
			$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(firstname);
			$(Middlename).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(middlename);
			$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(lastname);
			$(Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(suffix);
			HooksTest.idriver.switchTo().defaultContent();
			
			String Product =$(Productname).getText(); 
			String Contractstate=LifeCaseSetup.ContractCity;
			
			$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
			HooksTest.idriver.switchTo().frame($(Frame));
			
			if($(DateofBirth_MM).isDisplayed() && $(DateofBirth_MM).isEnabled()){
				if($(DateofBirth_MM).isEnabled()){
					$(DateofBirth_MM).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MM);	
				}
				if($(DateofBirth_DD).isEnabled()){
					$(DateofBirth_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(DD);	
				}
				if($(DateofBirth_YYYY).isEnabled()){
					$(DateofBirth_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(YYYY);	
				}
			}
			
			if (Gender.equalsIgnoreCase("Male")) {
				$(GenderMale_RB).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			} else {
				$(GenderFeMale_RB).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		
		
	}
	public void Address(String AddresssameasPI, String street1, String street2, String city,String Resd_State,String Zip,
			String Mailingadd, String Mail_Strt1, String Mail_Strt2, String Mail_city, String Mail_State,
			String Mail_Zip, String prefphno, String homeworkmob,String Extension,String email,String relationship,String ssn
			) {
		
			if (AddresssameasPI.equalsIgnoreCase("Yes")) {
				$(Ent_SameAddressAsPI).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			} else {
				$(RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1);
				$(RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
				$(RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
				if ($(RESADDstate).isEnabled()) {
					$(RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15))
							.selectOptionContainingText(Resd_State);
				}
				$(RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Zip);
			}
			selectRadioYesorNo(MailAddSameasResADD_yes, MailAddSameasResADD_No, Mailingadd);
			if (Mailingadd.equalsIgnoreCase("No")) {
				$(Mailing_RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt1);
				$(Mailing_RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt2);
				$(Mailing_RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_city);
				$(Mailing_RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15))
						.selectOptionContainingText(Mail_State);
				$(Mailing_RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Mail_Zip);
			}
			$(Phone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + prefphno);
			$(PhoneTypeclickop).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			GlobalCap.sleep(1000);
			$(PhoneType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(homeworkmob);
			if (homeworkmob.equalsIgnoreCase("Work")) {
				$(PhoneExt).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Extension);
			}
			$(Email).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(email);
			$(RelationShip).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(relationship);
			$(SSN_ITIN).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + ssn);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		}
	
	public void SWL_LifeOwner(String indiviualOwnertype){
		if($(Swl_LifeOwner).isDisplayed()){
			$(IndiviualOwnerType).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(indiviualOwnertype);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if($(Swl_LifeOwnerCont).isDisplayed()){
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
	}
	
}
