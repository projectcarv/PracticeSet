package com.projectcarv.praciceSet.project2021.Dharmendra.PolyMorphisim;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OverRidingTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		//car.run(10);
		car.run(10);
		//car.display();
		
		FamilyCar familyCar = new FamilyCar();
		familyCar.run(20);
		
		Car carNew = new FamilyCar();
		carNew.run(30);
		
		System.out.println(carNew.carType);
		//carNew.display();
		
	
		

	}

}
