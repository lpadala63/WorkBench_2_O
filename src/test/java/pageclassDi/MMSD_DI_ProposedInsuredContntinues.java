package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class MMSD_DI_ProposedInsuredContntinues extends GlobalCap {

	By DriverLicense_yes =By.xpath("//input[@id='rdo_38_1' or @name='rdo_38_1']");
	By DriverLicense_No =By.xpath("//input[@id='rdo_38_2' or @name='rdo_38_2']");
	By identificationNo =By.xpath("//label[text()='Identification Number']//following::input[1]");
	By ProvinceofIssue =By.xpath("//label[text()='State/Province of Issue']//following::select[1]");
	By ReasonY =By.xpath("//label[text()='Reason why:']//following::select[1]");
	By other =By.xpath("//label[text()='Other']//following::input[1]");
	By otherRd =By.xpath("//span[text()='Other']//preceding::input[1]");
	By PassportRd =By.xpath("//span[text()='Passport']//preceding::input[1]");
	By citizenship =By.xpath("//select[@alt_id='Citizenship']");
	By Next= By.xpath("//button[@id='btn_7' or @name='btn_7']");

	public void identification(String DL_YesNo, String idnum, String Signstate, String Reason,
			String TypeOfIdentificaion, String Other) {
		if (DL_YesNo.equalsIgnoreCase("Yes")) {
			GlobalCap.selectRadioYesorNo(DriverLicense_yes, DriverLicense_No, DL_YesNo);

			$(identificationNo).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(idnum);
		
			$(ProvinceofIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Signstate);
		

		} else if (DL_YesNo.equalsIgnoreCase("No")) {

			GlobalCap.selectRadioYesorNo(DriverLicense_yes, DriverLicense_No, DL_YesNo);

			$(ReasonY).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Reason);
			
	//		$(PassportRd).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			
			$(identificationNo).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(idnum);
			
			$(ProvinceofIssue).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Signstate);
						
			switch (TypeOfIdentificaion) {
			case "Passport":
				$(PassportRd).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
				break;
			case "Other":
				$(Other).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Other);				
				
				
				break;

			default:
				System.out.println("Not able to select the option");
				break;
			}
		}

	

	}

	public void citizenship(String Citizenship) {
		
		$(citizenship).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(Citizenship);
		
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		
		
	}

}
