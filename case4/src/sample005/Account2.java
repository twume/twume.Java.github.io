package sample005;

public class Account2 implements Comparable<Account2> {
	String accountNo;
	int number;

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Account2))
			return false;
		Account2 r = (Account2) o;
		if (!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}

	//	compareToメソッドで順序付けを指定
	public int compareTo(Account2 obj) {
		if (this.number < obj.number) {
			return -1;
		}
		if (this.number > obj.number) {
			return 1;
		}
		return 0;
	}
}
