package com.capgemini.screenshots;

public class TestC {
	public static void main(String[] args) {
		int[] n1=new int[3];
		int[] n2= {10,20,30,40,50};
		n1=n2;
		System.out.println(n1.length);
		for (int x : n1) {
			System.out.println(x);
		}
	}

}
