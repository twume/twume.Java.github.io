package sample003;

import java.util.function.IntBinaryOperator;

public class Main {
	public static void main(String[] args) {
		IntBinaryOperator func = (int a, int b) -> {
			return a - b;
		};
		int a = func.applyAsInt(5, 3);
		System.out.println("5-3は" + a);
	}
}

//ラムダ式
//①引数の型は省略可能
//②引数が１つしかない場合は、括弧は省略可能
//③単一のreturn文の場合、波括弧やreturnを省略可能
//④ラムダ式の外の変数は扱えるが実質的にfinalでなければならない