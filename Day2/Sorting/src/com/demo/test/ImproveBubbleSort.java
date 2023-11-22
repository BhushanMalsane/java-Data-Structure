package com.demo.test;

import java.util.Arrays;

public class ImproveBubbleSort {
	public static void main(String[] args) {
		int [] arr = {2,58,9,223,4000,5000,6000};
		System.out.println("Given Array :");
		System.out.println(Arrays.toString(arr));
		
		improvebubbleSort(arr);
	}

	private static void improvebubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp;
		int flag ;
		
		for(int i=0; i<n; i++)
		{    flag =0;
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = 1;
				}
				
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println("***********");
			System.out.println("Iteration " + (i+1)+" Complete");
			if(flag == 0)
			{
				break;
			}
			
		}
	}
		
	}


