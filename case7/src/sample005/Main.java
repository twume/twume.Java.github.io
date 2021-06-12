package sample005;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String ver = System.getProperty("rpg.version");
		String author = System.getProperty("rpg.author");
		System.out.println("RPG: スッキリ魔王征伐 ver" + ver);
		System.out.println("Developed by" + author);

		Map<String, String> m = System.getenv();
		for (String key : m.keySet()) {
			String item = m.get(key);
			System.out.println(key + " : " + item);
		}
	}
}

//システムプロパティの設定
//①System.setProperty(key,値);
//②java起動時に設定	-Dオプションを使用
//	上記のソースを起動する場合
//	java -Drpg.version=0.3 -Drpg.author=ミナト Main

//ＯＳの環境変数
//Systemクラスのgetenv()メソッドを使用