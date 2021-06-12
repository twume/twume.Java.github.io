package sample005;

public class Outer {
	int outerMember;

	void outerMethod() {
		int a = 10;
		//		ローカルクラス
		class Inner {
			public void innerMethod() {
				System.out.println("innerMethodです");
				//				外部クラスのメンバなのでアクセス可能
				//				また、今回の場合、aは実質的にfinalなのでアクセス可能
				System.out.println(outerMember);
			}
		}
		//		同じメソッド内ですぐに利用可能
		Inner ic = new Inner();
		ic.innerMethod();
	}
}

//ローカルクラス
//宣言したメソッド内でのみ有効
//finalとabstract以外の修飾は扱えない
//外部クラスのメンバにはアクセス可能
//自信を取り囲むメソッド内のローカル変数についてはfinalがついたもの（実質finalでも可）がアクセス可能
