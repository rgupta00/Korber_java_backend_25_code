import java.util.Scanner;

class Shape{
    void draw(){
        System.out.println("drawing a shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing a Rectangle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("drawing a Triangle");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("PE 1. for circle 2. rect 3. tri");
        int choice= scanner.nextInt();

        Shape shape;
        if(choice==1){
            shape=new Circle();
        }else if(choice==2){
            shape=new Rectangle();
        }else{
            shape=new Triangle();
        }
        shape.draw();
    }
}
