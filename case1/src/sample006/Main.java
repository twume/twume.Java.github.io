package sample006;

public class Main {
	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, "minato", "hero", 280);
		System.out.println(s);

		System.out.printf("製造番号%s-%02d", "SJV", 3);
	}
}

//% 修飾 桁 型
//修飾	,	3桁ごとにカンマ
//		0	０埋め
//		-	左寄せ
//		+	符号表示

//桁	表示桁数を指定
//	n.m形式の場合,全体n桁、小数点以下m桁

//型	d	整数
//	s	文字列
//	f	少数
//	b	真偽値