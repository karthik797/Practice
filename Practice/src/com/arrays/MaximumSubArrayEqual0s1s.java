package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class MaximumSubArrayEqual0s1s {

	public static void main(String args[])
	{
		int[] array= {0,0,1,0,1,0,0};
		int sum=0;
		int[] result=maximumSubArrayEqual0s1s(array,sum);
		System.out.println(Arrays.toString(result));
	}

	private static int[] maximumSubArrayEqual0s1s(int[] array,int K) {
	
		int start=0,end=0,sum=0, maxLength=0;
		int[] result=null;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
				array[i]=-1;
		}
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
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
//		System.out.println("start="+ (end-maxLength+1)+" end="+end);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==-1)
				array[i]=0;
		}
		result=Arrays.copyOfRange(array, (end-maxLength+1), end+1);
		return result;
	}
}
//http://www.techiedelight.com/find-maximum-length-sub-array-equal-number-0s-1s/