package com.capgemini.test1;

class MyString {
	String msg;
	MyString(String msg) {
		this.msg=msg;
	}
}

public class Test1 {
	public static void main(String[] args) {
		//System.out.println("Hello "+ new StringBuldier("Java SE 8"));
		System.out.println("Hello "+ new MyString("Java SE 8"));
	}

}
