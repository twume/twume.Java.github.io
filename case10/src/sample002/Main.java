package sample002;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		//		************ファイルの読み込み
		//SJIS指定
		Charset ch1 = Charset.forName("UTF-8");
		Reader fr = new FileReader("e:\\rpgdata.properties", ch1);
		Properties p = new Properties();
		//		ファイル内容を読み込む
		p.load(fr);
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.println("勇者の名前：" + name);
		System.out.println("勇者のHP：" + hp);
		fr.close();

		//		************ファイルの書き込み
		Writer fw = new FileWriter("e:\\rpgdatat.properties", ch1);
		Properties p2 = new Properties();
		//setPropertyでデータのセット
		p2.setProperty("heroName", "てけ");
		p2.setProperty("heroHp", "89");
		p2.setProperty("heroMp", "34");
		//stroreでファイルへ書き出す（第二引数はコメント行）
		p2.store(fw, "勇者の情報");
	}
}

//java.util.Propertiesクラス
//すべてのデータを文字列として扱うので整数やboolean型の値を取り扱う場合、キャストが必要

//※クラスパスを基準とした指定でファイルを開く方法
//ClassクラスやClassLoaderクラスに備わるgetResourceAsStream()メソッドを使用する
//InputStream is = Main.class.getResourceAsStream(\\rpg\\rpgsave.dat");
