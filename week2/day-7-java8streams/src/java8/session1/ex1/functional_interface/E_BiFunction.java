package java8.session1.ex1.functional_interface;

import java.util.function.BiFunction;

public class E_BiFunction {
    public static void main(String[] args) {

    	String fName="rajiv";
    	String lName=" gupta";
    	
    	BiFunction<String, String, String>
    	biFunction=( s1,  s2) -> s1.concat(s2);
    	Emp e1=new Emp(1, "raja", 340000);
    	Emp e2=new Emp(1, "raja", 340000);
    	
//    	BiFunction<Emp, Emp, Double>biFunction2
//    	=( t,  u) ->t.getSalary()+u.getSalary();
			
//    	BiFunction<Emp, Emp, Double>biFunction2
//    	=( t,  u) ->t.getSalary()+u.getSalary();
			
		
    }
}
