package sample004;

import java.io.Serializable;

public class Hero implements Serializable {
	private String name;
	private int hp;
	private int mp;

	public Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public String toString() {
		return "名前：" + this.name + " HP：" + this.hp + " MP：" + this.mp;
	}
}

//直列化
//直列化されるクラスは、java.io.Serializableを実装しなければならない。
//（オーバーライドは必要ない）
//実装後に、java.io.ObjectOutputStreamや、java.io.ObjectInpurStreamを使うことで
//インスタン自体をストリーム経由で保存、復元できる

//HeroクラスとSwordクラスがともにSerializableを実装しており、Heroインスタンスのフィールドが
//Swordクラスのインスタンスを持つ場合、Heroクラスを直列化すれば、Swordインスタンスも連鎖して
//直列化される。

//例外
//①Serializableを実装していないクラス型のフィールドは直列化の対象にならない
//②staticがついたフィールドは直列化の対象にならない
//③transientキーワードで修飾したフィールドは直列化の対象にならない

//直列化した後に、クラスの設計が変更・削除された場合、この状態で変更前のファイルから
//復元しようとしても矛盾した状態で復元されてしまう。
//これを未然に防ぐために、シリアルバージョンUIDというフィールドを宣言しておく
//クラス設計が変化した場合は、このフィールドの値を変更する
//こうすることで矛盾した状態で復元しようとした際に、例外が発生するようにする
//例）private static final long serialVersionUID = 81923983183821L;