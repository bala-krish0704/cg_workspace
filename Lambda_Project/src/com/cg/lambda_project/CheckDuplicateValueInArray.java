package com.cg.lambda_project;

import java.util.Scanner;

public class CheckDuplicateValueInArray {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		MyInterFace obj2 = (num)->{
			int tot=0;
			for(int i = 0 ; i < num.length; i++) {
				for(int j = i ; j < num.length; j++) {
					if(num[i] == num[j]) {
						tot++;
					}
				}
				return tot ; 
			}
			
			return 0;
		};
		System.out.println("Enter the number of element ");
		int len = in.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the elements in the array");
		for(int i = 0 ; i < len; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("The number of duplicated elements : " + obj2.getArrayValue(arr));
		
	}

}
