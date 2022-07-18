import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class 도서관리프로그램 {
	/*
	 *  my_db.books
	 * 
	 *  도서 관리 프로그램
	 *  추가
	 *  전체 목록
	 *  (아이디나 제목이나 가격 등으로 검색 가능)
	 *  삭제
	 *  수정
	 */
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =  null;
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from books");
			
			while (rs.next()) {
				int id = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println(id + "," + title + "," + price);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static int  insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate("Insert into books (title, price) values(" + "'" + title + 
					"' ," + price + ");");
			System.out.println(result + "행이 추가되었습니다.");
			
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
		return result;
	}
	
	public static int deleteBook() {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제하고싶은 책 제목을 입력하세요 : ");
		String input = scan.nextLine();
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			result = stmt.executeUpdate("Delete from books where title =" + "'" + input +"'" + ";");
			System.out.println(result + "행이 삭제 되었습니다");
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
		return result;
	}
	
	public static int updateBook() {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		String type = null;
		String change = null;
		System.out.println("어떤거 수정하실래요? 1 = 제목, 2 = 가격 : ");
		int input = scan.nextInt();
		if (input == 1) {
			type = "title";
			System.out.println("수정할 제목 말해주세요 : ");
			scan.nextLine();
			change = scan.nextLine();
		}
		if (input == 2) {
			type = "price";
			System.out.println("수정할 가격을 말해주세요 : ");
			scan.nextLine();
			change = scan.nextLine();
		}
		
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			result = stmt.executeUpdate("Update books set " + type +  " = " + change + ";");
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
		return result;
	}
	
	public static void main(String[] args) {
		selectAllBook();
//		insertBook("책 제목", 18000);
//		insertBook("책1", 18000);
//		deleteBook();
		updateBook();
		
	}

}
