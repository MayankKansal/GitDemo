package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {
	
	public static String timeConversion(String s) {
		
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		String time = sdf.format(cal.getTime());
		System.out.println(time);
		
			
		
		
		
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		timeConversion("check");

	}

}
