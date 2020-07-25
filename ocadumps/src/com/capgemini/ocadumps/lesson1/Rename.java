package com.capgemini.ocadumps.lesson1;

class Customer {
	
	ElectricAccount e=new ElectricAccount();
	public void useElec(double kwh) {
		e.addKwh(kwh);
	}
	
}

class ElectricAccount {
	private double kwh;
	private double rate=0.07;
	private double bill;
	public void addKwh(double kwh2) {
		// TODO Auto-generated method stub
		
	}
	
}