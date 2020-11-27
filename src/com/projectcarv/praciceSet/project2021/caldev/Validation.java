public class Validation{
	
	static void validate(int i, int j){
		
		if(i>0 && j>0){
            		
			}
		else if(i>0 && i<0){
			
            		System.out.println( " Please enter positive integer inplace of " +j);
            	}
		else if(i<0 && i>0){
            		System.out.println( " Please enter positive integer inplace of " +i);
		
            	}
        	else{
            		System.out.println( " Please enter positive integer inplace of " +i); 
            		System.out.println( " Please enter positive integer inplace of " +j);
            	}
	}

}