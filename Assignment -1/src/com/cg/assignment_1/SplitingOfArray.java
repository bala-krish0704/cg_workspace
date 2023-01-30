package com.cg.assignment_1;
import java.util.Scanner;
public class SplitingOfArray {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr2 = new int[5];
		int[] arr3 = new int[5];
		int i;
		System.out.println("Enter the number of element in array");
		for(i = 0; i < arr.length ; i++) {
			arr[i] = scanner.nextInt();			//The loop run here for reading the data from user
		}
		int middle = arr.length/2; // Identifies the mid value of array
		int j = 0;
		for(i = 0 ; i < middle; i++) {
			 	arr2[j] = arr[i];  // Storing the first half of arr element into another array and printing it
				System.out.print(arr2[j]+" ");
				j++;		
		}
		System.out.println();
		int k = 0;
		for(i = middle ; i < arr.length; i++) {	
				arr3[k] = arr[i];   //storing the second half of the element and printing
				System.out.print(arr3[k]+" ");
				k++;
		}		
	}

}
