package sample004;

import java.io.UnsupportedEncodingException;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();

		//		メソッドチェーン
		sb.append("hello").append("java").append("world");

		//		相互変換（String→）
		String str = "こんにちはJava";
		char[] data1 = str.toCharArray();
		byte[] data2 = str.getBytes("utf-8");
		byte[] date3 = str.getBytes();

	}
}
