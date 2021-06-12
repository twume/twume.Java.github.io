package sample003;

import java.util.Set;
import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wold");
		words.add("panda");
		for (String s : words) {
			System.out.print(s + "→");
		}
	}
}

//Set→重複は許されない、順序はない。getがないので要素を取り出すのはfor文やiteratorで。
//HashSetは要素を取り出しても毎回同じ順序とは限らない
//順序を保証するなら、LinkedHashSetやTreeSetを使用
//LinkedHashSet	格納した順
//TreeSet	自然順序付け
