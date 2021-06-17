package sample002;

import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("e:\\rpgsave.dat");
		System.out.println("すべてのデータを読んで表示します");
		//		１文字読む
		int i = fw.read();
		//		これ以上読めるデータがない場合「-1」
		while (i != -1) {
			//			char型にキャストが必要
			char c = (char) i;
			System.out.println(c);
			i = fw.read();
		}
		System.out.println("ファイルの末尾に達しました");
		fw.close();
	}
}

//FileReaderクラス
//IOExceptionが必要
//テキストファイルで使用