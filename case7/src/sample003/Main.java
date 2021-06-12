package sample003;

import java.util.Iterator;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		System.out.println("ご利用のJavaのバージョン：");
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("【システムプロパティ一覧】");
		while (i.hasNext()) {
			String s = i.next();
			System.out.print(s + " = ");
			System.out.println(System.getProperty(s));
		}
	}
}

//システムプロパティ
//java.version
//java.home
//os.name
//line.separator	動作中のosの改行コード
//user.name

//PropertiesインスタンスのstringPropertyName()は戻り値がSet型
//そのため、p.stringPropertyNames().iterator()でSetのIteratorインスタンスを取得できる
//これでシステムプロパティのキーを１つずつ取り出して、System.getProperty(key)で、値を取得する