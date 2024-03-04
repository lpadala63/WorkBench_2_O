package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class CCOnePayementInformation extends GlobalCap{
	By Frequency_DD = By.xpath("//label[contains(text(),'Frequency')]//following-sibling::select");
	By paymentheading = By.xpath("//h1[text()='Payment Information']");
	By PInfo_BankingInfo_RD_yes = By.xpath("//label[contains(text(),'payment')]//following::span[@id='lbl_142_1']");
	By PInfo_BankingInfo_RD_No = By.xpath("//label[contains(text(),'payment')]//following::span[@id='lbl_142_2']");// input[@id='rdo_38_2'																																																			// @name='rdo_38_2']
	By PInfo_PremiumPayor_DD = By.xpath("//label[contains(text(),'Premium Payor')]//following::select[@id='lb_25']");
	By PIC_Next = By.xpath("//button[contains(text(),'Next')]");
	
	public void paymentinformation(String ProductType,String frequency,String BankingINfo,String PremiumPayor ){
		if(ProductType.equalsIgnoreCase("CareChoice Select")){
			$(Frequency_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(frequency);	
		}
		selectRadioYesorNo(PInfo_BankingInfo_RD_yes, PInfo_BankingInfo_RD_No, BankingINfo);
		$(PInfo_PremiumPayor_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PremiumPayor);
		$(paymentheading).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		$(PIC_Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
	}
}
