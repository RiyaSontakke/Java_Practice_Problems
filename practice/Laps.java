package com.bridgelabz.practice;

import java.util.Scanner;

public class Laps {
	public static void main(String[] args)
	{
		int num1,num2,result;
	    num1 = 12;
	    System.out.println("Enter laps for a Day:");
	    Scanner s = new Scanner(System.in);
	    num1 = s.nextInt();
	    num2 = 8;
	    System.out.println("Enter Total Days:");
	    num2 = s.nextInt();
	    result = num1*num2;
	    System.out.println("Number of laps completed:" +result);
	}
}
