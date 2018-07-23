package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	public static void main(String args[])
	{
		int[] array= {4,-6,3,-1,4,2,7};
		if(subArrayWithZeroSum(array))
		{
			System.out.print("Exists");
		}
		else {
			System.out.print("Not Exists");
		}
		
	}

	private static boolean subArrayWithZeroSum(int[] array) {
		
		Set<Integer> set=new HashSet<Integer>();
		int sum=0;
		set.add(0);
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
			if(set.contains(sum))
				return true;
			else
				set.add(sum);
		}
		return false;
	}
}
