package sample008;

public class RefSample {
	public int times = 0;

	public RefSample(int i) {
		this.times = i;
	}

	public void hello(String msg) {
		this.hello(msg, this.times);
	}

	public void hello(String msg, int t) {
		System.out.println("Hello, " + msg + " x" + t);
	}
}

//Classクラスのメソッド（その型がもつメンバに関する情報）
//java.lang.reflectパッケージ
//Fieldクラス
//Methodクラス
//Constructorクラス
//
//public Field[] getDeclaredFields()
//public Method[] getDeclaredMethod()
//public Constructor<?>[] getDeclaredConstructor()
//public Field getDeclaredField(String)
//public Method geDeclaredMethod(String,Class<?>)
//public Constructor<?> getDeclaredConstructor(Class<?>)