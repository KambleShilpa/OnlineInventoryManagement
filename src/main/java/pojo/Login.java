package pojo;

public class Login {
	private String UserName, Password;
	
	public Login(String userName, String password) {
		UserName = userName;
		Password = password;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Login [UserName=" + UserName + ", Password=" + Password + "]";
	}
	
}
