package com.projectcarv.praciceSet.project2021.Amarnath.PlayWithJava;

import java.util.Date;

public class Greetings {
	public void Greetings() {
		System.out.print("Hello ");
		Date date = new Date();
		int time = date.getHours();
		if (time <= 12) {
			System.out.println("Good Morning");
		} else if (time > 12 && time < 18) {
			System.out.println("Good Afternoon");
		} else if (time > 18 && time < 20) {
			System.out.println("Good Evening");
		} else if (time > 18 && time <= 24) {
			System.out.println("Good Night");
		}
	}
}
