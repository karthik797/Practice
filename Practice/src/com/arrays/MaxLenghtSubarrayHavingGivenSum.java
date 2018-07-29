package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class MaxLenghtSubarrayHavingGivenSum {

	public static void main(String args[])
	{
		int[] array= {5,6,-5,5,3,5,3,-2,0};
		int sum=8;
		int[] result=maxLenghtSubarrayHavingGivenSum(array,sum);
		System.out.println(Arrays.toString(result));
	}

	private static int[] maxLenghtSubarrayHavingGivenSum(int[] array,int K) {
	
		int start=0,end=0,sum=0, maxLength=0;
		int[] result=null;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
			end=i;
		//	System.out.println("start="+start+" end"+end+" sum="+sum);
			if(sum==K)
			{
				
				if(maxLength<end-start)
				{
					System.out.println("start="+start+" end"+end);
					result=Arrays.copyOfRange(array, start, end+1);
				}
			}
			if(sum>K)
			{
				sum=sum-array[start];
				start++;
				
			}
		}
		return result;
	}
}
