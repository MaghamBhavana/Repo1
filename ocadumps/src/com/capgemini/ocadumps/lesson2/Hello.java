package com.capgemini.ocadumps.lesson2;

public class Hello {
	public static void main(String[] args) {
		doSum(10,20);
		doSum(10.0,20.0);
	}

	public static void doSum(double d, double e) {
		System.out.println("double");
	}
	public static void doSum(int a,int b) {
		System.out.println("Int");
	}
	public static void doSum(float a,float b) {
		System.out.println("Float");
	}

}
