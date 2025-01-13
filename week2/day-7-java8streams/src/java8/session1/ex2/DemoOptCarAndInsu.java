package demo.java8.session1.ex2;

import java.util.Optional;
//Person-> may have a car --> car may have a insurence
class Insurance{
    private String insuranceCompanay;

    public String getInsuranceCompanay() {
        return insuranceCompanay;
    }

    public void setInsuranceCompanay(String insuranceCompanay) {
        this.insuranceCompanay = insuranceCompanay;
    }
}
class Car{
    private Optional<Insurance> optInsurance;

    public Optional<Insurance> getOptInsurance() {
        return optInsurance;
    }

    public void setOptInsurance(Optional<Insurance> optInsurance) {
        this.optInsurance = optInsurance;
    }
}
class Person{
    private Optional<Car> carOpt;

    public Optional<Car> getCarOpt() {
        return carOpt;
    }

    public void setCarOpt(Optional<Car> carOpt) {
        this.carOpt = carOpt;
    }
}


public class DemoOptCarAndInsu {
    public static void main(String[] args) {

        Insurance insurance=new Insurance();
        insurance.setInsuranceCompanay("sun life");

        Optional<Insurance> optIns=Optional.ofNullable(insurance);

        Car car=new Car();
        car.setOptInsurance(optIns);

        Optional<Car> optCar=Optional.ofNullable(null);

        Person person=new Person();
        person.setCarOpt(optCar);

        Optional<Person>optPerson=Optional.ofNullable(person);

      String name=  printComapnyName(optPerson);

        System.out.println(name);

    }

    private static String printComapnyName(Optional<Person> optPerson) {
    	//flatmap -> used to flatten the streams
    	
//         Optional<Optional<Car>> map = optPerson.map(p-> p.getCarOpt());
    	
//    	   Optional<Car> map = optPerson.flatMap(p-> p.getCarOpt());
//    	   Optional<Insurance> map2 = optPerson.flatMap(p-> p.getCarOpt()).flatMap(c-> c.getOptInsurance());
    	   
         return optPerson.flatMap(p->p.getCarOpt()).flatMap(c->c.getOptInsurance()).map(i->i.getInsuranceCompanay())
        		 .orElse("no insurence");
    	
    }
}



//String oPersonString=optPerson
//      .flatMap(Person::getCarOpt)
//      .flatMap(Car::getOptInsurance)
//      .map(Insurance::getInsuranceCompanay)
//      .orElseThrow(()-> new RuntimeException());
//
//
//
//return  optPerson.flatMap(Person::getCarOpt)
//      .flatMap(Car::getOptInsurance)
//      .map(Insurance::getInsuranceCompanay)
//      .orElse("not found");