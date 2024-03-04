package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class MMSD_DI_AltAdd {

	By ProdNext = By.xpath("//button[@id='btn_11' or @name='btn_11']");
	By RGSA_MB = By.xpath("//input[@id='flda_35' or @name='flda_35']");
	By RGSA_BP = By.xpath("//select[@id='lb_37' or @name='lb_37']");
	By RGSA_WP = By.xpath("//select[@id='lb_36' or @name='lb_36']");
	By RGSA_EmployerAmt = By.xpath("//label[text()='Employer Amount']//following-sibling::input[@id='flda_52']");
	By RGSA_EmployeeAmt = By.xpath("//label[text()='Employee Amount']//following-sibling::input[@id='flda_42']");
	By Banner = By.xpath("//h1[text()='Disability Income Product Information']");
	By RGSANext = By.xpath("//button[@id='btn_30' or @name='btn_30']");

	public void AddProduct(String Additionalprod, String RGSAMB, String RGSABP, String RGSAWP, String Employer,
			String Employee) {
		if (Additionalprod.equalsIgnoreCase("Yes") ) {
			$(RGSA_MB).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RGSAMB);
			$(RGSA_BP).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(RGSABP);
			$(RGSA_WP).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(RGSAWP);

			$(RGSA_EmployerAmt).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Employer);
			GlobalCap.sleep(1000);
			$(Banner).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(1000);
			$(RGSA_EmployeeAmt).shouldBe(Visible.exist, Duration.ofSeconds(70)).setValue(Employee);
			GlobalCap.sleep(2000);

			$(Banner).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(1000);
			$(RGSANext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}
}
