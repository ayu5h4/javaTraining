package com.two.Day2;

import java.util.Scanner;

public class ElegibilityTest {
	public boolean verify(int age,int exp, String degree)
	{
		if(age >=24 && exp >=3 && degree.equals("yes")){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean iscontentvalid=false;
		int age =0;
		int exp =0;
		String degree="";
		while(!iscontentvalid) {
			System.out.println("Enter age");
			age = in.nextInt();
			if(!(age >0&&age<100))
			{
				System.out.println("Enter age correctly");
				continue;
			}
			System.out.println("Enter Experience");
			exp = in.nextInt();
			if(!(exp>0&&exp<80))
			{
				System.out.println("Enter Experience correctly");
				continue;
			}
			System.out.println("Enter if degree (yes/no)");
			degree = in.next();	
			if(!(degree.equals("yes")||degree.equals("no") ))
			{
				System.out.println("Enter degree correctly");
				continue;
			}
			break;
		}
		ElegibilityTest obj = new ElegibilityTest();
		if(obj.verify(age, exp, degree))
		{
			System.out.println("Congratulations you are eligible got further process ");
		}
		else 
		{
			System.out.println("sorry doesnt meet the requirements ");
		}
	}
}
