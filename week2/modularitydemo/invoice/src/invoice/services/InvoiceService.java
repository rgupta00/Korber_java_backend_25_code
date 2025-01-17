package invoice.services;

import invoice.entities.Invoice;

import java.util.List;

public class InvoiceService {
    public List<Invoice> getAllInvoices() {
        return List.of(new Invoice(1, 2000.00),new Invoice(1, 2000.00));
    }
}
