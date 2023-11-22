package com.demo.test;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		
		int [] arr = {2,58,9,223,440,50,6};
		System.out.println("Given Array :" );
		System.out.println(Arrays.toString(arr));  //for printing comma separated array.
		
		bubbleSort(arr);
		
		System.out.println("Sorted Array :" );
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{  
				if(arr[j]>arr[j+1])
				{
				   temp = arr[j+1];
				   arr[j+1]=arr[j];
				   arr[j] =temp;
			
				}
				System.out.println(Arrays.toString(arr));
				
			}
			System.out.println("***********");
			System.out.println("Iteration " + (i+1)+" Complete");
			
			
		}
	}
}
