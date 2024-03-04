package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class DI_BuySell_Product extends GlobalCap{

	By FullLegalFname= By.xpath("//input[@alt_id='BS_OWN_Ind_FirstName']");
	By FullLegalLname= By.xpath("//input[@alt_id='BS_OWN_Ind_LastName']");
	By FullLegalAdd1= By.xpath("//input[@alt_id='BS_OWN_MAILADDR_Line1']");
	By FullLegalCity= By.xpath("//input[@alt_id='BS_OWN_MAILADDR_City']");
	By FullLegalZip= By.xpath("//input[@alt_id='BS_OWN_MAILADDR_Zip']");
	By OwnRelationship = By.xpath("//input[@alt_id='BS_Relationship']");
	By OwnSSN= By.xpath("//input[@alt_id='BS_OWN_SSNTINInd_1']");
	By TIN= By.xpath("//input[@alt_id='BS_OWN_SSNTINInd_2']");
	By OwnId= By.xpath("//input[@alt_id='BS_OWN_SSNTIN']");
	By Next = By.xpath("//button[text()='Next  ']");

	
	public  void BuySellP(String Product, String LegalFname, String LegalLname, String LegalAdd, String City, String Zip, String Relationship,  String Id, String IdValue) {
		
		if (Product.equalsIgnoreCase("Buy/Sell")) 
		{
		$(FullLegalFname).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LegalFname);
		$(FullLegalLname).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LegalLname);
		$(FullLegalAdd1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(LegalAdd);
		$(FullLegalCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
		$(FullLegalZip).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(Keys.HOME+Zip);
		$(OwnRelationship).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Relationship);
		
		GlobalCap.selectId( OwnSSN, TIN, Id);
		
		$(OwnId).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(Keys.HOME+IdValue);
		
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
	}
	}
}
