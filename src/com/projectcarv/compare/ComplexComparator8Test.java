package com.projectcarv.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author
 * Basic comparison in java8
 * 1- Using lambda expression.
 * 2- Using static method reference.
 * 3- Comparing with new sort order.
 * 
 */
public class ComplexComparator8Test {

	public static void main(String[] args) {
		List<People> peopleList = new ArrayList<People>();
		People p1 = new People("Ram", 5, 21);
		People p2 = new People("Hari", 6, 24);
		People p3 = new People("Sita", 6, 27);
		People p4 = new People("Laxman", 5, 25);
		
		//People p5 = new People("Hari", 7, 21);
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		//peopleList.add(p5);
		
		/*System.out.println(peopleList);
		//peopleList.sort((People o1, People o2) -> o1.getName().compareTo(o2.getName()));
		//peopleList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		//peopleList.sort(People::compareByNameThenAge);
		System.out.println(peopleList);*/
		
		System.out.println(peopleList);
		List<People> sortedPeople = peopleList.stream().sorted(new PeopleComparator()).collect(Collectors.toList());
		System.out.println(sortedPeople);
	}

}
