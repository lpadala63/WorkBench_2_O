package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class InvesterAccountInfo_one extends GlobalCap {
	
	
	By AccountInvestInfo = By.xpath("//h1[contains(text(),'Investor Account Info')]");
	By ResidenceinthePasttwoyrs_Yes = By.xpath("//input[@id='rdo_112_1']");
	By ResidenceinthePasttwoyrs_No = By.xpath("//input[@id='rdo_112_2']");
	
	
	//Have you moved your residence in the past two years? = Yes
	
	By PO_BOX_Streetone = By.xpath("//input[@id='flda_120']");
	By PO_BOX_Streettwo = By.xpath("//input[@id='flda_121']");
	By PO_BOX_StreetThree = By.xpath("//input[@id='flda_122']");
	By PO_BOX_City = By.xpath("//input[@id='flda_119']");
	By PO_BOX_State = By.xpath("//select[@id='lb_123']");
	By PO_BOX_ZipCode = By.xpath("//input[@id='flda_124']");
	By PO_BOX_MaritialSatus = By.xpath("//select[@id='lb_111']");
	By PO_BOX_NoOfDependent = By.xpath("//input[@id='flda_108']");
	
	By Identification_driverlicense =  By.xpath("//input[@id='rdo_110_1']");
	By Identification_passport =  By.xpath("//input[@id='rdo_110_2']");
	By Identification_IDNumber =  By.xpath("//input[@id='flda_127']");
	
	By State_CountryOfIssue = By.xpath("//select[@id='lb_125']");
	By ExpirationDate_MM = By.xpath("//div[@id='div_126']/div/span/span[1]/input[1]");
	By ExpirationDate_DD = By.xpath("//div[@id='div_126']/div/span/span[1]/input[2]");
	By ExpirationDate_YYYY = By.xpath("//div[@id='div_126']/div/span/span[1]/input[3]");
	
	
	
	
	By PO_BOX_EmployemntStatus = By.xpath("//select[@id='lb_129']");
	By Emplolyed_Occupation = By.xpath("//input[@id='flda_131']");
	By Employed_NameOfEmployer = By.xpath("//input[@id='flda_132']");
	By Employed_BussinessAddress = By.xpath("//input[@id='flda_134']");
	By Employed_SuiteNo = By.xpath("//input[@id='flda_135']");
	
	By Employed_City = By.xpath("//input[@id='flda_133']");
	By Employed_State = By.xpath("//select[@id='lb_136']");
	By Employed_Zip = By.xpath("//input[@id='flda_366']");
	By Employed_Country = By.xpath("//select[@id='lb_138']");
	By Employed_Country_PleaseSpecify = By.xpath("//input[@id='flda_139']");
	By Ritired_IndicatesourceofIncome = By.xpath("//input[@id='flda_130']");

	
	
	
	//Registered with or employed by a Financial Industry  =Iam
	
	By Registeredwithoremployed_Iam = By.xpath("//input[@id='rdo_109_1']");
	By Registeredwithoremployed_Iamnot = By.xpath("//input[@id='rdo_109_2']");
	By FirmType = By.xpath("//select[@id='lb_107']");
	By FirmName = By.xpath("//input[@id='flda_142']");
	By FirmAddressStreet = By.xpath("//input[@id='flda_141']");
	By FirmCity = By.xpath("//input[@id='flda_140']");
	By FirmState = By.xpath("//select[@id='lb_143']");
	By FirmZipCode = By.xpath("//input[@id='flda_144']");
	
	
	//A control person or affiliate of a public company  = Iam
	By controlpersonoraffiliate_Iam = By.xpath("//input[@id='rdo_242_1']");
	By controlpersonoraffiliate_Iamnot = By.xpath("//input[@id='rdo_242_2']");
	By ControlPersonorAffiliate = By.xpath("//select[@id='lb_243']");
	By CUIP_Symbol = By.xpath("//input[@id='flda_245']");
	By CompanyName = By.xpath("//input[@id='flda_244']");
	
	//Trusted Contact
	By TrustedContact_AddTrustedContact = By.xpath("//input[@id='rdo_246_1']");
	By TrustedContact_DeclinetoprovideTrustedContact = By.xpath("//input[@id='rdo_246_2']");
	
	By Trusted_Firstname = By.xpath("//input[@id='flda_247']");
	By Trusted_MidleName = By.xpath("//input[@id='flda_249']");
	By Trusted_Lastname = By.xpath("//input[@id='flda_248']");
	By Trusted_Suffix = By.xpath("//select[@id='lb_250']");
	By LegalAdresssameasOwner = By.xpath("//input[@id='cb_256']");
	
	By TrustedAddressStreet = By.xpath("//input[@id='flda_253']");
	By TrustedAddressCity = By.xpath("//input[@id='flda_252']");
	By TrustedAddressState = By.xpath(" //select[@id='lb_254']");
	By TrustedAddressZipCode = By.xpath("//input[@id='flda_255']");
	By TrustedAddressTelephone = By.xpath("//input[@id='flda_251']");
	
	
	
	
	// investorAccountInfo_continous_one
	By Accountregister_TypeofAccount = By.xpath("//select[@id='lb_117']");
	By InvContinous_TelephoneNumber = By.xpath("//input[@id='flda_133']");
	By InvContinous_CharitableOrganization_Yes = By.xpath("//input[@id='rdo_135_1']");
	By InvContinous_CharitableOrganization_No = By.xpath("//input[@id='rdo_135_2']");
	/*By InvContinous_TaxClassification = By.xpath("//select[@id='lb_254']");
	By TrustedAddressZipCode = By.xpath("//input[@id='flda_255']");
	By TrustedAddressTelephone = By.xpath("//input[@id='flda_251']");
	
	By InvContinous_TaxClassification = By.xpath("//select[@id='lb_254']");
	By TrustedAddressZipCode = By.xpath("//input[@id='flda_255']");
	By TrustedAddressTelephone = By.xpath("//input[@id='flda_251']");*/
	
	
	
	By AdditionalAccountholder = By.xpath("//span[contains(text(),'Additional Account Holder')]");
	By AdditionalAccountholder_LegalSameaddressasPI = By.xpath("//input[@id='flda_261']");
	By AdditionalAccountholder_LegalStreetone = By.xpath("//input[@id='flda_261']");
	By AdditionalAccountholder_LegalStreettwo = By.xpath("//input[@id='flda_262']");
	By AdditionalAccountholder_LegalStreetthree = By.xpath("//input[@id='flda_263']");
	By AdditionalAccountholder_LegalCity = By.xpath("//input[@id='flda_257']");
	By AdditionalAccountholder_LegalState = By.xpath("//select[@id='lb_258']");
	By AdditionalAccountholder_LegalZip = By.xpath("//input[@id='flda_259']");
	
	
	
	By ActHldr_ResidenceinthePasttwoyrs_Yes = By.xpath("//input[@id='rdo_297_1']");
	By ActHldr_ResidenceinthePasttwoyrs_No = By.xpath("//input[@id='rdo_297_2']");
	By ActHldr_PO_BOX_Streetone = By.xpath("//input[@id='flda_292']");
	By ActHldr_PO_BOX_Streettwo = By.xpath("//input[@id='flda_293']");
	By ActHldr_PO_BOX_StreetThree = By.xpath("//input[@id='flda_294']");
	By ActHldr_PO_BOX_City = By.xpath("//input[@id='flda_291']");
	By ActHldr_PO_BOX_State = By.xpath("//select[@id='lb_295']");
	By ActHldr_PO_BOX_ZipCode = By.xpath("//input[@id='flda_296']");
	By ActHldr_PO_BOX_MaritialSatus = By.xpath("//select[@id='lb_289']");
	By ActHldr_PO_BOX_NoOfDependent = By.xpath("//input[@id='flda_288']");
	
/*	
	By ActHldr_Identification_driverlicense =  By.xpath("//input[@id='rdo_110_1']");
	By ActHldr_Identification_passport =  By.xpath("//input[@id='rdo_110_2']");
	By ActHldr_Identification_IDNumber =  By.xpath("//input[@id='flda_127']");
	By ActHldr_State_CountryOfIssue = By.xpath("//select[@id='lb_125']");
	*/
	
	
	By ActHldr_ExpirationDate_MM = By.xpath("//div[@id='div_308']/div/span/span[1]/input[1]");
	By ActHldr_ExpirationDate_DD = By.xpath("//div[@id='div_308']/div/span/span[1]/input[2]");
	By ActHldr_ExpirationDate_YYYY = By.xpath("//div[@id='div_308']/div/span/span[1]/input[3]");
	
	
	By ActHldr_PO_BOX_EmployemntStatus = By.xpath("//select[@id='lb_306']");
	By ActHldr_Emplolyed_Occupation = By.xpath("//input[@id='flda_312']");
	By ActHldr_Employed_NameOfEmployer = By.xpath("//input[@id='flda_305']");
	By ActHldr_Employed_BussinessAddress = By.xpath("//input[@id='flda_301']");
	By ActHldr_Employed_SuiteNo = By.xpath("//input[@id='flda_302']");
	
	By ActHldr_Employed_City = By.xpath("//input[@id='flda_298']");
	By ActHldr_Employed_State = By.xpath("//select[@id='lb_303']");
	By ActHldr_Employed_Zip = By.xpath("//input[@id='flda_304']");
	By ActHldr_Employed_Country = By.xpath("//select[@id='lb_299']");
	
	By ActHldr_Employed_Country_PleaseSpecify = By.xpath("//input[@id='flda_300']");
	By ActHldr_Ritired_IndicatesourceofIncome = By.xpath("//input[@id='flda_313']");
	
	
	By AccountInvestInfoHeading = By.xpath("//h1[text()='Investor Account Info']");
	
	

	By ActHldr_Registeredwithoremployed_Iam = By.xpath("//input[@id='rdo_322_1']");
	By ActHldr_Registeredwithoremployed_Iamnot = By.xpath("//input[@id='rdo_322_2']");
	By ActHldr_FirmType = By.xpath("//select[@id='lb_321']");
	By ActHldr_FirmName = By.xpath("//input[@id='flda_320']");
	By ActHldr_FirmAddressStreet = By.xpath("//input[@id='flda_331']");
	By ActHldr_FirmCity = By.xpath("//input[@id='flda_330']");
	By ActHldr_FirmState = By.xpath("//select[@id='lb_332']");
	By ActHldr_FirmZipCode = By.xpath("//input[@id='flda_333']");
	
	
	//A control person or affiliate of a public company  = Iam
	By ActHldr_controlpersonoraffiliate_Iam = By.xpath("//input[@id='rdo_326_1']");
	By ActHldr_controlpersonoraffiliate_Iamnot = By.xpath("//input[@id='rdo_326_2']");
	By ActHldr_ControlPersonorAffiliate = By.xpath("//select[@id='lb_327']");
	By ActHldr_CUIP_Symbol = By.xpath("//input[@id='flda_329']");
	By ActHldr_CompanyName = By.xpath("//input[@id='flda_328']");
	
	//Trusted Contact
	By ActHldr_TrustedContact_AddTrustedContact = By.xpath("//input[@id='rdo_334_1']");
	By ActHldr_TrustedContact_DeclinetoprovideTrustedContact = By.xpath("//input[@id='rdo_334_2']");
	
	By ActHldr_Trusted_Firstname = By.xpath("//input[@id='flda_345']");
	By ActHldr_Trusted_MidleName = By.xpath("//input[@id='flda_347']");
	By ActHldr_Trusted_Lastname = By.xpath("//input[@id='flda_346']");
	By ActHldr_Trusted_Suffix = By.xpath("//select[@id='lb_356']");

	
	By ActHldr_TrustedAddressStreet = By.xpath("//input[@id='flda_353']");
	By ActHldr_TrustedAddressCity = By.xpath("//input[@id='flda_351']");
	By ActHldr_TrustedAddressState = By.xpath(" //select[@id='lb_352']");
	By ActHldr_TrustedAddressZipCode = By.xpath("//input[@id='flda_354']");
	By ActHldr_TrustedAddressTelephone = By.xpath("//input[@id='flda_355']");
	
	
	
	
	
	
	By ActReg_TypeofAccount = By.xpath("//select[@id='lb_117']");
	By ActReg_TelephoneNum = By.xpath("//input[@id='flda_133']");
	By ActReg_OrgTax_Yes = By.xpath("//input[@id='rdo_135_1']");
	By ActReg_OrgTax_No = By.xpath("//input[@id='rdo_135_2']");
	By ActReg_CheckAppropriateBox = By.xpath("//select[@id='lb_134']");
	
	By Next = By.xpath("//button[contains(text(),'Next')]");
	
	public void investorAccount1(String ResidenceinthePasttwoyrs,String PO_BOX_Strt1,String PO_BOX_Strt2,String PO_BOX_city,String PO_BOX_state,String PO_BOX_Zip,
			String PO_BOX_maritialsatus,String PO_BOX_NoOfdependent,String Identification_drivingliscence_passport,String Identification_Idnumber,String state_countryOfIssue,
			String ExpirationDate_mm,String ExpirationDate_dd,String ExpirationDate_yyyy,String PO_BOX_employemntstatus,String Emplolyed_occupation,String Employed_nameOfemployer,
			String Employed_Bussinessaddress,String Employed_suiteNo,String Employed_city,String Employed_state,String Employed_zip,String Employed_country,String Ritired_indicatesourceofincome,
			String Registeredwithoremployed,String Firmtype,String Firmname,String Firmaddresstreet, String Firmcity,String Firmstate,String Firmzipcode,String Controlpersonoraffiliateiamornot,String Controlpersonoraffiliate,String CUIP_symbol,
			String Companyname, String PleaseSelectTrustedContact,String Trusted_firstname,String Trusted_midlename,String Trusted_lastname,String Trusted_suffix,String LegalAddresasOwner,String TrustedAddressstreet,
			String TrustedAddresscity,String TrustedAddressstate,String TrustedAddresszipCode,String TrustedAddresstelephone){
		
		if ($(ResidenceinthePasttwoyrs_Yes).isDisplayed()) {
			selectRadioYesorNo(ResidenceinthePasttwoyrs_Yes, ResidenceinthePasttwoyrs_No, ResidenceinthePasttwoyrs);
			if(ResidenceinthePasttwoyrs.equalsIgnoreCase("Yes")){
				$(PO_BOX_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_Strt1);
				$(PO_BOX_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_Strt2);
				$(PO_BOX_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_city);
				$(PO_BOX_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(PO_BOX_state);
				$(PO_BOX_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + PO_BOX_Zip);
				
			}
			
			$(PO_BOX_MaritialSatus).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PO_BOX_maritialsatus);
			$(PO_BOX_NoOfDependent).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_BOX_NoOfdependent);
			if($(Identification_driverlicense).isEnabled()){
				if(Identification_drivingliscence_passport.equalsIgnoreCase("Drivers_License")){
					$(Identification_driverlicense).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				else if(Identification_drivingliscence_passport.equalsIgnoreCase("Passport")){
					$(Identification_passport).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
			}
			if($(Identification_IDNumber).isEnabled()&&$(Identification_passport).isEnabled()){
				$(Identification_IDNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).sendKeys(Identification_Idnumber);
			}
			if($(State_CountryOfIssue).isDisplayed()){
				$(State_CountryOfIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(state_countryOfIssue);
			}
			
			if($(ExpirationDate_MM).isDisplayed()&& $(ExpirationDate_MM).isDisplayed()){
				$(ExpirationDate_MM).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ExpirationDate_mm);
				$(ExpirationDate_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ExpirationDate_dd);
				$(ExpirationDate_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ExpirationDate_yyyy);
			}
			
			$(PO_BOX_EmployemntStatus).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PO_BOX_employemntstatus);
			if(PO_BOX_employemntstatus.equalsIgnoreCase("Employed") || PO_BOX_employemntstatus.equalsIgnoreCase("Self-Employed") ){
				$(Emplolyed_Occupation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Emplolyed_occupation);
				$(Employed_NameOfEmployer).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_nameOfemployer);
				$(Employed_BussinessAddress).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_Bussinessaddress);
				$(Employed_SuiteNo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_suiteNo);
				$(Employed_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_city);
				$(Employed_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Employed_state);
				$(Employed_Zip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Employed_zip);
				$(Employed_Country).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Employed_country);
				if($(Employed_Country_PleaseSpecify).isDisplayed()){
					$(Employed_Country_PleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_city);
				}
				
			}
			else if(PO_BOX_employemntstatus.equalsIgnoreCase("Not Employed")||PO_BOX_employemntstatus.equalsIgnoreCase("Retired")){
				$(Ritired_IndicatesourceofIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Ritired_indicatesourceofincome);
			}
			
			//Registered with or employed by a Financial Industry Regulatory Authority ("FINRA")
			if(Registeredwithoremployed.equalsIgnoreCase("I_am")){
				$(Registeredwithoremployed_Iam).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(FirmType).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Firmtype);
				$(FirmName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Firmname);
				$(FirmAddressStreet).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Firmaddresstreet);
				$(FirmCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Firmcity);
				$(FirmState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Firmstate);
				$(FirmZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Firmzipcode);
			}else{
				$(Registeredwithoremployed_Iamnot).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			
			
			//A control person or affiliate of a public company as
			if(Controlpersonoraffiliateiamornot.equalsIgnoreCase("I_am")){
				$(controlpersonoraffiliate_Iam).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				$(ControlPersonorAffiliate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Controlpersonoraffiliate);
				$(CUIP_Symbol).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(CUIP_symbol);
				$(CompanyName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Companyname);
			}else{
				$(controlpersonoraffiliate_Iamnot).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			
			
			//Trusted Contact
			if(PleaseSelectTrustedContact.equalsIgnoreCase("AddTrustedContact")){
				$(TrustedContact_AddTrustedContact).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				GlobalCap.sleep(1500);
				$(Trusted_Firstname).shouldBe(Visible.exist, Duration.ofSeconds(55)).setValue(Trusted_firstname);
				$(Trusted_MidleName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Trusted_midlename);
				$(Trusted_Lastname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Trusted_lastname);
				$(Trusted_Suffix).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Trusted_suffix);
				if(LegalAddresasOwner.equalsIgnoreCase("No")){
					$(TrustedAddressStreet).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(TrustedAddressstreet);
					$(TrustedAddressCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(TrustedAddresscity);
					$(TrustedAddressState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(TrustedAddressstate);
					$(TrustedAddressZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + TrustedAddresszipCode);
					
				}
				else{
					$(LegalAdresssameasOwner).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(TrustedAddressTelephone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + TrustedAddresstelephone);
				}
			}else{
				$(TrustedContact_DeclinetoprovideTrustedContact).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}	
			
			
			
			
			
			/*if($(AdditionalAccountholder).isDisplayed()){
				if(AccountHolderaddresssameasPI.equalsIgnoreCase("Yes")){
					$(AdditionalAccountholder_LegalSameaddressasPI).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}else{
					$(AdditionalAccountholder_LegalStreetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalstreetone);
					$(AdditionalAccountholder_LegalStreettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalstreettwo);
					$(AdditionalAccountholder_LegalStreetthree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalstreetthree);
					$(AdditionalAccountholder_LegalCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalcity);
					$(AdditionalAccountholder_LegalState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AdditionalAccountholder_Legalstate);
					$(AdditionalAccountholder_LegalZip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AdditionalAccountholder_Legalzip);
				}
				
				selectRadioYesorNo(ActHldr_ResidenceinthePasttwoyrs_Yes, ActHldr_ResidenceinthePasttwoyrs_No, AdditionalAccountholder_ResidenceinthePasttwoyrs);
				if(AdditionalAccountholder_ResidenceinthePasttwoyrs.equalsIgnoreCase("Yes")){
					$(ActHldr_PO_BOX_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_PO_BOX_Strt1);
					$(ActHldr_PO_BOX_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_PO_BOX_Strt2);
					$(ActHldr_PO_BOX_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_PO_BOX_city);
					$(ActHldr_PO_BOX_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AdditionalAccountholder_PO_BOX_state);
					$(ActHldr_PO_BOX_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AdditionalAccountholder_PO_BOX_Zip);
					
				}
				
				$(ActHldr_PO_BOX_MaritialSatus).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AdditionalAccountholder_PO_BOX_maritialsatus);
				$(ActHldr_PO_BOX_NoOfDependent).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(AdditionalAccountholder_PO_BOX_NoOfdependent);
				if($(ActHldr_Identification_driverlicense).isEnabled()){
					if(Identification_drivingliscence_passport.equalsIgnoreCase("Drivers_License")){
						$(ActHldr_Identification_driverlicense).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
					else if(Identification_drivingliscence_passport.equalsIgnoreCase("Passport")){
						$(ActHldr_Identification_passport).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				}
				if($(ActHldr_Identification_IDNumber).isEnabled()&&$(Identification_passport).isEnabled()){
					$(ActHldr_Identification_IDNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).sendKeys(AdditionalAccountholder_Identification_Idnumber);
				}
				if($(ActHldr_State_CountryOfIssue).isDisplayed()){
					$(ActHldr_State_CountryOfIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AdditionalAccountholder_state_countryOfIssue);
				}
				
				if($(ActHldr_ExpirationDate_MM).isDisplayed()&& $(ExpirationDate_MM).isDisplayed()){
					$(ActHldr_ExpirationDate_MM).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AdditionalAccountholder_ExpirationDate_mm);
					$(ActHldr_ExpirationDate_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AdditionalAccountholder_ExpirationDate_dd);
					$(ActHldr_ExpirationDate_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AdditionalAccountholder_ExpirationDate_yyyy);
				}
				
				$(ActHldr_PO_BOX_EmployemntStatus).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(AdditionalAccountholder_PO_BOX_employemntstatus);
				if(PO_BOX_employemntstatus.equalsIgnoreCase("Employed") || PO_BOX_employemntstatus.equalsIgnoreCase("Self-Employed") ){
					$(ActHldr_Emplolyed_Occupation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Emplolyed_occupation);
					$(ActHldr_Employed_NameOfEmployer).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Employed_nameOfemployer);
					$(ActHldr_Employed_BussinessAddress).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Employed_Bussinessaddress);
					$(ActHldr_Employed_SuiteNo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Employed_suiteNo);
					$(ActHldr_Employed_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Employed_city);
					$(ActHldr_Employed_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AdditionalAccountholder_Employed_state);
					$(ActHldr_Employed_Zip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AdditionalAccountholder_Employed_zip);
					$(ActHldr_Employed_Country).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AdditionalAccountholder_Employed_country);
					if($(ActHldr_Employed_Country_PleaseSpecify).isDisplayed()){
						$(ActHldr_Employed_Country_PleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Employed_city);
					}
					
				}
				else if(PO_BOX_employemntstatus.equalsIgnoreCase("Not Employed")||PO_BOX_employemntstatus.equalsIgnoreCase("Retired")){
					$(ActHldr_Ritired_IndicatesourceofIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Ritired_indicatesourceofincome);
				}
				
				/// Need to implement
				
				
				
				
				
				
			}*/
		
		

		}
	}
	
	public void PreviousResidence(String AccountHolderaddresssameasPI,String AdditionalAccountholder_Legalstreetone,String AdditionalAccountholder_Legalstreettwo,String AdditionalAccountholder_Legalstreetthree,String AdditionalAccountholder_Legalcity,String AdditionalAccountholder_Legalstate,
			String AdditionalAccountholder_Legalzip,String ResidenceinthePasttwoyrs,String PO_BOX_Strt1,String PO_BOX_Strt2,String PO_BOX_city,String PO_BOX_state,String PO_BOX_Zip,String PO_BOX_maritialsatus,String PO_BOX_NoOfdependent,String Identification_drivingliscence_passport,String Identification_Idnumber,String state_countryOfIssue,
			String ExpirationDate_mm,String ExpirationDate_dd,String ExpirationDate_yyyy,String PO_BOX_employemntstatus,String Emplolyed_occupation,String Employed_nameOfemployer,String Employed_Bussinessaddress,String Employed_suiteNo,String Employed_city,String Employed_state,String Employed_zip,String Employed_country,String Ritired_indicatesourceofincome,
			String AcntHldr_Registeredwithoremployed,String AcntHldr_Firmtype,String AcntHldr_Firmname,String AcntHldr_Firmaddresstreet,String AcntHldr_Firmcity,String AcntHldr_Firmstate,String AcntHldr_Firmzipcode,String AcntHldr_Controlpersonoraffiliateiamornot,
			String AcntHldr_Controlpersonoraffiliate,String AcntHldr_CUIP_symbol,String AcntHldr_Companyname,String AcntHldr_PleaseSelectTrustedContact,String AcntHldr_Trusted_firstname,String AcntHldr_Trusted_midlename,String AcntHldr_Trusted_lastname,String AcntHldr_Trusted_suffix,String AcntHldr_TrustedAddressstreet,String AcntHldr_TrustedAddresscity,String AcntHldr_TrustedAddressstate,String AcntHldr_TrustedAddresszipCode,String AcntHldr_TrustedAddresstelephone){
		
		if($(AccountInvestInfoHeading).isDisplayed()){
			if($(AdditionalAccountholder).isDisplayed()){
				if(AccountHolderaddresssameasPI.equalsIgnoreCase("Yes")){
					$(AdditionalAccountholder_LegalSameaddressasPI).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}else{
					$(AdditionalAccountholder_LegalStreetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalstreetone);
					$(AdditionalAccountholder_LegalStreettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalstreettwo);
					$(AdditionalAccountholder_LegalStreetthree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalstreetthree);
					$(AdditionalAccountholder_LegalCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AdditionalAccountholder_Legalcity);
					$(AdditionalAccountholder_LegalState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AdditionalAccountholder_Legalstate);
					$(AdditionalAccountholder_LegalZip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AdditionalAccountholder_Legalzip);
				}
				
				selectRadioYesorNo(ActHldr_ResidenceinthePasttwoyrs_Yes, ActHldr_ResidenceinthePasttwoyrs_No, ResidenceinthePasttwoyrs);
				if(ResidenceinthePasttwoyrs.equalsIgnoreCase("Yes")){
					$(ActHldr_PO_BOX_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_Strt1);
					$(ActHldr_PO_BOX_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_Strt2);
					$(ActHldr_PO_BOX_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(PO_BOX_city);
					$(ActHldr_PO_BOX_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(PO_BOX_state);
					$(ActHldr_PO_BOX_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + PO_BOX_Zip);
					
				}
				
				$(ActHldr_PO_BOX_MaritialSatus).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PO_BOX_maritialsatus);
				$(ActHldr_PO_BOX_NoOfDependent).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(PO_BOX_NoOfdependent);
				/*if($(ActHldr_Identification_driverlicense).isEnabled()){
					if(Identification_drivingliscence_passport.equalsIgnoreCase("Drivers_License")){
						$(ActHldr_Identification_driverlicense).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
					else if(Identification_drivingliscence_passport.equalsIgnoreCase("Passport")){
						$(ActHldr_Identification_passport).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				}
				if($(ActHldr_Identification_IDNumber).isEnabled()&&$(Identification_passport).isEnabled()){
					$(ActHldr_Identification_IDNumber).shouldBe(Visible.exist, Duration.ofSeconds(15)).sendKeys(Identification_Idnumber);
				}
				if($(ActHldr_State_CountryOfIssue).isDisplayed()){
					$(ActHldr_State_CountryOfIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(state_countryOfIssue);
				}
				*/
				if($(ActHldr_ExpirationDate_MM).isDisplayed()&& $(ExpirationDate_MM).isDisplayed()){
					$(ActHldr_ExpirationDate_MM).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ExpirationDate_mm);
					$(ActHldr_ExpirationDate_DD).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ExpirationDate_dd);
					$(ActHldr_ExpirationDate_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ExpirationDate_yyyy);
				}
				
				$(ActHldr_PO_BOX_EmployemntStatus).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(PO_BOX_employemntstatus);
				if(PO_BOX_employemntstatus.equalsIgnoreCase("Employed") || PO_BOX_employemntstatus.equalsIgnoreCase("Self-Employed") ){
					$(ActHldr_Emplolyed_Occupation).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Emplolyed_occupation);
					$(ActHldr_Employed_NameOfEmployer).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_nameOfemployer);
					$(ActHldr_Employed_BussinessAddress).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_Bussinessaddress);
					$(ActHldr_Employed_SuiteNo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_suiteNo);
					$(ActHldr_Employed_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_city);
					$(ActHldr_Employed_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Employed_state);
					$(ActHldr_Employed_Zip).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Employed_zip);
					$(ActHldr_Employed_Country).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Employed_country);
					if($(ActHldr_Employed_Country_PleaseSpecify).isDisplayed()){
						$(ActHldr_Employed_Country_PleaseSpecify).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Employed_city);
					}
					
				}
				else if(PO_BOX_employemntstatus.equalsIgnoreCase("Not Employed")||PO_BOX_employemntstatus.equalsIgnoreCase("Retired")){
					$(ActHldr_Ritired_IndicatesourceofIncome).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Ritired_indicatesourceofincome);
				}
				
				

				if(AcntHldr_Registeredwithoremployed.equalsIgnoreCase("I_am")){
					$(ActHldr_Registeredwithoremployed_Iam).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(ActHldr_FirmType).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Firmtype);
					$(ActHldr_FirmName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Firmname);
					$(ActHldr_FirmAddressStreet).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Firmaddresstreet);
					$(ActHldr_FirmCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Firmcity);
					$(ActHldr_FirmState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AcntHldr_Firmstate);
					$(ActHldr_FirmZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AcntHldr_Firmzipcode);
				}else{
					$(ActHldr_Registeredwithoremployed_Iamnot).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				
				
				//A control person or affiliate of a public company as
				if(AcntHldr_Controlpersonoraffiliateiamornot.equalsIgnoreCase("I_am")){
					$(ActHldr_controlpersonoraffiliate_Iam).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(ActHldr_ControlPersonorAffiliate).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AcntHldr_Controlpersonoraffiliate);
					$(ActHldr_CUIP_Symbol).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_CUIP_symbol);
					$(ActHldr_CompanyName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Companyname);
				}else{
					$(ActHldr_controlpersonoraffiliate_Iamnot).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				
				
				//Trusted Contact
				if(AcntHldr_PleaseSelectTrustedContact.equalsIgnoreCase("AddTrustedContact")){
					$(ActHldr_TrustedContact_AddTrustedContact).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					$(ActHldr_Trusted_Firstname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Trusted_firstname);
					$(ActHldr_Trusted_MidleName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Trusted_midlename);
					$(ActHldr_Trusted_Lastname).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_Trusted_lastname);
					$(ActHldr_Trusted_Suffix).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AcntHldr_Trusted_suffix);
					$(ActHldr_TrustedAddressStreet).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_TrustedAddressstreet);
					$(ActHldr_TrustedAddressCity).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AcntHldr_TrustedAddresscity);
					$(ActHldr_TrustedAddressState).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(AcntHldr_TrustedAddressstate);
					$(ActHldr_TrustedAddressZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AcntHldr_TrustedAddresszipCode);
					$(ActHldr_TrustedAddressTelephone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + AcntHldr_TrustedAddresstelephone);
					
				}else{
					$(ActHldr_TrustedContact_DeclinetoprovideTrustedContact).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				
			}
		
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		}
	}
	
	
	
	
	public void EntityownerAccountInfo(String ActReg_Typeofaccount, String ActReg_telephoneNum, String ActReg_OrgTax,
			String ActReg_Checkappropriatebox) {
		By AccountReg = By.xpath("//span[contains(text(),'Account Registration')]");		
		if ($(AccountReg).isDisplayed()) {
			$(ActReg_TypeofAccount).shouldBe(Visible.exist, Duration.ofSeconds(15))
					.selectOptionContainingText(ActReg_Typeofaccount);
			$(ActReg_TelephoneNum).shouldBe(Visible.exist, Duration.ofSeconds(15))
					.setValue(Keys.HOME + ActReg_telephoneNum);
			GlobalCap.selectRadioYesorNo(ActReg_OrgTax_Yes, ActReg_OrgTax_No, ActReg_OrgTax);
			if ($(ActReg_CheckAppropriateBox).isDisplayed()) {
				$(ActReg_CheckAppropriateBox).shouldBe(Visible.exist, Duration.ofSeconds(15))
						.selectOptionContainingText(ActReg_Checkappropriatebox);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}

	}
	
	
	
}
