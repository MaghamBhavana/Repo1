package com.capgemini.test1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(7, 11, 2020);
		LocalDate date3=LocalDate.parse("2020-07-20",DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}
