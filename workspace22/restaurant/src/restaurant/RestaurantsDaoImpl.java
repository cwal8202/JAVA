package restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String phoneNumber = rs.getString("phoneNumber");
		String address = rs.getString("address");
		
		return new Restaurant(id, name, phoneNumber, address);
	}

	public int[] creat(List<Restaurant> list) throws SQLException {
		String query = "insert into restaurants (name, phoneNumber, address) values (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getPhoneNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch();		// 같은작업을 반복해서 몰아서 하는것을 batch(배치)작업이라 한다.
			}
			
			return pstmt.executeBatch();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
	@Override
	public int create(String name, String phoneNumber, String address) throws SQLException {
		String query = "insert into restaurants (name, phoneNumber, address) values (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;	// statement랑 명령 날려주는건 동일하다. 그런데 말 그대로 미리 준비하고 그 후에 실행을 한다.
										//여기서 준비란  ?(물음표)를 포함한 sql명령문이 있다면 여기에 값을 넣어주는 동작을 할 수 있다.
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			
			return pstmt.executeUpdate();
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "select * from restaurants";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		
		return list;
	}

	@Override
	public Restaurant read(int id) throws SQLException {
		String query = "select * from restaurants where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		return null;
	}

	@Override
	public int update(int id, String name, String phoneNumber, String address) throws SQLException {
		String query = "update restaurants set name = ?, phoneNumber = ?, address = ? where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "delete from restaurants where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
}
