import java.sql.SQLException;

public class test {
	public static void main(String[] args) throws SQLException{
		UserDaoImpl a = new UserDaoImpl();
//		a.create("cwal8202", "최장호", "a1234");
		System.out.println(a.read("test1", "test"));
	}
}
