package com.bmarques.soap.api;

import com.bmarques.soap.domain.Invoice;
import com.bmarques.soap.domain.InvoiceDao;
import com.bmarques.soap.domain.InvoiceService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService
public class InvoiceWS {

    private final InvoiceService invoiceService = new InvoiceService(new InvoiceDao());

    @WebMethod(operationName = "findAllInvoices")
    @WebResult(name = "InvoicesResult")
    public List<Invoice> findAll() {
        return invoiceService.findAll();
    }

    @WebMethod(operationName = "findInvoiceById")
    @WebResult(name = "InvoiceResult")
    public Invoice findById(@WebParam(name = "invoiceId") Long id) {
        return invoiceService.findById(id);
    }
}
