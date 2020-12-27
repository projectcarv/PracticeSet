package com.projectcarv.praciceSet.project2021.Amarnath.PlayWithJava;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.compiler.OpCodes;
import com.sun.org.apache.xpath.internal.operations.Operation;

public class PlayMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets Play With Java-->");
		System.out.println("Say Hi");
		String input = sc.nextLine();
		Greetings gts = new Greetings();
		if ("Hi".matches(input) || "hi".matches(input) || "Hello".matches(input) || "hello".matches(input)
				|| "hlo".matches(input) || "Hlo".matches(input)) {
			gts.Greetings();
			char inpt;
			System.out.println("Want to perform operation ...y/n");
			inpt = sc.next().charAt(0);
			sc.nextLine();
			if (inpt == 'y') {
				System.out.println("Enter Your name: ");
				input = sc.nextLine();
				System.out.println("HOW MAY I HELP YOU Mr/Mrs. " + input);
				System.out.println(
						"Which operation you want to do \n 1: Calculation\n 2: View Current Time\n 3: View Java Version");
				int choice = sc.nextInt();
				if (choice == 1) {
					CalculationDemo.calculation();
				} else if (choice == 2) {
					TimeZone.viewTime();
				} else if (choice == 3) {
					CheckVersion.checkVersion();
				}
			} else {
				System.out.println("THANK YOU");
			}
		}
	}
}
