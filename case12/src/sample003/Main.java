package sample003;

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
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/mydb", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");
			pstmt.setInt(1, 10);
			//			検索系SQLの場合は、exectuteQuery()を使用する
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("NAME"));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
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

//検索系sql
//①送信すべきSQL文のひな型を準備
//②ひな型に値を流し込み、SQL文を組み立てて送信
//③ResultSetオブジェクトを使い結果表からデータを取り出す

//ResultSetオブジェクト
//メソッド
//boolean next()			注目する行を１つ進める。成功したらtrue、最終行はfalse
//int getInt(int colIndex)	指定した列の整数値を取り出す。１から始まる列番号、または列名で指定可能
//int getInt(int colName)
//String getString(int colIndex)		指定した列の文字列を取り出す。１から始まる列番号、または列名で指定可能
//String getString(int colName)

//２行以上の結果表が返されるパターンの例
//while(rs.next()) {
//	System.out.println(rs.getString("NAME"));
//}

//０か１行の結果表が返される場合
//if(rs.next()) {
//	System.out.println("ゴブリンのHPは、"+ rs.getInt("HP"));
//} else {
//	System.out.println("ゴブリンはDBに在しません")
//｝
