package sample005;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		Calendar c1 = Calendar.getInstance();
		c1.setTime(now);
		int day = c1.get(Calendar.DAY_OF_MONTH);
		c1.set(Calendar.DAY_OF_MONTH, day + 100);
		Date d = c1.getTime();
		SimpleDateFormat s = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(s.format(d));
	}

}
