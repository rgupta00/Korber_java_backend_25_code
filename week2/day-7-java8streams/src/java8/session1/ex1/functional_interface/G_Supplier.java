package demo.java8.session1.ex1.functional_interface;

import java.util.function.Supplier;
class EmpNotFoundEx extends RuntimeException{}
public class G_Supplier {
    public static void main(String[] args) {
        //it is is aka factory to return the object

        Supplier<String> s1=()-> "india";

        System.out.println(s1.get());

//        Supplier<EmpNotFoundEx> supplier=()-> new EmpNotFoundEx();

        //
        Supplier<EmpNotFoundEx> supplier=EmpNotFoundEx::new;

    }
}
