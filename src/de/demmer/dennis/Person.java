package de.demmer.dennis;

public class Person implements Comparable<Person>{
	
	
	private int age;
	
	private String name;
	

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Person anderePerson) {
		
		if(this.age == anderePerson.getAge()) {
			return 0;
		}
		
		if(this.age > anderePerson.getAge()) {
			return 1;
		}
		
		if(this.age < anderePerson.getAge()) {
			return -1;
		}
		
		
		
		return 0;
	}



	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	

}
