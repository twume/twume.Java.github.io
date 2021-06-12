package sample002;

public class Pocket<E> {
	private E data;

	public void put(E d) {
		this.data = d;
	}

	public E get() {
		return this.data;
	}
}

//ジェネリクスを使用した場合
//E extends Characterとした場合、Characterクラスの子クラスのみが実型引数として利用できる