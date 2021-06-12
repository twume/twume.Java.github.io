package sample004;

public class Main {
	public static void main(String[] args) {
		//		改行コードを取得しておく
		final String BR = System.getProperty("line.separator");
		System.out.println("本日は" + BR + "晴天なり");
	}
}

//改行コード
//Windows	CR+LF(\r\n)
//MacOS(9以前)	CR(\r)
//MacOSX(10以降)	LF(\n)
//Linux,BSD等		LF(\n)
