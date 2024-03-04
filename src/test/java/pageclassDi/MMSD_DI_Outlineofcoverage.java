package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

public class MMSD_DI_Outlineofcoverage {

	By OOCNext = By.xpath("//button[@id='btn_6' or @name='btn_6']");

	public void OOC(String state) {
		String[] states = new String[] { "California", "Georgia", "Idaho", "Montana", "Nevada", "New Hampshire",
				"North Dakota", "Oregon", "Texas", "Wisconsin", "Wyoming" };
		for (int i = 0; i <= states.length - 1; i++) {
			if (state.equalsIgnoreCase(states[i])) {
				$(OOCNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}

		}

	}

	public void OOC2(String state, String AddProduct) {
		String[] states = new String[] { "California", "Georgia", "Idaho", "Montana", "Nevada", "New Hampshire",
				"North Dakota", "Oregon", "Texas", "Wisconsin", "Wyoming" };
		for (int i = 0; i <= states.length - 1; i++) {
			if (state.equalsIgnoreCase(states[i])) {
				if (AddProduct.equalsIgnoreCase("Yes")) {
					$(OOCNext).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				}
			}

		}

	}

}
