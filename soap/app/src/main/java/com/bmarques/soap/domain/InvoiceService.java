package com.bmarques.soap.domain;

import java.util.List;

public class InvoiceService {

    private final InvoiceDao invoiceDao;

    public InvoiceService(InvoiceDao invoiceDao) {
        this.invoiceDao = invoiceDao;
    }

    public List<Invoice> findAll() {
        return invoiceDao.findAll();
    }

    public Invoice findById(Long id) {
        return invoiceDao.findById(id);
    }
}
