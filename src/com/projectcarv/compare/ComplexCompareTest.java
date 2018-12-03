package com.projectcarv.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @param args
 * This example shows how to sort complex object.
 * There are two ways 1- comparable and 2- comparator.
 */
public class ComplexCompareTest {

	public static void main(String[] args) {
		
		List<People> peopleList = new ArrayList<People>();
		People p1 = new People("Ram", 5, 21);
		People p2 = new People("Hari", 6, 24);
		People p3 = new People("Sita", 6, 27);
		People p4 = new People("Laxman", 5, 25);
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		
		/*System.out.println(peopleList);
		Collections.sort(peopleList);
		System.out.println(peopleList);*/
		
		/*System.out.println(peopleList);
		Collections.sort(peopleList, new PeopleComparator());
		System.out.println(peopleList);*/
		
		System.out.println(peopleList);
		Collections.sort(peopleList, new PeopleAgeComprator());
		System.out.println(peopleList);
		
	}

}
