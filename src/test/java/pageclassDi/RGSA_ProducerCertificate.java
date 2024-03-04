package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class RGSA_ProducerCertificate extends GlobalCap{

	By Discount=By.xpath("//select[@id='lb_9' or @name='lb_9']");
	By LTCYes=By.xpath("//input[@id='rdo_7_1' or @name='rdo_7_1']");
	By LTCNo=By.xpath("//input[@id='rdo_7_2' or @name='rdo_7_2']");
	By LTCDetail=By.xpath("//input[@id='flda_21' or @name='flda_21']");
	By ConsumerInfoYes=By.xpath("//input[@id='rdo_3_1' or @name='rdo_3_1']");
	By ConsumerInfoNo=By.xpath("//input[@id='rdo_3_2' or @name='rdo_3_2']");
	By TerminationYes=By.xpath("//input[@id='rdo_14_1' or @name='rdo_14_1']");
	By TerminationNo=By.xpath("//input[@id='rdo_14_2' or @name='rdo_14_2']");
	By TerminationDetail=By.xpath("//textarea[@id='flda_16' or @name='flda_16']");
	By Next=By.xpath("//button[@id='btn_18' or @name='btn_18']");
	
	
	public void RGSAProducerCert(String RGSAProduct,  String Disc, String LTC,String LTCDetails,  String ConsumerInfo, String Termination, String TDetails){
		
		if (RGSAProduct.equalsIgnoreCase("RetireGuard StandAlone") ){
		$(Discount).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Disc);
				
		GlobalCap.selectRadioYesorNo(LTCYes,LTCNo , LTC);
		
		$(LTCDetail).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(LTCDetails);
				
		GlobalCap.selectRadioYesorNo(ConsumerInfoYes,ConsumerInfoNo ,ConsumerInfo );
		
		GlobalCap.selectRadioYesorNo(TerminationYes, TerminationNo,Termination );
		
		$(TerminationDetail).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(TDetails);
				
		$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
		
	}
	}
}
