package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class LTCRLapse extends GlobalCap {
	By PI_electsNotToDesignate = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_DesignateYesNo_1']");
	By PI_electoDesignate = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_DesignateYesNo_2']");
	By FirstName = By.xpath(
			"//label[contains(text(),'First Name')]//following-sibling::input[@alt_id='LTCR_LAPSE_PI_FirstName']");
	By MiddleName = By.xpath("//label[contains(text(),'M.I')]//following::input[@alt_id='LTCR_LAPSE_PI_MiddleName']");
	By LastName = By
			.xpath("//label[contains(text(),'Last Name')]//following-sibling::input[@alt_id='LTCR_LAPSE_PI_LastName']");
	By Suffix = By.xpath("//label[contains(text(),'Suffix')]//following::select[@alt_id='LTCR_LAPSE_PI_Suffix']");
	By Street1 = By.xpath(
			"//label[contains(text(),'Street 1')]//following-sibling::input[@alt_id='LTCR_LAPSE_PI_ADDR_Line1']");
	By Street2 = By.xpath(
			"//label[contains(text(),'Street 2')]//following-sibling::input[@alt_id='LTCR_LAPSE_PI_ADDR_Line2']");
	By City = By.xpath("//label[contains(text(),'City')]//following-sibling::input[@alt_id='LTCR_LAPSE_PI_ADDR_City']");
	By State = By.xpath("//label[contains(text(),'State')]//following::select[@alt_id='LTCR_LAPSE_PI_ADDR_State']");
	By zip = By.xpath("//label[contains(text(),'ZIP')]//following::input[@alt_id='LTCR_LAPSE_PI_ADDR_Zip']");
	By phone = By
			.xpath("//label[contains(text(),'Phone Number')]//following::input[@alt_id='LTCR_LAPSE_PI_Phone_Number']");
	By phoneType = By.xpath(
			"//label[contains(text(),'Home')]//following-sibling::select[@alt_id='LTCR_LAPSE_PI_Phone_Number_Type']");

	By PO_PI_electsNotToDesignate = By.xpath("//input[@id='rdo_33_1']");
	By PO_PI_electoDesignate = By.xpath("//input[@id='rdo_33_2']");
	By PO_FirstName = By.xpath("//input[@id='flda_42']");
	By PO_MiddleName = By.xpath("//input[@id='flda_39']");
	By PO_LastName = By.xpath("//input[@id='flda_38']");
	By PO_Suffix = By.xpath("//select[@id='lb_36']");
	By PO_Street1 = By.xpath("//input[@id='flda_53']");
	By PO_Street2 = By.xpath("//input[@id='flda_51']");
	By PO_City = By.xpath("//input[@id='flda_47']");
	By PO_State = By.xpath("//select[@id='lb_45']");
	By PO_zip = By.xpath("//input[@id='flda_59']");
	By PO_phone = By.xpath("//input[@id='flda_69']");
	By PO_phoneType = By.xpath("//select[@id='lb_67']");

	By FL_PI_electsNotToDesignate = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_DesignateYesNoFL_1']");
	By FL_PI_electoDesignate = By.xpath("//input[@alt_id='LTCR_LAPSE_PI_DesignateYesNoFL_2']");

	By Next = By.xpath("//button[contains(text(),'Next')]");

	public void protectionAgainstLapse(String ProductType, String Statename, String PINottoDesignate, String firstname,
			String lastname, String middlename, String suffix, String street1, String street2, String city,
			String state, String Zip, String Phone, String PhoneType, String PO_PINottoDesignate, String PO_firstname,
			String PO_lastname, String PO_middlename, String PO_suffix, String PO_street1, String PO_street2,
			String PO_city, String PO_state, String PO_Zip, String PO_Phone, String PO_PhoneType) {
		if (ProductType.equalsIgnoreCase("CareChoice Select")) {
			if (PINottoDesignate.equalsIgnoreCase("ProposeInsuredNotTODesignate")) {
				$(PI_electsNotToDesignate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				//$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			} else if (PINottoDesignate.equalsIgnoreCase("ProposedInsuredToDesignate")) {
				$(PI_electoDesignate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(firstname);
				$(MiddleName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(middlename);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(lastname);
				$(Suffix).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(suffix);
				$(Street1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street1);
				$(Street2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street2);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(city);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(state);
				$(zip).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zip);
				$(phone).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Phone);
				$(phoneType).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PhoneType);
				//$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}

		}

		if (ProductType.equalsIgnoreCase("CareChoice Select")) {

			if ($(PO_PI_electsNotToDesignate).isDisplayed()) {
				System.out.println("sample");
				if (PO_PINottoDesignate.equalsIgnoreCase("ProposeInsuredNotTODesignate")) {
					GlobalCap.sleep(500);
					$(PO_PI_electsNotToDesignate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					
				} else {
					$(PO_PI_electoDesignate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(PO_FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_firstname);
					$(PO_MiddleName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_middlename);
					$(PO_LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_lastname);
					$(PO_Suffix).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PO_suffix);
					$(PO_Street1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_street1);
					$(PO_Street2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_street2);
					$(PO_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_city);
					$(PO_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PO_state);
					$(PO_zip).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_Zip);
					$(PO_phone).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_Phone);
					$(PO_phoneType).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionContainingText(PO_PhoneType);
					
				}
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if (ProductType.equalsIgnoreCase("CareChoice One")) {
			if (Statename.equalsIgnoreCase("Florida")) {

				if (PINottoDesignate.equalsIgnoreCase("ProposeInsuredNotTODesignate")) {
					$(FL_PI_electsNotToDesignate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				} else if (PINottoDesignate.equalsIgnoreCase("ProposedInsuredToDesignate")) {
					$(FL_PI_electoDesignate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

					$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(firstname);
					$(MiddleName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(middlename);
					$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(lastname);
					$(Suffix).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(suffix);
					$(Street1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street1);
					$(Street2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street2);
					$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(city);
					$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(state);
					$(zip).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zip);
					$(phone).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Phone);
					$(phoneType).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PhoneType);
					$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				}
			}
		}
	}

}
