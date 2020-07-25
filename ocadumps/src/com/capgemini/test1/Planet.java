package com.capgemini.test1;

public class Planet {
	public String name;
	public int moon;
	public Planet(String name, int moon) {
		super();
		this.name = name;
		this.moon = moon;
	}
	public static void main(String[] args) {
		Planet[] planets= {
				new Planet("Mer",0),
				new Planet("Ven", 0),
				new Planet("Ear", 1),
				new Planet("Jup", 2)
		};
		System.out.println(planets);
		System.out.println(planets[1].name);
		System.out.println(planets[1].moon);
	}

}
