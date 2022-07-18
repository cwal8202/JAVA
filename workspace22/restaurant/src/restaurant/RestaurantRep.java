package restaurant;

import java.awt.image.DataBufferInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantRep {
	// 추가
	public int add(Restaurant res) throws SQLException {
		String query = "INSERT INTO restaurants (name, phoneNumber, address) values ('" + res.getName() + "', '" + res.getPhoneNumber() + "', '" + res.getAddress() + "')";
		System.out.println("추가 쿼리문 = " + query);
		
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
	// 음식점 전체 리스트
	public List<Restaurant> listAll() throws SQLException {
		String query = "SELECT * FROM restaurants";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String name = rs.getString("name");
				String phoneNumber = rs.getString("phoneNumber");
				String address = rs.getString("address");
				
				list.add(new Restaurant(name, phoneNumber, address));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}
	
	// 음식점 하나 리스트 음식점 이름으로 리스트 가능
	public Restaurant selectByName(String name) throws SQLException {
		String query = "select * from restaurants where name = '" + name + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				String name1 = rs.getString("name");
				String phoneNumber = rs.getString("phoneNumber");
				String address = rs.getString("address");
				
				return new Restaurant(name1, phoneNumber, address);
			} else {
				return null;
			}
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	// 음식점 수정 음식점 모든정보 수정가능
	public int updateRes (Restaurant res) throws SQLException {
		String query = "update books set title = '" 
							+ res.getName() + "', '" 
							+ res.getPhoneNumber() + "', '" 
							+ res.getAddress() + "'";
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
	// 음식점 삭제 id번호 입력받아서 삭제함
	public int deleteRes(int resId) throws SQLException {	// 처음에 오류가 났다. 만약 내가 다루는 데이터를 참조하는 데이터가 있으면 삭제나 수정이 안된다.
															// foreingkey의 기본값은restrict으로 즉 수정, 삭제가 안되게 막게 되어있다. cascade는 수정or삭제를 하면 바꾸는 값과 그걸 참조하는 값 둘다 바뀌게 된다.
															// setNull은 내가 바꾸거나 삭제하고 싶은 값이 바뀌거나 삭제 될 경우 참조하는 값은 null로 바뀌게 된다.
		String query = "delete from restaurants where Id = " + resId;
		
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
