package com.bridgelabz.practice;

import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter any numbers:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}
			
	}

}
