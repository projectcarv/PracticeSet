//package com.projectcarv.praciceSet.project2021.Amarnath.PlayWithJava;
//
//import java.util.Date;
//import java.util.Scanner;
//
//import Calculator.Calculation;
//import Calculator.Calculator;
//
//public abstract class CalculationDemo implements Calculator {
//	public static void calculation() {
//		Scanner sc = new Scanner(System.in);
//		Calculation cal = new Calculation();
//		int num1, num2, res;
//
//		System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
//		int choice = sc.nextInt();
//		while (choice == 1) {
//			System.out.println("Enter first number: ");
//			num1 = sc.nextInt();
//			System.out.println("Enter second number: ");
//			num2 = sc.nextInt();
//			cal.sum(num1, num2);
//			System.out.println("Want more Operation y/n");
//			char op = sc.next().charAt(0);
//			if (op == 'y') {
//				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
//				choice = sc.nextInt();
//			} else {
//				Date dt = new Date();
//				System.out.println("Thank You !!! " + dt.toString());
//				break;
//			}
//		}
//		while (choice == 2) {
//			System.out.println("Enter first number: ");
//			num1 = sc.nextInt();
//			System.out.println("Enter second number: ");
//			num2 = sc.nextInt();
//			cal.sub(num1, num2);
//			System.out.println("Want more Operation y/n");
//			char op = sc.next().charAt(0);
//			if (op == 'y') {
//				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
//				choice = sc.nextInt();
//			} else {
//				Date dt = new Date();
//				System.out.println("Thank You !!! " + dt.toString());
//				break;
//			}
//		}
//		while (choice == 3) {
//			System.out.println("Enter first number: ");
//			num1 = sc.nextInt();
//			System.out.println("Enter second number: ");
//			num2 = sc.nextInt();
//			cal.mult(num1, num2);
//			System.out.println("Want more Operation y/n");
//			char op = sc.next().charAt(0);
//			if (op == 'y') {
//				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
//				choice = sc.nextInt();
//			} else {
//				Date dt = new Date();
//				System.out.println("Thank You !!! " + dt.toString());
//				break;
//			}
//		}
//		while (choice == 4) {
//			System.out.println("Enter first number: ");
//			num1 = sc.nextInt();
//			System.out.println("Enter second number: ");
//			num2 = sc.nextInt();
//			cal.div(num1, num2);
//			System.out.println("Want more Operation y/n");
//			char op = sc.next().charAt(0);
//			if (op == 'y') {
//				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
//				choice = sc.nextInt();
//			} else {
//				Date dt = new Date();
//				System.out.println("Thank You !!! " + dt.toString());
//				break;
//			}
//		}
//
//	}
//
//}
