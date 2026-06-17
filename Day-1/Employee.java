package com.one.example;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int empsalary = 1000000;
		String empname = "Ayush";
		String empdesignation = "Senior devloper";
		System.out.println("enter name ");
		empname = in.next();
		System.out.println("enter salary ");
		empsalary = in.nextInt();
		System.out.println("enter designation ");
		empdesignation = in.next();
		System.out.println("salary = "+empsalary);
		System.out.println("name  = "+empname);
		System.out.println("designation = "+empdesignation);
		

	}

}
