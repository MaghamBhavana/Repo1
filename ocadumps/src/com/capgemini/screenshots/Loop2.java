package com.capgemini.screenshots;

public class Loop2 {

	public static void main(String[] args) {
		String[] strs=new String[2];
		int idx=0;
		for (String string : strs) {
			strs[idx].concat("element "+idx);
			idx++;
		}
		for ( idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
	
	
}
