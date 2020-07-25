package com.capgemini.ocadumps.lesson1;


public class Question56 {
	
	public static void main(String[] args) {
		Boolean[] b = new Boolean[2];
		
		b[0] = new Boolean(Boolean.parseBoolean("true"));
		b[1] = new Boolean(null);
		System.out.println(b[0]+" "+b[1]);
	}
	
}
