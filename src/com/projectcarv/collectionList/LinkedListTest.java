package com.projectcarv.collectionList;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<String>();

	       linkedlist.add("Item1");
	       linkedlist.add("Item5");
	       linkedlist.add("Item3");
	       linkedlist.add("Item6");
	       linkedlist.add("Item2");

	       System.out.println("Linked List Content Original: " +linkedlist);

	       /*linkedlist.addFirst("First Item");
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition of first and last item: " +linkedlist);*/

	       /*Object firstVar = linkedlist.get(0);
	       System.out.println("First element: " +firstVar);
	       linkedlist.set(0, "Changed first item");
	       Object firstvar2 = linkedlist.get(0);
	       System.out.println("Linked list after update by set method: " +linkedlist);*/

	       linkedlist.removeFirst();
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);


	}

}
