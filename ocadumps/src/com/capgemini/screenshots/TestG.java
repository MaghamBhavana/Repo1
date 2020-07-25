package com.capgemini.screenshots;

class Students {
	String name;
	public Students(String name) {
		this.name=name;
	}
}
public class TestG {
	public static void main(String[] args) {
		Students[] students = new Students[3];
		students[1]=new Students("Durga");
		students[2]=new Students("Ravi");
		for (Students student : students) {
			System.out.println(student.name);
		}
	} 

}
