package sample002;

public class Account {
	private int balance;

	public void transfer(Account dest, int amount) {
		//送金処理の記述。残高不足の場合は例外を送出
		System.out.println("正常に送金完了しました");
		//もし残高がマイナスの場合、AssertionErrorが発生し、JVMは強制終了
		this.balance = -9;
		assert this.balance >= 0;
	}

}

//アサーション
//簡易なテストケースを稼働コードのソースコード内に直接記述できる

//①assert 評価式
//②assert 評価式:エラーメッセージ
//	②の例	assert this.balance >= 0: "負の残高…" + this.balance;

//アサーション機能を有効にするには、-eaオプションをつける
//java -ea Main

//注意点
//①アサーションの副作用を避ける
//	本来の動作ロジックに影響をあたえるアサーションは記述しない
//②単体テストにかわるものではない