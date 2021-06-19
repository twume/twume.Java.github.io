package sample002;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) {
		//Step0:準備
		//①jar配置（クラスパス）
		//②JDBCドライバの有効化
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			//step1:データベースの接続
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/mydb", "sa", "");
			//step2:SQL送信
			//①SQL文のひな型を準備
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTER WHERE HP <= ? or NAME =>?");
			//②ひな型に値を流し込みSQL文を組み立て送信
			pstmt.setInt(1, 10);
			pstmt.setString(2, "ゾンビ");
			int r = pstmt.executeUpdate();
			//③処理結果を判定する
			if (r != 0) {
				System.out.println(r + "件のモンスターを削除しました");
			} else {
				System.out.println("該当するモンスターはいませんでした");
			}
			//④後片付け
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//step3:データベースの切断
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

//step2
//①PreparedStatementクラスでSQL文のひな型を作成
//PreparedStatement pstmt = con.prepareStatement(SQL文のひな型)
//後で値が入る部分に?を置換（パラメータ）
//②パラメータに値を流し込む
//pstmt.setInt(パラメータ番号、数値)
//pstmt.setString(パラメータ番号、文字列)
//他にもsetDouble、setDate、setTimestampなどがある
//パラメータ番号は前から数えて何番目かで指定（１から始める）
//送信にはexecuteUpdate()メソッドを使用する

//※JDBCドライバのロード（Class.forName()）はデータベースにアクセスする前に１度だけやっておけばよい
//そのため、static初期化子の中に記述されることがある。