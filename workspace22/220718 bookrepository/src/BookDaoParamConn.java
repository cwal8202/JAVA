import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class BookDaoParamConn {
	public int update(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("UPDATE books SET price = ? WHERE title LIKE ?");
			pstmt.setInt(1, price);
			pstmt.setString(2, title);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
	
	public int update(Connection conn, int bookId, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("UPDATE books SET title = ?, price = ? WHERE bookId = ?");
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			pstmt.setInt(3, bookId);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
	public int insert(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("insert into books (title, price) values (?, ?)");
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
	public int delete(Connection conn, int bookId) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("delete from books where bookId = ?");
			pstmt.setInt(1, bookId);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
}
