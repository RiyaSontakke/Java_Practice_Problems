package com.bridgelabz.practice;

import java.util.Scanner;

public class CelciusFarenheit {
	public static void main(String[] args)
	{
		float Celcius,Farenheit;
		System.out.println("Enter the Temperature in celcius:");
		Scanner s = new Scanner(System.in);
		Celcius = s.nextFloat();
		Farenheit = ((Celcius*9)/5)+32;
		System.out.println("Temperature converting Farenheit is:" +Farenheit);
		
		
	}

}
