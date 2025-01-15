package com.day5.revision.session0.mcq.q4;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Emp implements Comparable<Emp>{
	int id;
	public Emp(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id;
	}
	@Override
	public int compareTo(Emp o) {
		return Integer.compare(this.getId(), o.getId());
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
	
 }
public class DemoTS {

	public static void main(String[] args) {
		Set<Emp> emps=
				new TreeSet<>(( o1,  o2)-> Integer.compare(o2.getId(), o1.getId()));
		emps.add(new Emp(12));
		emps.add(new Emp(56));
		emps.forEach(e-> System.out.println(e));
		System.out.println(emps.size());
	}
}
