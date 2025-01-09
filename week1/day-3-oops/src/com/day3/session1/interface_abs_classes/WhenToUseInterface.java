package com.day3.session1.interface_abs_classes;
interface Jumpable{
    void jump();
}
class Monkey implements Jumpable{
    public void jump(){
        System.out.println("jumping by monkey");
    }
    void stayOnTree(){
        System.out.println("stay on the tree");
    }
    void bite(){
        System.out.println("bite keep distance");
    }
}
class Kid implements Jumpable{
    public void jump(){
        System.out.println("jumping by kid");
    }
    void goToSchool(){
        System.out.println("not again");
    }
}
public class WhenToUseInterface {
    public static void main(String[] args) {

    }
}
