package com.two.Day2;

public class StudentName {
	public void  pritdetails(int roll, String name, String dept ) {
		System.out.println("Roll : "+roll);
		System.out.println("name : "+name);
		System.out.println("department : "+dept);
		System.out.println("________________________________________");
	}
	public static void main(String[] args) {
		StudentName obj = new StudentName();
		obj.pritdetails(1, "Sample1", "CSE");
		obj.pritdetails(2, "Sample2", "ECE");
		obj.pritdetails(3, "Sample3", "IT");
	}
}
