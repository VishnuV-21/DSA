package com.search_algo;


/*Breakdown logic:
 1.Count of each digit 
 2.if the count of each digit is even 
 3.if even increase the result count.*/
public class LinearQues1 {
	
	public static void main(String[] args) {
		int nums[]= {12,345,2,6,7896};
		int evenDigits =findNum(nums);
		System.out.println(evenDigits);
	}

	
	// Question 1 : Find the numbers with even number of Digits
// Method to find the count of digits with even number of digits
static int findNum(int [] arr) {
	int count =0;
	for(int val: arr) {
		if(even(val)) {
			count ++;
		}
	}
	return count;
}


static boolean even(int val) {
	int val2=countdigits(val);
	if(val2<0) {
		val2*=-1;
	}
	return (countdigits(val)%2==0) ;	
	}
static int countdigits(int val) {
	int count=0;
	while(val>0) {
		count++;
		val/=10;
		
	}
	return count;
}

static int countdigits2(int val) {	
	return (int)Math.log(val)+1;
}
}
