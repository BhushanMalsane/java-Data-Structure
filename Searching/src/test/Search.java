package test;
import java.util.*;

public class Search {

	public static void acceptData(int [] arr)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
		 System.out.println("enetr number : "+(i+1));
			arr[i] = sc.nextInt();
		}	
	}
	
	
	
	
	public static void main(String[] args) {
		int [] arr = new int [5];
		
	   int pos = -1 ;
		Scanner sc=new Scanner(System.in);
		
		int ch = 0;
		do
		{ System.out.println("1.LinearSEarch \n 2. BinarySearch\n 3. BinarySearchRecursive\n");
			System.out.println("Enter choice");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				acceptData(arr);
				System.out.println("Enter no for search");
				int search=sc.nextInt();
				 pos=LinearSearch.linearSearch(arr, search);
				 if(pos==-1)
					{
						System.out.println("No not found");
					}
					else
					{
						System.out.println("No at index"+pos);
					}
				break;
			case 2:
				acceptData(arr);
				System.out.println("Enter no for search");
				int search1=sc.nextInt();
				 pos = BinarySearch.binarySearch(arr, search1);
				 if(pos==-1)
					{
						System.out.println("No not found");
					}
					else
					{
						System.out.println("No at index"+pos);
					}
				 break;
			case 3:
				acceptData(arr);
				System.out.println("Enter no for search");
				int search11=sc.nextInt();
				pos = BinarySearchRecursive.binarySearch(0,arr.length-1,search11,arr);
				if(pos==-1)
				{
					System.out.println("No not found");
				}
				else
				{
					System.out.println("No at index"+pos);
				}
				break;
			case 4:
				System.out.println("Exit");
			    break;
			}
			
		}
		while(ch!=4);
		 
		
		
		
		
		
	}




	
}






////int pos=LinearSearch.linearSearch(arr, search);
//		//int pos = BinarySearch.binarySearch(arr, search);
//		int pos = BinarySearchRecursive.binarySearch(0,arr.length-1,search,arr);
//		if(pos==-1)
//		{
//			System.out.println("No not found");
//		}
//		else
//		{
//			System.out.println("No at index"+pos);
//		}
