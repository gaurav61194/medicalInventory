package com.medicalInventory.dto;

import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "patient_id")
	private long patientid;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "contact_number")
	private String contactNumber;
	
	@Column(name = "email_id")
	private String emailId;
	
	public Patient() {
		super();
	}

	public Patient(long patientid, String firstName, String lastName, String dob, String address, String contactNumber,
			String emailId) {
		super();
		this.patientid = patientid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public long getPatientid() {
		return patientid;
	}

	public void setPatientid(long patientid) {
		this.patientid = patientid;
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

	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", address=" + address + ", contactNumber=" + contactNumber + ", emailId=" + emailId + "]";
	}
	
}
