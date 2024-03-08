package com.testingmyself;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] unsortedArray = {5, 2, 8, 1, 9, 7, 3, 10, 6, 4};
		 int key =10;
		int index= startBinarySearch(unsortedArray , key );
		System.out.println(index);
	}

	static int  startBinarySearch(int[] arr, int key) {
		int start=0;
		int end= arr.length-1;
		while (start < end ) {
			int mid = start +(end-start)/2;
			if(key>arr[mid] ) {
				start=mid+1;
			}
			else if (key <arr[mid]) {
				end = mid-1;
			}
			else 
				return mid;
		}
		
		
	return -1;
		
	}

}
