package sample003;

public class Main {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));
		//		test
		System.out.println(s1.replace(s1, "test"));
	}
}

//public String toLowerCase()	大文字を小文字に変換
//public String toUpperCase()	小文字を大文字に変換
//public String trim()			前後の空白を除去（全角スペースは除去されない）
//public String replace(String before,String after)		文字列を置き換える
