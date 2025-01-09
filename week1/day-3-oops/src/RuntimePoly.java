import java.awt.*;
import java.util.Scanner;

class Shape{
    void draw(){
        System.out.println("drawing a shape");
    }
}
class Circle extends Shape{

    @Override// annotataion
    void draw(){
        System.out.println("drawing a circle");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {
      Shape shape=new Circle();
      shape.draw();
    }
}
