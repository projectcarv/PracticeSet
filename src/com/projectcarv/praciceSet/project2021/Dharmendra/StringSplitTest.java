package com.projectcarv.praciceSet.project2021.Dharmendra;

import java.util.StringTokenizer;

/**
 * @author This class describes the way to break a string. By using split method
 *         and by using StringTokenizer
 *
 */
public class StringSplitTest {

	public static void main(String[] args) {

		String s = "123-456-789";

		if (s.contains("-")) {
			String[] splitString = s.split("-");
			System.out.println(splitString[0] + " , " + splitString[1] + " , "
					+ splitString[2]);
		}

		StringTokenizer st = new StringTokenizer(s, "-");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
System.out.println("git test");
	}

}
