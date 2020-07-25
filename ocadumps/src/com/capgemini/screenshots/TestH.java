package com.capgemini.screenshots;

public class TestH {
	static int x;
	int y;
	public static void main(String[] args) {
		TestH t1=new TestH();
		TestH t2=new TestH();
		t1.x=3;
		t1.y=4;
		t2.x=5;
		t2.y=6;
		System.out.println(t1.x+":"+t1.y+":"+t2.x+":"+t2.y);
	}

}
