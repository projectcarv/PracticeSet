package com.projectcarv.praciceSet.project2021.Dharmendra.PolyMorphisim;

public class FamilyCar extends Car{
	
	private int kmph = 20;
	public String carType = "Small SUV";
	
	public void run(int kmph){
		System.out.println(carType +"is running in speed =" +kmph);
	}


}
