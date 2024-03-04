package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class MMSD_DI_OtherCoverageInformation extends GlobalCap {

	By frame = By.xpath("//iframe[@id='CossScreenFrame']");
	By DIInsINForceYes = By.xpath("//input[@id='rdo_116_1' or @name='rdo_116_1']");
	By DIInsINForceNo = By.xpath("//input[@id='rdo_116_2' or @name='rdo_116_2']");
	By AdditionalContributoryYes = By.xpath("//input[@id='rdo_123_1' or @name='rdo_123_1']");
	By AdditionalContributoryNo = By.xpath("//input[@id='rdo_123_2' or @name='rdo_123_2']");
	By EligibleParticipateYes = By.xpath("//input[@id='rdo_124_1' or @name='rdo_124_1']");
	By EligibleParticipateNo = By.xpath("//input[@id='rdo_124_2' or @name='rdo_124_2']");
	By StateCashSicknessYes = By.xpath("//input[@id='rdo_119_1' or @name='rdo_119_1']");
	By StateCashSicknessNo = By.xpath("//input[@id='rdo_119_2' or @name='rdo_119_2']");
	By SalaryIncomeYes = By.xpath("//input[@id='rdo_127_1' or @name='rdo_127_1']");
	By SalaryIncomeNo = By.xpath("//input[@id='rdo_127_2' or @name='rdo_127_2']");
	By ReinstatementYes = By.xpath("//input[@id='rdo_117_1' or @name='rdo_117_1']");
	By ReinstatementNo = By.xpath("//input[@id='rdo_117_2' or @name='rdo_117_2']");
	By Next = By.xpath("//button[@id='btn_32' or @name='btn_32']");
	By NextCert = By.xpath("//button[@id='btn_19' or @name='btn_19']");

	public void OtherCovInformation(String Inforce, String AddContributory, String EligibileParticipate,
			String StateCashSick, String SalaryIncome, String Reinstate) {
		
		GlobalCap.sleep(2000);
	//	$(frame).shouldBe(Visible.exist, Duration.ofSeconds(60));
   //    HooksTest.idriver.switchTo().frame($(frame));
		GlobalCap.selectRadioYesorNo(DIInsINForceYes, DIInsINForceNo, Inforce);
		GlobalCap.selectRadioYesorNo(AdditionalContributoryYes, AdditionalContributoryNo, AddContributory);
		GlobalCap.selectRadioYesorNo(EligibleParticipateYes, EligibleParticipateNo, EligibileParticipate);
		GlobalCap.selectRadioYesorNo(StateCashSicknessYes, StateCashSicknessNo, StateCashSick);
		GlobalCap.selectRadioYesorNo(SalaryIncomeYes, SalaryIncomeNo, SalaryIncome);
		GlobalCap.selectRadioYesorNo(ReinstatementYes, ReinstatementNo, Reinstate);

		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

		// GlobalCap.sleep(10000);

	}

	public  void CertificationRequirements() {
		$(NextCert).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

	}
}
