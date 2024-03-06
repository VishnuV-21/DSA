package com.sort_algo;

public class BinarySort {
    public static void main(String[] args) {
    	int arr[]= {3,5,6,8,1,4,7,9,2};
    	binarySort(arr);
    }
    static void binarySort(int arr[]) {
    	// sorting ascending 
    	boolean swapneeded=false;
    	for(int i =0;i<arr.length;i++) {
    		for(int j=1;j<arr.length-i;j++) {
    			if(arr[j]<arr[j-1]) {
    				int temp = arr[j];
    				arr[j]=arr[j-1];
    				arr[j-1]= temp;
    				swapneeded=true;
    			}
    		}
    		if(!swapneeded) {
    			break;
    		}
    	}
    	for(int val:arr) {
    		System.out.println(val);
    	}
    }
}
