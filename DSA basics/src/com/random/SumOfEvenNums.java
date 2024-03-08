package com.random;

public class SumOfEvenNums {
	public static void main(String[] args) {
		System.out.println(sumOfevenNums1(10));
		System.out.println(sumOfevenNums2(10));
	}

	static int sumOfevenNums1(int j) {
		int sum=0;
		for(int i=0;i<=j;i++) {
			if(i%2==0) {
				sum +=i ;
			}
			else {
				continue;
			}
		}
		return sum ;
	}
	
	static int sumOfevenNums2(int k) {
		int sum =0;
		int n=k/2;
		sum = n*(n+1);
		return sum ;
	}
		
	}
