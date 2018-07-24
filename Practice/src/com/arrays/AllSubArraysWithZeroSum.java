package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class AllSubArraysWithZeroSum {
	
	public static void main(String args[])
	{
		int[] array={9, 2, -1, -3, 4,-2, 2, 4, 6, 0};
		allSubArraysWithZeroSum(array);

	}

	private static void allSubArraysWithZeroSum(int[] array) {
		
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
			if(sum==0)
			{
				printSubArray(array,0,i);
			}
			else if(map.get(sum)!=null)
			{
				printSubArray(array,map.get(sum)+1,i);
			}
			else
			{
				map.put(sum, i);
			}
		}
	}

	private static void printSubArray(int[] array, int x, int y) {
		
		for(int i=x;i<=y;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("\n");
	}

}

//https://www.gontu.org/to-print-all-subarrays-with-sum-0/

//if we find same sum two times, sum of the all elements in between those elements are zero.