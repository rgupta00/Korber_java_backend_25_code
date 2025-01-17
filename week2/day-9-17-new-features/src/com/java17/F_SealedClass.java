package com.java17;
// final --------------- abstract

sealed class Animal permits Dog,Cat,Rat {
    void sound(){
        System.out.println("sound of animal");
    }
}
class Chair{
}
sealed class Dog extends Animal permits CostlyDog{
}

final class CostlyDog extends Dog{
}
non-sealed class Cat extends Animal{
}

final  class Rat extends Animal{

}
public class F_SealedClass {
    public static void main(String[] args) {

    }
}
