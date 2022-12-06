package com.medicalInventory.services;

import java.util.List;
import java.util.Optional;

import com.medicalInventory.dto.Invoice;

public interface InvoiceService {

	public List<Invoice> getInvoice();

	public Optional<Invoice> getInvoiceById(long id);

	public Invoice addInvoie(Invoice invoice);

	public Invoice updateInvoiceById(long id, Invoice invoice);

	public void deleteInvoiceById(long invoiceId);

}
