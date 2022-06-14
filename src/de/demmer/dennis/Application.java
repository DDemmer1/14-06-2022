package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Application {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(0.99F , "HDMI-Kabel", 6546);
		Product p2 = new Product(500.00F , "laptop", 999);
		Product p3 = new Product(49.90F , "Maus", 6546);
		Product p4 = new Product(9.99F , "Trinkflasche", 1457);
		
		
		ArrayList list = new ArrayList<Product>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		Collections.sort(list, new ProductPriceComparator());
		System.out.println(list);
				

		Collections.sort(list, new ProductNameComparator());
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Person person1 = new Person(10,"Max");
//		Person person2 = new Person(15, "Julia");
//		
//		int compare = person1.compareTo(person2);

//		System.out.println(compare);
		
//		
//		ArrayList persons = new ArrayList<Person>();
//		
//		persons.add(person1);
//		persons.add(person2);
		
//		Comparator<Person> compName = new PersonNameComparator();
		
//		Collections.sort(persons,new PersonNameComparator());
//		
//		
//		System.out.println(persons);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
