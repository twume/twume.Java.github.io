package sample007;

public class Main {
	public static void main(String[] args) {
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());
		System.out.println(info1.getPackage().getName());
		System.out.println(info1.getPackageName());
		System.out.println(info1.isArray());

		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName());

		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray());
	}
}

//Classインスタンス
//①Class<?> cinfo = Class.forName（FQCN文字列);
//②Class<?> cinfo = クラス名.class;
//③Class<?> cinfo = 変数名.GetClass();

//※①の方法でクラスが見つからない場合、ClassNotFoundExceptionが発生する

//Classクラスのメソッド
//public String getName()
//public String getSimpleName()
//public Package get Package()
//※戻り値はPackageインスタンスのgetName()メソッドを呼び出すことでパッケージ名を取得できる
//public Class<?> getSuperclass()
//public boolean isArray()
//public boolean isInterface()
//public boolean isEnum()
//public Object newInstance()		引数無しでnewする