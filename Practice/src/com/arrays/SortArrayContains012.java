package com.arrays;

import java.util.Arrays;

public class SortArrayContains012 {

	public static void main(String args[])
	{
		int[] array= {0,1,2,2,1,0,0,2,0,1,1,0};
		int sum=8;
		int[] result=sortArrayContains012(array);
		System.out.println(Arrays.toString(result));
	}

	private static int[] sortArrayContains012(int[] array) {
		
		int start=0,end=array.length-1,current=0;
	
		while(current<=end)
		{
			
			if(array[current]==1)
			{
				current++;
			}
			else if(array[current]==0)
			{
				swap(array,start,current);
				start++;
				current++;
			
			}
			else
			{
				swap(array, current,end);
				end--;
			}
			System.out.println(start+" "+current+" "+end);
			System.out.println(Arrays.toString(array));
		}
		return array;
	}

	private static void swap(int[] array, int a, int b) {
	
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
}
//http://www.techiedelight.com/sort-array-containing-0s-1s-2s-dutch-national-flag-problem/