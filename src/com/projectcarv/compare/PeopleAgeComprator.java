package com.projectcarv.compare;

import java.util.Comparator;

public class PeopleAgeComprator implements Comparator<People>{

	@Override
	public int compare(People o1, People o2) {
		if (o1.age == o2.age) {
			return 0;
		} else if (o1.age > o2.age) {
			return 1;
		} else
			return -1;
	}

}
