package com.capgemini.test1;

import java.util.ArrayList;

public class Question19 {
	public static void main(String[] args) {
		/*int avar=9;
		if(avar++<10) {
			System.out.println(avar+" Hello Uni");
		} else {
			System.out.println(avar+" Hiii");
		}*/
		
		ArrayList myLis=new  ArrayList();
		String[] myArr;
		try {
			while(true) {
				myLis.add("My Str");
			}
		} catch (RuntimeException e) {
			System.out.println("Run");
		} catch (Exception e) {
			System.out.println("EXc");
		}
		
		System.out.println("Ready");
	}

}
