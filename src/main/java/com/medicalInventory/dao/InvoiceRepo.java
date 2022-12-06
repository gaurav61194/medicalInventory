package com.medicalInventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicalInventory.dto.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice, Long>{

}
