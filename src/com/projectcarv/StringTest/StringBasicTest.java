package com.projectcarv.StringTest;

/**
 * @param args
 *            This sample application shows the way we create the string object
 *            and the most frequently used == and equals method.
 * 
 */
public class StringBasicTest {

	public static void main(String[] args) {

		String s1 = "Ram";
		String s2 = new String("Ram");
		char[] sChar = { 'R', 'a', 'm' };
		String s3 = new String(sChar);
		String s4 = s2;

		/*
		 * System.out.println("s1 is " + s1); System.out.println("s2 is " + s2);
		 * System.out.println("s3 is " + s3);
		 */

		/*
		 * if (s1 == s2) { System.out.println(s1 + " is same as " +s2); } else {
		 * System.out.println(s1 + " is not same as " +s2); }
		 */

		/*
		 * if (s1.equals(s2)) { System.out.println(s1 + " is same as " +s2);
		 * }else { System.out.println(s1 + " is not same as " +s2); }
		 */

		/*
		 * if (s2 == s3) { System.out.println(s2 + " is same as " +s3); }
		 */

		/*
		 * if (s2 == s4) { System.out.println(s2 + " is same as " +s4); }
		 */

		// String concat method and immutability
		String immutString = "hello !!";
		immutString.concat("how are you");
		System.out.println(immutString);

		String test = "today is 13 Jan 2024";
		String test2 = "I am learning Github"
		System.out.println(test+test2);

		System.out.println("Second time");

	}

}
