package com.capgemini.screenshots;

public class TestI {
	int x=10;
	public static void m1(TestI t1) {
		t1.x=999;
		System.out.println("m1 method"+t1.x);
	}
	public static void main(String[] args) {
		TestI t=new TestI();
		t.x=777;
		m1(t);
		System.out.println("main"+t.x);
	}

}
