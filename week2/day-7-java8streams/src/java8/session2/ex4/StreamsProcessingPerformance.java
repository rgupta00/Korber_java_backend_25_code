package demo.java8.session2.ex4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsProcessingPerformance {
	
	public static void main(String[] args) {
		List<Dish> allDishes=getAllDishes();
		
		//a stream can not be consume twice
//		Stream<Dish> stream1=allDishes.stream();
//		stream1.forEach(d-> System.out.println(d));
//		stream1.forEach(d-> System.out.println(d));
		
		
		//Streams performance :
		/*
		 * loop fusion: in order to improve the performance
		 * lazy evalution: till u are not applying terminal op no stream is evaluated
		 * short circuting
		 */
		//name of all dishes with cal > 300 only first three 
		
		List<String>names= allDishes.stream()
				.filter(d->{
					System.out.println("fiter operation : "+d);
					return  d.getCalories()>300;
				})
				.map(d-> {
					System.out.println("map operation : "+d.getName());
					return d.getName();
				})
				.limit(3)
				.collect(Collectors.toList());
		
		//names.forEach(name-> System.out.println(name));
		System.out.println("------------");

	}
	
	//[season fruit, prawns, rice]
	//[rice, prawns, season fruit]
	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		return disheds;
	}
}
