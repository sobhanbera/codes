package CP;

import java.util.Calendar;
import java.math.*;

public class DayOfWeek {

	public static void main(String[] args) {
		
		int year = 2020,month = 05,date=3;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, date);
		int n = calendar.get(calendar.DAY_OF_WEEK);
		printDayOfWeek(n);
	}
	
	public static void printDayOfWeek(int n) {
		System.out.println(n);
		String days[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		System.out.println(days[n-1]);
	}

}
