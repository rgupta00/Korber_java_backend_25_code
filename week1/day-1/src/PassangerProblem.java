//Abstraction: help us to write loosely coupled code

class Metro{
    public void move(String source, String destination){
        System.out.println("moving using metro from "+ source +" to "+ destination);
    }
}
class Bike{
    public void move(String source, String destination){
        System.out.println("moving using bike from "+ source +" to "+ destination);
    }
}
class Passenger{
    private String name;
    public Passenger(String name){
        this.name=name;
    }
    public void travel(String source, String destination, Bike bike ){
        bike.move(source, destination);
    }
}
public class PassangerProblem {
    public static void main(String[] args) {
//        Metro metro=new Metro();
        Bike bike=new Bike();
        Passenger passenger=new Passenger("Vijay");
        passenger.travel("Bannagergatta","BTM", bike);
    }
}
