package com.cg.lambda_project;

import java.util.Scanner;

public class SumOfArray {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		MyInterface obj1 = (num)->{
			int sum =0;
			for(int i = 0 ; i < num.length; i++) {
				sum+=num[i];
			}
			return sum;
			
		};
		System.out.println("Enter the length of array");
		int len = in.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the number of element in the array");
		for(int i = 0 ; i < len; i++) {
			arr[i] = in.nextInt();	
			
		}
		System.out.println("The summ of array = : " +obj1.getArrayValue(arr));
		

	}

}
interface MyInterface{
	int getArrayValue(int[] arr);
}