package com.projectcarv.collectionSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HshSetTest {

	public static void main(String[] args) {
		
		Set<String> hSet = new HashSet<String>();

	      hSet.add("Apple");
	      hSet.add("Mango");
	      hSet.add("Grapes");
	      hSet.add("Orange");
	      hSet.add("Fig");
	      //Addition of duplicate elements
	      
	      /*System.out.println(hSet);
	      hSet.add("Apple");
	      hSet.add("Mango");
	      //Addition of null values
	      hSet.add(null);
	      hSet.add(null);*/

	      //Displaying HashSet elements
	      System.out.println(hSet);
	      
	      //Hash set with constructor overloading
	      /*Set<String> hashSet = new HashSet<>(hSet);
	      System.out.println(hashSet);*/

	      // Iterating the hash set but after creating the iterator when you are trying to remove it and 
	      //also in the same time iterating it then it will throw the concurrentModificationException
	      /*Iterator<String> it = hSet.iterator();
	      hSet.remove("Mango");
	      while (it.hasNext()){
	    	  System.out.println(it.next());
	      }*/
	      
	}

}
