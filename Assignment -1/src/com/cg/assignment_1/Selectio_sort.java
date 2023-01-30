package com.cg.assignment_1;
import java.util.Scanner;
public class Selectio_sort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of element in Array");
		int count = in.nextInt();
		System.out.println("Enter the elements to store in array");
		int[] arr = new int[count];
		for(int i = 0 ; i < count; i++) {
			arr[i] = in.nextInt();
		}
		int temp;
		for(int i = 0 ; i < count; i++) {
			for(int j = i ; j < count; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("The sorted array is");
		for(int i = 0 ; i < count; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
