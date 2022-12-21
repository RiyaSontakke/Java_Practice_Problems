package com.bridgelabz.practice;

import java.util.Scanner;

public class MinMaxArray {
	public static void main(String[] args) {
		int[] array = new int[] {2, 3, 4, 5, 6, 7};
		Scanner scan = new Scanner(System.in);
		int min = array [0];
		int max = array [0];
		for(int i = 1; i < array.length; i++) {
			if(array [i] > max ) max = array [i];
			else if(array [i] < min ) min = array [i];
		}
		System.out.println("Min number:" + min);
		System.out.println("Max number:" + max);
	}

}
