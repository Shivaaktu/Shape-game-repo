package com.shiva.spider.shape_game;

import java.util.Scanner;

public class Game {
	
	static Scanner sc= new Scanner(System.in);
	
	Game(){
		System.out.println("<<<<<<<<<<<<<<<Game has started>>>>>>>>>>>>>>>>>");	
		}
		public int selectShape() {
		
		System.out.println("press 1 for two d shape");
		System.out.println("Press 2 for three d shape");
		
		int choice=sc.nextInt();
		
		if(choice==1) 
			return 1;
		
		else if(choice==2)
			return 2;
		
		else {
			System.out.println("Invalid choice");
			return selectShape();
			
		}
		
	}
		
	public TwoDShape selectTwoDShape() {
		System.out.println("Press 1 for circle");
		System.out.println("Press 2 for Triangle");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected circle");
			System.out.println("Enter the reaius: ");
			double r=sc.nextDouble();
			Circle c1=new Circle(r);
			return c1;
		}
		else if(choice==2){
			System.out.println("You have selected Triangle");
			System.out.println("Enter the side 1");
			double side1=sc.nextDouble();
			System.out.println("Enter side 2");
			double side2=sc.nextDouble();
			System.out.println("Enter side 3");
			double side3=sc.nextDouble();
			
			return new Triangle(side1,side2,side3);
		}
		
		else {
			System.out.println("invalid choice");
			return selectTwoDShape();
		}
	}
	
	public  ThreeDShape selectThreeDShape() {
		System.out.println("Press 1 for Cylinder");
		System.out.println("Press 2 for Cube");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Cylinder");
			System.out.println("ENter Radius: ");
			double r=sc.nextDouble();
			System.out.println("ENter Height: ");
			double h=sc.nextDouble();
		return new Cylinder(r,h);
		}
		else if(choice==2) {
			System.out.println("You have selected Cube");
			System.out.println("ENter side: ");
			double side=sc.nextDouble();
		return new Cube(side);
		}
		else {
			System.out.println("Invalid choice!");
			return selectThreeDShape();
		}
	
	}

}
