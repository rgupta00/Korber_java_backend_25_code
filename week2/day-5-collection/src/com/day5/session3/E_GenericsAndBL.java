package com.day5.session3;
//hotel 
interface Flowable{
}
class Juice implements Flowable, Drinkable{
}
class Water implements Flowable, Drinkable{
}
interface Drinkable{
	
}
class Cake{
}

class Petrol implements Flowable{
}


//class Glass{
//	private Object object;
//
//	public Object getObject() {
//		return object;
//	}
//
//	public void setObject(Object object) {
//		this.object = object;
//	}
//}

class Glass<T extends Flowable & Drinkable>{
	private T liquid;

	public T getLiquid() {
		return liquid;
	}

	public void setLiquid(T liquid) {
		this.liquid = liquid;
	}
}
public class E_GenericsAndBL {
	
	public static void main(String[] args) {
//		Glass<Juice> glass=new Glass<>();
//		glass.setLiquid(new Juice());
//		Juice juice=glass.getLiquid();
		
		Glass<Water> glass=new Glass<>();
		glass.setLiquid(new Water());
		Water w=glass.getLiquid();
		
//		Glass<Petrol> g2=new Glass<>();

		
		
		
//		Glass glass=new Glass();
//		glass.setObject(new Juice());
//		Juice juice=(Juice) glass.getObject();
//		
//		glass.setObject(new Water());
		
	}

}
