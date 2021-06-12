package sample003;

public class Account {
	private String accountNo;
	private int balance;
	//	列挙型を使用することによってコンストラクタで余計な引数を受け取らない
	private AccountType accountType;

	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}
}

//パッケージが違う列挙型を扱う場合、例えばpackageAの場合
//AccountType.FUTSUといった書き方をしないといけない。
//なので、static import宣言でその手間を省くことができる。
//import static packageA.AccountType.FUTSU;
//これで、FUTSUと書くだけでよい