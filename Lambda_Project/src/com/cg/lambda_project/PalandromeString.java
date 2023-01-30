package com.cg.lambda_project;

import java.util.Scanner;

public class PalandromeString {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		MyInterFace1 obj = (str)->{
			String reverse = "";
			int len = str.length();
			for(int i = 0 ; i <len; i++) {
				 reverse += str.charAt(i);
			}
			if(str.equals(reverse)) {
				System.out.println("The String is palandrome");
			}else {
				System.out.println("The String is not a palandrome");
			}
			return "0";
			
		};
		System.out.println("Enter the String to check palandrome or not");
		
		String str = in.nextLine();
		obj.getData(str);

		
		
		

	}

}
