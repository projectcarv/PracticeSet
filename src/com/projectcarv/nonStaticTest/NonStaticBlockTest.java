package com.projectcarv.nonStaticTest;

/**
 * @author
 * Non static block executes when the constructor the class got executed.
 * The no of time you invoke new the static block will execute. 
 *
 */
public class NonStaticBlockTest {

	public static void main(String[] args) {

		People people = new People();
		people.setName("people1");
		people.setId(1);
		People people1 = new People();
		
	}

}
