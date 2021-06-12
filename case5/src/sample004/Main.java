package sample004;

class Main {
	public static void main(String[] args) {
		//		外部クラスからは、Outer.Innerで利用可能
		Outer.Inner ic = new Outer.Inner();
	}
}

class Outer {
	int outerField;
	static int outerStaticField;

	static class Inner {
		void innerMethod() {
			//			staticクラスのメンバーなので外部のstaticメンバを利用できる
			outerStaticField = 10;
		}
	}

	void outerMethod() {
		//		staticクラスなので外部クラスからのアクセス可能
		Inner ic = new Inner();
	}
}

//もしInnerクラスが非staticクラスなら呼び出し方は特殊
//Outer o = new Outer();
//Outer.Inner o1 = o.new Inner();

//まとめると
//・staticクラスは、
//	外部クラスがなくても（Outer）newできる。
//	外部クラスのメンバにアクセスできるが、staticなものに限られる
//・非staticクラスは、
//	外部クラスがないと（Outer）newできない
//	外部クラスのメンバは非staticでもアクセスできる
