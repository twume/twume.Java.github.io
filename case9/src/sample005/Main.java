package sample005;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
	public static void main(String[] args) {
		String msg = "第1土曜";
		try (Reader sr = new StringReader(msg)) {
			char c1 = (char) sr.read();
			char c2 = (char) sr.read();
			System.out.println(c1 + c2);
			FileWriter fw = new FileWriter("e:\\rpgsave.dat", true);
			fw.write(c1);
			fw.write(c2);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

//標準出力	System.out
//標準エラー	System.err
//標準入力	System.in

//StringReaderクラス
//JVM内部の変数の読み書きで、指定されたString型変数から１文字ずつ読み取る