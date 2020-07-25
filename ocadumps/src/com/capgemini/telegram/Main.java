package com.capgemini.telegram;
class Base {
	public static void show() {
		System.out.println("Base");
	}
}
class Derived extends Base {
	public static void show() {
		System.out.println("Derived");
	}
}
public class Main {
	public static void main(String[] args) {
		Base b=new Derived();
		b.show();
	}

}
