package santhiyadayfifteen;

import santhiyadaythree.PersonDemo;

public class PersonImplementscomparableperson {
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	public PersonImplementscomparableperson(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
public PersonImplementscomparableperson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int compareTo(PersonDemo o) {
		return this.city.compareTo(o.city);
	}	

}
