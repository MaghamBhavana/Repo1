package com.capgemini.telegram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExample {
	public static void main(String[] args) {
		/*LocalDateTime dt=LocalDateTime.of(2014, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));*/
		
		LocalDate doj=LocalDate.of(2014, 03, 03);
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(doj.format(formatter));
	}

}
