package com.projectcarv.interface8_set;

/**
 * @author Mentor001
 * This interface describes the new default and static methods present in java8
 *
 */
public interface Interface8 {
	
	void existingMethod();  
	
	default void newDefaultMethod(){   
		System.out.println("Welcome to default method in interface java8");
	}
	
	static void anotherNewMethod(){
    	System.out.println("Welcome to static method in interface java8");
    }

}
