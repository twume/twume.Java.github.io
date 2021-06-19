package sample001;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

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
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			//step2:SQL送信
			//step2の内容はsample002へ記述

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

//JDBC
//データベース操作専用API
//java.sql.DriveManager	DBMSへの接続準備
//java.sql.Connection		DBMSへの接続や切断
//java.sql.PreparedStatement	SQL文を送信
//java.sql.ResultSet		DBMSから検索結果を受け取る

//JDBCドライバの有効化
//Class.forName(JDBCドライバの完全限定名)
//H2 Databaseなら、「org.h2.Driver」
//MySQLなら、「com.mysql.jdbc.Driver」

//データベースへの接続の確立
//java.sql.Connectionのインスタンスを取得
//con = DriverManager.getConnection(JDBC URL)
//con = DriverManager.getConnection(JDBC URL, 接続id, パスワード)

//データベースの切断
//Connectionインスタンスのclose()メソッドを呼ぶ