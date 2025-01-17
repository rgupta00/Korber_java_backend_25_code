package invoice.entities;

public class Invoice {
    private int id;
    private String price;

    public Invoice(int id, String price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Invoice{");
        sb.append("id=").append(id);
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
