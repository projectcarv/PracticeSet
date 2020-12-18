package TestingProgram;

import java.util.Scanner;

class Calculation {
	
	void sum(int i, int j){
		int sum= i+j;
		System.out.println(sum);
	}
	void mult(int i, int j){
		int mult= i*j;
		System.out.println(mult);
	}
	void sub(int i, int j){
		int sub=i-j;
		System.out.println(sub);
	}
	void div(int i, int j){
		int div=i/j;
		System.out.println(div);
	}
}
public class Calculater{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int num1= sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2=sc.nextInt();
		System.out.println("Choose which operation you want to do: \n1: Sumation \n2: Substraction \n3: Multiplication \n4: Division");
		int x=sc.nextInt();
		Calculation cal=new Calculation();
		if(x==1){
			cal.sum( num1, num2);
		}else if(x==2){
			cal.sub(num1, num2);
		}else if(x==3){
			cal.mult(num1, num2);
		}else if(x==4){
			cal.div(num1, num2);
		}else{
			System.out.println("Choose a valid operation....");
		}

	}
}
