package demo.java8.session2.ex4;
import static  java.util.stream.Collectors.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DishTesterExaple2 {
	
	public  DishSelectedField getDishSelectedField(Dish d){
		return new DishSelectedField(d.getName(), d.getCalories());
	}
	public static void main(String[] args) {

		List<Dish> allDishes = getAllDishes();
//		allDishes.forEach(dish-> System.out.println(dish));
		// Example: return the names of dishes that are low in calories (<400) sorted by number of calories
		// Getting all veg dishes
//		allDishes.stream()
//						.filter(dish-> dish.getCalories()<400)
//						.map(dish->dish.getName())
//						.forEach(name-> System.out.println(name));


//		List<String> names=  allDishes.stream()
//				.filter(dish-> dish.getCalories()<400)
//				.map(dish->dish.getName())
//						.collect(toList());

		// Get list of All Dishes only containing name and calValue

		//Dish->DishSelectedFiled
//		Function<Dish, DishSelectedField> mapper=
//				dish-> new DishSelectedField(dish.getName(), dish.getCalories());
//
//		List<DishSelectedField> list2=allDishes.stream().map(mapper)
//				.collect(toList());


		// create a List by names selecting the first three dishes that have more than 300 calories

		//how stream processing improve the performacne?
		//stream are lazy u can process same stream twice
//		Stream<String> listStream=Arrays.asList("foo","bar","jar").stream();
//		listStream.forEach(d-> System.out.println(d));
//		listStream.forEach(d-> System.out.println(d));


//		List<String> list3=allDishes.stream()
//				.filter(dish->{
//					return  dish.getCalories()>300;
//				} )
//						.map(dish->{
//							return   dish.getName();
//						})
//						.limit(3)
//								.collect(toList());
//
//		list3.forEach(dn-> System.out.println(dn));

//		Stream<String> list3=allDishes.stream()
//				.filter(dish->{
//					System.out.println("dish is filtered : "+dish.getName());
//					return  dish.getCalories()>300;
//				} )
//				.map(dish->{
//					System.out.println("dish is mapped : "+dish.getName());
//					return   dish.getName();
//				})
//				.limit(3);

		//loop fusion: multiple processes happing in single pipeline
		//only one loop is there
		//short circuiting
//		allDishes.stream()
//				.filter(dish->{
//					System.out.println("dish is filtered : "+dish.getName());
//					return  dish.getCalories()>300;
//				} )
//				.map(dish->{
//					System.out.println("dish is mapped : "+dish.getName());
//					return   dish.getName();
//				})
//				.limit(1)
//						.forEach(d1-> System.out.println(d1));


		/*
		 * allMatch, anyMatch,noneMatch, findFirst, findAny
		 */

		// find out whether the menu has a vegetarian option: anyMatch

//		boolean result=allDishes.stream().anyMatch(dish-> dish.isVegetarian());
//		System.out.println(result);


//		boolean result=allDishes.stream().allMatch(dish-> dish.isVegetarian());
//		System.out.println(result);

		// find out whether the menu ishealthy :allMatch
		// (ie. all dishes are below 1000 calories):
		
		// noneMatch: opposite of allMatch

		// find if any food item is veg? findAny
		
		// Primitive stream specializations

		// IntStream,DoubleStream, and LongStream==> avoide boxing cost
		// get all the cal values of all food items

//		int totalCalVaule=allDishes
//				.stream()
//				.mapToInt(dish->dish.getCalories())
//				.sum();
//
//		System.out.println(totalCalVaule);

		//primitive stream: are faster as they dont use boxing they work on primitive data
//		IntSummaryStatistics summryStatics=allDishes
//				.stream()
//				.mapToInt(dish->dish.getCalories())
//						.summaryStatistics();
//
//		System.out.println(summryStatics.getAverage());
//		System.out.println(summryStatics.getMax());
//		System.out.println(summryStatics.getMin());
//		System.out.println(summryStatics.getSum());


//		int sumAllCalValues=allDishes
//				.stream()
//				.map(dish->dish.getCalories())
//				.reduce(0, ( x,  y) -> x+y);
//
//		System.out.println(sumAllCalValues);
//
//		int sumAllCalValues=allDishes
//				.stream()
//				.mapToInt(dish->dish.getCalories())
//				.sum();
//
//		System.out.println(sumAllCalValues);

				
		// using primitive stream
		// find max cal values for all dishes, Optional
		/*
		 * What type of quaries Collect helps:Collectors.groupingBy(..)
		 * ------------------------------------- 
		 * 1. Dishes grouped by type 
		 * 2. Dishes grouped by caloric level 
		 * 3. Dishes grouped by type and then caloric level 
		 * 4. Count dishes in each groups 
		 * 5. Most caloric dishes by type 
		 * 6. Sum calories by type
		 */

		// Dishes grouped by type
		Map<Dish.Type, List<Dish>> map=
				allDishes.stream().collect(Collectors.groupingBy(d->d.getType()));



		// Dishes grouped by calorific level
		/*
		 * if (dish.getCalories() <= 400)
				return CaloricLevel.DIET;
			else if (dish.getCalories() <= 700)
				return CaloricLevel.NORMAL;
			else
				return CaloricLevel.FAT;
		 * 
		 */

		// Dishes grouped by type and then caloric level
		allDishes.stream().collect(Collectors.groupingBy((Dish dish)-> {
				if (dish.getCalories() <= 400)
					return CaloricLevel.DIET;
				else if (dish.getCalories() <= 700)
					return CaloricLevel.NORMAL;
				else
					return CaloricLevel.FAT;
			
		}));
		
	}

	

	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(new Dish("pork", false, 800,
				Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish(
						"french fries", true, 530, Dish.Type.OTHER), new Dish(
						"rice", true, 350, Dish.Type.OTHER), new Dish(
						"season fruit", true, 120, Dish.Type.OTHER), new Dish(
						"pizza", true, 550, Dish.Type.OTHER), new Dish(
						"prawns", false, 300, Dish.Type.FISH), new Dish(
						"salmon", false, 450, Dish.Type.FISH));
		return disheds;
	}

}
