package com.day3.session1.solid.ocp;
/*
    Software entities should be open for extension but closed for modification
 */
class Circle {
    void drawCircle(){
        System.out.println("draw circle");
    }
}
class Rectangle{
    void drawRectangle(){
        System.out.println("draw Rectangle");
    }
}
class Triangle{
    void drawTriangle(){
        System.out.println("draw Triangle");
    }
}
class ShapePrinter{
    //OCP
    public static void printShape(Object object){
        if(object instanceof Circle){
            ((Circle) object).drawCircle();
        }
        else if(object instanceof Rectangle){
            ((Rectangle) object).drawRectangle();
        }else if(object instanceof Triangle){
            ((Triangle) object).drawTriangle();
        }
    }
}
public class DemoOCP {
    public static void main(String[] args) {
        Circle circle=new Circle();
        ShapePrinter.printShape(circle); //ShapePrinter
        Rectangle rectangle=new Rectangle();
        ShapePrinter.printShape(rectangle);
    }
}
