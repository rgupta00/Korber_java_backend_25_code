class Box{
    private int l;
    private int b;
     int foo=7; //private default protected public
    public Box(int l, int b){
        this.l=l;
        this.b=b;
    }
    public void print(){
        System.out.println("l : "+l +" b: "+ b);
    }
}
class Box3D extends Box{
    private int h;
    public Box3D(int l, int b, int h){
        super(l,b);
        this.h=h;
    }
    public void print(){
        super.print();//resublity
        System.out.println("h: "+ h);
    }
}
class Box3DWithColor extends Box3D{
    private String color;
    public Box3DWithColor(int l, int b, int h, String color){
        super(l,b, h);
        this.color=color;
    }
    public void print(){
        super.print();//resublity
        System.out.println("color: "+ color);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Box3DWithColor box=new Box3DWithColor(1,2,3,"red");
        box.print();
    }
}
