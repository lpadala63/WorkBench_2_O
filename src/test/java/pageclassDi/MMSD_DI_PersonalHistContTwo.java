package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class MMSD_DI_PersonalHistContTwo extends GlobalCap {

	By frame =By.xpath("//iframe[@id='CossScreenFrame']");
	By CurrentOcc =By.xpath("//input[@id='lb_537' or @name='lb_537']");
	By Duties =By.xpath("//input[@id='flda_35' or @name='flda_35']");
	By BusinessName =By.xpath("//input[@id='flda_33' or @name='flda_33']");
	By EmpAddressStreet =By.xpath("//input[@id='flda_13' or @name='flda_13']");
	By EmpAddressCity =By.xpath("//input[@id='flda_11' or @name='flda_11']");
	By EmpState =By.xpath("//select[@id='lb_9' or @name='lb_9']");
	By EmpZipcode =By.xpath("//input[@id='flda_19' or @name='flda_19']");
	By EarnedCurrentYear =By.xpath("//input[@id='flda_29' or @name='flda_29']");
	By EarnedPriorYear =By.xpath("//input[@id='flda_521' or @name='flda_521']");
	By UnEarnedCurrentYear =By.xpath("//input[@id='flda_28' or @name='flda_28']");
	By UnEarnedPriorYear =By.xpath("//input[@id='flda_522' or @name='flda_522']");
	By Next =By.xpath("//button[@id='btn_25' or @name='btn_25']");

	public void EmploymentInformation(String CurrOcc, String Duty, String Business) throws InterruptedException {
		
		$(CurrentOcc).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(CurrOcc);
		
		GlobalCap.sleep(1000);
		
		$(Duties).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Duty);
	
		$(BusinessName).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Business);
		
	}

	public void BusinessAddress(String EmpStreet, String EmpCity, String EmployerState, String EmpZip) {

		$(EmpAddressStreet).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(EmpStreet);
		
		$(EmpAddressCity).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(EmpCity);
		
		$(EmpState).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(EmployerState);
	
		$(EmpZipcode).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(EmpZipcode).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Keys.HOME + EmpZip);
		
		GlobalCap.sleep(1000);

	}

	public void IncomeInformation(String ECurrent, String EPrior, String UECurrent, String UEPrior) {

		$(EarnedCurrentYear).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(ECurrent);
	
		$(EarnedPriorYear).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(EPrior);
		
		$(UnEarnedCurrentYear).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(UECurrent);
		
		$(UnEarnedPriorYear).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(UEPrior);
		
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(70)).click();

		GlobalCap.sleep(10000);
	}

}