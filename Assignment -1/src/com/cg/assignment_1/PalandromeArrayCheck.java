package com.cg.assignment_1;
import java.util.Scanner;
public class PalandromeArrayCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		int[] arr = new int[10];
		for(int i = 0; i <arr.length; i++) {
			arr[i] = in.nextInt();	
		}
		int[] arr2 = new int[10];
		int j=0;
		int flag = 0; 
		for(int i = arr.length-1; i>=0;i--) {
			arr2[j] = arr[i];
			j++;
		}
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == arr2[i]) {
				flag = 0;
			}
			else {
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("The array are equal");
		else
			System.out.println("The array are not equal");		
	}

}
