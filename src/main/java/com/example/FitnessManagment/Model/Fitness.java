package com.example.FitnessManagment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Fitness {

	private String name;
	@Id
	private String emailID;
	
	private String password;
	
	private String contact;
	
	private String gender;
	
	private String age;
	
	private String membership;
	
	private String DOJ;
	
	private String Payment;

	public Fitness() {

	}

	public Fitness( String name, String emailID, String password, String contact, String gender, String age,
			String membership, String DOJ, String payment) {
		super();
		this.name = name;
		this.emailID = emailID;
		this.password = password;
		this.contact = contact;
		this.gender = gender;
		this.age = age;
		this.membership = membership;
		this.DOJ = DOJ;
		this.Payment = payment;
	}

	@Override
	public String toString() {
		return "Fitness [name=" + name + ", emailID=" + emailID + ", password=" + password + ", contact=" + contact
				+ ", gender=" + gender + ", age=" + age + ", membership=" + membership + ", DOJ=" + DOJ + ", Payment="
				+ Payment + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String DOJ) {
		this.DOJ = DOJ;
	}

	public String getPayment() {
		return Payment;
	}

	public void setPayment(String payment) {
		this.Payment = payment;
	}

}
