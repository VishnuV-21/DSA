package com.sort_algo;

import java.util.Arrays;

public class CyclicSort {
public static void main(String[] args) {
	int[] unA = {5, 2, 8, 1, 9, 7, 3, 10, 6, 4};
	doCyclicSort(unA);
	System.out.println(Arrays.toString(unA));
	
}

static void doCyclicSort(int[] unA) {
	//why while loop here. because we need to increase the i index only when needed.
	int i=0;
	while(i<unA.length) {
		int correct =unA[i]-1;
		if(unA[i]!=unA[correct]) {
			swap(unA,i,correct);
		}else i++;
	}
	
}

 static void swap(int[] arr, int i, int j) {
	 int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	
}
}
