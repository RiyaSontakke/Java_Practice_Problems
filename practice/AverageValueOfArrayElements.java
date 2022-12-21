package com.bridgelabz.practice;

public class AverageValueOfArrayElements {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i<array.length; i++)
			sum = sum + array[i];
		double average = sum / array.length;
		System.out.println("Average value of the array element is:" +average);
	}
}
