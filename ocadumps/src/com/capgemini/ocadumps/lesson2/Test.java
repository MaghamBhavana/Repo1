package com.capgemini.ocadumps.lesson2;

public class Test {
	
	int a;
	public static void doProduct(int a) {
		a=a*a;
	}
    public static void doString(StringBuilder a) {
    	a.append(" "+a);
    }
    public static void main(String[] args) {
    	Test item = new Test();
    	item.a=11;
    	StringBuilder b=new StringBuilder("Hello");
    	Integer i=10;
    	doProduct(i);
    	doString(b);
    	doProduct(item.a);
    	System.out.println(i+" "+b+" "+item.a);
    }
}
