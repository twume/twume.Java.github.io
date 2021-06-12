package sample001;

public class Main {
	public static void main(String[] args) {
		Pocket p = new Pocket();
		p.put("1192");
		//		ここでキャストが必要になる
		String s = (String) p.get();
		System.out.println(s);
	}
}
