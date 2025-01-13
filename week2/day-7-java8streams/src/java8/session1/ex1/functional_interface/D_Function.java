package demo.java8.session1.ex1.functional_interface;
//A-> B

import java.util.function.BiFunction;
import java.util.function.Function;
class EmpData{
    private int id;
    private double salary;

    public EmpData(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmpData{");
        sb.append("id=").append(id);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}

class Emp{
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class D_Function {
    public static void main(String[] args) {
    	
    	//Take one thing convert into other thing
    	//String -> int
    	Function<String, Integer> function=name ->name.length();
					
				
    	
    	
    	Function<Emp, Double>f1=e->e.getSalary();
    	
   	
    	Emp e1=new Emp(1, "raja", 340000);
    	System.out.println(f1.apply(e1));
    	
  
    	//Function emp object to EmpData object
    	
    	Function<Emp, EmpData> function2
    	=emp-> new EmpData(emp.getId(), emp.getSalary());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//        //funcation convert something into sothing else
//        //name ---> char
//        Function<String,Integer> f1=name-> name.length();
//        System.out.println(f1.apply("rajat"));
//
//        //transformation of E->Salary
//        Function<Emp, Double> f2=e-> e.getSalary();
//
//        Function<Emp,EmpData>f3= emp -> new EmpData(emp.getId(), emp.getSalary());
//
//        //rajiv   gupta
////        BiFunction<String, String, String> f4=new BiFunction<String, String, String>() {
////            @Override
////            public String apply(String s1, String s2) {
////                return s1.concat(s2);
////            }
////        };
//
//        BiFunction<String, String, String> f4=(s1, s2)-> s1.concat(s2);
//
//        BiFunction<Integer, Integer, Integer>f5=(x,y)->x+y;
//
//        System.out.println(f5.apply(3,5));


    }
}
