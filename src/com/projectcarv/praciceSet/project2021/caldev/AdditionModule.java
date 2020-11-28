package com.projectcarv.praciceSet.project2021.caldev;

import com.projectcarv.praciceSet.project2021.caldev.Validation;

public class AdditionModule {

	public String add(int i, int j) {
		String addResult = "";

		Validation valid = new Validation();
		String result = valid.validate(i, j);

		if ("Both are positive integer".equals(result)) {

			addResult = "The addition of " + i + " & " + j + " is = " + (i + j);
			
			//The addition of 3 & 4 is = 7

		} else {
			return addResult = result;
		}

		return addResult;

	}

}
