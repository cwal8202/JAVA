import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// 드라이버 페키지 이름
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db",	//
					"root", "root");
			
			//데이터 조작 언어 = SQL
			// table A : 컬럼 B varchar(10) pk
			String query = "create table A (b varchar(10) primary key);";
		//	String query1 = "drop table A";
			
			stmt = conn.createStatement();
			
			stmt.executeUpdate(query);	// 수정(추가, 삭제) 등
//			stmt.executeUpdate(query1);	// 수정(추가, 삭제) 등
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
