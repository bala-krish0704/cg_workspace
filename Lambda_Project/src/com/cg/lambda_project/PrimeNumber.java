package com.cg.lambda_project;

import java.util.Scanner;

public class PrimeNumber {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		MyInterFace2 obj = (num)->{
			int flag =1;
			int m = num/2;
			if(num==0|| m ==1) {
				flag = 0;
			}else {
				for(int i =2; i < m ; i++) {
					if(num%i ==0) {
						flag =0;
						break;
					}
				}
			}
			return flag;
		};
		System.out.println("Enter the number to check prime number");
		int a = in.nextInt();
		if(obj.getValue(a) == 0) {
			System.out.println("This is not prime number");
		}else {
			System.out.println("This is prime number");
		}
		
		

	}

}
