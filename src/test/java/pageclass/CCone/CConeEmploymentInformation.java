package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class CConeEmploymentInformation extends GlobalCap{
	By Owner_Employed_Yes = By.xpath("//label[contains(text(),'Owner employed')]//following::span[text()='Yes']");
	By Owner_Employed_No = By.xpath("//label[contains(text(),'Owner employed')]//following::span[text()='No']");

	By BussinesNames = By.xpath("//label[contains(text(),'Business Name')]//following::input[@alt_id='EMP_Name']");
	By Street1 = By.xpath("//label[contains(text(),'Street 1')]//following::input[@alt_id='EMP_ADDR_Line1']");
    By Street2 = By.xpath("//label[contains(text(),'Street 2')]//following::input[@alt_id='EMP_ADDR_Line2']");
	By City = By.xpath("//label[contains(text(),'City')]//following::input[@alt_id='EMP_ADDR_City']");
	By State = By.xpath("//label[contains(text(),'State')]//following::select[@alt_id='EMP_ADDR_StateList']");
	By Zipcode = By.xpath("//label[contains(text(),'ZIP/Postal Code')]//following::input[@alt_id='EMP_ADDR_Zip']");
	By Next = By.xpath("//button[contains(text(),'Next  ')]");
	
	By Beneficiarydesignation = By.xpath("//span[contains(text(),'Beneficiary Designation Form')]");
	By EndorsementSplitDollarBeneficiary = By.xpath("//span[contains(text(),'Endorsement Split Dollar Beneficiary')]");
	public void empolyementInformation(String OwnerEmployed,String businesname,String street1,String street2,String city,String state,String zip){
		if($(Owner_Employed_Yes).isDisplayed()){
			if(OwnerEmployed.equalsIgnoreCase("Yes")){
				selectRadioYesorNo(Owner_Employed_Yes, Owner_Employed_No, OwnerEmployed);
				$(BussinesNames).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(businesname);
				$(Street1).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street1);
				$(Street2).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(street2);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(city);		
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(state);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + zip);
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			else {
				selectRadioYesorNo(Owner_Employed_Yes, Owner_Employed_No, OwnerEmployed);
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			
		}
		
	}
	
	
}
