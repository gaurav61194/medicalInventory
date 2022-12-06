package com.medicalInventory.dto;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "medicines")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long medicineId;
	
	@Column(name = "medicine_name")
	private String name;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "manufacture_date")
	private String manufactureDate;
	
	@Column(name = "expire_date")
	private Date expiredDate;
	
	@Column(name = "cost")
	private double cost;
	
	@Column(name = "dose")
	private int dose;
	
	public Medicine() {
		super();
	}

	public long getMedicieId() {
		return medicineId;
	}

	public void setMedicieId(long medicineId) {
		this.medicineId = medicineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public Medicine(long medicineId, String name, String companyName, String manufactureDate, Date expiredDate,
			double cost, int dose) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.companyName = companyName;
		this.manufactureDate = manufactureDate;
		this.expiredDate = expiredDate;
		this.cost = cost;
		this.dose = dose;
	}

	@Override
	public String toString() {
		return "Medicines [medicineId=" + medicineId + ", name=" + name + ", companyName=" + companyName
				+ ", manufactureDate=" + manufactureDate + ", expiredDate=" + expiredDate + ", cost=" + cost + ", dose="
				+ dose + "]";
	}
	
	

}
