package com.bridgelabz.practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		int year;
		System.out.println("Enter any Year:");
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
			if((year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0))
			{	
			System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not a Leap Year");
			}
			
				
				
				
	}

}
