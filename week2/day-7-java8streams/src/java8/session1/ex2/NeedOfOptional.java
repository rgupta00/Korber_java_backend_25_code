package demo.java8.session1.ex2;

import java.util.Optional;
import java.util.function.Supplier;

class EmpNotFoundEx extends RuntimeException{
    public EmpNotFoundEx(String message) {
        super(message);
    }
}

public class NeedOfOptional {
	
	//Raj
    public static void main(String[] args) {
    	String name=getById(1).map(e-> e.getName()).orElse("name is not found");
    	System.out.println(name);
    	
    }

    
    
    
    
    
    
   //ravi
    public static Optional<Emp> getById(int id) {
    	//check for db and find the id otherwise he return null
    	return Optional.ofNullable(new Emp(1, "ravi", 20000));
    }
}












