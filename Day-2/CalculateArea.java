package com.two.Day2;

public class CalculateArea {
	public int rectangle(int len, int width) {
		return len*width;
	}
	public double circle(int radius ) {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		CalculateArea obj = new CalculateArea();
		System.out.println("Area of rectangle : "+obj.rectangle(10, 20));
		System.out.println("Area of circle : "+obj.circle(5));
	}
}
