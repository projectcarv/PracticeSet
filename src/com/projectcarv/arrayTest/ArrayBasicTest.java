package com.projectcarv.arrayTest;

public class ArrayBasicTest {

	public static void main(String[] args) {

			String[] strArray = new String[5];
			strArray[0] = "a";
			strArray[1] = "b";
			strArray[2] = "c";
			strArray[3] = "d";
			strArray[4] = "e";
			
			System.out.println(strArray);
			
			for (int i=0; i<strArray.length;i++) 
				System.out.println(strArray[i]);
			
	}

}
