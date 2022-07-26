import java.sql.SQLException;

public interface UserDao {
	int create(String user_id, String user_Name, String user_Password) throws SQLException;
	User read(String user_id, String user_password) throws SQLException;
}
