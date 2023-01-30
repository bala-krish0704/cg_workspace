package com.cg.lambda_project;

import java.util.Scanner;

public class DoubleArrayElement {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		MyInterFace obj3 = (num)->{
			System.out.println("After doubling the array element");
			for(int i = 0 ; i < num.length; i++) {
				System.out.println(num[i]*2);
			}
			return 0;
		};
		System.out.println("Enter the length of the array");
		int len = in.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the number of element");
		for(int i =0 ; i < len; i++) {
			arr[i] = in.nextInt();
		}
		obj3.getArrayValue(arr);
		
		

	}

}
