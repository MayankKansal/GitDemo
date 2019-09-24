package DateDemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
	LocalDate date=	LocalDate.now();
	
	LocalTime t= LocalTime.now();
	
		
		
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		System.out.println(d.toString());
		System.out.println("-----------------");
		System.out.println(date);
		System.out.println(t);
	}

}
