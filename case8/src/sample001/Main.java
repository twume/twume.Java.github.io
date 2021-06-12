package sample001;

public class Main {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		b1.name = "test1";
		b2.name = "test1";
		b1.address = "test1";
		b2.address = "test2";

		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());

	}
}
