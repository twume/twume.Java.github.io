package sample008;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) throws Exception {

		Class<?> clazz = RefSample.class;

		//		引数が一つでint型のコンストラクタを取得
		Constructor<?> cons = clazz.getConstructor(int.class);
		//		取得したコンストラクタを使用してインスタンスを作成（型が？なのでキャストが必要）
		RefSample ts = (RefSample) cons.newInstance(256);

		//		timesフィールドに関する情報を取得
		Field f = clazz.getField("times");
		//		引数で指定したオブジェクトのフィールドを上書き
		f.set(ts, 2);
		//		引数で指定したオブジェクトのフィールドを表示
		System.out.println(f.get(ts));

		//		引数２つのhelloメソッドを取得
		Method m = clazz.getMethod("hello", String.class, int.class);
		//		引数で指定したオブジェクトのメソッドを引数を指定して実行
		m.invoke(ts, "reflection", 128);

		//		修飾を調べる（Modifierクラスを使用）
		//		クラスがpulicかどうか
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		//		メソッドがfinalかどうか
		boolean finm = Modifier.isFinal(m.getModifiers());
		System.out.println(pubc + " " + finm);

	}
}

//clazz.getModifiers()やm.getModifires()で、修飾子を整数方に符号化したint型が取得できる
