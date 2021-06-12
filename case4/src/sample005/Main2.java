package sample005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Account2> list = new ArrayList<Account2>();
		Account2 a1 = new Account2();
		Account2 a2 = new Account2();
		Account2 a3 = new Account2();
		a1.number = 11111;
		a2.number = 55555;
		a3.number = 99999;

		list.add(a1);
		list.add(a2);
		list.add(a3);

		//		listインスタンスに順序付けのcompareToメソッドを実装したので文法エラーにならない
		Collections.sort(list);
		Iterator<Account2> it = list.iterator();
		while (it.hasNext()) {
			Account2 a = it.next();
			System.out.println(a.number);
		}
	}
}

//※TreeSetに格納する要素はComparableが実装されていることが前提となる
