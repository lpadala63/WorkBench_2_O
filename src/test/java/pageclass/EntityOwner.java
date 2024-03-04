package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class EntityOwner extends GlobalCap{
	
	
	By Ent_SameAddressAsPI = By.xpath("//input[@alt_id='Ent_SameAddressAsPI']");
	By RESADDStreet1 = By.xpath("//input[@alt_id='Ent_ADDR_Line1']");
	By RESADDStreet2 = By.xpath("//input[@alt_id='Ent_ADDR_Line2']");
	By RESADDCity = By.xpath("//input[@alt_id='Ent_ADDR_City']");
	By RESADDstate = By.xpath("//select[@alt_id='Ent_ADDR_State']");
	By RESADDZIP = By.xpath("//input[@alt_id='Ent_ADDR_Zip']");

	By MailAddSameasResADD_yes = By.xpath("//input[@alt_id='Ent_ResSameAsMailing_1']");
	By MailAddSameasResADD_No = By.xpath("//input[@alt_id='Ent_ResSameAsMailing_2']");

	By Mailing_RESADDStreet1 = By.xpath("//input[@alt_id='Ent_MAILADDR_Line1']");
	By Mailing_RESADDStreet2 = By.xpath("//input[@alt_id='Ent_MAILADDR_Line2']");
	By Mailing_RESADDCity = By.xpath("//input[@alt_id='Ent_MAILADDR_City']");
	By Mailing_RESADDstate = By.xpath("//select[@alt_id='Ent_MAILADDR_State']");
	By Mailing_RESADDZIP = By.xpath("//input[@alt_id='Ent_MAILADDR_Zip']");
	
	By SignerLabel = By.xpath("//span[text()='Authorized Signer Information']");
	By SignerTitle = By.xpath("//input[@id='flda_91']");
	By signerSoleOfficer_Yes = By.xpath("//input[@id='rdo_95_1']");
	By signerSoleOfficer_No = By.xpath("//input[@id='rdo_95_2']");
	By SignerFirstname = By.xpath("//input[@id='flda_78']");
	By SignerLasstname = By.xpath("//input[@id='flda_74']");
	
	
	By SSN = By.xpath("//input[@alt_id='Ent_SSNTINInd_1']");
	By SSNEINtextbox = By.xpath("//input[@alt_id='Ent_SSNTIN']");
	By EIN = By.xpath("//input[@alt_id='Ent_SSNTINInd_2']");
	By Headingaddr = By.xpath("//select[@alt_id='Ent_OwnType']//following::span[text()='Address']");
	By HeadingEntr = By.xpath("//h1[contains(text(),'Entity Owner')]");
	
	By EntityType = By.xpath("//select[@alt_id='Ent_OwnType']");
	By 	SpecificEntityTypeInc = By.xpath("//select[@alt_id='Ent_EntityTypeInc']");
	By 	SpecificEntitynonTypeInc = By.xpath("//select[@alt_id='Ent_EntityTypeNonInc']");
	By Ent_FullName = By.xpath("//input[@alt_id='Ent_FullName']");
	By ProposedInsuredDirector_Yes  = By.xpath("//input[@alt_id='Ent_EntityDirector_1']");
	By ProposedInsuredDirector_No = By.xpath("//input[@alt_id='Ent_EntityDirector_2']");
	By EntityMaxFaceAmount = By.xpath("//input[@alt_id='Ent_EntityMaxFaceAmount']");
	By monthTrust = By.xpath("//div[@id='div_15']//div//span//span[1]//input[1]");
	By DateofTrust = By.xpath("//div[@id='div_15']//div//span//span[1]//input[2]");
	By yearofTrust = By.xpath("//div[@id='div_15']//div//span//span[1]//input[3]");
	By Revocable  = By.xpath("//input[@alt_id='Ent_Trust_Type_1']");
	By Irrevocable = By.xpath("//input[@alt_id='Ent_Trust_Type_2']");
	By UsEntity = By.xpath("//input[@alt_id='Ent_CitizenshipType_1']");
	By ForeignEntity = By.xpath("//input[@alt_id='Ent_CitizenshipType_2']");
	
	//Apex
	By Businessphoneno = By.xpath("//input[@alt_id='Ent_BusinessPhone']");
	By BusinessType = By.xpath("//select[@alt_id='Ent_BusinessPhoneType']");
	
	
	
	
	
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	public void Entityowner(String Entitytype,String SpecificEntityType,String EntityName,String ProposedInsuredDirector,String EntityMaxfaceamount,
			String MM,String DD,String YYYY,String TypeofTrust){
		
		if ($(EntityType).isDisplayed()) {
			if($(EntityType).isDisplayed() && $(EntityType).isEnabled()){
				$(EntityType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Entitytype);
			}
			if (Entitytype.equalsIgnoreCase("Incorporated Entity, its successors or assigns")) {
				if($(SpecificEntityTypeInc).isDisplayed()){
					$(SpecificEntityTypeInc).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(SpecificEntityType);
				}
				if(SpecificEntityType.equalsIgnoreCase("Charitable Organization")){
					$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
				}else{
					$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
					selectRadioYesorNo(ProposedInsuredDirector_Yes, ProposedInsuredDirector_No, ProposedInsuredDirector);
					$(EntityMaxFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityMaxfaceamount);
				}
			}
			else if (Entitytype.equalsIgnoreCase("Non-Incorporated Entity")){
				$(SpecificEntitynonTypeInc).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(SpecificEntityType);
				if(SpecificEntityType.equalsIgnoreCase("Charitable Organization")){
					$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
				}else{
					$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
					selectRadioYesorNo(ProposedInsuredDirector_Yes, ProposedInsuredDirector_No, ProposedInsuredDirector);
					$(EntityMaxFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityMaxfaceamount);
				}
			}
			else{
				if($(Ent_FullName).isDisplayed()){
					$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
				}
				if($(monthTrust).isDisplayed()){
					$(monthTrust).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MM);
					$(DateofTrust).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(DD);
					$(yearofTrust).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(YYYY);
				}
				if($(Revocable).isDisplayed()){
					selectRadioYesorNo(Revocable, Irrevocable, TypeofTrust);
				}
			}
		}
		
		
		
		
		
		
		/*if ($(EntityType).isDisplayed()) {
			if($(EntityType).isDisplayed() && $(EntityType).isEnabled()){
				$(EntityType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Entitytype);
			}
			if (Entitytype.equalsIgnoreCase("Incorporated Entity, its successors or assigns")) {
				if($(SpecificEntityTypeInc).isDisplayed()){
					$(SpecificEntityTypeInc).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(SpecificEntityType);
				}
			} else if (Entitytype.equalsIgnoreCase("Non-Incorporated Entity")) {
				$(SpecificEntitynonTypeInc).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(SpecificEntityType);
			}
			
			if(Entitytype.equalsIgnoreCase("Incorporated Entity, its successors or assigns") || Entitytype.equalsIgnoreCase("Non-Incorporated Entity")){
				if($(SpecificEntityTypeInc).isDisplayed()){
					$(SpecificEntityTypeInc).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(SpecificEntityType);
				}else{
					$(SpecificEntitynonTypeInc).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(SpecificEntityType);
				}
					
				
				
				
				
				if(SpecificEntityType.equalsIgnoreCase("Charitable Organization")){
					$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
				}
				$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
				selectRadioYesorNo(ProposedInsuredDirector_Yes, ProposedInsuredDirector_No, ProposedInsuredDirector);
				$(EntityMaxFaceAmount).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityMaxfaceamount);
			}else{
				if($(Ent_FullName).isDisplayed()){
					$(Ent_FullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(EntityName);
				}
				if($(monthTrust).isDisplayed()){
					$(monthTrust).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(MM);
					$(DateofTrust).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(DD);
					$(yearofTrust).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(YYYY);
				}
				if($(Revocable).isDisplayed()){
					selectRadioYesorNo(Revocable, Irrevocable, TypeofTrust);
				}
			}
		}*/
	}

	public void Address(String AddresssameasPI, String street1, String street2, String city, String state, String Zip,
			String Mailingadd, String Mail_Strt1, String Mail_Strt2, String Mail_city, String Mail_State,
			String Mail_Zip,String Signertitle,String SolefiicerYesNo,String SoleFirstName,String SoleLastName, String SSN_EIN, String SSN_EINnumber,String TypeOfCitizenship,String VULBussinesphoneno, String VULphonetype) {
		if ($(Headingaddr).isDisplayed()) {
			if (AddresssameasPI.equalsIgnoreCase("Yes")) {
				$(Ent_SameAddressAsPI).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			} else {
				$(RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street1);
				$(RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(street2);
				$(RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(city);
				$(RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(state);
				$(RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Zip);
			}
			GlobalCap.sleep(1000);
			selectRadioYesorNo(MailAddSameasResADD_yes, MailAddSameasResADD_No, Mailingadd);
			if (Mailingadd.equalsIgnoreCase("No")) {
				$(Mailing_RESADDStreet1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt1);
				$(Mailing_RESADDStreet2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_Strt2);
				$(Mailing_RESADDCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Mail_city);
				$(Mailing_RESADDstate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Mail_State);
				$(Mailing_RESADDZIP).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Mail_Zip);
			}
			
			if($(SignerLabel).isDisplayed()){
				$(SignerTitle).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Signertitle);
				selectRadioYesorNo(signerSoleOfficer_Yes, signerSoleOfficer_No, SolefiicerYesNo);
				$(SignerFirstname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(SoleFirstName);
				$(SignerLasstname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(SoleLastName);
			}
			
			
			if (SSN_EIN.equalsIgnoreCase("SSN")) {
				$(SSN).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(SSNEINtextbox).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + SSN_EINnumber);
			} else {
				$(EIN).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(SSNEINtextbox).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + SSN_EINnumber);
			}
			//TypeOfCitizenship
			if($(UsEntity).isEnabled()){
				selectRadioYesorNo(UsEntity, ForeignEntity, TypeOfCitizenship);
			}
			if ($(Businessphoneno).isDisplayed()) {
				$(Businessphoneno).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME +VULBussinesphoneno);
				$(BusinessType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(VULphonetype);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
		}
	}
	
	public void ApexBusinessphone(String Bussinesphoneno, String phonetype) {
		if ($(Businessphoneno).isDisplayed()) {
			$(Businessphoneno).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Bussinesphoneno);
			$(BusinessType).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(phonetype);
		}
	}
}
