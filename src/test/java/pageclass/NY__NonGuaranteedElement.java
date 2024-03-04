package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

public class NY__NonGuaranteedElement {
	By illustraton =By.xpath("//input[@id='cb_13']");
	By Deathbenefittoguaranteed= By.xpath("//input[@id='cb_4']");
	By guaranteesTerminate= By.xpath("//input[@id='cb_2']");
	By PoliciesguaranteesTerminate= By.xpath("//input[@id='cb_1']");
	
	
	By longTermcareExpensesorforotherpurposes= By.xpath("//input[@alt_id='LS_Product_NGE_WL_CASH']");
	By dividendsarenotguaranteed= By.xpath("//input[@alt_id='LS_Product_NGE_WL_DIV']");
	By shownintheillustration= By.xpath("//input[@alt_id='LS_Product_NGE_WL_LDIV']");
	By dividendswhicharenotguaranteed= By.xpath("//input[@alt_id='LS_Product_NGE_WL_1015']");
	
	By longtermcareBenefitFrFouryears= By.xpath("//input[@alt_id='LS_Product_NGE_WL_CC1_LTC']"); //for cc1NY
	By AslongAsIllustrated= By.xpath("//input[@alt_id='LS_Product_NGE_WL_CC1_DIV']");  //for cc1NY
	
	By Non_GuaranteedElementsforAlternateProduct= By.xpath("//strong[contains(text(),'Non-Guaranteed Elements for the Alternate Product')]");
	
	By WillIncreaseEachYear= By.xpath("//input[@alt_id='LS_ProductAlt_NGE_TL_LGP']");
	By MaynotbeInsurancable= By.xpath("//input[@alt_id='LS_ProductAlt_NGE_TL_NP']");
	
	By Non_GuaranteedElementsforAdditionalProduct= By.xpath("//strong[contains(text(),'Non-Guaranteed Elements for the Additional Product')]");
	
	By Expensesforpurpose= By.xpath("//input[@alt_id='LS_ProductAdd_NGE_WL_CASH']");
	By notguaranteed= By.xpath("//input[@alt_id='LS_ProductAdd_NGE_WL_DIV']");
	By showninillustration= By.xpath("//input[@alt_id='LS_ProductAdd_NGE_WL_LDIV']");
	
	
	By BenefittobeGuaranteed= By.xpath("//input[@id='cb_52']");
	By CashValuesguaranteeswillterminate= By.xpath("//input[@id='cb_50']");
	By EventThePolicysguaranteesterminate= By.xpath("//input[@id='cb_49']");
	
	By textareaone= By.xpath("//textarea[@alt_id='LS_Product_PS_FavSuit']");
	By tesxtareatwo= By.xpath("//textarea[@alt_id='LS_Product_PS_UnFavSuit']");
	By textareathree= By.xpath("//textarea[@alt_id='LS_Product_PS_FactAly']");
	
	
	//ProducerSummary
	By producefsummaryAlternate=By.xpath("//strong[contains(text(),'Producer Suitability Summary for the Alternate Product')]");
	By Alt_textareaone= By.xpath("//textarea[@id='flda_40']");
	By Alt_tesxtareatwo= By.xpath("//textarea[@id='flda_39']");
	By Alt_textareathree= By.xpath("//textarea[@id='flda_38']");
	By producefsummaryAdditional=By.xpath("//strong[contains(text(),'Producer Suitability Summary for the Additional Product')]");
	By Add_textareaone= By.xpath("//textarea[@id='flda_37']");
	By Add_tesxtareatwo= By.xpath("//textarea[@id='flda_36']");
	By Add_textareathree= By.xpath("//textarea[@id='flda_35']");
	
	By Next=By.xpath("//button[text()='Next  ']");
	
	public void nonFuaranteeedelement(String state){
		if (state.equalsIgnoreCase("New York")) {
			
			//UL Starts
			if($(Deathbenefittoguaranteed).isDisplayed()){
				$(Deathbenefittoguaranteed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if($(guaranteesTerminate).isDisplayed()){
				$(guaranteesTerminate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			if($(PoliciesguaranteesTerminate).isDisplayed()){
				$(PoliciesguaranteesTerminate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			//ulEnds
			
			if($(longTermcareExpensesorforotherpurposes).isDisplayed()){
				$(longTermcareExpensesorforotherpurposes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
		if($(dividendsarenotguaranteed).isDisplayed()){
			$(dividendsarenotguaranteed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if($(shownintheillustration).isDisplayed()){
			$(shownintheillustration).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if($(illustraton).isDisplayed()){
			$(illustraton).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if ($(dividendswhicharenotguaranteed).isDisplayed()) {//for wl10apay
			$(dividendswhicharenotguaranteed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if ($(longtermcareBenefitFrFouryears).isDisplayed()) {//for cc1NY
			$(longtermcareBenefitFrFouryears).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if ($(AslongAsIllustrated).isDisplayed()) {//for cc1NY
			$(AslongAsIllustrated).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if($(Non_GuaranteedElementsforAlternateProduct).isDisplayed()){
			$(WillIncreaseEachYear).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(MaynotbeInsurancable).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if($(Non_GuaranteedElementsforAdditionalProduct).isDisplayed()){
			$(Expensesforpurpose).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(notguaranteed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(showninillustration).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		/*
		if($(Non_GuaranteedElementsforAlternateProduct).isDisplayed()){
			$(WillIncreaseEachYear).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(MaynotbeInsurancable).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			
		}
		if($(Non_GuaranteedElementsforAdditionalProduct).isDisplayed()){
			$(BenefittobeGuaranteed).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(CashValuesguaranteeswillterminate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(EventThePolicysguaranteesterminate).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			
		}*/
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	}
	public void productsuitability(String state,String txtareaone,String txtareaTwo,String txtareaThree,String Alt_TextAreaone,String Alt_Textareatwo,String Alt_TextAreathree,
			String Add_TextAreaone,String Add_Textareatwo,String Add_Textareathree ){
		if (state.equalsIgnoreCase("New York")) {
		$(textareaone).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(txtareaone);
		$(tesxtareatwo).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(txtareaTwo);
		$(textareathree).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(txtareaThree);
		if($(producefsummaryAlternate).isDisplayed()){
			$(Alt_textareaone).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_TextAreaone);
			$(Alt_tesxtareatwo).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_Textareatwo);
			$(Alt_textareathree).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Alt_TextAreathree);
		}
		if($(producefsummaryAdditional).isDisplayed()){
			$(Add_textareaone).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_TextAreaone);
			$(Add_tesxtareatwo).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_Textareatwo);
			$(Add_textareathree).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Add_Textareathree);
		}
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
	}
}
 