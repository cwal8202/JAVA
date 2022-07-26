
public class User {
	private int id;
	private String user_id;
	private String user_Name;
	private String user_password;
	
	public User(String user_id, String user_Name, String user_password) {
		super();
		this.user_id = user_id;
		this.user_Name = user_Name;
		this.user_password = user_password;
	}

	public User(int id, String user_id, String user_Name, String user_password) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.user_Name = user_Name;
		this.user_password = user_password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_id=" + user_id + ", user_Name=" + user_Name + ", user_password="
				+ user_password + "]";
	}
}
