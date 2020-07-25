package com.capgemini.test1;
class Product{
	double price;
}

public class Question25 {
	
	public static void main(String[] args) {
		Product p= new Product();
		p.price=200;
		double newPrice=100;
		Question25 q=new Question25();
		q.updatePrice(p,newPrice);
		System.out.println(p.price+" :"+newPrice);
	}

	public void updatePrice(Product product, double price) {
		// TODO Auto-generated method stub
		price=price*2;
		product.price=product.price+price;
		
		
	}

}
