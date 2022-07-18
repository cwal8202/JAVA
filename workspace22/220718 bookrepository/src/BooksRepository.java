import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.helpers.DefaultValidationEventHandler;

import kr.co.greenart.dbutil.DBUtil;

public class BooksRepository {
	private Book ResultMapping(ResultSet rs) throws SQLException {
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");
		
		return new Book(bookId, title, price);
	}
	
	// 추가
	public int add(Book book) throws SQLException {
		String query = "Insert into books (title, price) values ('" + book.getTitle() +"'," + book.getPrice() + ")";
		System.out.println("추가 : " + query);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	// 목록 전체
	public List<Book> list() throws SQLException {
		String query = "SELECT * FROM books";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs  = null;
		List<Book> list = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				int bookId = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				list.add(new Book(bookId, title, price));
			}
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}
	
	// 한개 검색 or 한개 검색
	public Book selectByTitle(String title) throws SQLException {
		String query = "SELECT * FROM books WHERE title = '" + title + "'";
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		
			if (rs.next()) {
				return ResultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
// public List<Book> selectByPrice(int price) {} 가격으로 검색할시
	// 삭제
	public int delete(int bookId) throws SQLException {
		String query = "DELETE FROM books where bookId = " + bookId;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	// 수정
	public int update(Book book) throws SQLException {
		String query = "UPDATE books SET title = '" + book.getTitle()
			+ "', price = " + book.getPrice() 
			+ " WHERE bookId = " + book.getBookId();
		
		System.out.println(query);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
