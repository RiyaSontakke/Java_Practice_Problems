package com.bridgelabz.practice;

import java.util.Scanner;

public class SquareCube {
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter any Number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Square of "+ num + " is: " + Math.pow(num, 2));
		System.out.println("Cube of " + num + " is:" + Math.pow(num, 3));
		
	}

}
