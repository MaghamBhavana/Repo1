package com.capgemini.screenshots;

public class TestK {
	public static void main(String[] args) {
		int i=5;
		while(isAvailable(i)) {
			System.out.println(i);
			i--;
		}
	}
	public static boolean isAvailable(int i) {
		return (i>0)?true:false;
	}
}
