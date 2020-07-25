package com.capgemini.telegram;

import java.io.IOException;

class X {
	public void xMethod() throws IOException {
		System.out.println("X method");
	}
}
class Y extends X {
	public void xMethod() {
		System.out.println("Y Method");
	}
}
public class Question47 {
	public static void main(String[] args) {
		Y y = new Y();
		y.xMethod();
		
	}

}
