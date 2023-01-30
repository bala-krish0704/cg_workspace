package com.cg.assignment_1;
import java.util.Scanner;
public class Max_MIn_of_Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of element in the array");
		int count = in.nextInt();
		int[] arr = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = in.nextInt();	
		}
		for(int i = 0 ; i < count; i++) {
			for(int j = i ; j < count; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}		
		}
		int max_diff = arr[count-1] - arr[0];
		int min_diff = arr[1]-arr[0];
		System.out.println("The maximum difference is " + max_diff);
		System.out.println("The minimum difference is "+ min_diff);
	}
}

