package com.projectcarv.staticTest;

/**
 * @author 
 * Static method - You can invoke static method without creating any instance.
 * Static variable - It will not change as per the instance. It is a class specific variable.
 * Static block - It will execute once the class loads very first time.
 * 
 *  
 *
 */
public class StaticClassTest {

	public static void main(String[] args) {
		
		StaticClass.method1();  
		
		/*StaticClass sc = new StaticClass();
		System.out.println(sc.si);
		System.out.println(sc.ni);	
		
		sc.modifyStatic();
		sc.modifyInstanceVariable();
		
		System.out.println(sc.si);
		System.out.println(sc.ni);
		
		StaticClass scNew = new StaticClass();
		System.out.println(scNew.si);
		System.out.println(scNew.ni);*/	
		
		/*StaticClass scNew = new StaticClass();
		StaticClass sc = new StaticClass();*/
	}

}
