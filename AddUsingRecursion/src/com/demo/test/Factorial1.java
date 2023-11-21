package com.demo.test;
import java.util.Scanner;
public class Factorial1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		System.out.println("Factorial is" + factorial(n));
		
		
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 1;
		}
		
		return n*factorial(n-1);
	}

}
