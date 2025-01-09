package com.day3.session1.solid.lsp;
class Rectangle{
    private  int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getArea(){
        return l*b;
    }
}
class Square {
   private Rectangle rectangle;

    public Square(int l) {
        rectangle=new Rectangle(l,l);
    }
    public void changeDimension(int changedDimesions){
        rectangle.setL(changedDimesions);
        rectangle.setB(changedDimesions);
    }
    public double getArea() {
        return rectangle.getArea();
    }
}
public class LSP2 {
    public static void main(String[] args) {
        Square square=new Square(5);
        System.out.println(square.getArea());
       square.changeDimension(6);
        System.out.println(square.getArea());
    }
}
