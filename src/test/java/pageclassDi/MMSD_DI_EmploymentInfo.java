package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class MMSD_DI_EmploymentInfo extends GlobalCap {
	By Label = By.xpath("//h1[text()='Disability Income Employment Information']");
	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By WhatPercentOfPI = By.xpath("//input[@id='flda_47' or @name='flda_47']");
	By StatePIworks = By.xpath(
			"//label[text()='State Proposed Insured works in:']//following-sibling::select[@id='lb_34' or @name='lb_34']");
	By HowlongPIempld_L2 = By.xpath("//input[@id='rdo_46_1' or @name='rdo_46_1']");
	By HowlongPIempld_2M = By.xpath("//input[@id='rdo_46_2' or @name='rdo_46_2']");
	By years = By.xpath("//input[@id='flda_45' or @name='flda_45']");
	By howmanyhrs = By.xpath("//input[@id='flda_42' or @name='flda_42']");
	By previousocupation = By.xpath("//input[@id='flda_44' or @name='flda_44']");
	By DurationYR = By.xpath("//input[@id='flda_59' or @name='flda_59']");
	By Last90days_Yes = By.xpath("//input[@id='rdo_41_1' or @name='rdo_41_1']");
	By Last90days_No = By.xpath("//input[@id='rdo_41_2' or @name='rdo_41_2']");
	By fullorpartialdays = By.xpath("//input[@id='flda_60' or @name='flda_60']");
	By providedatesforsick = By.xpath("//input[@id='flda_39' or @name='flda_39']");
	By Next = By.xpath("//button[@name='btn_37' or @id='btn_37']");

	public void EmpInfo(String whatpercentOfPI, String StatePi, String howlongPI, String previousOccup, String duration,
			String Years, String Howmanyyrs, String Last90days, String FullorPartialdays, String ProvideDatesforSick) {

		GlobalCap.sleep(1000);
		$(WhatPercentOfPI).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		$(WhatPercentOfPI).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(whatpercentOfPI);
		$(StatePIworks).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(StatePi);
	
		switch (howlongPI) {
		case "lessthan2years":
			$(HowlongPIempld_L2).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			$(previousocupation).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(previousOccup);

			$(DurationYR).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(duration);

			break;
		case "2ormoreyears":
			$(HowlongPIempld_2M).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			break;
		default:
			System.out.println("Not able to select the option");
			break;
		}
		$(years).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Years);

		$(howmanyhrs).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(Howmanyyrs);

		if (Last90days.equalsIgnoreCase("Yes")) {
			GlobalCap.selectRadioYesorNo(Last90days_Yes, Last90days_No, Last90days);

			// need to implement more in future
		} else if (Last90days.equalsIgnoreCase("No")) {
			GlobalCap.selectRadioYesorNo(Last90days_Yes, Last90days_No, Last90days);

			$(fullorpartialdays).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(FullorPartialdays);

			$(providedatesforsick).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(ProvideDatesforSick);

		}
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

	}
}
