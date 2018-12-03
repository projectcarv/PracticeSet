package com.projectcarv.compare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 
 * Newly introduced sorted method in java8 also helps in sorting
 *
 */
public class Sort8Example {

	public static void main(String[] args) {
		
		    List<String> letters = Arrays.asList("B", "A", "C");
		    
		    System.out.println(letters); 
		    List<String> sortedLetters = letters.stream().sorted().collect(Collectors.toList());
		    System.out.println(sortedLetters);
		    
		}

}
