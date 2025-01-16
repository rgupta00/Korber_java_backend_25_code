package com.java17.features;

import java.util.Objects;

//DTO: lombok small framewrok to autogen getter...

//class Person{
//    private String name;
//    private String email;
//    private double salary;
//
//    public Person(String name, String email, double salary) {
//        this.name = name;
//        this.email = email;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Double.compare(person.salary, salary) == 0 && name.equals(person.name) && email.equals(person.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, email, salary);
//    }
//}
//1. immutable without boilerplate code
//2. aka final class  can not be absttract
//3. can imp new interface

interface Employable{
    public double getNetSalary();
}
class Foo{

}
 record Person(String name,String email, double salary) implements Employable{
    //compack ctr
    public Person{
        if (name==null || email==null){
            throw new IllegalStateException();
        }
    }
     public Person(String name,String email){
         this(name, email, 0.0);
     }

     @Override
     public double getNetSalary() {
         return salary*0.7;
     }
 }

public class D_Records {
    public static void main(String[] args) {

        var p=new Person("raj","raj@gmail.com",6465456);
        System.out.println(p);
        var p2=new Person("raj","raj@gmail.com",6465456);
        if(p.equals(p2)){
            System.out.println("same");
        }else
            System.out.println("not same");
    }
}
















