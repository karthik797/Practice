package com.arrays;

import java.util.Arrays;

public class InplaceMergeSort {
	
	public static void main(String args[])
	{
		int[] X= {1,4,7,8,10};
		int[] Y= {2,3,9};
		inplaceMergeSort(X,Y);
		System.out.println(Arrays.toString(X));
		System.out.println(Arrays.toString(Y));
	}

	private static int[] inplaceMergeSort(int[] X, int[] Y) {
		int k=1;
		for(int i=0;i<X.length;i++)
		{
			if(X[i]>Y[0])
			{
				swap(X,Y,i,0);
				
				while(Y[k]<Y[0] && k<Y.length)
				{
					int temp=Y[0];
					Y[0]=Y[k];
					Y[k]=temp;
				}
			}
		}
		return X;
	}

	private static void swap(int[] x, int[] y, int i, int j) {
		
		int temp=x[i];
		x[i]=y[j];
		y[j]=temp;
	}

}
//http://www.techiedelight.com/inplace-merge-two-sorted-arrays/