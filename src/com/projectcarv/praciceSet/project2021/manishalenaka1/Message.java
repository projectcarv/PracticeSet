package TestingProgram;

import java.util.Scanner;

public class Message {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Calculater calculater=new Calculater();
		System.out.println("Enter Your Name: ");
		String name= sc.nextLine();
		String nm1="Manisha";
		String nm2="Abhishikta";
		String nm3="Twinkle";
		String nm4="Amarnath";
		if(name.matches(nm1)||name.matches(nm2)||name.matches(nm3)||name.matches(nm4)){
			System.out.println("Hy "+name+" Good Morning..");
		}else{
			System.out.println("By Mr/Mrs. "+name);
		}
	}
}
