package com.cg.assignment_1;
import java.util.Scanner;
public class IntegerOf20InputsReport {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[20];
		int postive_number=0, negative_number=0, odd_number=0, even_number=0,zeros_number = 0;
		System.out.println("Enter the number of element in array");
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = in.nextInt();			//The loop run here for reading the data from user
			if(arr[i]%2 ==0) {
				even_number++;
			}
			else {
				odd_number++;
			}
		}
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == 0) {
				zeros_number++;
			}else if(arr[i]>0) {
				postive_number++;
				
			}else {
				negative_number++;
			}
		}
		System.out.println("The number of positive number :" + postive_number);
		System.out.println("The number of negative number : "+ negative_number);
		System.out.println("The number of Zeros : "+ zeros_number);
		System.out.println("The number of odd number :" + odd_number);
		System.out.println("The number of even number : "+ even_number);		
	}
}
