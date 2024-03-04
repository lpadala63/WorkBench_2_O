package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class ALt_Add_Both_Products extends GlobalCap {
	By TL_FaceAmount = By.xpath("//input[@alt_id='TL_FaceAmount']");
	By UL_FaceAmount = By.xpath("//input[@alt_id='UL_FaceAmount']");
	By UL_IntialPremium = By.xpath("//input[@id='flda_482']");
	By WL_FaceAmount = By.xpath("//input[@alt_id='WL_FaceAmount']");

	By PremiumRider_YES = By.xpath("//input[@alt_id='TL_WOP_1']");
	By PremiumRider_No = By.xpath("//input[@alt_id='TL_WOP_2']");

	By AutomaticPremiumLoan_YES = By.xpath("//input[@alt_id='WL_APL_1']");
	By AutomaticPremiumLoan_No = By.xpath("//input[@alt_id='WL_APL_2']");

	By UL_PlannedAmount = By.xpath("//input[@alt_id='UL_Planned_Premium']");
	By UL_unsheduledPremiumAmount = By.xpath("//input[@alt_id='UL_non_1035']");

	By WL_LoanRate_Fixed = By.xpath("//input[@alt_id='WL_LoanRate_1']");
	By WL_LoanRate_Adjustable = By.xpath("//input[@alt_id='WL_LoanRate_2']");

	By WL_DividentOption = By.xpath("//select[@alt_id='WL_DivOption']");

	By WLPremiumRider_YES = By.xpath("//input[@alt_id='WL_WOP_1']");
	By WLPremiumRider_No = By.xpath("//input[@alt_id='WL_WOP_2']");
	By Next = By.xpath("//button[contains(text(),'Next')]");

	public void Alternate(String ALT_ADD_Both, String altProduct, String Faceamount, String WavierOfPremiumRider,
			String AutomaticPremiumLoan, String LoanRate, String DividentOption_WL,String Alt_WLPremiumRider, String PlannedAmount_UL,String UL_intialpremium,
			String unsheduledPremium_UL) {
		if (ALT_ADD_Both.equalsIgnoreCase("Alternate")) {

			String[] Termproduct = new String[] { "Vantage Term 10", "Vantage Term 15", "Vantage Term 15 ECP",
					"Vantage Term 20", "Vantage Term 20 ECP", "Vantage Term 25", "Vantage Term 25 ECP",
					"Vantage Term 30", "Vantage Term 30 ECP", "Vantage Term ART" };
			for (int i = 0; i <= Termproduct.length - 1; i++) {
				if (altProduct.equalsIgnoreCase(Termproduct[i])) {
					$(TL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Faceamount);
					selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, WavierOfPremiumRider);
					selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, WavierOfPremiumRider);
				}
			}

			String[] Wholelifeproduct = new String[] { "Whole Life 10 Pay", "Whole Life 12 Pay", "Whole Life 15 Pay",
					"Whole Life 20 Pay", "Whole Life 100", "Whole Life 65", "Whole Life High Early Cash Value",
					"Whole Life 100" };
			for (int i = 0; i <= Wholelifeproduct.length - 1; i++) {
				if (altProduct.equalsIgnoreCase(Wholelifeproduct[i])) {
					$(WL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Faceamount);
					selectRadioYesorNo(AutomaticPremiumLoan_YES, AutomaticPremiumLoan_No, AutomaticPremiumLoan);
					if (LoanRate.equalsIgnoreCase("Fixed")) {
						$(WL_LoanRate_Fixed).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					} else {
						$(WL_LoanRate_Adjustable).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					}

					$(WL_DividentOption).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionContainingText(DividentOption_WL);
					GlobalCap.sleep(1000);
					if($(WLPremiumRider_YES).isDisplayed()){
						selectRadioYesorNo(WLPremiumRider_YES, WLPremiumRider_No, Alt_WLPremiumRider);
					}
				}
			}
			if (altProduct.equalsIgnoreCase("Universal Life Guard")) {
				$(UL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Faceamount);
				if($(UL_IntialPremium).isDisplayed()){
					$(UL_IntialPremium).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(UL_intialpremium);
				}
				
				$(UL_PlannedAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PlannedAmount_UL);
				$(UL_unsheduledPremiumAmount).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(unsheduledPremium_UL);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}

	public void AdditionalProduct(String ALT_ADD_Both, String altProduct, String Faceamount,
			String WavierOfPremiumRider, String AutomaticPremiumLoan, String LoanRate, String DividentOption_WL,String ADD_WLPremiumRider,
			String PlannedAmount_UL, String unsheduledPremium_UL,String Add_UL_intialpremium) {
		if (ALT_ADD_Both.equalsIgnoreCase("Additional")) {
		String[] Termproduct = new String[] { "Vantage Term 10", "Vantage Term 15", "Vantage Term 15 ECP",
				"Vantage Term 20", "Vantage Term 20 ECP", "Vantage Term 25", "Vantage Term 25 ECP", "Vantage Term 30",
				"Vantage Term 30 ECP", "Vantage Term ART" };
		
			for (int i = 0; i <= Termproduct.length - 1; i++) {
				if (altProduct.equalsIgnoreCase(Termproduct[i])) {
					$(TL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Faceamount);
					selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, WavierOfPremiumRider);
					selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, WavierOfPremiumRider);
				}
			}

			String[] Wholelifeproduct = new String[] { "Whole Life 10 Pay", "Whole Life 12 Pay", "Whole Life 15 Pay",
					"Whole Life 20 Pay", "Whole Life 100", "Whole Life 65", "Whole Life High Early Cash Value",
					"Whole Life 100" };
			for (int i = 0; i <= Wholelifeproduct.length - 1; i++) {
				if (altProduct.equalsIgnoreCase(Wholelifeproduct[i])) {
					$(WL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Faceamount);
					selectRadioYesorNo(AutomaticPremiumLoan_YES, AutomaticPremiumLoan_No, AutomaticPremiumLoan);
					if (LoanRate.equalsIgnoreCase("Fixed")) {
						$(WL_LoanRate_Fixed).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					} else {
						$(WL_LoanRate_Adjustable).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					}

					$(WL_DividentOption).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionContainingText(DividentOption_WL);
					if($(WLPremiumRider_YES).isDisplayed()){
						selectRadioYesorNo(WLPremiumRider_YES, WLPremiumRider_No, ADD_WLPremiumRider);
					}
				}
			}
			if (altProduct.equalsIgnoreCase("Universal Life Guard")) {
				$(UL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Faceamount);
				if($(UL_IntialPremium).isDisplayed()){
					$(UL_IntialPremium).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Add_UL_intialpremium);
				}
				$(UL_PlannedAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PlannedAmount_UL);
				$(UL_unsheduledPremiumAmount).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(unsheduledPremium_UL);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}

	public void Both(String ALT_ADD_Both, String altProduct, String alt_Faceamount, String alt_WavierOfPremiumRider,
			String alt_AutomaticPremiumLoan, String alt_LoanRate, String alt_DividentOption_WL,String Alt_WLPremiumRider,
			String alt_PlannedAmount_UL, String alt_unsheduledPremium_UL,String Alt_UL_intialpremium, String add_Product, String add_Faceamount,
			String add_WavierOfPremiumRider, String add_AutomaticPremiumLoan, String add_LoanRate,
			String add_DividentOption_WL,String ADD_WLPremiumRider, String add_PlannedAmount_UL, String add_unsheduledPremium_UL,String Add_UL_intialpremium) {
		ALt_Add_Both_Products both = new ALt_Add_Both_Products();
		if (ALT_ADD_Both.equalsIgnoreCase("Both")) {
			String[] Termproduct = new String[] { "Vantage Term 10", "Vantage Term 15", "Vantage Term 15 ECP",
					"Vantage Term 20", "Vantage Term 20 ECP", "Vantage Term 25", "Vantage Term 25 ECP",
					"Vantage Term 30", "Vantage Term 30 ECP", "Vantage Term ART" };
			for (int i = 0; i <= Termproduct.length - 1; i++) {
				if (altProduct.equalsIgnoreCase(Termproduct[i])) {
					$(TL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(alt_Faceamount);
					selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, alt_WavierOfPremiumRider);
					selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, alt_WavierOfPremiumRider);
					
				}
			}

			String[] Wholelifeproduct = new String[] { "Whole Life 10 Pay", "Whole Life 12 Pay", "Whole Life 15 Pay",
					"Whole Life 20 Pay", "Whole Life 100", "Whole Life 65", "Whole Life High Early Cash Value",
					"Whole Life 100" };
			for (int i = 0; i <= Wholelifeproduct.length - 1; i++) {
				if (altProduct.equalsIgnoreCase(Wholelifeproduct[i])) {
					$(WL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(alt_Faceamount);
					selectRadioYesorNo(AutomaticPremiumLoan_YES, AutomaticPremiumLoan_No, alt_AutomaticPremiumLoan);
					if (alt_LoanRate.equalsIgnoreCase("Fixed")) {
						$(WL_LoanRate_Fixed).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					} else {
						$(WL_LoanRate_Adjustable).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					}

					$(WL_DividentOption).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.selectOptionContainingText(alt_DividentOption_WL);
					if($(WLPremiumRider_YES).isDisplayed()){
						selectRadioYesorNo(WLPremiumRider_YES, WLPremiumRider_No, Alt_WLPremiumRider);
					}
				}
			}
			if (altProduct.equalsIgnoreCase("Universal Life Guard")) {
				$(UL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(alt_Faceamount);
				if($(UL_IntialPremium).isDisplayed()){
					$(UL_IntialPremium).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Alt_UL_intialpremium);
				}
				$(UL_PlannedAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(alt_PlannedAmount_UL);
				$(UL_unsheduledPremiumAmount).shouldBe(Visible.exist, Duration.ofSeconds(30))
						.setValue(alt_unsheduledPremium_UL);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			
			
			
			
			String[] addTermproduct = new String[] { "Vantage Term 10", "Vantage Term 15", "Vantage Term 15 ECP",
					"Vantage Term 20", "Vantage Term 20 ECP", "Vantage Term 25", "Vantage Term 25 ECP", "Vantage Term 30",
					"Vantage Term 30 ECP", "Vantage Term ART" };
			
				for (int i = 0; i <= addTermproduct.length - 1; i++) {
					if (add_Product.equalsIgnoreCase(addTermproduct[i])) {
						$(TL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(add_Faceamount);
						GlobalCap.sleep(500);
						selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, add_WavierOfPremiumRider);
						selectRadioYesorNo(PremiumRider_YES, PremiumRider_No, add_WavierOfPremiumRider);
					}
				}

				String[] addWholelifeproduct = new String[] { "Whole Life 10 Pay", "Whole Life 12 Pay", "Whole Life 15 Pay",
						"Whole Life 20 Pay", "Whole Life 100", "Whole Life 65", "Whole Life High Early Cash Value",
						"Whole Life 100" };
				for (int i = 0; i <= addWholelifeproduct.length - 1; i++) {
					if (add_Product.equalsIgnoreCase(addWholelifeproduct[i])) {
						$(WL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(add_Faceamount);
						selectRadioYesorNo(AutomaticPremiumLoan_YES, AutomaticPremiumLoan_No, add_AutomaticPremiumLoan);
						if (add_LoanRate.equalsIgnoreCase("Fixed")) {
							$(WL_LoanRate_Fixed).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
						} else {
							$(WL_LoanRate_Adjustable).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
						}

						$(WL_DividentOption).shouldBe(Visible.exist, Duration.ofSeconds(30))
								.selectOptionContainingText(add_DividentOption_WL);
						if($(WLPremiumRider_YES).isDisplayed()){
							selectRadioYesorNo(WLPremiumRider_YES, WLPremiumRider_No, ADD_WLPremiumRider);
						}
					}
				}
				if (add_Product.equalsIgnoreCase("Universal Life Guard")) {
					$(UL_FaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(add_Faceamount);
					if($(UL_IntialPremium).isDisplayed()){
						$(UL_IntialPremium).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Add_UL_intialpremium);
					}
					$(UL_PlannedAmount).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(add_PlannedAmount_UL);
					$(UL_unsheduledPremiumAmount).shouldBe(Visible.exist, Duration.ofSeconds(30))
							.setValue(add_unsheduledPremium_UL);
				}
				$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
	}
}
