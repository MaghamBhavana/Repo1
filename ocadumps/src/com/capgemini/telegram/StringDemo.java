package com.capgemini.telegram;

public class StringDemo {
	public static void main(String[] args) {
		/*String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		String s5=s1.toLowerCase();
		String s6=s2.trim();
		String s7=s3.toString();
		String s8="HELLO";
		String s9=s1.toUpperCase();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s3==s7);
		System.out.println(s1==s5);
		System.out.println(s2==s6);
		System.out.println(s3);*/
		
		String s1="Java";
		String s2="Java";
		StringBuilder sb1=new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString()==s1);
		System.out.println(sb1.toString().equals(s1));
		System.out.println(sb1);
	}
}
