package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String designation;
	private String email;
	private String mobileno;
	private String gender;
	private String city;
	private String state;
	private String country;
	private String address;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, String designation, String email, String mobileno, String gender,
			String city, String state, String country, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.email = email;
		this.mobileno = mobileno;
		this.gender = gender;
		this.city = city;
		this.state = state;
		this.country = country;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", email=" + email
				+ ", mobileno=" + mobileno + ", gender=" + gender + ", city=" + city + ", state=" + state + ", country="
				+ country + ", address=" + address + "]";
	}
	
	
	
}
