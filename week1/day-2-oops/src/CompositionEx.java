//A company have 10 max employee named : ZenX , banglore
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printEmployeeDetails(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
class Company{
    private String name;
    private int maxEmployee;
    private String location;
    private int counter;
    private Employee[] employees;

    public Company(String name, int maxEmployee,String location){
        this.name=name;
        this.maxEmployee=maxEmployee;
        this.location=location;
        this.employees=new Employee[maxEmployee];
        counter=0;
    }
    public void addEmployee(Employee employee){
        employees[counter++]=employee;
    }

}
public class CompositionEx {
}
