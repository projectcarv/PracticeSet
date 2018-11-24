package com.projectcarv.interface8_set;

public class Interface8MultipleIntterface implements Interface8,AnotherInterface8{

	@Override
	public void existingMethodFromAnotherInterface() {
		System.out.println("Impl of existingMethodFromAnotherInterface");
	}

	@Override
	public void existingMethod() {
		System.out.println("Impl of existingMethod");
	}
	
	public void newDefaultMethod(){
		System.out.println("Default implemented in impl class");
	}

	
}
