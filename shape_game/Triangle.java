package com.shiva.spider.shape_game;

public class Triangle implements TwoDShape{
	
	double side1;
	double side2;
	double side3;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		
		if(side1+side2>side3&&side2+side3>side1&&side3+side1>side2) {
			System.out.println("Valid Triangle");
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else
			System.out.println("Not a valid triangle");
	}
	@Override
	public void getArea() {
		double s=(side1+side2+side3);
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Peremeter is :"+area+" sq.units");
	}	
	@Override
	public void getParemeter() {
		double perimeter=(side1+side2+side3);
		System.out.println("Perimeter of Triangle is: "+perimeter+" Unit");
	}
}
