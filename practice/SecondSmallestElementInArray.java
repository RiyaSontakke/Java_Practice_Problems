package com.bridgelabz.practice;

public class SecondSmallestElementInArray {
	public static void main(String[] args) {
		int temp;
		int[] array = new int[] {4, 2, 5, 6, 3, 7};
		
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i] < array[j]) {
				temp = array [i] ;
				array[i] = array [j] ;
				array[j] = temp;
			}
			}	
		}
		System.out.println("Second Smallest Element:" + array[array.length - 2]);
	}
	
}


