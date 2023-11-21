package test;

public class LinearSearch {

	public static int linearSearch(int[] arr, int search) {
		// TODO Auto-generated method stub
		  System.out.println("We are in linear Search");
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]==search)
				return j;
		}
		return -1;
	}
}
