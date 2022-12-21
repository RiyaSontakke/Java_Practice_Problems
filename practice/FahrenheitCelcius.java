package com.bridgelabz.practice;

import java.util.Scanner;

public class FahrenheitCelcius {
	public static void main(String[] args)
	{
		float Fahrenheit,Celcius;
		System.out.println("Enter the temperature in Fahrenheit:");
		Scanner s = new Scanner(System.in);
		Fahrenheit = s.nextFloat();
		Celcius= ((Fahrenheit - 32)*5)/9;
		System.out.println("Temperature converting to Celcius is:" +Celcius);
		
	}

}
