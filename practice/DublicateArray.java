package com.bridgelabz.practice;

public class DublicateArray {
	public static void main(String[] args) {
		int[] array = new int[] {1,2,4,6,2,5,4,6,7};
		System.out.println("Dublicate elements in given array:");
		for(int i = 0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
			if(array[i] == array[j])
				System.out.println(array[j]);
			
			}
		}
	}

}
