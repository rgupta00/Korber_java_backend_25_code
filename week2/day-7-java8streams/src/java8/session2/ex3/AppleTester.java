package java8.session2.ex3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
class MyFood{
	public static boolean isHeavy(Apple apple) {
		return apple.getWeight()>=250;
	}
}
public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList
				(new Apple("red", 400),
						new Apple("green", 300),
						new Apple("green", 200),
						new Apple("red", 250));
		
		Predicate<Apple>heavyApplePredicate
		=Apple::isHeavyApple;
		Predicate<Apple>greenApplePredicate
		=Apple::isGreen;
		
//		Predicate<Apple>heavyApplePredicate
//		=a->a.getWeight()>=250;
		
				
		
		
		

//		List<Apple> allHeavyApples = 
//				AppleApp.getAllApplesOnPredicate(apples, a->a.getWeight()>=250);
//		
//		allHeavyApples.forEach(a-> System.out.println(a));
//
//		List<Apple> allGreenApples = 
//				AppleApp.
//				getAllApplesOnPredicate(apples, a->a.getColor().equals("green"));
//		
		//allGreenApples.forEach(a-> System.out.println(a));
		
		//green heavy
//		Predicate<Apple> greenPredicate=a->a.getColor().equals("green");
//		Predicate<Apple> heavyPredicate=a->a.getWeight()>=250;
//		
//		Predicate<Apple> greenOrHeavyPredicate=greenPredicate
//				.or(heavyPredicate);
//		
//		List<Apple> applesOnCondition
//		= AppleApp.getAllApplesOnPredicate(apples, greenOrHeavyPredicate);
//		
//		for(Apple a: applesOnCondition) {
//			System.out.println(a);
//		}
//		
	}
}

















