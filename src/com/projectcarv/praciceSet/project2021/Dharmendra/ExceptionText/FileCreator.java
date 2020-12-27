package com.projectcarv.praciceSet.project2021.Dharmendra.ExceptionText;

import java.io.FileInputStream;


public class FileCreator {
	
	public String createFile() throws UserDefinedException{
		System.out.println("I am inside FileCreator class");
		
			throw new UserDefinedException("Error-001","User input is incorrect");
		
	}

}
