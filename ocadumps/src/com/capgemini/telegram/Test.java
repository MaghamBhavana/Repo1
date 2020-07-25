package com.capgemini.telegram;

public class Test {
	public static void main(String[] args) {
		int x=10;
		int y=++x;
		int z=0;
		System.out.println(x);
		if(y>=10|y<=++x) {
			System.out.println(x);
			z=x;
		} else {
			z=x++;
		}
		System.out.println(z);
	}

}
