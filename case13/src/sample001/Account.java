package sample001;

/**
 * 口座クラス
 * このクラスは、１つの銀行口座を表します。
 */
public class Account {
	/** 残高 */
	private int balance;
	/** 口座名義人 */
	private String owner;

	/**
	 * 送金をおこなうメソッド
	 * このメソッドを呼び出すと、<b>他の</b>口座に送金します。
	 */
	public void transfer(Account dest, int amount) {

	}
}

//javadoc
//javadoc [各種オプション] ソースファイ等
//・特に指定しない限りprotected以上のアクセス修飾がなされたメンバしか仕様書に出力しない
//privateを含むすべてのメンバを出力するには、-privateオプションを指定する
//・-dオプションに続けてフォルダ名を指定すると、そのフォルダに仕様書が作成される
//・-local	言語の指定。日本語なら、ja
//・-docencoding	出力するHTMLの文字コード。utf-8など
//・-charset	HTMLでの文字コード宣言。-docencodingで指定したものと同じにする
//・-encoding	ソースコードの文字コード

//解説文を含めたい場合は、ソースコードに解説文を、/**と*/で囲む
//このコメントにはhtmlのタグも使用できる