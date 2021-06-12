package sample002;

public class Main {
	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		a1.accountNo = "55555";
		a2.accountNo = "44444";

		System.out.println(a1.equals(a2));
	}
}
