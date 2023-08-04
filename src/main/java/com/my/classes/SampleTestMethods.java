package com.my.classes;

public class SampleTestMethods {
	
	/*
	 * This method is to add two numbers , it take 2 integer parameters a, b
	 * and returns the sum of a ,b
	 */
	
	public int add2Numbers(int a , int b) {
		return a+ b;
	}
	
	/*
	 * This method is to add two numbers , it take 3 integer parameters a, b and c
	 * and returns the sum of a, b, c
	 */
	
	public int add3Numbers(int a , int b, int c) {
		return add2Numbers(a, b) +  c;
	}

	
}
