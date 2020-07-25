package com.capgemini.test1;

class X {
	public X() {
		System.out.println("A ");
	}
}
class Y extends X {
	public Y() {
		System.out.println("B ");
	}
}
public class Z extends Y {
	public Z() {
		System.out.println("C ");
	}
	public static void main(String[] args) {
		C c = new C();
	}
}
