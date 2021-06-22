package sample003;

import sample002.*;

@SuppressWarnings("serial") //serialVersionUIDに関する警告を出さない

public class NewAccount extends Account {
	@Override //このメソッドはオーバーライドを行う
	public int transfer(Bank bank, Account dest, int amount) {

	}

	@Deprecated //このメソッドは非推奨
	public void transfer(Account dest, int amount) {

	}
}

//・コンパイルする際に、-Xlintオプションをつけると入念に不適切なコードがないかチェックする・警告をださなくていいという指示を記述することもできる（アノテーション）・

//・あるクラス、メソッド、フィールドに対して一定の種類の警告を行わないよう指示するのが
//	@SuppressWarningsアノテーション
//	パラメータには
//	all			すべての警告
//	serial		SerialVersionUIDの宣言なし
//	cast		不要なキャスト
//	unchecked	代入チェックがないキャスト

//・メソッドが親クラスの同名のメソッドをオーバーライドすることを明示的に宣言
//	@Overrideアノテーション

//・クラス、メソッド、フィールドが非推奨であることを伝える
//	@Deprecatedアノテーション
//	非推奨な宣言委は@deprecatedコメントと@Deprecatedアノテーションの両方使うのが推奨
