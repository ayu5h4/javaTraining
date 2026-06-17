package com.one.example;

import java.util.Scanner;

public class Person {
	
	
	int age=18;
	String name = "ayush";
	String gen = "Male";
	int salary = 1000000;
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			
		Person obj = new Person();
		
		System.out.println("enter Age:");
		obj.age=in.nextInt();
		System.out.println("enter name:");
		obj.name=in.next();
		System.out.println("enter gender:");
		obj.gen=in.next();
		System.out.println("enter salary:");
		obj.salary=in.nextInt();
		
		
		
		
		System.out.println("Age:"+obj.age);
		System.out.println("name:"+obj.name);
		System.out.println("gender:"+obj.gen);
		System.out.println("salary:"+obj.salary);
	}
}
