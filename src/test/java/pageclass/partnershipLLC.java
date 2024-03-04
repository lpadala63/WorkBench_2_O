package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class partnershipLLC extends GlobalCap{
	By TypeofEntity = By.xpath("//select[@id='lb_17']");
	By DateofOrganizationofEntity_Month = By.xpath("//*[@id='div_16']/div/span/span[1]/input[1]");
	By DateofOrganizationofEntity_Day = By.xpath("//*[@id='div_16']/div/span/span[1]/input[2]");
	By DateofOrganizationofEntity_Year = By.xpath("//*[@id='div_16']/div/span/span[1]/input[3]");
	By StateofOrganizationofEntity = By.xpath("//select[@id='lb_18']");
	By Istheentityingoodstanding_Yes = By.xpath("//input[@id='rdo_22_1']");
	By Istheentityingoodstanding_No = By.xpath("//input[@id='rdo_22_2']");
	By RelationshipofInsuredAnnuitant = By.xpath("//input[@id='flda_21']");
	By NumberofAuthorizedPersons = By.xpath("//select[@id='lb_14']");
	By TaxIdentificationofAuthorizedPerson = By.xpath("//input[@id='flda_62']");
	By FirstNameofAuthorizedPerson = By.xpath("//input[@id='flda_19']");
	By LastNameofAuthorizedPerson = By.xpath("//input[@id='flda_20']");
	By CapacityofAuthorizedPerson = By.xpath("//input[@id='flda_15']");
	By StreetOneofAuthorizedPerson = By.xpath("//input[@id='flda_23']");
	By StreetTwoofAuthorizedPerson = By.xpath("//input[@id='flda_24']");
	By StreetThreeofAuthorizedPerson = By.xpath("//input[@id='flda_25']");
	By CityofAuthorizedPerson = By.xpath("//input[@id='flda_35']");
	By StateofAuthorizedPerson = By.xpath("//select[@id='lb_37']");
	By ZipofAuthorizedPerson = By.xpath("//input[@id='flda_60']");
	By EmailofAuthorizedPerson = By.xpath("//input[@id='flda_36']");
	By TaxIdentificationofSecondAuthorizedPerson = By.xpath("//input[@id='flda_66']");
	By FirstNameofSecondAuthorizedPerson = By.xpath("//input[@id='flda_78']");
	By LastNameofSecondAuthorizedPerson = By.xpath("//input[@id='flda_76']");
	By CapacityofSecondAuthorizedPerson = By.xpath("//input[@id='flda_80']");
	By StreetOneofSecondAuthorizedPerson = By.xpath("//input[@id='flda_54']");
	By StreetTwoofSecondAuthorizedPerson = By.xpath("//input[@id='flda_55']");
	By StreetThreeofSecondAuthorizedPerson = By.xpath("//input[@id='flda_56']");
	By CityofSecondAuthorizedPerson = By.xpath("//input[@id='flda_51']");
	By StateofSecondAuthorizedPerson = By.xpath("//select[@id='lb_53']");
	By ZipofSecondAuthorizedPerson = By.xpath("//input[@id='flda_61']");
	By EmailofSecondAuthorizedPerson = By.xpath("//input[@id='flda_52']");
	By Next = By.xpath("//button[@id='btn_2']");
	
	public void PartnershipLLCCert(String EntityType,String OrganizationDateMM, String OrganizationDateDD, String OrganizationDateYY, String EntityState, String GoodStanding,
			String Relationship, String AuthorizedPersons){
		if($(TypeofEntity).isDisplayed()){
			$(TypeofEntity).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(EntityType);
			$(DateofOrganizationofEntity_Month).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(OrganizationDateMM);
			$(DateofOrganizationofEntity_Day).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(OrganizationDateDD);
			$(DateofOrganizationofEntity_Year).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(OrganizationDateYY);
			$(StateofOrganizationofEntity).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(EntityState);
			selectRadioYesorNo(Istheentityingoodstanding_Yes, Istheentityingoodstanding_No,GoodStanding);
			$(RelationshipofInsuredAnnuitant).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Relationship);
			$(NumberofAuthorizedPersons).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AuthorizedPersons); //2
		}
	}
	public void firstAuthorizedPerson(String TaxNumberofFirst, String FirstNameofFirst, String LastNameofFirst, String CapacityofFirst, String Street1ofFirst, String Street2ofFirst, String Street3ofFirst,
			String CityofFirst, String StateofFirst, String ZipofFirst, String EmailofFirst,String TaxNumberofSecond, String FirstNameofSecond, String LastNameofSecond, String CapacityofSecond, String Street1ofSecond, String Street2ofSecond,
			String Street3ofSecond, String CityofSecond, String StateofSecond, String ZipofSecond, String EmailofSecond){
		if($(TaxIdentificationofAuthorizedPerson).isDisplayed()){
			$(TaxIdentificationofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME+TaxNumberofFirst);
			$(FirstNameofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(FirstNameofFirst);
			$(LastNameofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LastNameofFirst);
			$(CapacityofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CapacityofFirst);
			$(StreetOneofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street1ofFirst);
			$(StreetTwoofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street2ofFirst);
			$(StreetThreeofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street3ofFirst);
			$(CityofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CityofFirst);
			$(StateofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(StateofFirst);
			$(ZipofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME+ZipofFirst);
			$(EmailofAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmailofFirst);
			if($(TaxIdentificationofSecondAuthorizedPerson).isDisplayed()){
				$(TaxIdentificationofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME+TaxNumberofSecond);
				$(FirstNameofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(FirstNameofSecond);
				$(LastNameofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LastNameofSecond);
				$(CapacityofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CapacityofSecond);
				$(StreetOneofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street1ofSecond);
				$(StreetTwoofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street2ofSecond);
				$(StreetThreeofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street3ofSecond);
				$(CityofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CityofSecond);
				$(StateofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(StateofSecond);
				$(ZipofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME+ZipofSecond);
				$(EmailofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmailofSecond);
				//$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		
	}
	public void secondAuthorizedPerson(String TaxNumberofSecond, String FirstNameofSecond, String LastNameofSecond, String CapacityofSecond, String Street1ofSecond, String Street2ofSecond,
			String Street3ofSecond, String CityofSecond, String StateofSecond, String ZipofSecond, String EmailofSecond){
		if($(TaxIdentificationofSecondAuthorizedPerson).isDisplayed()){
			$(TaxIdentificationofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME+TaxNumberofSecond);
			$(FirstNameofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(FirstNameofSecond);
			$(LastNameofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LastNameofSecond);
			$(CapacityofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CapacityofSecond);
			$(StreetOneofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street1ofSecond);
			$(StreetTwoofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street2ofSecond);
			$(StreetThreeofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Street3ofSecond);
			$(CityofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(CityofSecond);
			$(StateofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(StateofSecond);
			$(ZipofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME+ZipofSecond);
			$(EmailofSecondAuthorizedPerson).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(EmailofSecond);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		

	}
}
