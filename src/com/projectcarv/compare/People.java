package com.projectcarv.compare;

public class People implements Comparable<People>{
	
	String name;
	int height;
	int age;
	
	public People(String name, int height, int age){
		this.name = name;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(People o) {
		if (this.name.compareTo((o.name)) == 0) {
			return 0;
		} else if (this.name.compareTo((o.name)) > 0) {
			return 1;
		} else
			return -1;
	}
	
	public static int compareByNameThenAge(People p1, People p2) {
	    if (p1.name.equals(p2.name)) {
	        return p1.age - p2.age;
	    } else {
	        return p1.name.compareTo(p2.name);
	    }
	}

	 

}
