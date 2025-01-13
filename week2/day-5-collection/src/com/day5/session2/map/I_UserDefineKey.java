package com.day5.session2.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MyKey {
	private int k;

	public int getK() {
		return k;
	}

	public MyKey(int k) {
		super();
		this.k = k;
	}

	@Override
	public String toString() {
		return "MyKey [k=" + k + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(k);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyKey other = (MyKey) obj;
		return k == other.k;
	}

}

public class I_UserDefineKey {

	public static void main(String[] args) {
		Map<MyKey, String> map=new HashMap<>();
		map.put(new MyKey(80), "Eighty");
		map.put(new MyKey(82), "Hundered");
		map.put(new MyKey(84), "Eighty four");
		String value=map.get(new MyKey(80));
		System.out.println(value);

	}
}
