package com.search_algo;

import java.util.Scanner;


/*Time Complexity Explanation:

In the worst case, you might need to go through each element in the list until you find the target element or reach the end.
The time it takes to complete the search is directly proportional to the number of elements in the list (n).
As you increase the size of the input, the time taken by linear search grows linearly.

Space Complexity Explanation:

Linear search does not use any additional data structures that depend on the size of the input.
It typically requires only a constant amount of extra space for variables like loop counters and temporary storage.
The space complexity remains constant, regardless of the size of the input list.
While linear search is straightforward, it is not the most efficient for large data sets compared to other algorithms like
binary search on a sorted list. However, its simplicity and low space complexity make it suitable for small lists or 
unordered data sets.*/

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
