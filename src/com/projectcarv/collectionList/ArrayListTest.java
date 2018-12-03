package com.projectcarv.collectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * @author 
 * This example explains the basic operation in List interface.
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		strings.add(null);
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		
		/*System.out.println(strings);
		System.out.println("strings size "+strings.size());
		*/
		/*strings.add(1, "e");
		System.out.println(strings);
		System.out.println("strings size after adding one element "+strings.size());*/
		
		/*strings.add(null);
		System.out.println(strings);*/
		
		/*List<String> subStringList = new ArrayList<>();
		subStringList.add("A");
		subStringList.add("B");
		subStringList.add("C");
		//strings.addAll(subStringList);
		strings.addAll(2, subStringList);
		System.out.println(strings);*/
		
		/*strings.clear();
		System.out.println(strings);*/
		
		/*if (!strings.isEmpty()) {
			if (strings.contains("a")) {
				System.out.println("a exist in the list");
			}
		}*/
		
		/*System.out.println(strings.get(1));*/
		
		/*ListIterator<String> li = strings.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}*/
	
		strings.remove(1);
		System.out.println(strings);
		strings.remove("d");
		System.out.println(strings);
		
	}

}
