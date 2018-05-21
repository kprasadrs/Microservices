package com.p4parttime;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="RegisterUser")
public class RegistrationModel {

	private String id;
	private String emailId;
	private String name;
	private String password;
	private String confirmPassword;
	private String mobile ;
	private UserLocation userLocation;
	
	
	
	public RegistrationModel() {
		userLocation = new UserLocation();
	}
	public UserLocation getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(UserLocation userLocation) {
		this.userLocation = userLocation;
	}
	public RegistrationModel(String id, String emailId, String name, String password, String confirmPassword,
			String mobile, UserLocation userLocation) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.mobile = mobile;
		this.userLocation = userLocation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
