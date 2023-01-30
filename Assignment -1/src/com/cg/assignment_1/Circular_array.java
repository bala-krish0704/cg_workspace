package com.cg.assignment_1;
import java.util.Scanner;
public class Circular_array {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the number of element in the array");
		int count =  in.nextInt();
		int[] arr = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = in.nextInt();
		}
		int last = arr[count-1];
		for(int i = count-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = last;
		for(int i = 0 ; i < count ; i++) {
			System.out.println(arr[i]);
		}
	}
}
