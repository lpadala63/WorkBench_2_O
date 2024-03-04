package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class HIVConsent extends GlobalCap {

	// Common Details
	By Alternatesite = By.xpath("//input[@alt_id='HIV_HCPName']");

	By Ex_Name = By.xpath("//input[@alt_id='HIV_ExaminerName']");
	By Fac_Facility = By.xpath("//input[@alt_id='HIV_ExaminerFacility']");
	By Ex_Address = By.xpath("//input[@alt_id='HIV_ExaminerADDR_Line1']");
	By Ex_City = By.xpath("//input[@alt_id='HIV_ExaminerADDR_City']");
	By Ex_State = By.xpath("//select[@alt_id='HIV_ExaminerADDR_State']");
	By Ex_Zipcode = By.xpath("//input[@alt_id='HIV_ExaminerADDR_Zip']");

	By FirstName = By.xpath("//input[@alt_id='HIV_DRFirstName']");
	By LastName = By.xpath("//input[@alt_id='HIV_DRLastName']");
	By Address = By.xpath("//input[@alt_id='HIV_DRADDR_Line1']");
	By City = By.xpath("//input[@alt_id='HIV_DRADDR_City']");
	By State = By.xpath("//select[@alt_id='HIV_DRADDR_State']");
	By Zipcode = By.xpath("//input[@alt_id='HIV_DRADDR_Zip']");
	By Next = By.xpath("//button[contains(text(),'Next')]");

	By HealthcareproviderName = By.xpath("//input[@alt_id='HIV_HCPName']");
	By HCAddress = By.xpath("//input[@alt_id='HIV_HCPADDR_Line1']");
	By HcCity = By.xpath("//input[@alt_id='HIV_HCPADDR_City']");
	By HcState = By.xpath("//select[@alt_id='HIV_HCPADDR_State']");
	By HcZipcode = By.xpath("//input[@alt_id='HIV_HCPADDR_Zip']");

	// Az
	By Az_Pphy_Yes = By.xpath("//input[@alt_id='HIV_OptionAZ_1']");
	By Az_Pphy_No = By.xpath("//input[@alt_id='HIV_OptionAZ_2']");
	// CT
	By CT_personalphysician = By.xpath("//input[@alt_id='HIV_OptionCT_1']");
	By CT_HealthCareProvider = By.xpath("//input[@alt_id='HIV_OptionCT_2']");

	// DC
	By DC_physician = By.xpath("//input[@alt_id='HIV_OptionDC_1']");
	By DC_HealthCareProvider = By.xpath("//input[@alt_id='HIV_OptionDC_2']");
	By DC_IdontWish = By.xpath("//input[@alt_id='HIV_OptionDC_3']");
	// FL
	By FL_physician = By.xpath("//input[@id='rdo_273_1']");
	By FL_HealthCareProvider = By.xpath("//input[@id='rdo_273_2']");
	By FL_IdontWish = By.xpath("//input[@id='rdo_273_3']");

	// IA
	By IA_physician = By.xpath("//input[@alt_id='HIV_OptionIA_2']");
	By IA_Alternatesite = By.xpath("//input[@alt_id='HIV_OptionIA_1']");
	By IA_None = By.xpath("//input[@alt_id='HIV_OptionIA_3']");

	// Ks
	By RI_MePI = By.xpath("//input[@alt_id='HIV_OptionRI_1']");
	By KS_MePI = By.xpath("//input[@alt_id='HIV_OptionKSNE_1']");
	By KS_Physician = By.xpath("//input[@alt_id='HIV_OptionKSNE_2']");

	// Ky
	By KY_Pphy_Yes = By.xpath("//input[@alt_id='HIV_OptionKY_1']");
	By KY_Pphy_No = By.xpath("//input[@alt_id='HIV_OptionKY_2']");

	// MA
	By MA_MePI = By.xpath("//input[@alt_id='HIV_OptionMA_1']");
	By MA_Physician = By.xpath("//input[@alt_id='HIV_OptionMA_2']");
	// MI
	By MI_Yes = By.xpath("//input[@alt_id='HIV_OptionMI_1']");
	By MI_No = By.xpath("//input[@alt_id='HIV_OptionMI_2']");
	By MI_PersonalPhysician = By.xpath("//input[@alt_id='HIV_OptionMI2_1']");
	By MI_HealthFacility = By.xpath("//input[@alt_id='HIV_OptionMI2_2']");
	By UT_PersonalPhysician = By.xpath("//input[@alt_id='HIV_OptionUT_1']");
	By UT_HealthFacility = By.xpath("//input[@alt_id='HIV_OptionUT_2']");
	
	//VT
	By VT_PersonalPhysician = By.xpath("//input[@alt_id='HIV_OptionVT_1']");
	By VT_Healthcare = By.xpath("//input[@alt_id='HIV_OptionVT_2']");
	
	
	//NH
	By NH_PersonalPhysician = By.xpath("//input[@alt_id='HIV_OptionNH_1']");
	//OR
	By OR_PI = By.xpath("//input[@alt_id='HIV_OptionOR_3']");
	
	//PEns
	By PA_LocalHealth = By.xpath("//input[@alt_id='HIV_OptionPA_3']");
	//WV
	By WV_MepropsedIns = By.xpath("//input[@alt_id='HIV_OptionWV_1']");
	
	//TX
	By Tx_No = By.xpath("//input[@alt_id='HIV_OptionTX_2']");
	
	//VG
	By VA_MEPI = By.xpath("//input[@alt_id='HIV_OptionVA_1']");
	By VA_MEPI2 = By.xpath("//input[@alt_id='HIV_OptionVA2_1']");
	
	// NY
	By NYMe = By.xpath("//input[@id='rdo_75_1' and @name='rdo_75_1']");
	By NYPhysician = By.xpath("//input[@id='rdo_75_2' and @name='rdo_75_2']");
	By NYDesignee = By.xpath("//input[@id='rdo_75_3' and @name='rdo_75_3']");
	By NYDesigneeName = By.xpath("//input[@id='flda_54' and @name='flda_54']");

	// Mo
	By MO_Yes = By.xpath("//input[@alt_id='HIV_OptionMO_1']");
	By MO_No = By.xpath("//input[@alt_id='HIV_OptionMO_2']");

	By NA_Yes = By.xpath("//input[@alt_id='HIV_OptionWA_2']");
	// NY
	By OHMe = By.xpath("//input[@id='cb_89' and @name='cb_89']");

	GlobalCap GC = new GlobalCap();

	public void personalPhysician_Yes_No(String state, String AZ_KY_personalphysician_RD, String CT_physician_or_health,
			String DC_Fl_physician_or_health, String IA_Alternate_Myphysician_none, String Ks_Ma_MePIandPhysician,
			String NY_physician_or_health, String MoPhysician_RD, String Fname, String Lname, String Addrs, String Cty,
			String ST, String Zpcd, String HCprovidername, String Alternativesitename, String MI_YEsNo,
			String MI_authorizeHiv, String Dname, String ExaminerName, String FacilityName) {
		if (state.equalsIgnoreCase("Arizona") || state.equalsIgnoreCase("Kentucky")) {
			if (state.equalsIgnoreCase("Arizona")) {
				GlobalCap.selectRadioYesorNo(Az_Pphy_Yes, Az_Pphy_No, AZ_KY_personalphysician_RD);
			}
			if (state.equalsIgnoreCase("Kentucky")) {
				GlobalCap.selectRadioYesorNo(KY_Pphy_Yes, KY_Pphy_No, AZ_KY_personalphysician_RD);
			}

			if (AZ_KY_personalphysician_RD.equalsIgnoreCase("Yes")) {
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("California") || state.equalsIgnoreCase("Colorado")) {
			$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
			$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
			$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
			$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
			$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
			$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("Connecticut")) {
			if (CT_physician_or_health.equalsIgnoreCase("Personal Physician")) {
				$(CT_personalphysician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (CT_physician_or_health.equalsIgnoreCase("Health Care Provider")) {
				$(CT_HealthCareProvider).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HCprovidername);
				$(HCAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(HcCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(HcState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(HcZipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("Florida")) {
			if (DC_Fl_physician_or_health.equalsIgnoreCase("Physician")) {
				$(FL_physician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (DC_Fl_physician_or_health.equalsIgnoreCase("Health Care Provider")) {
				$(FL_HealthCareProvider).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HCprovidername);
				$(HCAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(HcCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(HcState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(HcZipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (DC_Fl_physician_or_health.equalsIgnoreCase("IdontWish")) {
				$(FL_IdontWish).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("Washington D.C.")) {
			if (DC_Fl_physician_or_health.equalsIgnoreCase("Physician")) {
				$(DC_physician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (DC_Fl_physician_or_health.equalsIgnoreCase("Health Care Provider")) {
				$(DC_HealthCareProvider).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HCprovidername);
				$(HCAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(HcCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(HcState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(HcZipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (DC_Fl_physician_or_health.equalsIgnoreCase("IdontWish")) {
				$(DC_IdontWish).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("Iowa")) {
			if (IA_Alternate_Myphysician_none.equalsIgnoreCase("AlternativeSite")) {
				$(IA_Alternatesite).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(Alternatesite).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Alternativesitename);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (IA_Alternate_Myphysician_none.equalsIgnoreCase("MyPhysician")) {
				$(IA_physician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (IA_Alternate_Myphysician_none.equalsIgnoreCase("None")) {
				$(IA_None).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("Hawaii") || state.equalsIgnoreCase("Indiana")) {
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("Kansas") || state.equalsIgnoreCase("Massachusetts")
				|| state.equalsIgnoreCase("Nebraska")) {
			if (Ks_Ma_MePIandPhysician.equalsIgnoreCase("Me (Proposed Insured)")) {
				if (state.equalsIgnoreCase("Kansas") || state.equalsIgnoreCase("Nebraska")) {
					$(KS_MePI).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				}
				if (state.equalsIgnoreCase("Massachusetts")) {
					$(MA_MePI).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				}
			} else if (Ks_Ma_MePIandPhysician.equalsIgnoreCase("Physician")) {
				if (state.equalsIgnoreCase("Massachusetts")) {
					$(MA_Physician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				}
				if (state.equalsIgnoreCase("Kansas") || state.equalsIgnoreCase("Nebraska")) {
					$(KS_Physician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				}
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("Maine")) {
			$(HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HCprovidername);
			$(HCAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
			$(HcCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
			$(HcState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
			$(HcZipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("Michigan")) {
			GlobalCap.selectRadioYesorNo(MI_Yes, MI_No, MI_YEsNo);
			if (MI_YEsNo.equalsIgnoreCase("Yes")) {
				if (MI_authorizeHiv.equalsIgnoreCase("Personal Physician")) {
					$(MI_PersonalPhysician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
					$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
					$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
					$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
					$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
					$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
				} else {
					$(MI_HealthFacility).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
					$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
					$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
					$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Keys.HOME + ST);
					$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
				}

			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("New York")) {

			if (NY_physician_or_health.equalsIgnoreCase("Physician")) {
				$(NYPhysician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			} else if (NY_physician_or_health.equalsIgnoreCase("Me (Proposed Insured)")) {
				$(NYMe).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			} else if (NY_physician_or_health.equalsIgnoreCase("Designee")) {
				$(NYDesignee).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(NYDesigneeName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Dname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("Missouri")) {
			GlobalCap.selectRadioYesorNo(MO_Yes, MO_No, MoPhysician_RD);

			if (MoPhysician_RD.equalsIgnoreCase("Yes")) {
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			}
			$(Ex_Name).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ExaminerName);
			$(Fac_Facility).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(FacilityName);
			$(Ex_Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
			$(Ex_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
			$(Ex_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
			$(Ex_Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("Ohio")) {
			$(OHMe).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}

		if (state.equalsIgnoreCase("North Dakota")) {
			$(Ex_Name).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(ExaminerName);
			$(Fac_Facility).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(FacilityName);
			$(Ex_Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
			$(Ex_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
			$(Ex_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
			$(Ex_Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("Rhode Island")) {
			$(RI_MePI).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("Washington")) {
			$(NA_Yes).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HCprovidername);
			$(HCAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
			$(HcCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
			$(HcState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
			$(HcZipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);

			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("Utah")) {
			if (MI_authorizeHiv.equalsIgnoreCase("Personal Physician")) {
				$(UT_PersonalPhysician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			} else {
				$(UT_HealthFacility).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HCprovidername);
				$(HCAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(HcCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(HcState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(HcZipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		if (state.equalsIgnoreCase("New Jersey")||state.equalsIgnoreCase("South Dakota")) {
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if (state.equalsIgnoreCase("New Hampshire")) {
			$(NH_PersonalPhysician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
			$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
			$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
			$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
			$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
			$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if (state.equalsIgnoreCase("Oregon")) {
			$(OR_PI).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if(state.equalsIgnoreCase("Texas")){
			$(Tx_No).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if (state.equalsIgnoreCase("Pennsylvania")) {
			$(PA_LocalHealth).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		if (state.equalsIgnoreCase("Vermont")) {
			if (MI_authorizeHiv.equalsIgnoreCase("Personal Physician")) {
				$(VT_PersonalPhysician).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
				$(LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
				$(Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			} else {
				$(VT_Healthcare).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				$(HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(HCprovidername);
				$(HCAddress).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Addrs);
				$(HcCity).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Cty);
				$(HcState).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(ST);
				$(HcZipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Keys.HOME + Zpcd);
			}
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		
		if (state.equalsIgnoreCase("Virginia")) {
			$(VA_MEPI).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(VA_MEPI2).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
		if (state.equalsIgnoreCase("West Virginia")) {
			$(WV_MepropsedIns).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		}
		
	}

}
