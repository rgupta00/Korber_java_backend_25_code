package demo.java8.session2.ex5;

import java.util.ArrayList;
import java.util.List;

class Author {
	private String name;
	private String lastname;
	private String country;
	private List<String> countryVisitors=new ArrayList<>();

	
	
	public List<String> getCountryVisitors() {
		return countryVisitors;
	}
	public void setCountryVisitors(List<String> countryVisitors) {
		this.countryVisitors = countryVisitors;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Author(String name, String lastname, String country) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.country = country;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", lastname=" + lastname + ", country="
				+ country + "]";
	}
	
	
	
}
