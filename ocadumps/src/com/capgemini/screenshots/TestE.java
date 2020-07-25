package com.capgemini.screenshots;
class Student {
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
}
public class TestE {
	public static void main(String[] args) {
		Student[] students= {
				new Student(101,"Bhavana"),
				new Student(102,"Ramya")
		};
		System.out.println(students);
		System.out.println(students[1]);
		System.out.println(students[1].rollno);
	}
	

}
