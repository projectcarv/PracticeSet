package TestingProgram;

import java.util.Scanner;

public class WelcomeToMagicWorld {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:  ");
		String name= sc.nextLine();
		String nm="Manisha";
		if(name.matches(nm)){
				System.out.println("Welcome "+name+ " to Magic World...");
		}else{
			System.out.println("Mr./Mrs: "+name+" You have entered wrong input Please Enter a valid input..");
		}
	}
		
	
}
