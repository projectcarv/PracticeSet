package com.projectcarv.interface8_set;

public class MultipleInterfaceTest {

	public static void main(String[] args) throws Exception {
		
		Interface8MultipleIntterface impl = new Interface8MultipleIntterface();
		impl.existingMethod();
		impl.existingMethodFromAnotherInterface();
		impl.newDefaultMethod();
	}

}
