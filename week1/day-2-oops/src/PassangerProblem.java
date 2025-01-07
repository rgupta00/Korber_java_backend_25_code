//a passanger named vijay is moving from gaya nagar to btm using metro
class Passanger  {
    private String name;
    public Passanger(String name){
        this.name=name;
    }
    public void travel(String source, String destination, Vehicle vehicle){
        vehicle.move(source,destination);
    }
}
//absraction :Vehicle
//abstract class Vehicle{
//   abstract public void move(String source, String destination);
//}
 interface Vehicle{
     public void move(String source, String destination);
}
class Car implements Vehicle{
    public void move(String source, String destination){
        System.out.println("passanger is moving from "+ source+ " to "+ destination+" using car");
    }
}
class Bike implements Vehicle{
    public void move(String source, String destination){
        System.out.println("passanger is moving from "+ source+ " to "+ destination+" using bike");
    }
}
class Metro implements Vehicle{
    public void move(String source, String destination){
        System.out.println("passanger is moving from "+ source+ " to "+ destination+" using metro");
    }
}
public class PassangerProblem {
    public static void main(String[] args) {
        //Metro metro=new Metro();
        Vehicle vehicle=new Car();
        Passanger vijay=new Passanger("vijay");
        vijay.travel("Banaggatta","btm",vehicle);
    }
}
