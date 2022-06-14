package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Application {
	
	public static void main(String[] args) {

		
		Person person1 = new Person(10,"Max");
		Person person2 = new Person(15, "Julia");
		
		int compare = person1.compareTo(person2);
//		
//		System.out.println(compare);
		
		
		ArrayList persons = new ArrayList<Person>();
		
		persons.add(person1);
		persons.add(person2);
		
//		Comparator<Person> compName = new PersonNameComparator();
		
		Collections.sort(persons,new PersonNameComparator());
		
		System.out.println(persons);
		
		
		
		
		
		
		
		
		
		
		
	}

}
