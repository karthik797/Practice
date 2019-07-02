package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class MaxLenghtSubarrayHavingGivenSum2 {

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
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
			if(!map.containsKey(sum))
				map.put(sum, i);	
			if(map.containsKey(sum-K) && maxLength<i-map.get(sum-K))
			{
				maxLength=i-map.get(sum-K);
				end=i;
				//System.out.println("start="+ (end-maxLength+1)+" end="+end);
			}
			
		}
		//System.out.println("start="+ (end-maxLength+1)+" end="+end);
		result=Arrays.copyOfRange(array, (end-maxLength+1), end+1);
		return result;
	}
}
