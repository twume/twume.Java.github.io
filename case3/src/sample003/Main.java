package sample003;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		//		重複は無視される
		colors.add("赤");
		System.out.println(colors.size());

		for (String s : colors) {
			System.out.print(s + "→");
		}
	}
}

//Collectionインターフェース
//	Listインターフェース
//		ArrayList
//		LinkedList
//	Setインターフェース
//		HashSet
//		TreeSet
//		LinkedHashSet
//
//Mapインタフェース
//	HashMap
//	TreeMap
//	LinkedHashMap

//Set→重複は許されない、順序はない。getがないので要素を取り出すのはfor文やiteratorで。
//HashSetは要素を取り出しても毎回同じ順序とは限らない
//順序を保証するなら、LinkedHashSetやTreeSetを使用
//LinkedHashSet	格納した順
//TreeSet	自然順序付け
//add()
//size()
//isEmpty()
//contains()
//clear()
//remove()
//iterator()