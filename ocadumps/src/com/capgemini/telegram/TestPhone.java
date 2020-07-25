package com.capgemini.telegram;

import java.time.LocalDate;

class Phone {
	String phoneNum="123456789";
	void setNumber() {
		String phoneNum;
		phoneNum="987654321";
	}
}
public class TestPhone {
	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.setNumber();
		System.out.println(p1.phoneNum);
		LocalDate today=LocalDate.parse("2019-11-30");
		System.out.println(today.getMonthValue());
	}
}
