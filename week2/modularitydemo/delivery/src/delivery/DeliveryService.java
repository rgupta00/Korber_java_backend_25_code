package delivery;

import invoice.entities.Invoice;
import invoice.services.InvoiceService;

import java.util.List;

public class DeliveryService {
    private InvoiceService invoiceService=new InvoiceService();

    public List<Invoice> processDelivery() {
        List<Invoice> allInvoices = invoiceService.getAllInvoices();
        allInvoices.forEach(invoice -> System.out.println(invoice));
        return allInvoices;
    }
}
