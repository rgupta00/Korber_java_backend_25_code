package com.java8.session1.ex3;

class AppleLogic{
	public static   boolean isHeavy(Apple apple){
		return apple.getWeight()>=400;
	}
}
public class Apple {
	private String color;
	private int weight;
	//this->Apple obj-> boolean
	public boolean isHeavy(){
		return weight>=400;
	}
	public boolean isGreen(){
		return color.equals("green");
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