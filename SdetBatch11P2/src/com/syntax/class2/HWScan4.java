package com.syntax.class2;

import java.util.Scanner;

public class HWScan4 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */
		Scanner input = new Scanner(System.in);
		
		String city = input.next();
		System.out.println(" What  city");
		
		Scanner Scan = new Scanner(System.in);
		
		Double temp = input.nextDouble();
		System.out.println(" What is the temperature ");

		Double tempCelsius = (temp - 25);

		System.out.println(" The temperature in the city " + city + " is " + temp);

	}

}
