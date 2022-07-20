package restaurant;

import java.sql.SQLException;
import java.util.Arrays;

public class TestDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();
		
		try {
//			int result = dao.create("테스트중", "1234-5555", "부산");
//			System.out.println(result == 1);
//			//
//			System.out.println(dao.read());
//			System.out.println(dao.read(3));
			//
//			int result = dao.update(2, "대대모골", "9874-1235", "부산 진구 어딘가");
//			System.out.println(result == 1);
//			System.out.println(dao.read(1));
			//
//			int result = dao.delete(4);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			int [] result = impl.creat(Arrays.asList(
						new Restaurant(0, "배치1", "0101-1234", "배치주소1")
						,new Restaurant(0, "배치2", "0101-4234", "배치주소2")
						,new Restaurant(0, "배치3", "0101-6234", "배치주소3")
						,new Restaurant(0, "배치4", "0101-6434", "배치주소4")));
		System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
