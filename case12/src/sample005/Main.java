package sample005;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("１円以上のアイアテム一覧表を表示します");
		ArrayList<Item> items = ItemDAO.findByMinimumPrice(1);
		for (Item i : items) {
			System.out.printf("%10s%4d%4d", i.getName(), i.getPrice(), i.getWeight());
		}
	}
}
