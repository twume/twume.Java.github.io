package sample004;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<Hero2> list = new HashSet<Hero2>();
		Hero2 h1 = new Hero2();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero2();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数=" + list.size());
		//		hashCode()をオーバーライドしているので正しく動作する
	}
}

class Hero2 {
	public String name;
	int hp;

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Hero2))
			return false;
		Hero2 h = (Hero2) o;
		if (!this.name.equals(h.name)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 37;
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;
		return result;
	}
}
