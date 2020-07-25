package com.capgemini.test1;

public class Question38 {
	public static void main(String[] args) {
		int[][] arr=new int[2][4];
		arr[0]=new int[] {1,3,5,7};
		arr[1]=new int[] {1,3};
		for (int[] is : arr) {
			for (int i : is) {
				System.out.println(i+" ");
			}
			System.out.println();
		}
		
	}

}
