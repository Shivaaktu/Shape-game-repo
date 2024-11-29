package com.shiva.spider.shape_game;

public class Circle implements TwoDShape{
	double r;
	
	Circle(){
		
	};
	
	Circle(double r){
		if(r>0)
		this.r=r;
		else
			System.out.println("You entered wrong radius");
	}
	@Override
	public void getArea() {
		System.out.println("Area of circle is "+Math.PI*r*r+" sq Unit");
	}
	@Override
	public void getParemeter() {
		System.out.println("Circumfrence/Paremeter is "+(2*Math.PI*r)+" sq units");
	}
	
	
	
	
	
	
}
