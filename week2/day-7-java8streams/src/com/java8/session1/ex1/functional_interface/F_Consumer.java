package com.java8.session1.ex1.functional_interface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class F_Consumer {
	public static void main(String[] args) {

		//Consumer take the data dont return anything!

		Consumer<String>consumer=s-> System.out.println(s);
		consumer.accept("hello");
		BiConsumer<String, Integer> biConsumer=(s, i)-> System.out.println(s+" "+i);





//		List<String> list = new LinkedList<>();
//		list.add("foo");
//		list.add(" bar");
//		list.add(" jar");
//    	list.stream().forEach(name-> System.out.println(name));
		// list.forEach(System.out::print);

		// how to print linklist?

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "raj");
		map.put(4, "sumit");
		map.put(13, "kapil");

		// map.forEach((k, v)->System.out.println(k+": "+v));
        map
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
        .forEach(e-> System.out.println(e.getKey()+": "+ e.getValue()));
        

		// keyset vs entryset vs java 8
		// s.forEach(( k, v)-> System.out.println(k+": "+ v));

//		Map<String, Integer> unsortMap = new HashMap<>();
//		unsortMap.put("z", 10);
//		unsortMap.put("b", 5);
//		unsortMap.put("a", 6);
//		unsortMap.put("c", 20);
//		unsortMap.put("d", 1);
//		unsortMap.put("e", 7);
//		unsortMap.put("y", 8);
//		unsortMap.put("n", 99);
//		unsortMap.put("g", 50);
//		unsortMap.put("m", 2);
//		unsortMap.put("f", 9);
//
//		System.out.println("Original...");
//		System.out.println(unsortMap);

		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to keep the
		// order.
//		
//				unsortMap.entrySet()
//				.stream().sorted(Map.Entry.comparingByKey())
//				.forEach(System.out::print);
				

	}
}
