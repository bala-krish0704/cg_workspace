package com.cg.lambda_project;

import java.util.Scanner;

public class SqrtClass {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		MyInterFace obj1 = (num)->{
			for(int i = 0 ; i < num.length; i++) {
				System.out.println("The square root of "+num[i]+ "value is " + Math.sqrt(num[i]));
			}
			return 0;
		};
		System.out.println("Enter the number of element in array");
		int len = in.nextInt();
		System.out.println("Enter the Element to store in array");
		int[] arr = new int[len];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		obj1.getArrayValue(arr);
	}
}
