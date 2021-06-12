package sample002;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ミナト");
		names.add("朝香");
		names.add("スガワラ");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}

//hasNext()
//next()