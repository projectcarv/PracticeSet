package com.projectcarv.staticTest;

public class StaticClass {
	
	static int si = 10; 
    int ni = 5; 
    
    static {
    	System.out.println("Static block invoked");
    }

    static void method1(){
		System.out.println("Calling static method");
	}
    
    public void modifyStatic(){
    	si = si*2;
    }
    
    public void modifyInstanceVariable(){
    	ni = ni*5;
    }
    
}
