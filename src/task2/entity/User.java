package task2.entity;

public class User {
	private String _username;
	private String _password;

	public User(String username,String password){
		_username = username;
		_password = password;
	}
	public User(){

	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String _username) {
		this._username = _username;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String _password) {
		this._password = _password;
	}
}
