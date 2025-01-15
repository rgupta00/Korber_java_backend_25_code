package java8.session2.ex3;
class AppleLogic{
	public  static boolean isHeavy(Apple apple){
		return apple.getWeight()>=250;
	}
}
public class Apple {
	private String color;
	private int weight;

	//		boolean		     this
	public boolean isHeavyApple(){
		return this.getWeight()>=250;
	}
		//	boolean    this
	public boolean isGreen(){
		return  this.getColor().equals("green");
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public Apple() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Apple{");
		sb.append("color='").append(color).append('\'');
		sb.append(", weight=").append(weight);
		sb.append('}');
		return sb.toString();
	}
}