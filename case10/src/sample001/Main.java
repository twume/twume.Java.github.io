package sample001;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		String s = "ミナト,アサカ,スガワラ";
		StringTokenizer st = new StringTokenizer(s, ",");
		while (st.hasMoreTokens()) {
			String t = st.nextToken();
			System.out.println(t);
		}
	}
}

//java.util.StringTokenizerクラス
//指定したデリミタで文字列を分割し、それぞれのデータ（トークン）を順次取得する機能