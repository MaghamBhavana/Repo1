package com.capgemini.screenshots;

public class IfLoopCheck {
	public static void main(String[] args) {
		int qty=83;
		double dis=0.0;
		/*if(qty>=90) {
			dis=0.5;
			System.out.println(qty);
			System.out.println(dis);
		}
		if(qty>80 && qty<90) {
			dis=0.2;
			System.out.println(qty);
			System.out.println(dis);
		}*/
		
		dis=(qty>=90)?0.5:0;
		dis=(qty>80)?0.2:0;
		System.out.println(dis);
	}

}
