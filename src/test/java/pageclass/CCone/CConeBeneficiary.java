package pageclass.CCone;

import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class CConeBeneficiary extends GlobalCap {
	By LB_DistributionType_DD = By.xpath("//*[@id='lb_61']");
	By LB_Beneficiary_ClickToAdd = By.xpath("//*[@id='grdx5_addRowButton']");
	By LB_BeneficiaryType_DD = By.xpath("//*[@id='lb_113']");
	By LB_LegalNameofEntity = By.xpath("//*[@id='flda_35']");
	By LB_ParentFirstName = By.xpath("//*[@id='flda_118']");
	By LB_ParentLastName = By.xpath("//*[@id='flda_116']");
	By LB_TrustName = By.xpath("//*[@id='flda_36']");
	By LBPageFrame = By.xpath("//iframe[@id='modalIframe']");
	By LB_NIFirstName = By.xpath("//*[@id='flda_13']");
	By LB_NI_MI = By.xpath("//*[@id='flda_11']");
	By LB_NI_LastName = By.xpath("//*[@id='flda_17']");
	By LB_NI_Suffix_DD = By.xpath("//*[@id='lb_23']");
	By LB_NI_MailingAddressSameasPrimaryInsured = By.xpath("//span[contains(text(),'Mailing Address same')]");
	By LB_NI_Country_DD = By.xpath("//*[@id='lb_131']");
	By LB_NI_Street1 = By.xpath("//*[@id='flda_141']");
	By LB_NI_Street2 = By.xpath("//*[@id='flda_139']");
	By LB_NI_Street3 = By.xpath("//*[@id='flda_137']");
	By LB_NI_City = By.xpath("//*[@id='flda_135']");
	By LB_NI_HomeWorkMobile_DD = By.xpath("//*[@id='lb_147']");
	By LB_NI_MAWorkMobile_DD = By.xpath("//*[@id='lb_143']");
	By LB_NI_ZIPcode = By.xpath("//*[@id='flda_144']");
	By LB_NI_PhoneNumber = By.xpath("//*[@id='flda_149']");
	By LB_NI_Extension = By.xpath("//*[@id='flda_145']");
	By LB_NI_DOB_MM = By.xpath("//*[@id='div_15']/div/span/span[1]/input[1]");
	By LB_NI_DOB_DD = By.xpath("//*[@id='div_15']/div/span/span[1]/input[2]");
	By LB_NI_DOB_YYYY = By.xpath("//*[@id='div_15']/div/span/span[1]/input[3]");
	By LB_NI_Turst_DOB_DD = By.xpath("//*[@id='div_38']/div/span/span[1]/input[1]");
	By LB_NI_Trust_DOB_MM = By.xpath("//*[@id='div_38']/div/span/span[1]/input[2]");
	By LB_NI_Trust_DOB_YYYY = By.xpath("//*[@id='div_38']/div/span/span[1]/input[3]");
	By LB_SitusOfTrust_DD = By.xpath("//*[@id='lb_151']");
	By LB_TypeOfTrust_RB = By.xpath("//*[@id='div_67']/div[2]");
	By LB_NI_TINType_RB = By.xpath("//*[@id='div_72']/div[2]");
	By LB_TaxIDNo = By.xpath("//*[@id='flda_91']");
	By LB_NI_TINType_SSN_RB = By.xpath("//*[@id='rdo_174_1']");
	By LB_NI_TINType_Unknown_RB = By.xpath("//*[@id='rdo_174_2']");
	By LB_NI_TaxIdNo = By.xpath("//*[@id='flda_91']");
	By LB_NI_RelationshiptoInsured_DD = By.xpath("//*[@id='lb_78']");
	By LB_NI_Issueperstirpes_RB = By.xpath("//*[@id='div_153']/div[2]");
	By LB_Address = By.xpath("//*[@id='cb_179']");
	By LB_Distribution = By.xpath("//*[@id='flda_4']");
	By LB_NI_Distribution = By.xpath("//*[@id='flda_4']");
	By LB_FN = By.xpath("//*[@id='flda_118']");
	By LB_LN = By.xpath("//*[@id='flda_116']");
	By LB_NI_IssueStripes_RB = By.xpath("//*[@id='div_153']/div[2]");
	By LB_NI_IssueStripes_RB_yes = By.xpath("//*[@id='rdo_153_1']");
	By LB_NI_IssueStripes_RB_no = By.xpath("//*[@id='rdo_153_2']");
	By LB_NI_Save = By.xpath("//button[text()='Save']");
	By secondaryben_Yes = By.xpath("//label[contains(text(),'Secondary Beneficiary')]//following::input[@alt_id='CBene_YesNo_1']");
	By secondaryben_No = By.xpath("//label[contains(text(),'Secondary Beneficiary')]//following::input[@alt_id='CBene_YesNo_2']");
	By AdditionalInfo = By.xpath("//label[contains(text(),'Additional Information')]//following::textarea");
	By LB_NEXT = By.xpath("//*[@id='btn_17']");
	By LB_Issue__Stirpes_No_text = By.xpath("//span[@id='lbl_153_2' and contains(text(),'No')]");
	By LB_Issue__Stirpes_Yes_text = By.xpath("//span[@id='lbl_153_1' and contains(text(),'Yes')]");
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
	By CConePageFrame = By.xpath("//iframe[@id='modalIframe']");
	By LB_second_B_No = By.xpath("//*[@id='rdo_19_2']");
	By Beneficiarydesignation = By.xpath("//span[contains(text(),'Beneficiary Designation Form')]");
	By EndorsementSplitDollarBeneficiary = By.xpath("//span[contains(text(),'Endorsement Split Dollar Beneficiary')]");
	public void bene(String beneficiaryform){
		if(beneficiaryform.equalsIgnoreCase("Beneficiarydesignation")){
			$(Beneficiarydesignation).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		else{
			$(EndorsementSplitDollarBeneficiary).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		}
		
	}
	public void distribution_Type(String distributiontype) {
		$(LB_DistributionType_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionByValue(distributiontype);

	}

	public void beneficiary_addition(String Beneficiary_ClickHeretoAdd, String BeneficiaryType, String firstname,
			String Middlename, String lastname, String Suffix, String Mailingaddress, String Homeworkmobile,
			String phone, String Extension, String Month, String Date, String Year, String TinType, String SSn_number,
			String RelationShip, String Distribution, String LB_IssueStripes,String secondarybene,String additionalinfo) {

		GlobalCap.sleep(1000);
		if (Beneficiary_ClickHeretoAdd.equalsIgnoreCase("Yes")) {
			$(LB_Beneficiary_ClickToAdd).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			HooksTest.idriver.switchTo().defaultContent();
			$(LBPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(60)).shouldBe(Visible.exist,
					Duration.ofSeconds(75));
			HooksTest.idriver.switchTo().frame($(LBPageFrame));
			$(LB_BeneficiaryType_DD).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionByValue(BeneficiaryType);
			$(LB_NIFirstName).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(firstname);
			$(LB_NI_MI).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Middlename);
			$(LB_NI_LastName).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(lastname);
			$(LB_NI_Suffix_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionByValue(Suffix);
			if (Mailingaddress.equalsIgnoreCase("Yes")) {
				$(LB_NI_MailingAddressSameasPrimaryInsured).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (Mailingaddress.equalsIgnoreCase("No")) {
			}
			$(LB_NI_HomeWorkMobile_DD).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionByValue(Homeworkmobile);
			if (Homeworkmobile.equalsIgnoreCase("Home")) {
				$(LB_NI_PhoneNumber).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Keys.HOME + phone);
			} else if (Homeworkmobile.equalsIgnoreCase("Work")) {
				GlobalCap.sleep(1000);
				$(LB_NI_PhoneNumber).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Keys.HOME + phone);
				if($(LB_NI_Extension).isDisplayed()){
				$(LB_NI_Extension).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Extension);
				}
			} else if (Homeworkmobile.equalsIgnoreCase("Mobile")) {
				$(LB_NI_PhoneNumber).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Keys.HOME + phone);
			}
			$(LB_NI_DOB_MM).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Month);
			$(LB_NI_DOB_DD).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Date);
			$(LB_NI_DOB_YYYY).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Year);
			GlobalCap.sleep(1000);
			switch (TinType) {
			case "SSN":
				$(LB_NI_TINType_SSN_RB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				$(LB_NI_TaxIdNo).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Keys.HOME + SSn_number);
				break;
			default:
				$(LB_NI_TINType_Unknown_RB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				break;
			}
			$(LB_NI_RelationshiptoInsured_DD).shouldBe(Visible.exist, Duration.ofSeconds(60))
					.selectOptionByValue(RelationShip);
			$(LB_NI_Distribution).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Distribution);
			String No_text_stripes = HooksTest.idriver
					.findElement(By.xpath("//span[@id='lbl_153_2' and contains(text(),'No')]")).getText();
			String Yes_text_stripes = HooksTest.idriver
					.findElement(By.xpath("//span[@id='lbl_153_1' and contains(text(),'Yes')]")).getText();
			if (No_text_stripes.equalsIgnoreCase(LB_IssueStripes)) {
				$(LB_NI_IssueStripes_RB_no).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			} else if (Yes_text_stripes.equalsIgnoreCase("Yes")) {
				$(LB_NI_IssueStripes_RB_yes).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			}
			$(LB_NI_Save).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			HooksTest.idriver.switchTo().defaultContent();
		}
		$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(75));
		HooksTest.idriver.switchTo().frame($(ciPageFrame));
		selectRadioYesorNo(secondaryben_Yes, secondaryben_No, secondarybene);
		$(AdditionalInfo).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(additionalinfo);
		$(LB_NEXT).click();
	}
}