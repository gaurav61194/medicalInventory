package com.medicalInventory.dto;

import javax.persistence.*;

@Entity
@Table(name = "invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "invoice_id")
	private long invoiceId;
	
	@Column(name = "medicine_name")
	private String medicineName;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "created")
	private String created;
	
	@Column(name = "patient_name")
	private String patientName;
	
	@Column(name = "cost")
	private double cost;
	
	@Column(name = "quantity")
	private long quanitity;
	
	public Invoice(long invoiceId, String medicineName, String date, String created, String patientName, double cost,
			int quanitity) {
		super();
		this.invoiceId = invoiceId;
		this.medicineName = medicineName;
		this.date = date;
		this.created = created;
		this.patientName = patientName;
		this.cost = cost;
		this.quanitity = quanitity;
	}

	public Invoice() {
		super();
		}

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public long getQuanitity() {
		return quanitity;
	}

	public void setQuanitity(int quanitity) {
		this.quanitity = quanitity;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", medicineName=" + medicineName + ", date=" + date + ", created="
				+ created + ", patientName=" + patientName + ", cost=" + cost + ", quanitity=" + quanitity + "]";
	}
	
	
}
