package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;


public class DI_Outlineofcoverage {

	By PremiumValue= By.xpath("//input[@id='flda_52']");
//	By OOCNext = By.xpath("//button[@id='btn_6' or @name='btn_6']");
//	By BOEOOCNext = By.xpath("//button[@id='btn_48' or @name='btn_48']");
	By Next=By.xpath("//button[text()='Next  ']");

	public void OOC(String state) {
		String[] states = new String[] { "California", "Georgia", "Idaho", "Montana", "Nevada", "New Hampshire",
				"North Dakota", "Oregon", "Texas", "Wisconsin", "Wyoming" };
		for (int i = 0; i <= states.length - 1; i++) {
			if (state.equalsIgnoreCase(states[i])) {
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}

		}

	}

	public void OOC2(String state, String AddProduct) {
		String[] states = new String[] { "California", "Georgia", "Idaho", "Montana", "Nevada", "New Hampshire",
				"North Dakota", "Oregon", "Texas", "Wisconsin", "Wyoming" };
		for (int i = 0; i <= states.length - 1; i++) {
			if (state.equalsIgnoreCase(states[i])) {
				if (AddProduct.equalsIgnoreCase("Yes")) {
					$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				}
			}

		}

	}
	 public void OOC3(String Product, String Premium){
		 if (Product.equalsIgnoreCase("Business Overhead Expense")){
			 $(PremiumValue).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Premium);
			 $(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		 }
		 
	 }

}
