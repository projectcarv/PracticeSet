package com.projectcarv.compare;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People>{

	@Override
	public int compare(People o1, People o2) {
		if (o1.name.compareTo((o2.name)) == 0) {
			return 0;
		} else if (o1.name.compareTo((o2.name)) > 0) {
			return 1;
		} else
			return -1;
	}

}
