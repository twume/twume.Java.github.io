package sample003;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {
	public static void main(String[] args) {
		//		文字列からLocalDateを作成
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2012/08/21", f);

		//		1000日後を計算する
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000日後は" + str);

		//		現在の日付との比較
		LocalDate now = LocalDate.now();
		if (now.isAfter(d)) {
			System.out.println("nowはdより新しい");
		}
	}
}

//以下共通のメソッド
//now()	現在日時からインスタンスを生成
//of()/of~()	他の種類から変換してインスタンスを生成
//parse()	"2012/1/12"等の文字列からインスタンスを生成。文字列書式はDateTimeFormatter
//format()	保持情報を"2012/1/12"等の文字列に変換。文字列書記はDateTimeFormatter
//get~()	格納する年や月を取得。～にはYear,Month,DayOfMonthなど
//isAfter()/isBefore()	引数でわたしたインスタンスとの前後関係
//plus~()/minus~()	指定した分だけ未来または過去の時点を表す。～にはYear,Month,DayOfMonthなど
//plus()/minus()	指定した時間間隔(PeriodやDuration)のぶんだけ未来または過去の時点を返す