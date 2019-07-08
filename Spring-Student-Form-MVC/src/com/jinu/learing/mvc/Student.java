package com.jinu.learing.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Student {
	@NotNull(message="First Name is required")
	@Size(min=3,message="Charactore should be more than 3")
	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private String[] operatingSystem;
	
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	private LinkedHashMap<String, String> countryoption;
	public Student() {
		countryoption=new LinkedHashMap<String, String>();
		countryoption.put("IND", "India");
		countryoption.put("UK", "United kingdom");
		countryoption.put("USA", "United state of America");
		countryoption.put("LIB", "Libya");
		
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getCountryoption() {
		return countryoption;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String tirstName) {
		this.firstName = tirstName;
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
	
	

}
