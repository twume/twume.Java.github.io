package sample005;

public class Main {
	public static void main(String[] args) {
		FuncList funclist = new FuncList();
		//		Func1 func1 = FuncList::isOdd;
		//		Func2 func2 = funclist::addNamePrefix;
		//		ラムダ式の場合
		Func1 func1 = i -> i % 2 == 1;
		Func2 func2 = (male, name) -> {
			if (male == true) {
				return "Mr." + name;
			} else {
				return "Ms." + name;
			}
		};
		//		ラムダの別の書き方
		//		Func2 func2 = (male,name) -> male ? "Mr.":"Ms." + name;
		System.out.println(func1.call(5));
		System.out.println(func2.call(false, "tets"));
	}
}
