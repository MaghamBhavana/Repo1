package com.capgemini.telegram;

public class Prize {
	public static void main(String[] args) {
		int x=111,y=101;
		System.out.println(x&y);
		switch(x&y) {
		case 1:
			System.out.println("-1-");
		case 101:
			System.out.println("-101-");
		case 111:
			System.out.println("-111-");
		case 010:
			System.out.println("-010-");
		default:
			System.out.println(x&y);
		}
	}

}
