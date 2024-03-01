package com.example.FitnessManagment.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Login")
public class login {
	
	@Id
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;

	
	public login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "login [email=" + email + ", password=" + password + "]";
	}
	
	

}
