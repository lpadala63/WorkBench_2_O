package pageclass.CCone;


import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class CConeProducerCompensation extends GlobalCap {
	int i;
	By producerRole = By.xpath("//label[contains(text(),'Producer Type')]//following-sibling::select");
	By FirstName = By.xpath("//*[@id='flda_28']");
	By LastName = By.xpath("//*[@id='flda_46']");
	By ProducerID = By.xpath("//*[@id='flda_85']");
	By Email = By.xpath("//input[@id='flda_160' and @name='flda_160']");
	By FloridaLicenceID = By.xpath("//*[@id='flda_145']");
	// By LPC_IsDIProducerinfoandCommissionSplitsSameasLifeQuestn_RB =
	// By.xpath("//*[@id='div_152']/div[2]");
	By EntityName_DD = By.xpath("//*[@id='lb_130']");
	By FirstYearComsn = By
			.xpath("//label[text()='% 1st Year Commission']//following-sibling::input[@id='flda_91']");
	By RenewalComsn = By.xpath("//label[text()='% Renewal Commission']//following-sibling::input[@id='flda_93']");
	By AreThereAddProducersQuestn_Yes = By.xpath("//input[@id='rdo_5_1' and @name='rdo_5_1']");
	By AreThereAddProducersQuestn_No = By.xpath("//input[@id='rdo_5_2' and @name='rdo_5_2']");

	By ClicktoAddProducer = By.xpath("//button[text()='Click here to add...']");
	By AdditionalFrame = By.xpath("//iframe[@id='modalIframe']");
	By AdditionalProducerRole = By.xpath("//label[text()='Producer Type']//following::select[@id='lb_17']");
	By AdditionalProducerid = By.xpath("//label[text()='Producer ID #']//following::input[@id='flda_29']");
	By AdditionalAgencyId = By
			.xpath("//label[text()='Agency # / Distributor ID']//following-sibling::input[@id='flda_27']");
	By AdditionalFirm=By.xpath("//select[@id='lb_46']");
	By ADDFirstYearComsn = By.xpath("//input[@id='flda_34']");
	By ADDRenewalComsn = By.xpath("//input[@id='flda_35']");
	By Save = By.xpath("//div[@class='modal-footer']//button[@id='btn_6' or @name='btn_6']");
	By AdditionalHeading = By.xpath("//h1[text()='Additional Producer']");
	

	By addproducerBtn = By.xpath("//button[@id='grdx15_addRowButton']");
	By Frame = By.xpath("//iframe[@id='CossScreenFrame']");
	
	
	By womensmarkets = By.xpath("//span[contains(text(),'Women')]");	
	By ExistingCustomer = By.xpath("//span[contains(text(),'Existing Customer')]");	
	By MulticulturalInitiative = By.xpath("//span[contains(text(),'Multicultural Initiative')]");
	By Other = By.xpath("//span[contains(text(),'Other')]");
	By Other_details= By.xpath("//label[text()='Details']//following::input[@alt_id='AC_MarketOtherDetails']");
	By Unknown = By.xpath("//span[text()='Unknown/None']");
	
	By Contact1_FirstName = By.xpath("//label[text()='First Name']//following-sibling::input[@alt_id='AC_Contact1FirstName']");
	By Contact1_LastName = By.xpath("//label[text()='Last Name']//following-sibling::input[@alt_id='AC_Contact1LastName']");
	By Contact1_Phone = By.xpath("//label[text()='Phone Number']//following-sibling::input[@alt_id='AC_Contact1Phone']");
	By Contact1_Home = By.xpath("//span[text()='Home' and @id='lbl_190']");
	By Contact1_work = By.xpath("//span[text()='Work' and @id='lbl_189']");
	By Contact1_Cell = By.xpath("//span[text()='Cell' and @id='lbl_188']");
	By Workextension = By.xpath("//label[text()='Extension' and @alt_id='Label5']//following::input[@alt_id='AC_Contact1PhoneExt']");
	

	By Contact1_Email = By.xpath("//label[text()='Email']//following-sibling::input[@id='flda_118']");

	By License = By.xpath("//*[@id='flda_148']");
	By BACK = By.xpath("//*[@id='btn_32']");
	By NEXT = By.xpath("//*[@id='btn_31']");

	public void enterProducerCompensation(String ProductType,String ProducerRole, String ProducerEmail, String LicenceID,
			String Firstyearcommission, String RenewalCommision, String AdditionalProducer) {

		$(producerRole).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(ProducerRole); // Soliciting
		$(Email).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ProducerEmail);
		if ($(FloridaLicenceID).isDisplayed()) {
			$(FloridaLicenceID).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(LicenceID);
		}
		int PCentitycount2 = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_130']//option")).size();	
		//System.out.println("The entity values are"+entitycount);
		if(PCentitycount2>1){
			Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_130']")));
			sc.selectByIndex(1);
		}
		$(FirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcommission);
		if($(RenewalComsn).isDisplayed()){
		$(RenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenewalCommision);
		}
		selectRadioYesorNo(AreThereAddProducersQuestn_Yes, AreThereAddProducersQuestn_No, AdditionalProducer);
		HooksTest.idriver.switchTo().defaultContent();

	}

	public void AdditionalProducer(String ProductType,String AdditionalProducer, String num, String ProducerRole, String producerID1,
			String Agency1,String firm1, String producerID2, String Agency2,String firm2, String producerID3, String Agency3, String firm3,
			String Firstyearcomm1, String RenwalComm1, String Firstyearcomm2, String RenwalComm2, String Firstyearcomm3,
			String RenwalComm3) {

		if (AdditionalProducer.equalsIgnoreCase("Yes")) {
			int number = Integer.parseInt(num);
			for (i = 1; i <= number; i++) {
				System.out.println(number);
				GlobalCap.sleep(8000);
				$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
				HooksTest.idriver.switchTo().frame($(Frame));
				$(addproducerBtn).shouldBe(Visible.exist, Duration.ofSeconds(160)).click();
				GlobalCap.sleep(1000);
				HooksTest.idriver.switchTo().defaultContent();
				GlobalCap.sleep(1500);
				$(AdditionalFrame).shouldBe(Visible.exist, Duration.ofSeconds(100));
				HooksTest.idriver.switchTo().frame($(AdditionalFrame));
				$(AdditionalProducerRole).shouldBe(Visible.exist, Duration.ofSeconds(60))
						.selectOptionContainingText(ProducerRole);
				GlobalCap.sleep(1000);
				if (i == 1) {
					$(AdditionalProducerid).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(producerID1);
					$(AdditionalAgencyId).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Agency1);
					$(AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(2000);
					if($(AdditionalFirm).isDisplayed()){
						$(AdditionalFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(firm1);
					}
					GlobalCap.sleep(9000);
					int entitycount = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_36']//following::option")).size();	
					//System.out.println("The entity values are"+entitycount);
					if(entitycount>1){
						Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_36']")));
						sc.selectByIndex(1);
					}
					$(ADDFirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcomm1);
					if($(ADDRenewalComsn).isDisplayed()){
						$(ADDRenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenwalComm1);
						}
				}
				if (i == 2) {
					$(AdditionalProducerid).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(producerID2);
					$(AdditionalAgencyId).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Agency2);
					$(AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(2000);
					if($(AdditionalFirm).isDisplayed()){
						$(AdditionalFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(firm2);
					}
					GlobalCap.sleep(10000);
					int entitycount2 = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_36']//following::option")).size();	
					//System.out.println("The entity values are"+entitycount);
					if(entitycount2>1){
						Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_36']")));
						sc.selectByIndex(1);
					}
					$(ADDFirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcomm2);
					if($(ADDRenewalComsn).isDisplayed()){
						$(ADDRenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenwalComm2);
						}
				}
				if (i == 3) {
					$(AdditionalProducerid).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(producerID3);
					$(AdditionalAgencyId).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Agency3);
					$(AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(2000);
					if($(AdditionalFirm).isDisplayed()){
						$(AdditionalFirm).shouldBe(Visible.exist, Duration.ofSeconds(10)).selectOptionContainingText(firm3);
					}
					GlobalCap.sleep(10000);
					int entitycount3 = HooksTest.idriver.findElements(By.xpath("//select[@id='lb_36']//following::option")).size();	
					//System.out.println("The entity values are"+entitycount);
					if(entitycount3>1){
						Select sc = new Select(HooksTest.idriver.findElement(By.xpath("//select[@id='lb_36']")));
						sc.selectByIndex(1);
					}
					$(ADDFirstYearComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Firstyearcomm3);
					if($(ADDRenewalComsn).isDisplayed()){
					$(ADDRenewalComsn).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(RenwalComm3);
					}
				}
				$(AdditionalHeading).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				GlobalCap.sleep(2000);
				HooksTest.idriver.switchTo().defaultContent();
				$(Save).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
				if (i == 2 || i == 3) {
					GlobalCap.sleep(11000);
				}
			}
		}
	}

	public void ContactDetails( String IndicateSales,String otherdetails,String ContactOneFirstName, String ContactOneLastName, String ContactOnePhone,
			String PhoneType, String ContactOneExtension, String ContactOneEmail) {
		$(Frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
		HooksTest.idriver.switchTo().frame($(Frame));
		GlobalCap.sleep(7000);
		 switch (IndicateSales) {
	        case "Women's Markets":
	            $(womensmarkets).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	            break;
	        case "Existing Customer":
	            $(ExistingCustomer).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	            break;
	        case "Multicultural Initiative":
	            $(MulticulturalInitiative).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	            break;
	        case "Other":
	            $(Other).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	            $(Other_details).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(otherdetails);
	            
	            break;
	        case "Unknown/None":
	            $(Unknown).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	            break;
	            
	            
	        default:
	            System.out.println("Not able to select the option");
	            break;
	        }
		
		$(Contact1_FirstName).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ContactOneFirstName);
		// Contact 1 Last Name
		$(Contact1_LastName).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ContactOneLastName);
		// Contact 1 Phone
		$(Contact1_Phone).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Keys.HOME + ContactOnePhone);
		switch (PhoneType) {
        case "Home":
            $(Contact1_Home).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
            break;
        case "Work":
            $(Contact1_work).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
            $(Workextension).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ContactOneExtension);
            break;
        case "Mobile":
            $(Contact1_Cell).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
            break;        
        default:
            System.out.println("Option is not available");
            break;
        }
		$(Contact1_Email).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ContactOneEmail);
		$(NEXT).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
	}
}