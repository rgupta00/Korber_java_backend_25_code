package a.doubts;
class A{
    static void foo(){
        System.out.println("foo of class A");
    }
}
class  B extends A{
    //statatic method dont get overriden by get over "shadowing"
    static void foo(){
        System.out.println("foo of class B");
    }
}
public class DemoDoubts {
    public static void main(String[] args) {
        B b=new B();
        b.foo();
    }
}
