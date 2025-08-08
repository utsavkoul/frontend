package com.example.chatapp.entities;

public class Users {
	private String Id;
	private String username;
	private String password;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	@Override
	public String toString() {
		return "Users [Id=" + Id + ", username=" + username + ", password=" + password + "]";
	}
	public Users(String id, String username, String password) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
