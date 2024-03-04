package commonutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;

import stepdefinitions.HooksTest;

import static com.codeborne.selenide.Selenide.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class GlobalCap extends HooksTest {
	public static By LPS_Next=By.xpath("//button[contains(text(),'Next')]");
	public static WebDriver gwebDriver;
public static String ExcelFilename= System.getProperty("excelfilename");
	public static void Dropdownlist(By xpath, String inputdata) {
		List<WebElement> List = HooksTest.idriver.findElements((xpath));
		for (int i = 0; i <= List.size() - 1; i++) {
			if (List.get(i).getText().equalsIgnoreCase(inputdata)) {
				List.get(i).click();
				break;
			}
		}
	}
	public static void ClickNext(){
		$(LPS_Next).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
	}
	public static void selectId(By SSN, By TIN, String value) {

		switch (value) {
		case "SSN":
			$(SSN).click();
			break;
		case "TIN":
			$(TIN).click();
			break;

		default:
			System.out.println("Not able to select the option");
			break;
		}

	}

	public void switchToWindow(int index) {
		switchTo().window(index);
	}

	public static void selectRadioYesorNo(By Yeselement, By Noelement, String value) {
		switch (value) {
		case "Yes":
			$(Yeselement).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			break;
		case "No":
			$(Noelement).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			break;
		default:
			System.out.println("Not able to select the option");
			break;
		}
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void selectRadioYesorNoDetails(By Yeselement, By Noelement, String value, By Detialsxpath,
			String inputdata) {

		switch (value) {
		case "Yes":
			$(Yeselement).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			$(Detialsxpath).shouldBe(Visible.exist, Duration.ofSeconds(10)).setValue(inputdata);
			break;
		case "No":
			$(Noelement).shouldBe(Visible.exist, Duration.ofSeconds(10)).click();
			break;
		default:
			System.out.println("Not able to select the option");
			break;
		}

	}

	public static void signature(By Esign_xpath, By WetSign, String value) {

		switch (value) {
		case "Esign":
			$(Esign_xpath).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			break;
		case "WetSign":
			$(WetSign).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			break;

		default:
			System.out.println("Not able to select the option");
			break;
		}

	}

	public static void selectownertype(By OwnerElement, By EntityElement, String value) {

		switch (value) {
		case "Individual Owner":
			$(OwnerElement).click();
			break;
		case "Entity":
			$(EntityElement).click();
			break;
		default:
			System.out.println("Not able to select the option");
			break;
		}
	}

	public static void pageload(int sec) {
		HooksTest.idriver.manage().timeouts().pageLoadTimeout(sec, TimeUnit.SECONDS);
	}

	public static void selectAM_PM(By AMelement, By PMelement, String value) {

		switch (value) {
		case "AM":
			$(AMelement).click();
			break;
		case "PM":
			$(PMelement).click();
			break;
		default:
			System.out.println("Not able to select the option");
			break;
		}
	}
	/*public static String Month(){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M");  
		   LocalDateTime now = LocalDateTime.now();  
		 String Month=dtf.format(now);
		return Month;  
	}
	public static String Date(){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD");  
		   LocalDateTime now = LocalDateTime.now();  
		  String Date=dtf.format(now);
		return Date;  
	}
	public static String Year(){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY");  
		   LocalDateTime now = LocalDateTime.now();  
		   String year=dtf.format(now);
		return year;  
	}*/
	
	public static String Month(){
		String Formattime="MM";
		Date date=new Date();
		Calendar cal=new GregorianCalendar();
		cal.setTime(date);
		TimeZone zone=TimeZone.getTimeZone("US/Eastern");
		SimpleDateFormat DataFormat2=new SimpleDateFormat(Formattime);
		DataFormat2.setTimeZone(zone);
		cal.setTimeZone(zone);
		String datetime=DataFormat2.format(cal.getTime());
		return datetime;
	}
	public static String Date(){
		String Formattime="dd";
		Date date=new Date();
		Calendar cal=new GregorianCalendar();
		cal.setTime(date);
		TimeZone zone=TimeZone.getTimeZone("US/Eastern");
		SimpleDateFormat DataFormat2=new SimpleDateFormat(Formattime);
		DataFormat2.setTimeZone(zone);
		cal.setTimeZone(zone);
		String datetime=DataFormat2.format(cal.getTime());
		return datetime;
	}
	public static String Year(){
		String Formattime="YYYY";
		Date date=new Date();
		Calendar cal=new GregorianCalendar(); 
		cal.setTime(date);
		TimeZone zone=TimeZone.getTimeZone("US/Eastern");
		SimpleDateFormat DataFormat2=new SimpleDateFormat(Formattime);
		DataFormat2.setTimeZone(zone);
		cal.setTimeZone(zone);
		String datetime=DataFormat2.format(cal.getTime());
		return datetime;
	}
	
	
	public static String Date_Time(){
		String Formattime="MM/dd/YYYY hh:mm a";
		Date date=new Date();
		Calendar cal=new GregorianCalendar();
		cal.setTime(date);
		TimeZone zone=TimeZone.getTimeZone("US/Eastern");
		SimpleDateFormat DataFormat2=new SimpleDateFormat(Formattime);
		DataFormat2.setTimeZone(zone);
		cal.setTimeZone(zone);
		String datetime=DataFormat2.format(cal.getTime());
		return datetime;
	}
}