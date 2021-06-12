package sample001;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}

		LinkedList<Integer> point = new LinkedList<Integer>();
		point.add(10);
		point.add(80);
		point.add(75);
		for (int s : point) {
			System.out.println(s);
		}
	}
}

//add()
//set()
//get()
//size()
//isEmpty()
//contains()
//indexOf()
//iterator()
//clear()
//remove()

//ArrayListとLinkedListの違い
//ArrayListは、要素の削除・挿入が苦手（玉突き形式になるので）
//LinkedListは、要素の取得が苦手（リンク情報なので）
//両社とも、java.util.Listインターフェースを実装している