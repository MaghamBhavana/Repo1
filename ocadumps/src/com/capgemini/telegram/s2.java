package com.capgemini.telegram;
class s1{
	protected void display(int x) {
		System.out.println("Parent "+x);
	}
}
class s extends s1{
	public void display(int x, int y) {
		this.display(x);
		display(y);
		super.display(y);
	}
	public void display(int x) {
		System.out.println("Child "+x);
	}

}
public class s2 {
	public static void main(String[] args) {
		s sobj = new s();
		sobj.display(10,100);
	}
}
