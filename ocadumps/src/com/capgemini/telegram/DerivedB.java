package com.capgemini.telegram;
class Base1 {
	public void test() {
		System.out.println("Base ");
	}
}
class DerivedA extends Base1 {
	public void test() {
		System.out.println("DerivedA ");
	}
}
public class DerivedB extends DerivedA {
	public void test() {
		System.out.println("DerivedB ");
	}
	public static void main(String[] args) {
		Base1 b1=new DerivedB();
		Base1 b2=new DerivedA();
		Base1 b3=new DerivedB();
		Base1 b4=b3;
		b1=(Base1) b2;
		b1.test();
		b4.test();
	}
}
