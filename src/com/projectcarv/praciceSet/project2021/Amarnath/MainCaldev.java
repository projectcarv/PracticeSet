import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class MainCaldev {
 	static int add(int a, int b) {
	String regex = "[+-]?[0-9]+";
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(Integer.toString(a));
	Matcher n = p.matcher(Integer.toString(b));
	 if(m.find() && m.group().equals(a) && n.find() && n.group().equals(b)){
            System.out.println(a + " is a valid integer number");
	    System.out.println(b + " is a valid integer number"); 
	}
        else{
            System.out.println(a + " enter a valid integer number"); 
            System.out.println(b + " enter a valid integer number");
            }	
		int addResult= a+b;
	    	return addResult;
	}
	static int substract(int a, int b) {
            	int subResult= a-b;
	    	return subResult;
	}
	
  	public static void main(String[] args) {
		
		System.out.println("Please enter a number - ");
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter another number - ");
		int j = Integer.parseInt(sc.nextLine());
		
		String addResult = Integer.toString(add(i,j));
		System.out.println("Add Result is : "+addResult );


		// Call to substract method implemented by Manisha
		String subResult = Integer.toString(substract(i,j));
		System.out.println("Sub Result is : "+subResult );
		
  		}
}
