package sample001;

import java.util.function.IntBinaryOperator;

public class Main {
	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		//		関数を代入
		IntBinaryOperator func = Main::sub;
		int a = func.applyAsInt(5, 3);
		System.out.println("5-3は" + a);
	}
}
