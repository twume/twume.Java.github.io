package sample005;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;

public class ItemDAO {

	public static ArrayList<Item> findByMinimumPrice(int price) {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/mydb", "sa", "");
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM TEST WHERE PRICE>=?");
			pstmt.setInt(1, price);
			ResultSet rs = pstmt.executeQuery();
			con.commit();
			ArrayList<Item> items = new ArrayList<>();
			while (rs.next()) {
				Item item = new Item();
				item.setName(rs.getString("NAME"));
				item.setPrice(rs.getInt("PRICE"));
				item.setWeight(rs.getInt("WEIGHT"));
				items.add(item);
			}
			rs.close();
			pstmt.close();
			return items;
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			return null;
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
