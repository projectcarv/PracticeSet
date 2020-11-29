package com.projectcarv.praciceSet.project2021.caldev;

public class Validation {
	public static final String errorCons ="Both are positive integer";
	public static final String errormsgforI ="Please enter positive integer in place of : ";
	public static final String errormsgforJ ="Please enter positive integer in place of : ";

	public String validate(int i, int j) { // -4, -5
		String result = "";
		
		
		if (i > 0 && j > 0) {
			
			result = errorCons;

		}else if (i < 0) {
			
			result = errormsgforI +i;

		}else if (j < 0 ) {

			result = errormsgforJ +j;
		}
		return result;
	}
}