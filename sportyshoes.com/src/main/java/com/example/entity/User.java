package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


	@Id
	private int UserID;
	private String UserName;
	
	
	public User(int userID, String userName) {
		super();
		UserID = userID;
		UserName = userName;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	
}	

