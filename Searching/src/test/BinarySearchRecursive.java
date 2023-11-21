package test;

public class BinarySearchRecursive {

	public static int binarySearch(int l , int r,int search, int [] arr)
	{  System.out.println("We are in Binary Search recursive");
		int mid;
		
		while(l<=r)
		{   
			mid = (l+r)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			
			else if(arr[mid]<search)
			{
				return binarySearch(mid+1, r, search, arr);
			}
			else
			{
				return binarySearch(l, mid-1, search, arr);
			}
		}
		
		return -1;
	}
}
