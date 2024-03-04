package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class TrustCertification extends GlobalCap{
	By trusteesClickHere = By.xpath("//button[@id='grdx32_addRowButton' or @id='grdx5_addRowButton']");
	By TrusteeIndividualType = By.xpath("//input[@value='Individual']");
	By TrusteeEntityType = By.xpath("//input[@value='Entity']");
	By AuthFirstName = By.xpath("//input[@alt_id='AuthFirstName']");
	By AuthMiddleName = By.xpath("//input[@alt_id='AuthMiddleName']");
	By AuthLastName = By.xpath("//input[@alt_id='AuthLastName']");
	By AuthSuffix = By.xpath("//select[@alt_id='AuthSuffix']");
	By Email = By.xpath("//input[@alt_id='Email']");
	By TrusteeEntityName = By.xpath("//input[@alt_id='EntityName']");
	By Title = By.xpath("//input[@alt_id='Title']");
	By TrusteeSave = By.xpath("//div[@class='modal-footer']//button[@alt_id='btnSave']");
	By LBPageFrame = By.xpath("//iframe[@id='modalIframe']");
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
	By GrantorClickHere = By.xpath("//button[@id='grdx31_addRowButton' or @id='grdx4_addRowButton']");
	By GrantorType = By.xpath("//select[@alt_id='Type']");
	By GrantorFirstName = By.xpath("//input[@alt_id='FirstName']");
	By GrantorMiddleName = By.xpath("//input[@alt_id='MiddleName']");
	By GrantorLastName = By.xpath("//input[@alt_id='LastName']");
	By GrantorSuffix = By.xpath("//select[@alt_id='Suffix']");
	By GrantorCountry = By.xpath("//select[@alt_id='CitizenshipCountry']");
	By MM = By.xpath("//*[@id='div_26']/div/span/span[1]/input[1]");
	By DD = By.xpath("//*[@id='div_26']/div/span/span[1]/input[2]");
	By YYYY = By.xpath("//*[@id='div_26']/div/span/span[1]/input[3]");
	By SSN = By.xpath("//input[@alt_id='SSNTIN']");
	By AddressSameAsPI = By.xpath("//input[@alt_id='SameAddressAsPI']");
	By street1 = By.xpath("//input[@alt_id='ADDR_Line1']");
	By street2 = By.xpath("//input[@alt_id='ADDR_Line2']");
	By City = By.xpath("//input[@alt_id='ADDR_City']");
	By State = By.xpath("//select[@alt_id='ADDR_State']");
	By zip = By.xpath("//input[@alt_id='ADDR_Zip']");
	By TaxPayerNo = By.xpath("//input[@alt_id='SSNTIN']");
    By heading=By.xpath("//h1[contains(text(),'Certification of Trust Agreement - Owner')]");
    By RelationToBeneSpouse = By.xpath("//input[@alt_id='RelationToBeneSpouse']");
    By RelationToBeneChild = By.xpath("//input[@alt_id='RelationToBeneChild']");
    By RelationToBeneGrandchild = By.xpath("//input[@alt_id='RelationToBeneGrandchild']");
    By RelationToBeneEmp = By.xpath("//input[@alt_id='RelationToBeneEmp']");
    By RelationToBeneOther = By.xpath("//input[@alt_id='RelationToBeneOther']");
    By RelationToBeneOtherDtls = By.xpath("//input[@alt_id='RelationToBeneOtherDtls']");
    By AuthorizeTrusteee_Yes = By.xpath("//input[@alt_id='AuthorizeYesNo_1']");
    By AuthorizeTrusteee_No = By.xpath("//input[@alt_id='AuthorizeYesNo_2']");
    By viaticalCompany_Yes = By.xpath("//input[@alt_id='ViaticalYesNo_1']");
    By viaticalCompany_No = By.xpath("//input[@alt_id='ViaticalYesNo_2']");
    By RelationToGrantor = By.xpath("//select[@alt_id='RelationToGrantor']");
    By SigningTrustees = By.xpath("//select[@alt_id='SigningTrustees']");
    By Next = By.xpath("//button[contains(text(),'Next')]");

	public void trustees_Grantor(String TrusteeType, String FirstName, String MiddleName, String LastName, String Suffix,
			String email, String EntityName, String title, String Grantortype, String GrantorFirstname,
			String GrantorMiddlename, String GrantorLastname, String Grantorsuffix, String Grantorcountry, String mm,
			String dd, String yyyy, String ssn, String AddressSamePI, String streetone, String streettwo, String city,
			String state, String zipcode, String GrantorEntityName, String TaxPayerno) {
		if ($(heading).isDisplayed()) {
			$(trusteesClickHere).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
			HooksTest.idriver.switchTo().defaultContent();
			HooksTest.idriver.switchTo().frame($(LBPageFrame));
			if (TrusteeType.equalsIgnoreCase("Indiviual")) {
				$(TrusteeIndividualType).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
				GlobalCap.sleep(1000);
				$(AuthFirstName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(FirstName);
				$(AuthMiddleName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(MiddleName);
				$(AuthLastName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(LastName);
				$(AuthSuffix).shouldBe(Visible.exist, Duration.ofSeconds(20)).selectOptionContainingText(Suffix);
				$(Email).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(email);
				GlobalCap.sleep(1000);
			} else if (TrusteeType.equalsIgnoreCase("Entity")) {
				$(TrusteeEntityType).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
				GlobalCap.sleep(1000);
				$(TrusteeEntityName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(EntityName);
				$(Title).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(title);
				$(AuthFirstName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(FirstName);
				$(AuthMiddleName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(MiddleName);
				$(AuthLastName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(LastName);
				$(AuthSuffix).shouldBe(Visible.exist, Duration.ofSeconds(20)).selectOptionContainingText(Suffix);

				GlobalCap.sleep(1000);
			}
			HooksTest.idriver.switchTo().defaultContent();
			$(TrusteeSave).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
			HooksTest.idriver.switchTo().frame($(ciPageFrame));
			GlobalCap.sleep(3000);
			$(GrantorClickHere).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
			HooksTest.idriver.switchTo().defaultContent();
			HooksTest.idriver.switchTo().frame($(LBPageFrame));
			
			$(GrantorType).shouldBe(Visible.exist, Duration.ofSeconds(20)).selectOptionContainingText(Grantortype);
			if (Grantortype.equalsIgnoreCase("Insured")) {
				HooksTest.idriver.switchTo().defaultContent();
				$(TrusteeSave).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
				HooksTest.idriver.switchTo().frame($(ciPageFrame));
			} else if (Grantortype.equalsIgnoreCase("Individual other than Insured")) {
				$(GrantorFirstName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(GrantorFirstname);
				$(GrantorMiddleName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(GrantorMiddlename);
				$(GrantorLastName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(GrantorLastname);
				$(GrantorSuffix).shouldBe(Visible.exist, Duration.ofSeconds(20))
						.selectOptionContainingText(Grantorsuffix);
				$(GrantorCountry).shouldBe(Visible.exist, Duration.ofSeconds(20))
						.selectOptionContainingText(Grantorcountry);
				$(MM).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(mm);
				$(DD).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(dd);
				$(YYYY).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(yyyy);
				$(SSN).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(Keys.HOME+ssn);
				if (AddressSamePI.equalsIgnoreCase("Yes")) {
					$(AddressSameAsPI).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
					
				} else {
					$(street1).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(streetone);
					$(street2).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(streettwo);
					$(City).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(city);
					$(State).shouldBe(Visible.exist, Duration.ofSeconds(20)).selectOptionContainingText(state);
					$(zip).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(Keys.HOME+zipcode);
				}
				HooksTest.idriver.switchTo().defaultContent();
				$(TrusteeSave).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
				HooksTest.idriver.switchTo().frame($(ciPageFrame));
			} else if (Grantortype.equalsIgnoreCase("Entity")) {
				$(TrusteeEntityName).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(GrantorEntityName);
				$(TaxPayerNo).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(Keys.HOME+TaxPayerno);
				if (AddressSamePI.equalsIgnoreCase("Yes")) {
					$(TrusteeSave).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
				} else {
					$(street1).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(streetone);
					$(street2).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(streettwo);
					$(City).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(city);
					$(State).shouldBe(Visible.exist, Duration.ofSeconds(20)).selectOptionContainingText(state);
					$(zip).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(Keys.HOME+zipcode);
				}
				HooksTest.idriver.switchTo().defaultContent();
				$(TrusteeSave).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
				HooksTest.idriver.switchTo().frame($(ciPageFrame));
				GlobalCap.sleep(3000);
			}
		}

	}
	public void BeneficiaryInformation(String RelationShipBene,String RelationshipOtherDtls,String AuthorizeTrusteee,String viaticalCompany,String RelationGrantor,
			String SigningTrustee ){
		GlobalCap.sleep(1000);
		if ($(heading).isDisplayed()) {
		if(RelationShipBene.equalsIgnoreCase("Spouse")){
			$(RelationToBeneSpouse).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
		}
		if(RelationShipBene.equalsIgnoreCase("Child")){
			$(RelationToBeneChild).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
		}
		if(RelationShipBene.equalsIgnoreCase("Grandchild")){
			$(RelationToBeneGrandchild).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
		}
		if(RelationShipBene.equalsIgnoreCase("Employee/Employer")){
			$(RelationToBeneEmp).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
		}
		if(RelationShipBene.equalsIgnoreCase("Other")){
			$(RelationToBeneOther).shouldBe(Visible.exist, Duration.ofSeconds(20)).click();
			$(RelationToBeneOtherDtls).shouldBe(Visible.exist, Duration.ofSeconds(20)).setValue(RelationshipOtherDtls);
		}
		selectRadioYesorNo(AuthorizeTrusteee_Yes, AuthorizeTrusteee_No,  AuthorizeTrusteee);
		selectRadioYesorNo(viaticalCompany_Yes, viaticalCompany_No, viaticalCompany);
		$(RelationToGrantor).shouldBe(Visible.exist, Duration.ofSeconds(20)).selectOptionContainingText(RelationGrantor);
		$(SigningTrustees).shouldBe(Visible.exist, Duration.ofSeconds(20)).selectOptionContainingText(SigningTrustee);
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}
	}
}
