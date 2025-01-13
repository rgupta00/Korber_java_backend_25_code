package demo.java8.session1.ex2;
import static  java.util.Comparator.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

class EmpSalarySorter implements Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return Double.compare(o2.getSalary(), o1.getSalary());
    }
}
class EmpHelper {
    //ye method ek emp la raha hey and double de raha hey
    public static double getSalary(Emp e) {
        return e.getSalary();
    }
}
class Emp implements Comparable<Emp>{
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

    //how many parameter getSalary is taking
    //this(Emp)--> double
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
public class DemoMap {
    public static void main(String[] args) {

        List<Emp> emps=new ArrayList<>();
        emps.add(new Emp(1,"raj",5000));
        emps.add(new Emp(149,"ekta",6800));
        emps.add(new Emp(14,"ekta",6000));
        emps.add(new Emp(162,"sumit",7000));

//        emps.stream().sequential()
//                .map(e->e.getName())
//                .sorted()
//                .distinct()
//                .forEach( name-> System.out.println(name));


//        emps.stream()
//                .map(e->e.getName())//mapping processing !=HashMap
//                .sorted()
//                .distinct()
//                .forEach( name-> System.out.println(name));


        //sorted as per ID(Natural sort)

//        emps.stream()
//                .sorted()
//                .forEach( name-> System.out.println(name));

        //rev sort as per salary
//        emps.stream()
//                .sorted(new EmpSalarySorter())
//                .forEach( name-> System.out.println(name));

        //alter way: lambda ex

//        Comparator<Emp>  comparator=( o1,  o2)-> Double.compare(o2.getSalary(), o1.getSalary());
//
//        emps.stream()
//                .sorted(( o1,  o2)-> Double.compare(o2.getSalary(), o1.getSalary()))
//                .forEach( name-> System.out.println(name));

        //alter cleaner way: lambda ex
        //method ref and lamabda are same
        //:: method ref is a "syntex suger" on lamabda

//        Function<Emp, Double> fun= emp-> emp.getSalary();

//        Function<Emp, Double> fun= Emp::getSalary;
//        Function<Emp, Double> fun3=e->e.getSalary();

//        Emp temp=new Emp(1,"raj",5600.00);
//
//        Double salary=fun.apply(temp)

      //  Function<Emp, Double> fun2= EmpHelper::getSalary;

//        emps.stream()
//                .sorted(comparing(fun).reversed())
//                .forEach( name-> System.out.println(name));

//

        Map<Integer, String> map=new HashMap<>();
        map.put(1,"raj");
        map.put(6,"ekta");
        map.put(18,"sumit");
        map.put(11,"kapil");
       
       // map.forEach(( id,  name) ->	System.out.println(id +": "+ name));
        //map.entrySet().forEach(e ->System.out.println(e.getKey()+" :  "+ e.getValue()));
       

//        Set<Map.Entry<Integer, String>> entrySet=   map.entrySet();
//        for (Map.Entry<Integer, String> entry: entrySet) {
//            System.out.println(entry.getKey()+": "+ entry.getValue());
//        }

//        Set<Integer> keySet=   map.keySet();
//
//        for(Integer key: keySet){
//            System.out.println(key+": "+ map.get(key));
//        }


        //1 : java 7 map.entrySet is better then map.keySet?
//        Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
//        for (Map.Entry<Integer, String> entry: entrySet){
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
//        }

        //1
      //  map.forEach((k,v)-> System.out.println(k+": "+ v));

//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())//comparingByValue vs comparingByKey
//                .forEach( e-> System.out.println(e.getKey()+": "+ e.getValue()));

//        Map<Emp, Double> map2=new HashMap<>();
//        map2.put(new Emp(1,"raj",10000),10000.00);
//        map2.put(new Emp(14,"ekta",6000),6000.00);
//        map2.put(new Emp(162,"sumit",7000),7000.00);



//        map2.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))//comparingByValue vs comparingByKey
//                .forEach( e-> System.out.println(e.getKey()+": "+e.getValue()));

        //?
        Comparator<Emp> comparator=( o1,  o2) ->
                 Double.compare(o2.getSalary(), o1.getSalary());

        Comparator<Emp> comparator2=Comparator.comparing(Emp::getSalary).reversed();

//        map2.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey(comparator2))//comparingByValue vs comparingByKey
//                .forEach( e-> System.out.println(e.getKey()+": "+e.getValue()));




    }
}
