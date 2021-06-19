package sample004;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/mydb");
			con.setAutoCommit(false);
			//SQlの送信処理
			//******************
			//******************
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} finally {
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

//JDBCを用いてトランザクション制御を指示するには、Connectionオブジェクトを使用する

//①con.setAutoConnection(false)
//デフォルトではトランザクション制御されない（SQLが１つ送信されるたびに自動的にコミットされる）モードになっている
//それを明示的にトランザクション制御を行うことを宣言する

//②con.commit()
//この呼び出しにより前回のcommit()以降に贈られたすべてのSQL要求が１つのトランザクションとみなされ
//実行結果が確定される

//③con.rollback()
//この呼び出しにより、前回のcommit()以降に送られたすべてのSQL要求がロールバックされる
