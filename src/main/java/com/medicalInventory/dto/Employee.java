package com.medicalInventory.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "first_name")
	@NotNull
	private String firstName;
	
	@Column(name = "last_name")
	@NotNull
	private String lastName;
	
	@Column(name = "dob")
	@NotNull
	private String dob;
	
	@Column(name = "address")
	@NotNull
	private String address;
	
	@Column(name = "contact_number")
	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "Only Numbers are allowed")
	@Size(min = 10, max = 10,message = "Exact 10 Numbers are allowed")
	private String contactNumber;
	
	@Column(name = "email_id")
	@Email(message ="Mail should be in standard format")
	private String emailId;
	
	@Column(name ="role")
	@NotEmpty(message = "Role Should not be blank")
	private String role;

	public Employee() {
		super();
	}

	public Employee(long id, String firstName, String lastName, String dob, String address, String contactNumber,
			String emailId, String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.role = role;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
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



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", address=" + address + ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", role="
				+ role + "]";
	}

	
}
