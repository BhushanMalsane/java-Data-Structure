package test;

public class BinarySearch {

   public static int binarySearch(int [] arr, int search)
   {
	   System.out.println("We are in Binary Search");
	  int l = 0;
	  int r = arr.length-1;
	  int mid;
	  while(l<=r)
	  {
		  mid = (r+l)/2;
		  
		  if(arr[mid]==search)
		  {
			  return mid;
		  }
		  
		  else if(arr[mid]<search)
		  {
			  l = mid +1;
		  }
		  else
		  {
			  r = mid -1;
		  }
		  
	  }
	   
	return -1 ;
	   
   }
}
