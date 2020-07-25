package com.capgemini.telegram;

class TestCaller {
	private void init() {
		System.out.println("Initi");
	}
	protected void start() {
		init();
		System.out.println("Strat");
	}

}
public class Caller {
	public static void main(String[] args) {
		TestCaller c= new TestCaller();
		c.start();
		//c.init();
	}
}

