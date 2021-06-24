package sample003;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
	//	みやびがセットできるか
	@Test
	public void setTest() {
		Bank a = new Bank();
		a.setName("みやび");
	}

	//	nullをセットした場合
	@Test
	public void setNull() {
		try {
			Bank b = new Bank();
			b.setName(null);
		} catch (NullPointerException e) {
			return;
		}
		fail();
	}

	//	2文字をセット
	//	アノテーションの直後に例外を記述し、その中にテストしたいコードを記述することもできる。
	@Test(expected = IllegalArgumentException.class)
	public void throwtwochar() {
		Bank c = new Bank();
		c.setName("みや");
	}
}
