
package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class CConeCertification extends GlobalCap {
	By Certi_Certi1 = By.xpath("//input[@id='cb_15']");
    By Certi_Certi2 = By.xpath("//input[@id='cb_14']");
    By Certi_Certi3 = By.xpath("//input[@id='cb_13']");
    By Certi_Certi4 = By.xpath("//input[@id='cb_12']");
    By Certi_taxpayer_id_Yes = By.xpath("//label[contains(text(),'Taxpayer Identification Number')]//following::input[@alt_id='AC_TaxQ1_1']");
    By Certi_taxpayer_id_No = By.xpath("//label[contains(text(),'Taxpayer Identification Number')]//following::input[@alt_id='AC_TaxQ1_2']");
    By Certi_backupwithholding_id_Yes = By.xpath("//label[contains(text(),'backup withholding')]//following::input[@alt_id='AC_TaxQ2_1']");
    By Certi_backupwithholding_id_No = By.xpath("//label[contains(text(),'backup withholding')]//following::input[@alt_id='AC_TaxQ2_2']");
    By Certi_IamUS_Yes = By.xpath("//label[contains(text(),'I am a U.S')]//following::input[@alt_id='AC_TaxQ3_1']");
    By Certi_IamUs_No = By.xpath("//label[contains(text(),'I am a U.S')]//following::input[@alt_id='AC_TaxQ3_2']");
    By Certi_backup_Yes = By.xpath("//*[@id='rdo_2_2']");
    By Certi_us_Yes = By.xpath("//*[@id='rdo_1_2']");
    By Certi_BACK = By.xpath("//*[@id='btn_20']");
    By NEXT = By.xpath("//button[contains(text(),'Next')]");



   JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;
    
	public void salesCertification(String State, String salesofcertification, String Certi_taxpayer_id,
			String Certi_backupwithholding_id, String Certi_IamUs) {

		if (!State.equalsIgnoreCase("New York")) {
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
		if (State.equalsIgnoreCase("New York")) {
			$(Certi_Certi1).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		selectRadioYesorNo(Certi_taxpayer_id_Yes, Certi_taxpayer_id_No, Certi_taxpayer_id);
		selectRadioYesorNo(Certi_backupwithholding_id_Yes, Certi_backupwithholding_id_No, Certi_backupwithholding_id);
		selectRadioYesorNo(Certi_IamUS_Yes, Certi_IamUs_No, Certi_IamUs);
		$(NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}



}


