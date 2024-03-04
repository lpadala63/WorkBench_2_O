package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
public class CorpResolutionCert {
	By Meeting_MM = By.xpath("//input[@aria-label='Month (MM)']");
	By Meeting_DD = By.xpath("//input[@aria-label='Day (DD)']");
	By Meeting_YYYY = By.xpath("//input[@aria-label='Year (YYYY)']");
	By LawofState  = By.xpath("//select[@id='lb_2' or @name='lb_2']");
	By Heading = By.xpath("//h1[contains(text(),'Corp Resolution Cert')]");
	By Next = By.xpath("//button[[@id='btn_7']");
	
	public void Corpresolutioncert(String MeetingMonth,String MeetingDay,String MeetingYear,String State){
		if($(Heading).isDisplayed()){
			$(Meeting_MM).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MeetingMonth);
			$(Meeting_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MeetingDay);
			$(Meeting_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MeetingYear);
			$(LawofState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(State);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
		}
				
	}
}
