package sample001;

public class Pocket {
	private Object data;

	public void put(Object d) {
		this.data = d;
	}

	public Object get() {
		return this.data;
	}
}

//ジェネリクスを使用しない場合