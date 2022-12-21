package com.bridgelabz.practice;

import java.util.Scanner;

public class StudentDetailes {
	public static void main(String[] args)
	{
		String Name,Section;
		int Maths,Science,Hindi,Marathi,English;
	    float Total,Percentage;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		Name = scan.nextLine();
		
		
		System.out.println("Enter Section:");
		Section = scan.nextLine();
		System.out.println("Enter Marks in Maths:");
		Maths = scan.nextInt();
		System.out.println("Science:");
		Science = scan.nextInt();
		System.out.println("Hindi:");
		Hindi = scan.nextInt();
		System.out.println("Marathi:");
		Marathi = scan.nextInt();
		System.out.println("English:");
		English = scan.nextInt();
		Total = Maths + Science + Hindi + Marathi + English;
        System.out.println("Total:" +Total);
       
        Percentage =  Total/500*100;
        System.out.println("Percentage:" +Percentage);		
	}

}
