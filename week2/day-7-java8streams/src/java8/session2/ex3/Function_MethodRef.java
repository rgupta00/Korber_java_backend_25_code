package java8.session2.ex3;

import java.util.function.BiFunction;
import java.util.function.Function;

class MyFun{
	public static Integer length(String a) {
		return a.length();
	}
	public static Integer lengthCombined(String a1, String a2) {
		return a1.length()+ a2.length();
	}
}
public class Function_MethodRef {

	public static void main(String[] args) {
		Function<String, Integer> function=
				MyFun::length;
		
		BiFunction<String, String, Integer> biFunction
		=MyFun::lengthCombined;
		System.out.println(biFunction.apply("raj", " gupta"));
		
	}
}
