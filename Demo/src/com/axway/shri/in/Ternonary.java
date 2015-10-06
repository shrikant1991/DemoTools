package com.axway.shri.in;

public class Ternonary {


	public static void main(String[] args) {

		String result = true ? "Dude, that was true" : "Sorry Dude, it's false";
		System.out.println(false ? "Dude, that was true" : "Sorry Dude, it's false");
		System.out.println(result);
		
		
		/*
		 * ---------------------------------------------------
		 */
		int a;
		int i=10;
		
		if (i == 0)
		{
		    a = 10;
		}
		else
		{
		    a = 5;
		}
		
		System.out.println("Value of a is:: "+a);
		System.out.println("Value of a Using ternonary operator is:: " );
		int p = (i == 0) ? 10:5;
		System.out.println("Using Ternonary Operator:: "+p);
	}
}
