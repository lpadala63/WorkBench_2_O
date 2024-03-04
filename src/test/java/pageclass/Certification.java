package pageclass;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import com.cucumber.listener.Reporter;

import commonutils.CommonFunctions;
import commonutils.GlobalCap;
import commonutils.TestPropertyFileRead;
import stepdefinitions.HooksTest;

public class Certification extends GlobalCap {

	By Certi_Certi1 = By.xpath("//*[@id='cb_15']");
	By Certi_Certi2 = By.xpath("//*[@id='cb_14']");
	By Certi_Certi3 = By.xpath("//*[@id='cb_13']");
	By Certi_Certi4 = By.xpath("//*[@id='cb_12']");

	By AddCerti_Certi1 = By.xpath("//input[@id='cb_28']");
	By AddCerti_Certi2 = By.xpath("//input[@id='cb_27']");
	By AddCerti_Certi3 = By.xpath("//input[@id='cb_26']");
	By AddCerti_Certi4 = By.xpath("//input[@id='cb_25']");
	
	By AltCerti_Certi1 = By.xpath("//input[@id='cb_37']");
	By AltCerti_Certi2 = By.xpath("//input[@id='cb_36']");
	By AltCerti_Certi3 = By.xpath("//input[@id='cb_35']");
	By AltCerti_Certi4 = By.xpath("//input[@id='cb_34']");

	By Certi_Nonmedpart2medical_qstn_RB = By.xpath("//*[@id='div_54']/div[2]");
	By Certi_TaxpayerIdentificationNumber_RB = By.xpath("//*[@id='div_3']/div[2]");
	By Certi_Subjecttobackupwithholding_RB = By.xpath("//*[@id='div_2']/div[2]");
	By Certi_IamaUSperson_RB = By.xpath("//*[@id='div_1']/div[2]");
	By Certi_BACK = By.xpath("//*[@id='btn_20']");
	By Certi_NEXT = By.xpath("//*[@id='btn_19']");
	By Certi_taxpayer_id_No = By.xpath("//*[@id='rdo_3_2']");
	By Certi_taxpayer_id_Yes = By.xpath("//*[@id='rdo_3_1']");
	By Certi_backup_Yes = By.xpath("//*[@id='rdo_2_1']");
	By Certi_backup_No = By.xpath("//*[@id='rdo_2_2']");
	By Certi_us_Yes = By.xpath("//*[@id='rdo_1_1']");
	By Certi_us_No = By.xpath("//*[@id='rdo_1_2']");
	By Pursuant_NY_Yes=By.xpath("//input[@id='rdo_97_1']");
	By Pursuant_NY_No=By.xpath("//input[@id='rdo_97_2']");
	long Starttime, Endtime;
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	public void salesCertification(String salesofcertification) {
		
		/*
		 * if ($(Certi_Certi1).isDisplayed()) {
		 * $(Certi_Certi1).shouldBe(Visible.exist,
		 * Duration.ofSeconds(60)).click(); }
		 * 
		 * else {
		 */ if ($(Certi_Certi1).isDisplayed()) {
			switch (salesofcertification) {
			case "The Sales of illlustration conforms":
				$(Certi_Certi1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "No illustraion":
				$(Certi_Certi2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "The Sales of illlustration used for PI":
				$(Certi_Certi3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Copy was furnished":
				$(Certi_Certi4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;

			default:
				System.out.println("Not able to select the option");
				break;
			}
		}
		// }//

		if ($(AddCerti_Certi1).isDisplayed()) {
			GlobalCap.sleep(1000);
			switch (salesofcertification) {
			case "The Sales of illlustration conforms":
				$(AddCerti_Certi1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "No illustraion":
				$(AddCerti_Certi2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "The Sales of illlustration used for PI":
				$(AddCerti_Certi3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Copy was furnished":
				$(AddCerti_Certi4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;

			default:
				System.out.println("Not able to select the option");
				break;
			}
		}

		if ($(AltCerti_Certi1).isDisplayed()) {
			GlobalCap.sleep(1000);
			switch (salesofcertification) {
			case "The Sales of illlustration conforms":
				$(AltCerti_Certi1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "No illustraion":
				$(AltCerti_Certi2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "The Sales of illlustration used for PI":
				$(AltCerti_Certi3).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			case "Copy was furnished":
				$(AltCerti_Certi4).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;

			default:
				System.out.println("Not able to select the option");
				break;
			}
		}

	}

	public void TaxPayerIdentification(String Certi_taxpayer_id,String Certi_backup,String Certi_us) {
		$(Certi_taxpayer_id_Yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		GlobalCap.selectRadioYesorNo(Certi_taxpayer_id_Yes, Certi_taxpayer_id_No, Certi_taxpayer_id);
		GlobalCap.selectRadioYesorNo(Certi_backup_Yes, Certi_backup_No, Certi_backup);
		GlobalCap.selectRadioYesorNo(Certi_us_Yes, Certi_us_No, Certi_us);
		$(Certi_us_Yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		if($(Pursuant_NY_Yes).isDisplayed()){
			$(Pursuant_NY_Yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
		$(Certi_NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
	}

}
