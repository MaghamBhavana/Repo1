package com.capgemini.screenshots;

public class Array1 {
	public static void main(String[] args) {
		int[] x= {10,20,30,40,50};
		x[2]=x[4];
		x[4]=60;
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
