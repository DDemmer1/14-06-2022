package de.demmer.dennis;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		
		String name1 = person1.getName();
		String name2 = person2.getName();
		
		
		int result = name1.compareTo(name2);
		
			
		return result;
		
//		return person1.getName().compareTo(person2.getName());
	}

}
