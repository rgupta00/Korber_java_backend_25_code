package com.java8.session1.ex2;

import java.util.Optional;
import java.util.function.Supplier;

class EmpNotFoundEx extends RuntimeException{
    public EmpNotFoundEx(String message) {
        super(message);
    }
    public EmpNotFoundEx(){
    }
}

public class NeedOfOptional {
    public static void main(String[] args) {
//       Optional<String> name=getName(444);
//
//        System.out.println(name.orElse(" not found"));
//        Emp emp=getById(333).orElse(new Emp(1,"raj",8000));
//        Emp emp=getById(333).orElseThrow(()-> new EmpNotFoundEx("emp is not found"));
        Emp emp=getById(333).orElseThrow(EmpNotFoundEx::new);
        System.out.println(emp);

    	
    }
    //amit
//    public static Optional<String> getName(int id){
//        //...
//      //  return Optional.ofNullable(null);
//        //return Optional.empty();
//        return Optional.ofNullable(null);
//    }
    
   //ravi
    public static Optional<Emp> getById(int id) {
        return Optional.ofNullable(null);
    }
}












