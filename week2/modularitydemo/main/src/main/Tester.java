package main;

import delivery.DeliveryService;
import invoice.entities.Invoice;
import invoice.services.InvoiceService;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        List<Invoice> invoices =  deliveryService.processDelivery();

    }
}
