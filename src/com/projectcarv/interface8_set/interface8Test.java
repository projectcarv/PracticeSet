package com.projectcarv.interface8_set;

public class interface8Test {

	public static void main(String[] args) {
		
		Interface8 intImpl = new Interface8Impl();
		intImpl.newDefaultMethod();
		intImpl.existingMethod();;
		Interface8.anotherNewMethod();
	}

}
