package com.cg.lambda_project;

import java.util.Scanner;

public class PalandromWithNumber {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		MyInterFace obj1 = (num)->{
			int j = num.length-1;
			int flag =0;
			for(int i = 0 ; i < num.length; i++) {
				if(num[i] == num[j]) {
					j--;
					flag =1;
					
				}else {
					
					flag =0;
					break;
					
				}
				
			}
			return flag;
			};
		System.out.println("Enter the length of the array");
		int len = in.nextInt();
		System.out.println("Enter the elements of the array");
		int[]  arr = new int[len];
		for(int i = 0 ; i <len; i++) {
			arr[i] = in.nextInt();
		}
		if(obj1.getArrayValue(arr) == 0) {
			System.out.println("The elements are not palandrome");
		}else {
			System.out.println("The elements are  palandrome");
		}

	}

}
