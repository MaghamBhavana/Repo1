package com.capgemini.screenshots;

public class TestScope {
	public static void main(String[] args) {
		int var1=200;
		System.out.println(doCalc(var1));
		System.out.println(var1);
	}

	 static int doCalc(int var1) {
		// TODO Auto-generated method stub
		 var1=var1*2;
		return var1;
	}

}
