package com.capgemini.test1;

public class App {
	
	String myStr="7007";
	public void doStuff(String str) {
		int myNum=0;
		try {
			String myStr=str;
			myNum=Integer.parseInt(myStr);
		} catch(NumberFormatException e) {
			System.out.println("Error");
		}
		System.out.println("myStr "+myStr+" ,myNum "+myNum );
	}
	public static void main(String[] args) {
		App a=new App();
		a.doStuff("9009");
	}

}
