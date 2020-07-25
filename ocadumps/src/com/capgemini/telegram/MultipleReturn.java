package com.capgemini.telegram;

public class MultipleReturn {
	int getInt() {
		int returnVal=10;
		try {
			String[] students= {"Harry","Paul"};
			System.out.println(students[5]);
		} catch(Exception e) {
			System.out.println("About to return: "+returnVal);
			return returnVal;
		} finally {
			returnVal +=10;
			System.out.println("Return value is now: "+returnVal);
		}
		return returnVal;
	}
	public static void main(String[] args) {
		MultipleReturn var = new MultipleReturn();
		System.out.println("In Main: "+var.getInt());
//		double d=_1000.00;
//		double d1=1000_.00;
//		double d2=1000.00_;
		double d3=1_00_0.0_0;
	}

}
