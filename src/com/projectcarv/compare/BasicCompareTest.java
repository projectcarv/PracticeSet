package com.projectcarv.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @param args
 * This example explains how to sort string object.
 */
public class BasicCompareTest {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		String s1 = "a";
		String s2 = "b";
		String s3 = "c";
		String s4 = "d";
		arrayList.add(s1);
		arrayList.add(s3);
		arrayList.add(s2);
		arrayList.add(s4);
		System.out.println(arrayList);
		
		System.out.println("Sorted string");
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}

}
