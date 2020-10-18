package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String,String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystem;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("Bangal", "Bangladesh");
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("Arg", "Argentina");
		countryOptions.put("Spa", "Spain");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
}