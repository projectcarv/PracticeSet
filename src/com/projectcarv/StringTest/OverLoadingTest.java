package com.projectcarv.StringTest;

public class OverLoadingTest {

	public void getString(String a) {
		System.out.println("getString abcd");
	}
	
	public void getString(StringBuffer a) {
		System.out.println("getStringBuffer");
	}
	
	
	public static void main(String[] args) {
		OverLoadingTest olt = new OverLoadingTest();
		olt.getString("abc");

	}

}
