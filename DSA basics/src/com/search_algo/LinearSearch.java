package com.search_algo;

import java.util.Scanner;

public class LinearSearch {
	static int arr[]= {1,3,5,7,9,2,4,6,8};

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			LinearSearch search=new LinearSearch();
			System.out.println("Enter the value you want to find in the array :");
			int value=sc.nextInt();
			search.startSearch(value, arr);
		}
	}
	public void startSearch(int value,int arr[]) {
		int i=0;
		if(value>0) {
			for( i=0;i<arr.length;i++) {
				if(arr[i]==value) {
					break;
				}
			}
			System.out.println("The index where the value location in the array is arr["+i+"]");
		}
		else {
			System.out.println("Enter a valid value to search.");
		}
		
	}
	
}
