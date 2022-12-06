package com.medicalInventory.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.medicalInventory.dao.InvoiceRepo;
import com.medicalInventory.dto.Invoice;
import com.medicalInventory.services.InvoiceService;

public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepo invoiceRepo;
	
	@Override
	public List <Invoice> getInvoice(){
		return invoiceRepo.findAll();
	}
	
	@Override
	public Optional<Invoice> getInvoiceById(long id){
		return invoiceRepo.findById(id);
	}
	
	@Override
	public Invoice addInvoie(Invoice invoice) {
		return invoiceRepo.save(invoice);
	}
	
	@Override
	public Invoice updateInvoiceById(long id, Invoice invoice) {
		return invoiceRepo.save(invoice);
	}
	
	@Override
	public void deleteInvoiceById(long id) {
		invoiceRepo.deleteById(id);
	}
	
}
