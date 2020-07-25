package com.capgemini.set1andset2;

public class TestA {
	public static final int MIN=1;
	public static void main(String[] args) {
		int x=args.length;
		if(check(x)) {
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
	}
	public static boolean check(int x) {
		return (x>=MIN) ? true:false;
	}

}
