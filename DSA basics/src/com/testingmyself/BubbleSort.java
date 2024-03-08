package com.testingmyself;

public class BubbleSort {
public static void main(String[] args) {
	 int[] unsortedArray = {5, 2, 8, 1, 9, 7, 3, 10, 6, 4};
	 	startBubble(unsortedArray);
}

static void startBubble(int[] unsortedArray) {
	// for every iteration of i , the largest value in the array will go to the last index
	for(int i =0;i<unsortedArray.length;i++) {
		for(int j=1;j<unsortedArray.length-i;j++) {
			if(unsortedArray[j]<unsortedArray[j-1]) {
				swap(unsortedArray, j, j-1);
			}
		}
	}
	for(int val: unsortedArray) {
		System.out.println(val);
	}
	
}

static void swap(int []arr, int j, int i) {
	// TODO Auto-generated method stub
	int temp = arr[j];
	arr[j]= arr[i];
	arr[i]= temp;
}
}
