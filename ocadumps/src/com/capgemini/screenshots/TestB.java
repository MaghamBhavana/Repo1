package com.capgemini.screenshots;

class Employee {
	 int salary;	
} 
class Manager extends Employee {
	 int budget;
}
class Director extends Manager {
	 int stockOptions;
}
public class TestB {
	public static void main(String[] args) {
		Employee e=new Employee();
		Manager m=new Manager();
		Director d=new Director();
		e.salary=50000;
		d.salary=80000;
		//e.budget=200000;
		m.budget=100000;
		//m.stockOption=500;
		d.stockOptions=1000;
		
	}

}
