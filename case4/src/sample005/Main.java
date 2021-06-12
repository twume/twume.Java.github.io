package sample005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<Account>();
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		a1.number = 11111;
		a2.number = 55555;
		a3.number = 99999;

		list.add(a1);
		list.add(a2);
		list.add(a3);

		//		listインスタンスに自然順序付けがされていないので文法エラーになる。
		Collections.sort(list);
	}
}
