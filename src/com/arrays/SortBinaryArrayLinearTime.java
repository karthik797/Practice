package com.arrays;

import java.util.Arrays;

public class SortBinaryArrayLinearTime {
	
	public static void main(String args[])
	{
		int[] array= {1,0,1,0,1,0,0,1};
		
		int[] result=sortBinaryArrayLinearTime(array);
		for(int i:array)
		{
		
			System.out.print(i + " ");
			
		}
	}

	private static int[] sortBinaryArrayLinearTime(int array[]) {
		
		int k=0;
		
		for(int i:array)
		{
			
			if(i==0)
			{
				array[k]=0;
				k++;
			}	
		}
		for(int i=k;i<array.length;i++)
		{
			array[i]=1;
		}
		
		
		return array;
	}
}
//http://www.techiedelight.com/sort-binary-array-linear-time/