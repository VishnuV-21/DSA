package com.sort_algo;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {3,3,5,6,8,1,4,8,7,9,2};
    	selectionSort(arr);
	}
// normal selection sort
	static void selectionSort(int[] arr) {
		// sort ascending
		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] > arr[j]) {
		            // Swap elements if they are in the wrong order
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		for(int val:arr) {
    		System.out.println(val);
    	}
	}

	
}
