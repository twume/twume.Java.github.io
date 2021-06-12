package sample004;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Hero> list = new HashSet<Hero>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数=" + list.size());
		//		正しくオーバーライドしているのに要素数が変化しない
		//		原因はHash系は、ハッシュ値が同じかをまずは判定するため
		//		そのためhashCode()メソッドを実装する必要がある
	}
}

class Hero {
	public String name;

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Hero))
			return false;
		Hero h = (Hero) o;
		if (!this.name.equals(h.name)) {
			return false;
		}
		return true;
	}
}
