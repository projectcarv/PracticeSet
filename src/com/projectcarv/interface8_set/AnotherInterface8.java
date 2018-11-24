package com.projectcarv.interface8_set;

public interface AnotherInterface8 {
	
	void existingMethodFromAnotherInterface();  
	
	default void newDefaultMethod(){   
		System.out.println("Welcome to default method in another interface java8");
	}
	
}
