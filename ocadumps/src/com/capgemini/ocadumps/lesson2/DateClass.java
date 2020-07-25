package com.capgemini.ocadumps.lesson2;

import java.time.LocalDate;

public class DateClass {
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2012, 01, 32);
		date.plusDays(10);
		System.out.println(date);
	}

}
