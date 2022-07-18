package restaurant;

import java.sql.SQLException;

public class test {
	public static void main(String[] args) throws SQLException {
		RestaurantRep rep = new RestaurantRep();
	//	rep.add(new Restaurant("영자면옥2", "010-2222-2222", "부산광역시"));
		rep.deleteRes(1);
	}
}
