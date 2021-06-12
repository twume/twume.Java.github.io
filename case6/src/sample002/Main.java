package sample002;

public class Main {
	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		//		宣言したインターフェースと同じ引数と戻り値のメソッドを代入
		Myfunction func = Main::sub;
		//		使用する場合は、インターフェースのメソッド名を使用する
		int a = func.call(5, 3);
		System.out.println("5-3は" + a);
	}
}

//APIで宣言されているインターフェース
//IntBinaryOperator	引数:int,int	戻り値:int		メソッド:applyAsInt
//IntToLongFunction	引数:int		戻り値:long		メソッド:applyAsLong
//IntToDoubleFunction	引数:int		戻り値:double	メソッド:applyAsDouble
//IntConsumer			引数:int		戻り値:void		メソッド:accept
//IntSupplier			引数:なし		戻り値:int		メソッド:getAsInt
//IntPredicate		引数:int		戻り値:boolean	メソッド:test
