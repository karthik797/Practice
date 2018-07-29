package com.arrays;

public class DuplicateElements {

	public static void main(String args[])
	{
	
		int[] array= {1,2,3,4,2};
		System.out.println(duplicateElements(array));
		
	}

	private static int duplicateElements(int[] array) {
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<=0 || array[i]>=array.length)
			{
				return -1; //If input is wrong
			}
			if(array[array[i]-1]!=-1)
			{
				array[array[i]-1]=-1;
			}
			else
			{
				return array[i];
			}
		}
		
		return -1;
	}	

	
}
//http://www.techiedelight.com/find-duplicate-element-limited-range-array/