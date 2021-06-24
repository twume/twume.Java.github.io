package sample001;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
	//	実際にAccountをnewして使ってみるテスト
	@Test
	public void instantiate() {
		Account a = new Account("ミナト", 30000);
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.balance);
	}

	@Test
	public void transfer() {

	}
}

//JUnit
//Java用のテスティングフレームワーク
//※jarをダウンロードしてクラスパスを通す

//ルール①	import文
//ルール②	複数のテXストメソッド
//ルール③	mainメソッドは記述しない
//ルール④	テストメソッドには@Testをつける
//ルール⑤	値の確認などは、専用のメソッドを使う
//			assertEquals(期待値,実際値)		実際値が期待値と等価か
//			assertSame(期待値,実際値)		実際値が期待値と等値か
//			assertNull(実際値)				実際値がnullか
//			assertNotNull(実際値)			実際値がnull以外か
//			fail()							常に検証失敗
//			※これらのメソッドは想定した値でない場合、AssertionErrorを発生させる

//コンパイル	javac テスト対象クラス テストクラス
//実行		java org.junit.runner.JUnitCore テストクラス1 テストクラス2