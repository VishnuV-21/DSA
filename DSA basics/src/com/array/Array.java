package com.array;

import java.util.Scanner;

public class Array {
	int arr []= {12,3,5,7,9,0,1,8,4,0,6,2,0,11,33,67,44,22};
	int arr2[]= {1,2,3,5};
	String testPalindrome="Vishnu";
	String testPalindrome2="Malayalam";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array obj=new Array();
		//obj.printArray();
		//obj.removeEvenIntegers();
		//obj.reverseArray();
		//System.out.println("The smallest value in the array is "+ obj.finMinValue()); 
		//obj.findTheSecondLargest();
		//obj.moveZerosToEnd();
		//boolean ans= obj.palindrome(); System.out.println(ans);
		//obj.findMissingNum();
		//obj.resizeArray();
		
	}

	private void resizeArray() {
		// Create a new array and move the values to the new array
		Scanner sc=new Scanner(System.in);
		int j=0;
		System.out.println("Enter the capacity");
		int capacity= sc.nextInt();
		int newarr2[]=new int [capacity];
		for (int i =0;i<arr2.length;i++) {
			newarr2[j]=arr[i];
			j++;
		}
		System.out.println("The old array size is "+arr2.length+ "\nThe new size of the array is "+newarr2.length);
		
	}

	public void findMissingNum() {
		// To find the missing number 	
		// use the formula for sum of n natural numbers here : n*(n+1)/2
		int n2=arr2.length+1;
		int sum2=n2*(n2+1)/2;
		for(int num : arr2) {
			sum2=sum2-num;
		}
		
		System.out.println(sum2);
		
	}

	private boolean palindrome() {
		// Check if the string is palindrome
		String allSmall=testPalindrome2.toLowerCase();
		char[] chArray= allSmall.toCharArray();
		int start=0;
		int end =chArray.length-1;
		while(start < end) {
				if(chArray[start]!= chArray[end]) {
					return false;
				}
				start++;
				end--;
		}
		return true;
		
	}

	private void moveZerosToEnd() {
		// move the zero's in the array to the end
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] != 0 && arr[j] == 0) {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }
		    // since we have to check if the value at j index is zero or not 
		   if (arr[j] != 0) {
		        j++;
		    }
		}

		for (int val3 : arr) {
		    System.out.print("[" + val3 + "]");
		}
	}

	private void findTheSecondLargest() {
		// find the  second largest value from the arra
		int maxValue=0;
		int secMaxValue=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>maxValue) {
				secMaxValue=maxValue;  	// give the max value to second max 
				maxValue=arr[i];
			}
			// To check if the value less than max and is greater than the second max 
			else if(arr[i]>secMaxValue && arr[i]!=maxValue) {	
				secMaxValue=arr[i];
			}
		}
		System.out.println("The max value is "+maxValue);
		System.out.println("The secondMax value is "+secMaxValue);
		
	}

	public int finMinValue() {
		// find the  minimum value from the array 
		int minvalue=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minvalue) {     	//logic to check each value in the array with a single value.
				minvalue=arr[i];
			}
		}
		return minvalue;
		
	}

	public void reverseArray() {
		// Reverse an array 
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		
		for(int val2:arr) {
			System.out.print("["+val2+"]");
		}
		
	}

	public void removeEvenIntegers() {
		// To get the count of the odd integers to create new array length based on the count
		int n =arr.length;
		int oddCount=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				oddCount++; 
			}
		}
		int resultArr[] =new int [oddCount];
		int idx=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				resultArr[idx]=arr[i];
				idx++;
			}
		}
		for(int val2:resultArr) {
			System.out.print("["+val2+"]");
		}
		
	}

	public void printArray() {
		// TODO Auto-generated method stub
		for(int val:arr) {
			System.out.print("["+val+"]");
		}
	}

}
