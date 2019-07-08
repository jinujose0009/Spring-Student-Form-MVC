package com.jinu.learing.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
@NotNull(message="Is requied")
@Size(min=3,message="Is requied")
private String firstName;
private String lastName;

@Pattern(regexp="[a-zA-Z0-9]{5}", message="only 5chars/digits")
private String postalcode;

@NotNull(message="Is requied")
@Min(value=1,message="Must be graiter than zero")
@Max(value=10,message="Must be less than ten")
private Integer freePass;
public Customer() {
	
}

public String getPostalcode() {
	return postalcode;
}

public void setPostalcode(String postalcode) {
	this.postalcode = postalcode;
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
public Integer getFreePass() {
	return freePass;
}
public void setFreePass(Integer freePass) {
	this.freePass = freePass;
}

}
