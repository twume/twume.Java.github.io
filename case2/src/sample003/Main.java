package sample003;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);

		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
	}
}

//ZonedDateTime
//LocalDateTime
//LocalDate
//LocalTime
//Year
//YearMonth
//Month
//MonthDay
//上記はすべて、java.time.Temporalインターフェースを実装
