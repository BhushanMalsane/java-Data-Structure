package com.demo.test;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int [] arr = {2,58,9,223,440,50,6};
		System.out.println("Given Array :");
		System.out.println(Arrays.toString(arr));
		
	       selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{    int min = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]= temp;
			
			System.out.println(Arrays.toString(arr));
			
		}
		
		
	}


}
