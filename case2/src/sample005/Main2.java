package sample005;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter d = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String str = future.format(d);
		System.out.println(str);
	}
}
