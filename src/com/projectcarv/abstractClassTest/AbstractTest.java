package com.projectcarv.abstractClassTest;

/**
 * @author 
 * This test class explains the way we use abstract class my subclassing and by abstracting. 
 *
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		/*MyAbstract mab = new MyAbstractImpl();
		mab.sayHello();
		mab.sayBye();*/
		
		MyAbstract mabi = new MyAbstract() {
			@Override
			public void sayHello() {
				System.out.println("Debabrata samal");
			}
		};
		mabi.sayHello();
		mabi.sayBye();

	}

}
