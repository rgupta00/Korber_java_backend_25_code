package com.day5.session2.set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

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

public class D_Set {
	public static void main(String[] args) {


		// Set dont allow duplicate
		// HashSet, LinkedHashSet,TreeSet
//		Set<String> set = new TreeSet<>();
//		set.add("umesh");
//		set.add("foo");
//		set.add("bar");
//		set.add("foo");
//		set.add("apple");
//
//		System.out.println(set);
	}

}
