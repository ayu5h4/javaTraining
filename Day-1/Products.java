package com.one.example;

import java.util.Scanner;

public class Products {

	static double prod_price = 50.00;
	static String prod_name = "sample";
	static int prod_quantity = 1;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		
		System.out.println("enter price ");
		Products.prod_price = in.nextDouble();
		System.out.println("enter name ");
		Products.prod_name = in.next();
		System.out.println("enter quantity");
		Products.prod_quantity = in.nextInt();
		
		
		
		System.out.println("Price:"+Products.prod_price);
		System.out.println("Name:"+Products.prod_name);
		System.out.println("quantity:"+Products.prod_quantity);
		
	}

}
