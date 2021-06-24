package com.bmarques.soap.domain;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InvoiceDao {
    public List<Invoice> findAll() {
        Invoice invoiceOne = new Invoice(1L, "Tiago", LocalDate.of(2021, 6, 24), 50D);
        Invoice invoiceTwo = new Invoice(2L, "Samira", LocalDate.of(2021, 6, 28), 251D);

        return Arrays.asList(invoiceOne, invoiceTwo);
    }

    public Invoice findById(Long id) {
        return findAll().stream()
                .filter(invoice -> Objects.equals(invoice.getId(), id))
                .findFirst()
                .get();
    }
}
