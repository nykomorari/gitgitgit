package com.syntax.class11;

public class Phone {

	String make;
	String model;
	String color;
	int year;
	double price;

	public static void main(String[] args) {
			Phone iphone = new Phone();
			iphone.make = "Apple";
			iphone.model = "Iphone 13";
			iphone.color = "Pacific blue";
			iphone.price= 1300;
			
			System.out.println("My phone is "+iphone.make);
			System.out.println("My phone is made "+iphone.model);      
			System.out.println("My phone color is "+iphone.color);
			System.out.println("My phone price is "+iphone.price);

			System.out.println("*****************");
			
		Phone GooglePixel = new Phone();
		GooglePixel.make = "Google";
		GooglePixel.model = "Pixel 6";
		GooglePixel.color = "Black";
		GooglePixel.price = 1000;
	
		System.out.println("My phone is "+GooglePixel.make);
		System.out.println("My phone is made "+GooglePixel.model);
		System.out.println("My phone color is "+GooglePixel.color);
		System.out.println("My phone price is "+GooglePixel.price);
		
	System.out.println("*******************************");
	
	Phone Nokia = new Phone();
	Nokia.make = "Nokia";
	Nokia.model = "6300";
	Nokia.color = "Grey";
	Nokia.price = 200;
	
	System.out.println("My phone is "+Nokia.make);
	System.out.println("My phone is made "+Nokia.model);
	System.out.println("My phone color is "+Nokia.color);
	System.out.println("My phone price is "+Nokia.price);
	
	
		
	}

}
