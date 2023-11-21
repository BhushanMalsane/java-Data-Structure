package com.demo.test;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		int sum = add(n);
		System.out.println("SUm is  "+ sum);
		
	}

	private static int add(int n) {
		// TODO Auto-generated method stub
	     
		if(n == 1)
		{
			return 1;
		}
		
		return n + add(n-1);
	}
}
