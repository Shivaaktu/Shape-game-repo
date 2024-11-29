package com.shiva.spider.shape_game;

import java.util.Scanner;

public class UserDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to shape game I Shiva Sharma have design this game for 6th to 8th class students");
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char c;
		do {
			int choice=g.selectShape();
			if(choice==1) {
				System.out.println("You have Selected 2D Shape");
				TwoDShape td=g.selectTwoDShape();
				td.getArea();
				td.getParemeter();
			}
			else{
				System.out.println("You have Selected 3D Shape");
				ThreeDShape td=g.selectThreeDShape();
				td.getVolume();
				td.getCurvedSurfaceArea();
				td.getTotalSurfaceArea();
			}
			System.out.println("Press Y/y to restart.... or any other char for exit");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("====Thank you for playing game====");
		System.out.println("The end");
		sc.close();
		

	}
	

}
