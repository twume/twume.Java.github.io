package sample005;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		h.name = "スガワラ";
		//		参照型なのでスガワラが表示される
		System.out.println(list.get(0).name);
	}
}
