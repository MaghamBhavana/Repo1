package com.capgemini.telegram;

import java.time.LocalTime;

public class TestJ {
	static void doCalc(byte...a) {
		System.out.println("byte...");
	}
	static void doCalc(long a, long b) {
		System.out.println("Long,Long");
	}
	static void doCalc(Byte s1,Byte s2) {
		System.out.println("Byte,Byte");
	}
	public static void main(String[] args) {
		byte b=5;
		doCalc(b,b);
		//float[] a=new float[];
		float[] b1= new float[1];
		//float[] c= new[] float;
		//float[] d=new[1] float;
		
		//LocalTime time=LocalTime.of(8976888888888, 45);
		//System.out.println(time);
	}

}
