package com.progrs;

public class ShapesArea {
	int radius;
	int width;
	int height;
	int b;
	int h1;
	int a;
	public double area(double radius)
	{
		return 3.14*radius*radius;
	}
	public int area(int width, int height)
	{
		return width*height;
	}
	public int area1(int a)
	{
		return a*a;
	}
	public int area2(int b, int h1)
	{
		return (b*h1)/2;
	}
	
	public static void main(String[] args) {
		ShapesArea c= new ShapesArea();
		System.out.println("area of circle is :" +c.area(5));
		System.out.println("area of rectangle is:" +c.area(10,20));
		System.out.println("area of square is :" +c.area1(5));
		System.out.println("area of square is :" +c.area2(5,12));
	}

}
