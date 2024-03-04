package com.search_algo;

public class LinearQues2 {

	public static void main(String[] args) {
		int accounts[][]= {{1,2,3,},
				{3,2,0,34}};
		
		System.out.println(findrichest(accounts));
		
	}

static int findrichest(int[][] accounts) {
	
	int ans=Integer.MIN_VALUE;
	for(int person =0;person<accounts.length;person++) {
		//for every row initilize the sum back to zero. 
		int sum=0;
		for(int account=0;account<accounts[person].length;account++) {
			sum+=accounts[person][account];
		}
		if(sum>ans) {
			ans=sum;
		}
	}
	return ans;
		
	}
}
