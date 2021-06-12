package sample007;

public class StrongBox<E> {
	private E item;
	private KeyType keytype;

	public void put(E d) {
		this.item = d;
	}

	private int cnt;

	public E get() {
		cnt++;
		switch (this.keytype) {
		case PADLOCK:
			if (cnt < 1024)
				return null;
			break;
		case BUTTON:
			if (cnt < 10000)
				return null;
			break;
		case DIAL:
			if (cnt < 30000)
				return null;
			break;
		case FINGER:
			if (cnt < 1000000)
				return null;
			break;
		}
		return this.item;
	}

	StrongBox(KeyType k) {
		this.keytype = k;
		this.cnt = 0;
	}

}
