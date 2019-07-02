package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

	public static void main(String args[])
	{
		int[] array= {8,7,2,5,3,1};
		int sum=10;
		
		pairWithGivenSum(array, sum );
		
	}

	private static void pairWithGivenSum(int[] array, int sum) {
		
		Map<Integer, Integer> map=new HashMap();
		
		for(int i=0;i<array.length;i++)
		{
			if(map.containsKey(sum-array[i]))
			{
				System.out.print("Pair:"+"("+i+","+array[map.get(sum-array[i])]+")");
				return;
			}
			else {
				map.put(array[i],i);
			}
		}
		
	}
}

//http://www.techiedelight.com/find-pair-with-given-sum-array/