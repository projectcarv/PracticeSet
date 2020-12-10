package mankidi;

import java.util.Scanner;

public class GreetingManisha {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I am Manisa Kukuri ... If u want to change me as Mankedi press 'M' ");
		char input = sc.next().charAt(0);
		if (input == 'M' || input == 'm') {
			System.out.println("I am Manisha Mankedi...!!!");
		} else {
			System.out.println("I am Manisha Kukuri... Nothing changed you choose wrong input");
		}
		sc.close();
	}
}