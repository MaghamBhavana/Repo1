package com.capgemini.test1;

import java.util.ArrayList;
import java.util.List;

public class Question35 {
	public static void main(String[] args) {
		List ps=new ArrayList();
		Patient p2=new Patient("Mike");
		ps.add(p2);
		int f=ps.indexOf(p2);
		if(f>=0) {
			System.out.println("Mike Found");
		}
	}

}
