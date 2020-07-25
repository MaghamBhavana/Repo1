package com.capgemini.test1;

import java.util.ArrayList;
import java.util.List;

public class Queston26 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Robb");
		l.add("Bran");
		l.add("Rick");
		l.add("Bran");
		
		if(l.remove("Bran")) {
			l.remove("Jon");
		}
		System.out.println(l);
	}

}
