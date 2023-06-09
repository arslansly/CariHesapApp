package com.arslan.dnetcarihesapapp;

public class Invoice {
    private String invoiceNumber;
    private String invoiceDate;
    private String invoiceCustomer;

    public Invoice(String invoiceNumber, String invoiceDate, String invoiceCustomer) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.invoiceCustomer = invoiceCustomer;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public String getInvoiceCustomer() {
        return invoiceCustomer;
    }
}
