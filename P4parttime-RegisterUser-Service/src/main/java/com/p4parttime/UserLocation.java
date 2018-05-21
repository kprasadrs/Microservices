package com.p4parttime;

public class UserLocation {
	private String cityName;
	private String state;
	private String country;
	
	
	public UserLocation() {
	}
	
	
	public UserLocation(String cityName, String state, String country) {
		this.cityName = cityName;
		this.state = state;
		this.country = country;
	}


	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
