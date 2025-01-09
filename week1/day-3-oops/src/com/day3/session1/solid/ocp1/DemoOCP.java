package com.day3.session1.solid.ocp1;

/*
    Software entities should be open for extension but closed for modification
 */
interface Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("draw circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("draw Rectangle");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("draw Triangle");
    }
}

class ShapePrinter{
    //OCP using polymorphism correctly
    public static void printShape(Shape shape){
        shape.draw();
    }
}
public class DemoOCP {
    public static void main(String[] args) {
        Shape circle=new Circle();
        ShapePrinter.printShape(circle); //ShapePrinter
        Shape rectangle=new Rectangle();
        ShapePrinter.printShape(rectangle);
        Shape triangle=new Triangle();
        ShapePrinter.printShape(triangle);
    }
}
