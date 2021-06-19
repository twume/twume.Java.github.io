package sample007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("e:\\rpgsave.dat");
		//		BuffredeReaderで接続
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}

//バッファリングフィルタ
//データの変換はしない。データをため込みまとまった量になったところで流す
//文字情報用	BufferedReader,BufferedWriter
//バイト情報用	BufferedInputStream,BufferedOutputStream