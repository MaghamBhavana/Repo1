package com.capgemini.test1;

public class Question22 {
	public static void main(String[] args) {
		int x=5;
		while(isAvail(x)) {

			System.out.println(x);
			x--;
		}
	}
	public static boolean isAvail(int x) {
		return (x >0)?true:false;
	}

}
