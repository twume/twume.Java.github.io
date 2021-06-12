package sample002;

public class Main {
	public static void main(String[] args) {
		Pocket<String> p = new Pocket<String>();
		p.put("1192");
		//		ここでキャストが必要になる
		String s = p.get();
		System.out.println(s);
	}
}
