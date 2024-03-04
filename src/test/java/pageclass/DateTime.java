/*package pageclass;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTime {

	public void timezones() {
		String[] ids = TimeZone.getAvailableIDs();

		for (String id : ids) {
			System.out.println(id);
		}
	}
	
	public String Month(){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		return null;  
	}
	public String Date(){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		return null;  
	}
	public String Year(){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		return null;  
	}
	public String Date_Time(){
		String Formattime="MM/DD/YYYY hh:mm::ss a";
		Date date=new Date();
		Calendar cal=new GregorianCalendar();
		cal.setTime(date);
		TimeZone zone=TimeZone.getTimeZone("US/Eastern");
		SimpleDateFormat DataFormat2=new SimpleDateFormat(Formattime);
		DataFormat2.setTimeZone(zone);
		cal.setTimeZone(zone);
		System.out.println(DataFormat2.format(cal.getTime()));
		System.out.println("TimeZone :"+cal.getTimeZone().getID());
		System.out.println("TimeZone Name :" +cal.getTimeZone().getDisplayName());
		return Formattime;
	}
	public static void main(String args[]){
		DateTime DT=new DateTime();
		//DT.timezones();
		//DT.Date_Time();
		DT.Date();
		DT.Month();
		DT.Year();
		
	
	}

}
*/