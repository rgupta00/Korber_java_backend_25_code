package java8.session2.ex3;

import java.util.*;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

//OCP
public class AppleApp {

	public static List<Apple> getAllApplesOnPredicate(List<Apple> apples, Predicate<Apple> predicate) {
		return apples.stream().filter(predicate).collect(toList());
	}

}






//OCP: SOLID
//all heavy apples >=250
//public static List<Apple> getAllHeavyApples(List<Apple>apples){
//    List<Apple> appleOnCondition=new ArrayList<>();
//    for(Apple temp: apples){
//        if(temp.getWeight()>=250){
//            appleOnCondition.add(temp);
//        }
//    }
//    return appleOnCondition;
//}

//all green apples
//public static List<Apple> getAllGeenApples(List<Apple>apples){
//    List<Apple> appleOnCondition=new ArrayList<>();
//    for(Apple temp: apples){
//        if(temp.getColor().equals("green")){
//            appleOnCondition.add(temp);
//        }
//    }
//    return appleOnCondition;
//}