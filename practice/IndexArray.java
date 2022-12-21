package com.bridgelabz.practice;

public class IndexArray {
	public static void main(String[] args) {
		int[] array = {1, 5, 8, 14, 20, 23};
		int item = 8;
		int index = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == item) {
				index = i;
				break;
			}
		}
		System.out.println("Index position of 8 is: " + index );
		
	}

}
