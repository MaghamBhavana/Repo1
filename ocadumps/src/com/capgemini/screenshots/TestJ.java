package com.capgemini.screenshots;
class Demo {
	int x;
	int y;
};
public class TestJ {
	public void m1(Demo d) {
		d.x=888;
		d.y=999;
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.x=10;
		d1.y=20;
		TestJ t= new TestJ();
		t.m1(d1);
		System.out.println(d1.x+":"+d1.y);
	}

}
