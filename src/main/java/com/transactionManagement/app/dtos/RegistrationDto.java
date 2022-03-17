package com.transactionManagement.app.dtos;

public class RegistrationDto {

	private String Name;
	private Long mobile;
	private String Email;
	private String User_Name;
	private String Password;
	private String confirmPassword;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	

}
