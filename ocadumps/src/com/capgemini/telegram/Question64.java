package com.capgemini.telegram;

import java.time.LocalDate;
import java.time.Month;

public class Question64 {
	public static void main(String[] args) {
		/*short s1=200;
		Integer s2=400;
		Long s3=(long)s1+s2;*/
		//String s4=(String)(s3*s2);
		//System.out.println("Sum is "+s4);
		LocalDate start=LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		if(start.isBefore(end)) {
			LocalDate newDate=start.plusMonths(1);
			System.out.println(newDate);
		}
	} 

}
