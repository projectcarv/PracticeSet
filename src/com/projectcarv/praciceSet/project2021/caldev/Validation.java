package com.projectcarv.praciceSet.project2021.caldev;

public class Validation {
	public static final String errorCons ="Both are positive integer";

	public String validate(int i, int j) { // -4, -5
		String result = "";
		
		
		if (i > 0 && j > 0) {
			
			result = errorCons;

		}else if (i < 0) {
			
			result = "Please enter positive integer inplace of " +i;

		}else if (j < 0 ) {

			result = "Please enter positive integer inplace of " +j;
		}
		return result;
	}
}