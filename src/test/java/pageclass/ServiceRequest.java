package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

public class ServiceRequest {
	By PolicyNumber1 = By.xpath("//input[@alt_id='SR_PolicyNumber1']");
	By PolicyNumber2 = By.xpath("//input[@alt_id='PolicyNumber2']");
	By PolicyNumber3 = By.xpath("//input[@alt_id='PolicyNumber3']");
	By PolicyNumber4 = By.xpath("//input[@alt_id='PolicyNumber4']");
	By PolicyNumber5 = By.xpath("//input[@alt_id='PolicyNumber5']");
	By InsuredAbovePolicy = By.xpath("//select[@alt_id='SR_InsuredAbovePolicy']");
	By FirstName = By.xpath("//input[@alt_id='SR_Insured_FirstName']");
	By Middlename = By.xpath("//input[@alt_id='SR_Insured_MiddleName']");
	By LastName = By.xpath("//input[@alt_id='SR_Insured_LastName']");
	By Suffix_DD = By.xpath("//select[@alt_id='SR_Insured_Suffix']");
	By WDF_ALIR_PP = By.xpath("//input[@alt_id='SR_WDF_ALIR_PP']");
	By WDF_PaidUpAdditions = By.xpath("//input[@alt_id='SR_WDF_PaidUpAdditions']");
	By WDF_DividendAccum = By.xpath("//input[@alt_id='SR_WDF_DividendAccum']");
	By WDF_ALIRDividends = By.xpath("//input[@alt_id='SR_WDF_ALIRDividends']");
	By WDF_AnnuityPaidUpAdd = By.xpath("//input[@alt_id='SR_WDF_AnnuityPaidUpAdd']");
	By WDF_AddBeneRider = By.xpath("//input[@alt_id='SR_WDF_AddBeneRider']");
	By WDF_FlexTermRider = By.xpath("//select[@alt_id='SR_WDF_FlexTermRider']");
	By WDF_AddBeneRiderAck = By.xpath("//input[@alt_id='SR_WDF_AddBeneRiderAck']");
	By WDF_Amount_Max = By.xpath("//input[@alt_id='SR_WDF_Amount_1']");
	By WDF_SpecificAmount_Max = By.xpath("//input[@alt_id='SR_WDF_Amount_2']");
	By WDF_AmountCurrency = By.xpath("//input[@alt_id='SR_WDF_AmountCurrency']");
	By Heading = By.xpath("//h1[contains(text(),'Service Request')]");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	public void serviceRequestDetails(String PolicyNo1,String PolicyNo2,String PolicyNo3,String PolicyNo4,String PolicyNo5,String firstname,String middlename,
			String lastname,String suffix,String WithDrawDividentform,String Amount,String SpecifiedAmount){
		if($(Heading).isDisplayed()){
			$(PolicyNumber1).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(PolicyNo1);
			$(PolicyNumber2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PolicyNo2);
			$(PolicyNumber3).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PolicyNo3);
			$(PolicyNumber4).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PolicyNo4);
			$(PolicyNumber5).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PolicyNo5);
			$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(firstname);
			$(Middlename).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(middlename);
			$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(lastname);
			$(Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(suffix);
			if(WithDrawDividentform.equalsIgnoreCase("ALIR Purchase Payments")){
				$(WDF_ALIR_PP).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(WithDrawDividentform.equalsIgnoreCase("Paid-up Additions")){
				$(WDF_PaidUpAdditions).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(WithDrawDividentform.equalsIgnoreCase("Dividend Accumulations")){
				$(WDF_DividendAccum).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(WithDrawDividentform.equalsIgnoreCase("ALIR Dividends")){
				$(WDF_ALIRDividends).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(WithDrawDividentform.equalsIgnoreCase("Annuity Paid-up Additions")){
				$(WDF_AnnuityPaidUpAdd).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(WithDrawDividentform.equalsIgnoreCase("Additional Benefit Rider (ABR)")){
				$(WDF_AddBeneRider).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(WDF_AddBeneRiderAck).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();		
			}else if(WithDrawDividentform.equalsIgnoreCase("Flexible Term Rider")){
				$(WDF_FlexTermRider).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			
			if(Amount.equalsIgnoreCase("Maximum")){
				$(WDF_Amount_Max).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else{
				$(WDF_SpecificAmount_Max).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(WDF_AmountCurrency).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(SpecifiedAmount);
				
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
		}
		
	}

}
