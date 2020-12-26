package com.projectcarv.praciceSet.project2021.Dharmendra.PolyMorphisim;

public class Car {
	
	public String speed;
	public String carType = "car";
	public enum breakType {
		SPEEDBREAK,
		SLOWBREAK
	}
	
	
	public void run(int kmph){
		System.out.println(Car.breakType.SPEEDBREAK);
		System.out.println(carType +" is running in speed =" +kmph);
	}
	
	public void display(){
		System.out.println("This is a "+carType);
	}

}
