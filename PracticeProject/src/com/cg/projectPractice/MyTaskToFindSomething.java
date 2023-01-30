package com.cg.projectPractice;

public class MyTaskToFindSomething {
	public static void main(String[] args) {
		Interface1 mytask = (int a, int b)->{ return a>b;};
		boolean result = mytask.compareTwoValue(5, 6);
		System.out.println(result);
	}

}
