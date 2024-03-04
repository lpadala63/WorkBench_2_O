package pageclass;

import static com.codeborne.selenide.Selenide.$;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.codeborne.selenide.conditions.Visible;
import commonutils.GlobalCap;
import stepdefinitions.HooksTest;

public class Attachments extends GlobalCap {
	By Attachments_AttachmentNewBusinessReport = By.xpath("//*[@id='btn_198']");
	By LifeSalesIllusButton = By.xpath("//*[@id='btn_5']");
	By AttachmentsIframe = By.xpath("//*[@id='iFrameModal']");
	By BrowseAttachments = By.xpath("//*[@id='fakebrowse']");
	By AttachButton = By.xpath("//*[@id='Submit1']");
	By Attachemnts_close = By.xpath("//*[@id='btnCancel']");
	By Attachments_Attach = By.xpath("//*[@id='Submit1']");
	By ciPageFrame = By.xpath("//iframe[@id='CossScreenFrame']");
	By Attachments_BACK = By.xpath("//*[@id='btn_3']");
	By heading =By.xpath("//a[@id='screen_button_MassMutualDI_MassMutualScreens_Attachments']");
	By illustrationError= By.xpath("//div[@alt_id='lblInfoVULIllustrationError']");
	By IllustrationBuutonAttachemnt=By.xpath("//button[@alt_id='btnIllustration']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By LBPageFrame = By.xpath("//iframe[@id='iFrameModal']");
	By upload=By.xpath("//button[@id='fakebrowse']");
	private static String Formsdata = "\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\EZ-App\\tes.pdf";
	JavascriptExecutor js = (JavascriptExecutor) HooksTest.idriver;

	
	By SignedillustrationAlertMsg = By.xpath("//div[@alt_id='lblInfoVULIllustrationError']");
	
	public void attachements(){
	/*	
		$(heading).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(4000);
		String parent = HooksTest.idriver.getWindowHandle();
		
		
		System.out.println("the parent window name is"+ parent);
		
		if($(illustrationError).isDisplayed()){
			$(IllustrationBuutonAttachemnt).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
			HooksTest.idriver.switchTo().defaultContent();
			$(LBPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(60)).shouldBe(Visible.exist,Duration.ofSeconds(75));
			HooksTest.idriver.switchTo().frame($(LBPageFrame));
			$(upload).shouldBe(Visible.exist, Duration.ofSeconds(30)).sendKeys(System.getProperty("user.dir")+"\\Testdata\\tes.pdf");
		}
		
		Set<String> s = HooksTest.idriver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();
			System.out.println("the childwindow window name is"+ child_window);
			if (!parent.equals(child_window)) {
				HooksTest.idriver.switchTo().window(child_window);
				System.out.println(HooksTest.idriver.switchTo().window(child_window).getTitle());
				HooksTest.idriver.close();
			}
		}*/
	}
	public void attachDocuments(String state,String Product) throws AWTException, InterruptedException {
		$(heading).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
		GlobalCap.sleep(4000);
		if (state.equalsIgnoreCase("New York") || Product.equalsIgnoreCase("Variable Universal Life")) {

			if (Product.equalsIgnoreCase("Variable Universal Life")) {
				if ($(SignedillustrationAlertMsg).isDisplayed()) {
					$(LifeSalesIllusButton).shouldBe(Visible.exist, Duration.ofSeconds(60));
					boolean btnEnable = $(LifeSalesIllusButton).isEnabled();
					if (btnEnable == true) {
						System.out.println("Life Sales Illustration is enabled");
						$(LifeSalesIllusButton).click();
						HooksTest.idriver.switchTo().defaultContent();
						GlobalCap.sleep(9000);
						$(AttachmentsIframe).shouldBe(Visible.exist, Duration.ofSeconds(75));
						HooksTest.idriver.switchTo().frame($(AttachmentsIframe));
						$(BrowseAttachments).shouldBe(Visible.exist, Duration.ofSeconds(30));
						$(BrowseAttachments).click();
						GlobalCap.sleep(5000);
						Robot rb = new Robot();
						rb.delay(3000);
					/*	GlobalCap.sleep(3000);
						StringSelection ss = new StringSelection(
								"\\\\mmdata3b1r1\\Image_WF\\0STP\\5e-Application\\2PlanningA_D\\6Quality_Testing\\eApp\\eApp Modules\\eApp - TeleApp\\Testing\\11. TPP Vs. Batch\\GCC_NBS_Ind\\Automation_EzApp_IGO\\tes.pdf");*/
					    StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\Testdata\\tes.pdf");
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
						rb.keyPress(KeyEvent.VK_CONTROL);
						rb.keyPress(KeyEvent.VK_V);
						rb.keyRelease(KeyEvent.VK_CONTROL);
						rb.keyRelease(KeyEvent.VK_V);
						rb.keyPress(KeyEvent.VK_ENTER);
						rb.keyRelease(KeyEvent.VK_ENTER);
						Thread.sleep(13000);
						$(AttachButton).click();
						Thread.sleep(6000);
						HooksTest.idriver.switchTo().defaultContent();
						Thread.sleep(3000);
						$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(60));
						HooksTest.idriver.switchTo().frame($(ciPageFrame));
						System.out.println("clicked attachemnts ny next");
						$(Next).click();
					}
				}
			}
		}
			/*$(LifeSalesIllusButton).shouldBe(Visible.exist, Duration.ofSeconds(60));
			boolean btnEnable = $(LifeSalesIllusButton).isEnabled();
			if (btnEnable == true) {
				System.out.println("Life Sales Illustration is enabled");
				$(LifeSalesIllusButton).click();
				HooksTest.idriver.switchTo().defaultContent();
				GlobalCap.sleep(9000);
				$(AttachmentsIframe).shouldBe(Visible.exist, Duration.ofSeconds(75));
				HooksTest.idriver.switchTo().frame($(AttachmentsIframe));
				$(BrowseAttachments).shouldBe(Visible.exist, Duration.ofSeconds(30));
				$(BrowseAttachments).click();
				Robot rb = new Robot();
				rb.delay(1000);
				GlobalCap.sleep(3000);
				StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\Testdata\\tes.pdf");
				//StringSelection ss = new StringSelection("Testdata/tes.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(10000);
				$(AttachButton).click();
				Thread.sleep(3000);
				HooksTest.idriver.switchTo().defaultContent();
				Thread.sleep(3000);
				$(ciPageFrame).shouldBe(Visible.exist, Duration.ofSeconds(60));
				HooksTest.idriver.switchTo().frame($(ciPageFrame));
				System.out.println("clicked attachemnts ny next");
				$(Next).click();
			}*/
		 else {
			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			System.out.println("clicked attachemnts all next");
		}
	}

}
