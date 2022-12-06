package com.medicalInventory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.medicalInventory.dto.Invoice;
import com.medicalInventory.services.InvoiceService;

public class InvoiceController {

	@Autowired
	public InvoiceService invoiceService;
	
	@GetMapping("/invoices")
	public List<Invoice> getInvoice(){
		List<Invoice> invoice = invoiceService.getInvoice();
		return invoice;
	}
	
	@GetMapping("/invoice/{id}")
	public Optional<Invoice> getInvoiceById(@PathVariable("id") long id){
		return invoiceService.getInvoiceById(id);
	}
	
	@PostMapping("/invoice")
	public Invoice addInvoice(@RequestBody Invoice invoice) {
		return invoiceService.addInvoie(invoice);
	}
	
	@PutMapping("/invoice/{id}")
	public Invoice updateInvoice(@PathVariable("id") long id, @RequestBody Invoice invoice) {
		return invoiceService.updateInvoiceById(id, invoice);
	}
	
	@DeleteMapping("/invoice/{id}")
	public ResponseEntity <String> deleteInvoiceById(@PathVariable("id") long invoiceId){
		invoiceService.deleteInvoiceById(invoiceId);
		return new ResponseEntity<>("Invoice deleted sucessfully...!",HttpStatus.OK);
	}
	
	
}
