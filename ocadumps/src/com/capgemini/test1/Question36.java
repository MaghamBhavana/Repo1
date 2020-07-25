package com.capgemini.test1;

public class Question36 {
	public static void main(String[] args) {
		String stuff="TV";
		String res=null;
		//stuff.equals("TV")?res="walter":stuff.equals("Movie")?res="White":res="No result";
		//res=stuff.equals("TV")?"walter" else stuff.equals("Movie")?"white":"No result";
		//res=stuff.equals("TV")?stuff.equals("Movie")?"Walter":"White":"No result";
		res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"white":"No Result";
		System.out.println(res);
		
	}

}
