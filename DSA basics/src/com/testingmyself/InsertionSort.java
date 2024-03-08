package com.testingmyself;

public class InsertionSort {

	public static void main(String[] args) {
		 int[] unsortedArray = {5, 2, 8, 1, 9, 7, 3, 10, 6, 4};
		startInsertion(unsortedArray);
	}

static void startInsertion(int[] unsortedArray) {
		// TODO Auto-generated method stub
		for(int i =0;i<unsortedArray.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(unsortedArray[j]<unsortedArray[j-1]) {
					swap(unsortedArray,j,j-1);
				}
				else
					break;
					
				}
			}
		for(int val: unsortedArray) {
			System.out.println(val);
		}
		}

	

 static void swap(int[] arr, int j, int i) {
	 int temp = arr[j];
		arr[j]= arr[i];
		arr[i]= temp;
	
}

}
