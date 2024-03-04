package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

public class LTCR_PRotectionAUP {
	By PI_NotDesignate = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_DesignateYesNo_1']");
	By PI_Designate = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_DesignateYesNo_2']");
	By Firstname = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_FirstName']");
	By PI_Middlename = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_MiddleName']");
	By LastName = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_LastName']");
	By Suffix_DD = By.xpath("//select[@alt_id='LTCR_LAPSE_PI_Suffix']");
	By RESADDStreet1 =By.xpath("//input[@alt_id='LTCR_LAPSE_PI_ADDR_Line1']");
	By RESADDStreet2 = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_ADDR_Line2']");
	By RESADDCity = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_ADDR_City']");
	By RESADDstate = By.xpath("//select[@alt_id='LTCR_LAPSE_PI_ADDR_State']");
	By RESADDZIP = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_ADDR_Zip']");
	
	By PO_NotDesignate = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_DesignateYesNo_1']");
	By Po_Designate = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_DesignateYesNo_2']");
	By PO_Firstname = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_FirstName']");
	By PO_Middlename = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_MiddleName']");
	By PO_LastName = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_LastName']");
	By PO_Suffix_DD = By.xpath("//select[@alt_id='LTCR_LAPSE_PO_Suffix']");
	By PO_RESADDStreet1 =By.xpath("//input[@alt_id='LTCR_LAPSE_PO_ADDR_Line1']");
	By PO_RESADDStreet2 = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_ADDR_Line2']");
	By PO_RESADDCity = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_ADDR_City']");
	By PO_RESADDstate = By.xpath("//select[@alt_id='LTCR_LAPSE_PO_ADDR_State']");
	By PO_RESADDZIP = By.xpath("//input[@alt_id='LTCR_LAPSE_PO_ADDR_Zip']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By Heading = By.xpath("//h1[contains(text(),'Protection Against Unintentional Lapse')]");
	By HeadingPO = By.xpath("//h3//span[contains(text(),'Proposed Owner')]");

	public void LTCRprotectionAgainstUL(String PINotDesignate_Designate, String PIfirstname, String PImiddle, String PIlastname,String suffix,String PIstreet1,
			String PIstreet2, String PIcity, String PIstate, String PIZip,
			String PO_NotDesignate_Designate, String PO_firstname, String PO_middle, String PO_lastname,String PO_suffix,
			String PO_street1, String PO_street2, String PO_city, String PO_state, String PO_Zip) {
		if ($(Heading).isDisplayed()) {
			if (PINotDesignate_Designate.equalsIgnoreCase("NotDesignate")) {
				$(PI_NotDesignate).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			} else {
				$(PI_Designate).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(Firstname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PIfirstname);
				$(PI_Middlename).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PImiddle);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PIlastname);
				$(Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(suffix);
				$(RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PIstreet1);
				$(RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PIstreet2);
				$(RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PIcity);
				$(RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(PIstate);
				$(RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PIZip);
			}
			if ($(HeadingPO).isDisplayed()) {
				if (PO_NotDesignate_Designate.equalsIgnoreCase("NotDesignate")) {
					$(PO_NotDesignate).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				} else {
					$(Po_Designate).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(PO_Firstname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_firstname);
					$(PO_Middlename).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_middle);
					$(PO_LastName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_lastname);
					$(PO_Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(PO_suffix);
					$(PO_RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_street1);
					$(PO_RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_street2);
					$(PO_RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_city);
					$(PO_RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(PO_state);
					$(PO_RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_Zip);
				}
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}

}
