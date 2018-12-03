package com.projectcarv.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderTest {

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
		
		System.out.println(peopleList);
		peopleList.sort((People o1, People o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(peopleList);
		peopleList.sort(Comparator.reverseOrder());
		System.out.println(peopleList);
	}

}
