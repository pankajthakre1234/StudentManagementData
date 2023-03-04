package com.BikkadIT.SendingByUI.Model;

public class UserForm {

	private String FName;
	
	private String LName;
	
	private String Email;
	
	private String Uname;
	
	private String Password;

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "UserForm [FName=" + FName + ", LName=" + LName + ", Email=" + Email + ", Uname=" + Uname + ", Password="
				+ Password + "]";
	}
	
	
}
