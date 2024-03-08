package com.testingmyself;

import java.util.Arrays;

public class Linear {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,7,4,2,6,8,9};
		int[][] twoDArray = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		int key =6;
		int foundKeyatIndex=startLinearSearch(arr , key);
		System.out.println(foundKeyatIndex);
		String ans= Arrays.toString(linearSearch2D(twoDArray, key));
		System.out.println(ans);
	}
	static int startLinearSearch(int arr[] , int key) {
		int index=0;
		//traverse through the array 
		for(index=0; index <arr.length;index++) {
			if(arr[index]==key) {
				break;
			}
		}
		return index;
	}
	
	static int [] linearSearch2D(int arr[][], int key) {
		int i,j=0;
		for( i =0;i<arr.length;i++) {
			for( j=0;j<arr[i].length ;j++) {
				if(arr[i][j]==key) {
					 return new int [] {i,j};	
				}
			}
		}
		return new int [] {-1,-1};
	
	}

}
