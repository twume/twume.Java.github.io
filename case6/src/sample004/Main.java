package sample004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(10);
		//forEach()で要素を２倍にして取り出す
		list.stream().forEach(i -> System.out.println(i * 2));

		List<Character> list2 = new ArrayList<Character>();
		list2.add(new Character());
		list2.add(new Character());
		//forEach()で要素を２倍にして取り出す
		list2.stream().forEach(i -> i.sleep());

		//		配列にもStreamオブジェクトを取得できる
		int[] data = { 1, 2, 3 };
		IntStream st = Arrays.stream(data);

		//		並列処理
		list.parallelStream().forEach(i -> System.out.println(i * 2));

	}
}

//java.util.Collectionを実装しているクラスは、stream()メソッドを持つ。
//これでjava.util.stream.Streamインスタンスを取得できる
//StreamインスタンスはforEach()メソッドを持つ