package com.csis3275.model;

//import java.util.Base64;

public class User {
	private int id;
	private String username;
	private String password;
	private String fName;
	private String lName;
	private String userType;

	public User() {
		
	}
	
	public User(String username, String password, String fName, String lName, String userType) {

		this.username = username;
		this.password = password;
//		this.password = Base64.getEncoder().encodeToString(password.getBytes());
		this.fName = fName;
		this.lName = lName;
		this.userType = userType;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
