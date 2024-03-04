package com.search_algo;

import java.util.Arrays;

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

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4, 3, 7, 6, 9, 8, 32, 45, 36, 76 };
		int target =75;
		// System.out.println(linearSearchV1(arr, target));
		// System.out.println(linearSearchV2(arr, target));
		// System.out.println(linearSearchV3(arr, target));
		String name = "vishnuprakash"; // u is in the 5th index
		char chTarget = 'I';
		//System.out.println(charSearchInStringV2(name, chTarget));
		int arr2[][]= {
				{1,2,3,4,},
				{45,65,75,33}
		};
		int ans [] =searchin2Darray(arr2, target);
		System.out.println(Arrays.toString(ans));
		
		//System.out.println(findMin(arr));
	}
	// This function gives the min value in an array
static int findMin(int[] arr) {
	int minVal=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<minVal) {
			 minVal=arr[i];	
		}
	}	
	 return minVal;
	}

static int [] searchin2Darray(int arr[][], int target) {
	for (int row = 0; row < arr.length; row++) {
		for(int colValue=0;colValue<arr[row].length;colValue++) {
		int element = arr[row][colValue];
		if (element == target) {
			return new int [] {row,colValue} ;
		}
	}
}
	return new int [] {-1,-1} ;
	}

	// Search for a char in a string using for loop
	static int charSearchInStringV1(String name, char target) {
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == target) {
				return i;
			}
		}

		return -1;
	}

	// Search char in a string using for each loop
	static boolean charSearchInStringV2(String name, char target) {
		// To check even if the input we gave is case insensitive.
		int target1 = target;
		if (target1 <= 90) {
			target1 += 32;
		}
		for (char character : name.toCharArray()) {
			if (character == target1) {
				return true;
			}
		}

		return false;
	}

	// This is using normal for loop
	static int linearSearchV1(int arr[], int target) {
		if (arr.length == 0) {
			return -1;
		}
		if (target < 0) {
			target *= -1;
		}

		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}

		}
		return -1;

	}

	/*
	 * This is using for each or advanced for loop . We use this since there is no
	 * need for the index we are directly checking with the elements in the array.
	 */

	static boolean linearSearchV2(int arr[], int target) {
		if (arr.length == 0) {
			return false;
		}
		if (target < 0) {
			target *= -1;
		}
		for (int element : arr) {
			if (element == target) {
				return true;
			}
		}
		return false;
	}

	// Jus showing we can use 'Integer.MaxValue' since the element in the array can
	// be -1
	static int linearSearchV3(int arr[], int target) {
		if (arr.length <= 0) {
			return -1;
		}
		if (target < 0) {
			target *= -1;
		}

		for (int element : arr) {
			if (element == target) {
				return element;
			}

		}
		return Integer.MAX_VALUE;

	}
}
