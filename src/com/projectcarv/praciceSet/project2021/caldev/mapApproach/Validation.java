package com.projectcarv.praciceSet.project2021.caldev.mapApproach;
import java.util.HashMap;
import java.util.Map;

public class Validation {
	public static final String errormsgforBoth ="Both are Positive : ";
	public static final String errormsgforI ="Please enter positive integer in place of : ";
	public static final String errormsgforJ ="Please enter positive integer in place of : ";

	public String validate(int i, int j) { // -4, -5
		Map<boolean, String> map= new HashMap<>();
		if(i>0 && j>0){
			map.put("true","errormsgforBoth");
		}else if(i<0){
			map.put("false","errormsgforI" +i);
		}else if(j<0){
			map.put("false","errormsgforJ" +j);
		}
		return (map);
	}
	public static void main(String args[]){
		validate (1,2);
	}
}