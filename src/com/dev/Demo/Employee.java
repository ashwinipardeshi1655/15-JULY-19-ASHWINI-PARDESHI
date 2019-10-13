package com.dev.Demo;

public class Employee {

	private String name;
	private int id;
	private String email;
	private String password;
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
