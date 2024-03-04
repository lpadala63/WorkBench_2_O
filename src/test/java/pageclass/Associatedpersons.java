package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;	

import commonutils.GlobalCap;

public class Associatedpersons extends GlobalCap {
	By Associatepersons = By.xpath("//h1[contains(text(),'Associated Persons')]");
	//Authorized Individual
	By AuthorizedIndividual_Trustee = By.xpath("//input[@alt_id='APerson_Auth']");
	By ControlPerson = By.xpath("//input[@alt_id='APerson_Control']");
	By BeneficialOwner = By.xpath("//input[@alt_id='APerson_Own']");
	By PercentageofOwnership = By.xpath("//input[@alt_id='APerson_OWNPercent']");
	
	By Authorized_Firstname = By.xpath("//input[@alt_id='APerson_FirstName']");
	By Authorized_Middlename = By.xpath("//input[@alt_id='APerson_MiddleName']");
	By Authorized_Lastname = By.xpath("//input[@alt_id='APerson_LastName']");
	By Authorized_Suffix = By.xpath("//select[@alt_id='APerson_Suffix']");
	By Authorized_BusinessTitle = By.xpath("//input[@alt_id='APerson_Title']");
	By Authorized_SSNTIN = By.xpath("//input[@alt_id='APerson_SSN']");
	By AuthorizedDOB_MM = By.xpath("//div[@id='div_18']/div/span/span[1]/input[1]");
	By AuthorizedDOB_DD = By.xpath("//div[@id='div_18']/div/span/span[1]/input[2]");
	By AuthorizedDOB_YYYY = By.xpath("//div[@id='div_18']/div/span/span[1]/input[3]");
	By Authorized_CountryOfCitizenShip = By.xpath("//select[@alt_id='APerson_Country']");
	By Authorized_CountryOfCitizenShipPleaseSpicfy = By.xpath("//input[@alt_id='APerson_CountryOther']");
	//Have you moved your residence in the past two years? = Yes
	
	By PO_BOX_Streetone = By.xpath("//input[@id='flda_7']");
	By PO_BOX_Streettwo = By.xpath("//input[@id='flda_8']");
	By PO_BOX_StreetThree = By.xpath("//input[@id='flda_9']");
	By PO_BOX_City = By.xpath("//input[@id='flda_11']");
	By PO_BOX_State = By.xpath("//select[@id='lb_50']");
	By PO_BOX_ZipCode = By.xpath("//input[@id='flda_59']");
	
	//Mailing Address
	By MailingAddress_Yes = By.xpath("//input[@id='rdo_16_1']");
	By MailingAddress_No = By.xpath("//input[@id='rdo_16_2']");
	By MailingAddress_Streetone = By.xpath("//input[@id='flda_38']");
	By MailingAddress_Streettwo = By.xpath("//input[@id='flda_39']");
	By MailingAddress_StreetThree = By.xpath("//input[@id='flda_40']");
	By MailingAddress_City = By.xpath("//input[@id='flda_36']");
	By MailingAddress_State = By.xpath("//select[@id='lb_37']");
	By MailingAddress_ZipCode = By.xpath("//input[@id='flda_41']");
	
	By Home_PhoneNumber = By.xpath("//input[@alt_id='APerson_HomePhone']");
	By Work_PhoneNumber = By.xpath("//input[@alt_id='APerson_WorkPhone']");
	
	//TypeOfIdefication
	By DriverLicense = By.xpath("//input[@id='rdo_32_1']");
	By Passport = By.xpath("//input[@id='rdo_32_2']");
	By IdNumber = By.xpath("//input[@alt_id='APerson_IDNum']");
	By StateofIssue = By.xpath("//select[@alt_id='APerson_IDState']");
	By EmploymentStatus = By.xpath("//select[@alt_id='APerson_Employ']");
	By EmploymentStatusOccupation = By.xpath("//input[@alt_id='APerson_Occupation']");
	
	By registeredwithoremployed_Iam = By.xpath("//input[@id='rdo_21_1']");
	By registeredwithoremployed_IamNot = By.xpath("//input[@id='rdo_21_2']");
	
	By FirmType = By.xpath("//select[@alt_id='APerson_FirmType']");
	By FirmNAme = By.xpath("//input[@alt_id='APerson_FirmName']");
	By registeredwithoremployed_PO_BOX_Streetone = By.xpath("//input[@id='flda_25']");
	By registeredwithoremployed_PO_BOX_Streettwo = By.xpath("//input[@id='flda_26']");
	By registeredwithoremployed_PO_BOX_StreetThree = By.xpath("//input[@id='flda_27']");
	By registeredwithoremployed_PO_BOX_City = By.xpath("//input[@id='flda_22']");
	By registeredwithoremployed_PO_BOX_State = By.xpath("//select[@id='lb_24']");
	By registeredwithoremployed_PO_BOX_ZipCode = By.xpath("//input[@id='flda_29']");
	
	
	By ControlPerson_Iam = By.xpath("//input[@id='rdo_46_1']");
	By ControlPerson_IamNot = By.xpath("//input[@id='rdo_46_2']");
	By affiliationControlPersonDirector = By.xpath("//input[@alt_id='APerson_Director']");
	By affiliationControlPersonPolicyMaking = By.xpath("//input[@alt_id='APerson_Exec']");
	By affiliationControlPersonDirector_10_Share = By.xpath("//input[@alt_id='APerson_Share']");
	By CUSIP_Symbol = By.xpath("//input[@alt_id='APerson_CUSIP']");
	By CompanyName = By.xpath("//input[@alt_id='APerson_SECCompany']");
	
	By ProvidingInformaton_Iam = By.xpath("//input[@alt_id='APerson_Trusted_1']");
	By ProvidingInformaton_IamNot = By.xpath("//input[@alt_id='APerson_Trusted_2']");
	
	By AccountNumberOne = By.xpath("//input[@alt_id='APerson_AccountNumber1']");
	By AccountNumberTwo = By.xpath("//input[@alt_id='APerson_AccountNumber2']");
	By AccountNumberThree = By.xpath("//input[@alt_id='APerson_AccountNumber3']");
	By AccountNumberFour = By.xpath("//input[@alt_id='APerson_AccountNumber4']");
	
	By MMLInvestor = By.xpath("//select[@alt_id='APerson_TrustType']");
	By MMLInvestorPleaseSpecify = By.xpath("//input[@alt_id='APerson_TrustSpecify']");
	By Trustdoesnotrequire_Yes = By.xpath("//input[@alt_id='APerson_TrustAnswer_1']");
	By Trustdoesnotrequire_No = By.xpath("//input[@alt_id='APerson_TrustAnswer_2']");
	By Trustdoesnotrequire_PleaseDescribe = By.xpath("//input[@alt_id='APerson_TrustDescribe']");
	By AdditionalHeadingClick=By.xpath("//label[@alt_id='lblAPerson_Add1']");
	By AdditionalAssociatePerson_Yes = By.xpath("//input[@alt_id='APerson_Add1_1']");
	By AdditionalAssociatePerson_No = By.xpath("//input[@alt_id='APerson_Add1_2']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	public void associatepersons(String AuthorizedIndividualTrustee,String Controlperson,String Beneficialowner,String Percentageofownership,String Authorized_firstname,String Authorized_middlename,String Authorized_lastname,
			String Authorized_suffix,String Authorized_businessTitle,String Authorized_sSNTIN,String AuthorizedDOB_mm,String AuthorizedDOB_dd,String AuthorizedDOB_yyyy,String Authorized_countryOfCitizenShip,String Authorized_countryOfCitizenShipPleaseSpicfy,
			String PO_BOX_Strt1,String PO_BOX_Strt2,String PO_BOX_Strt3,String PO_BOX_city,String PO_BOX_state,String PO_BOX_Zip,String MailingAddress,String MailingAddress_streetone,String MailingAddress_streettwo,String MailingAddress_streetThree,String MailingAddress_city,
			String MailingAddress_state,String MailingAddress_zipCode,String Home_Phonenumber,String Work_Phonenumber,String TypeOfIdentification,String idNumber,String stateofIssue,String employmentStatus,String employmentstatusOccupation,String RegesteredWithEmployed,
			String Firmtype,String FirmName,String Registeredwithoremployed_PO_BOX_Streetone,String Registeredwithoremployed_PO_BOX_Streettwo,String Registeredwithoremployed_PO_BOX_StreetThree,String Registeredwithoremployed_PO_BOX_City,String Registeredwithoremployed_PO_BOX_State,String Registeredwithoremployed_PO_BOX_ZipCode,
			String ControlPersonIamnot,String AffiliationControlPersonDirector,String AffiliationControlPersonPolicyMaking,String AffiliationControlPersonDirector_10_Share,String cUSIP_Symbol,String companyName,String ProvidingInformaton,String accountNumberOne,
			String accountNumberTwo,String accountNumberThree,String accountNumberFour,String MMLinvestor,String MMLInvestorpleaseSpecify,String Trustdoesnotrequir,String Trustdoesnotrequire_pleaseDescribe,String AdditionalAssociatePerson ){
		if($(Associatepersons).isDisplayed()){
			if(AuthorizedIndividualTrustee.equalsIgnoreCase("Yes")){
				$(AuthorizedIndividual_Trustee).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			if(Controlperson.equalsIgnoreCase("Yes")){
				$(ControlPerson).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
	        if(Beneficialowner.equalsIgnoreCase("Yes")){
	        	$(BeneficialOwner).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
	        	$(PercentageofOwnership).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Percentageofownership);
			}
	        $(Authorized_Firstname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Authorized_firstname);
	        $(Authorized_Middlename).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Authorized_middlename);
	        $(Authorized_Lastname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Authorized_lastname);
	        $(Authorized_Suffix).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Authorized_suffix);
	        $(Authorized_BusinessTitle).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Authorized_businessTitle);
	        $(Authorized_SSNTIN).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Authorized_sSNTIN);
	        $(AuthorizedDOB_MM).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(AuthorizedDOB_mm);
			$(AuthorizedDOB_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(AuthorizedDOB_dd);
			$(AuthorizedDOB_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(AuthorizedDOB_yyyy);
			$(Authorized_CountryOfCitizenShip).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Authorized_countryOfCitizenShip);
			if($(Authorized_CountryOfCitizenShipPleaseSpicfy).isDisplayed()){
				$(Authorized_CountryOfCitizenShipPleaseSpicfy).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Authorized_countryOfCitizenShipPleaseSpicfy);
			}
			
			
			$(PO_BOX_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_Strt1);
			$(PO_BOX_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_Strt2);
			$(PO_BOX_StreetThree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_Strt3);
			$(PO_BOX_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_city);
			$(PO_BOX_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(PO_BOX_state);
			$(PO_BOX_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + PO_BOX_Zip);
			
			if(MailingAddress.equalsIgnoreCase("Yes")){
				$(MailingAddress_Yes).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(MailingAddress_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MailingAddress_streetone);
				$(MailingAddress_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MailingAddress_streettwo);
				$(MailingAddress_StreetThree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MailingAddress_streetThree);
				$(MailingAddress_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MailingAddress_city);
				$(MailingAddress_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(MailingAddress_state);
				$(MailingAddress_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + MailingAddress_zipCode);
			}else{
				$(MailingAddress_No).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			$(Home_PhoneNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Home_Phonenumber);
			$(Work_PhoneNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Work_Phonenumber);
			if(TypeOfIdentification.equalsIgnoreCase("DriverLicense")){
				$(DriverLicense).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(TypeOfIdentification.equalsIgnoreCase("Passport")){
				$(Passport).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			$(IdNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(idNumber);
			$(StateofIssue).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(stateofIssue);
			$(EmploymentStatus).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(employmentStatus);
			if($(EmploymentStatusOccupation).isDisplayed()){
				$(EmploymentStatusOccupation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(employmentstatusOccupation);
			}
			// Registerd iamor iamnot
			
			if(RegesteredWithEmployed.equalsIgnoreCase("Iam")){
				$(registeredwithoremployed_Iam).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(FirmType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Firmtype);
				$(FirmNAme).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(FirmName);
				$(registeredwithoremployed_PO_BOX_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Registeredwithoremployed_PO_BOX_Streetone);
				$(registeredwithoremployed_PO_BOX_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Registeredwithoremployed_PO_BOX_Streettwo);
				$(registeredwithoremployed_PO_BOX_StreetThree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Registeredwithoremployed_PO_BOX_StreetThree);
				$(registeredwithoremployed_PO_BOX_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Registeredwithoremployed_PO_BOX_City);
				$(registeredwithoremployed_PO_BOX_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Registeredwithoremployed_PO_BOX_State);
				$(registeredwithoremployed_PO_BOX_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Registeredwithoremployed_PO_BOX_ZipCode);
			}else if(RegesteredWithEmployed.equalsIgnoreCase("IamNot")){
				$(registeredwithoremployed_IamNot).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			
			//"I am" and "I am not" "a control person or affiliate of a public company as defined in
			if (ControlPersonIamnot.equalsIgnoreCase("Iam")) {
				$(ControlPerson_Iam).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				
				if (AffiliationControlPersonDirector.equalsIgnoreCase("Yes")) {
					$(affiliationControlPersonDirector).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (AffiliationControlPersonPolicyMaking.equalsIgnoreCase("Yes")) {
					$(affiliationControlPersonPolicyMaking).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if (AffiliationControlPersonDirector_10_Share.equalsIgnoreCase("Yes")) {
					$(affiliationControlPersonDirector_10_Share).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				$(CUSIP_Symbol).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(cUSIP_Symbol);
				$(CompanyName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(companyName);
				
			}else{
				$(ControlPerson_IamNot).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			
			//providing Information
			if (ProvidingInformaton.equalsIgnoreCase("Iam")) {
				$(ProvidingInformaton_Iam).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else{
				$(ProvidingInformaton_IamNot).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			
			if($(AccountNumberOne).isDisplayed()){
				$(AccountNumberOne).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(accountNumberOne);
				$(AccountNumberTwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(accountNumberTwo);
				$(AccountNumberThree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(accountNumberThree);
				$(AccountNumberFour).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(accountNumberFour);
			}
			
			//MMLInvestor
			if($(MMLInvestor).isDisplayed()){
				$(MMLInvestor).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(MMLinvestor);
				if($(MMLInvestorPleaseSpecify).isDisplayed()){
					$(MMLInvestorPleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MMLInvestorpleaseSpecify);
				}
					
				GlobalCap.selectRadioYesorNo(Trustdoesnotrequire_Yes, Trustdoesnotrequire_No, Trustdoesnotrequir);
				if($(Trustdoesnotrequire_PleaseDescribe).isDisplayed()){
					$(Trustdoesnotrequire_PleaseDescribe).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Trustdoesnotrequire_pleaseDescribe);	
				}
				
			}
			if($(AdditionalAssociatePerson_Yes).isDisplayed()){
				$(AdditionalHeadingClick).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				if(AdditionalAssociatePerson.equalsIgnoreCase("Yes")){
					$(AdditionalAssociatePerson_Yes).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}else{
					$(AdditionalAssociatePerson_No).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
					
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
	
	}
	
}
