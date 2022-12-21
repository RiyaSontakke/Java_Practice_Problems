package com.bridgelabz.practice;

import java.util.Arrays;


public class RemoveSpecificValue {
	public static void main(String[] args) {
		int[] array = {11, 22, 33, 45, 56};
		System.out.println("original Array:" + Arrays.toString(array) );
		int removeIndex = 1;
		for(int i = removeIndex; i < array.length -1; i++) {
			array[i] = array[i + 1];
		}
			System.out.println("After removing element :" +Arrays.toString(array));
		}
		
	}


