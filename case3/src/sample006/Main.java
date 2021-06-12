package sample006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> list = new ArrayList<Hero>();
		list.add(h1);
		list.add(h2);
		Iterator<Hero> it = list.iterator();
		while (it.hasNext()) {
			Hero h = it.next();
			System.out.println(h.getName());
		}

		Map<Hero, Integer> cnt = new HashMap<Hero, Integer>();
		cnt.put(h1, 3);
		cnt.put(h2, 7);
		for (Hero h : cnt.keySet()) {
			int i = cnt.get(h);
			System.out.println(h.getName() + "が倒した敵=" + i);
		}
	}
}
