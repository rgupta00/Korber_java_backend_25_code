package demo.java8.session2.ex4;
//what is enum? named constant in c/++
//in java enum is a special class

enum ShirtSize{
    S, M, L, XL, XXL;
}
class Shirt{
    private String color;
    private double price;
    private ShirtSize size;

    public Shirt(String color, double price, ShirtSize size) {
        this.color = color;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shirt{");
        sb.append("color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
public class DemoEnum {
    public static void main(String[] args) {
        /*
        enum ShirtSize{
    S, M, L, XL, XXL;
}

enum ShirtSize{
   private static final S=new ShirtSize();
   private static final M=new ShirtSize();
   private static final L=new ShirtSize();
   private static final XL=new ShirtSize();
   private static final XXL=new ShirtSize();

}

         */
        Shirt s=new Shirt("red",2000, ShirtSize.M);
        System.out.println(s);
    }
}
