package com.java8.session1.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleTester {

		
		public static void main(String[] args) {
												//T -->boolean
//			Predicate<Apple> heavyApplePredicate=a->a.getWeight()>=400;

//			Predicate<Apple> heavyApplePredicate=Apple::isHeavy;
//			Predicate<Apple> heavyApplePredicate2=AppleLogic::isHeavy;
//
//
//			System.out.println(heavyApplePredicate.test(new Apple("red",500)));
//
//			Predicate<Apple> greenApplePredicate=Apple::isGreen;
//


			//lamabda expression vs Method ref  ::
			List<Apple> apples = Arrays.asList
					(new Apple("red", 400),
							new Apple("green", 500),
							new Apple("green", 200),
							new Apple("red", 450));

//			apples.forEach(System.out::println);

//			Predicate<Apple> heavyApplePredicate=a->a.getWeight()>=400;
//			List<Apple>heavyApples=AppleApp.getAllApplesOnPredicate(apples, heavyApplePredicate);
//			heavyApples.forEach(a-> System.out.println(a));


//			Predicate<Apple> heavyApplePredicate=a->a.getWeight()>=400;
//			Predicate<Apple> greenApplePredicate=a->a.getColor().equals("green");
//			Predicate<Apple>greenAndHeavyPridate=heavyApplePredicate.and(greenApplePredicate);
//
//
//
//			List<Apple>greenAndHeavyApples=AppleApp.getAllApplesOnPredicate(apples, greenAndHeavyPridate);
//			greenAndHeavyApples.stream().forEach(a-> System.out.println(a));
		}
}

















