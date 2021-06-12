package sample006;

public class Hero implements Cloneable {
	String name;
	int hp;
	Sword sword;

	Hero(String name) {
		this.name = name;
	}

	Hero() {
		this.name = "";
	}

	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}

	public void setSword(Sword s) {
		this.sword = s;
	}

	public Sword getSword() {
		return this.sword;
	}

}

//Cloneableインターフェースを実装してclone()メソッドをオーバーライド
//clone()メソッドを定義するときはpublicで宣言
//Cloneableインターフェースはマーカーインターフェースでメソッドは何も持っていない
//clone()メソッドをサポートしていることを表明するためのインターフェース
