package com.day3.session2.up_down;

//class A{ }
//class  B extends A{}
//class C extends A{}
interface Animal{
    public void sound();
}
class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("meou..");
    }
}
class Dog implements Animal{
    public void nightWatch(){
        System.out.println("jagato raho");
    }
    @Override
    public void sound() {
        System.out.println("bho bho..");
    }
}
public class DemoUpcastingVsDowncasting {
    public static void main(String[] args) {
        Animal[]animals={new Dog(), new Cat(), new Dog()};

         for(Animal animal: animals){
             animal.sound();
             if(animal instanceof Dog)
             ((Dog)animal).nightWatch();
         }

//        A a1=new B();
//        A a2=new C();
//     if(a2 instanceof B) {
//         B b1 = (B) a2;
//     }else{
//         System.out.println("not allowed");
//     }


    }
}
