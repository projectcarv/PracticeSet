package com.projectcarv.praciceSet.project2021.caldev;


import java.util.Scanner;

public class MainCaldev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number - ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Please enter another number - ");
		int j = sc.nextInt();
		
		// Call to add method implemented by Abhishikta/twinkle
		AdditionModule addModule = new AdditionModule(); 
		String addResult = addModule.add(i,j);
		System.out.println(addResult );
		
		
		// Call to substract method implemented by Manisha
		SubModule subModule = new SubModule();
		String subResult = subModule.substract(i,j);
		System.out.println(subResult );
		
	}

}

