package invoice.entities;

public class Invoice {
    private int id;
    private double price;

    public Invoice(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Invoice{");
        sb.append("id=").append(id);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
