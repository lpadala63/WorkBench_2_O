package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class CorpResolution extends GlobalCap {
	By FirstName = By.xpath("//input[@id='flda_4' or @name='flda_4']");
	By LastName = By.xpath("//input[@id='flda_7' or @name='flda_7']");
	By Title = By.xpath("//input[@id='flda_12']");
	
	
	By Corporationisduly  = By.xpath("//select[@id='lb_119' or @name='lb_119']");
	By CorpFirstnName = By.xpath("//input[@id='flda_15' or @name='flda_15']");
	By CorpLastname = By.xpath("//input[@id='flda_16']");
	
	By CorpSealYes = By.xpath("//input[@id='rdo_23_1']");
	By CorpSealNo = By.xpath("//input[@id='rdo_23_2']");
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
    By Heading = By.xpath("//h1[contains(text(),'Corp Resolution')]");
	
	public void Corpresolution(String Firstname,String lastName,String title,String CorpState,String CorpFirstname,String Corplastname,String Corpseal){
		if($(Heading).isDisplayed()){
			$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Firstname);
			$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(lastName);
			$(Title).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(title);
			$(Corporationisduly).shouldBe(Visible.exist, Duration.ofSeconds(15))
					.selectOptionContainingText(CorpState);
			$(CorpFirstnName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(CorpFirstname);
			$(CorpLastname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Corplastname);
			GlobalCap.selectRadioYesorNo(CorpSealYes, CorpSealNo, Corpseal);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();

		}
				
	}
}
