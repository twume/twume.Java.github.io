package sample003;

import sample002.Bank;

/**
 * 口座クラス
 * @author teke
 * @deprecated 代わりにNewAccountクラスを利用してください
 * @see NewAccount
 */

public class Account implements java.io.Serializable {

	/**
	 * 他行へ振り込みを行うメソッド
	 * @param bank 送金先銀行
	 * @param dest 送金先口座
	 * @param amount 送金する金額
	 * @return 送金手数料
	 * @exception java.lang.IllegalArgumentException 残高不足の時
	 *
	 */

	public int transfer(Bank bank, Account dest, int amount) {
		return 1;
	}

}

//パラメータや戻り値の記述を含めるためには、javadocコメント内に
//@で始める専用のタグをを記述する必要がある
//@author 作者名			クラスの作者名					クラス・インターフェース
//@version バージョン		バージョン情報					クラス・インターフェース
//@param 引数名 解説		引数とのその解説				メソッド宣言
//@return 解説			戻り値の解説					メソッド宣言
//@exception FQCN 解説	出力する可能性がある例外		メソッド宣言（コンストラクタには利用できない）
//@see クラス名			参考にしてほしいほかのクラス	クラス・インターフェース／フィールド宣言／メソッド宣言
//@since バージョン		実装されたバージョン			クラス・インターフェース／フィールド宣言／メソッド宣言
//@deprecated 解説		非推奨として表示する場合に使う	クラス・インターフェース／フィールド宣言／メソッド宣言