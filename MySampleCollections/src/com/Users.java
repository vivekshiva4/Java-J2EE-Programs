package com;
class User{
private String userName;
private String password;
private String dateOfBirth;
private String lastName;
private String firstName;

public User(String userName, String password, String dateOfBirth, String lastName, String firstName) {
	this.userName = userName;
	this.password = password;
	this.dateOfBirth = dateOfBirth;
	this.lastName = lastName;
	this.firstName = firstName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
public void display(){
	
	System.out.println("user name is  "+userName);
	System.out.println("password is  "+password);
	System.out.println("date of birth is  "+dateOfBirth);
	System.out.println("last name is  "+lastName);
	System.out.println("first name is  "+firstName);
	System.out.println("--------------------------");
}
}


	