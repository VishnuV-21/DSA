package com.search_algo;

import java.util.Arrays;


public class BinarySearch {
	int arr1[]= {1,3,5,7,9,2,4,6,8};
	int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	static int key=6;
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.sort();
		System.out.println("");
		System.out.println(binarySearch.beginSearch(key));
	}

	public int beginSearch(int key ) {
		int start=0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start+(end-start)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key>arr[mid]) {
				start=mid+1;
		}
			else if (key<arr[mid]) {
				end=mid-1;
			}
			
		}
		return -1;		
	}
		

	public void sort() {
		Arrays.sort(arr1);
		for(int val:arr1) {
			System.out.print("["+val+"]");
		}
		
	}

}
