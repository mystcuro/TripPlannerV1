package com.sowrov.tp;
import java.util.Scanner;

public class TripPlannerV1 {

	public static void main(String[] args) {
		
		intro();
		budget();
		time();
		distance();	
		
	}

	public static void intro() {
		
		Scanner eye=new Scanner(System.in);
		System.out.print("Welcome to vacation planner!\nWhats your name?");
		String name = eye.nextLine();
		System.out.print("Nice to meet you "+name+" , Where are you travelling to? ");
		String place = eye.nextLine();
		System.out.print("Great! "+place+" sounds like a great trip!");
		System.out.print("\n\n******************************************************************************************\n\n");
		
	}
	
	public static void budget() {
		Scanner eye=new Scanner(System.in);
		System.out.print("How many days are you going to spend travelling? ");
		int days=eye.nextInt();
		System.out.print("How many money, in USD, are you planning to spend on your trip? ");
		double bUSD=eye.nextDouble();
		System.out.print("What is the letter currency symbol for your travel destination? ");
		String curSym=eye.next();
		System.out.print("How many "+curSym+" are there in 1 USD ? ");
		double curUnit = eye.nextDouble();
		
		int hours=days*24;
		int minutes=hours*1440;
		System.out.print("\nIf youre travelling for "+days+" days that is the same as "+hours+" hours or "+minutes+" minutes.\n\n");
	
		double bUSDperDay=bUSD/days;
		System.out.print("If youre going to spend "+bUSD+" USD in your whole vacation then per day you can spend upto "+bUSDperDay+" USD.\n\n");

		double bNat=bUSD*curUnit;
		double bNatPerDay=bNat/days;
		System.out.print("Your total budget is "+bNat+" "+curSym+" so per day you can spend upto "+bNatPerDay+" "+curSym+" .");
		System.out.print("\n\n******************************************************************************************\n\n");
				
	}

	public static void time() {
		Scanner eye=new Scanner(System.in);
		System.out.print("What is the time diffrence, in hour, from your home to travel distance? ");
		int timeDiff=eye.nextInt();
		System.out.print("That means when its midnight at your home it will be "+timeDiff+" at your travel destination.\n And when its noon at your home it will be "+(timeDiff+12)+" at your travel destination! ");
		System.out.print("\n\n******************************************************************************************\n\n");
		
	}
	
	
	public static void distance() {
		Scanner eye=new Scanner(System.in);
		System.out.print("What is the squared area of your destination country in KM^2 ? ");
		double areaKM=eye.nextDouble();
		Double areaM=areaKM*0.386102;
		System.out.print("\nYeah! Thats mean its squared area is "+areaM+" mile^2 \nENJOY YOUR TRIP!!!\nLET ME SLEEP!");
		System.out.print("\n\n******************************************************************************************\n\n");
	    eye.close();
		
	}
	
}
