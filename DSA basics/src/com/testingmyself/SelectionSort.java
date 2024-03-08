package com.testingmyself;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		 int[] unsortedArray = {5, 2, 8, 1, 9, 7, 3, 10, 6, 4};
		 
	startSort(unsortedArray);
		 

	}

	static void startSort(int[] arr) {
		for(int i=0;i<arr.length;i++ ) {
			for(int j=i+1
					;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swap(arr ,i,j);
			}
			}
		}
		for(int val: arr) {
			System.out.println(val);
		}
		
	}

	static void swap(int arr[] , int i, int j) {
		int temp = arr[i];
		arr[i]=	arr[j];
		arr[j]= temp;
		
	}

}
