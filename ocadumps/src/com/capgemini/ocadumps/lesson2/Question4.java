package com.capgemini.ocadumps.lesson2;

public class Question4 {
	public static void main(String[] args) {
		Boolean buy=new Boolean(true);
		Boolean sell=new Boolean(true);
		System.out.print(buy==sell);
		
		boolean buyPrim=buy.booleanValue();
		System.out.print(!buyPrim);
		System.out.print(buy&&sell);
		
	}

}
