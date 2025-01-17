package invoice.service;

import invoice.entities.Invoice;

import java.util.List;

public class InvoiceService {
    public List<Invoice> getAll(){
        return List.of(new Invoice(1,"690000.00"),new Invoice(2,"610000.00"));
    }
}
