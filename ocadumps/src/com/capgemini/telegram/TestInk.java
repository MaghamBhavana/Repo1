package com.capgemini.telegram;

import java.util.ArrayList;

class Ink {
	
}
class ColorInk extends Ink {
	
}
class BlackInk extends Ink {
	
}
public class TestInk {
	public static void main(String[] args) {
		ArrayList<ColorInk> inks = new ArrayList<>();
		inks.add(new ColorInk());
		//Ink ink=(BlackInk)inks.get(0);
	}

}
