package pojo;

public class Registeration {
	private String UserName, Email, Password;

	public Registeration(String userName, String email, String password) {
		super();
		UserName = userName;
		Email = email;
		Password = password;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Registeration [UserName=" + UserName + ", Email=" + Email + ", Password=" + Password + "]";
	}
	
}
