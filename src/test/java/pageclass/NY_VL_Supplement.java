package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class NY_VL_Supplement {
	By AccountHolderInsuranceHoldings_Heading=By.xpath("//span[text()='Account Holder Insurance Holdings']");
	By AccountHolder_VULCashMarketValue = By.xpath("//input[@alt_id='NYVL_CashValue']");
	By AccountHolder_VULFaceAmount = By.xpath("//input[@alt_id='NYVL_FaceAmount']");
	By AccountHolder_PermanentNon_VULCashMarketValue = By.xpath("//input[@alt_id='NYVL_NonVLCashValue']");
	By AccountHolder_PermanentNon_VULFaceAmount = By.xpath("//input[@alt_id='NYVL_NonVLFaceAmount']");
	By AccountHolder_TermLifeFaceAmount = By.xpath("//input[@alt_id='NYVL_TermFaceAmount']");
	
	By AccountHolderLiabilitieObligations_Heading=By.xpath("//span[text()='Account Holder Liabilities & Obligations']");
	By SecuredLiabilities_Obligations = By.xpath("//button[@id='grdx47_addRowButton']");
	By SecuredLiabilities_ObligationsType = By.xpath("//select[@id='lb_18']");
	By SecuredLiabilities_Obligations_OutstandingAmount = By.xpath("//input[@alt_id='OutstandingAmount']");
	By SecuredLiabilities_Obligations_AnticiptaedDuration = By.xpath("//input[@alt_id='Duration']");
	By SecuredLiabilities_Obligations_Save = By.xpath("//button[@alt_id='btnSave']");
	
	By UnSecuredLiabilities_Obligations = By.xpath("//button[@id='grdx45_addRowButton']");
	By UnSecuredLiabilities_ObligationsType = By.xpath("//select[@alt_id='Liabilities']");
	By UnSecuredLiabilities_Obligations_OutstandingAmount = By.xpath("//input[@alt_id='OutstandingAmount']");
	By UnSecuredLiabilities_Obligations_AnticiptaedDuration = By.xpath("//input[@alt_id='Duration']");
	By UnSecuredLiabilities_Obligations_Save = By.xpath("//button[@alt_id='btnSave']");
	
	By VariableLifeInsuranceNon_GuaranteedElements_Heading=By.xpath("//span[text()='Variable Life Insurance Non-Guaranteed Elements']");
	By ClientawareOfallPolicies_Yes = By.xpath("//input[@alt_id='NYVL_NonGuaranteed_1']");
	By ClientawareOfallPolicies_No = By.xpath("//input[@alt_id='NYVL_NonGuaranteed_2']");
	
	
	By AdditionalClientInformationRationale_Heading=By.xpath("//span[text()='Additional Client Information & Rationale']");
	By AditionalClient_basisofRecommendiation= By.xpath("//textarea[@id='flda_56']");
	By AditionalClient_UnfavorableConsideration = By.xpath("//textarea[@id='flda_55']");
	By AdditionalClient_PleaseProvide = By.xpath("//textarea[@id='flda_56']");

	By NY_VUL_Heading= By.xpath("//h1[text()='NY VL Supplement']");
	By LBPageFrame = By.xpath("//iframe[@id='modalIframe']");
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	public void AccountHolderInsuranceHoldings(String NYvUL_CashMarketValue,String NYvUL_AccountHolderFaceAmount,String NYvUL_PermanentNon_VULCashMarketValue,String NYvUL_PermanentNon_VULFaceAmount,String NYvUL_TermLifeFaceAmount){
	if($(NY_VUL_Heading).isDisplayed()){
		$(AccountHolder_VULCashMarketValue).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_CashMarketValue);
		$(AccountHolder_VULFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_AccountHolderFaceAmount);
		$(AccountHolder_PermanentNon_VULCashMarketValue).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_PermanentNon_VULCashMarketValue);
		$(AccountHolder_PermanentNon_VULFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_PermanentNon_VULFaceAmount);
		$(AccountHolder_TermLifeFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_TermLifeFaceAmount);
	
		
	}
		
	}
	
	public void AccountHolderLiabilitiesObligations(String NYvul_SecuredLiabilities_ObligationsType,String NYvUL_SecuredLiabilities_Obligations_OutstandingAmount,String NYvUL_Obligations_AnticiptaedDuration ){
		if($(NY_VUL_Heading).isDisplayed()){
			$(SecuredLiabilities_Obligations).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(2000);
			HooksTest.idriver.switchTo().defaultContent();
			GlobalCap.sleep(2000);
			//HooksTest.idriver.switchTo().frame(0);
			$(LBPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(60));
			HooksTest.idriver.switchTo().frame($(LBPageFrame));
			GlobalCap.sleep(2000);
			$(SecuredLiabilities_ObligationsType).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionByValue(NYvul_SecuredLiabilities_ObligationsType);
			$(SecuredLiabilities_Obligations_OutstandingAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_SecuredLiabilities_Obligations_OutstandingAmount);
			$(SecuredLiabilities_Obligations_AnticiptaedDuration).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_Obligations_AnticiptaedDuration);
			$(SecuredLiabilities_Obligations_Save).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
			HooksTest.idriver.switchTo().defaultContent();
			GlobalCap.sleep(2000);
			
			$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(75));
			HooksTest.idriver.switchTo().frame($(ciPageFrame));
			GlobalCap.sleep(2000);
		}
		
	}
	
	public void AccountHolderLiabilitiesObligationsTwo(String NYvul_UnSecuredLiabilities_ObligationsType,String NYvUL_UnSecuredLiabilities_Obligations_OutstandingAmount,String NYvUL_UnObligations_AnticiptaedDuration ){
		if($(NY_VUL_Heading).isDisplayed()){
			$(UnSecuredLiabilities_Obligations).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			GlobalCap.sleep(2000);
			HooksTest.idriver.switchTo().defaultContent();
			GlobalCap.sleep(2000);
			$(LBPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(60)).shouldBe(Visible.exist,Duration.ofSeconds(75));
			HooksTest.idriver.switchTo().frame($(LBPageFrame));
			GlobalCap.sleep(2000);
			$(UnSecuredLiabilities_ObligationsType).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionByValue(NYvul_UnSecuredLiabilities_ObligationsType);
			$(UnSecuredLiabilities_Obligations_OutstandingAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_UnSecuredLiabilities_Obligations_OutstandingAmount);
			$(UnSecuredLiabilities_Obligations_AnticiptaedDuration).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_UnObligations_AnticiptaedDuration);
			$(UnSecuredLiabilities_Obligations_Save).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
			HooksTest.idriver.switchTo().defaultContent();
			GlobalCap.sleep(2000);
			$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(75));
			HooksTest.idriver.switchTo().frame($(ciPageFrame));
			GlobalCap.sleep(2000);
		}
	}
	
	public void AdditionalClientInformation(String ClientawareOfallPolicies,String NYvUL_AditionalClient_basisofRecommendiation,String NYvUL_AditionalClient_UnfavorableConsideration){
		if($(NY_VUL_Heading).isDisplayed()){
			GlobalCap.selectRadioYesorNo(ClientawareOfallPolicies_Yes, ClientawareOfallPolicies_No, ClientawareOfallPolicies);
			$(AditionalClient_basisofRecommendiation).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_AditionalClient_basisofRecommendiation);
			$(AditionalClient_UnfavorableConsideration).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(NYvUL_AditionalClient_UnfavorableConsideration);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();	
		}
				
	}
}
